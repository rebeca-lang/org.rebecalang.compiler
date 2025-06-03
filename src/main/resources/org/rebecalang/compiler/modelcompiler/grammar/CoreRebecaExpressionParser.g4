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
	:   (LBRACKET DECIMAL_LITERAL RBRACKET)+
	;

///////////////////////////
//inspired from https://github.com/antlr/grammars-v4/blob/master/java/java/JavaParser.g4

expressionList returns [List<Expression> el]
    : annotatedExpression (COMMA annotatedExpression)*
    ;
annotatedExpression returns [Expression e]
    :   annotation* expression
    ;

methodCall returns [Expression e]
    //: (identifier | THIS | SUPER) arguments
    : IDENTIFIER arguments
    ;

expression returns [Expression e]
    : <assoc = right> expression (dot = DOT expression)+
    | primary
    //| expression LBRACKET expression RBRACKET
    //| IDENTIFIER (LBRACKET expression RBRACKET)+
    //| expression bop = DOT (
    //    IDENTIFIER
    //    | methodCall
    //    | THIS
    //)
    //| methodCall                                                    
    | expression postfix = (PLUSPLUS | SUBSUB)                            
    | prefix = (PLUS | SUB | PLUSPLUS | SUBSUB | TILDA | BANG) expression     
    | parenExp = LPAREN expression RPAREN       		
    | LPAREN castType = type RPAREN expression
    | nondetExpression
    //| '(' annotation* IDENTIFIER ')' expression       				
    | NEW IDENTIFIER arguments COLON arguments                                                
    | expression bop = (STAR | SLASH | PERCENT) expression           
    | expression bop = (PLUS | SUB) expression                 
    | expression bop = (LTLT | GTGT) expression 
    | expression bop = (LTEQ | GTEQ | LT | GT) expression   
    | expression bop = INSTANCEOF type               
    | expression bop = (EQEQ | BANGEQ) expression               
    | expression bop = AMP expression                         
    | expression bop = CARET expression                         
    | expression bop = BAR expression                         
    | expression bop = AMPAMP expression                        
    | expression bop = BARBAR expression                        
    | <assoc = right> expression bop = QUES expression COLON expression
    | <assoc = right> expression bop = (
        EQ
        | PLUSEQ
        | SUBEQ
        | STAREQ
        | SLASHEQ
        | AMPEQ
        | BAREQ
        | CARETEQ
        | GTGTEQ
        | LTLTEQ
        | PERCENTEQ
    ) expression
    | literal
    ;

nondetExpression returns [Expression e]
	: QUES LPAREN expression (COMMA expression)+ RPAREN		
	;
	
primary returns [TermPrimary tp]
    : THIS
    | SUPER
    | IDENTIFIER arguments? (LBRACKET expression RBRACKET)*
    ;

//primary returns [TermPrimary tp]
//    : LPAREN expression RPAREN
//    | THIS
//    | SUPER
//    | literal
//    | IDENTIFIER
//    ;

arguments returns [List<Expression> args]
    : LPAREN expressionList? RPAREN
    ;

literal returns [Literal l]
    : integerLiteral
    | floatLiteral
    | CHAR_LITERAL
    | STRING_LITERAL
    | BOOL_LITERAL
    | NULL_LITERAL
    ;

integerLiteral
    : DECIMAL_LITERAL
    | HEX_LITERAL
    | OCT_LITERAL
    | BINARY_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    ;

/*
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

unaryExpression returns [Expression e]
    :   PLUS unaryExpression
    |   SUB unaryExpression
    |   PLUSPLUS unaryExpression
    |   SUBSUB unaryExpression
    |   TILDA unaryExpression
    |	BANG unaryExpression
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
*/