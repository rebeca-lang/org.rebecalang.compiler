package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InstanceofExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class InstanceofExpressionSemanticCheck extends AbstractExpressionSemanticCheck {


	AbstractTypeSystem typeSystem;
	
	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	
	@Autowired
	public InstanceofExpressionSemanticCheck(AbstractTypeSystem typeSystem,
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		this.typeSystem = typeSystem;
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}


	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		returnValue.setFirst(CoreRebecaTypeSystem.BOOLEAN_TYPE);
		InstanceofExpression ioExpression = (InstanceofExpression) expression;
		Pair<Type, Object> valueType = 
				expressionSemanticCheckContainer.check(ioExpression.getValue());
		Type evaluationType;
		try {
			evaluationType = typeSystem.getType(
					ioExpression.getEvaluationType());
			if (!evaluationType.canTypeCastTo(CoreRebecaTypeSystem.REACTIVE_CLASS_TYPE)) {
				CodeCompilationException cce = new CodeCompilationException(
						"The 'instanceof' operator only works for reactive class names as the rvalue",
						ioExpression.getCharacter(), ioExpression.getLineNumber());
				exceptionContainer.addException(cce);
			}
		} catch (CodeCompilationException e) {
			exceptionContainer.addException(e);
		}
		if (!valueType.getFirst().canTypeCastTo(CoreRebecaTypeSystem.REACTIVE_CLASS_TYPE)) {
			CodeCompilationException cce = new CodeCompilationException(
					"The 'instanceof' operator only works for actor instances as the lvalue",
					ioExpression.getCharacter(), ioExpression.getLineNumber());
			exceptionContainer.addException(cce);
		}
		return returnValue;
	}



}
