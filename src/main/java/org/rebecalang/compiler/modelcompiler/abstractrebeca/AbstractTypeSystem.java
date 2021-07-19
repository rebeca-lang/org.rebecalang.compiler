package org.rebecalang.compiler.modelcompiler.abstractrebeca;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BaseClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericTypeInstance;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InterfaceDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;

public abstract class AbstractTypeSystem {

	public static final OrdinaryPrimitiveType UNKNOWN_TYPE;
	public static final OrdinaryPrimitiveType NO_TYPE;
	public static final OrdinaryPrimitiveType MSGSRV_TYPE;
	public static final OrdinaryPrimitiveType CONSTRUCTOR_TYPE;
	public static final OrdinaryPrimitiveType NULL_TYPE;
	public static final OrdinaryPrimitiveType REACTIVE_CLASS_TYPE;

	protected Map<Type, BaseClassDeclaration> reactiveClassesAndInterfacesMetaData;

	protected Map<Type, List<Type>> compatibilityMap;

	protected Map<String, Type> types;
	
	static {
		UNKNOWN_TYPE = new OrdinaryPrimitiveType();
		UNKNOWN_TYPE.setName("unknown");
		NO_TYPE = new OrdinaryPrimitiveType();
		NO_TYPE.setName("no-type");
		MSGSRV_TYPE = new OrdinaryPrimitiveType();
		MSGSRV_TYPE.setName("message server");
		CONSTRUCTOR_TYPE = new OrdinaryPrimitiveType();
		CONSTRUCTOR_TYPE.setName("constructor");
		NULL_TYPE = new OrdinaryPrimitiveType();
		NULL_TYPE.setName("null");
		REACTIVE_CLASS_TYPE = new OrdinaryPrimitiveType();
		REACTIVE_CLASS_TYPE.setName("ReactiveClass");
	}

	public void clear() {
		initializeTypeSystem();
	}

	protected void initializeTypeSystem() {
		compatibilityMap = new HashMap<Type, List<Type>>();
		types = new HashMap<String, Type>();
		reactiveClassesAndInterfacesMetaData = new HashMap<Type, BaseClassDeclaration>();

		addNewType(UNKNOWN_TYPE);
		addNewType(NO_TYPE);
		addNewType(MSGSRV_TYPE);
		addNewType(CONSTRUCTOR_TYPE);
		addNewType(NULL_TYPE);
		addNewType(REACTIVE_CLASS_TYPE);

		addTypeCompatibility(REACTIVE_CLASS_TYPE, NULL_TYPE);
		compatibilityMap.put(NULL_TYPE, new LinkedList<Type>());
		compatibilityMap.put(UNKNOWN_TYPE, new LinkedList<Type>());
		compatibilityMap.put(NO_TYPE, new LinkedList<Type>());
	}

	public boolean hasType(String typeName) {
		return types.get(typeName) != null;
	}

	public boolean hasType(Type type) throws CodeCompilationException {
		if (type instanceof ArrayType) {
			ArrayType arrayType = (ArrayType) type;
			return hasType(arrayType.getOrdinaryPrimitiveType());
		} else if (type instanceof GenericTypeInstance) {
			return hasType(type.getTypeName());			
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
			arrayType.setOrdinaryPrimitiveType((OrdinaryPrimitiveType) getType(arrayType.getOrdinaryPrimitiveType().getTypeName()));
			return type;
		} else if (type instanceof GenericTypeInstance) {
			try {
				return getType(type.getTypeName());
			} catch (CodeCompilationException e) {
			}
	
			try {
				GenericTypeInstance gti = (GenericTypeInstance)type;
				gti.setBase((GenericType) getType(gti.getBase()));
				for (int i = 0; i < gti.getParameters().size(); i++)
					gti.getParameters().set(i, getType(gti.getParameters().get(i)));
				types.put(gti.getTypeName(), gti);
				return gti;
			} catch (CodeCompilationException e) {
				throw e;
			}
		}
		return getType(type.getTypeName());
	}

	public BaseClassDeclaration getMetaData(Type type) throws CodeCompilationException {
		BaseClassDeclaration rcd = reactiveClassesAndInterfacesMetaData.get(type);
		if (rcd == null) {
			throw new CodeCompilationException("There is no meta data for type " + type.getTypeName() , 0, 0);
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
		newType.setTypeSystem(this);
	}

	public Type addReactiveClassType(ReactiveClassDeclaration rcd) {		
		OrdinaryPrimitiveType type = new OrdinaryPrimitiveType();
		type.setName(rcd.getName());
		type.setLineNumber(rcd.getLineNumber());
		type.setCharacter(rcd.getCharacter());
		addNewType(type);
		reactiveClassesAndInterfacesMetaData.put(type, rcd);
		return type;
	}

	public void addInterfaceType(InterfaceDeclaration intd) {
		OrdinaryPrimitiveType type = new OrdinaryPrimitiveType();
		type.setName(intd.getName());
		type.setLineNumber(intd.getLineNumber());
		type.setCharacter(intd.getCharacter());
		addNewType(type);
		reactiveClassesAndInterfacesMetaData.put(type, intd);
	}

	public Map<Type, List<Type>> getCompatibilityMap() {
		return compatibilityMap;
	}
}