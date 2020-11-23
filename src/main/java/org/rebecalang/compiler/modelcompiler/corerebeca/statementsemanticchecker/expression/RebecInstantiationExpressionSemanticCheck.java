package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import org.rebecalang.compiler.modelcompiler.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PrimaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class RebecInstantiationExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		PrimaryExpression pExpression = (PrimaryExpression) expression;
		Pair<Type, Object> returnValue = new Pair<Type, Object>();
		try {
			pExpression.setType(TypesUtilities.getInstance().getType(pExpression.getType()));
		} catch (CodeCompilationException cce) {
			cce.setColumn(pExpression.getCharacter());
			cce.setLine(pExpression.getLineNumber());
			exceptionContainer.addException(cce);
		}
		if (!compilerFeatures.contains(CompilerFeature.CORE_2_2)) {
			CodeCompilationException cee = new CodeCompilationException(
					"Rebeca core 2.2 and upper support dynamic actor creation.", 
					pExpression.getLineNumber(), pExpression.getCharacter());
			exceptionContainer.addException(cee);
		}
		CodeCompilationException cee = new CodeCompilationException(
				"No semantic check rule is applied on the instatiation of actor(s).", 
				pExpression.getLineNumber(), pExpression.getCharacter());
		exceptionContainer.addWarning(cee);
		//TODO check semantic check

		returnValue.setFirst(pExpression.getType());
		return returnValue;
	}

}
