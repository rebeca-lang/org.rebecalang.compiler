package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import java.util.List;

import org.rebecalang.compiler.modelcompiler.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ForStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class ForStatementSemanticCheck extends AbstractStatementSemanticCheck {


	@Override
	public void check(Statement statement)
			throws CompilerInternalErrorRuntimeException {
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.LOOP_STATEMENT);
		ForStatement forStatement = (ForStatement) statement;
		if (forStatement.getForInitializer() != null) {
			if (forStatement.getForInitializer().getFieldDeclaration() != null) {
				((StatementSemanticCheckContainer)defaultContainer).check(forStatement.getForInitializer()
						.getFieldDeclaration());
			} else if (forStatement.getForInitializer().getExpressions() != null) {
				for (Expression expression : forStatement.getForInitializer()
						.getExpressions()) {
					((StatementSemanticCheckContainer)defaultContainer).check(expression);
				}
			}
		}
		if (forStatement.getCondition() != null) {
			Pair<Type, Object> result = expressionSemanticCheckContainer.check(forStatement.getCondition());
			Type expressionType = result.getFirst();
			if (expressionType != TypesUtilities.BOOLEAN_TYPE) {
				CodeCompilationException rce = new CodeCompilationException(
						"Type mismatch: cannot convert \"for\" statement condition expression type to boolean",
						forStatement.getLineNumber(), forStatement
								.getCharacter());
				exceptionContainer.addException(rce);
			}
		}
		List<Expression> expressions = forStatement.getForIncrement();
		for (Expression expression : expressions) {
			((StatementSemanticCheckContainer)defaultContainer).check(expression);
		}
		if (forStatement.getStatement() != null)
			((StatementSemanticCheckContainer)defaultContainer).check(forStatement.getStatement());
		scopeHandler.popScopeRecord();
	}

}
