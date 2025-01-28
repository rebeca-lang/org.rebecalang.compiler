parser grammar ProbabilisticRebecaParser;

//Uncomment import in case of generating compiler for probabilistic Rebeca.
//For PTRebeca, CoreRebecaParser is imported in its own compiler descriptor
//import CoreRebecaParser;


statement returns [Statement s]
	:   statementExpression SEMI
	|	fieldDeclaration SEMI
	|	block
    |   PALT LBRACE pAltStatementGroup+ RBRACE
    |   IF LPAREN expression RPAREN statement (ELSE statement)?
    |   WHILE LPAREN expression RPAREN statement
    |   FOR LPAREN forInit? SEMI expression? SEMI expressionList? RPAREN statement
    |   SWITCH LPAREN expression RPAREN LBRACE switchBlock RBRACE
    |   RETURN expression? SEMI
    |   BREAK SEMI
    |   CONTINUE SEMI
    |   SEMI
	;

pAltStatementGroup returns [PAltStatementGroup pasg]
	:   PROB LPAREN expression RPAREN COLON
		LBRACE statement* RBRACE
	;
coreExpression returns [Expression e]
    :   castExpression | LPAREN expression RPAREN | primary | literal | QUES LPAREN probabilisticList RPAREN
    ;

probabilisticList returns [List<ProbabilisticAlternativeValue> el]
    :   expression (COLON expression)? (COMMA expression (COLON expression )?)*
    ;
	