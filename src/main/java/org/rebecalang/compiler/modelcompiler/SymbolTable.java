package org.rebecalang.compiler.modelcompiler;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.AccessModifier;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FieldDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.FormalParameterDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Label;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.MethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.SynchMethodDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.VariableDeclarator;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.TypesUtilities;

public class SymbolTable {
	private Hashtable<Type, Hashtable<String, FieldDeclaration>> variablesSymbolTable;
	private HashMap<Type, Hashtable<String, LinkedList<MethodInSymbolTableSpecifier>>> methodsSymbolTable;

	public SymbolTable() {
		this.variablesSymbolTable = new Hashtable<Type, Hashtable<String, FieldDeclaration>>();
		this.methodsSymbolTable = new HashMap<Type, Hashtable<String, LinkedList<MethodInSymbolTableSpecifier>>>();
	}
	
	public void addVarible(Type container, FieldDeclaration fieldDeclaration) {
		if (container == null)
			container = TypesUtilities.NO_TYPE;
		Hashtable<String, FieldDeclaration> fieldDeclarations = variablesSymbolTable.get(container);
		if (fieldDeclarations == null) {
			fieldDeclarations = new Hashtable<String, FieldDeclaration>();
			variablesSymbolTable.put(container, fieldDeclarations);
		}
		for (VariableDeclarator variableDeclarator : fieldDeclaration.getVariableDeclarators())
			fieldDeclarations.put(variableDeclarator.getVariableName(), fieldDeclaration);
	}
	
	public Type getSymbolType(Type container, String symbolName) {
		FieldDeclaration symbolMetadata = getSymbolMetadata(container, symbolName);
		return symbolMetadata == null ? null : symbolMetadata.getType();
	}
	
	public AccessModifier getSymbolAccessModifier(Type container, String symbolName) {
		FieldDeclaration symbolMetadata = getSymbolMetadata(container, symbolName);
		return symbolMetadata == null ? null : symbolMetadata.getAccessModifier();
	}

	public void updateAccesModifier(Type container, String symbolName, AccessModifier newAccessModifier) {
		FieldDeclaration symbolMetadata = getSymbolMetadata(container, symbolName);
		symbolMetadata.setAccessModifier(newAccessModifier);
	}
	
	private FieldDeclaration getSymbolMetadata(Type container, String symbolName) {
		if (container == null)
			container = TypesUtilities.NO_TYPE;
		Hashtable<String, FieldDeclaration> fieldDeclarations = variablesSymbolTable.get(container);
		FieldDeclaration retValue = null;
		if (fieldDeclarations != null) {
			retValue = fieldDeclarations.get(symbolName);
		}
		return retValue;
	}
	
	public void addMethod(Type container,
			MethodDeclaration methodDecleration, Label label) throws ExceptionContainer {
		ExceptionContainer exceptionContainer = new ExceptionContainer();
		if (container == null)
			container = TypesUtilities.NO_TYPE;
		Hashtable<String, LinkedList<MethodInSymbolTableSpecifier>> methods = methodsSymbolTable.get(container);
		if (methods == null) {
			methods = new Hashtable<String, LinkedList<MethodInSymbolTableSpecifier>>();
			methodsSymbolTable.put(container, methods);
		}
		
		LinkedList<MethodInSymbolTableSpecifier> signatures = methods.get(methodDecleration.getName());
		if (signatures == null) {
			signatures = new LinkedList<MethodInSymbolTableSpecifier>();
			methods.put(methodDecleration.getName(), signatures);
		}
		LinkedList<Type> newMethodArguments = new LinkedList<Type>();
		for (FormalParameterDeclaration fpd : methodDecleration
				.getFormalParameters()) {
			try {
				Type fpType = fpd.getType();
				if (fpType instanceof ArrayType) {
					((ArrayType) fpType)
							.setOrdinaryPrimitiveType((OrdinaryPrimitiveType) TypesUtilities
									.getInstance().getType(
											((ArrayType) fpType)
													.getOrdinaryPrimitiveType()));
				} else {
					fpType = TypesUtilities.getInstance().getType(fpType);
				}
				newMethodArguments.add(fpType);
			} catch (CodeCompilationException cce) {
				cce.setColumn(fpd.getCharacter());
				cce.setLine(fpd.getLineNumber());
				exceptionContainer.addException(cce);
				newMethodArguments.add(TypesUtilities.UNKNOWN_TYPE);
				continue;
			}
		}
		if (!exceptionContainer.getExceptions().isEmpty())
			throw exceptionContainer;
		try {
			MethodInSymbolTableSpecifier foundExactMatch = findExactMatch(signatures, newMethodArguments);
			if (foundExactMatch == null) {
				Type type = TypesUtilities.NO_TYPE;
				if ( label == CoreRebecaLabelUtility.MSGSRV ) 
					type = TypesUtilities.MSGSRV_TYPE;
				else if ( label == CoreRebecaLabelUtility.SYNCH_METHOD || 
						label == CoreRebecaLabelUtility.BUILT_IN_METHOD )
					type = ((SynchMethodDeclaration)methodDecleration).getReturnType();
				MethodInSymbolTableSpecifier newMethod = 
						new MethodInSymbolTableSpecifier(methodDecleration.getName(),
								label, type, newMethodArguments);
				signatures.add(newMethod);
			} else {
				String exceptionMessage = "Duplicate method " + methodDecleration.getName()
						+ convertMethodArgumentsToString(newMethodArguments);
				exceptionMessage += " in reactive class " + TypesUtilities.getTypeName(container);
				exceptionContainer.addException(new SymbolTableException(exceptionMessage,
						methodDecleration.getLineNumber(), methodDecleration
								.getCharacter()));
			}
		} catch (SymbolTableException e) {
			String exceptionMessage = "Duplicate method " + methodDecleration.getName()
					+ convertMethodArgumentsToString(newMethodArguments);
			exceptionMessage += " in reactive class " + TypesUtilities.getTypeName(container);
			exceptionContainer.addException(new SymbolTableException(exceptionMessage,
					methodDecleration.getLineNumber(), methodDecleration
							.getCharacter()));
		}
		if (!exceptionContainer.getExceptions().isEmpty())
			throw exceptionContainer;
	}	
	
	
	// Returns the specification of method in case of the names of the methods
	// and their parameters are exactly the same
	private MethodInSymbolTableSpecifier findExactMatch(
			List<MethodInSymbolTableSpecifier> candidates, List<Type> lookFor) throws SymbolTableException {
		return matchFinder(candidates, lookFor, TypesUtilities
				.getInstance().getExactComparator());
	}

	/* Returns the specification of method in case of the names of the methods
	 * are the same and the parameters of lookFor list can be casted to one of
	 * the arguments
	*/
	public MethodInSymbolTableSpecifier findCastableMatch(
			List<MethodInSymbolTableSpecifier> candidates, List<Type> lookFor) throws SymbolTableException {
		return matchFinder(candidates, lookFor, TypesUtilities
				.getInstance().getCastableComparator());
	}

	private MethodInSymbolTableSpecifier matchFinder(
			List<MethodInSymbolTableSpecifier> candidates, List<Type> lookFor,
			Comparator<Type> comp) throws SymbolTableException {

		MethodInSymbolTableSpecifier foundSignature = null;
		if (!candidates.isEmpty()) {
			for (MethodInSymbolTableSpecifier signature : candidates) {
				if (TypesUtilities.areTheSame(lookFor, signature.getArguments(),
						comp)) {
					if (foundSignature == null) {
						foundSignature = signature;
					} else {
						throw new SymbolTableException("ambiguity in matching", 0, 0);
					}
				}
			}
		}
		return foundSignature;
	}

	public static String convertMethodArgumentsToString(List<Type> arguments) {
		String retValue = "(";
		for (Type type : arguments) {
			retValue += TypesUtilities.getTypeName(type) + ", ";
		}
		if (retValue.length() != 1)
			retValue = retValue.substring(0, retValue.length() - 2);
		retValue += ")";
		return retValue;
	}
	
	public class MethodInSymbolTableSpecifier {
		private String name;
		private Label label;
		private Type returnValue;
		private LinkedList<Type> arguments;
		

		public MethodInSymbolTableSpecifier(String name, Label label,
				Type returnValue, LinkedList<Type> arguments) {
			super();
			this.name = name;
			this.label = label;
			this.returnValue = returnValue;
			this.arguments = arguments;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public Label getLabel() {
			return label;
		}
		public void setLabel(Label label) {
			this.label = label;
		}
		public Type getReturnValue() {
			return returnValue;
		}
		public void setReturnValue(Type returnValue) {
			this.returnValue = returnValue;
		}
		public LinkedList<Type> getArguments() {
			return arguments;
		}
		public void setArguments(LinkedList<Type> arguments) {
			this.arguments = arguments;
		}
	}

	public MethodInSymbolTableSpecifier getMethodSpecification(Type type, String methodName,
			List<Type> argumentsTypes) throws SymbolTableException {
		Hashtable<String, LinkedList<MethodInSymbolTableSpecifier>> methods = methodsSymbolTable.get(type);
		
		if (methods == null)
			throw new SymbolTableException("The type " + TypesUtilities.getTypeName(type) +
					" has not registered in the symbol table", 0, 0);
		List<MethodInSymbolTableSpecifier> methodInSymbolTableSpecifiers = methods.get(methodName);
		if (methodInSymbolTableSpecifiers == null)
			throw new SymbolTableException("The method " + methodName +
					convertMethodArgumentsToString(argumentsTypes) +
					" is undefined" +
					(type == null || type == TypesUtilities.NO_TYPE ? "" :
					" for the type " + TypesUtilities.getTypeName(type)), 0, 0);
		MethodInSymbolTableSpecifier foundMatch = findCastableMatch(methodInSymbolTableSpecifiers, argumentsTypes);
		if (foundMatch == null)
			throw new SymbolTableException("The method " + methodName +
					convertMethodArgumentsToString(argumentsTypes) +
					" is undefined" +
					(type == null || type == TypesUtilities.NO_TYPE ? "" :
					" for the type " + TypesUtilities.getTypeName(type)), 0, 0);
		return foundMatch;
	}
}
