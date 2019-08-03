package org.rebecalang.compiler.utils;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BaseClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericTypeInstance;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InterfaceDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;

public class TypesUtilities {

	static TypesUtilities object;

	private Map<String, Type> types;
	private Map<Type, BaseClassDeclaration> reactiveClassesAndInterfacesMetaData;
	private Map<Type, List<Type>> compatibilityMap;

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
				if (base instanceof OrdinaryPrimitiveType) {
					if (base != target)
						return 1;
				} else if (base instanceof ArrayType) {
					if (!TypesUtilities.getInstance().canTypeUpCastTo(base,
							target))
						return 1;
					ArrayType baseArrayType = (ArrayType) base;
					ArrayType targetArrayType = (ArrayType) target;
					if (baseArrayType.getOrdinaryPrimitiveType() != targetArrayType
							.getOrdinaryPrimitiveType()) {
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
		STRING_TYPE.setName("String");
		VOID_TYPE = new OrdinaryPrimitiveType();
		VOID_TYPE.setName("void");
		NULL_TYPE = new OrdinaryPrimitiveType();
		NULL_TYPE.setName("null");
		UNKNOWN_TYPE = new OrdinaryPrimitiveType();
		UNKNOWN_TYPE.setName("unknown");
		REACTIVE_CLASS_TYPE = new OrdinaryPrimitiveType();
		REACTIVE_CLASS_TYPE.setName("ReactiveClass");
		NO_TYPE = new OrdinaryPrimitiveType();
		NO_TYPE.setName("no-type");
		MSGSRV_TYPE = new OrdinaryPrimitiveType();
		MSGSRV_TYPE.setName("message server");
		CONSTRUCTOR_TYPE = new OrdinaryPrimitiveType();
		CONSTRUCTOR_TYPE.setName("constructor");

		object = new TypesUtilities();
	}

	TypesUtilities() {
		//This field is a map; that for a given type it contains a set of Types 
		// which are its parent types. Note that because of multiple interface
		// implementation, it may contains more than one direct parent
		compatibilityMap = new HashMap<Type, List<Type>>();
		addTypeCompatibility(INT_TYPE, FLOAT_TYPE);
		addTypeCompatibility(SHORT_TYPE, INT_TYPE);
		addTypeCompatibility(BYTE_TYPE, SHORT_TYPE);
		addTypeCompatibility(FLOAT_TYPE, DOUBLE_TYPE);
		compatibilityMap.put(DOUBLE_TYPE, new LinkedList<Type>());

		addTypeCompatibility(REACTIVE_CLASS_TYPE, NULL_TYPE);
		compatibilityMap.put(NULL_TYPE, new LinkedList<Type>());

		types = new HashMap<String, Type>();
		types.put(REACTIVE_CLASS_TYPE.getName(), REACTIVE_CLASS_TYPE);

		reactiveClassesAndInterfacesMetaData = new HashMap<Type, BaseClassDeclaration>();

		types.put(INT_TYPE.getName(), INT_TYPE);
		types.put(SHORT_TYPE.getName(), SHORT_TYPE);
		types.put(BYTE_TYPE.getName(), BYTE_TYPE);
		types.put(FLOAT_TYPE.getName(), FLOAT_TYPE);
		types.put(DOUBLE_TYPE.getName(), DOUBLE_TYPE);
		types.put(BOOLEAN_TYPE.getName(), BOOLEAN_TYPE);
		types.put(CHAR_TYPE.getName(), CHAR_TYPE);
		types.put(STRING_TYPE.getName(), STRING_TYPE);
		types.put(UNKNOWN_TYPE.getName(), UNKNOWN_TYPE);
		types.put(REACTIVE_CLASS_TYPE.getName(), REACTIVE_CLASS_TYPE);
		types.put(NO_TYPE.getName(), NO_TYPE);
		types.put(VOID_TYPE.getName(), VOID_TYPE);

		//TODO: Temporary support for generic list
		GenericType list = new GenericType();
		list.setName("ArrayList");
		list.setNumberOfParameters(1);
		types.put(list.getName() + "<?>", list);
	}

	public static TypesUtilities getInstance() {
		return object;
	}

	public boolean hasType(String typeName) {
		return types.get(typeName) != null;
	}
	public boolean hasType(Type type) {
		if (type instanceof ArrayType) {
			ArrayType arrayType = (ArrayType) type;
			return hasType(arrayType.getOrdinaryPrimitiveType());
		} else if (type instanceof GenericTypeInstance) {
			return hasType(getTypeName(type));			
		}
		return hasType(((OrdinaryPrimitiveType)type).getName());	
	}

	public Type getType(String typeName) throws CodeCompilationException {
		Type retValue = types.get(typeName);
		if (retValue == null) {
			throw new CodeCompilationException("Unknown type " + typeName, 0, 0);
		}
		return retValue;
	}

	public Type getType(Type type) throws CodeCompilationException {
		if (type instanceof ArrayType) {
			ArrayType arrayType = (ArrayType) type;
			arrayType.setOrdinaryPrimitiveType((OrdinaryPrimitiveType) getType(getTypeName(arrayType.getOrdinaryPrimitiveType())));
			return type;
		} else if (type instanceof GenericTypeInstance) {
			try {
				return getType(getTypeName(type));
			} catch (CodeCompilationException e) {
			}

			try {
				GenericTypeInstance gti = (GenericTypeInstance)type;
				gti.setBase((GenericType) getType(gti.getBase()));
				for (int i = 0; i < gti.getParameters().size(); i++)
					gti.getParameters().set(i, TypesUtilities.getInstance().getType(gti.getParameters().get(i)));
				types.put(getTypeName(gti), gti);
				return gti;
			} catch (CodeCompilationException e) {
				throw e;
			}
		}
		return getType(getTypeName(type));
	}

	public BaseClassDeclaration getMetaData(Type type) throws CodeCompilationException {
		BaseClassDeclaration rcd = reactiveClassesAndInterfacesMetaData.get(type);
		if (rcd == null) {
			throw new CodeCompilationException("There is no meta data for type " + TypesUtilities.getTypeName(type) , 0, 0);
		}
		return rcd;
	}

	public void addTypeCompatibility(Type subType, Type superType) {
		if(!compatibilityMap.containsKey(subType))
			compatibilityMap.put(subType, new LinkedList<Type>());
		compatibilityMap.get(subType).add(superType);

	}

	public void addNewType(OrdinaryPrimitiveType newType) {
		types.put(newType.getName(), newType);
	}
	
	public void addReactiveClassType(ReactiveClassDeclaration rcd) {		
		OrdinaryPrimitiveType type = new OrdinaryPrimitiveType();
		type.setName(rcd.getName());
		type.setLineNumber(rcd.getLineNumber());
		type.setCharacter(rcd.getCharacter());
		types.put(rcd.getName(), type);
		reactiveClassesAndInterfacesMetaData.put(type, rcd);
		addTypeCompatibility(type, REACTIVE_CLASS_TYPE);
	}

	public void addInterfaceType(InterfaceDeclaration intd) {
		OrdinaryPrimitiveType type = new OrdinaryPrimitiveType();
		type.setName(intd.getName());
		type.setLineNumber(intd.getLineNumber());
		type.setCharacter(intd.getCharacter());
		types.put(intd.getName(), type);
		reactiveClassesAndInterfacesMetaData.put(type, intd);
		addTypeCompatibility(type, REACTIVE_CLASS_TYPE);		
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
		if (target == TypesUtilities.NULL_TYPE)
			return canTypeUpCastTo(base, TypesUtilities.REACTIVE_CLASS_TYPE);
		if (base == TypesUtilities.NULL_TYPE)
			return canTypeUpCastTo(target, TypesUtilities.REACTIVE_CLASS_TYPE);

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
			base = aBase.getOrdinaryPrimitiveType();
			target = aTarget.getOrdinaryPrimitiveType();
		}
		if (base instanceof OrdinaryPrimitiveType) {
			if (!(target instanceof OrdinaryPrimitiveType))
				return false;

			LinkedList<Type> compatibilityCandidates = new LinkedList<Type>();
			compatibilityCandidates.add(base);
			do {
				Type candidate = compatibilityCandidates.removeFirst();
				if (candidate ==  target)
					return true;
				if(compatibilityMap.containsKey(candidate))
					compatibilityCandidates.addAll(compatibilityMap.get(candidate));
			} while (!compatibilityCandidates.isEmpty());
		} else if (base instanceof GenericTypeInstance) {
			if (!(target instanceof GenericTypeInstance))
				return false;
			GenericTypeInstance gisBase = (GenericTypeInstance)base;
			GenericTypeInstance gisTarget = (GenericTypeInstance)target;
			if(gisBase.getBase() != gisTarget.getBase())
				return false;
			for(int cnt = 0; cnt < gisBase.getParameters().size(); cnt++)
				if(gisBase.getParameters().get(cnt) != gisTarget.getParameters().get(cnt))
					return false;
			return true;
		}
		return false;
	}

	//	public Type getSuperType(Type lType, Type rType)
	//			throws CodeCompilationException {
	//		if (canTypeUpCastTo(lType, rType))
	//			return rType;
	//		if (canTypeUpCastTo(rType, lType))
	//			return lType;
	//		throw getTypeMismatchException(lType, rType);
	//	}

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
			expectedType = aType.getOrdinaryPrimitiveType();
			for (int dimention : aType.getDimensions())
				retValueSuffix += "[" + (dimention == 0 ? "" : dimention) + "]";
		}
		if (expectedType instanceof OrdinaryPrimitiveType)
			return ((OrdinaryPrimitiveType) expectedType).getName()
					+ retValueSuffix;
		else if (expectedType instanceof GenericType) {
			GenericType gt = (GenericType) expectedType;
			String paramPlace = "";
			for(int cnt = 0; cnt < gt.getNumberOfParameters(); cnt++)
				paramPlace += ",?";
			return gt.getName() + '<' + paramPlace.substring(1) + '>'
					+ retValueSuffix;
		}
		else if (expectedType instanceof GenericTypeInstance) {
			GenericTypeInstance gti = (GenericTypeInstance) expectedType;
			String typeInstanceName = "";
			for(Type parameters : gti.getParameters())
				typeInstanceName += ',' + getTypeName(parameters);
			return gti.getBase().getName() + '<' + typeInstanceName.substring(1) + '>';

		}
		throw new RuntimeException("Unknown Type " + expectedType);
	}

	public static CodeCompilationException getTypeMismatchException(Type base,
			Type target) {
		return new CodeCompilationException(
				"Type mismatch: cannot convert from " + getTypeName(base)
				+ " to " + getTypeName(target), 0, 0);
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

	public static OrdinaryPrimitiveType getBOOLEAN_TYPE() {
		return BOOLEAN_TYPE;
	}

	public static void addTypeMismatchException(ExceptionContainer exceptionContainer, Type first, Type second,
			int column, int line) {
		if(first == TypesUtilities.UNKNOWN_TYPE || second == TypesUtilities.UNKNOWN_TYPE)
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