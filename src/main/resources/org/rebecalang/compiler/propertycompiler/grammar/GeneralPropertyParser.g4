parser grammar GeneralPropertyParser;

import CoreRebecaExpressionParser;

expression returns [Expression e]
    :
		extendableExpression
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
    	| expression BARBAR expression
    	| expression THEN expression
    	| expression QUES expression COLON expression
    	| expression assignmentOperator expression
    ;

propertyModel returns [PropertyModel pm]
	:   PROPERTY LBRACE
	    (DEFINE LBRACE (id=IDENTIFIER EQ e = expression SEMI)* RBRACE)?
	    propertyDefinition
	    RBRACE
	;

propertyDefinition returns [PropertyModel pm] :;