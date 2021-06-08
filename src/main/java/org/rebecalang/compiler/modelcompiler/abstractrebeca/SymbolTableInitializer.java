package org.rebecalang.compiler.modelcompiler.abstractrebeca;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.AccessModifier;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BaseClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConstructorDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InterfaceDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.AccessModifierUtilities;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.springframework.beans.factory.annotation.Autowired;

//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SymbolTableInitializer {
	
	protected AbstractTypeSystem typeSystem; 
	@Autowired
	protected SymbolTable symbolTable;
	@Autowired
	protected ExceptionContainer exceptionContainer;
	
	@Autowired
	public SymbolTableInitializer(AbstractTypeSystem typeSystem) {
		this.typeSystem = typeSystem;
	}

	public void addMethod(Type container, MethodDeclaration methodDecleration, AccessModifier defaultAccessModifier, Label label) {
		if (methodDecleration.getAccessModifier() == null)
			methodDecleration.setAccessModifier(defaultAccessModifier);
		try {
			for (FormalParameterDeclaration fpd : methodDecleration
					.getFormalParameters()) {
				try {
					Type fpType = fpd.getType();
					if (fpType instanceof ArrayType) {
						((ArrayType) fpType)
								.setOrdinaryPrimitiveType((OrdinaryPrimitiveType) typeSystem.getType(
												((ArrayType) fpType)
														.getOrdinaryPrimitiveType()));
					} else {
						fpd.setType(typeSystem.getType(fpType));
					}
				} catch (CodeCompilationException cce) {
					cce.setColumn(fpd.getCharacter());
					cce.setLine(fpd.getLineNumber());
					exceptionContainer.addException(cce);
					fpd.setType(AbstractTypeSystem.UNKNOWN_TYPE);
					continue;
				}
			}
			symbolTable.addMethod(container, methodDecleration, label);
		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
		}
	}

	public void addFields(Type container, List<FieldDeclaration> fieldDeclarations, AccessModifier defaultModifier) {
		for (FieldDeclaration fieldDeclaration : fieldDeclarations) {
			try {
				fieldDeclaration.setType(typeSystem.getType(fieldDeclaration.getType()));
				if(fieldDeclaration.getAccessModifier() == null)
					fieldDeclaration.setAccessModifier(defaultModifier);
				symbolTable.addVarible(container, fieldDeclaration);
			} catch (CodeCompilationException e) {
				exceptionContainer.addException(e);
			}
		}
	}


	public void fillSymbolTable(RebecaModel rebecaModel, CompilerFeature coreVersion) {
		
		symbolTable.clear();
		
		if (rebecaModel.getRebecaCode().getEnvironmentVariables() != null) {
			addFields(null, rebecaModel.getRebecaCode().getEnvironmentVariables(), AccessModifierUtilities.PUBLIC);
		}

		addingInterfacesToSymbolTableInInitialization(rebecaModel);

		addingReactiveclassesToSymbolTableInInitialization(rebecaModel, coreVersion);
		
		interfaceCollisionDetection(rebecaModel);
	}
	
	private void addingReactiveclassesToSymbolTableInInitialization(RebecaModel rebecaModel, CompilerFeature coreVersion) {
		for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {

			// check if reactive class is defined abstract right ?
			if (ActorIsAbstractByDefinition(reactiveClassDeclaration) && !reactiveClassDeclaration.isAbstract()) {
				CodeCompilationException rce = new CodeCompilationException(
						"Reactiveclass " + reactiveClassDeclaration.getName() + " should be defined as abstract",
						reactiveClassDeclaration.getLineNumber(),
						reactiveClassDeclaration.getCharacter());
				exceptionContainer.addException(rce);

			}
			addingAReactiveclassToSymbolTableInInitialization(reactiveClassDeclaration, coreVersion);
		}
	}

	protected void addingAReactiveclassToSymbolTableInInitialization(ReactiveClassDeclaration reactiveClassDeclaration, CompilerFeature coreVersion) {

		if (reactiveClassDeclaration.getConstructors().isEmpty()) {
			if (coreVersion != CompilerFeature.CORE_2_0) {
				ConstructorDeclaration defaultConstructor = new ConstructorDeclaration();
				defaultConstructor.setName(reactiveClassDeclaration.getName());
				defaultConstructor.setBlock(new BlockStatement());
				reactiveClassDeclaration.getConstructors().add(defaultConstructor);
			}
		}

		try {
			Type type = typeSystem.getType(reactiveClassDeclaration.getName());
			addFields(type, reactiveClassDeclaration.getKnownRebecs(), AccessModifierUtilities.PRIVATE);
			addFields(type, reactiveClassDeclaration.getStatevars(), AccessModifierUtilities.PRIVATE);
			addingConstructorsToSymbolTableInInitialization(reactiveClassDeclaration, coreVersion);

			addingSynchMethodsToSymbolTableInInitialization(reactiveClassDeclaration);
			addingMsgsrvsToSymbolTableInInitialization(reactiveClassDeclaration);
		} catch (CodeCompilationException e) {
			e.printStackTrace();
		}
	}


	private void addingMsgsrvsToSymbolTableInInitialization(ReactiveClassDeclaration reactiveClassDeclaration) throws CodeCompilationException {
		Type type = typeSystem.getType(reactiveClassDeclaration.getName());
		for (MethodDeclaration methodDeclaration : reactiveClassDeclaration.getMsgsrvs()) {
			if (methodDeclaration.getName().equals(
					reactiveClassDeclaration.getName())) {
				exceptionContainer
				.addException(new CodeCompilationException(
						"Invalid usage of message-server specifier for the constructor",
						methodDeclaration.getLineNumber(),
						methodDeclaration.getCharacter()));
				addMethod(type, methodDeclaration, AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.CONSTRUCTOR);
			} else
				addMethod(type, methodDeclaration, AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.MSGSRV);
		}
	}


	private void addingSynchMethodsToSymbolTableInInitialization(ReactiveClassDeclaration reactiveClassDeclaration) throws CodeCompilationException {
		Type type = typeSystem.getType(reactiveClassDeclaration.getName());
		for (MethodDeclaration methodDeclaration : reactiveClassDeclaration.getSynchMethods()) {
			SynchMethodDeclaration smd = (SynchMethodDeclaration) methodDeclaration;
			try {
				smd.setReturnType(typeSystem.getType(smd.getReturnType()));
			}catch (CodeCompilationException e) {
				smd.setReturnType(AbstractTypeSystem.UNKNOWN_TYPE);
				exceptionContainer.addException(e);
			}
			if (methodDeclaration.getName().equals(
					reactiveClassDeclaration.getName())) {
				exceptionContainer
				.addException(new CodeCompilationException(
						"Invalid return type for the constructor",
						methodDeclaration.getLineNumber(),
						methodDeclaration.getCharacter()));
				addMethod(type, methodDeclaration, AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.CONSTRUCTOR);
			} else 
				addMethod(type, methodDeclaration, AccessModifierUtilities.PRIVATE, CoreRebecaLabelUtility.SYNCH_METHOD);
		}
	}


	private void addingConstructorsToSymbolTableInInitialization(ReactiveClassDeclaration reactiveClassDeclaration, CompilerFeature coreVersion) throws CodeCompilationException {
		Type type = typeSystem.getType(reactiveClassDeclaration.getName());
		for (int cnt = 0; cnt < reactiveClassDeclaration.getConstructors().size(); cnt++) {
			ConstructorDeclaration constructorDeclaration = reactiveClassDeclaration.getConstructors().get(cnt);
			if (coreVersion == CompilerFeature.CORE_2_0) {
				CodeCompilationException rce = new CodeCompilationException(
						"Rebeca core 2.0 dose not support constructor",
						constructorDeclaration.getLineNumber(),
						constructorDeclaration.getCharacter());
				exceptionContainer.addException(rce);
			}
			if (constructorDeclaration.getName().equals(
					reactiveClassDeclaration.getName())) {
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
				smd.setReturnType(AbstractTypeSystem.NO_TYPE);
				smd.setAccessModifier(constructorDeclaration.getAccessModifier());
				addMethod(type, smd, 
						AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.SYNCH_METHOD);
				reactiveClassDeclaration.getConstructors().remove(cnt);
				reactiveClassDeclaration.getSynchMethods().add(smd);
				cnt--;
			}
		}
	}


	protected void addingInterfacesToSymbolTableInInitialization(RebecaModel rebecaModel) {
		for (InterfaceDeclaration interfaceDeclaration : rebecaModel.getRebecaCode().getInterfaceDeclaration()) {

			try {
				Type type = typeSystem.getType(interfaceDeclaration.getName());
				for (MethodDeclaration methodDeclaration : interfaceDeclaration.getSynchMethods()) {
					SynchMethodDeclaration smd = (SynchMethodDeclaration) methodDeclaration;
					try {
						smd.setReturnType(typeSystem.getType(smd.getReturnType()));
					}catch (CodeCompilationException e) {
						smd.setReturnType(AbstractTypeSystem.UNKNOWN_TYPE);
						exceptionContainer.addException(e);
					}
					if (methodDeclaration.getName().equals(
							interfaceDeclaration.getName())) {
						exceptionContainer
						.addException(new CodeCompilationException(
								"Interfaces cannot have constructor",
								methodDeclaration.getLineNumber(),
								methodDeclaration.getCharacter()));
					} else
						addMethod(type, methodDeclaration, AccessModifierUtilities.PROTECTED, CoreRebecaLabelUtility.SYNCH_METHOD);
				}
				for (MethodDeclaration methodDeclaration : interfaceDeclaration.getMsgsrvs()) {
					if (methodDeclaration.getName().equals(
							interfaceDeclaration.getName())) {
						exceptionContainer
						.addException(new CodeCompilationException(
								"Invalid usage of message-server specifier for the constructor",
								methodDeclaration.getLineNumber(),
								methodDeclaration.getCharacter()));
					} else
						addMethod(type, methodDeclaration, AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.MSGSRV);
				}
			} catch (CodeCompilationException e) {
				e.printStackTrace();
			}
			for (Type implementedInterfaceDeclaration : interfaceDeclaration.getExtends()) {

				try {
					if(!typeSystem.hasType(implementedInterfaceDeclaration)) {
						CodeCompilationException rce = new CodeCompilationException(
								"Unknown interface "
										+ implementedInterfaceDeclaration.getTypeName(),
										implementedInterfaceDeclaration.getLineNumber(),
										implementedInterfaceDeclaration.getCharacter());
						exceptionContainer.addException(rce);
					} else if (!(typeSystem.getMetaData(implementedInterfaceDeclaration) instanceof InterfaceDeclaration)) {
						exceptionContainer
						.addException(new CodeCompilationException(
								"Interfaces can only extend other interfaces",
								interfaceDeclaration.getLineNumber(),
								interfaceDeclaration.getCharacter()));
					}
				} catch (CodeCompilationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	
	private void interfaceCollisionDetection(RebecaModel rebecaModel) {
		for(ReactiveClassDeclaration rcd : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
			Hashtable<MethodSignatureBean, Pair<Type, Integer>> visitedMethods = new Hashtable<MethodSignatureBean, Pair<Type, Integer>>();
			Set<String> visitedClasses = new HashSet<String>();
			getParentMethods(rcd, visitedMethods, rcd, visitedClasses);
		}
		for(InterfaceDeclaration id : rebecaModel.getRebecaCode().getInterfaceDeclaration()) {
			Hashtable<MethodSignatureBean, Pair<Type, Integer>> visitedMethods = new Hashtable<MethodSignatureBean, Pair<Type, Integer>>();
			Set<String> visitedClasses = new HashSet<String>();
			getParentMethods(id, visitedMethods, id, visitedClasses);
		}
	}

	private void getParentMethods(BaseClassDeclaration parent, Hashtable<MethodSignatureBean, Pair<Type, Integer>> visitedMethods, BaseClassDeclaration root, Set<String> visitedClasses) {

		if(parent instanceof ReactiveClassDeclaration) {
			ReactiveClassDeclaration rcd = (ReactiveClassDeclaration)parent;
			if(visitedClasses.contains(rcd.getName()))
				return;
			visitedClasses.add(rcd.getName());
			if(rcd.getExtends()!=null)
				try {
					getParentMethods(typeSystem.getMetaData(rcd.getExtends()), visitedMethods, root, visitedClasses);

				} catch (CodeCompilationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (rcd.getImplements() != null) {
				try {
					for (Type id : rcd.getImplements())
						getParentMethods(typeSystem.getMetaData(id), visitedMethods, root, visitedClasses);

				} catch (Exception e) {
					// TODO: handle exception
				}

			}
			for (MethodDeclaration md : rcd.getMsgsrvs()) {
				LinkedList<Type> params = new LinkedList<Type>();
				for (FormalParameterDeclaration fpd : md.getFormalParameters()) {
					try {
						params.add(typeSystem.getType(fpd.getType()));
					} catch (CodeCompilationException e) {
						//This case will be handled later
					}
				}
				MethodSignatureBean msb = new MethodSignatureBean(md.getName(), params);
				Type returnType;
				try {
					returnType = (symbolTable.getExactMethodSpecification(typeSystem.getType(rcd.getName()), 
							md.getName(), params)).getReturnValue();
					if (!visitedMethods.containsKey(msb)){
						visitedMethods.put(msb, new Pair<Type, Integer>(returnType, md.getLineNumber()));
					} else if (visitedMethods.get(msb).getFirst() != returnType) {
						exceptionContainer
						.addException(createInterfaceCollisionException(visitedMethods, root, md, msb));
					}
				} catch (CodeCompilationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			for (MethodDeclaration md : rcd.getSynchMethods()) {
				LinkedList<Type> params = new LinkedList<Type>();
				for (FormalParameterDeclaration fpd : md.getFormalParameters()) {
					try {
						params.add(typeSystem.getType(fpd.getType()));
					} catch (CodeCompilationException e) {
						//This case will be handled later
					}				}
				MethodSignatureBean msb = new MethodSignatureBean(md.getName(), params);
				Type returnType;
				try {
					returnType = symbolTable.getExactMethodSpecification(typeSystem.getType(rcd.getName()), 
							md.getName(), params).getReturnValue();
					if (!visitedMethods.containsKey(msb)){
						visitedMethods.put(msb, new Pair<Type, Integer>(returnType, md.getLineNumber()));
					} else if (visitedMethods.get(msb).getFirst() != returnType) {
						exceptionContainer
						.addException(createInterfaceCollisionException(visitedMethods, root, md, msb));
					}
				} catch (CodeCompilationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		} else if (parent instanceof InterfaceDeclaration) {
			InterfaceDeclaration intd = (InterfaceDeclaration)parent;

			if (intd.getExtends() != null) {
				try {
					for (Type id : intd.getExtends())
						getParentMethods(typeSystem.getMetaData(id), visitedMethods, root, visitedClasses);

				} catch (Exception e) {
					// TODO: handle exception
				}

			}
			for (MethodDeclaration md : intd.getMsgsrvs()) {
				LinkedList<Type> params = new LinkedList<Type>();
				for (FormalParameterDeclaration fpd : md.getFormalParameters()) {
					try {
						params.add(typeSystem.getType(fpd.getType()));
					} catch (CodeCompilationException e) {
						//This case will be handled later
					}
				}
				MethodSignatureBean msb = new MethodSignatureBean(md.getName(), params);
				Type returnType;
				try {
					returnType = symbolTable.getExactMethodSpecification(typeSystem.getType(intd.getName()), 
							md.getName(), params).getReturnValue();
					if (!visitedMethods.containsKey(msb)){
						visitedMethods.put(msb, new Pair<Type, Integer>(returnType, md.getLineNumber()));
					} else if (visitedMethods.get(msb).getFirst() != returnType) {
						exceptionContainer
						.addException(createInterfaceCollisionException(visitedMethods, root, md, msb));
					}
				} catch (CodeCompilationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		}

	}


	private CodeCompilationException createInterfaceCollisionException(
			Hashtable<MethodSignatureBean, Pair<Type, Integer>> visitedMethods, BaseClassDeclaration rcd,
			MethodDeclaration md, MethodSignatureBean msb) {
		return new CodeCompilationException(
				(rcd instanceof ReactiveClassDeclaration ? "Reactiveclass " : "Interface ") +
				rcd.getName() + " has interface collision in return type of method " + md.getName() + " in line " 
				+ visitedMethods.get(msb).getSecond() +
				" with method " + md.getName() + " in line " + md.getLineNumber(),
				rcd.getLineNumber(),
				rcd.getCharacter());
	}



	public class MethodSignatureBean {
		String methodName;
		LinkedList<Type> parametersType;
		public MethodSignatureBean(String name, LinkedList<Type> parameters) {
			parametersType = new LinkedList<Type>();
			this.methodName = name;
			this.parametersType = parameters;
		}

		public String getMethodName() {
			return methodName;
		}
		public void setMethodName(String methodName) {
			this.methodName = methodName;
		}
		public LinkedList<Type> getParametersType() {
			return parametersType;
		}
		public void setParametersType(LinkedList<Type> parametersType) {
			this.parametersType = parametersType;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((methodName == null) ? 0 : methodName.hashCode());
			result = prime * result + ((parametersType == null) ? 0 : parametersType.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			MethodSignatureBean other = (MethodSignatureBean) obj;
			if (methodName == null) {
				if (other.methodName != null)
					return false;
			} else if (!methodName.equals(other.methodName))
				return false;
			if (parametersType == null) {
				if (other.parametersType != null)
					return false;
			} else if (!parametersType.equals(other.parametersType))
				return false;
			return true;
		}

	}

	private Set<MethodSignatureBean> getParentUnimplementedAbstractMethods(ReactiveClassDeclaration parentClassDeclaration, Set<String> reactiveClassNames) {

		// Loop Breaker: to continue compiling in the case of having loop inheritance already addressed
		if(reactiveClassNames.contains(parentClassDeclaration.getName())) {
			return new HashSet<MethodSignatureBean>();
		} else
			reactiveClassNames.add(parentClassDeclaration.getName());

		Set <MethodSignatureBean> unimplementedAbstractMethods = new HashSet<MethodSignatureBean>();
		if(parentClassDeclaration.getExtends() != null) {
			try {
				unimplementedAbstractMethods = 
						getParentUnimplementedAbstractMethods(
								(ReactiveClassDeclaration)typeSystem.getMetaData(parentClassDeclaration.getExtends())
								, reactiveClassNames);
			} catch (CodeCompilationException e) {
				// This case has been detected before
				return new HashSet<MethodSignatureBean>();
			}
		} 


		LinkedList<InterfaceDeclaration> openBorder = new LinkedList<InterfaceDeclaration>();
		Set<String> visitedSet = new HashSet<String>();

		for (Type interfaceType : parentClassDeclaration.getImplements()) {
			try {
				InterfaceDeclaration metaData =
						(InterfaceDeclaration) typeSystem.getMetaData(interfaceType);
				openBorder.add(metaData);
				visitedSet.add(metaData.getName());

			} catch (CodeCompilationException e) {
				// handled before
			}

		}
		while(!openBorder.isEmpty()) {

			InterfaceDeclaration idc = openBorder.pollFirst();
			for (MethodDeclaration md : idc.getMsgsrvs()) {
				LinkedList<Type> msgSrvParams = new LinkedList<Type>();
				for(FormalParameterDeclaration fpd : md.getFormalParameters()) {
					msgSrvParams.add(fpd.getType());
				}
				unimplementedAbstractMethods.add(new MethodSignatureBean(md.getName(),msgSrvParams));
			}
			for (Type extendsInterfacesType : idc.getExtends()) {
				BaseClassDeclaration base;
				try {
					base = typeSystem.getMetaData(extendsInterfacesType);
					if(base instanceof InterfaceDeclaration) {
						InterfaceDeclaration extendInterface = (InterfaceDeclaration) base;
						if(visitedSet.contains(extendInterface.getName())) {

							CodeCompilationException rce = new CodeCompilationException(
									"Interface extension Loop formation",
									extendsInterfacesType.getLineNumber(),
									extendsInterfacesType.getCharacter());
							exceptionContainer.addException(rce);
							continue;
						}
						openBorder.add(extendInterface);
						visitedSet.add(extendInterface.getName());
					}
				} catch (CodeCompilationException e) {
					// this case has been handled before in filling TypeSystem part
				}

			}
		}

		for (MethodDeclaration msgSrv : parentClassDeclaration.getMsgsrvs()) {
			checkForUnimplementedAbstractMethods(msgSrv, unimplementedAbstractMethods);
		}
		for (MethodDeclaration syncMethod : parentClassDeclaration.getSynchMethods()) {
			checkForUnimplementedAbstractMethods(syncMethod, unimplementedAbstractMethods);
		}
		return unimplementedAbstractMethods;
	}

	private boolean ActorIsAbstractByDefinition(ReactiveClassDeclaration rcd) {

		Set<String> reactiveClassNames = new HashSet<String>();
		return !getParentUnimplementedAbstractMethods(rcd, reactiveClassNames).isEmpty();
	}

	private void checkForUnimplementedAbstractMethods (MethodDeclaration md, Set<MethodSignatureBean> unimplementedAbstractMethods) {
		LinkedList<Type> msgSrvParams = new LinkedList<Type>();
		for(FormalParameterDeclaration fpd : md.getFormalParameters()) {
			try {
				msgSrvParams.add(typeSystem.getType(fpd.getType()));
			} catch (CodeCompilationException e) {
				//This case will be handled later
			}
		}
		MethodSignatureBean msgSrvSign = new MethodSignatureBean(md.getName(), msgSrvParams);
		if (md.isAbstract()) {
			unimplementedAbstractMethods.add(msgSrvSign);
		} else if (unimplementedAbstractMethods.contains(msgSrvSign)) {
			unimplementedAbstractMethods.remove(msgSrvSign);
		}
	}
	
}
