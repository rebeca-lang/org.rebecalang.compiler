package org.rebecalang.compiler.propertycompiler.generalrebeca;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ScopeException;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MainRebecDefinition;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.AssertionDefinition;
import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.Definition;
import org.rebecalang.compiler.propertycompiler.generalrebeca.objectmodel.PropertyModel;
import org.rebecalang.compiler.utils.AccessModifierUtilities;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class GeneralPropertyCompiler {

	@Autowired
	protected ExceptionContainer exceptionContainer;
	@Autowired
	protected SymbolTable modelSymbolTable;
	@Autowired
	protected ScopeHandler scopeHandler;
	@Autowired
	protected ExpressionSemanticCheckContainer expressionSemanticCheckContainer;


	protected AbstractTypeSystem typeSystem;
	
	protected PropertyModel propertyModel;
	
	@Autowired
	public void setTypeSystem(AbstractTypeSystem typeSystem) {
		this.typeSystem = typeSystem;
	}
	
	public PropertyModel compile(CharStream input, RebecaModel rebecaModel) {

		updateSymbolTable(rebecaModel);
		
		prepareScopeHandler(rebecaModel);
		
		Parser parser = getParser(input);
		parser.removeErrorListeners();
		parser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(Recognizer<?, ?> recognizer,
					Object offendingSymbol, int line, int charPositionInLine,
					String msg, RecognitionException e) {
				exceptionContainer.addException(new CodeCompilationException(msg, line,
						charPositionInLine));
			}
		});

		try {
            
			Method method = parser.getClass().getMethod("propertyModel");
			Object result = method.invoke(parser, new Object[0]);
			this.propertyModel = (PropertyModel) result.getClass().getField("pm").get(result);
			
			initializeExpressionSemanticCheckContainer();

		} catch (NoSuchMethodException | IllegalAccessException | IllegalArgumentException 
				| InvocationTargetException | NoSuchFieldException e1) {
			e1.printStackTrace();
		}
		return this.propertyModel;
	}

	protected void prepareScopeHandler(RebecaModel rebecaModel) {
		try {
			for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
				for (FieldDeclaration fieldDeclaration : reactiveClassDeclaration.getStatevars())
					for (VariableDeclarator variableDeclarator : fieldDeclaration.getVariableDeclarators())
						modelSymbolTable.updateAccesModifier(
							typeSystem.getType(reactiveClassDeclaration.getName()), 
							variableDeclarator.getVariableName(), AccessModifierUtilities.PUBLIC);
			}
		} catch (CodeCompilationException cce) {
			cce.printStackTrace();
		}

		scopeHandler.pushScopeRecord(null);
		ReactiveClassDeclaration dummy = new ReactiveClassDeclaration();
		dummy.setName("DUMMY");
		Type dummyReactiveClassType = typeSystem.addReactiveClassType(dummy);
		try {
			scopeHandler.addVariableToCurrentScope(CoreRebecaCompleteCompilerFacade.OWNER_REACTIVE_CLASS_KEY, 
					dummyReactiveClassType, null, 0, 0);
			scopeHandler.addVariableToCurrentScope("self", 
					dummyReactiveClassType, null, 0, 0);
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
	}

	protected void updateSymbolTable(RebecaModel rebecaModel) {
		try {
			for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
				for (FieldDeclaration fieldDeclaration : reactiveClassDeclaration.getStatevars())
					for (VariableDeclarator variableDeclarator : fieldDeclaration.getVariableDeclarators())
						modelSymbolTable.updateAccesModifier(
							typeSystem.getType(reactiveClassDeclaration.getName()), 
							variableDeclarator.getVariableName(), AccessModifierUtilities.PUBLIC);
			}
		} catch (CodeCompilationException cce) {
			cce.printStackTrace();
		}
	}

	protected abstract void initializeExpressionSemanticCheckContainer();

	protected abstract Parser getParser(CharStream input);
	
	public PropertyModel getPropertyModel() {
		return propertyModel;
	}

	public void semanticCheck() {
		for (Definition definition : propertyModel.getDefinitions()) {
			Pair<Type,Object> checkingResult = expressionSemanticCheckContainer.check(definition.getExpression());
			try {
				scopeHandler.addVariableToCurrentScope(definition.getName(), checkingResult.getFirst(), 
						CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
			} catch (ScopeException e) {
				e.printStackTrace();
			}
		}
		
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.BUILT_IN_METHOD);
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

//	protected void basicSemanticCheck(PropertyModel propertyModel) {
//		for (Definition definition : propertyModel.getDefinitions()) {
//			Pair<Type,Object> checkingResult = expressionSemanticCheckContainer.check(definition.getExpression());
//			try {
//				scopeHandler.addVariableToCurrentScope(definition.getName(), checkingResult.getFirst(), 
//						CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
//			} catch (ScopeException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.BUILT_IN_METHOD);
//		for (AssertionDefinition definition : propertyModel.getAssertionDefinitions()) {
//			Pair<Type,Object> checkingResult = expressionSemanticCheckContainer.check(definition.getExpression());
//			try {
//				scopeHandler.addVariableToCurrentScope(definition.getName(), checkingResult.getFirst(), 
//						CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE, 0, 0);
//			} catch (ScopeException e) {
//				e.printStackTrace();
//			}
//		}
//		scopeHandler.popScopeRecord();
//	}
//	
}