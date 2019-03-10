package org.rebecalang.compiler.propertycompiler.generalrebeca;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.rebecalang.compiler.modelcompiler.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.ScopeException;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.CastExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.DotPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MainRebecDefinition;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.NonDetExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PlusSubExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecInstantiationPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TernaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.UnaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.BinaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.CastExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.DotPrimaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.LiteralSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PlusSubExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PrimaryTermExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.TernaryExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.UnaryExpressionSemanticCheck;
import org.rebecalang.compiler.propertycompiler.PropertyCodeCompilationException;
import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.AssertionDefinition;
import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Definition;
import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.PropertyModel;
import org.rebecalang.compiler.utils.AccessModifierUtilities;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public abstract class GeneralPropertyCompiler {

	protected ExceptionContainer exceptionContainer = new ExceptionContainer();
	protected SymbolTable modelSymbolTable;
	protected ScopeHandler scopeHandler;
	protected ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	public GeneralPropertyCompiler() {
		super();
	}

	public void prepareForCompilation(RebecaModel rebecaModel, SymbolTable symbolTable,
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

		scopeHandler = new ScopeHandler(rebecaModel, compilerFeatures);
		scopeHandler.pushScopeRecord(null);
		ReactiveClassDeclaration dummy = new ReactiveClassDeclaration();
		dummy.setName("DUMMY");
		TypesUtilities.getInstance().addReactiveClassType(dummy);
		try {
			scopeHandler.addVariableToCurrentScope(CoreRebecaCompilerFacade.OWNER_REACTIVE_CLASS_KEY, 
					TypesUtilities.getInstance().getType(dummy.getName()), null, 0, 0);
			scopeHandler.addVariableToCurrentScope("self", 
					TypesUtilities.getInstance().getType(dummy.getName()), null, 0, 0);
		} catch (ScopeException e) {
			e.printStackTrace();
		} catch (CodeCompilationException e) {
			e.printStackTrace();
		}
		
		expressionSemanticCheckContainer = 
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
				TernaryExpression.class, new TernaryExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(
				UnaryExpression.class, new UnaryExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(
				BinaryExpression.class, new BinaryExpressionSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(TermPrimary.class,
				new PrimaryTermExpressionSemanticCheck());

		expressionSemanticCheckContainer.registerTranslator(
				RebecInstantiationPrimary.class,
				new InvalidExpressionsSemanticCheck());
		expressionSemanticCheckContainer.registerTranslator(
				NonDetExpression.class, new InvalidExpressionsSemanticCheck());
		
		try {
			for (FieldDeclaration fieldDeclaration : rebecaModel
					.getRebecaCode().getEnvironmentVariables()) {
				for (VariableDeclarator variableDeclarator : fieldDeclaration
						.getVariableDeclarators())
					scopeHandler.addVariableToCurrentScope(
							variableDeclarator.getVariableName(),
							fieldDeclaration.getType(),
							CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
			}
			for (MainRebecDefinition mainRebecDefinition : rebecaModel
					.getRebecaCode().getMainDeclaration().getMainRebecDefinition()) {
					scopeHandler.addVariableToCurrentScope(
							mainRebecDefinition.getName(),
							mainRebecDefinition.getType(),
							CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
			}
		} catch (ScopeException se) {
			se.printStackTrace();
		}
		exceptionContainer.clear();

	}
	
	protected PropertyModel performCompilation(Parser parser) {
		parser.removeErrorListeners();
		parser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(Recognizer<?, ?> recognizer,
					Object offendingSymbol, int line, int charPositionInLine,
					String msg, RecognitionException e) {
				exceptionContainer.addException(new PropertyCodeCompilationException(msg, line,
						charPositionInLine));
			}
		});

		try {
            
			Method method = parser.getClass().getMethod("propertyModel");
			Object result = method.invoke(parser, new Object[0]);
			PropertyModel propertyModel = (PropertyModel) result.getClass().getField("pm").get(result);
			
			if (exceptionContainer.getExceptions().isEmpty()) {
				semanticCheck(propertyModel);
				return propertyModel;
			}
		} catch (NoSuchMethodException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IllegalArgumentException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (InvocationTargetException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (NoSuchFieldException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}


	
	protected abstract void semanticCheck(PropertyModel propertyModel);

	protected void basicSemanticCheck(PropertyModel propertyModel) {
		for (Definition definition : propertyModel.getDefinitions()) {
			Pair<Type,Object> checkingResult = expressionSemanticCheckContainer.check(definition.getExpression());
			try {
				scopeHandler.addVariableToCurrentScope(definition.getName(), checkingResult.getFirst(), 
						CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
			} catch (ScopeException e) {
				e.printStackTrace();
			}
		}
		
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.ASSERTION);
		for (AssertionDefinition definition : propertyModel.getAssertionDefinitions()) {
			Pair<Type,Object> checkingResult = expressionSemanticCheckContainer.check(definition.getExpression());
			try {
				scopeHandler.addVariableToCurrentScope(definition.getName(), checkingResult.getFirst(), 
						CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
			} catch (ScopeException e) {
				e.printStackTrace();
			}
		}
		scopeHandler.popScopeRecord();
	}
	
	public ExceptionContainer getExceptionContainer() {
		return exceptionContainer;
	}

	private class InvalidExpressionsSemanticCheck extends AbstractExpressionSemanticCheck  {

		@Override
		public Pair<Type, Object> check(Expression expression, Type baseType) {
			Pair<Type, Object> returnValue = new Pair<Type, Object>();
			returnValue.setFirst(expression.getType());
			CodeCompilationException cee = new CodeCompilationException(
					"Invalid term for property specification.", 
					expression.getLineNumber(), expression.getCharacter());
			exceptionContainer.addException(cee);
			return returnValue;
		}
		
	}
}