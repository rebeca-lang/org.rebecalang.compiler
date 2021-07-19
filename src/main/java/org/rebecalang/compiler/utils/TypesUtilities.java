package org.rebecalang.compiler.utils;

import java.util.Comparator;
import java.util.List;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;

public class TypesUtilities {

	public static boolean areTheSame(List<Type> base, List<Type> target,
			Comparator<Type> comp) {
		if (base.size() != target.size())
			return false;
		for (int cnt = 0; cnt < base.size(); cnt++) {
			if (comp.compare(base.get(cnt), target.get(cnt)) != 0) {
				return false;
			}
		}
		return true;
	}

	public static CodeCompilationException getTypeMismatchException(Type base,
			Type target) {
		return new CodeCompilationException(
				"Type mismatch: cannot convert from " + base.getTypeName()
				+ " to " + target.getTypeName(), 0, 0);
	}

	public static ArrayType createDummyType(OrdinaryPrimitiveType baseType,
			Integer... dimentions) {
		ArrayType returnValue = new ArrayType();
		returnValue.setOrdinaryPrimitiveType(baseType);
		for (Integer dim : dimentions)
			returnValue.getDimensions().add(dim);
		return returnValue;
	}

	public static int getNumberOfVariablesInFieldDeclaration(
			FieldDeclaration fieldDeclaration) {
		int typeSize = 1;
		if (fieldDeclaration.getType() instanceof ArrayType) {
			ArrayType aType = (ArrayType) fieldDeclaration.getType();
			for (Integer dSize : aType.getDimensions())
				typeSize *= dSize;
		}
		return fieldDeclaration.getVariableDeclarators().size() * typeSize;
	}

//	public static OrdinaryPrimitiveType getBOOLEAN_TYPE() {
//		return BOOLEAN_TYPE;
//	}

	public static void addTypeMismatchException(ExceptionContainer exceptionContainer, Type first, Type second,
			int column, int line) {
		if(first == AbstractTypeSystem.UNKNOWN_TYPE || second == AbstractTypeSystem.UNKNOWN_TYPE)
			return;
		CodeCompilationException cce = TypesUtilities
				.getTypeMismatchException(
						first, second);
		cce.setColumn(column);
		cce.setLine(line);
		exceptionContainer.addException(cce);
	}

	public static void addTypeMismatchException(ExceptionContainer exceptionContainer, Type first, Type second,
			Expression expression) {
		addTypeMismatchException(exceptionContainer, first, second,
				expression.getCharacter(), expression.getLineNumber());
	}

}