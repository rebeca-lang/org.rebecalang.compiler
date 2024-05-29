package org.rebecalang.compiler.modelcompiler.hybridrebeca;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.SymbolTableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.HybridRebecaCode;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.PhysicalClassDeclaration;
import org.rebecalang.compiler.utils.AccessModifierUtilities;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CoreVersion;

public class HybridRebecaSymbolTableInitializer extends SymbolTableInitializer {

	public HybridRebecaSymbolTableInitializer(AbstractTypeSystem typeSystem) {
		super(typeSystem);
	}

	public void fillSymbolTable(RebecaModel rebecaModel, CoreVersion coreVersion) {
		super.fillSymbolTable(rebecaModel, coreVersion);
		
		for (PhysicalClassDeclaration physicalClassDeclaration : ((HybridRebecaCode)rebecaModel.getRebecaCode()).getPhysicalClassDeclaration()) {

			if (physicalClassDeclaration.getExtends() != null) {
				CodeCompilationException rce = new CodeCompilationException(
						"Physical classes does not support inheritence",
						physicalClassDeclaration.getLineNumber(),
						physicalClassDeclaration.getCharacter());
				exceptionContainer.addException(rce);
			}

			if (physicalClassDeclaration.isAbstract()) {
				CodeCompilationException rce = new CodeCompilationException(
						"Physical classes can not be abstract",
						physicalClassDeclaration.getLineNumber(),
						physicalClassDeclaration.getCharacter());
				exceptionContainer.addException(rce);
			}

			addingAReactiveclassToSymbolTableInInitialization(physicalClassDeclaration, coreVersion);
			
			try {
				
				SynchMethodDeclaration method = new SynchMethodDeclaration();
				method.setName("setMode");
				FormalParameterDeclaration fpd = new FormalParameterDeclaration();
				fpd.setName("arg0");
				fpd.setType(HybridRebecaTypeSystem.PHYSICAL_SYSTEM_MODE_TYPE);
				method.getFormalParameters().add(fpd);
				Type type = typeSystem.getType(physicalClassDeclaration.getName());
				addMethod(type, method, AccessModifierUtilities.PUBLIC, HybridRebecaCompleteCompilerFacade.PHYSICAL_SYSTEM_MODE_LABEL);

			} catch (CodeCompilationException e) {
				e.printStackTrace();
			}
		}
	}

}
