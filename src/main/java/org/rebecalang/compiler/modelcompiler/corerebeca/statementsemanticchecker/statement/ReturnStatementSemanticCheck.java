package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import org.rebecalang.compiler.modelcompiler.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.ScopeException;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReturnStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.TypesUtilities;

public class ReturnStatementSemanticCheck extends AbstractStatementSemanticCheck {

	@Override
	public void check(Statement statement)
			throws CompilerInternalErrorRuntimeException {
		ReturnStatement returnStatement = (ReturnStatement) statement;
		Type returnValueType = ((StatementSemanticCheckContainer)defaultContainer).check(
				returnStatement.getExpression()).getFirst();
		Type expectedType;
		try {
			expectedType = scopeHandler
					.retreiveVariableFromScope(ScopeHandler.RETURN_VALUE_KEY_IN_SCOPE).getType();
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
			exceptionContainer.addException(rce);
		}
	}
}
