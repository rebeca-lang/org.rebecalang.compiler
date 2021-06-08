package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.WhileStatement;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WhileStatementSemanticCheck extends AbstractStatementSemanticCheck {

	@Autowired
	StatementSemanticCheckContainer statementSemanticCheckContainer;
	@Autowired
	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	public void check(Statement statement) {
		WhileStatement whileStatement = (WhileStatement) statement; 
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.LOOP_STATEMENT);
		
		Pair<Type, Object> result = expressionSemanticCheckContainer.check(
				whileStatement.getCondition());
		Type expressionType = result.getFirst();
		if (expressionType != CoreRebecaTypeSystem.BOOLEAN_TYPE) {
			CodeCompilationException rce = new CodeCompilationException(
					"\"While\" loop expression type should be boolean.",
					whileStatement.getCondition().getLineNumber(), whileStatement
							.getCondition().getCharacter());
			exceptionContainer.addException(rce);
		}
		if(!(whileStatement.getCondition() instanceof TermPrimary))
			whileStatement.getCondition().setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		if (whileStatement.getStatement() != null)
			statementSemanticCheckContainer.check(whileStatement.getStatement());

		scopeHandler.popScopeRecord();
	}

}
