package org.rebecalang.compiler.propertycompiler.corerebeca;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.CastExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.DotPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InstanceofExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.NonDetExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PlusSubExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecInstantiationPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TernaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.UnaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.BinaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.CastExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.DotPrimaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.InstanceofExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.LiteralSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PlusSubExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PrimaryTermExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.TernaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.UnaryExpressionSemanticCheck;
import org.rebecalang.compiler.propertycompiler.corerebeca.compiler.CoreRebecaPropertyCompleteLexer;
import org.rebecalang.compiler.propertycompiler.corerebeca.compiler.CoreRebecaPropertyCompleteParser;
import org.rebecalang.compiler.propertycompiler.corerebeca.compiler.CoreRebecaPropertyListener;
import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.LTLDefinition;
import org.rebecalang.compiler.propertycompiler.corerebeca.objectmodel.PropertyModel;
import org.rebecalang.compiler.propertycompiler.generalrebeca.GeneralPropertyCompiler;
import org.rebecalang.compiler.propertycompiler.generalrebeca.expressionsemanticchecker.InvalidExpressionsSemanticCheck;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CORE_REBECA")
public class CoreRebecaPropertyCompiler extends GeneralPropertyCompiler {

	@Autowired
	private ConfigurableApplicationContext appContext;

	@Autowired
	@Override
	public void setTypeSystem(@Qualifier("CORE_REBECA") AbstractTypeSystem typeSystem) {
		super.setTypeSystem(typeSystem);
	}

	@Override
	public void semanticCheck() {
		
		super.semanticCheck();
		
		for (LTLDefinition ltlDefinition : ((PropertyModel)propertyModel).getLTLDefinitions()) {
			Pair<Type, Object> checkingResult = expressionSemanticCheckContainer.check(ltlDefinition.getExpression());
			if (!checkingResult.getFirst().canTypeCastTo(CoreRebecaTypeSystem.BOOLEAN_TYPE)) {
				if (checkingResult.getFirst() != AbstractTypeSystem.UNKNOWN_TYPE)
				exceptionContainer.addException(new CodeCompilationException(
						"The result of an LTL formula must be evaluatable to boolean.", 
						ltlDefinition.getExpression().getLineNumber(), ltlDefinition.getExpression().getCharacter()));
			}
		}
	}

	protected void updateSymbolTable(RebecaModel rebecaModel) {
		super.updateSymbolTable(rebecaModel);
		
		SynchMethodDeclaration globallyMethod = new SynchMethodDeclaration();
		globallyMethod.setName("G");
		FormalParameterDeclaration fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		globallyMethod.getFormalParameters().add(fpd);
		globallyMethod.setReturnType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		
		SynchMethodDeclaration finallyMethod = new SynchMethodDeclaration();
		finallyMethod.setName("F");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		finallyMethod.getFormalParameters().add(fpd);
		finallyMethod.setReturnType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		
		SynchMethodDeclaration nextMethod = new SynchMethodDeclaration();
		nextMethod.setName("X");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		nextMethod.getFormalParameters().add(fpd);
		nextMethod.setReturnType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		
		SynchMethodDeclaration untilMethod = new SynchMethodDeclaration();
		untilMethod.setName("U");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		untilMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg1");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		untilMethod.getFormalParameters().add(fpd);
		untilMethod.setReturnType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		
		SynchMethodDeclaration weakUntilMethod = new SynchMethodDeclaration();
		weakUntilMethod.setName("W");
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		weakUntilMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg1");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		weakUntilMethod.getFormalParameters().add(fpd);
		weakUntilMethod.setReturnType(CoreRebecaTypeSystem.BOOLEAN_TYPE);

		modelSymbolTable.addMethod(null, globallyMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);
		modelSymbolTable.addMethod(null, finallyMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);
		modelSymbolTable.addMethod(null, nextMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);
		modelSymbolTable.addMethod(null, untilMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);
		modelSymbolTable.addMethod(null, weakUntilMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);
	}

	@Override
	protected void initializeExpressionSemanticCheckContainer() {
		expressionSemanticCheckContainer.clear();

		expressionSemanticCheckContainer.registerSemanticsChecker(CastExpression.class,
				appContext.getBean(CastExpressionSemanticCheck.class, 
						typeSystem,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(DotPrimary.class,
				appContext.getBean(DotPrimaryExpressionSemanticCheck.class,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(Literal.class, 
				appContext.getBean(LiteralSemanticCheck.class));
		expressionSemanticCheckContainer.registerSemanticsChecker(PlusSubExpression.class,
				appContext.getBean(PlusSubExpressionSemanticCheck.class,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(TermPrimary.class,
				(PrimaryTermExpressionSemanticCheck)appContext.getBean("CORE_PRIMARY", 
						typeSystem,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(TernaryExpression.class,
				appContext.getBean(TernaryExpressionSemanticCheck.class,
					expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(UnaryExpression.class,
				appContext.getBean(UnaryExpressionSemanticCheck.class,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(BinaryExpression.class,
				appContext.getBean(BinaryExpressionSemanticCheck.class,
						expressionSemanticCheckContainer));
		expressionSemanticCheckContainer.registerSemanticsChecker(InstanceofExpression.class,
				appContext.getBean(InstanceofExpressionSemanticCheck.class, 
						typeSystem,
						expressionSemanticCheckContainer));

		expressionSemanticCheckContainer.registerSemanticsChecker(RebecInstantiationPrimary.class,
				appContext.getBean(InvalidExpressionsSemanticCheck.class));

		expressionSemanticCheckContainer.registerSemanticsChecker(NonDetExpression.class,
				appContext.getBean(InvalidExpressionsSemanticCheck.class));
	}

	@Override
	protected Parser getParser(CharStream input) {
		CoreRebecaPropertyCompleteLexer lexer = new CoreRebecaPropertyCompleteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new CoreRebecaPropertyCompleteParser(tokens);
	}

	@Override
	public void attachListener(Parser parser) {
		CoreRebecaPropertyListener listener = new CoreRebecaPropertyListener();
		parser.addParseListener(listener);
	}

}