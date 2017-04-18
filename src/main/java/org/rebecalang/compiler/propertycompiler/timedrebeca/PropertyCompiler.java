package org.rebecalang.compiler.propertycompiler.timedrebeca;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.ScopeException;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.CastExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.DotPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MainRebecDefinition;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.NonDetExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PlusSubExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecInstantiationPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TernaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.UnaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.BinaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.CastExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.DotPrimaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.LiteralSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.NondetExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PlusSubExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PrimaryTermExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.RebecInstantiationExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.TernaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.UnaryExpressionSemanticCheck;
import org.rebecalang.compiler.propertycompiler.PropertyCodeCompilationException;
import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Definition;
import org.rebecalang.compiler.propertycompiler.timedrebeca.compiler.TimedRebecaPropertyCompleteLexer;
import org.rebecalang.compiler.propertycompiler.timedrebeca.compiler.TimedRebecaPropertyCompleteParser;
import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.PropertyModel;
import org.rebecalang.compiler.propertycompiler.timedrebeca.objectmodel.TCTLDefinition;
import org.rebecalang.compiler.utils.AccessModifierUtilities;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class PropertyCompiler {

	private ExceptionContainer exceptionContainer = new ExceptionContainer();
	private SymbolTable modelSymbolTable;
	public PropertyModel compilePropertyModel(RebecaModel rebecaModel, SymbolTable symbolTable,
			File propertyFile,
			Set<CompilerFeature> compilerFeatures) {
		this.modelSymbolTable = symbolTable;
		try {
			for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
				for (FieldDeclaration fieldDeclaration : reactiveClassDeclaration.getStatevars())
					for (VariableDeclarator variableDeclarator : fieldDeclaration.getVariableDeclarators())
						symbolTable.updateAccesModifier(
							TypesUtilities.getInstance().getType(reactiveClassDeclaration.getName()), 
							variableDeclarator.getVariableName(), AccessModifierUtilities.PUBLIC);
			}
		} catch (CodeCompilationException cce) {
			cce.printStackTrace();
		}
		
		ScopeHandler scopeHandler = new ScopeHandler(rebecaModel, compilerFeatures);
		scopeHandler.pushScopeRecord(null);
		ReactiveClassDeclaration dummy = new ReactiveClassDeclaration();
		dummy.setName("DUMMY");
		TypesUtilities.getInstance().addReactiveClassType(dummy);
		try {
			scopeHandler.addVaribaleToCurrentScope(CoreRebecaCompilerFacade.OWNER_REACTIVE_CLASS_KEY, 
					TypesUtilities.getInstance().getType(dummy.getName()), null, 0, 0);
			scopeHandler.addVaribaleToCurrentScope("self", 
					TypesUtilities.getInstance().getType(dummy.getName()), null, 0, 0);
		} catch (ScopeException e) {
			e.printStackTrace();
		} catch (CodeCompilationException e) {
			e.printStackTrace();
		}
		
		ExpressionSemanticCheckContainer expressionSemanticCheckContainer = 
				new ExpressionSemanticCheckContainer(scopeHandler, symbolTable,
				compilerFeatures, exceptionContainer);
		expressionSemanticCheckContainer.registerTranslator(
				CastExpression.class, new CastExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(DotPrimary.class,
				new DotPrimaryExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(Literal.class,
				new LiteralSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(
				PlusSubExpression.class, new PlusSubExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(
				NonDetExpression.class, new NondetExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(TermPrimary.class,
				new PrimaryTermExpressionSemanticCheck() {
			@Override
			public Pair<Type, Object> check(Expression expression,
					Type baseType) {
				Set<String> tctlModalities = new HashSet<String>(Arrays.asList("EU", "AU", "AG", "AF"));
				int size = exceptionContainer.getExceptions().size();
				Pair<Type, Object>returnVal = super.check(expression, baseType);
				if (returnVal.getFirst() == TypesUtilities.UNKNOWN_TYPE || 
						size != exceptionContainer.getExceptions().size())
					return returnVal;
				
				TermPrimary termPrimary = (TermPrimary) expression;
				String termName = termPrimary.getName();

				if (termPrimary.getParentSuffixPrimary() != null) {
					PropertyCodeCompilationException codeCompilationException = 
							new PropertyCodeCompilationException(
							"The first parameter of " + termName + " must be in form of "
									+ "'time ~ c' where 'c' is a compile time evaluatable integer expression and "
									+ "'~' is one of '<', '<=', '>', '>=', and '=='.", 
									termPrimary.getLineNumber(), 
									termPrimary.getCharacter());
					if (tctlModalities.contains(termName)) {
						Expression timeConstraint = termPrimary.getParentSuffixPrimary().getArguments().get(0);
						if (!(timeConstraint instanceof BinaryExpression)) {
							exceptionContainer.getExceptions().add(codeCompilationException);
						} else if (!(((BinaryExpression)timeConstraint).getLeft() instanceof TermPrimary)) {
							exceptionContainer.getExceptions().add(codeCompilationException);
						} else if (!((TermPrimary)((BinaryExpression)timeConstraint).getLeft()).getName().equals("time")) {
							exceptionContainer.getExceptions().add(codeCompilationException);
						} else if (!TypesUtilities.getInstance().canTypeCastTo(
								((BinaryExpression)timeConstraint).getRight().getType(), TypesUtilities.INT_TYPE)) {
							exceptionContainer.getExceptions().add(codeCompilationException);
						} else {
							Expression right = ((BinaryExpression)termPrimary.getParentSuffixPrimary().getArguments().get(0)).getRight();
							Pair<Type, Object> timeConstraintValue = ((ExpressionSemanticCheckContainer)expressionSemanticCheckContainer).check(right, null);
							Set<String> operators = new HashSet<String>(Arrays.asList("<", "<=", ">", ">=", "=="));
							if (!operators.contains(((BinaryExpression)timeConstraint).getOperator()) ||
									timeConstraintValue.getSecond() == null) {
								exceptionContainer.getExceptions().add(codeCompilationException);
							}
							Literal timeConstraintLiteral = new Literal();
							timeConstraintLiteral.setType(TypesUtilities.INT_TYPE);
							timeConstraintLiteral.setLiteralValue(timeConstraintValue.getSecond().toString());
							((BinaryExpression)termPrimary.getParentSuffixPrimary().getArguments().get(0)).setRight(timeConstraintLiteral);
						}
					}
				}
				return returnVal;
			}
		});
		expressionSemanticCheckContainer.registerTranslator(
				TernaryExpression.class, new TernaryExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(
				UnaryExpression.class, new UnaryExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(
				BinaryExpression.class, new BinaryExpressionSemanticCheck());
		//TODO: Throw exception in this case as it does not support in property definition
		expressionSemanticCheckContainer.registerTranslator(
				RebecInstantiationPrimary.class,
				new RebecInstantiationExpressionSemanticCheck());
		
		ANTLRInputStream input = null;
		try {
			input = new ANTLRInputStream(new FileInputStream(propertyFile));
			TimedRebecaPropertyCompleteLexer lexer = new TimedRebecaPropertyCompleteLexer(input);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			TimedRebecaPropertyCompleteParser parser = new TimedRebecaPropertyCompleteParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(new BaseErrorListener() {
				@Override
				public void syntaxError(Recognizer<?, ?> recognizer,
						Object offendingSymbol, int line, int charPositionInLine,
						String msg, RecognitionException e) {
					PropertyCompiler.this.exceptionContainer.addException(new PropertyCodeCompilationException(msg, line,
							charPositionInLine));
				}
			});
			exceptionContainer.clear();
			PropertyModel propertyModel = parser.propertyModel().pm;
			if (exceptionContainer.getExceptions().isEmpty()) {
				for (FieldDeclaration fieldDeclaration : rebecaModel
						.getRebecaCode().getEnvironmentVariables()) {
					for (VariableDeclarator variableDeclarator : fieldDeclaration
							.getVariableDeclarators())
						scopeHandler.addVaribaleToCurrentScope(
								variableDeclarator.getVariableName(),
								fieldDeclaration.getType(),
								CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
				}
				for (MainRebecDefinition mainRebecDefinition : rebecaModel
						.getRebecaCode().getMainDeclaration().getMainRebecDefinition()) {
						scopeHandler.addVaribaleToCurrentScope(
								mainRebecDefinition.getName(),
								mainRebecDefinition.getType(),
								CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
				}
				semanticCheck(propertyModel, expressionSemanticCheckContainer, scopeHandler);
				return propertyModel;
			}
		} catch (FileNotFoundException e) {
			exceptionContainer.addException(new PropertyCodeCompilationException("Property file \"" + 
					propertyFile.getName() + "\" not found.", 0, 0));
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ScopeException se) {
			se.printStackTrace();
		}
		return null;
	}

	public void semanticCheck(PropertyModel propertyModel, 
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer,
			ScopeHandler scopeHandler) {
		for (Definition definition : propertyModel.getDefinitions()) {
			Pair<Type,Object> checkingResult = expressionSemanticCheckContainer.check(definition.getExpression());
			try {
				scopeHandler.addVaribaleToCurrentScope(definition.getName(), checkingResult.getFirst(), 
						CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
			} catch (ScopeException e) {
				e.printStackTrace();
			}
		}
		
		try {
			scopeHandler.addVaribaleToCurrentScope("time", TypesUtilities.INT_TYPE, 
					CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
		} catch (ScopeException e) {
			e.printStackTrace();
		}
		
		SynchMethodDeclaration EUMethod = new SynchMethodDeclaration();
		EUMethod.setName("EU");
		FormalParameterDeclaration fpd = new FormalParameterDeclaration();
		fpd.setName("time");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		EUMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		EUMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg1");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		EUMethod.getFormalParameters().add(fpd);
		EUMethod.setReturnType(TypesUtilities.BOOLEAN_TYPE);
		
		SynchMethodDeclaration AUMethod = new SynchMethodDeclaration();
		AUMethod.setName("AU");
		fpd = new FormalParameterDeclaration();
		fpd.setName("time");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		AUMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		AUMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg1");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		AUMethod.getFormalParameters().add(fpd);
		AUMethod.setReturnType(TypesUtilities.BOOLEAN_TYPE);

		SynchMethodDeclaration AGMethod = new SynchMethodDeclaration();
		AGMethod.setName("AG");
		fpd = new FormalParameterDeclaration();
		fpd.setName("time");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		AGMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		AGMethod.getFormalParameters().add(fpd);
		AGMethod.setReturnType(TypesUtilities.BOOLEAN_TYPE);

		SynchMethodDeclaration AFMethod = new SynchMethodDeclaration();
		AFMethod.setName("AF");
		fpd = new FormalParameterDeclaration();
		fpd.setName("time");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		AFMethod.getFormalParameters().add(fpd);
		fpd = new FormalParameterDeclaration();
		fpd.setName("arg0");
		fpd.setType(TypesUtilities.BOOLEAN_TYPE);
		AFMethod.getFormalParameters().add(fpd);
		AFMethod.setReturnType(TypesUtilities.BOOLEAN_TYPE);

		try {
			modelSymbolTable.addMethod(null, EUMethod,
					CoreRebecaLabelUtility.SYNCH_METHOD);
			modelSymbolTable.addMethod(null, AUMethod,
					CoreRebecaLabelUtility.SYNCH_METHOD);
			modelSymbolTable.addMethod(null, AGMethod,
					CoreRebecaLabelUtility.SYNCH_METHOD);
			modelSymbolTable.addMethod(null, AFMethod,
					CoreRebecaLabelUtility.SYNCH_METHOD);
		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
		}
		
		for (TCTLDefinition tctlDefinition : propertyModel.getTCTLDefinitions()) {
			Pair<Type, Object> checkingResult = expressionSemanticCheckContainer.check(tctlDefinition.getExpression());
			if (!TypesUtilities.getInstance().canTypeCastTo(checkingResult.getFirst(), TypesUtilities.BOOLEAN_TYPE)) {
				exceptionContainer.addException(new PropertyCodeCompilationException(
						"The result of a TCTL formula must be evaluatable to boolean.", 
						tctlDefinition.getExpression().getLineNumber(), tctlDefinition.getExpression().getCharacter()));
			}
		}
	}
	public ExceptionContainer getExceptionContainer() {
		return exceptionContainer;
	}
}