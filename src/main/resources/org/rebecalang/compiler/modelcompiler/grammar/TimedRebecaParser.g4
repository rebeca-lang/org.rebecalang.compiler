parser grammar TimedRebecaParser;

//import CoreRebecaParser;

primary returns [TermPrimary tp]
    : IDENTIFIER (LPAREN expressionList? RPAREN after? deadline?)? (LBRACKET expression RBRACKET)*
    ;
after returns [Expression e]
    : AFTER LPAREN expression RPAREN
    ;
deadline returns [Expression e]
    : DEADLINE LPAREN expression RPAREN
    ;