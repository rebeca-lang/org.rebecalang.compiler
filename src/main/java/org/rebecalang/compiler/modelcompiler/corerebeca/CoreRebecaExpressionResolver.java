package org.rebecalang.compiler.modelcompiler.corerebeca;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.rebecalang.compiler.modelcompiler.ScopeHandler;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.ArrayType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.BinaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.CastExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Category;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.DotPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Expression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Literal;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.NonDetExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PlusSubExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PrimaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.PrimitiveType;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecInstantiationPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TermPrimary;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.TernaryExpression;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.Type;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.UnaryExpression;
import org.rebecalang.compiler.utils.CodeCompilationException;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.CompilerInternalErrorRuntimeException;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.ExpressionResolver;
import org.rebecalang.compiler.utils.Pair;
import org.rebecalang.compiler.utils.TypesUtilities;

public class CoreRebecaExpressionResolver extends ExpressionResolver {

	protected Type containerType;

	public void setContainerType(Type containerType) {
		this.containerType = containerType;
	}
	
	public Pair<Pair<Type, Category>, Object> evaluate(Expression expression,
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeatures,
			ExceptionContainer container) {
		Pair<Pair<Type, Category>, Object> returnValue = subEvaluator(expression, scopeHandler,
				compilerFeatures, container);
		return returnValue;
	}

	public Pair<Pair<Type, Category>, Object> subEvaluator(Expression expression,
			ScopeHandler scopeHandler, Set<CompilerFeature> compilerFeatures,
			ExceptionContainer container) {
		Pair<Pair<Type, Category>, Object> returnValue = new Pair<Pair<Type, Category>, Object>();

		if (expression instanceof TernaryExpression) {
			TernaryExpression tExpression = (TernaryExpression) expression;
			Pair<Pair<Type, Category>, Object> lType = subEvaluator(tExpression.getLeft(),
					scopeHandler, compilerFeatures, container);
			Pair<Pair<Type, Category>, Object> rType = subEvaluator(tExpression.getRight(),
					scopeHandler, compilerFeatures, container);
			Pair<Pair<Type, Category>, Object> cType = subEvaluator(tExpression.getCondition(),
					scopeHandler, compilerFeatures, container);
			// The ternary operator condition should be boolean expression
			if (!TypesUtilities.getInstance().canTypeUpCastTo(cType.getFirst().getFirst(),
					TypesUtilities.BOOLEAN_TYPE)) {
				CodeCompilationException cce = TypesUtilities
						.getTypeMismatchException(cType.getFirst().getFirst(),
								TypesUtilities.BOOLEAN_TYPE);
				cce.setLine(tExpression.getCondition().getLineNumber());
				cce.setColumn(tExpression.getCondition().getCharacter());
				container.addException(cce);
			}
			// The type of left expression of ternary operator should be the
			// same as the type of the right expression
			if (!TypesUtilities.getInstance().canTypeUpCastTo(lType.getFirst().getFirst(),
					rType.getFirst().getFirst())) {
				CodeCompilationException cce = TypesUtilities
						.getTypeMismatchException(rType.getFirst().getFirst(),
								lType.getFirst().getFirst());
				cce.setLine(tExpression.getLeft().getLineNumber());
				cce.setColumn(tExpression.getLeft().getCharacter());
				container.addException(cce);
			}
			tExpression.setType(lType.getFirst().getFirst());
			returnValue.setFirst(new Pair<Type, Category>(
					tExpression.getType(), CoreRebecaCategoriesUtility.UNKNOWN));
			if (cType.getSecond() != null) {
				if (lType.getSecond() != null && rType.getSecond() != null)
					if (((Boolean) cType.getSecond()).booleanValue()) {
						returnValue.setSecond(lType.getSecond());
					} else {
						returnValue.setSecond(rType.getSecond());
					}
			}
		} else if (expression instanceof BinaryExpression) {
			BinaryExpression bExpression = (BinaryExpression) expression;
			Pair<Pair<Type, Category>, Object> lType = subEvaluator(bExpression.getLeft(),
					scopeHandler, compilerFeatures, container);
			Pair<Pair<Type, Category>, Object> rType = subEvaluator(bExpression.getRight(),
					scopeHandler, compilerFeatures, container);
			try {
				bExpression.setType(getResultType(bExpression.getOperator(),
						lType.getFirst().getFirst(), rType.getFirst().getFirst()));
				returnValue.setFirst(new Pair<Type, Category>(
						bExpression.getType(), CoreRebecaCategoriesUtility.UNKNOWN));
				Set<String> assignmentOperators = new HashSet<String>();
				assignmentOperators.addAll(Arrays.asList("=", "+=", "-=", "*=",
						"/=", "%=", "~=", "^=", "&=", "|=", "<<=", ">>="));
				if (assignmentOperators.contains(bExpression.getOperator())
						&& !isInLValueStyle(bExpression.getLeft())) {
					container
							.getExceptions()
							.add(new CodeCompilationException(
									"The left-hand side of an assignment must be a variable",
									bExpression.getLineNumber(), bExpression
											.getCharacter()));
				}
				if (!assignmentOperators.contains(bExpression.getOperator())) {
					returnValue.setSecond(evaluateConstantTerm(
							bExpression.getOperator(), bExpression.getType(),
							lType.getSecond(), rType.getSecond()));
				}
			} catch (CodeCompilationException cce) {
				// Two types of two sides of binary operation are incompatible
				CodeCompilationException cce2 = createEvaluateExceptionMessage2(
						bExpression.getLineNumber(),
						bExpression.getCharacter(), bExpression.getOperator(),
						lType.getFirst().getFirst(), rType.getFirst().getFirst());
				if (cce2 != null)
					container.getExceptions().add(cce2);
				bExpression.setType(lType.getFirst().getFirst());
				returnValue.setFirst(new Pair<Type, Category>(
						bExpression.getType(), CoreRebecaCategoriesUtility.UNKNOWN));
			}
		} else if (expression instanceof UnaryExpression) {
			UnaryExpression uExpression = (UnaryExpression) expression;
			Pair<Pair<Type, Category>, Object> type = subEvaluator(uExpression.getExpression(),
					scopeHandler, compilerFeatures, container);
			String operator = uExpression.getOperator();
			if (operator.equals("++") || operator.equals("--")) {
				if (!TypesUtilities.getInstance().canTypeUpCastTo(
						type.getFirst().getFirst(), TypesUtilities.INT_TYPE)) {
					CodeCompilationException cce = TypesUtilities
							.getTypeMismatchException(type.getFirst().getFirst(),
									TypesUtilities.INT_TYPE);
					cce.setColumn(uExpression.getExpression().getCharacter());
					cce.setLine(uExpression.getExpression().getLineNumber());
					container.addException(cce);
				}
				if (!isInLValueStyle(uExpression.getExpression())) {
					container.getExceptions().add(
							new CodeCompilationException(
									"Invalid argument to operation ++/--",
									uExpression.getLineNumber(), uExpression
											.getCharacter()));
				}
			} else if (operator.equals("-")) {
				if (!TypesUtilities.getInstance().canTypeUpCastTo(
						type.getFirst().getFirst(), TypesUtilities.DOUBLE_TYPE)) {
					CodeCompilationException cce = TypesUtilities
							.getTypeMismatchException(type.getFirst().getFirst(),
									TypesUtilities.INT_TYPE);
					cce.setColumn(uExpression.getExpression().getCharacter());
					cce.setLine(uExpression.getExpression().getLineNumber());
					container.addException(cce);
				} else {
					if (type.getSecond() != null)
						returnValue.setSecond(evaluateConstantTerm("-",
								type.getFirst().getFirst(), 0, type.getSecond()));
				}
			} else if (operator.equals("!")) {
				if (!TypesUtilities.getInstance().canTypeUpCastTo(
						type.getFirst().getFirst(), TypesUtilities.BOOLEAN_TYPE)) {
					CodeCompilationException cce = TypesUtilities
							.getTypeMismatchException(type.getFirst().getFirst(),
									TypesUtilities.BOOLEAN_TYPE);
					cce.setColumn(uExpression.getExpression().getCharacter());
					cce.setLine(uExpression.getExpression().getLineNumber());
					container.addException(cce);
				} else {
					if (type.getSecond() != null)
						returnValue.setSecond(evaluateConstantTerm("!",
								type.getFirst().getFirst(), type.getSecond(), null));
				}
			}
			uExpression.setType(type.getFirst().getFirst());
			returnValue.setFirst(new Pair<Type, Category>(
					uExpression.getType(), CoreRebecaCategoriesUtility.UNKNOWN));
		} else if (expression instanceof CastExpression) {
			CastExpression cExpression = (CastExpression) expression;
			Pair<Pair<Type, Category>, Object> expressionType = subEvaluator(
					cExpression.getExpression(), scopeHandler,
					compilerFeatures, container);
			try {
				Type castType = TypesUtilities.getInstance().getType(
						cExpression.getType());
				if (!TypesUtilities.getInstance().canTypeCastTo(
						expressionType.getFirst().getFirst(), castType)) {
					CodeCompilationException cce = TypesUtilities
							.getTypeMismatchException(
									expressionType.getFirst().getFirst(), castType);
					cce.setColumn(cExpression.getExpression().getCharacter());
					cce.setLine(cExpression.getExpression().getLineNumber());
					container.addException(cce);
				}
				cExpression.setType(castType);
				returnValue.setFirst(new Pair<Type, Category>(
						cExpression.getType(), CoreRebecaCategoriesUtility.UNKNOWN));
				returnValue.setSecond(evaluateConstantTerm(
						"("
								+ TypesUtilities.getTypeName(returnValue
										.getFirst().getFirst()) + ")",
						returnValue.getFirst().getFirst(), expressionType.getSecond(),
						null));
			} catch (CodeCompilationException cce) {
				cExpression.setType(TypesUtilities.UNKNOWN_TYPE);
				returnValue.setFirst(new Pair<Type, Category>(
						cExpression.getType(), CoreRebecaCategoriesUtility.UNKNOWN));
				cce.setColumn(cExpression.getCharacter());
				cce.setLine(cExpression.getLineNumber());
				container.addException(cce);
			}
		} else if (expression instanceof NonDetExpression) {
			NonDetExpression ndExpression = (NonDetExpression) expression;
			// The type of the first element of the non-det expression is set as
			// the first candidate for the result type
			Type type = null;
			for (Expression ndTermExpression : ndExpression.getChoices()) {
				Pair<Pair<Type, Category>, Object> ndTerm = subEvaluator(ndTermExpression,
						scopeHandler, compilerFeatures, container);
				try {
					// The type is set to the biggest type in comparison to the
					// new choices
					type = (type == null ? ndTerm.getFirst().getFirst() : TypesUtilities
							.getInstance().getTheBiggerType(type,
									ndTerm.getFirst().getFirst()));
					if (ndTerm.getSecond() == null) {
						CodeCompilationException cce = new CodeCompilationException(
								"Non-deterministic terms must be constant expressions",
								0, 0);
						throw cce;
					}
				} catch (CodeCompilationException cce) {
					cce.setColumn(ndTermExpression.getCharacter());
					cce.setLine(ndTermExpression.getLineNumber());
					container.addException(cce);
				}
			}
			ndExpression.setType(type);
			returnValue.setFirst(new Pair<Type, Category>(
					ndExpression.getType(), CoreRebecaCategoriesUtility.UNKNOWN));
			if (ndExpression.getChoices().size() < 2) {
				CodeCompilationException cce = new CodeCompilationException(
						"Non-deterministic expression must have at least two different choices",
						ndExpression.getLineNumber(), ndExpression
								.getCharacter());
				container.addException(cce);
			}
			if (containerType != TypesUtilities.MSGSRV_TYPE) {
				CodeCompilationException cce = new CodeCompilationException(
						"Only message servers are allowed to have non-deterministic expression",
						ndExpression.getLineNumber(), ndExpression
								.getCharacter());
				container.addException(cce);
			}
		} else if (expression instanceof Literal) {
			Literal lExpression = (Literal) expression;
			if (lExpression.getType() == TypesUtilities.INT_TYPE) {
				try {
					int value = Integer.parseInt(lExpression.getLiteralValue());
					if (Byte.MIN_VALUE <= value && value <= Byte.MAX_VALUE) {
						lExpression.setType(TypesUtilities.BYTE_TYPE);
						returnValue.setSecond((byte) value);
					} else if (Short.MIN_VALUE <= value
							&& value <= Short.MAX_VALUE) {
						lExpression.setType(TypesUtilities.SHORT_TYPE);
						returnValue.setSecond((short) value);
					} else if (Integer.MIN_VALUE <= value
							&& value <= Integer.MAX_VALUE) {
						lExpression.setType(TypesUtilities.INT_TYPE);
						returnValue.setSecond(value);
					}
				} catch (NumberFormatException nfe) {
					container.getExceptions().add(
							getOutofRangeException(
									lExpression.getLiteralValue(),
									TypesUtilities.INT_TYPE,
									lExpression.getLineNumber(),
									lExpression.getCharacter()));
				}
			} else if (lExpression.getType() == TypesUtilities.DOUBLE_TYPE) {
				try {
					double value = Double.parseDouble(lExpression
							.getLiteralValue());
					returnValue.setSecond(value);
				} catch (NumberFormatException nfe) {
					container.getExceptions().add(
							getOutofRangeException(
									lExpression.getLiteralValue(),
									TypesUtilities.DOUBLE_TYPE,
									lExpression.getLineNumber(),
									lExpression.getCharacter()));
				}
			} else if (lExpression.getType() == TypesUtilities.FLOAT_TYPE) {
				try {
					float value = Float.parseFloat(lExpression
							.getLiteralValue());
					returnValue.setSecond(value);
				} catch (NumberFormatException nfe) {
					container.getExceptions().add(
							getOutofRangeException(
									lExpression.getLiteralValue(),
									TypesUtilities.FLOAT_TYPE,
									lExpression.getLineNumber(),
									lExpression.getCharacter()));
				}
			} else if (lExpression.getType() == TypesUtilities.BOOLEAN_TYPE) {
				try {
					boolean value = Boolean.parseBoolean(lExpression
							.getLiteralValue());
					returnValue.setSecond(value);
				} catch (NumberFormatException nfe) {
					container.getExceptions().add(
							getOutofRangeException(
									lExpression.getLiteralValue(),
									TypesUtilities.BOOLEAN_TYPE,
									lExpression.getLineNumber(),
									lExpression.getCharacter()));
				}
			}
			returnValue.setFirst(new Pair<Type, Category>(
					lExpression.getType(), CoreRebecaCategoriesUtility.UNKNOWN));
		} else if (expression instanceof PlusSubExpression) {
			PlusSubExpression pspExpression = (PlusSubExpression) expression;
			Type type = subEvaluator(pspExpression.getValue(), scopeHandler,
					compilerFeatures, container).getFirst().getFirst();
			if (!TypesUtilities.getInstance().canTypeUpCastTo(type,
					TypesUtilities.INT_TYPE)) {
				CodeCompilationException cce = TypesUtilities
						.getTypeMismatchException(type, TypesUtilities.INT_TYPE);
				cce.setColumn(pspExpression.getValue().getCharacter());
				cce.setLine(pspExpression.getValue().getLineNumber());
				container.addException(cce);
			}
			if (!isInLValueStyle(pspExpression.getValue())) {
				container.getExceptions().add(
						new CodeCompilationException(
								"Invalid argument to operation ++/--",
								pspExpression.getLineNumber(), pspExpression
										.getCharacter()));
			}
			pspExpression.setType(type);
			returnValue.setFirst(new Pair<Type, Category>(
					pspExpression.getType(), CoreRebecaCategoriesUtility.UNKNOWN));
		} else if (expression instanceof PrimaryExpression) {
			PrimaryExpression pExpression = (PrimaryExpression) expression;
			returnValue = evaluatePrimaryExpression(pExpression, scopeHandler,
					compilerFeatures, container);
		}
		return returnValue;
	}

	protected Type getResultType(String operator, Type lType, Type rType)
			throws CodeCompilationException {
		Type retValue = TypesUtilities.UNKNOWN_TYPE;

		// Assignment operators which are applicable for all values
		if (operator.equals("=")) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(rType, lType)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = lType;
		}

		// Arithmetic operators which are applicable for both integer and real
		// values
		Set<String> arithmeticFreeOperators = new HashSet<String>();
		arithmeticFreeOperators.addAll(Arrays.asList("+", "-", "*", "/"));
		if (arithmeticFreeOperators.contains(operator)) {
			Type biggerType = TypesUtilities.getInstance().getTheBiggerType(
					lType, rType);
			if (!TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
					TypesUtilities.DOUBLE_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			} else {
				if (TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
						TypesUtilities.INT_TYPE)) {
					retValue = TypesUtilities.INT_TYPE;
				} else {
					retValue = biggerType;
				}
			}
		}

		Set<String> arithmeticFreeAssignmentOperators = new HashSet<String>();
		arithmeticFreeAssignmentOperators.addAll(Arrays.asList("+=", "-=",
				"*=", "/="));
		if (arithmeticFreeAssignmentOperators.contains(operator)) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(rType, lType)
					|| !TypesUtilities.getInstance().canTypeUpCastTo(lType,
							TypesUtilities.DOUBLE_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = lType;
		}

		// Arithmetic operators which are applicable for only integer values
		Set<String> arithmeticIntegerOperators = new HashSet<String>();
		arithmeticIntegerOperators.addAll(Arrays.asList("%", ">>", "<<"));
		if (arithmeticIntegerOperators.contains(operator)) {
			Type biggerType = TypesUtilities.getInstance().getTheBiggerType(
					lType, rType);
			if (!TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
					TypesUtilities.INT_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = biggerType;
		}

		Set<String> arithmeticIntegerAssignmentOperators = new HashSet<String>();
		arithmeticIntegerAssignmentOperators.addAll(Arrays.asList(">>=", "<<=",
				"%="));
		if (arithmeticIntegerAssignmentOperators.contains(operator)) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(rType, lType)
					|| !TypesUtilities.getInstance().canTypeUpCastTo(lType,
							TypesUtilities.INT_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = lType;
		}

		// Bitwise operators which are applicable for both integer and boolean
		// values
		Set<String> bitwiseOperators = new HashSet<String>();
		bitwiseOperators.addAll(Arrays.asList("|", "&", "^", "~"));
		if (bitwiseOperators.contains(operator)) {
			Type biggerType = TypesUtilities.getInstance().getTheBiggerType(
					lType, rType);
			if (!TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
					TypesUtilities.INT_TYPE)
					&& !TypesUtilities.getInstance().canTypeUpCastTo(
							biggerType, TypesUtilities.BOOLEAN_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = biggerType;
		}

		Set<String> bitwiseAssignmentOperators = new HashSet<String>();
		bitwiseAssignmentOperators
				.addAll(Arrays.asList("|=", "&=", "^=", "~="));
		if (bitwiseAssignmentOperators.contains(operator)) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(rType, lType)
					|| (!TypesUtilities.getInstance().canTypeUpCastTo(lType,
							TypesUtilities.INT_TYPE) && !TypesUtilities
							.getInstance().canTypeUpCastTo(lType,
									TypesUtilities.BOOLEAN_TYPE))) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = lType;
		}

		// relational operators which are applicable for both integer and real
		// values
		Set<String> relationalOperators = new HashSet<String>();
		relationalOperators.addAll(Arrays.asList("<", ">", "<=", ">="));
		if (relationalOperators.contains(operator)) {
			Type biggerType = TypesUtilities.getInstance().getTheBiggerType(
					lType, rType);
			if (!TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
					TypesUtilities.DOUBLE_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = TypesUtilities.BOOLEAN_TYPE;
		}

		// relational operators which are applicable for integer, real, boolean,
		// and reactive classes values
		Set<String> relationalEQOperators = new HashSet<String>();
		relationalEQOperators.addAll(Arrays.asList("==", "!="));
		if (relationalEQOperators.contains(operator)) {
			Type biggerType = TypesUtilities.getInstance().getTheBiggerType(
					lType, rType);
			if (!TypesUtilities.getInstance().canTypeUpCastTo(biggerType,
					TypesUtilities.DOUBLE_TYPE)
					&& !TypesUtilities.getInstance().canTypeUpCastTo(
							biggerType, TypesUtilities.BOOLEAN_TYPE)
					&& !TypesUtilities.getInstance().canTypeUpCastTo(
							biggerType, TypesUtilities.REACTIVE_CLASS_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = TypesUtilities.BOOLEAN_TYPE;
		}

		// logical operators which are applicable for integer, real, boolean,
		// and reactive classes values
		Set<String> logicalOperators = new HashSet<String>();
		logicalOperators.addAll(Arrays.asList("&&", "||"));
		if (logicalOperators.contains(operator)) {
			if (!TypesUtilities.getInstance().canTypeUpCastTo(lType,
					TypesUtilities.BOOLEAN_TYPE)
					|| !TypesUtilities.getInstance().canTypeUpCastTo(rType,
							TypesUtilities.BOOLEAN_TYPE)) {
				CodeCompilationException cce = createEvaluateExceptionMessage2(
						0, 0, operator, rType, lType);
				if (cce == null)
					return retValue;
				throw cce;
			}
			retValue = TypesUtilities.BOOLEAN_TYPE;
		}
		return retValue;
	}

	protected boolean isInLValueStyle(Expression expression) {
		if (!(expression instanceof PrimaryExpression))
			return false;
		PrimaryExpression pExpression = (PrimaryExpression) expression;
		if (pExpression.getCategoty() == CoreRebecaCategoriesUtility.ENVIRONMENT_VARIABLE) {
			return false;
		}
		
		while (pExpression instanceof DotPrimary) {
			pExpression = ((DotPrimary) pExpression).getRight();
		}
		
		return ((TermPrimary) pExpression).getParentSuffixPrimary() == null;
	}

	protected Pair<Pair<Type, Category>, Object> evaluatePrimaryExpression(
			PrimaryExpression pExpression, ScopeHandler scopeHandler,
			Set<CompilerFeature> compilerFeatures, ExceptionContainer container) {
		Pair<Pair<Type, Category>, Object> returnValue = new Pair<Pair<Type, Category>, Object>();
		// TODO should be modified in case of supporting "record"
		if (pExpression instanceof DotPrimary) {
			DotPrimary dotPrimary = (DotPrimary) pExpression;
			Expression firstTerm = dotPrimary.getLeft();
			Pair<Type, Category> termType = evaluate(firstTerm, scopeHandler, compilerFeatures,
					container).getFirst();
			firstTerm.setType(termType.getFirst());
			PrimaryExpression pe = dotPrimary.getRight();
			while (pe instanceof DotPrimary) {
				termType = evaluatePrimaryTermExpression(termType.getFirst(),
						(TermPrimary) ((DotPrimary) pe).getLeft(),
						scopeHandler, compilerFeatures, container).getFirst();
				((DotPrimary) pe).getLeft().setType(termType.getFirst());
				pe = ((DotPrimary) pe).getRight();
			}
			termType = evaluatePrimaryTermExpression(termType.getFirst(),
					(TermPrimary) pe, scopeHandler, compilerFeatures, container)
					.getFirst();
			pe.setType(termType.getFirst());
			pe.setCategoty(termType.getSecond());
			pExpression.setType(termType.getFirst());
			pExpression.setCategoty(termType.getSecond());
		} else if (pExpression instanceof TermPrimary) {
			returnValue = evaluatePrimaryTermExpression(TypesUtilities.NO_TYPE,
					(TermPrimary) pExpression, scopeHandler, compilerFeatures,
					container);
			pExpression.setType(returnValue.getFirst().getFirst());
			pExpression.setCategoty(returnValue.getFirst().getSecond());
		} else if (pExpression instanceof RebecInstantiationPrimary) {
			try {
				pExpression.setType(TypesUtilities.getInstance().getType(pExpression.getType()));
			} catch (CodeCompilationException cce) {
				cce.setColumn(pExpression.getCharacter());
				cce.setLine(pExpression.getLineNumber());
				container.addException(cce);
			}
			//TODO check semantic check
		} else {
			throw new CompilerInternalErrorRuntimeException(
					"Unknown primary type \""
							+ pExpression.getClass().getName() + "\"");
		}
		returnValue.setFirst(new Pair<Type, Category>(
				pExpression.getType(), CoreRebecaCategoriesUtility.UNKNOWN));
		return returnValue;
	}

	/**
	 * Returns the type, category, and pre-compile-time value of a primary term.
	 * @param baseType
	 * @param termPrimary
	 * @param scopeHandler
	 * @param compilerFeatures
	 * @param container
	 * @return
	 */
	protected Pair<Pair<Type, Category>, Object> evaluatePrimaryTermExpression(Type baseType,
			TermPrimary termPrimary, ScopeHandler scopeHandler,
			Set<CompilerFeature> compilerFeatures, ExceptionContainer container) {
		Pair<Pair<Type, Category>, Object> returnValue = new Pair<Pair<Type, Category>, Object>(
				new Pair<Type, Category>(TypesUtilities.UNKNOWN_TYPE, 
						CoreRebecaCategoriesUtility.NORMAL_VARIABLE), null);
		String termName = termPrimary.getName();
		try {
			if (termPrimary.getParentSuffixPrimary() == null) {
				// The term specifies access to a variable
				if (baseType == TypesUtilities.NO_TYPE) {
					Pair<Type, Category> foundType = scopeHandler
							.retreiveVariableTypeFromScope(termName);
					//TODO: Check for illegal message sending in constructors
//					if (containerType == TypesUtilities.CONSTRUCTOR_TYPE) {
//						if (TypesUtilities.getInstance().canTypeCastTo(
//								foundType.getFirst(), TypesUtilities.REACTIVE_CLASS_TYPE)) {
//							if (!termName.equals("self")) {
//								CodeCompilationException cce = new CodeCompilationException(
//										"Access denied to rebec reference \""
//												+ termName
//												+ "\"; Construcotr is only allowed to access to \"self\"",
//										0, 0);
//								throw cce;
//							}
//						}
//					}
					returnValue.getFirst().setFirst(foundType.getFirst());
					returnValue.getFirst().setSecond(foundType.getSecond());
					Object value = scopeHandler
							.retrieveCompileTimeEvaluatableVariable(termName);
					returnValue.setSecond(value);
				} else {
					// TODO should be modified in case of supporting "record"
					container.getExceptions().add(
							new CodeCompilationException(
									"Invalid access to state variable "
											+ termName + "", termPrimary
											.getLineNumber(), termPrimary
											.getCharacter()));
					returnValue.setFirst(new Pair<Type, Category>(
							TypesUtilities.UNKNOWN_TYPE, CoreRebecaCategoriesUtility.UNKNOWN));
					return returnValue;
				}
			} else {
				// Term specifies method call (synch method or message server)
				for (Expression expression : termPrimary
						.getParentSuffixPrimary().getArguments()) {
					expression.setType(evaluate(expression, scopeHandler,
							compilerFeatures, container).getFirst().getFirst());
				}
				if (baseType == TypesUtilities.NO_TYPE) {
					Pair<Type, Category> foundType = 
							scopeHandler.retreiveMethodReturnTypeFromScope(termName,
							termPrimary.getParentSuffixPrimary().getArguments());
					returnValue.getFirst().setFirst(foundType.getFirst());
					returnValue.getFirst().setSecond(foundType.getSecond());
				} else {
					for (Expression argumentExpresion : termPrimary
							.getParentSuffixPrimary().getArguments()) {
						if (argumentExpresion.getType() == TypesUtilities.UNKNOWN_TYPE)
							return returnValue;
					}
					Pair<Type, Category> foundType = scopeHandler
							.retreiveMethodReturnTypeFromScope(TypesUtilities
							.getTypeName(baseType), termName, 
							termPrimary.getParentSuffixPrimary().getArguments());
					returnValue.getFirst().setFirst(foundType.getFirst());
					returnValue.getFirst().setSecond(foundType.getSecond());
				}

			}
			if (!termPrimary.getIndices().isEmpty()) {
				if (!(returnValue.getFirst().getFirst() instanceof ArrayType)) {
					ArrayType arrayType = new ArrayType();
					arrayType.setPrimitiveType((PrimitiveType) returnValue
							.getFirst().getFirst());
					arrayType.getDimensions().add(0);
					throw TypesUtilities.getTypeMismatchException(
							returnValue.getFirst().getFirst(), arrayType);
				}
				ArrayType foundTypeInArray = (ArrayType) returnValue.getFirst().getFirst();
				if (termPrimary.getIndices().size() > foundTypeInArray
						.getDimensions().size()) {
					ArrayType arrayType = new ArrayType();
					arrayType.setPrimitiveType(foundTypeInArray
							.getPrimitiveType());
					for (int cnt = 0; cnt < termPrimary.getIndices().size(); cnt++)
						arrayType.getDimensions().add(0);
					throw TypesUtilities.getTypeMismatchException(
							returnValue.getFirst().getFirst(), arrayType);
				}

				for (Expression expression : termPrimary.getIndices()) {
					Type type = evaluate(expression, scopeHandler,
							compilerFeatures, container).getFirst().getFirst();
					if (!TypesUtilities.getInstance().canTypeCastTo(type,
							TypesUtilities.INT_TYPE)) {
						throw TypesUtilities.getTypeMismatchException(type,
								TypesUtilities.INT_TYPE);
					}
				}
				if (termPrimary.getIndices().size() == foundTypeInArray
						.getDimensions().size()) {
					returnValue.getFirst().setFirst(foundTypeInArray.getPrimitiveType());
				} else {
					ArrayType arrayType = new ArrayType();
					arrayType.setPrimitiveType(foundTypeInArray
							.getPrimitiveType());
					for (int cnt = 0; cnt < foundTypeInArray.getDimensions()
							.size() - termPrimary.getIndices().size(); cnt++)
						arrayType.getDimensions().add(
								foundTypeInArray.getDimensions().get(cnt));
					returnValue.getFirst().setFirst(arrayType);
				}

			}
		} catch (CodeCompilationException cce) {
			cce.setColumn(termPrimary.getCharacter());
			cce.setLine(termPrimary.getLineNumber());
			container.addException(cce);
		}

		return returnValue;
	}

	protected Object evaluateConstantTerm(String operator, Type type,
			Object left, Object right) {

		ScriptEngineManager mgr = new ScriptEngineManager();
		ScriptEngine engine = mgr.getEngineByName("JavaScript");
		try {
			Object value = null;
			if (right != null && left != null) {
				value = engine.eval(left + operator + right);
			} else if (left != null) {
				value = engine.eval(left.toString());
			}
			return value;
			
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	protected static CodeCompilationException getOutofRangeException(
			String value, Type type, int line, int column) {
		return new CodeCompilationException("The literal " + value
				+ " of type " + TypesUtilities.getTypeName(type)
				+ " is out of range ", line, column);
	}

	protected static CodeCompilationException createEvaluateExceptionMessage2(
			int lineNumber, int column, String operator, Type... types) {
		String typesString = "";
		for (Type type : types) {
			if (type == null || type == TypesUtilities.UNKNOWN_TYPE)
				return null;
			typesString += ", "
					+ (type == null ? "unknown" : TypesUtilities
							.getTypeName(type));
		}
		if (types.length > 0)
			typesString = typesString.substring(2);

		return new CodeCompilationException("The operator " + operator
				+ " is undefined for the argument type(s) " + typesString,
				lineNumber, column);
	}

}
