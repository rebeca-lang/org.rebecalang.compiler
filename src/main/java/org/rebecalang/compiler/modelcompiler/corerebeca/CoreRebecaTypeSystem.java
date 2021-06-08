package org.rebecalang.compiler.modelcompiler.corerebeca;

import java.util.LinkedList;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InterfaceDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("CORE_REBECA")
public class CoreRebecaTypeSystem extends AbstractTypeSystem {

	public static final OrdinaryPrimitiveType INT_TYPE;
	public static final OrdinaryPrimitiveType SHORT_TYPE;
	public static final OrdinaryPrimitiveType BYTE_TYPE;
	public static final OrdinaryPrimitiveType FLOAT_TYPE;
	public static final OrdinaryPrimitiveType DOUBLE_TYPE;
	public static final OrdinaryPrimitiveType BOOLEAN_TYPE;
	public static final OrdinaryPrimitiveType CHAR_TYPE;
	public static final OrdinaryPrimitiveType STRING_TYPE;
	public static final OrdinaryPrimitiveType VOID_TYPE;
	
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
	}

	@Override
	protected void initializeTypeSystem() {
		super.initializeTypeSystem();
		//This field is a map; that for a given type it contains a set of Types 
		// which are its parent types. Note that because of multiple interface
		// implementation, it may contains more than one direct parent
		addTypeCompatibility(INT_TYPE, FLOAT_TYPE);
		addTypeCompatibility(SHORT_TYPE, INT_TYPE);
		addTypeCompatibility(BYTE_TYPE, SHORT_TYPE);
		addTypeCompatibility(FLOAT_TYPE, DOUBLE_TYPE);
		compatibilityMap.put(DOUBLE_TYPE, new LinkedList<Type>());

		types.put(REACTIVE_CLASS_TYPE.getName(), REACTIVE_CLASS_TYPE);

		addNewType(INT_TYPE);
		addNewType(SHORT_TYPE);
		addNewType(BYTE_TYPE);
		addNewType(FLOAT_TYPE);
		addNewType(DOUBLE_TYPE);
		addNewType(BOOLEAN_TYPE);
		addNewType(CHAR_TYPE);
		addNewType(STRING_TYPE);
		addNewType(VOID_TYPE);
		addNewType(NULL_TYPE);

		//TODO: Temporary support for generic list
		GenericType list = new GenericType();
		list.setName("ArrayList");
		list.setNumberOfParameters(1);
		types.put(list.getName() + "<?>", list);
	}

	@Override
	public Type addReactiveClassType(ReactiveClassDeclaration rcd) {
		Type retValue = super.addReactiveClassType(rcd);
		try {
			addTypeCompatibility(getType(rcd.getName()), REACTIVE_CLASS_TYPE);
		} catch (CodeCompilationException e) {
			e.printStackTrace();
		}
		return retValue;
	}

	@Override
	public void addInterfaceType(InterfaceDeclaration intd) {
		super.addInterfaceType(intd);
		try {
			addTypeCompatibility(getType(intd.getName()), REACTIVE_CLASS_TYPE);
		} catch (CodeCompilationException e) {
			e.printStackTrace();
		}
	}
	
}
