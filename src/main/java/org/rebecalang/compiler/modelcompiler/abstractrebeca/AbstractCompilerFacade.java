package org.rebecalang.compiler.modelcompiler.abstractrebeca;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.rebecalang.compiler.modelcompiler.ScopeException;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Annotation;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConditionalStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConstructorDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ForStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InterfaceDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MainRebecDefinition;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MsgsrvDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryVariableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SwitchStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SwitchStatementGroup;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.UnaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.WhileStatement;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CoreVersion;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractCompilerFacade {

	public static final String FEATURES_LABEL = "features";

	@Autowired	
	protected ExceptionContainer exceptionContainer;
	@Autowired	
	protected ScopeHandler scopeHandler;
	@Autowired	
	protected SymbolTable symbolTable;
	
	protected TypeSystemInitializer typeSystemInitializer;
	
	protected SymbolTableInitializer symbolTableInitializer;
	
	protected RebecaModel rebecaModel;
	
	protected CoreVersion coreVersion;

	private EvaluationContext featureExpressoinEvaluationContext;

	public abstract Parser getParser(CharStream input);
	
	@Autowired
	public AbstractCompilerFacade(TypeSystemInitializer typeSystemInitializer, SymbolTableInitializer symbolTableInitializer) {
		this.typeSystemInitializer = typeSystemInitializer;
		this.symbolTableInitializer = symbolTableInitializer;		
	}
	
	private boolean evaluateAnnotationExpression(StatementSemanticCheckContainer statementSemanticCheckContainer,
						Expression annotationExpression) {
		try {
			String expressionValue = constantExpressionToString(annotationExpression);
			ExpressionParser parser = new SpelExpressionParser();
			Class<?> valueType = parser.parseExpression(expressionValue).getValueType(featureExpressoinEvaluationContext);
			if(valueType == Boolean.class) {
				return (boolean) parser.parseExpression(expressionValue).getValue(featureExpressoinEvaluationContext);
			} else if(valueType == null) {
				return false;
			} else {
				CodeCompilationException cce = new CodeCompilationException("Feature expression must be evaluated to a boolean value",
						annotationExpression.getLineNumber(), annotationExpression.getCharacter());
				exceptionContainer.addException(cce);					
			}
		} catch (CodeCompilationException e) {
			
		}
		return false;
	}
	
	protected boolean satisfiesFeatureCondition(List<Annotation> annotations) {
		for(Annotation annotation : annotations) {
			if (!annotation.getIdentifier().equals(FEATURES_LABEL))
				continue;
			if(!evaluateAnnotationExpression(getStatementSemanticCheckContainer(), annotation.getValue())) {
				return false;
			}
		}
		return true;
	}
	
	protected void removeStatementsBasedOnTheRequiredFeature(Statement givenStatement) {
		if(!(givenStatement instanceof BlockStatement))
			return;
		BlockStatement blockStatement = (BlockStatement) givenStatement;
		
		LinkedList<Statement> remaindStatements = new LinkedList<Statement>();
		for(Statement statement : blockStatement.getStatements()) {
			if(satisfiesFeatureCondition(statement.getAnnotations())) {
				remaindStatements.add(statement);
				if(statement instanceof ConditionalStatement) {
					removeStatementsBasedOnTheRequiredFeature(((ConditionalStatement)statement).getStatement());
					removeStatementsBasedOnTheRequiredFeature(((ConditionalStatement)statement).getElseStatement());
				} else if(statement instanceof BlockStatement) {
					removeStatementsBasedOnTheRequiredFeature(statement);
				} else if(statement instanceof ForStatement) {
					removeStatementsBasedOnTheRequiredFeature(((ForStatement)statement).getStatement());
				} else if(statement instanceof WhileStatement) {
					removeStatementsBasedOnTheRequiredFeature(((WhileStatement)statement).getStatement());
				} else if(statement instanceof SwitchStatement) {
					for(SwitchStatementGroup switchStatementGroups : ((SwitchStatement)statement).getSwitchStatementGroups()) {
						LinkedList<Statement> remaindSelectorStatements = new LinkedList<Statement>();
						for(Statement selectorStatement : switchStatementGroups.getStatements()) {
							if(satisfiesFeatureCondition(selectorStatement.getAnnotations())) {
								remaindSelectorStatements.add(selectorStatement);
								removeStatementsBasedOnTheRequiredFeature(selectorStatement);
							}
						}
						switchStatementGroups.getStatements().clear();
						switchStatementGroups.getStatements().addAll(remaindSelectorStatements);
					}
				}
			}
		}
		blockStatement.getStatements().clear();
		blockStatement.getStatements().addAll(remaindStatements);
	}
	
	protected <T extends MethodDeclaration> List<T> removeMethods(List<T> methodDeclarations) {
		LinkedList<T> included = new LinkedList<T>();
		for(T methodDeclaration : methodDeclarations) {				
			if(satisfiesFeatureCondition(methodDeclaration.getAnnotations())) {
				included.add(methodDeclaration);
				removeStatementsBasedOnTheRequiredFeature(methodDeclaration.getBlock());
			}
		}
		return included;
	}
	
	protected void removeInterfaceDeclarationsBasedOnTheRequiredFeature() {
		LinkedList<InterfaceDeclaration> includedInterfaceDeclarations = 
				new LinkedList<InterfaceDeclaration>();
		
		for (InterfaceDeclaration id : rebecaModel.getRebecaCode().getInterfaceDeclaration()) {
			if(satisfiesFeatureCondition(id.getAnnotations())) {
				includedInterfaceDeclarations.add(id);
				List<MsgsrvDeclaration> includedMsgsrvs = removeMethods(id.getMsgsrvs());
				id.getMsgsrvs().clear();
				id.getMsgsrvs().addAll(includedMsgsrvs);
			}
		}
		rebecaModel.getRebecaCode().getInterfaceDeclaration().clear();
		rebecaModel.getRebecaCode().getInterfaceDeclaration().addAll(includedInterfaceDeclarations);
	}

	protected void removeReactiveClassDeclarationsBasedOnTheRequiredFeature() {
		LinkedList<ReactiveClassDeclaration> includedReactiveClassDeclarations = 
				new LinkedList<ReactiveClassDeclaration>();
		
		for (ReactiveClassDeclaration rcd : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
			if(satisfiesFeatureCondition(rcd.getAnnotations())) {
				includedReactiveClassDeclarations.add(rcd);
				
				List<ConstructorDeclaration> includedConstructurs = removeMethods(rcd.getConstructors());
				rcd.getConstructors().clear();
				rcd.getConstructors().addAll(includedConstructurs);
					
				List<SynchMethodDeclaration> includedSynchMethods = removeMethods(rcd.getSynchMethods());
				rcd.getSynchMethods().clear();
				rcd.getSynchMethods().addAll(includedSynchMethods);
			
				List<MsgsrvDeclaration> includedMsgsrvs = removeMethods(rcd.getMsgsrvs());
				rcd.getMsgsrvs().clear();
				rcd.getMsgsrvs().addAll(includedMsgsrvs);
				
				LinkedList<FieldDeclaration> includedStatevars = new LinkedList<FieldDeclaration>();
				for(FieldDeclaration fd : rcd.getStatevars()) {
					if(satisfiesFeatureCondition(fd.getAnnotations())) {
						includedStatevars.add(fd); 
					}
				}
				rcd.getStatevars().clear();
				rcd.getStatevars().addAll(includedStatevars);

				LinkedList<FieldDeclaration> includedKnownRebecs = new LinkedList<FieldDeclaration>();
				for(FieldDeclaration fd : rcd.getKnownRebecs()) {
					if(satisfiesFeatureCondition(fd.getAnnotations())) {
						includedKnownRebecs.add(fd);
					}
				}
				rcd.getKnownRebecs().clear();
				rcd.getKnownRebecs().addAll(includedKnownRebecs);
				
			}
		}
		rebecaModel.getRebecaCode().getReactiveClassDeclaration().clear();
		rebecaModel.getRebecaCode().getReactiveClassDeclaration().addAll(includedReactiveClassDeclarations);
	}

	protected void removeRebecInstancesBasedOnTheRequiredFeature() {
		LinkedList<MainRebecDefinition> included = new LinkedList<MainRebecDefinition>();
		
		List<MainRebecDefinition> mrds = rebecaModel.getRebecaCode().getMainDeclaration().getMainRebecDefinition();

		for(MainRebecDefinition mrd : mrds) {
			if(satisfiesFeatureCondition(mrd.getAnnotations())) {
				included.add(mrd);
			}
		}
		mrds.clear();
		mrds.addAll(included);
	}


	private String constantExpressionToString(Expression expression) throws CodeCompilationException {
		if(expression instanceof Literal) {
			return ((Literal)expression).getLiteralValue();
		} else if(expression instanceof TermPrimary) {
			TermPrimary termPrimary = (TermPrimary) expression;
			if(termPrimary.getParentSuffixPrimary() != null) {
				throw new CodeCompilationException(
						"Method call is not allowed in this expression",
						expression.getLineNumber(), expression.getCharacter());
			}
			return "#" + termPrimary.getName();
		} else if(expression instanceof UnaryExpression) {
			UnaryExpression unaryExpression = (UnaryExpression) expression;
			return unaryExpression.getOperator() + "(" + 
					constantExpressionToString(unaryExpression.getExpression()) + ")";  
		} else if(expression instanceof BinaryExpression) {
			BinaryExpression binaryExpression = (BinaryExpression) expression;
			return "(" + constantExpressionToString(binaryExpression.getLeft()) + ")" +
					binaryExpression.getOperator() +
					"(" + constantExpressionToString(binaryExpression.getRight()) + ")";
		}
		throw new CodeCompilationException(
				"Invalid expression type",
				expression.getLineNumber(), expression.getCharacter());
	}
	
	/**
	 * Semantic check of each type Rebeca model should be implemented by the
	 * corresponding derived class.
	 * 
	 * @param features
	 *            The features which the semantic check should be done under its
	 *            content assumptions.
	 * @throws ExceptionContainer Collection of semantic exceptions and warnings.
	 */
	public void semanticCheck() {
		scopeHandler.clear();
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.RESERVED_WORD);
		
		addFeatureVariablesToScope();

		removeInterfaceDeclarationsBasedOnTheRequiredFeature();

		removeReactiveClassDeclarationsBasedOnTheRequiredFeature();
		
		removeRebecInstancesBasedOnTheRequiredFeature();

		typeSystemInitializer.fillTypeSystem(rebecaModel);
		
		symbolTableInitializer.fillSymbolTable(rebecaModel, coreVersion);
		
		addMethodsOfRebecaExtensionToSymbolTable();

		addVariablesOfRebecaExtensionToScope();
	}


	/**
	 * This method should be implemented by the derived classes to show that how
	 * a RebecaModel should be extracted from a parser.
	 * @param input 
	 * 
	 * @param parser
	 *            The parser that the compiles a Rebeca file and generates its
	 *            corresponding RebecaModel object
	 * @return The generated RebecaModel
	 */
	
	public final void compile(CharStream input, CoreVersion coreVersion) {
		this.coreVersion = coreVersion;
		
		try {
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

			//Method "parser.rebecaModel()" is called
			Method method = parser.getClass().getDeclaredMethod("rebecaModel", new Class[0]);
			Object rebecaModelObj = method.invoke(parser);

			//The result of calling the above method contains the Rebeca model which 
			//is stored in the variable "r"
			Field field = rebecaModelObj.getClass().getDeclaredField("r");
			this.rebecaModel = (RebecaModel)field.get(rebecaModelObj);
						
			initializeStatementSemanticCheckContainer();

			initializeExpressionSemanticCheckContainer();
			
			featureExpressoinEvaluationContext = new StandardEvaluationContext();
			for(FieldDeclaration featureField : rebecaModel.getRebecaCode().getFeatureVariables() )
			      for(VariableDeclarator featureDeclarator : featureField.getVariableDeclarators())
			    	  featureExpressoinEvaluationContext.setVariable(featureDeclarator.getVariableName(), Boolean.TRUE);	

		} catch (NoSuchMethodException | SecurityException | IllegalAccessException 
				| IllegalArgumentException | InvocationTargetException | NoSuchFieldException e) {
			e.printStackTrace();
			throw new RuntimeException("Illegal Rebeca parser class ");
		}
	}

	protected void addFeatureVariablesToScope() {
		for (FieldDeclaration fd : rebecaModel.getRebecaCode().getFeatureVariables()) {
			if (coreVersion == CoreVersion.CORE_2_0) {
				CodeCompilationException rce = new CodeCompilationException(
						"Rebeca core 2.0 dose not support feature variables", fd.getLineNumber(),
						fd.getCharacter());
				exceptionContainer.addException(rce);
				return;
			}

			for (VariableDeclarator vd : fd.getVariableDeclarators()) {
				if (vd.getVariableInitializer() != null) {
					CodeCompilationException rce = new CodeCompilationException(
							"Feature variable \"" + vd.getVariableName() + "\" is automatically initiliazed to true",
							vd.getLineNumber(), vd.getCharacter());
					exceptionContainer.addException(rce);
				} else {
					Literal literal = new Literal();
					literal.setLiteralValue("true");
					literal.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
					literal.setCharacter(vd.getCharacter());
					literal.setLineNumber(vd.getLineNumber());
					OrdinaryVariableInitializer variableInitializer = new OrdinaryVariableInitializer();
					variableInitializer.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
					variableInitializer.setLineNumber(vd.getLineNumber());
					variableInitializer.setCharacter(vd.getCharacter());
					variableInitializer.setValue(literal);
					vd.setVariableInitializer(variableInitializer);
				}
				try {
					scopeHandler.addVariableToCurrentScope(vd.getVariableName(), CoreRebecaTypeSystem.BOOLEAN_TYPE
							, CoreRebecaLabelUtility.FEATURE_VARIABLE, vd.getLineNumber(), vd.getCharacter());
				} catch (ScopeException e) {
					exceptionContainer.addException(e);
				}
			}
		}
	}
	protected abstract void initializeStatementSemanticCheckContainer();

	protected abstract void initializeExpressionSemanticCheckContainer();

	protected abstract void addMethodsOfRebecaExtensionToSymbolTable();

	protected abstract void addVariablesOfRebecaExtensionToScope();
	
	protected abstract StatementSemanticCheckContainer getStatementSemanticCheckContainer();

	public RebecaModel getRebecaModel() {
		return rebecaModel;
	}

}