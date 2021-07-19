package org.rebecalang.compiler.modelcompiler;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.stereotype.Component;

@Component
public class ExpressionSemanticCheckContainer extends AbstractSemanticCheckContainer {

	
	public Pair<Type, Object> check(Expression expression) {
		return check(expression, AbstractTypeSystem.NO_TYPE);
	}
	
	public Pair<Type, Object> check(Expression expression, Type baseType) throws CompilerInternalErrorRuntimeException {
		try {
			AbstractExpressionSemanticCheck expressionSemanticCheck = (AbstractExpressionSemanticCheck) semanticsCheckersRepository.get(expression.getClass());
			return expressionSemanticCheck.check(expression, baseType);
		} catch (NullPointerException e) {
			throw new CompilerInternalErrorRuntimeException("Unknown semantic checker for an expression of type \"" +
					expression.getClass() + "\"");
		}
	}
}
