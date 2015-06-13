package org.rebecalang.compiler.utils;

import java.util.Set;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;

public abstract class ExpressionResolver {
	
	/***
	 * Both syntax and semantics check of a given expression and its evaluation
	 * (if possible) is done in this method
	 * 
	 * @param expression
	 * @param scopeHandler
	 * @param compilerFeatures
	 * @param container
	 * @return Pair of type of the return value and its value. If the value of
	 *         expression cannot be evaluated in compiler time, the value is set
	 *         to null.
	 */
	public abstract Pair<Pair<Type, Category>, Object> evaluate(Expression expression,
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeatures,
			ExceptionContainer container);
}
