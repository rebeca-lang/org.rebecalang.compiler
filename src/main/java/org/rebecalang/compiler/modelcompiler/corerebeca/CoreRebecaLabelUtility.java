package org.rebecalang.compiler.modelcompiler.corerebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;

public class CoreRebecaLabelUtility {
	public final static Label REBECA_MODEL;
	public final static Label REACTIVE_CLASS;
	public final static Label SYNCH_METHOD;
	public final static Label MSGSRV;
	public final static Label CONSTRUCTOR;
	public final static Label MAIN;
	public final static Label ASSERTION;

	public static final Label LOOP_STATEMENT;
	public static final Label SWITCH_STATEMENT;

	
	public final static Label ENVIRONMENT_VARIABLE;
	public final static Label STATE_VARIABLE;
	public final static Label METHOD_PARAMETER_VARIABLE;
	public final static Label LOCAL_VARIABLE;
	public final static Label EXPRESSION;
	public final static Label RESERVED_WORD;
	public static final Label KNOWNREBEC_VARIABLE;
	
	
	static {
		REBECA_MODEL = new Label();
		REBECA_MODEL.setName("rebeca-model");
		REACTIVE_CLASS = new Label();
		REACTIVE_CLASS.setName("reactive-class");
		SYNCH_METHOD = new Label();
		SYNCH_METHOD.setName("synch-method");
		MSGSRV = new Label();
		MSGSRV.setName("message-server");
		CONSTRUCTOR = new Label();
		CONSTRUCTOR.setName("constructor");
		MAIN = new Label();
		MAIN.setName("main");
		ASSERTION = new Label();
		ASSERTION.setName("assertion");
		
		LOOP_STATEMENT = new Label();
		LOOP_STATEMENT.setName("loop");
		SWITCH_STATEMENT = new Label();
		SWITCH_STATEMENT.setName("switch");

		ENVIRONMENT_VARIABLE = new Label();
		ENVIRONMENT_VARIABLE.setName("environment-variable");
		STATE_VARIABLE = new Label();
		STATE_VARIABLE.setName("state-variable");
		METHOD_PARAMETER_VARIABLE = new Label();
		METHOD_PARAMETER_VARIABLE.setName("method-param-variable");
		LOCAL_VARIABLE = new Label();
		LOCAL_VARIABLE.setName("local-variable");
		KNOWNREBEC_VARIABLE = new Label();
		KNOWNREBEC_VARIABLE.setName("known-rebec");
		EXPRESSION = new Label();
		EXPRESSION.setName("expression");
		RESERVED_WORD = new Label();
		RESERVED_WORD.setName("reserver-word");
	
	}
}
