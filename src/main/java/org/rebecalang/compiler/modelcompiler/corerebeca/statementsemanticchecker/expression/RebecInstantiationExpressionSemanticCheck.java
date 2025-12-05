package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import java.util.LinkedList;
import java.util.List;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.SymbolTableException;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BaseClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InterfaceDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecInstantiationPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RebecInstantiationExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	AbstractTypeSystem typeSystem;

	ExpressionSemanticCheckContainer expressionSemanticCheckContainer;
	@Autowired
	public RebecInstantiationExpressionSemanticCheck(AbstractTypeSystem typeSystem,
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		super();
		this.typeSystem = typeSystem;
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}
	
	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		RebecInstantiationPrimary riExpression = (RebecInstantiationPrimary) expression;
		Type expressionType = AbstractTypeSystem.UNKNOWN_TYPE;
		Pair<Type, Object> returnValue = new Pair<Type, Object>(
				expressionType, AbstractExpressionSemanticCheck.NO_VALUE);
		BaseClassDeclaration bcd;
		try {
			expressionType = typeSystem.getType(riExpression.getType());
			bcd = typeSystem.getMetaData(expressionType);
			riExpression.setType(expressionType);
			returnValue.setFirst(riExpression.getType());
		} catch (CodeCompilationException cce) {
			cce.setColumn(riExpression.getCharacter());
			cce.setLine(riExpression.getLineNumber());
			exceptionContainer.addException(cce);
			return returnValue;
		}
		String methodName = expressionType.getTypeName();

		LinkedList<Type> constructorArgumentsTypes = new LinkedList<Type>();
		for (Expression argExpression : riExpression.getArguments()) {
			constructorArgumentsTypes.add(expressionSemanticCheckContainer.check(argExpression).getFirst());
		}
		LinkedList<Type> knownRebecsBindingsTypes = new LinkedList<Type>();
		for (Expression bngExpression : riExpression.getBindings()) {
			knownRebecsBindingsTypes.add(expressionSemanticCheckContainer.check(bngExpression).getFirst());
		}
		
		if (bcd instanceof InterfaceDeclaration) {
			CodeCompilationException rce = new CodeCompilationException(
					"Cannot instantiate from interface " + bcd.getName(), riExpression.getLineNumber(),
					riExpression.getCharacter());
			this.exceptionContainer.addException(rce);
			return returnValue;
		} else if (bcd instanceof ReactiveClassDeclaration) {
			ReactiveClassDeclaration rcd = (ReactiveClassDeclaration) bcd;
			if (rcd.isAbstract()) {
				CodeCompilationException rce = new CodeCompilationException(
						"Cannot instantiate from abstract reactiveclass " + rcd.getName(),
						bcd.getLineNumber(), riExpression.getCharacter());
				this.exceptionContainer.addException(rce);
				return returnValue;
			}
		}
		
		ReactiveClassDeclaration rcd = (ReactiveClassDeclaration) bcd;
		List<FieldDeclaration> knownRebecs = rcd.getKnownRebecs();
		List<Type> exprectedTypes = new LinkedList<Type>();
		for (FieldDeclaration fd : knownRebecs) {
			for (int variableCounter = 0; variableCounter < fd.getVariableDeclarators().size(); variableCounter++) {
				if (fd.getType() instanceof OrdinaryPrimitiveType) {
					try {
						exprectedTypes.add(typeSystem.getType(fd.getType()));
					} catch (CodeCompilationException e) {
						exprectedTypes.add(AbstractTypeSystem.UNKNOWN_TYPE);
						e.setColumn(fd.getCharacter());
						e.setLine(fd.getLineNumber());
						exceptionContainer.addException(e);
					}
				} else if (fd.getType() instanceof ArrayType) {
					ArrayType type = (ArrayType) fd.getType();
					Type primitiveType = AbstractTypeSystem.UNKNOWN_TYPE;
					try {
						primitiveType = typeSystem.getType(type.getOrdinaryPrimitiveType());
					} catch (CodeCompilationException e) {
						e.setColumn(fd.getCharacter());
						e.setLine(fd.getLineNumber());
						exceptionContainer.addException(e);
					}
					for (Integer dimention : type.getDimensions())
						for (int cnt = 0; cnt < dimention; cnt++)
							exprectedTypes.add(primitiveType);
				}
			}
		}

		try {
			symbolTable.getCastableMethodSpecification(expressionType, methodName, constructorArgumentsTypes);
		} catch (SymbolTableException ste) {
			ste.setColumn(riExpression.getCharacter());
			ste.setLine(riExpression.getLineNumber());
			exceptionContainer.addException(ste);
		}
		if (!TypesUtilities.areTheSame(knownRebecsBindingsTypes, exprectedTypes, Type.getCastableComparator())) {
			CodeCompilationException rce = new CodeCompilationException(
					createCheckMainBindingsExceptionMessage(knownRebecs, knownRebecsBindingsTypes, rcd.getName()),
					riExpression.getLineNumber(), riExpression.getCharacter());
			exceptionContainer.addException(rce);
		}
		
		return returnValue;
	}
	
	public static String createCheckMainBindingsExceptionMessage(
			List<FieldDeclaration> knownRebecs, List<Type> bindings,
			String reactiveClassName) {
		String expected = "", actual = "";

		for (FieldDeclaration fd : knownRebecs)
			expected += ", " + fd.getType().getTypeName();
		// remove the first comma from "expected".
		if (!knownRebecs.isEmpty())
			expected = expected.substring(2);

		for (Type type : bindings) {
			actual += ", " + type.getTypeName();
		}
		// remove the first comma from "actual".
		if (!bindings.isEmpty())
			actual = actual.substring(2);

		return "The " + reactiveClassName + " knownrebecs type binding of (" + expected + ")"
				+ " is not applicable for the arguments (" + actual + ")";
	}
}
