parser grammar GeneralPropertyParser;

import CoreRebecaExpressionParser;

expression returns [Expression e]
    :
		coreExpression
        | unaryExpression
        | expression multiplicativeOp expression
    	| expression additiveOp expression
    	| expression shiftOp expression
    	| expression relationalOp expression
        | expression INSTANCEOF type
    	| expression equalityOp expression
        | expression AMP expression
		| expression CARET expression
		| expression BAR expression
		| expression AMPAMP expression
    	| expression (BARBAR | THEN) expression
    	| expression QUES expression COLON expression
    	| expression assignmentOperator expression
    ;

propertyModel returns [PropertyModel pm]
	:
	{$pm = new PropertyModel();}
	PROPERTY LBRACE
	
	(DEFINE LBRACE
		(id=IDENTIFIER EQ e = expression {
			Definition definition = new Definition();
			definition.setName($id.text);
			definition.setExpression($e.e);
			$pm.getDefinitions().add(definition);} SEMI)*
	RBRACE)?

	propertyDefinition[$pm]	
	
	RBRACE
	;

propertyDefinition[PropertyModel pm] :;