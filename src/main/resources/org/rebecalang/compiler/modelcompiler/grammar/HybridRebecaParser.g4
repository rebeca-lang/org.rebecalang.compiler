parser grammar HybridRebecaParser;

rebecaCode returns [HybridRebecaCode rc]
    :
		recordDeclaration*
		((ENV fieldDeclaration SEMI) | (FEATUREVAR IDENTIFIER SEMI))*
        (reactiveClassDeclaration | interfaceDeclaration | physicalClassDeclaration)+
        mainDeclaration
    ;
    
physicalClassDeclaration returns[PhysicalClassDeclaration pcd]
    :
    	annotation*
        PHYSICALCLASS IDENTIFIER LPAREN INTLITERAL RPAREN
        LBRACE
        (KNOWNREBECS LBRACE (fieldDeclaration SEMI)* RBRACE)?
        (STATEVARS LBRACE (fieldDeclaration SEMI)* RBRACE)?
        (constructorDeclaration | msgsrvDeclaration | synchMethodDeclaration | modeDeclaration)*
        RBRACE
    ;

modeDeclaration returns[ModeDeclaration md]
	:
	    MODE IDENTIFIER
	    LBRACE
	    INV LPAREN expression RPAREN block
	    GUARD LPAREN expression RPAREN block
	    RBRACE
	;
    
primary returns [TermPrimary tp]
    : IDENTIFIER (LPAREN expressionList? RPAREN after? deadline?)? (LBRACKET expression RBRACKET)* PRIME*
    ;
after returns [Expression e]
    : AFTER LPAREN expression RPAREN
    ;
deadline returns [Expression e]
    : DEADLINE LPAREN expression RPAREN
    ;