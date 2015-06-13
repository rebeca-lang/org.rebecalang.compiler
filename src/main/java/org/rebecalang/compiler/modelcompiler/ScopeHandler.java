package org.rebecalang.compiler.modelcompiler;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCategoriesUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryVariableInitializer;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableInitializer;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.ExpressionResolver;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class ScopeHandler {

	public final static char METHOD_SIGNATURE_SEPERATOR = '$';

	public final static String RETURN_VALUE_KEY_IN_SCOPE = "$return$";
	public final String SCOPE_OWNER_TYPE_KEY = "$owner-type$";

	protected final HashMap<String, Pair<Type, Category>> reservedVariables;
	/**
	 * Map from variable name to pair of variable specifications and
	 * variable location in the source code.
	 * Variable specification contains variable type and its category.
	 */
	protected Stack<HashMap<String, Pair<Pair<Type, Category>, Pair<Integer, Integer>>>> variablesScope;
	/**
	 * Map from the name of method (the container of the method is included in its name)
	 * to possible arguments list (to support polymorphism) and pair of their return types
	 * and categories. 
	 */
	protected HashMap<String, LinkedList<Pair<LinkedList<Type>, Pair<Type, Category>>>> methods;
	protected HashMap<String, Pair<Type, Object>> compileTimeEvaluatableVariables;

	protected Set<CompilerFeature> compilerFeature;

	private ExceptionContainer container;

	private ReactiveClassDeclaration onTopOfStackReactiveClass;

	public ScopeHandler(RebecaModel rebecaModel,
			ExpressionResolver expressionResolver,
			Set<CompilerFeature> compilerFeature, ExceptionContainer container) {
		this.compilerFeature = compilerFeature;
		this.container = container;
		this.methods = new HashMap<String, LinkedList<Pair<LinkedList<Type>, Pair<Type, Category>>>>();
		this.compileTimeEvaluatableVariables = new HashMap<String, Pair<Type, Object>>();
		this.reservedVariables = new HashMap<String, Pair<Type,Category>>();

		variablesScope = new Stack<HashMap<String, Pair<Pair<Type, Category>, Pair<Integer, Integer>>>>();
		variablesScope
				.push(new HashMap<String, Pair<Pair<Type, Category>, Pair<Integer, Integer>>>());
		
		for (ReactiveClassDeclaration rcd : rebecaModel.getRebecaCode().getReactiveClassDeclaration())
			TypesUtilities.getInstance().addReactiveClassType(rcd);

	}

	public void addVariableToCompileTimeEvaluatableVariables(
			String variableName, VariableInitializer variableInitializer,
			Type type, ExpressionResolver expressionResolver,
			Integer lineNumber, Integer character, ExceptionContainer container) {
		if (variableInitializer instanceof OrdinaryVariableInitializer) {
			OrdinaryVariableInitializer ovi = (OrdinaryVariableInitializer) variableInitializer;
			Object value = expressionResolver.evaluate(ovi.getValue(), this,
					compilerFeature, container).getSecond();
			compileTimeEvaluatableVariables.put(variableName,
					new Pair<Type, Object>(type, value));
		}
	}

	public Object retrieveCompileTimeEvaluatableVariable(String variableName) {
		Pair<Type, Object> pair = compileTimeEvaluatableVariables
				.get(variableName);
		if (pair != null)
			return pair.getSecond();
		return null;
	}

	// Initializing the scope at the beginning of each method call
	public void initializeScopeToItsBaseScope(ReactiveClassDeclaration rcd,
			List<FormalParameterDeclaration> parameters, Type returnType) {
		onTopOfStackReactiveClass = rcd;

		// Clear the scope until reach the env and global variables scope.
		while (variablesScope.size() > 1)
			variablesScope.pop();

		variablesScope
				.push(new HashMap<String, Pair<Pair<Type, Category>, Pair<Integer, Integer>>>());

		// Adding predefined variables.
		for (Entry<String, Pair<Type, Category>> entry : reservedVariables.entrySet()) {
			try {
				addVaribaleToScope(entry.getKey(), entry.getValue().getFirst(), 
						entry.getValue().getSecond(), 0, 0);
			} catch (ScopeException e) {
				e.printStackTrace();
			}
		}

		// Adding two predefined known rebecs
		try {
			addVaribaleToScope("self",
					TypesUtilities.getInstance().getType(rcd.getName()), 
					CoreRebecaCategoriesUtility.NORMAL_VARIABLE, 0, 0);
			addVaribaleToScope("sender", TypesUtilities.REACTIVE_CLASS_TYPE, 
					CoreRebecaCategoriesUtility.NORMAL_VARIABLE, 0, 0);
		} catch (CodeCompilationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Adding the known rebecs of the reactive class
		for (FieldDeclaration fd : rcd.getKnownRebecs()) {
			try {
				fd.setType(TypesUtilities.getInstance().getType(fd.getType()));
			} catch (CodeCompilationException cce) {
				cce.setColumn(fd.getCharacter());
				cce.setLine(fd.getLineNumber());
				this.container.addException(cce);
			}
			for (VariableDeclarator vd : fd.getVariableDeclarators())
				try {
					addVaribaleToScope(vd.getVariableName(), fd.getType(),
							CoreRebecaCategoriesUtility.NORMAL_VARIABLE,
							vd.getLineNumber(), vd.getCharacter());
				} catch (ScopeException se) {
					se.setColumn(vd.getCharacter());
					se.setLine(vd.getLineNumber());
					this.container.addException(se);
				}
		}
		// Adding the state variables of the reactive class
		for (FieldDeclaration fd : rcd.getStatevars()) {
			try {
				fd.setType(TypesUtilities.getInstance().getType(fd.getType()));
			} catch (CodeCompilationException cce) {
				cce.setColumn(fd.getCharacter());
				cce.setLine(fd.getLineNumber());
				this.container.addException(cce);
			}
			for (VariableDeclarator vd : fd.getVariableDeclarators()) {
				try {
					addVaribaleToScope(vd.getVariableName(), fd.getType(),
							CoreRebecaCategoriesUtility.NORMAL_VARIABLE,
							vd.getLineNumber(), vd.getCharacter());
				} catch (ScopeException se) {
					se.setColumn(vd.getCharacter());
					se.setLine(vd.getLineNumber());
					this.container.addException(se);
				}
			}
		}

		// Adding the parameters of the method
		for (FormalParameterDeclaration fpd : parameters) {
			try {
				fpd.setType(TypesUtilities.getInstance().getType(fpd.getType()));
				addVaribaleToScope(fpd.getName(), fpd.getType(),
						CoreRebecaCategoriesUtility.NORMAL_VARIABLE,
						fpd.getLineNumber(), fpd.getCharacter());
			} catch (ScopeException se) {
				se.setColumn(fpd.getCharacter());
				se.setLine(fpd.getLineNumber());
				this.container.addException(se);
			} catch (CodeCompilationException cce) {
				cce.setColumn(fpd.getCharacter());
				cce.setLine(fpd.getLineNumber());
				this.container.addException(cce);
			}
		}

		// The type of the return value of the method is the last element of the
		// base scope which identified by "return" as its name.
		try {
			addVaribaleToScope(RETURN_VALUE_KEY_IN_SCOPE, returnType,
					null, 0, 0);
		} catch (ScopeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void pushActivationRecord() {
		variablesScope
				.push(new HashMap<String, Pair<Pair<Type, Category>, Pair<Integer, Integer>>>());
	}

	public void pushActivationRecord(Type owner) {
		pushActivationRecord();
		Pair<Pair<Type, Category>, Pair<Integer, Integer>> data = 
				new Pair<Pair<Type, Category>, Pair<Integer, Integer>>(
				new Pair<Type, Category>(owner, null), new Pair<Integer, Integer>(0, 0));
		variablesScope.peek().put(SCOPE_OWNER_TYPE_KEY, data);
	}

	public void popActivationRecord() {
		variablesScope.pop();
	}

	public void addVaribaleToScope(String variableName, Type type, Category category, 
			int lineNumber, int column) throws ScopeException {
		Pair<Pair<Type, Category>, Pair<Integer, Integer>> info = null;
		try {
			info = retreiveVariableCompleteInfoFromScope(variableName);
		} catch (ScopeException se) {
			Pair<Pair<Type, Category>, Pair<Integer, Integer>> data;
			try {
				type = TypesUtilities.getInstance().getType(type);
				data = new Pair<Pair<Type, Category>, Pair<Integer, Integer>>(
						new Pair<Type, Category>(type, category),
						new Pair<Integer, Integer>(lineNumber, column));
			} catch (CodeCompilationException e) {
				throw new ScopeException("Unknown type " + TypesUtilities.getTypeName(type), 0, 0);
			}
			variablesScope.peek().put(variableName, data);
			return;
		}
		String exceptionMessage;
		if (reservedVariables.containsKey(variableName)
				|| info.getSecond().getFirst().intValue() == 0) {
			exceptionMessage = variableName + " is a reserved word";
		} else {
			exceptionMessage = "Redeclaration of \""
					+ TypesUtilities.getTypeName(type) + " " + variableName
					+ "\", it previously declared in line "
					+ info.getSecond().getFirst() + " column "
					+ info.getSecond().getSecond();
		}
		throw new ScopeException(exceptionMessage, 0, 0);
	}

	public void addMethodIntoMethodDictionary(String reactiveClassName,
			MethodDeclaration methodDecleration, Type type, Category category,
			ExceptionContainer container) {
		String name = reactiveClassName + METHOD_SIGNATURE_SEPERATOR
				+ methodDecleration.getName();
		LinkedList<Pair<LinkedList<Type>, Pair<Type, Category>>> signatures = methods.get(name);
		if (signatures == null) {
			signatures = new LinkedList<Pair<LinkedList<Type>, Pair<Type, Category>>>();
			methods.put(name, signatures);
		}

		LinkedList<Type> newMethodArguments = new LinkedList<Type>();
		for (FormalParameterDeclaration fpd : methodDecleration
				.getFormalParameters()) {
			try {
				Type fpType = fpd.getType();
				if (fpType instanceof ArrayType) {
					((ArrayType) fpType)
							.setPrimitiveType((PrimitiveType) TypesUtilities
									.getInstance().getType(
											((ArrayType) fpType)
													.getPrimitiveType()));
				} else {
					fpType = TypesUtilities.getInstance().getType(fpType);
				}
				newMethodArguments.add(fpType);
			} catch (CodeCompilationException cce) {
				cce.setColumn(fpd.getCharacter());
				cce.setLine(fpd.getLineNumber());
				container.addException(cce);
				newMethodArguments.add(TypesUtilities.UNKNOWN_TYPE);
				continue;
			}
		}
		try {
			findExactMatch(name, newMethodArguments);
			String exceptionMessage = "Duplicate method "
					+ convertMethodArgumentsToString(newMethodArguments);
			exceptionMessage += " in reactive class " + reactiveClassName;
			container.addException(new ScopeException(exceptionMessage,
					methodDecleration.getLineNumber(), methodDecleration
							.getCharacter()));
		} catch (ScopeException e) {
			signatures.add(new Pair<LinkedList<Type>, Pair<Type, Category>>(newMethodArguments,
					new Pair<Type, Category>(type, category)));
		}
	}

	public Pair<Type, Category> retreiveMethodReturnTypeFromScope(String reactiveClassName,
			String methodName, List<Expression> parameters)
			throws ScopeException {
		String methodCanonicalName = reactiveClassName
				+ METHOD_SIGNATURE_SEPERATOR + methodName;
		LinkedList<Type> types = new LinkedList<Type>();
		for (Expression expression : parameters) {
			types.add(expression.getType());
		}
		Pair<LinkedList<Type>, Pair<Type, Category>> match;
		try {
			match = findExactMatch(methodCanonicalName, types);
		} catch (ScopeException ce) {
			match = findCastableMatch(methodCanonicalName, types);
		}
		return match.getSecond();
	}

	public Pair<Type, Category> retreiveMethodReturnTypeFromScope(String methodName,
			List<Expression> parameters) throws ScopeException {
		try {
			return retreiveMethodReturnTypeFromScope(
					onTopOfStackReactiveClass.getName(), methodName, parameters);
		} catch (ScopeException se) {
			// The requested method could be one of the predefined methods
			return retreiveMethodReturnTypeFromScope("", methodName, parameters);
		}
	}

	// Returns the specification of method in case of the names of the methods
	// and their parameters are exactly the same
	public Pair<LinkedList<Type>, Pair<Type, Category>> findExactMatch(
			String methodCanonicalName, List<Type> lookFor)
			throws ScopeException {
		return matchFinder(methodCanonicalName, lookFor, TypesUtilities
				.getInstance().getExactComparator());
	}

	// Returns the specification of method in case of the names of the methods
	// are the same and the parameters of lookFor list can be casted to one of
	// the arguments

	public Pair<LinkedList<Type>, Pair<Type, Category>> findCastableMatch(
			String methodCanonicalName, List<Type> lookFor)
			throws ScopeException {
		return matchFinder(methodCanonicalName, lookFor, TypesUtilities
				.getInstance().getCastableComparator());
	}

	private Pair<LinkedList<Type>, Pair<Type, Category>> matchFinder(
			String methodCanonicalName, List<Type> lookFor,
			Comparator<Type> comp) throws ScopeException {
		LinkedList<Pair<LinkedList<Type>, Pair<Type, Category>>> signatures = methods
				.get(methodCanonicalName);
		String[] parts = methodCanonicalName.split("\\"
				+ METHOD_SIGNATURE_SEPERATOR);

		Pair<LinkedList<Type>, Pair<Type, Category>> foundSignature = null;
		if (signatures != null) {
			for (Pair<LinkedList<Type>, Pair<Type, Category>> signature : signatures) {
				if (TypesUtilities.areTheSame(lookFor, signature.getFirst(),
						comp)) {
					if (foundSignature == null) {
						foundSignature = signature;
					} else {
						throw new ScopeException("The method "
								+ parts[1]
								+ convertMethodArgumentsToString(lookFor)
								+ " is ambiguous"
								+ (parts[0].equals("") ? "" : " for the type "
										+ parts[0]), 0, 0);
					}
				}
			}
		}
		if (foundSignature != null)
			return foundSignature;
		throw new ScopeException("The method "
				+ parts[1]
				+ convertMethodArgumentsToString(lookFor)
				+ " is undefined"
				+ ((parts[0].equals("") || (parts[0].equals(TypesUtilities
						.getTypeName(TypesUtilities.UNKNOWN_TYPE)))) ? ""
						: " for the type " + parts[0]), 0, 0);
	}

	private Pair<Pair<Type, Category>, Pair<Integer, Integer>> retreiveVariableCompleteInfoFromScope(
			String variableName) throws ScopeException {
		for (int cnt = 0; cnt < variablesScope.size(); cnt++) {
			HashMap<String, Pair<Pair<Type, Category>, Pair<Integer, Integer>>> ar = variablesScope
					.get(cnt);
			if (ar.containsKey(variableName))
				return ar.get(variableName);
		}
		throw new ScopeException("\"" + variableName + "\" undeclared", 0, 0);
	}

	public Pair<Type, Category> retreiveVariableTypeFromScope(String variableName)
			throws ScopeException {
		return retreiveVariableCompleteInfoFromScope(variableName).getFirst();
	}

	public Pair<Type, Category> retreiveVariableTypeFromCurrentActivationRecord(
			String variableName) throws ScopeException {
		if (variablesScope.peek().containsKey(variableName))
			return variablesScope.peek().get(variableName).getFirst();
		throw new ScopeException("\"" + variableName + "\" undeclared", 0, 0);
	}

	// In some cases like "continue" in a loop, the owner of one of the scopes
	// should be loop statement. otherwise the "continue" statement is reported
	// as an invalid statement.
	public boolean ownerExistsInScope(Type owner) {
		for (int cnt = 0; cnt < variablesScope.size(); cnt++) {
			HashMap<String, Pair<Pair<Type, Category>, Pair<Integer, Integer>>> ar = variablesScope
					.get(cnt);
			if (ar.containsKey(SCOPE_OWNER_TYPE_KEY))
				if (ar.get(SCOPE_OWNER_TYPE_KEY).getFirst().getFirst() == owner)
					return true;
		}
		return false;
	}

	private static String convertMethodArgumentsToString(List<Type> arguments) {
		String retValue = "(";
		for (Type type : arguments) {
			retValue += TypesUtilities.getTypeName(type) + ", ";
		}
		if (retValue.length() != 1)
			retValue = retValue.substring(0, retValue.length() - 2);
		retValue += ")";
		return retValue;
	}

	public static Pair<LinkedList<Type>, Type> createSignatureSegment(
			Type returnType, Type... arguments) {
		LinkedList<Type> argumentsList = new LinkedList<Type>();
		for (Type type : arguments)
			argumentsList.add(type);
		return new Pair<LinkedList<Type>, Type>(argumentsList, returnType);
	}

	public class ScopeException extends CodeCompilationException {

		private static final long serialVersionUID = 1L;

		public ScopeException(String message, int line, int column) {
			super(message, line, column);
		}

	}
}
