package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConditionalStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ConditionalStatementSemanticCheck extends AbstractStatementSemanticCheck {

	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	StatementSemanticCheckContainer statementSemanticCheckContainer;

	@Autowired
	public ConditionalStatementSemanticCheck(StatementSemanticCheckContainer statementSemanticCheckContainer,
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
		this.statementSemanticCheckContainer = statementSemanticCheckContainer;
	}

	@Override
	public void check(Statement statement) throws CompilerInternalErrorRuntimeException {
		ConditionalStatement conditionalStatement = (ConditionalStatement) statement;
		Pair<Type, Object> result = expressionSemanticCheckContainer.check(
				conditionalStatement.getCondition());
		Type expressionType = result.getFirst();
		if ((expressionType != CoreRebecaTypeSystem.BOOLEAN_TYPE)) {
			CodeCompilationException rce = new CodeCompilationException(
					"\"If\" condition expression type should be boolean.",
					conditionalStatement.getCondition().getLineNumber(), 
					conditionalStatement.getCondition().getCharacter());
			exceptionContainer.addException(rce);
		}
		if(!(conditionalStatement.getCondition() instanceof TermPrimary))
			conditionalStatement.getCondition().setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);

		if (conditionalStatement.getStatement() != null) {
			scopeHandler.pushScopeRecord(null);
			statementSemanticCheckContainer.check(conditionalStatement.getStatement());
			scopeHandler.popScopeRecord();
		}
		if (conditionalStatement.getElseStatement() != null) {
			scopeHandler.pushScopeRecord(null);
			statementSemanticCheckContainer.check(conditionalStatement.getElseStatement());
			scopeHandler.popScopeRecord();
		}
		
	}

}
