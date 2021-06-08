package org.rebecalang.compiler.modelcompiler;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.TypesUtilities;


public class SemanticCheckerUtils {

	public static Type getCommonSuperType(Type lType, Type rType) throws CodeCompilationException {
		if (lType.canTypeUpCastTo(rType)) {
			if (rType == CoreRebecaTypeSystem.NULL_TYPE)
				return lType;
			return rType;
		}
		if (rType.canTypeUpCastTo(lType)) {
			if (lType == CoreRebecaTypeSystem.NULL_TYPE)
				return rType;
			return lType;
		}
		throw TypesUtilities.getTypeMismatchException(lType, rType);
	}

	public static Type getResultType(String operator, Type lType, Type rType)
			throws CodeCompilationException {
		Type retValue = AbstractTypeSystem.UNKNOWN_TYPE;

		// Assignment operators which are applicable for all values
		if (operator.equals("=")) {
			if (!rType.canTypeUpCastTo(lType)) {
				CodeCompilationException cce = createEvaluateExceptionMessage(
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
			if (lType == CoreRebecaTypeSystem.STRING_TYPE) {
				if (operator.equals("+")) {
					return CoreRebecaTypeSystem.STRING_TYPE;
				} else {
					throw new CodeCompilationException("Incompatible operator for String type", 0, 0);					
				}
			} else {
				Type biggerType = getCommonSuperType(lType, rType);
				if (!biggerType.canTypeUpCastTo(CoreRebecaTypeSystem.DOUBLE_TYPE)) {
					CodeCompilationException cce = createEvaluateExceptionMessage(
							0, 0, operator, rType, lType);
					if (cce == null)
						return retValue;
					throw cce;
				} else {
					if (biggerType.canTypeUpCastTo(CoreRebecaTypeSystem.INT_TYPE)) {
						retValue = CoreRebecaTypeSystem.INT_TYPE;
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
			if (!rType.canTypeUpCastTo(lType)
					|| !lType.canTypeUpCastTo(CoreRebecaTypeSystem.DOUBLE_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage(
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
			if (!biggerType.canTypeUpCastTo(CoreRebecaTypeSystem.INT_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage(
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
			if (!rType.canTypeUpCastTo(lType)
					|| !lType.canTypeUpCastTo(CoreRebecaTypeSystem.INT_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage(
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
			if (!biggerType.canTypeUpCastTo(CoreRebecaTypeSystem.INT_TYPE)
					&& !biggerType.canTypeUpCastTo(CoreRebecaTypeSystem.BOOLEAN_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage(
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
			if (!rType.canTypeUpCastTo(lType)
					|| (!lType.canTypeUpCastTo(CoreRebecaTypeSystem.INT_TYPE) && 
							!lType.canTypeUpCastTo(CoreRebecaTypeSystem.BOOLEAN_TYPE))) {
				CodeCompilationException cce = createEvaluateExceptionMessage(
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
			if (!biggerType.canTypeUpCastTo(CoreRebecaTypeSystem.DOUBLE_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = CoreRebecaTypeSystem.BOOLEAN_TYPE;
		}

		// relational operators which are applicable for integer, real, boolean,
		// and reactive classes values
		Set<String> relationalEQOperators = new HashSet<String>();
		relationalEQOperators.addAll(Arrays.asList("==", "!="));
		if (relationalEQOperators.contains(operator)) {
			Type biggerType = getCommonSuperType(lType, rType);
			if (!biggerType.canTypeUpCastTo(CoreRebecaTypeSystem.DOUBLE_TYPE)
					&& !biggerType.canTypeUpCastTo(CoreRebecaTypeSystem.BOOLEAN_TYPE)
					&& !biggerType.canTypeUpCastTo(CoreRebecaTypeSystem.REACTIVE_CLASS_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = CoreRebecaTypeSystem.BOOLEAN_TYPE;
		}

		// logical operators which are applicable for integer, real, boolean,
		// and reactive classes values
		Set<String> logicalOperators = new HashSet<String>();
		logicalOperators.addAll(Arrays.asList("&&", "||", "->"));
		if (logicalOperators.contains(operator)) {
			if (!lType.canTypeUpCastTo(CoreRebecaTypeSystem.BOOLEAN_TYPE)
					|| !rType.canTypeUpCastTo(CoreRebecaTypeSystem.BOOLEAN_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = CoreRebecaTypeSystem.BOOLEAN_TYPE;
		}
		return retValue;
	}

	public static CodeCompilationException getOutofRangeException(
			String value, Type type, int line, int column) {
		return new CodeCompilationException("The literal " + value
				+ " of type " + type.getTypeName()
				+ " is out of range ", line, column);
	}

	public static CodeCompilationException createEvaluateExceptionMessage(
			int lineNumber, int column, String operator, Type... types) {
		String typesString = "";
		for (Type type : types) {
			if (type == null || type == AbstractTypeSystem.UNKNOWN_TYPE)
				return null;
			typesString += ", "
					+ (type == null ? "unknown" : type
							.getTypeName());
		}
		if (types.length > 0)
			typesString = typesString.substring(2);

		return new CodeCompilationException("The operator " + operator
				+ " is undefined for the argument type(s) " + typesString,
				lineNumber, column);
	}

//	public static Object evaluateConstantTerm(String operator, Type type,
//			Object left, Object right) {
//
//    	String expression = "";
//		if (right != null && left != null) {
//			expression = "(" + left + ")" + operator + "(" + right + ");";
//		} else if (left != null) {
//			expression = operator + "(" + left.toString() + ");";
//		}
//		System.out.println(expression);
//        return context.eval("js", expression);
////		return null;
//	}

	
	public static Object evaluateConstantTerm(String operator, Type type,
			Object left, Object right) {

		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("javascript");
		String expression = "";
		try {
			Object value = null;
			if (right != null && left != null) {
				expression = "(" + left + ")" + operator + "(" + right + ")";
			} else if (left != null) {
				expression = operator + "(" + left.toString() + ")";
			}
//			System.out.println(expression);
			value = engine.eval(expression);
			return value;
			
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		return null;
	}


}
