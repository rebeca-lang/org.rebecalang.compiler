parser grammar CoreRebecaPropertyParser;

import GeneralPropertyParser, CoreRebecaExpressionParser;

propertyDefinition returns [PropertyModel pm]
    : assertionBlock?
      ltlBlock?
    ;

assertionBlock returns [List<AssertionDefinition> assertions]
    : ASSERTION LBRACE (IDENTIFIER COLON expression SEMI)* RBRACE
    ;


ltlBlock returns [List<LTLDefinition> ltls]
    : LTL LBRACE (IDENTIFIER COLON expression SEMI)* RBRACE
    ;