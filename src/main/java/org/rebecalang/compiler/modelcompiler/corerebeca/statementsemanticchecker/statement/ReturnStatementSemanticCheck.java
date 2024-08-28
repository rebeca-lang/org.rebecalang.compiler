package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.ScopeException;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReturnStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ReturnStatementSemanticCheck extends AbstractStatementSemanticCheck {

	StatementSemanticCheckContainer statementSemanticCheckContainer;

	@Autowired
	public ReturnStatementSemanticCheck(StatementSemanticCheckContainer statementSemanticCheckContainer) {
		this.statementSemanticCheckContainer = statementSemanticCheckContainer;
	}

	@Override
	public void check(Statement statement)
			throws CompilerInternalErrorRuntimeException {
		ReturnStatement returnStatement = (ReturnStatement) statement;
		Type returnValueType = CoreRebecaTypeSystem.VOID_TYPE;
		if(returnStatement.getExpression() != null)
			returnValueType = statementSemanticCheckContainer.check(
				returnStatement.getExpression()).getFirst();
		Type expectedType;
		try {
			expectedType = scopeHandler
					.retreiveVariableFromScope(ScopeHandler.RETURN_VALUE_KEY_IN_SCOPE).getType();
		} catch (ScopeException e) {
			expectedType = CoreRebecaTypeSystem.VOID_TYPE;
		}
		if (!returnValueType.canTypeUpCastTo(expectedType)) {
			CodeCompilationException rce = new CodeCompilationException(
					"Type mismatch: cannot convert from "
							+ returnValueType.getTypeName()
							+ " to " + expectedType.getTypeName(),
					statement.getLineNumber(), statement.getCharacter());
			exceptionContainer.addException(rce);
		}
	}
}
