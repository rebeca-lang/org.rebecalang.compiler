package org.rebecalang.compiler.modelcompiler.abstractrebeca;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BaseClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InterfaceDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TypeSystemInitializer {
	
	@Autowired
	protected ExceptionContainer exceptionContainer;
	
	protected AbstractTypeSystem typeSystem;

	@Autowired
	public TypeSystemInitializer(AbstractTypeSystem typeSystem) {
		this.typeSystem = typeSystem;
	}

	protected void fillTypeSystem(RebecaModel rebecaModel) {
		typeSystem.clear();
		
		addReactiveClassesToTypeSystem(rebecaModel);
		
		addInterfacesToTypeSystem(rebecaModel);
		
		checkInheritanceAndInterfaceImplementationsOfReactviceClasses(rebecaModel);

		checkInheritanceOfInterfaces(rebecaModel);
		
		checkForInheritanceLoops(rebecaModel);
	}

	private void checkForInheritanceLoops(RebecaModel rebecaModel) {
		for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
			hasInheritanceLoop(reactiveClassDeclaration);
		}
		for (InterfaceDeclaration interfaceDeclaration : rebecaModel.getRebecaCode().getInterfaceDeclaration()) {
			checkForInterfaceInheritanceLoop(interfaceDeclaration);
		}	
		
	}

	private void addReactiveClassesToTypeSystem(RebecaModel rebecaModel) {
		for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
			if(typeSystem.hasType(reactiveClassDeclaration.getName())) {
				exceptionContainer.addException(createMultipleDefinitionException(reactiveClassDeclaration));
			} else {
				typeSystem.addReactiveClassType(reactiveClassDeclaration);
			}
		}
	}
	
	private void addInterfacesToTypeSystem(RebecaModel rebecaModel) {
		for (InterfaceDeclaration interfaceDeclaration : rebecaModel.getRebecaCode().getInterfaceDeclaration()) {
			if(typeSystem.hasType(interfaceDeclaration.getName())) {
				exceptionContainer.addException(createMultipleDefinitionException(interfaceDeclaration));
			} else {
				typeSystem.addInterfaceType(interfaceDeclaration);
			}
		}
	}
	
	private void checkInheritanceAndInterfaceImplementationsOfReactviceClasses(RebecaModel rebecaModel) {
		for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
			if(reactiveClassDeclaration.getExtends() != null) {
				try {
					reactiveClassDeclaration.setExtends(typeSystem.getType(reactiveClassDeclaration.getExtends()));

					typeSystem.addTypeCompatibility(
							typeSystem.getType(reactiveClassDeclaration.getName()),
							reactiveClassDeclaration.getExtends()
							);
				} catch (CodeCompilationException e) {
					e.setLine(reactiveClassDeclaration.getExtends().getLineNumber());
					e.setColumn(reactiveClassDeclaration.getExtends().getCharacter());
					exceptionContainer.addException(e);
				}
			}
			
			for(int cnt = 0; cnt < reactiveClassDeclaration.getImplements().size(); cnt++) {
				Type intd = reactiveClassDeclaration.getImplements().get(cnt);
				try {
					reactiveClassDeclaration.getImplements().
					set(cnt, typeSystem.getType(intd));
					typeSystem.addTypeCompatibility(
							typeSystem.getType(reactiveClassDeclaration.getName()),
							reactiveClassDeclaration.getImplements().get(cnt)
							);
				} catch (CodeCompilationException e) {
					e.setLine(intd.getLineNumber());
					e.setColumn(intd.getCharacter());
					exceptionContainer.addException(e);
				}
			}
		}
	}
	
	private void checkInheritanceOfInterfaces(RebecaModel rebecaModel) {
		for (InterfaceDeclaration interfaceDeclaration : rebecaModel.getRebecaCode().getInterfaceDeclaration()) {
			for(int cnt = 0; cnt < interfaceDeclaration.getExtends().size(); cnt++) {
				Type intd = interfaceDeclaration.getExtends().get(cnt);
				try {
					interfaceDeclaration.getExtends().
					set(cnt, typeSystem.getType(intd));
					typeSystem.addTypeCompatibility(
							typeSystem.getType(interfaceDeclaration.getName()),
							interfaceDeclaration.getExtends().get(cnt)
							);
				} catch (CodeCompilationException e) {
					e.setLine(intd.getLineNumber());
					e.setColumn(intd.getCharacter());
					exceptionContainer.addException(e);
				}
			}
		}
	}

	private final static CodeCompilationException createMultipleDefinitionException(
			BaseClassDeclaration baseClassDeclaration) {
		return new CodeCompilationException(
				"Multiple definition of "
						+ baseClassDeclaration.getName(),
						baseClassDeclaration.getLineNumber(),
						baseClassDeclaration.getCharacter());
	}

	private void checkForInterfaceInheritanceLoop(InterfaceDeclaration interfaceDeclaration) {

		LinkedList<InterfaceDeclaration> openBorder = new LinkedList<InterfaceDeclaration>();
		openBorder.add(interfaceDeclaration);
		Set<String> visitedSet = new HashSet<String>();
		visitedSet.add(interfaceDeclaration.getName());
		while(!openBorder.isEmpty()) {

			InterfaceDeclaration idc = openBorder.pollFirst();
			for (Type extendsInterfacesType : idc.getExtends()) {
				BaseClassDeclaration base;
				try {
					base = typeSystem.getMetaData(extendsInterfacesType);
					if(base instanceof InterfaceDeclaration) {
						InterfaceDeclaration extendInterface = (InterfaceDeclaration) base;
						if(visitedSet.contains(extendInterface.getName())) {

							CodeCompilationException rce = new CodeCompilationException(
									"Interface extension loop formation",
									extendsInterfacesType.getLineNumber(),
									extendsInterfacesType.getCharacter());
							exceptionContainer.addException(rce);
							continue;
						}
						openBorder.add(extendInterface);
						visitedSet.add(extendInterface.getName());
					}
				} catch (CodeCompilationException e) {
					e.printStackTrace();
				}
			}
		}
	}


	private boolean hasInheritanceLoop(ReactiveClassDeclaration reactiveClassDeclaration) {
		try {
			ReactiveClassDeclaration tempRC = reactiveClassDeclaration;
			Set <String> visitedSet = new HashSet<String>();
			visitedSet.add(reactiveClassDeclaration.getName());
			while(tempRC.getExtends() != null) {
				tempRC = (ReactiveClassDeclaration)typeSystem
						.getMetaData(tempRC.getExtends());
				if (visitedSet.contains(tempRC.getName())) {
					CodeCompilationException rce = new CodeCompilationException(
							"Inheritence Loop formation",
							reactiveClassDeclaration.getLineNumber(),
							reactiveClassDeclaration.getCharacter());
					exceptionContainer.addException(rce);
					return true;	
				}
				visitedSet.add(tempRC.getName());
			}
			return false;	
		} catch (CodeCompilationException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			return false;	
		}

	}

}
