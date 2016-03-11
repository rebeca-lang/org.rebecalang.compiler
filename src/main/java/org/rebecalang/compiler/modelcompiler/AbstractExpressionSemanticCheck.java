package org.rebecalang.compiler.modelcompiler;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.Pair;

public abstract class AbstractExpressionSemanticCheck extends AbstractSemanticCheck {

	protected ExpressionSemanticCheckContainer expressionSemanticCheckContainer;
	
	public abstract Pair<Type, Object> check(Expression expression, Type baseType);

	public void setExpressionSemanticCheckContainer(
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}
}
