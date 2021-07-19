package org.rebecalang.compiler.modelcompiler.abstractrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractExpressionSemanticCheck extends AbstractSemanticCheck {

	public abstract Pair<Type, Object> check(Expression expression, Type baseType);

}
