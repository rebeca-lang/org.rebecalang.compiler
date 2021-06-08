package org.rebecalang.compiler.modelcompiler.hybridrebeca;

import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("HYBRID_REBECA")
public class HybridRebecaTypeSystem extends CoreRebecaTypeSystem {

	public final static OrdinaryPrimitiveType PHYSICAL_SYSTEM_MODE_TYPE = new OrdinaryPrimitiveType();
	
	static {
		PHYSICAL_SYSTEM_MODE_TYPE.setName("PhysicalSystemModeType");
	}

	@Override
	protected void initializeTypeSystem() {
		super.initializeTypeSystem();
		addNewType(PHYSICAL_SYSTEM_MODE_TYPE);
	}
}
