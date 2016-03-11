package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import org.rebecalang.compiler.modelcompiler.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConditionalStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class ConditionalStatementSemanticCheck extends AbstractStatementSemanticCheck {

	@Override
	public void check(Statement statement) throws CompilerInternalErrorRuntimeException {
		ConditionalStatement conditionalStatement = (ConditionalStatement) statement;
		Pair<Type, Object> result = expressionSemanticCheckContainer.check(
				conditionalStatement.getCondition());
		Type expressionType = result.getFirst();
		if ((expressionType != TypesUtilities.BOOLEAN_TYPE)) {
			CodeCompilationException rce = new CodeCompilationException(
					"\"If\" condition expression type should be boolean.",
					conditionalStatement.getCondition().getLineNumber(), 
					conditionalStatement.getCondition().getCharacter());
			exceptionContainer.addException(rce);
		}
		if (conditionalStatement.getStatement() != null) {
			scopeHandler.pushScopeRecord(null);
			((StatementSemanticCheckContainer)defaultContainer).check(conditionalStatement.getStatement());
			scopeHandler.popScopeRecord();
		}
		if (conditionalStatement.getElseStatement() != null) {
			scopeHandler.pushScopeRecord(null);
			((StatementSemanticCheckContainer)defaultContainer).check(conditionalStatement.getElseStatement());
			scopeHandler.popScopeRecord();
		}
		
	}

}
