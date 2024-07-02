package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import java.util.List;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ScopeException;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.VariableInScopeSpecifier;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ForInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ForStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ForStatementSemanticCheck extends AbstractStatementSemanticCheck {

	AbstractTypeSystem typeSystem;

	StatementSemanticCheckContainer statementSemanticCheckContainer;

	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	@Autowired
	public ForStatementSemanticCheck(AbstractTypeSystem typeSystem,
			StatementSemanticCheckContainer statementSemanticCheckContainer,
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		this.typeSystem = typeSystem;
		this.statementSemanticCheckContainer = statementSemanticCheckContainer;
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}

	@Override
	public void check(Statement statement)
			throws CompilerInternalErrorRuntimeException {
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.LOOP_STATEMENT);
		ForStatement forStatement = (ForStatement) statement;
		checkForInitializer(forStatement.getForInitializer());
		CheckForCondition(forStatement.getCondition());
		checkForIncrement(forStatement.getForIncrement());
		if (forStatement.getStatement() != null)
			((StatementSemanticCheckContainer)statementSemanticCheckContainer).check(forStatement.getStatement());
		scopeHandler.popScopeRecord();
	}

	private void checkForIncrement(List<Expression> forIncrement) {
		for (Expression expression : forIncrement) {
			((StatementSemanticCheckContainer)statementSemanticCheckContainer).check(expression);
		}
	}

	private void CheckForCondition(Expression condition) {
		if (condition != null) {
			Pair<Type, Object> result = expressionSemanticCheckContainer.check(condition);
			Type expressionType = result.getFirst();
			if (expressionType != CoreRebecaTypeSystem.BOOLEAN_TYPE) {
				CodeCompilationException rce = new CodeCompilationException(
						"Type mismatch: cannot convert \"for\" statement condition expression type to boolean",
						condition.getLineNumber(), condition
								.getCharacter());
				exceptionContainer.addException(rce);
			}
			if(!(condition instanceof TermPrimary))
				condition.setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		}
	}

	private void checkForInitializer(ForInitializer forInitializer) {
		if (forInitializer != null) {
			if (forInitializer.getFieldDeclaration() != null) {
//				Type fieldsType = AbstractTypeSystem.UNKNOWN_TYPE;
//				FieldDeclaration fieldDeclaration = forInitializer.getFieldDeclaration();
//				try {
//					fieldDeclaration.setType(typeSystem.getType(fieldDeclaration.getType()));
//					fieldsType = fieldDeclaration.getType();
//				} catch (CodeCompilationException e) {
//					e.setColumn(fieldDeclaration.getCharacter());
//					e.setLine(fieldDeclaration.getLineNumber());
//					exceptionContainer.addException(e);
//				}
//				for (VariableDeclarator vd : fieldDeclaration.getVariableDeclarators()) {
//					try {
//						Label label = CoreRebecaLabelUtility.ENVIRONMENT_VARIABLE;
//						if (scopeHandler.isInScopeOf(CoreRebecaLabelUtility.CONSTRUCTOR) ||
//								scopeHandler.isInScopeOf(CoreRebecaLabelUtility.MSGSRV) ||
//								scopeHandler.isInScopeOf(CoreRebecaLabelUtility.SYNCH_METHOD))
//							label = CoreRebecaLabelUtility.LOCAL_VARIABLE;
//						else if (scopeHandler.isInScopeOf(CoreRebecaLabelUtility.REACTIVE_CLASS))
//							label = CoreRebecaLabelUtility.STATE_VARIABLE;
//						scopeHandler.addVariableToCurrentScope(vd.getVariableName(),
//								fieldsType, label, 
//								vd.getLineNumber(), vd.getCharacter());
//						checkVariableInitializationType(
//								fieldsType,
//								vd.getVariableInitializer());
//					} catch (ScopeException se) {
//						se.setColumn(vd.getCharacter());
//						se.setLine(vd.getLineNumber());
//						exceptionContainer.addException(se);
//					}
//				}
				statementSemanticCheckContainer.check(forInitializer.getFieldDeclaration());
				for(VariableDeclarator vd : forInitializer.getFieldDeclaration().getVariableDeclarators() ) {
					try {
						VariableInScopeSpecifier initializerVariable = 
								scopeHandler.removeVariable(vd.getVariableName());
						try {
							VariableInScopeSpecifier retreivedVariable = 
									scopeHandler.retreiveVariableFromScope(vd.getVariableName());
							Label retrievedLabel = retreivedVariable.getLabel();
							if(retrievedLabel == CoreRebecaLabelUtility.METHOD_PARAMETER_VARIABLE 
									||retrievedLabel == CoreRebecaLabelUtility.LOCAL_VARIABLE) {
								String exceptionMessage = "Redeclaration of \""
										+ vd.getVariableName()
										+ "\", it has already been declared in line "
										+ retreivedVariable.getLineNumber() + " column "
										+ retreivedVariable.getColumn();
								exceptionContainer.addException(
										new ScopeException(exceptionMessage, 
												vd.getLineNumber(), vd.getCharacter()));
								continue;
							}
						} catch (ScopeException e) {
							
						}
						scopeHandler.addVariableToCurrentScope(
								initializerVariable.getName(),
								initializerVariable.getType(),
								initializerVariable.getLabel(),
								initializerVariable.getPrecompilationValue(),
								initializerVariable.getLineNumber(),
								initializerVariable.getColumn());
					} catch (ScopeException e) {
						//Never occurs
						e.printStackTrace();
					}
				}
			} else if (forInitializer.getExpressions() != null) {
				for (Expression expression : forInitializer.getExpressions()) {
					statementSemanticCheckContainer.check(expression);
				}
			}
		}
	}

}
