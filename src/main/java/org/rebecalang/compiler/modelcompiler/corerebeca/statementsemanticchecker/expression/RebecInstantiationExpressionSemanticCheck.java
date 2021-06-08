package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PrimaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RebecInstantiationExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	AbstractTypeSystem typeSystem;

	@Autowired
	public RebecInstantiationExpressionSemanticCheck(AbstractTypeSystem typeSystem) {
		super();
		this.typeSystem = typeSystem;
	}
	
	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		PrimaryExpression pExpression = (PrimaryExpression) expression;
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		try {
			pExpression.setType(typeSystem.getType(pExpression.getType()));
		} catch (CodeCompilationException cce) {
			cce.setColumn(pExpression.getCharacter());
			cce.setLine(pExpression.getLineNumber());
			exceptionContainer.addException(cce);
		}
		CodeCompilationException cee = new CodeCompilationException(
				"No semantic check rule is applied on the instatiation of actor(s)", 
				pExpression.getLineNumber(), pExpression.getCharacter());
		exceptionContainer.addWarning(cee);
		//TODO check semantic check

		returnValue.setFirst(pExpression.getType());
		return returnValue;
	}
}
