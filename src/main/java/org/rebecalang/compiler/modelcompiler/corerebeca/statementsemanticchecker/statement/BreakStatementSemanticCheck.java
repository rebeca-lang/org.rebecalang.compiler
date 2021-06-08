package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.springframework.stereotype.Component;

@Component
public class BreakStatementSemanticCheck extends AbstractStatementSemanticCheck {


	@Override
	public void check(Statement statement)
			throws CompilerInternalErrorRuntimeException {
		if (!scopeHandler
				.isInScopeOf(CoreRebecaLabelUtility.LOOP_STATEMENT)
				&& !scopeHandler
						.isInScopeOf(CoreRebecaLabelUtility.SWITCH_STATEMENT)) {
			CodeCompilationException rce = new CodeCompilationException(
					"break cannot be used outside of a loop or a switch",
					statement.getLineNumber(), statement.getCharacter());
			exceptionContainer.addException(rce);
		}
	}
}
