package org.rebecalang.compiler.modelcompiler.corerebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;

public class CoreRebecaCategoriesUtility {
	public final static Category ENVIRONMENT_VARIABLE;
	public final static Category NORMAL_VARIABLE;
	public final static Category LOCAL_VARIABLE;
	public final static Category SYNCH_METHOD;
	public final static Category MSGSRV;
	public final static Category CONSTRUCTOR;
	public final static Category ASSERTION;
	public static final Category UNKNOWN;
	
	static {
		NORMAL_VARIABLE = new Category();
		NORMAL_VARIABLE.setName("variable");
		LOCAL_VARIABLE = new Category();
		LOCAL_VARIABLE.setName("local variable");
		ENVIRONMENT_VARIABLE = new Category();
		ENVIRONMENT_VARIABLE.setName("environment-variable");
		SYNCH_METHOD = new Category();
		SYNCH_METHOD.setName("synch-method");
		MSGSRV = new Category();
		MSGSRV.setName("message-server");
		CONSTRUCTOR = new Category();
		CONSTRUCTOR.setName("constructor");
		ASSERTION = new Category();
		ASSERTION.setName("assertion");
		UNKNOWN = new Category();
		UNKNOWN.setName("unknown");
	}
}
