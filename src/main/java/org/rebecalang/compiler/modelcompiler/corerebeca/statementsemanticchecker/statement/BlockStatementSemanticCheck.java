package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import org.rebecalang.compiler.modelcompiler.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;

public class BlockStatementSemanticCheck extends AbstractStatementSemanticCheck {

	@Override
	public void check(Statement statement)
			throws CompilerInternalErrorRuntimeException {
		scopeHandler.pushScopeRecord(null);
		BlockStatement blockStatement = (BlockStatement) statement;
		for (Statement stat : blockStatement.getStatements()) {
			((StatementSemanticCheckContainer)defaultContainer).check(stat);
		}
		scopeHandler.popScopeRecord();;
	}
}
