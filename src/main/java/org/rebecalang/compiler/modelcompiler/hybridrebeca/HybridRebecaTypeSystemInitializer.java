package org.rebecalang.compiler.modelcompiler.hybridrebeca;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.TypeSystemInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.HybridRebecaCode;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.springframework.beans.factory.annotation.Autowired;

public class HybridRebecaTypeSystemInitializer extends TypeSystemInitializer {
	
	@Autowired
	public HybridRebecaTypeSystemInitializer(AbstractTypeSystem typeSystem) {
		super(typeSystem);
	}

	protected void fillTypeSystem(RebecaModel rebecaModel) {
		super.fillTypeSystem(rebecaModel);
		
		for (ReactiveClassDeclaration physicalClassDeclaration : ((HybridRebecaCode)rebecaModel.getRebecaCode()).getPhysicalClassDeclaration()) {
			if(typeSystem.hasType(physicalClassDeclaration.getName())) {
				CodeCompilationException rce = new CodeCompilationException(
						"Multiple definition of "
								+ physicalClassDeclaration.getName(),
								physicalClassDeclaration.getLineNumber(),
								physicalClassDeclaration.getCharacter());
				exceptionContainer.addException(rce);
			} else {
				typeSystem.addReactiveClassType(physicalClassDeclaration);			
				try {
					Type rcdType = typeSystem.getType(physicalClassDeclaration.getName());
					typeSystem.addTypeCompatibility(rcdType, CoreRebecaTypeSystem.REACTIVE_CLASS_TYPE);
				} catch (CodeCompilationException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
