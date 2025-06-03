parser grammar TimedRebecaParser;

import CoreRebecaParser;

primary returns [TermPrimary tp]
    : THIS
    | SUPER
    | IDENTIFIER (arguments after? deadline?)? (LBRACKET expression RBRACKET)*
    ;
    
after returns [Expression e]
    : AFTER LPAREN expression RPAREN
    ;

deadline returns [Expression e]
    : DEADLINE LPAREN expression RPAREN
    ;