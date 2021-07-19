package org.rebecalang.compiler.modelcompiler.timedrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component
@Qualifier("TIMED_REBECA")
public class TimedRebecaTypeSystem extends CoreRebecaTypeSystem {

	@Getter
	public final static OrdinaryPrimitiveType TIMER_TYPE;
	
	static {
		TIMER_TYPE = new OrdinaryPrimitiveType();
		TIMER_TYPE.setName("Timer");
	}

	@Override
	protected void initializeTypeSystem() {
		super.initializeTypeSystem();
		
		addNewType(TIMER_TYPE);
	}
}
