package org.rebecalang.compiler.modelcompiler.corerebeca.statementsemanticchecker.expression;

import java.util.LinkedList;
import java.util.List;

import org.rebecalang.compiler.modelcompiler.ExpressionSemanticCheckContainer;
import org.rebecalang.compiler.modelcompiler.ScopeHandler.VariableInScopeSpecifier;
import org.rebecalang.compiler.modelcompiler.SymbolTable;
import org.rebecalang.compiler.modelcompiler.SymbolTable.MethodInSymbolTableSpecifier;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractExpressionSemanticCheck;
import org.rebecalang.compiler.modelcompiler.abstractrebeca.AbstractTypeSystem;
import org.rebecalang.compiler.modelcompiler.SymbolTableException;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaCompleteCompilerFacade;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaLabelUtility;
import org.rebecalang.compiler.modelcompiler.corerebeca.CoreRebecaTypeSystem;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.AccessModifier;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.GenericTypeInstance;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.OrdinaryPrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ReactiveClassDeclaration;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.utils.AccessControlException;
import org.rebecalang.compiler.utils.AccessModifierUtilities;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("CORE_PRIMARY")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class PrimaryTermExpressionSemanticCheck extends AbstractExpressionSemanticCheck {

	AbstractTypeSystem typeSystem;

	protected ExpressionSemanticCheckContainer expressionSemanticCheckContainer;

	@Autowired
	public PrimaryTermExpressionSemanticCheck(AbstractTypeSystem typeSystem,
			ExpressionSemanticCheckContainer expressionSemanticCheckContainer) {
		this.typeSystem = typeSystem;
		this.expressionSemanticCheckContainer = expressionSemanticCheckContainer;
	}

	@Override
	public Pair<Type, Object> check(Expression expression, Type baseType) {
		Pair<Type, Object> returnValue = new Pair<Type, Object>(
				AbstractTypeSystem.UNKNOWN_TYPE, AbstractExpressionSemanticCheck.NO_VALUE);
		
		TermPrimary termPrimary = (TermPrimary) expression;
		String termName = termPrimary.getName();
		try {
			if (!isFunctionCall(termPrimary)) {
				// The term specifies access to a variable
				if (baseType == AbstractTypeSystem.NO_TYPE) {

					VariableInScopeSpecifier variableInScopeSpecifier = scopeHandler
							.retreiveVariableFromScope(termName);
					termPrimary.setLabel(variableInScopeSpecifier.getLabel());
					returnValue.setFirst(variableInScopeSpecifier.getType());
					termPrimary.setType(variableInScopeSpecifier.getType());
					Object value = variableInScopeSpecifier.getPrecompilationValue();
					returnValue.setSecond(value);
				} else {
					Type curType = baseType;
					Type symbolType = null;
					while (curType != null) {
						symbolType = symbolTable.getSymbolType(curType, termName);
						if (symbolType != null) break;
						ReactiveClassDeclaration rcd = (ReactiveClassDeclaration)typeSystem.getMetaData(curType);
						curType = rcd.getExtends();
					}
					if (symbolType == null) {
						if (baseType != AbstractTypeSystem.UNKNOWN_TYPE)
							exceptionContainer.addException(new CodeCompilationException(
									"Undefiend variable " + termName + " in the type "
											+ baseType.getTypeName(),
											termPrimary.getLineNumber(), termPrimary.getCharacter()));
					} else {
						VariableInScopeSpecifier owner = scopeHandler
								.retreiveVariableFromScope(CoreRebecaCompleteCompilerFacade.OWNER_REACTIVE_CLASS_KEY);
						AccessModifier accessModifier = symbolTable.getSymbolAccessModifier(baseType, termName);
						returnValue.setFirst(symbolType);
						termPrimary.setType(symbolType);
						if (accessModifier != AccessModifierUtilities.PUBLIC) {
							if (baseType != owner.getType())
								exceptionContainer.addException(new AccessControlException(
										"Invalid access to the variable " + termName + " of the type "
												+ baseType.getTypeName(),
												termPrimary.getLineNumber(), termPrimary.getCharacter()));
						}
					}
				}
			} else {
				// Term specifies method call (synch method or message server)
				boolean hasUnknownType = false;
				List<Type> argumentTypes = new LinkedList<Type>();
				for (Expression expr : termPrimary.getParentSuffixPrimary().getArguments()) {
					Type argumentType = expressionSemanticCheckContainer.check(expr).getFirst();
					argumentTypes.add(argumentType);
					if (argumentType == AbstractTypeSystem.UNKNOWN_TYPE)
						hasUnknownType = true;
				}
				if (hasUnknownType)
					return returnValue;
				///
				MethodInSymbolTableSpecifier methodInSymbolTableSpecifier = null;
				if (baseType == AbstractTypeSystem.NO_TYPE) {
					Type selfType = scopeHandler.retreiveVariableFromScope("self").getType();
					try {
						// methodInSymbolTableSpecifier = symbolTable.getMethodSpecification(selfType,
						// termName, argumentTypes);
						methodInSymbolTableSpecifier = checkMethodInParents(selfType, termName, argumentTypes);

					} catch (SymbolTableException se) {
					
						methodInSymbolTableSpecifier = 
								symbolTable.getCastableMethodSpecification(AbstractTypeSystem.NO_TYPE, termName, argumentTypes);
					}
				} else {
						methodInSymbolTableSpecifier = checkMethodInParents(baseType, termName, argumentTypes);

				}
				if (methodInSymbolTableSpecifier.getLabel() == CoreRebecaLabelUtility.CONSTRUCTOR) {
					exceptionContainer.addException(new CodeCompilationException(
							"The method " + termName + SymbolTable.convertMethodArgumentsToString(argumentTypes)
							+ " is undefined"
							+ (baseType == null || baseType == AbstractTypeSystem.NO_TYPE ? ""
									: " for the type " + baseType.getTypeName()),
							termPrimary.getLineNumber(), termPrimary.getCharacter()));
				}
				termPrimary.setLabel(methodInSymbolTableSpecifier.getLabel());
				returnValue.setFirst(methodInSymbolTableSpecifier.getReturnValue());
				termPrimary.setType(methodInSymbolTableSpecifier.getReturnValue());
			}
			if (!termPrimary.getIndices().isEmpty()) {
				if (!(returnValue.getFirst() instanceof ArrayType)) {
					ArrayType arrayType = new ArrayType();
					arrayType.setOrdinaryPrimitiveType((OrdinaryPrimitiveType) returnValue.getFirst());
					arrayType.getDimensions().add(0);
					TypesUtilities.addTypeMismatchException(exceptionContainer, returnValue.getFirst(), arrayType,
							termPrimary);
					return returnValue;
				}
				ArrayType foundTypeInArray = (ArrayType) returnValue.getFirst();
				if (termPrimary.getIndices().size() > foundTypeInArray.getDimensions().size()) {
					ArrayType arrayType = new ArrayType();
					arrayType.setOrdinaryPrimitiveType(foundTypeInArray.getOrdinaryPrimitiveType());
					for (int cnt = 0; cnt < termPrimary.getIndices().size(); cnt++)
						arrayType.getDimensions().add(0);
					TypesUtilities.addTypeMismatchException(exceptionContainer, returnValue.getFirst(), arrayType,
							termPrimary);
					return returnValue;
				}

				for (Expression expr : termPrimary.getIndices()) {
					Type type = expressionSemanticCheckContainer.check(expr).getFirst();
					if (!type.canTypeCastTo(CoreRebecaTypeSystem.INT_TYPE)) {
						TypesUtilities.addTypeMismatchException(exceptionContainer, type, CoreRebecaTypeSystem.INT_TYPE,
								termPrimary);
						return returnValue;
					}
				}
				if (termPrimary.getIndices().size() == foundTypeInArray.getDimensions().size()) {
					returnValue.setFirst(foundTypeInArray.getOrdinaryPrimitiveType());
				} else {
					ArrayType arrayType = new ArrayType();
					arrayType.setOrdinaryPrimitiveType(foundTypeInArray.getOrdinaryPrimitiveType());
					for (int cnt = 0; cnt < foundTypeInArray.getDimensions().size()
							- termPrimary.getIndices().size(); cnt++)
						arrayType.getDimensions().add(foundTypeInArray.getDimensions().get(cnt));
					returnValue.setFirst(arrayType);
				}

			}
		} catch (CodeCompilationException cce) {
			cce.setColumn(termPrimary.getCharacter());
			cce.setLine(termPrimary.getLineNumber());
			exceptionContainer.addException(cce);
		}

		return returnValue;
	}

	protected boolean isFunctionCall(TermPrimary termPrimary) {
		return termPrimary.getParentSuffixPrimary() != null;
	}


	private MethodInSymbolTableSpecifier checkMethodInParents (Type type, String termName, List<Type> argumentTypes) throws CodeCompilationException {

		Type lookupBaseType = type;
		MethodInSymbolTableSpecifier methodInSymbolTableSpecifier = null;
		if (lookupBaseType instanceof GenericTypeInstance) {
			lookupBaseType = ((GenericTypeInstance) lookupBaseType).getBase();
		}
		while(true) {
			try {
				methodInSymbolTableSpecifier = symbolTable.getCastableMethodSpecification(lookupBaseType, termName, argumentTypes);
				// TODO this code only works for GenericType with 1 parameters
				if ( methodInSymbolTableSpecifier.getReturnValue() == AbstractTypeSystem.UNKNOWN_TYPE )
					methodInSymbolTableSpecifier.setReturnValue(((GenericTypeInstance) type).getParameters().get(0));
				return methodInSymbolTableSpecifier;
			}
			catch(SymbolTableException ste) {
				ReactiveClassDeclaration rcd = (ReactiveClassDeclaration)typeSystem.getMetaData(lookupBaseType);

				if (rcd.getExtends() == null)
					throw ste;
				lookupBaseType = rcd.getExtends();
			}


		} 	
	}
}
