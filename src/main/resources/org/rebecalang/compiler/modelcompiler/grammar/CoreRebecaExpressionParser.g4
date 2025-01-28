parser grammar CoreRebecaExpressionParser;

annotation returns [Annotation an]
    :   MONKEYS_AT IDENTIFIER (LPAREN expression? RPAREN)?
    ;

type returns [Type t]
	:   IDENTIFIER genericTypeParams? dimensions?
	;

genericTypeParams returns [List<Type> gts]
	:   LT type (COMMA type)* GT
	;
	
dimensions returns [List<Integer> ds]
	:   (LBRACKET INTLITERAL RBRACKET)+
	;

///////////////////////////
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
    	| expression QUES expression COLON expression
    	| expression assignmentOperator expression
    ;

assignmentOperator returns [String ao]
    :   EQ | PLUSEQ | SUBEQ | STAREQ  | SLASHEQ | AMPEQ | BAREQ | CARETEQ | TILDAEQ | PERCENTEQ | LTLTEQ | GTGTEQ
    ;

multiplicativeOp returns [String mo]
    :   STAR | SLASH | PERCENT
    ;

additiveOp returns [String ado]
    :   PLUS | SUB
    ;

relationalOp returns [String ro]
    :    LT EQ | GT EQ | LT | GT
    ;

shiftOp returns [String so]
    :    LT LT | GT GT
    ;

equalityOp returns [String eo]
    :    EQEQ | BANGEQ
    ;

/**
 * NOTE: for '+' and '-', if the next token is int or long interal, then it's not a unary expression.
 *       it's a literal with signed value. INTLTERAL AND LONG LITERAL are added here for this.
 */
unaryExpression returns [Expression e]
    :   PLUS unaryExpression
    |   SUB unaryExpression
    |   PLUSPLUS unaryExpression
    |   SUBSUB unaryExpression
    |   TILDA unaryExpression
    |	BANG unaryExpression
    |   extendableExpression
    ;

extendableExpression returns [Expression e]
    :   coreExpression (DOT primary)* (PLUSPLUS | SUBSUB)?
    ;

coreExpression returns [Expression e]
    :   castExpression | LPAREN expression RPAREN | primary | literal | QUES LPAREN expressionList RPAREN | rebecInstantiationExpression
    ;

rebecInstantiationExpression returns [Expression e]
    : NEW type LPAREN expressionList? RPAREN COLON LPAREN expressionList? RPAREN
    ;

castExpression returns [Expression e]
    :   LPAREN type RPAREN expression
    ;

primary returns [TermPrimary tp]
    :   IDENTIFIER (LPAREN expressionList? RPAREN)? (LBRACKET expression RBRACKET)*
    ;

expressionList returns [List<Expression> el]
    :   annotatedExpression (COMMA annotatedExpression)*
    ;
annotatedExpression returns [Expression e]
    :   annotation* expression
    ;
	
literal returns [Literal l]
    :   INTLITERAL | FLOATLITERAL | DOUBLELITERAL | CHARLITERAL | STRINGLITERAL | TRUE | FALSE | NULL
    ;