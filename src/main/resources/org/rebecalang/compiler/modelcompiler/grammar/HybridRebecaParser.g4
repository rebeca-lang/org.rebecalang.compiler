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
        PHYSICALCLASS IDENTIFIER LPAREN DECIMAL_LITERAL RPAREN
        LBRACE
        knownRebecsDeclaration?
        stateVarsDeclaration?
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
    : THIS
    | SUPER
    | IDENTIFIER (arguments after? deadline?)? (LBRACKET expression RBRACKET)* PRIME*
    ;
