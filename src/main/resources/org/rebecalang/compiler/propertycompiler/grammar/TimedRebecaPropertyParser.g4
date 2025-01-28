parser grammar TimedRebecaPropertyParser;

import GeneralPropertyParser, CoreRebecaExpressionParser;


propertyDefinition returns [PropertyModel pm]
    : assertionBlock?
      tctlBlock?
    ;

assertionBlock returns [List<AssertionDefinition> assertions]
    : ASSERTION LBRACE (IDENTIFIER COLON expression SEMI)* RBRACE
    ;


tctlBlock returns [List<TCTLDefinition> tctls]
    : TCTL LBRACE (IDENTIFIER COLON expression SEMI)* RBRACE
    ;