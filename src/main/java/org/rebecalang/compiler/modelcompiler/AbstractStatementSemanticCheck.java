package org.rebecalang.compiler.modelcompiler;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Statement;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;

public abstract class AbstractStatementSemanticCheck extends AbstractSemanticCheck{
	protected ExpressionSemanticCheckContainer expressionSemanticCheckContainer;
	
	public abstract void check(Statement statement) throws CompilerInternalErrorRuntimeException;
	
	public ExpressionSemanticCheckContainer getExpressionSemanticCheckContainer() {
		return expressionSemanticCheckContainer;
	}
	public void setExpressionSemanticCheckContainer(
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}
}
