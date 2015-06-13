package org.rebecalang.compiler.utils;

import java.util.Set;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;

public abstract class StatementObserver {

	protected ExpressionResolver expressionResolver;

	public StatementObserver(ExpressionResolver expressionResolver) {
		this.expressionResolver = expressionResolver;
	}

	public abstract void resolveStatement(Statement statement, Category category,
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeature,
			ExceptionContainer container);

	public ExpressionResolver getExpressionResolver() {
		return expressionResolver;
	}
}
