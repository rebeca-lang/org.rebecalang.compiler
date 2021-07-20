package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.SemanticCheckerUtils;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.CastExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CastExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	AbstractTypeSystem typeSystem;

	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;
	
	@Autowired
	public CastExpressionSemanticCheck(AbstractTypeSystem typeSystem,
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		this.typeSystem = typeSystem;
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		CastExpression cExpression = (CastExpression) expression;
		Pair<Type, Object> expressionType = 
				expressionSemanticCheckContainer.check(cExpression.getExpression());
		try {
			Type castType = typeSystem.getType(
					cExpression.getType());
			if (!expressionType.getFirst().canTypeCastTo(castType)) {
				
				TypesUtilities.addTypeMismatchException(exceptionContainer, 
						expressionType.getFirst(), castType,
						cExpression.getExpression());
			}
			cExpression.setType(castType);
			returnValue.setFirst(cExpression.getType());
			returnValue.setSecond(SemanticCheckerUtils.evaluateConstantTerm(
					"(" + returnValue.getFirst().getTypeName() + ")",
					returnValue.getFirst(), expressionType.getSecond(),
					null));
		} catch (CodeCompilationException cce) {
			cExpression.setType(AbstractTypeSystem.UNKNOWN_TYPE);
			returnValue.setFirst(cExpression.getType());
			cce.setColumn(cExpression.getCharacter());
			cce.setLine(cExpression.getLineNumber());
			exceptionContainer.addException(cce);
		}
		return returnValue;
	}
}
