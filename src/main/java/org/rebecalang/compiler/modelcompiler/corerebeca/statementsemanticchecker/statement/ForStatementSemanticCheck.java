package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.statement;

import java.util.List;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.StatementSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ForStatement;
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
public class ForStatementSemanticCheck extends AbstractStatementSemanticCheck {

	StatementSemanticCheckContainer statementSemanticCheckContainer;

	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	@Autowired
	public ForStatementSemanticCheck(StatementSemanticCheckContainer statementSemanticCheckContainer,
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		this.statementSemanticCheckContainer = statementSemanticCheckContainer;
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}

	@Override
	public void check(Statement statement)
			throws CompilerInternalErrorRuntimeException {
		scopeHandler.pushScopeRecord(CoreRebecaLabelUtility.LOOP_STATEMENT);
		ForStatement forStatement = (ForStatement) statement;
		if (forStatement.getForInitializer() != null) {
			if (forStatement.getForInitializer().getFieldDeclaration() != null) {
				statementSemanticCheckContainer.check(forStatement.getForInitializer()
						.getFieldDeclaration());
			} else if (forStatement.getForInitializer().getExpressions() != null) {
				for (Expression expression : forStatement.getForInitializer()
						.getExpressions()) {
					statementSemanticCheckContainer.check(expression);
				}
			}
		}
		if (forStatement.getCondition() != null) {
			Pair<Type, Object> result = expressionSemanticCheckContainer.check(forStatement.getCondition());
			Type expressionType = result.getFirst();
			if (expressionType != CoreRebecaTypeSystem.BOOLEAN_TYPE) {
				CodeCompilationException rce = new CodeCompilationException(
						"Type mismatch: cannot convert \"for\" statement condition expression type to boolean",
						forStatement.getLineNumber(), forStatement
								.getCharacter());
				exceptionContainer.addException(rce);
			}
			if(!(forStatement.getCondition() instanceof TermPrimary))
				forStatement.getCondition().setType(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		}
		List<Expression> expressions = forStatement.getForIncrement();
		for (Expression expression : expressions) {
			((StatementSemanticCheckContainer)statementSemanticCheckContainer).check(expression);
		}
		if (forStatement.getStatement() != null)
			((StatementSemanticCheckContainer)statementSemanticCheckContainer).check(forStatement.getStatement());
		scopeHandler.popScopeRecord();
	}

}
