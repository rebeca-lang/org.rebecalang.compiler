package org.rebecalang.compiler.modelcompiler.hybridrebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression.PrimaryTermExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.HybridRebecaLabelUtility;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HybridPrimaryTermSemanticCheck extends PrimaryTermExpressionSemanticCheck {

	public HybridPrimaryTermSemanticCheck(@Qualifier("HYBRID_REBECA") AbstractTypeSystem typeSystem) {
		super(typeSystem);
	}

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		if (!scopeHandler.isInScopeOf(HybridRebecaLabelUtility.INVARIANT_BLOCK)) {
			CodeCompilationException rce = new CodeCompilationException(
					"Differential equation expressions are only allowed in the definition of invariants",
					expression.getLineNumber(), expression.getCharacter());
			exceptionContainer.addException(rce);
		}

		return super.check(expression, baseType);
	}
	
}
