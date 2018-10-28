package org.rebecalang.compiler.modelcompiler;

import java.util.Set;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class ExpressionSemanticCheckContainer extends AbstractSemanticCheckContainer {

	
	public ExpressionSemanticCheckContainer(ScopeHandler scopeHandler,
			SymbolTable symbolTable, Set<CompilerFeature> compilerFeature,
			ExceptionContainer exceptionContainer) {
		super(scopeHandler, symbolTable, compilerFeature, exceptionContainer);
	}

	public Pair<Type, Object> check(Expression expression) {
		return check(expression, TypesUtilities.NO_TYPE);
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
	
	public void registerTranslator(Class<? extends Expression> type, AbstractExpressionSemanticCheck translator) {
		super.registerSemanticsChecker(type, translator);
		((AbstractExpressionSemanticCheck)translator).setExpressionSemanticCheckContainer(this);
	}
	
}
