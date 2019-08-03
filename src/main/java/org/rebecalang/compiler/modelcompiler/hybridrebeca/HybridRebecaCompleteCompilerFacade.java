package org.rebecalang.compiler.modelcompiler.hybridrebeca;

import java.util.Set;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConstructorDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericTypeInstance;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.compiler.HybridRebecaCompleteParser;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.HybridRebecaCode;
import org.rebecalang.compiler.modelcompiler.hybridrebeca.objectmodel.PhysicalClassDeclaration;
import org.rebecalang.compiler.modelcompiler.timedrebeca.TimedRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.utils.AccessModifierUtilities;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class HybridRebecaCompleteCompilerFacade extends TimedRebecaCompleteCompilerFacade {

	public final static OrdinaryPrimitiveType PHYSICAL_SYSTEM_MODE_TYPE = new OrdinaryPrimitiveType();
	static {
		PHYSICAL_SYSTEM_MODE_TYPE.setName("PhysicalSystemMode");
	}

	public HybridRebecaCompleteCompilerFacade(CommonTokenStream tokens,
			Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(HybridRebecaCompleteParser.class, tokens, features, exceptionContainer);
	}
	
	public HybridRebecaCompleteCompilerFacade(Class<? extends Parser> parser, CommonTokenStream tokens,
			Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		super(parser, tokens, features, exceptionContainer);
	}
	
	
	protected void initialize() {
		super.initialize();
	}
	
	protected void initalizeSymbolTable() {
		super.initalizeSymbolTable();
		addingPhysicalclassesToSymbolTableInInitialization();
	}
	
	protected void addingPhysicalclassesToSymbolTableInInitialization() {
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

			if (physicalClassDeclaration.getConstructors().isEmpty()) {
					ConstructorDeclaration defaultConstructor = new ConstructorDeclaration();
					defaultConstructor.setName(physicalClassDeclaration.getName());
					defaultConstructor.setBlock(new BlockStatement());
					physicalClassDeclaration.getConstructors().add(defaultConstructor);
			}

			try {
				Type type = TypesUtilities.getInstance().getType(physicalClassDeclaration.getName());
				addFields(type, physicalClassDeclaration.getKnownRebecs(), AccessModifierUtilities.PRIVATE);
				addFields(type, physicalClassDeclaration.getStatevars(), AccessModifierUtilities.PRIVATE);
				for (int cnt = 0; cnt < physicalClassDeclaration.getConstructors().size(); cnt++) {
					ConstructorDeclaration constructorDeclaration = physicalClassDeclaration.getConstructors().get(cnt);
					if (constructorDeclaration.getName().equals(
							physicalClassDeclaration.getName())) {
						addMethod(type, constructorDeclaration, 
								AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.CONSTRUCTOR);
					} else {
						exceptionContainer.addException(new CodeCompilationException(
								"Return type for the method is missing",
								constructorDeclaration.getLineNumber(),
								constructorDeclaration.getCharacter()));
						SynchMethodDeclaration smd = new SynchMethodDeclaration();
						smd.setBlock(constructorDeclaration.getBlock());
						smd.setCharacter(constructorDeclaration.getCharacter());
						smd.setLineNumber(constructorDeclaration.getLineNumber());
						smd.setName(constructorDeclaration.getName());
						smd.setReturnType(TypesUtilities.NO_TYPE);
						smd.setAccessModifier(constructorDeclaration.getAccessModifier());
						addMethod(type, smd, 
								AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.SYNCH_METHOD);
						physicalClassDeclaration.getConstructors().remove(cnt);
						physicalClassDeclaration.getSynchMethods().add(smd);
						cnt--;
					}
				}

				for (MethodDeclaration methodDeclaration : physicalClassDeclaration.getSynchMethods()) {
					SynchMethodDeclaration smd = (SynchMethodDeclaration) methodDeclaration;
					try {
						smd.setReturnType(TypesUtilities.getInstance().getType(smd.getReturnType()));
					}catch (CodeCompilationException e) {
						smd.setReturnType(TypesUtilities.UNKNOWN_TYPE);
						exceptionContainer.addException(e);
					}
					if (methodDeclaration.getName().equals(
							physicalClassDeclaration.getName())) {
						exceptionContainer
						.addException(new CodeCompilationException(
								"Invalid return type for the constructor",
								methodDeclaration.getLineNumber(),
								methodDeclaration.getCharacter()));
						addMethod(type, methodDeclaration, AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.CONSTRUCTOR);
					} else 
						addMethod(type, methodDeclaration, AccessModifierUtilities.PRIVATE, CoreRebecaLabelUtility.SYNCH_METHOD);
				}
				
				if (!physicalClassDeclaration.getMsgsrvs().isEmpty()) {
					CodeCompilationException rce = new CodeCompilationException(
							"Physical classes can not have message server",
							physicalClassDeclaration.getLineNumber(),
							physicalClassDeclaration.getCharacter());
					exceptionContainer.addException(rce);					
				}
			} catch (CodeCompilationException e) {
				e.printStackTrace();
			}
		}
	}
	
	protected void fillTypeSystem() {
		TypesUtilities.getInstance().addNewType(PHYSICAL_SYSTEM_MODE_TYPE );
		
		super.fillTypeSystem();
		for (ReactiveClassDeclaration physicalClassDeclaration : ((HybridRebecaCode)rebecaModel.getRebecaCode()).getPhysicalClassDeclaration()) {
			if(TypesUtilities.getInstance().hasType(physicalClassDeclaration.getName())) {
				CodeCompilationException rce = new CodeCompilationException(
						"Multiple definition of "
								+ physicalClassDeclaration.getName(),
								physicalClassDeclaration.getLineNumber(),
								physicalClassDeclaration.getCharacter());
				exceptionContainer.addException(rce);
			} else {
				TypesUtilities.getInstance().addReactiveClassType(physicalClassDeclaration);			
				try {
					Type rcdType = TypesUtilities.getInstance().getType(physicalClassDeclaration.getName());
					TypesUtilities.getInstance().addTypeCompatibility(rcdType, TypesUtilities.REACTIVE_CLASS_TYPE);
				} catch (CodeCompilationException e) {
					e.printStackTrace();
				}
			}
		}
	}

	protected void addingGlobalMethods() {
		addGlobalMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "setMode", TypesUtilities.VOID_TYPE,
				new Pair<Type,String>(PHYSICAL_SYSTEM_MODE_TYPE, "newMode") );
	}
}
