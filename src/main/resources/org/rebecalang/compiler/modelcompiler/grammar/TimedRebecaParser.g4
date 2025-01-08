parser grammar TimedRebecaParser;

//import CoreRebecaParser;

primary returns [TermPrimary tp]
    : IDENTIFIER
      (LPAREN expressionList? RPAREN
        (AFTER LPAREN expression RPAREN)?
        (DEADLINE LPAREN expression RPAREN)?
      )?
      (LBRACKET expression RBRACKET)*
    ;