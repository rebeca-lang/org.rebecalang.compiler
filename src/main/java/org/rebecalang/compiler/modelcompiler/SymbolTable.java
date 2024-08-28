package org.rebecalang.compiler.modelcompiler;

import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.*;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.TypesUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class SymbolTable {

    @Autowired
    ExceptionContainer exceptionContainer;

    private Hashtable<Type, Hashtable<String, FieldDeclaration>> variablesSymbolTable;
    private HashMap<Type, Hashtable<String, LinkedList<MethodInSymbolTableSpecifier>>> methodsSymbolTable;

    public SymbolTable() {
        this.clear();
    }

    public void clear() {
        this.variablesSymbolTable = new Hashtable<Type, Hashtable<String, FieldDeclaration>>();
        this.methodsSymbolTable = new HashMap<Type, Hashtable<String, LinkedList<MethodInSymbolTableSpecifier>>>();
    }

    public Hashtable<Type, Hashtable<String, FieldDeclaration>> getVariableSymbolTable() {
        return variablesSymbolTable;
    }

    public HashMap<Type, Hashtable<String, LinkedList<MethodInSymbolTableSpecifier>>> getmethodSymbolTable() {
        return methodsSymbolTable;
    }

    public void addVarible(Type container, FieldDeclaration fieldDeclaration) {
        if (container == null)
            container = AbstractTypeSystem.NO_TYPE;
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
            container = AbstractTypeSystem.NO_TYPE;
        Hashtable<String, FieldDeclaration> fieldDeclarations = variablesSymbolTable.get(container);
        FieldDeclaration retValue = null;
        if (fieldDeclarations != null) {
            retValue = fieldDeclarations.get(symbolName);
        }
        return retValue;
    }

    public void addMethod(Type container,
                          MethodDeclaration methodDecleration, Label label) {
        if (container == null)
            container = AbstractTypeSystem.NO_TYPE;
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
//			try {
            Type fpType = fpd.getType();
//				if (fpType instanceof ArrayType) {
//					((ArrayType) fpType)
//							.setOrdinaryPrimitiveType((OrdinaryPrimitiveType) typeSystem.getType(
//											((ArrayType) fpType)
//													.getOrdinaryPrimitiveType()));
//				} else {
//					fpType = typeSystem.getType(fpType);
//				}
            newMethodArguments.add(fpType);
//			} catch (CodeCompilationException cce) {
//				cce.setColumn(fpd.getCharacter());
//				cce.setLine(fpd.getLineNumber());
//				exceptionContainer.addException(cce);
//				newMethodArguments.add(AbstractTypeSystem.UNKNOWN_TYPE);
//				continue;
//			}
        }
        try {
            MethodInSymbolTableSpecifier foundExactMatch = findExactMatch(signatures, newMethodArguments);
            if (foundExactMatch == null) {
                Type type = AbstractTypeSystem.NO_TYPE;
                if (label == CoreRebecaLabelUtility.MSGSRV)
                    type = AbstractTypeSystem.MSGSRV_TYPE;
                else if (label == CoreRebecaLabelUtility.SYNCH_METHOD ||
                        label == CoreRebecaLabelUtility.BUILT_IN_METHOD)
                    type = ((SynchMethodDeclaration) methodDecleration).getReturnType();
                List<String> paramsName = new LinkedList<String>();
                for (FormalParameterDeclaration parameterDeclaration : methodDecleration.getFormalParameters()) {
                    paramsName.add(parameterDeclaration.getName());
                }
                MethodInSymbolTableSpecifier newMethod =
                        new MethodInSymbolTableSpecifier(methodDecleration.getName(),
                                label, type, newMethodArguments, paramsName);
                signatures.add(newMethod);
            } else {
                String exceptionMessage = "Duplicate method " + methodDecleration.getName()
                        + convertMethodArgumentsToString(newMethodArguments);
                exceptionMessage += " in reactive class " + container.getTypeName();
                exceptionContainer.addException(new SymbolTableException(exceptionMessage,
                        methodDecleration.getLineNumber(), methodDecleration
                        .getCharacter()));
            }
        } catch (SymbolTableException e) {
            String exceptionMessage = "Duplicate method " + methodDecleration.getName()
                    + convertMethodArgumentsToString(newMethodArguments);
            exceptionMessage += " in reactive class " + container.getTypeName();
            exceptionContainer.addException(new SymbolTableException(exceptionMessage,
                    methodDecleration.getLineNumber(), methodDecleration
                    .getCharacter()));
        }
    }


    // Returns the specification of method in case of the names of the methods
    // and their parameters are exactly the same
    private MethodInSymbolTableSpecifier findExactMatch(
            List<MethodInSymbolTableSpecifier> candidates, List<Type> lookFor) throws SymbolTableException {
        return matchFinder(candidates, lookFor, Type.getExactComparator());
    }

    /* Returns the specification of method in case of the names of the methods
     * are the same and the parameters of lookFor list can be casted to one of
     * the arguments
     */
    public MethodInSymbolTableSpecifier findCastableMatch(
            List<MethodInSymbolTableSpecifier> candidates, List<Type> lookFor) throws SymbolTableException {
        return matchFinder(candidates, lookFor, Type.getCastableComparator());
    }

    private MethodInSymbolTableSpecifier matchFinder(
            List<MethodInSymbolTableSpecifier> candidates, List<Type> lookFor,
            Comparator<Type> comp) throws SymbolTableException {

        MethodInSymbolTableSpecifier foundSignature = null;
        if (!candidates.isEmpty()) {
            for (MethodInSymbolTableSpecifier signature : candidates) {
                if (TypesUtilities.areTheSame(lookFor, signature.getArgumentsTypes(),
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
            retValue += type.getTypeName() + ", ";
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
        private List<Type> argumentsTypes;
        private List<String> argumentsNames;
        private Type rebecType;

        public MethodInSymbolTableSpecifier(String name, Label label,
                                            Type returnValue, List<Type> arguments, List<String> argumentsNames) {
            super();
            this.name = name;
            this.label = label;
            this.returnValue = returnValue;
            this.argumentsTypes = arguments;
            this.setArgumentsNames(argumentsNames);
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

        public List<Type> getArgumentsTypes() {
            return argumentsTypes;
        }

        public void setArguments(LinkedList<Type> arguments) {
            this.argumentsTypes = arguments;
        }

        public List<String> getArgumentsNames() {
            return argumentsNames;
        }

        public void setArgumentsNames(List<String> argumentsNames) {
            this.argumentsNames = argumentsNames;
        }
        
        public Type getRebecType() { return rebecType; }

        public void setRebecType(Type rebecType) { this.rebecType = rebecType; }
    }

    public MethodInSymbolTableSpecifier getCastableMethodSpecification(Type type, String methodName,
                                                                       List<Type> argumentsTypes) throws SymbolTableException {

        Hashtable<String, LinkedList<MethodInSymbolTableSpecifier>> methods = methodsSymbolTable.get(type);
        if (methods == null)
            throw new SymbolTableException("The type " + type.getTypeName() +
                    " is not registered in the symbol table", 0, 0);
        List<MethodInSymbolTableSpecifier> methodInSymbolTableSpecifiers = methods.get(methodName);
        if (methodInSymbolTableSpecifiers == null)
            throw new SymbolTableException("The method " + methodName +
                    convertMethodArgumentsToString(argumentsTypes) +
                    " is undefined" +
                    (type == null || type == AbstractTypeSystem.NO_TYPE ? "" :
                            " for the type " + type.getTypeName()), 0, 0);
        MethodInSymbolTableSpecifier foundMatch = findCastableMatch(methodInSymbolTableSpecifiers, argumentsTypes);
        if (foundMatch == null)
            throw new SymbolTableException("The method " + methodName +
                    convertMethodArgumentsToString(argumentsTypes) +
                    " is undefined" +
                    (type == null || type == AbstractTypeSystem.NO_TYPE ? "" :
                            " for the type " + type.getTypeName()), 0, 0);
        foundMatch.setRebecType(type);
        return foundMatch;
    }

    public MethodInSymbolTableSpecifier getExactMethodSpecification(Type type, String methodName,
                                                                    List<Type> argumentsTypes) throws SymbolTableException {
        Hashtable<String, LinkedList<MethodInSymbolTableSpecifier>> methods = methodsSymbolTable.get(type);

        if (methods == null)
            throw new SymbolTableException("The type " + type.getTypeName() +
                    " is not registered in the symbol table", 0, 0);
        List<MethodInSymbolTableSpecifier> methodInSymbolTableSpecifiers = methods.get(methodName);
        if (methodInSymbolTableSpecifiers == null)
            throw new SymbolTableException("The method " + methodName +
                    convertMethodArgumentsToString(argumentsTypes) +
                    " is undefined" +
                    (type == null || type == AbstractTypeSystem.NO_TYPE ? "" :
                            " for the type " + type.getTypeName()), 0, 0);
        MethodInSymbolTableSpecifier foundMatch = findExactMatch(methodInSymbolTableSpecifiers, argumentsTypes);
        if (foundMatch == null)
            throw new SymbolTableException("The method " + methodName +
                    convertMethodArgumentsToString(argumentsTypes) +
                    " is undefined" +
                    (type == null || type == AbstractTypeSystem.NO_TYPE ? "" :
                            " for the type " + type.getTypeName()), 0, 0);
        return foundMatch;
    }
}
