package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InstanceofExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class InstanceofExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		returnValue.setFirst(TypesUtilities.BOOLEAN_TYPE);
		InstanceofExpression ioExpression = (InstanceofExpression) expression;
		Pair<Type, Object> valueType = 
				((ExpressionSemanticCheckContainer)defaultContainer).check(ioExpression.getValue());
		Type evaluationType;
		try {
			evaluationType = TypesUtilities.getInstance().getType(
					ioExpression.getEvaluationType());
			if (!TypesUtilities.getInstance().canTypeCastTo(
					evaluationType, TypesUtilities.REACTIVE_CLASS_TYPE)) {
				CodeCompilationException cce = new CodeCompilationException(
						"The 'instanceof' operator only works for reactive class names as the rvalue",
						ioExpression.getCharacter(), ioExpression.getLineNumber());
				exceptionContainer.addException(cce);
			}
		} catch (CodeCompilationException e) {
			exceptionContainer.addException(e);
		}
		if (!TypesUtilities.getInstance().canTypeCastTo(
				valueType.getFirst(), TypesUtilities.REACTIVE_CLASS_TYPE)) {
			CodeCompilationException cce = new CodeCompilationException(
					"The 'instanceof' operator only works for actor instances as the lvalue",
					ioExpression.getCharacter(), ioExpression.getLineNumber());
			exceptionContainer.addException(cce);
		}
		return returnValue;
	}

}
