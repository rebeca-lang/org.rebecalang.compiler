package org.rebecalang.compiler.modelcompiler.corerebeca;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.ScopeException;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BreakStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConditionalStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ForStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReturnStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SwitchStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SwitchStatementGroup;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.WhileStatement;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.ExpressionResolver;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.StatementObserver;
import org.rebecalang.compiler.utils.TypesUtilities;

public class CoreRebecaStatementObserver extends StatementObserver {

	public CoreRebecaStatementObserver() {
		super(new CoreRebecaExpressionResolver());
	}

	public CoreRebecaStatementObserver(ExpressionResolver expressionResolver) {
		super(expressionResolver);
	}

	@Override
	public void resolveStatement(Statement statement,
			Category category, ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {

		if (statement instanceof BlockStatement) {
			checkBlockStatement((BlockStatement) statement, category, scopeHandler,
					compilerFeature, container);
		} else if (statement instanceof ConditionalStatement) {
			checkIfStatement((ConditionalStatement) statement, category, scopeHandler,
					compilerFeature, container);
		} else if (statement instanceof WhileStatement) {
			checkWhileStatement((WhileStatement) statement, category, scopeHandler,
					compilerFeature, container);
		} else if (statement instanceof ForStatement) {
			checkForStatement((ForStatement) statement, category, scopeHandler,
					compilerFeature, container);
		} else if (statement instanceof ReturnStatement) {
			checkReturnStatement((ReturnStatement) statement, category, scopeHandler,
					compilerFeature, container);
		} else if (statement instanceof BreakStatement) {
			checkBreakStatement((BreakStatement) statement, category, scopeHandler,
					compilerFeature, container);
		} else if (statement instanceof ConditionalStatement) {
			checkContinueStatement((ConditionalStatement) statement, category,
					scopeHandler, compilerFeature, container);
		} else if (statement instanceof SwitchStatement) {
			checkSwitchStatement((SwitchStatement) statement, category, scopeHandler,
					compilerFeature, container);
		} else if (statement instanceof FieldDeclaration) {
			checkFieldDeclarationStatement((FieldDeclaration) statement, 
					CoreRebecaCategoriesUtility.LOCAL_VARIABLE,
					scopeHandler, compilerFeature, container);
		} else if (statement instanceof Expression) {
			checkExpression((Expression) statement, scopeHandler,
					compilerFeature, container);
		}
	}

	private void checkBlockStatement(BlockStatement blockStatement, Category category, 
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {
		scopeHandler.pushActivationRecord();
		for (Statement statement : blockStatement.getStatements()) {
			resolveStatement(statement, category, scopeHandler, compilerFeature,
					container);
		}
		scopeHandler.popActivationRecord();
	}

	private void checkIfStatement(ConditionalStatement statement, Category category, 
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {
		scopeHandler.pushActivationRecord();
		Type expressionType = expressionResolver.evaluate(
				statement.getCondition(), scopeHandler, compilerFeature,
				container).getFirst().getFirst();
		if ((expressionType != TypesUtilities.BOOLEAN_TYPE)) {
			CodeCompilationException rce = new CodeCompilationException(
					"\"If\" condition expression type should be boolean.",
					statement.getCondition().getLineNumber(), statement
							.getCondition().getCharacter());
			container.addException(rce);
		}
		if (statement.getStatement() != null)
			resolveStatement(statement.getStatement(), category, scopeHandler,
					compilerFeature, container);
		if (statement.getElseStatement() != null)
			resolveStatement(statement.getElseStatement(), category, scopeHandler,
					compilerFeature, container);
		scopeHandler.popActivationRecord();
	}

	private void checkWhileStatement(WhileStatement statement, Category category, 
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {
		scopeHandler.pushActivationRecord(TypesUtilities.LOOP_STATEMENT_TYPE);

		Type expressionType = expressionResolver.evaluate(
				statement.getCondition(), scopeHandler, compilerFeature,
				container).getFirst().getFirst();
		if (expressionType != TypesUtilities.BOOLEAN_TYPE) {
			CodeCompilationException rce = new CodeCompilationException(
					"\"While\" loop expression type should be boolean.",
					statement.getCondition().getLineNumber(), statement
							.getCondition().getCharacter());
			container.addException(rce);
		}
		if (statement.getStatement() != null)
			resolveStatement(statement.getStatement(), category, scopeHandler,
					compilerFeature, container);

		scopeHandler.popActivationRecord();
	}

	private void checkForStatement(ForStatement forStatement, Category category, 
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {
		scopeHandler.pushActivationRecord(TypesUtilities.LOOP_STATEMENT_TYPE);

		if (forStatement.getForInitializer() != null) {
			if (forStatement.getForInitializer().getFieldDeclaration() != null) {
				checkFieldDeclarationStatement(forStatement.getForInitializer()
						.getFieldDeclaration(), CoreRebecaCategoriesUtility.LOCAL_VARIABLE
						, scopeHandler, compilerFeature, container);
			} else if (forStatement.getForInitializer().getExpressions() != null) {
				for (Expression expression : forStatement.getForInitializer()
						.getExpressions()) {
					checkExpression(expression, scopeHandler, compilerFeature,
							container);
				}
			}
		}
		if (forStatement.getCondition() != null) {
			Type expressionType = expressionResolver.evaluate(
					forStatement.getCondition(), scopeHandler, compilerFeature,
					container).getFirst().getFirst();
			if (expressionType != TypesUtilities.BOOLEAN_TYPE) {
				CodeCompilationException rce = new CodeCompilationException(
						"Type mismatch: cannot convert \"for\" statement condition expression type to boolean",
						forStatement.getLineNumber(), forStatement
								.getCharacter());
				container.addException(rce);
			}
		}
		List<Expression> expressions = forStatement.getForIncrement();
		for (Expression expression : expressions) {
			checkExpression(expression, scopeHandler, compilerFeature,
					container);
		}
		if (forStatement.getStatement() != null)
			resolveStatement(forStatement.getStatement(), category, scopeHandler,
					compilerFeature, container);
		scopeHandler.popActivationRecord();
	}

	private void checkReturnStatement(ReturnStatement statement, Category category, 
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {
		Type returnValueType = expressionResolver.evaluate(
				statement.getExpression(), scopeHandler, compilerFeature,
				container).getFirst().getFirst();
		Type expectedType;
		try {
			expectedType = scopeHandler
					.retreiveVariableTypeFromScope(ScopeHandler.RETURN_VALUE_KEY_IN_SCOPE).getFirst();
		} catch (ScopeException e) {
			throw new CompilerInternalErrorRuntimeException(e);
		}
		if (!TypesUtilities.getInstance().canTypeUpCastTo(returnValueType,
				expectedType)) {
			CodeCompilationException rce = new CodeCompilationException(
					"Type mismatch: cannot convert from "
							+ TypesUtilities.getTypeName(returnValueType)
							+ " to " + TypesUtilities.getTypeName(expectedType),
					statement.getLineNumber(), statement.getCharacter());
			container.addException(rce);
		}
	}

	private void checkContinueStatement(ConditionalStatement statement, Category category, 
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {
		if (!scopeHandler
				.ownerExistsInScope(TypesUtilities.LOOP_STATEMENT_TYPE)) {
			CodeCompilationException rce = new CodeCompilationException(
					"continue cannot be used outside of a loop",
					statement.getLineNumber(), statement.getCharacter());
			container.addException(rce);
		}
	}

	private void checkBreakStatement(BreakStatement statement, Category category, 
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {
		if (!scopeHandler
				.ownerExistsInScope(TypesUtilities.LOOP_STATEMENT_TYPE)
				&& !scopeHandler
						.ownerExistsInScope(TypesUtilities.SWITCH_STATEMENT_TYPE)) {
			CodeCompilationException rce = new CodeCompilationException(
					"break cannot be used outside of a loop or a switch",
					statement.getLineNumber(), statement.getCharacter());
			container.addException(rce);
		}
	}

	private void checkSwitchStatement(SwitchStatement switchStatement, Category category, 
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {
		scopeHandler.pushActivationRecord(TypesUtilities.SWITCH_STATEMENT_TYPE);

		Type switchExpressionType = expressionResolver.evaluate(
				switchStatement.getExpression(), scopeHandler, compilerFeature,
				container).getFirst().getFirst();
		if (switchExpressionType != null) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(
					switchExpressionType, TypesUtilities.INT_TYPE)) {
				CodeCompilationException rce = new CodeCompilationException(
						"Cannot switch on a value of type "
								+ TypesUtilities
										.getTypeName(switchExpressionType)
								+ ". Only convertible int values are permitted",
						switchStatement.getLineNumber(), switchStatement
								.getCharacter());
				container.addException(rce);
			} else {
				Set<Integer> caseOptions = new HashSet<Integer>();
				boolean hasDefault = false;
				for (SwitchStatementGroup sbsg : switchStatement
						.getSwitchStatementGroups()) {
					if (sbsg.getExpression() != null) {
						Expression switchLabel = sbsg.getExpression();
						Pair<Pair<Type, Category>, Object> evaluate = expressionResolver
								.evaluate(switchLabel, scopeHandler,
										compilerFeature, container);
						if (evaluate.getSecond() != null) {
							if (!TypesUtilities.getInstance().canTypeUpCastTo(
									evaluate.getFirst().getFirst(),
									TypesUtilities.INT_TYPE)) {
								CodeCompilationException rce = TypesUtilities
										.getTypeMismatchException(
												evaluate.getFirst().getFirst(),
												TypesUtilities.INT_TYPE);
								rce.setLine(switchLabel.getLineNumber());
								rce.setColumn(switchLabel.getCharacter());
								container.addException(rce);
							} else {
								if (caseOptions.contains(((Number) evaluate
										.getSecond()).intValue())) {
									CodeCompilationException rce = new CodeCompilationException(
											"Duplicate case value \""
													+ ((Number) evaluate.getSecond()).intValue()
													+ "\"",
											switchLabel.getLineNumber(),
											switchLabel.getCharacter());
									container.addException(rce);
								} else
									caseOptions.add(((Number) evaluate
											.getSecond()).intValue());
							}
						} else {
							CodeCompilationException cce = new CodeCompilationException(
									"Case expressions must be constant expressions",
									switchLabel.getLineNumber(), switchLabel
											.getCharacter());
							container.addException(cce);
						}
					} else {
						if (hasDefault) {
							container
									.addException(new CodeCompilationException(
											"The default case is already defined",
											sbsg.getLineNumber(), sbsg
													.getCharacter()));
						}
						hasDefault = true;
					}
					scopeHandler.pushActivationRecord();
					for (Statement statement : sbsg.getStatements())
						resolveStatement(statement, category, scopeHandler,
								compilerFeature, container);
					scopeHandler.popActivationRecord();
				}
			}
		}
		scopeHandler.popActivationRecord();
	}

	private void checkFieldDeclarationStatement(
			FieldDeclaration fieldDeclaration, Category category, ScopeHandler scopeHandler,
			Set<CompilerFeature> compilerFeature, ExceptionContainer container) {
		for (VariableDeclarator vd : fieldDeclaration.getVariableDeclarators()) {
			try {
				scopeHandler.addVaribaleToScope(vd.getVariableName(),
						fieldDeclaration.getType(), category, 
						vd.getLineNumber(), vd.getCharacter());
				TypesUtilities.getInstance().checkVariableInitializationType(
						fieldDeclaration.getType(),
						vd.getVariableInitializer(), expressionResolver,
						scopeHandler, compilerFeature);
			} catch (ScopeException se) {
				se.setColumn(vd.getCharacter());
				se.setLine(vd.getLineNumber());
				container.addException(se);
			} catch (ExceptionContainer ec) {
				container.addAll(ec);
			}
		}
	}

	private void checkExpression(Expression expression,
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container) {
		expressionResolver.evaluate(expression, scopeHandler, compilerFeature,
				container);
	}

}
