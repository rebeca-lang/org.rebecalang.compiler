package org.rebecalang.compiler.modelcompiler;

import java.util.Set;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;

public class StatementSemanticCheckContainer extends AbstractSemanticCheckContainer {

	private ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	public StatementSemanticCheckContainer(ExpressionSemanticCheckContainer expressionSemanticCheckContainer,
			ScopeHandler scopeHandler, SymbolTable symbolTable, Set<CompilerFeature> compilerFeature, ExceptionContainer exceptionContainer) {
		super(scopeHandler, symbolTable, compilerFeature, exceptionContainer);
		translatorsRepository.put(Statement.class, new EmptyStatementSemanticCheck());
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}
	
	@Override
	public void registerTranslator(Class<? extends Statement> type,
			AbstractSemanticCheck translator) {
		super.registerTranslator(type, translator);
		((AbstractStatementSemanticCheck)translator).setExpressionSemanticCheckContainer(expressionSemanticCheckContainer);
	}
	
	public void check(Statement statement) {
		try {
			if (statement instanceof Expression) {
				check((Expression)statement);
			} else {
				AbstractStatementSemanticCheck statementSemanticCheck = 
						(AbstractStatementSemanticCheck) translatorsRepository.get(statement.getClass());
				statementSemanticCheck.check(statement);
			}
		} catch (NullPointerException e) {
			throw new CompilerInternalErrorRuntimeException("Unknown semantic checker for statement of type \"" +
					statement.getClass() + "\"");
		}
	}
	
	public Pair<Type, Object> check(Expression expression) {
		Pair<Type, Object> retValue = expressionSemanticCheckContainer.check(expression);
		exceptionContainer.addAll(expressionSemanticCheckContainer.getExceptionContainer());
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
