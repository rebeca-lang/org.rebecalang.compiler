package org.rebecalang.compiler.modelcompiler;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.TokenStream;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.AccessModifier;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BaseClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BlockStatement;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ConstructorDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericTypeInstance;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.InterfaceDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.AccessModifierUtilities;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public abstract class AbstractCompilerFacade {

	protected Parser parser;
	protected ExceptionContainer exceptionContainer;
	protected RebecaModel rebecaModel;
	protected Set<CompilerFeature> compilerFeatures;
	protected ScopeHandler scopeHandler;
	protected SymbolTable symbolTable;

	public AbstractCompilerFacade(Class<? extends Parser> parserClass,
			CommonTokenStream tokens, Set<CompilerFeature> features, ExceptionContainer exceptionContainer) {
		try {
			this.exceptionContainer = exceptionContainer;
			this.compilerFeatures = features;
			Constructor<? extends Parser> constructor = parserClass
					.getConstructor(TokenStream.class);
			parser = constructor.newInstance(tokens);
		} catch (InstantiationException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (IllegalAccessException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (SecurityException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (NoSuchMethodException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (IllegalArgumentException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		} catch (InvocationTargetException e1) {
			throw new RuntimeException("Illegal Rebeca parser class "
					+ parserClass.getName());
		}
		parser.removeErrorListeners();
		parser.addErrorListener(new BaseErrorListener() {
			@Override
			public void syntaxError(Recognizer<?, ?> recognizer,
					Object offendingSymbol, int line, int charPositionInLine,
					String msg, RecognitionException e) {
				AbstractCompilerFacade.this.exceptionContainer.addException(new CodeCompilationException(msg, line,
						charPositionInLine));
			}
		});
		if (exceptionContainer == null)
			this.exceptionContainer = new ExceptionContainer();
	}


	/**
	 * Semantic check of each type Rebeca model should be implemented by the
	 * corresponding derived class.
	 * 
	 * @param features
	 *            The features which the semantic check should be done under its
	 *            content assumptions.
	 * @throws ExceptionContainer Collection of semantic exceptions and warnings.
	 */
	public abstract void semanticCheck(Set<CompilerFeature> features);

	/**
	 * This method should be implemented by the derived classes to show that how
	 * a RebecaModel should be extracted from a parser.
	 * 
	 * @param parser
	 *            The parser that the compiles a Rebeca file and generates its
	 *            corresponding RebecaModel object
	 * @return The generated RebecaModel
	 */
	protected final void compile() {
		try {
			//Method "parser.rebecaModel()" is called
			Method method = parser.getClass().getDeclaredMethod("rebecaModel", new Class[0]);
			Object rebecaModelObj = method.invoke(parser);

			//The result of calling the above method contains the Rebeca model which is stored in variable "r"
			Field field = rebecaModelObj.getClass().getDeclaredField("r");
			this.rebecaModel = (RebecaModel)field.get(rebecaModelObj);
			fillTypeSystem();
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException 
				| IllegalArgumentException | InvocationTargetException | NoSuchFieldException e) {
			e.printStackTrace();
			throw new RuntimeException("Illegal Rebeca parser class ");
		}
	}

	protected void fillTypeSystem() {
		for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
			if(TypesUtilities.getInstance().hasType(reactiveClassDeclaration.getName())) {
				CodeCompilationException rce = new CodeCompilationException(
						"Multiple definition of "
								+ reactiveClassDeclaration.getName(),
								reactiveClassDeclaration.getLineNumber(),
								reactiveClassDeclaration.getCharacter());
				exceptionContainer.addException(rce);
			} else {
				TypesUtilities.getInstance().addReactiveClassType(reactiveClassDeclaration);			
				try {
					Type rcdType = TypesUtilities.getInstance().getType(reactiveClassDeclaration.getName());
					TypesUtilities.getInstance().addTypeCompatibility(rcdType, TypesUtilities.REACTIVE_CLASS_TYPE);
				} catch (CodeCompilationException e) {
					e.printStackTrace();
				}
			}
		}
		for (InterfaceDeclaration interfaceDeclaration : rebecaModel.getRebecaCode().getInterfaceDeclaration()) {
			if(TypesUtilities.getInstance().hasType(interfaceDeclaration.getName())) {
				CodeCompilationException rce = new CodeCompilationException(
						"Multiple definition of "
								+ interfaceDeclaration.getName(),
								interfaceDeclaration.getLineNumber(),
								interfaceDeclaration.getCharacter());
				exceptionContainer.addException(rce);
			} else {
				TypesUtilities.getInstance().addInterfaceType(interfaceDeclaration);
				try {
					Type intdType = TypesUtilities.getInstance().getType(interfaceDeclaration.getName());
					TypesUtilities.getInstance().addTypeCompatibility(intdType, TypesUtilities.REACTIVE_CLASS_TYPE);
				} catch (CodeCompilationException e) {
					e.printStackTrace();
				}
			}
		}


		for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {
			if(reactiveClassDeclaration.getExtends() != null) {
				try {
					reactiveClassDeclaration.setExtends(TypesUtilities.getInstance().getType(reactiveClassDeclaration.getExtends()));

					TypesUtilities.getInstance().addTypeCompatibility(
							TypesUtilities.getInstance().getType(reactiveClassDeclaration.getName()),
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
					set(cnt, TypesUtilities.getInstance().getType(intd));
					TypesUtilities.getInstance().addTypeCompatibility(
							TypesUtilities.getInstance().getType(reactiveClassDeclaration.getName()),
							reactiveClassDeclaration.getImplements().get(cnt)
							);
				} catch (CodeCompilationException e) {
					e.setLine(intd.getLineNumber());
					e.setColumn(intd.getCharacter());
					exceptionContainer.addException(e);
				}
			}
		}
		for (InterfaceDeclaration interfaceDeclaration : rebecaModel.getRebecaCode().getInterfaceDeclaration()) {
			for(int cnt = 0; cnt < interfaceDeclaration.getExtends().size(); cnt++) {
				Type intd = interfaceDeclaration.getExtends().get(cnt);
				try {
					interfaceDeclaration.getExtends().
					set(cnt, TypesUtilities.getInstance().getType(intd));
					TypesUtilities.getInstance().addTypeCompatibility(
							TypesUtilities.getInstance().getType(interfaceDeclaration.getName()),
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


	public RebecaModel getRebecaModel() {
		return rebecaModel;
	}

	public SymbolTable getSymbolTable() {
		return symbolTable;
	}



	@SafeVarargs
	protected final void addGlobalMethodToSymbolTable(Label methodLabel, Type base, String name, Type returnType, Pair<Type,String>... arguments) {

		SynchMethodDeclaration methodDeclaration = new SynchMethodDeclaration();
		methodDeclaration.setName(name);
		methodDeclaration.setAccessModifier(AccessModifierUtilities.PUBLIC);
		for (Pair<Type, String> argument : arguments) {
			FormalParameterDeclaration fpd = new FormalParameterDeclaration();
			fpd.setName(argument.getSecond());
			fpd.setType(argument.getFirst());
			methodDeclaration.getFormalParameters().add(fpd);
		}
		methodDeclaration.setReturnType(returnType);
		try {
			symbolTable.addMethod(base, methodDeclaration,
					methodLabel);
		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
		}
	}

	protected void addingGlobalMethods() {
		try {
			GenericType genericListType = (GenericType)TypesUtilities.getInstance().getType("ArrayList<?>");
			GenericTypeInstance genericTypeInstanceListOfActors = new GenericTypeInstance();
			genericTypeInstanceListOfActors.setBase(genericListType);
			genericTypeInstanceListOfActors.getParameters().add(TypesUtilities.REACTIVE_CLASS_TYPE);
			addGlobalMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "getAllActors", genericTypeInstanceListOfActors);

			addGlobalMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, genericListType, "size",  TypesUtilities.INT_TYPE);

			addGlobalMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, genericListType, "get",  TypesUtilities.UNKNOWN_TYPE,
					new Pair<Type,String>(TypesUtilities.INT_TYPE, "arg0"));

		} catch (CodeCompilationException e) {
			exceptionContainer.addException(e);
		}

		addGlobalMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "sqrt", TypesUtilities.DOUBLE_TYPE,
				new Pair<Type,String>(TypesUtilities.DOUBLE_TYPE, "arg0") );

		addGlobalMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "pow", TypesUtilities.DOUBLE_TYPE,
				new Pair<Type,String>(TypesUtilities.DOUBLE_TYPE, "arg0"),
				new Pair<Type,String>(TypesUtilities.DOUBLE_TYPE, "arg1"));

		addGlobalMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "assertion", TypesUtilities.VOID_TYPE,
				new Pair<Type,String>(TypesUtilities.BOOLEAN_TYPE, "arg0") );

		addGlobalMethodToSymbolTable(CoreRebecaLabelUtility.BUILT_IN_METHOD, null, "assertion", TypesUtilities.VOID_TYPE,
				new Pair<Type,String>(TypesUtilities.BOOLEAN_TYPE, "arg0"),
				new Pair<Type,String>(TypesUtilities.STRING_TYPE, "arg1"));
	}

	protected void initalizeSymbolTable() {
		addingGlobalMethods();

		if (rebecaModel.getRebecaCode().getEnvironmentVariables() != null) {
			addFields(null, rebecaModel.getRebecaCode().getEnvironmentVariables(), AccessModifierUtilities.PUBLIC);
		}


		addingInterfacesToSymbolTableInInitialization();

		addingReactiveclassesToSymbolTableInInitialization();
		interfaceCollisionDetection();
	}


	protected void addingReactiveclassesToSymbolTableInInitialization() {
		for (ReactiveClassDeclaration reactiveClassDeclaration : rebecaModel.getRebecaCode().getReactiveClassDeclaration()) {

			hasInheritanceLoop(reactiveClassDeclaration);

			// check if reactiveclass is defined abstract right ?
			if (ActorIsAbstractByDefinition(reactiveClassDeclaration) && !reactiveClassDeclaration.isAbstract()) {
				CodeCompilationException rce = new CodeCompilationException(
						"Reactiveclass " + reactiveClassDeclaration.getName() + " should be defined as abstract",
						reactiveClassDeclaration.getLineNumber(),
						reactiveClassDeclaration.getCharacter());
				exceptionContainer.addException(rce);

			}


			if (reactiveClassDeclaration.getConstructors().isEmpty()) {
				if (!compilerFeatures.contains(CompilerFeature.CORE_2_0)) {
					ConstructorDeclaration defaultConstructor = new ConstructorDeclaration();
					defaultConstructor.setName(reactiveClassDeclaration.getName());
					defaultConstructor.setBlock(new BlockStatement());
					reactiveClassDeclaration.getConstructors().add(defaultConstructor);
				}
			}

			try {
				Type type = TypesUtilities.getInstance().getType(reactiveClassDeclaration.getName());
				addFields(type, reactiveClassDeclaration.getKnownRebecs(), AccessModifierUtilities.PRIVATE);
				addFields(type, reactiveClassDeclaration.getStatevars(), AccessModifierUtilities.PRIVATE);
				for (int cnt = 0; cnt < reactiveClassDeclaration.getConstructors().size(); cnt++) {
					ConstructorDeclaration constructorDeclaration = reactiveClassDeclaration.getConstructors().get(cnt);
					if (compilerFeatures.contains(CompilerFeature.CORE_2_0)) {
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
						smd.setReturnType(TypesUtilities.NO_TYPE);
						smd.setAccessModifier(constructorDeclaration.getAccessModifier());
						addMethod(type, smd, 
								AccessModifierUtilities.PUBLIC, CoreRebecaLabelUtility.SYNCH_METHOD);
						reactiveClassDeclaration.getConstructors().remove(cnt);
						reactiveClassDeclaration.getSynchMethods().add(smd);
						cnt--;
					}
				}

				for (MethodDeclaration methodDeclaration : reactiveClassDeclaration.getSynchMethods()) {
					SynchMethodDeclaration smd = (SynchMethodDeclaration) methodDeclaration;
					try {
						smd.setReturnType(TypesUtilities.getInstance().getType(smd.getReturnType()));
					}catch (CodeCompilationException e) {
						smd.setReturnType(TypesUtilities.UNKNOWN_TYPE);
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
			} catch (CodeCompilationException e) {
				e.printStackTrace();
			}
		}
	}


	protected void addingInterfacesToSymbolTableInInitialization() {
		for (InterfaceDeclaration interfaceDeclaration : rebecaModel.getRebecaCode().getInterfaceDeclaration()) {

			checkForInterfaceInheritanceLoop(interfaceDeclaration);

			try {
				Type type = TypesUtilities.getInstance().getType(interfaceDeclaration.getName());
				for (MethodDeclaration methodDeclaration : interfaceDeclaration.getSynchMethods()) {
					SynchMethodDeclaration smd = (SynchMethodDeclaration) methodDeclaration;
					try {
						smd.setReturnType(TypesUtilities.getInstance().getType(smd.getReturnType()));
					}catch (CodeCompilationException e) {
						smd.setReturnType(TypesUtilities.UNKNOWN_TYPE);
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
					if(!TypesUtilities.getInstance().hasType(implementedInterfaceDeclaration)) {
						CodeCompilationException rce = new CodeCompilationException(
								"Unknown interface "
										+ TypesUtilities.getTypeName(implementedInterfaceDeclaration),
										implementedInterfaceDeclaration.getLineNumber(),
										implementedInterfaceDeclaration.getCharacter());
						exceptionContainer.addException(rce);
					} else if (!(TypesUtilities.getInstance().getMetaData(implementedInterfaceDeclaration) instanceof InterfaceDeclaration)) {
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

	private void interfaceCollisionDetection() {
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
					getParentMethods(TypesUtilities.getInstance().getMetaData(rcd.getExtends()), visitedMethods, root, visitedClasses);

				} catch (CodeCompilationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (rcd.getImplements() != null) {
				try {
					for (Type id : rcd.getImplements())
						getParentMethods(TypesUtilities.getInstance().getMetaData(id), visitedMethods, root, visitedClasses);

				} catch (Exception e) {
					// TODO: handle exception
				}

			}
			for (MethodDeclaration md : rcd.getMsgsrvs()) {
				LinkedList<Type> params = new LinkedList<Type>();
				for (FormalParameterDeclaration fpd : md.getFormalParameters()) {
					try {
						params.add(TypesUtilities.getInstance().getType(fpd.getType()));
					} catch (CodeCompilationException e) {
						//This case will be handled later
					}
				}
				MethodSignatureBean msb = new MethodSignatureBean(md.getName(), params);
				Type returnType;
				try {
					returnType = (symbolTable.getExactMethodSpecification(TypesUtilities.getInstance().getType(rcd.getName()), 
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
						params.add(TypesUtilities.getInstance().getType(fpd.getType()));
					} catch (CodeCompilationException e) {
						//This case will be handled later
					}				}
				MethodSignatureBean msb = new MethodSignatureBean(md.getName(), params);
				Type returnType;
				try {
					returnType = symbolTable.getExactMethodSpecification(TypesUtilities.getInstance().getType(rcd.getName()), 
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
						getParentMethods(TypesUtilities.getInstance().getMetaData(id), visitedMethods, root, visitedClasses);

				} catch (Exception e) {
					// TODO: handle exception
				}

			}
			for (MethodDeclaration md : intd.getMsgsrvs()) {
				LinkedList<Type> params = new LinkedList<Type>();
				for (FormalParameterDeclaration fpd : md.getFormalParameters()) {
					try {
						params.add(TypesUtilities.getInstance().getType(fpd.getType()));
					} catch (CodeCompilationException e) {
						//This case will be handled later
					}
				}
				MethodSignatureBean msb = new MethodSignatureBean(md.getName(), params);
				Type returnType;
				try {
					returnType = symbolTable.getExactMethodSpecification(TypesUtilities.getInstance().getType(intd.getName()), 
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

	public void checkForInterfaceInheritanceLoop(InterfaceDeclaration interfaceDeclaration) {

		LinkedList<InterfaceDeclaration> openBorder = new LinkedList<InterfaceDeclaration>();
		openBorder.add(interfaceDeclaration);
		Set<String> visitedSet = new HashSet<String>();
		visitedSet.add(interfaceDeclaration.getName());
		while(!openBorder.isEmpty()) {

			InterfaceDeclaration idc = openBorder.pollFirst();
			for (Type extendsInterfacesType : idc.getExtends()) {
				BaseClassDeclaration base;
				try {
					base = TypesUtilities.getInstance().getMetaData(extendsInterfacesType);
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

	}


	public boolean hasInheritanceLoop(ReactiveClassDeclaration reactiveClassDeclaration) {
		try {
			ReactiveClassDeclaration tempRC = reactiveClassDeclaration;
			Set <String> visitedSet = new HashSet<String>();
			visitedSet.add(reactiveClassDeclaration.getName());
			while(tempRC.getExtends() != null) {
				tempRC = (ReactiveClassDeclaration)TypesUtilities.getInstance()
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
								(ReactiveClassDeclaration)TypesUtilities.getInstance().getMetaData(parentClassDeclaration.getExtends())
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
						(InterfaceDeclaration) TypesUtilities.getInstance().getMetaData(interfaceType);
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
					base = TypesUtilities.getInstance().getMetaData(extendsInterfacesType);
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

	public boolean ActorIsAbstractByDefinition(ReactiveClassDeclaration rcd) {

		Set<String> reactiveClassNames = new HashSet<String>();
		return !getParentUnimplementedAbstractMethods(rcd, reactiveClassNames).isEmpty();
	}

	private void checkForUnimplementedAbstractMethods (MethodDeclaration md, Set<MethodSignatureBean> unimplementedAbstractMethods) {
		LinkedList<Type> msgSrvParams = new LinkedList<Type>();
		for(FormalParameterDeclaration fpd : md.getFormalParameters()) {
			try {
				msgSrvParams.add(TypesUtilities.getInstance().getType(fpd.getType()));
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

	public void addMethod(Type container, MethodDeclaration methodDecleration, AccessModifier defaultAccessModifier, Label label) {
		if (methodDecleration.getAccessModifier() == null)
			methodDecleration.setAccessModifier(defaultAccessModifier);
		try {
			symbolTable.addMethod(container, methodDecleration, label);
		} catch (ExceptionContainer ec) {
			exceptionContainer.addAll(ec);
		}
	}


	public void addFields(Type container, List<FieldDeclaration> fieldDeclarations, AccessModifier defaultModifier) {
		for (FieldDeclaration fieldDeclaration : fieldDeclarations) {
			try {
				fieldDeclaration.setType(TypesUtilities.getInstance().getType(fieldDeclaration.getType()));
				if(fieldDeclaration.getAccessModifier() == null)
					fieldDeclaration.setAccessModifier(defaultModifier);
				symbolTable.addVarible(container, fieldDeclaration);
			} catch (CodeCompilationException e) {
				exceptionContainer.addException(e);
			}
		}
	}


}