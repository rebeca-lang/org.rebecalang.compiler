package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractSemanticCheck;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RebecInstantiationExpressionDummySemanticCheck extends AbstractExpressionSemanticCheck {

	AbstractTypeSystem typeSystem;

	@Autowired
	public RebecInstantiationExpressionDummySemanticCheck(AbstractTypeSystem typeSystem) {
		super();
		this.typeSystem = typeSystem;
	}
	
	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		CodeCompilationException cee = new CodeCompilationException(
				"Rebeca core 2.2 and upper support dynamic actor creation",
				expression.getLineNumber(), expression.getCharacter());
		exceptionContainer.addException(cee);
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		try {
			returnValue.setFirst(typeSystem.getType(expression.getType().getTypeName()));
		} catch (CodeCompilationException e) {
			returnValue.setFirst(AbstractTypeSystem.NO_TYPE);
		}
		returnValue.setSecond(AbstractSemanticCheck.NO_VALUE);
		
		return returnValue;
	}
}
