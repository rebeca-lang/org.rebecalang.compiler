parser grammar ProbabilisticRebecaParser;

//Uncomment import in case of generating compiler for probabilistic Rebeca.
//For PTRebeca, CoreRebecaParser is imported in its own compiler descriptor
//import CoreRebecaParser;

nondetExpression returns [Expression e]
	: QUES LPAREN expression (COMMA expression)+ RPAREN
	| QUES LPAREN expression COLON expression (COMMA expression COLON expression)+ RPAREN
	;

statementExtension returns [Statement s]
	:	PALT LBRACE pAltStatementGroup+ RBRACE
	|	SEMI
	;

pAltStatementGroup returns [PAltStatementGroup pasg]
	:   PROB LPAREN expression RPAREN COLON
		LBRACE statement* RBRACE
	;
