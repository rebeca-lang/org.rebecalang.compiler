package org.rebecalang.compiler.utils;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BitIntType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;

public class TypesUtilities {

	static TypesUtilities object;

	private Map<String, String[]> compatibilityMap;
	private Map<Type, Type> superTypeMap;
	private Map<String, OrdinaryPrimitiveType> reactiveClasses;
	private Map<Type, ReactiveClassDeclaration> reactiveClassesMetaData;
	private Map<String, OrdinaryPrimitiveType> primitiveTypes;

	public static final OrdinaryPrimitiveType INT_TYPE;
	public static final OrdinaryPrimitiveType SHORT_TYPE;
	public static final OrdinaryPrimitiveType BYTE_TYPE;
	public static final OrdinaryPrimitiveType FLOAT_TYPE;
	public static final OrdinaryPrimitiveType DOUBLE_TYPE;
	public static final OrdinaryPrimitiveType BOOLEAN_TYPE;
	public static final OrdinaryPrimitiveType CHAR_TYPE;
	public static final OrdinaryPrimitiveType STRING_TYPE;
	public static final OrdinaryPrimitiveType VOID_TYPE;

	public static final OrdinaryPrimitiveType NULL_TYPE;
	public static final OrdinaryPrimitiveType UNKNOWN_TYPE;
	public static final OrdinaryPrimitiveType REACTIVE_CLASS_TYPE;
	public static final OrdinaryPrimitiveType NO_TYPE;
	public static final OrdinaryPrimitiveType MSGSRV_TYPE;
	public static final OrdinaryPrimitiveType CONSTRUCTOR_TYPE;

	public Comparator<Type> getCastableComparator() {
		return new Comparator<Type>() {
			public int compare(Type base, Type target) {
				if (!TypesUtilities.getInstance().canTypeUpCastTo(base, target))
					return 1;
				return 0;
			}
		};
	}

	public Comparator<Type> getExactComparator() {
		return new Comparator<Type>() {
			public int compare(Type base, Type target) {
				if (base instanceof PrimitiveType) {
					if (base != target)
						return 1;
				} else if (base instanceof ArrayType) {
					if (!TypesUtilities.getInstance().canTypeUpCastTo(base,
							target))
						return 1;
					ArrayType baseArrayType = (ArrayType) base;
					ArrayType targetArrayType = (ArrayType) target;
					if (baseArrayType.getPrimitiveType() != targetArrayType
							.getPrimitiveType()) {
						return 1;
					}
				}
				return 0;
			}
		};
	}

	static {
		INT_TYPE = new OrdinaryPrimitiveType();
		INT_TYPE.setName("int");
		SHORT_TYPE = new OrdinaryPrimitiveType();
		SHORT_TYPE.setName("short");
		BYTE_TYPE = new OrdinaryPrimitiveType();
		BYTE_TYPE.setName("byte");
		FLOAT_TYPE = new OrdinaryPrimitiveType();
		FLOAT_TYPE.setName("float");
		DOUBLE_TYPE = new OrdinaryPrimitiveType();
		DOUBLE_TYPE.setName("double");
		BOOLEAN_TYPE = new OrdinaryPrimitiveType();
		BOOLEAN_TYPE.setName("boolean");
		CHAR_TYPE = new OrdinaryPrimitiveType();
		CHAR_TYPE.setName("char");
		STRING_TYPE = new OrdinaryPrimitiveType();
		STRING_TYPE.setName("string");
		VOID_TYPE = new OrdinaryPrimitiveType();
		VOID_TYPE.setName("void");
		NULL_TYPE = new OrdinaryPrimitiveType();
		NULL_TYPE.setName("null");
		UNKNOWN_TYPE = new OrdinaryPrimitiveType();
		UNKNOWN_TYPE.setName("unknown");
		REACTIVE_CLASS_TYPE = new OrdinaryPrimitiveType();
		REACTIVE_CLASS_TYPE.setName("reactive class");
		NO_TYPE = new OrdinaryPrimitiveType();
		NO_TYPE.setName("no-type");
		MSGSRV_TYPE = new OrdinaryPrimitiveType();
		MSGSRV_TYPE.setName("message server");
		CONSTRUCTOR_TYPE = new OrdinaryPrimitiveType();
		CONSTRUCTOR_TYPE.setName("constructor");

		object = new TypesUtilities();
	}

	TypesUtilities() {
		compatibilityMap = new HashMap<String, String[]>();
		compatibilityMap.put("int", new String[] { "float" });
		compatibilityMap.put("short", new String[] { "int" });
		compatibilityMap.put("byte", new String[] { "short" });
		compatibilityMap.put("float", new String[] { "double" });

		superTypeMap = new HashMap<Type, Type>();
		superTypeMap.put(BYTE_TYPE, INT_TYPE);
		superTypeMap.put(SHORT_TYPE, INT_TYPE);
		superTypeMap.put(FLOAT_TYPE, DOUBLE_TYPE);

		reactiveClasses = new HashMap<String, OrdinaryPrimitiveType>();
		reactiveClassesMetaData = new HashMap<Type, ReactiveClassDeclaration>();

		primitiveTypes = new HashMap<String, OrdinaryPrimitiveType>();
		primitiveTypes.put(INT_TYPE.getName(), INT_TYPE);
		primitiveTypes.put(SHORT_TYPE.getName(), SHORT_TYPE);
		primitiveTypes.put(BYTE_TYPE.getName(), BYTE_TYPE);
		primitiveTypes.put(FLOAT_TYPE.getName(), FLOAT_TYPE);
		primitiveTypes.put(DOUBLE_TYPE.getName(), DOUBLE_TYPE);
		primitiveTypes.put(BOOLEAN_TYPE.getName(), BOOLEAN_TYPE);
		primitiveTypes.put(CHAR_TYPE.getName(), CHAR_TYPE);
		primitiveTypes.put(STRING_TYPE.getName(), STRING_TYPE);
		primitiveTypes.put(UNKNOWN_TYPE.getName(), UNKNOWN_TYPE);
		primitiveTypes.put(REACTIVE_CLASS_TYPE.getName(), REACTIVE_CLASS_TYPE);
		primitiveTypes.put(NO_TYPE.getName(), NO_TYPE);
		primitiveTypes.put(VOID_TYPE.getName(), VOID_TYPE);
		
//		typesAccessModifiers = new HashMap<Type, Map<String, AccessModifier>>();
	}

	public static TypesUtilities getInstance() {
		return object;
	}

	public Type getType(String typeName) throws CodeCompilationException {
		Type retValue = reactiveClasses.get(typeName);
		if (retValue == null) {
			retValue = primitiveTypes.get(typeName);
		}
		if (retValue == null) {
			throw new CodeCompilationException("Unknows type " + typeName, 0, 0);
		}
		return retValue;
	}

	public Type getType(Type type) throws CodeCompilationException {
		if (type instanceof ArrayType) {
			ArrayType arrayType = (ArrayType) type;
			arrayType.setPrimitiveType((PrimitiveType) getType(getTypeName(arrayType.getPrimitiveType())));
			return type;
		}
		return getType(getTypeName(type));
	}

	public ReactiveClassDeclaration getMetaData(Type type) throws CodeCompilationException {
		ReactiveClassDeclaration rcd = reactiveClassesMetaData.get(type);
		if (rcd == null) {
			throw new CodeCompilationException("There is no meta data for type " + TypesUtilities.getTypeName(type) , 0, 0);
		}
		return rcd;
	}
	
	public void addReactiveClassType(ReactiveClassDeclaration rcd) {
		compatibilityMap.put(rcd.getName(),
				new String[] { REACTIVE_CLASS_TYPE.getName() });
		String[] nullCompatibles = compatibilityMap.get("null");
		if (nullCompatibles == null) {
			nullCompatibles = new String[1];
			nullCompatibles[0] = rcd.getName();
			compatibilityMap.put("null", nullCompatibles);
		} else {
			String[] temp = new String[nullCompatibles.length + 1];
			for (int cnt = 0; cnt < nullCompatibles.length; cnt++)
				temp[cnt] = nullCompatibles[cnt];
			temp[temp.length - 1] = rcd.getName();
			compatibilityMap.put("null", temp);
		}
		OrdinaryPrimitiveType type = new OrdinaryPrimitiveType();
		type.setName(rcd.getName());
		type.setLineNumber(rcd.getLineNumber());
		type.setCharacter(rcd.getCharacter());
		reactiveClasses.put(rcd.getName(), type);
		reactiveClassesMetaData.put(type, rcd);
		superTypeMap.put(type, REACTIVE_CLASS_TYPE);
		
	}

	public boolean canTypeCastTo(Type base, Type target) {
		return canTypeUpCastTo(base, target) || canTypeDownCastTo(base, target);
	}

	public boolean canTypeDownCastTo(Type base, Type target) {
		return canTypeUpCastTo(target, base);
	}

	public boolean canTypeUpCastTo(Type base, Type target) {
		if (base == null)
			return target == null;
		if (base instanceof ArrayType) {
			if (!(target instanceof ArrayType))
				return false;
			ArrayType aBase = (ArrayType) base;
			ArrayType aTarget = (ArrayType) target;
			if (aTarget.getDimensions().size() != aBase.getDimensions().size())
				return false;
			for (int cnt = 0; cnt < aTarget.getDimensions().size(); cnt++)
				if (aTarget.getDimensions().get(cnt) != aBase.getDimensions()
						.get(cnt))
					return false;
			base = aBase.getPrimitiveType();
			target = aTarget.getPrimitiveType();
		}
		if (base instanceof OrdinaryPrimitiveType) {
			if (!(target instanceof OrdinaryPrimitiveType))
				return false;
			// Try to recursively figure out the relation between the base type
			// and its target
			OrdinaryPrimitiveType oBase = (OrdinaryPrimitiveType) base;
			OrdinaryPrimitiveType oTarget = (OrdinaryPrimitiveType) target;
			LinkedList<String> compatibilityCandidates = new LinkedList<String>();
			compatibilityCandidates.add(oBase.getName());
			do {
				String candidate = compatibilityCandidates.removeFirst();
				if (candidate.equals(oTarget.getName()))
					return true;
				if (compatibilityMap.containsKey(candidate)) {
					compatibilityCandidates.addAll(Arrays
							.asList(compatibilityMap.get(candidate)));
				}
			} while (!compatibilityCandidates.isEmpty());
		}
		if (base instanceof BitIntType) {
			throw new RuntimeException(
					"Type \"Bitint\" does not implemented yet.");
		}
		return false;
	}

	public Type getSuperType(Type lType, Type rType)
			throws CodeCompilationException {
		if (canTypeUpCastTo(lType, rType))
			return rType;
		if (canTypeUpCastTo(rType, lType))
			return lType;
		throw getTypeMismatchException(lType, rType);
	}

	public Type getSuperType(Type type) {
		Type foundType = superTypeMap.get(type);
		if (foundType == null)
			return type;
		return foundType;
	}

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

	public static String getTypeName(Type expectedType) {
		String retValueSuffix = "";
		if (expectedType instanceof ArrayType) {
			ArrayType aType = (ArrayType) expectedType;
			expectedType = aType.getPrimitiveType();
			for (int dimention : aType.getDimensions())
				retValueSuffix += "[" + (dimention == 0 ? "" : dimention) + "]";
		}
		if (expectedType instanceof BitIntType)
			return "bitint" + retValueSuffix;
		else if (expectedType instanceof OrdinaryPrimitiveType)
			return ((OrdinaryPrimitiveType) expectedType).getName()
					+ retValueSuffix;
		throw new RuntimeException("Unknown Type " + expectedType);
	}

	public static CodeCompilationException getTypeMismatchException(Type base,
			Type target) {
		return new CodeCompilationException(
				"Type mismatch: cannot convert from " + getTypeName(base)
						+ " to " + getTypeName(target), 0, 0);
	}

	public static ArrayType createDummyType(PrimitiveType baseType,
			Integer... dimentions) {
		ArrayType returnValue = new ArrayType();
		returnValue.setPrimitiveType(baseType);
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

	public static OrdinaryPrimitiveType getBOOLEAN_TYPE() {
		return BOOLEAN_TYPE;
	}
	
}
