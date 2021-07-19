package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BlockStatementSemanticCheck extends AbstractStatementSemanticCheck {

	@Autowired
	StatementSemanticCheckContainer statementSemanticCheckContainer;

	@Override
	public void check(Statement statement)
			throws CompilerInternalErrorRuntimeException {
		scopeHandler.pushScopeRecord(null);
		BlockStatement blockStatement = (BlockStatement) statement;
		for (Statement stat : blockStatement.getStatements()) {
			statementSemanticCheckContainer.check(stat);
		}
		scopeHandler.popScopeRecord();;
	}
}
