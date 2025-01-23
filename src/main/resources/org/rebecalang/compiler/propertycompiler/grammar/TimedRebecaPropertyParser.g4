parser grammar TimedRebecaPropertyParser;

import CoreRebecaExpressionParser, GeneralPropertyParser;


propertyDefinition[PropertyModel pm]
    : (assertionBlock)?
      (tctlBlock)?
    ;

assertionBlock returns [List<AssertionDefinition> assertions]
    : ASSERTION LBRACE (IDENTIFIER COLON expression SEMI)* RBRACE
    ;


tctlBlock returns [List<TCTLDefinition> tctls]
    : TCTL LBRACE (IDENTIFIER COLON expression SEMI)* RBRACE
    ;