package org.rebecalang.compiler.propertycompiler.timedrebeca;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.ScopeException;
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
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.TernaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.UnaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.probabilisticrebeca.compiler.ProbabilisticRebecaListener;
import org.rebecalang.compiler.modelcompiler.timedrebeca.statementsemanticchecker.expression.TimedPrimaryTermSemanticCheck;
import org.rebecalang.compiler.propertycompiler.generalrebeca.GeneralPropertyCompiler;
import org.rebecalang.compiler.propertycompiler.generalrebeca.expressionsemanticchecker.InvalidExpressionsSemanticCheck;
import org.rebecalang.compiler.propertycompiler.timedrebeca.compiler.TimedRebecaPropertyCompleteLexer;
import org.rebecalang.compiler.propertycompiler.timedrebeca.compiler.TimedRebecaPropertyCompleteParser;
import org.rebecalang.compiler.propertycompiler.timedrebeca.compiler.TimedRebecaPropertyListener;
import org.rebecalang.compiler.propertycompiler.timedrebeca.expressionsemanticchecker.PropertyPrimaryTermExpressionSemanticCheck;
import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.PropertyModel;
import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.TCTLDefinition;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
@Qualifier("TIMED_REBECA")
public class TimedRebecaPropertyCompiler extends GeneralPropertyCompiler {

	@Autowired
	private ConfigurableApplicationContext appContext;

	@Autowired
	@Override
	public void setTypeSystem(@Qualifier("TIMED_REBECA") AbstractTypeSystem typeSystem) {
		super.setTypeSystem(typeSystem);
	}

	@Override
	public void semanticCheck() {
		
		super.semanticCheck();
		
		for (TCTLDefinition tctlDefinition : ((PropertyModel)propertyModel).getTCTLDefinitions()) {
			Pair<Type, Object> checkingResult = expressionSemanticCheckContainer.check(tctlDefinition.getExpression());
			if (!checkingResult.getFirst().canTypeCastTo(CoreRebecaTypeSystem.BOOLEAN_TYPE)) {
				exceptionContainer.addException(new CodeCompilationException(
						"The result of a TCTL formula must be evaluatable to boolean.", 
						tctlDefinition.getExpression().getLineNumber(), tctlDefinition.getExpression().getCharacter()));
			}
		}
		
	}


	@Override
	protected void updateSymbolTable(RebecaModel rebecaModel) {
		super.updateSymbolTable(rebecaModel);
		
		SynchMethodDeclaration EUMethod = new SynchMethodDeclaration();
		EUMethod.setName("EU");
		FormalParameterDeclaration fpd = new FormalParameterDeclaration();
		fpd.setName("time");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		EUMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		EUMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg1");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		EUMethod.getFormalParameters().add(fpd);
		EUMethod.setReturnType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		
		SynchMethodDeclaration AUMethod = new SynchMethodDeclaration();
		AUMethod.setName("AU");
		fpd = new FormalParameterDeclaration();
		fpd.setName("time");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		AUMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		AUMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg1");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		AUMethod.getFormalParameters().add(fpd);
		AUMethod.setReturnType(CoreRebecaTypeSystem.BOOLEAN_TYPE);

		SynchMethodDeclaration AGMethod = new SynchMethodDeclaration();
		AGMethod.setName("AG");
		fpd = new FormalParameterDeclaration();
		fpd.setName("time");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		AGMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		AGMethod.getFormalParameters().add(fpd);
		AGMethod.setReturnType(CoreRebecaTypeSystem.BOOLEAN_TYPE);

		SynchMethodDeclaration AFMethod = new SynchMethodDeclaration();
		AFMethod.setName("AF");
		fpd = new FormalParameterDeclaration();
		fpd.setName("time");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		AFMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		AFMethod.getFormalParameters().add(fpd);
		AFMethod.setReturnType(CoreRebecaTypeSystem.BOOLEAN_TYPE);

		modelSymbolTable.addMethod(null, EUMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);
		modelSymbolTable.addMethod(null, AUMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);
		modelSymbolTable.addMethod(null, AGMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);
		modelSymbolTable.addMethod(null, AFMethod,
				CoreRebecaLabelUtility.BUILT_IN_METHOD);
	}

	@Override
	protected void initializeExpressionSemanticCheckContainer() {
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
				appContext.getBean(TimedPrimaryTermSemanticCheck.class, 
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
		
		expressionSemanticCheckContainer.registerSemanticsChecker(TermPrimary.class,
				(PropertyPrimaryTermExpressionSemanticCheck)appContext.getBean("TCTL_PROPERTY_PRIMARY", 
						typeSystem,
						expressionSemanticCheckContainer));

	}
	
	@Override
	protected void prepareScopeHandler(RebecaModel rebecaModel) {
		super.prepareScopeHandler(rebecaModel);
		try {
			scopeHandler.addVariableToCurrentScope("time", CoreRebecaTypeSystem.INT_TYPE, 
					CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
		} catch (ScopeException e) {
			e.printStackTrace();
		}
	}

	
	@Override
	protected Parser getParser(CharStream input) {
		TimedRebecaPropertyCompleteLexer lexer = new TimedRebecaPropertyCompleteLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		return new TimedRebecaPropertyCompleteParser(tokens);
	}

	@Override
	public void attachListener(Parser parser) {
		TimedRebecaPropertyListener listener = new TimedRebecaPropertyListener();
		parser.addParseListener(listener);
	}

}