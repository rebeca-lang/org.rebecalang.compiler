package org.rebecalang.compiler.modelcompiler;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractStatementSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StatementSemanticCheckContainer extends AbstractSemanticCheckContainer {
	
	@Autowired
	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;
	
	public StatementSemanticCheckContainer() {
		super();
		semanticsCheckersRepository.put(Statement.class, new EmptyStatementSemanticCheck());
	}
	
	public void check(Statement statement) {
		try {
			if (statement instanceof Expression) {
				check((Expression)statement);
			} else {
				AbstractStatementSemanticCheck statementSemanticCheck = 
						(AbstractStatementSemanticCheck) semanticsCheckersRepository.get(statement.getClass());
				statementSemanticCheck.check(statement);
			}
		} catch (NullPointerException e) {
			throw new CompilerInternalErrorRuntimeException("Unknown semantic checker for statement of type \"" +
					statement.getClass() + "\"");
		}
	}
	
	public Pair<Type, Object> check(Expression expression) {
		Pair<Type, Object> retValue = expressionSemanticCheckContainer.check(expression);
		return retValue;
	}
	
	private static class EmptyStatementSemanticCheck extends AbstractStatementSemanticCheck {

		@Override
		public void check(Statement statement)
				throws CompilerInternalErrorRuntimeException {
		}
		
	}

	public ExpressionSemanticCheckContainer getExpressionSemanticCheckContainer() {
		return expressionSemanticCheckContainer;
	}
}
