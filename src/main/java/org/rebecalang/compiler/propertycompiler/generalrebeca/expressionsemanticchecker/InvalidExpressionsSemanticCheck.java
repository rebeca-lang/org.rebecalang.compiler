package org.rebecalang.compiler.propertycompiler.generalrebeca.expressionsemanticchecker;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.stereotype.Component;

@Component
public class InvalidExpressionsSemanticCheck extends AbstractExpressionSemanticCheck  {

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		returnValue.setFirst(expression.getType());
		CodeCompilationException cee = new CodeCompilationException(
				"Invalid term for property specification.", 
				expression.getLineNumber(), expression.getCharacter());
		exceptionContainer.addException(cee);
		return returnValue;
	}
	
}
