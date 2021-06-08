package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.springframework.stereotype.Component;

@Component
public class ContinueStatementSemanticCheck extends AbstractStatementSemanticCheck {

	@Override
	public void check(Statement statement)
			throws CompilerInternalErrorRuntimeException {
		if (!scopeHandler
				.isInScopeOf(CoreRebecaLabelUtility.LOOP_STATEMENT)) {
			CodeCompilationException rce = new CodeCompilationException(
					"continue cannot be used outside of a loop",
					statement.getLineNumber(), statement.getCharacter());
			exceptionContainer.addException(rce);
		}
	}

}
