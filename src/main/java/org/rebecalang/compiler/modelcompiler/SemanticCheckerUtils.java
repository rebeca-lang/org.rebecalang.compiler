package org.rebecalang.compiler.modelcompiler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.TypesUtilities;

public class SemanticCheckerUtils {

	public static Type getCommonSuperType(Type lType, Type rType) throws CodeCompilationException {
		if (TypesUtilities.getInstance().canTypeUpCastTo(lType, rType)) {
			if (rType == TypesUtilities.NULL_TYPE)
				return lType;
			return rType;
		}
		if (TypesUtilities.getInstance().canTypeUpCastTo(rType, lType)) {
			if (lType == TypesUtilities.NULL_TYPE)
				return rType;
			return lType;
		}
		throw TypesUtilities.getTypeMismatchException(lType, rType);
	}

	public static Type getResultType(String operator, Type lType, Type rType)
			throws CodeCompilationException {
		Type retValue = TypesUtilities.UNKNOWN_TYPE;

		// Assignment operators which are applicable for all values
		if (operator.equals("=")) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(rType, lType)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = lType;
		}

		// Arithmetic operators which are applicable for both integer and real
		// values
		Set<String> arithmeticFreeOperators = new HashSet<String>();
		arithmeticFreeOperators.addAll(Arrays.asList("+", "-", "*", "/"));
		if (arithmeticFreeOperators.contains(operator)) {
			if (lType == TypesUtilities.STRING_TYPE) {
				if (operator.equals("+")) {
					return TypesUtilities.STRING_TYPE;
				} else {
					throw new CodeCompilationException("Incompatible operator for String type", 0, 0);					
				}
			} else {
				Type biggerType = getCommonSuperType(lType, rType);
				if (!TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
						TypesUtilities.DOUBLE_TYPE)) {
					CodeCompilationException cce = createEvaluateExceptionMessage2(
							0, 0, operator, rType, lType);
					if (cce == null)
						return retValue;
					throw cce;
				} else {
					if (TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
							TypesUtilities.INT_TYPE)) {
						retValue = TypesUtilities.INT_TYPE;
					} else {
						retValue = biggerType;
					}
				}				
			}
		}

		Set<String> arithmeticFreeAssignmentOperators = new HashSet<String>();
		arithmeticFreeAssignmentOperators.addAll(Arrays.asList("+=", "-=",
				"*=", "/="));
		if (arithmeticFreeAssignmentOperators.contains(operator)) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(rType, lType)
					|| !TypesUtilities.getInstance().canTypeUpCastTo(lType,
							TypesUtilities.DOUBLE_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = lType;
		}

		// Arithmetic operators which are applicable for only integer values
		Set<String> arithmeticIntegerOperators = new HashSet<String>();
		arithmeticIntegerOperators.addAll(Arrays.asList("%", ">>", "<<"));
		if (arithmeticIntegerOperators.contains(operator)) {
			Type biggerType = getCommonSuperType(lType, rType);
			if (!TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
					TypesUtilities.INT_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = biggerType;
		}

		Set<String> arithmeticIntegerAssignmentOperators = new HashSet<String>();
		arithmeticIntegerAssignmentOperators.addAll(Arrays.asList(">>=", "<<=",
				"%="));
		if (arithmeticIntegerAssignmentOperators.contains(operator)) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(rType, lType)
					|| !TypesUtilities.getInstance().canTypeUpCastTo(lType,
							TypesUtilities.INT_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = lType;
		}

		// Bitwise operators which are applicable for both integer and boolean
		// values
		Set<String> bitwiseOperators = new HashSet<String>();
		bitwiseOperators.addAll(Arrays.asList("|", "&", "^", "~"));
		if (bitwiseOperators.contains(operator)) {
			Type biggerType = getCommonSuperType(lType, rType);
			if (!TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
					TypesUtilities.INT_TYPE)
					&& !TypesUtilities.getInstance().canTypeUpCastTo(
							biggerType, TypesUtilities.BOOLEAN_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = biggerType;
		}

		Set<String> bitwiseAssignmentOperators = new HashSet<String>();
		bitwiseAssignmentOperators
				.addAll(Arrays.asList("|=", "&=", "^=", "~="));
		if (bitwiseAssignmentOperators.contains(operator)) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(rType, lType)
					|| (!TypesUtilities.getInstance().canTypeUpCastTo(lType,
							TypesUtilities.INT_TYPE) && !TypesUtilities
							.getInstance().canTypeUpCastTo(lType,
									TypesUtilities.BOOLEAN_TYPE))) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = lType;
		}

		// relational operators which are applicable for both integer and real
		// values
		Set<String> relationalOperators = new HashSet<String>();
		relationalOperators.addAll(Arrays.asList("<", ">", "<=", ">="));
		if (relationalOperators.contains(operator)) {
			Type biggerType = getCommonSuperType(lType, rType);
			if (!TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
					TypesUtilities.DOUBLE_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = TypesUtilities.BOOLEAN_TYPE;
		}

		// relational operators which are applicable for integer, real, boolean,
		// and reactive classes values
		Set<String> relationalEQOperators = new HashSet<String>();
		relationalEQOperators.addAll(Arrays.asList("==", "!="));
		if (relationalEQOperators.contains(operator)) {
			Type biggerType = getCommonSuperType(lType, rType);
			if (!TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
					TypesUtilities.DOUBLE_TYPE)
					&& !TypesUtilities.getInstance().canTypeUpCastTo(
							biggerType, TypesUtilities.BOOLEAN_TYPE)
					&& !TypesUtilities.getInstance().canTypeUpCastTo(
							biggerType, TypesUtilities.REACTIVE_CLASS_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = TypesUtilities.BOOLEAN_TYPE;
		}

		// logical operators which are applicable for integer, real, boolean,
		// and reactive classes values
		Set<String> logicalOperators = new HashSet<String>();
		logicalOperators.addAll(Arrays.asList("&&", "||", "->"));
		if (logicalOperators.contains(operator)) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(lType,
					TypesUtilities.BOOLEAN_TYPE)
					|| !TypesUtilities.getInstance().canTypeUpCastTo(rType,
							TypesUtilities.BOOLEAN_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = TypesUtilities.BOOLEAN_TYPE;
		}
		return retValue;
	}

	public static CodeCompilationException getOutofRangeException(
			String value, Type type, int line, int column) {
		return new CodeCompilationException("The literal " + value
				+ " of type " + TypesUtilities.getTypeName(type)
				+ " is out of range ", line, column);
	}

	public static CodeCompilationException createEvaluateExceptionMessage2(
			int lineNumber, int column, String operator, Type... types) {
		String typesString = "";
		for (Type type : types) {
			if (type == null || type == TypesUtilities.UNKNOWN_TYPE)
				return null;
			typesString += ", "
					+ (type == null ? "unknown" : TypesUtilities
							.getTypeName(type));
		}
		if (types.length > 0)
			typesString = typesString.substring(2);

		return new CodeCompilationException("The operator " + operator
				+ " is undefined for the argument type(s) " + typesString,
				lineNumber, column);
	}

	public static Object evaluateConstantTerm(String operator, Type type,
			Object left, Object right) {

		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		try {
			Object value = null;
			if (right != null && left != null) {
				value = engine.eval("(" + left + ")" + operator + "(" + right + ")");
			} else if (left != null) {
				value = engine.eval(operator + "(" + left.toString() + ")");
			}
			return value;
			
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
		}
		return null;
	}


}
