lexer grammar CoreRebecaExpressionLexer;

INTLITERAL
    :   IntegerNumber 
    ;
    
fragment
IntegerNumber
    :   '0' 
    |   '1'..'9' ('0'..'9')*    
    |   '0' ('0'..'7')+         
    |   HexPrefix HexDigit+        
    ;

fragment
HexPrefix
    :   '0x' | '0X'
    ;
        
fragment
HexDigit
    :   ('0'..'9'|'a'..'f'|'A'..'F')
    ;

fragment
LongSuffix
    :   'l' | 'L'
    ;


fragment
NonIntegerNumber
    :   ('0' .. '9')+ DOT ('0' .. '9')* Exponent?  
    |   DOT ( '0' .. '9' )+ Exponent?  
    |   ('0' .. '9')+ Exponent  
    |   ('0' .. '9')+ 
    |   
        HexPrefix (HexDigit )* 
        (    () 
        |    (DOT (HexDigit )* ) 
        ) 
        ( 'p' | 'P' ) 
        ( '+' | '-' )? 
        ( '0' .. '9' )+
        ;
        
fragment 
Exponent    
    :   ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ 
    ;
    
fragment 
FloatSuffix
    :   'f' | 'F' 
    ;     

fragment
DoubleSuffix
    :   'd' | 'D'
    ;
        
FLOATLITERAL
    :   NonIntegerNumber FloatSuffix
    ;
    
DOUBLELITERAL
    :   NonIntegerNumber DoubleSuffix?
    ;

CHARLITERAL
    :   '\'' 
        (   EscapeSequence 
        |   ~( '\'' | '\\' | '\r' | '\n' )
        ) 
        '\''
    ; 

STRINGLITERAL
    :   '"' 
        (   EscapeSequence
        |   ~( '\\' | '"' | '\r' | '\n' )        
        )* 
        '"' 
    ;

fragment
EscapeSequence 
    :   '\\' (
                 'b' 
             |   't' 
             |   'n' 
             |   'f' 
             |   'r' 
//             |   '\"' 
             |   '\'' 
             |   '\\' 
             |       
                 ('0'..'3') ('0'..'7') ('0'..'7')
             |       
                 ('0'..'7') ('0'..'7') 
             |       
                 ('0'..'7')
             )          
;     

WS
	:  [ \r\t\u000C\n]+ -> channel(HIDDEN)
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;

LINE_COMMENT
	:	'//' ~[\r\n]* ('\r'? '\n' | EOF) -> channel(HIDDEN)
    ;

TRUE
    :   'true'
    ;

FALSE
    :   'false'
    ;

NULL
    :   'null'
    ;

LPAREN
    :   '('
    ;

RPAREN
    :   ')'
    ;

LBRACE
    :   '{'
    ;

RBRACE
    :   '}'
    ;

LBRACKET
    :   '['
    ;

RBRACKET
    :   ']'
    ;

SEMI
    :   ';'
    ;

COMMA
    :   ','
    ;

DOT
    :   '.'
    ;


EQ
    :   '='
    ;

BANG
    :   '!'
    ;

TILDA
    :   '~'
    ;

QUES
    :   '?'
    ;

COLON
    :   ':'
    ;

EQEQ
    :   '=='
    ;

AMPAMP
    :   '&&'
    ;

BARBAR
    :   '||'
    ;

PLUSPLUS
    :   '++'
    ;

SUBSUB
    :   '--'
    ;
	
PLUS
    :   '+'
    ;

SUB
    :   '-'
    ;

STAR
    :   '*'
    ;

SLASH
    :   '/'
    ;

AMP
    :   '&'
    ;

BAR
    :   '|'
    ;

CARET
    :   '^'
    ;

PERCENT
    :   '%'
    ;

PLUSEQ
    :   '+='
    ; 
    
SUBEQ
    :   '-='
    ;

STAREQ
    :   '*='
    ;

SLASHEQ
    :   '/='
    ;

AMPEQ
    :   '&='
    ;

BAREQ
    :   '|='
    ;

CARETEQ
    :   '^='
    ;

TILDAEQ
    :   '~='
    ;

PERCENTEQ
    :   '%='
    ;

MONKEYS_AT
    :   '@'
    ;

BANGEQ
    :   '!='
    ;

GT
    :   '>'
    ;

LT
    :   '<'
    ;        

LTLT
	:	'<<'
	;

LTLTEQ
	:	'<<='
	;

GTGT
	:	'>>'
	;

GTGTEQ
	:	'>>='
	;
              
IDENTIFIER
    :   Letter (Letter|JavaIDDigit)*
    ;


/**I found this char range in JavaCC's grammar, but Letter and Digit overlap.
   Still works, but...
 */
fragment
Letter
    :  '\u0024' |               // $
       '\u0041'..'\u005a' |     // A-Z
       '\u005f' |               // _  
       '\u0061'..'\u007a' |     // a-z
       '\u00c0'..'\u00d6' |     // Latin Capital Letter A with grave - Latin Capital letter O with diaeresis
       '\u00d8'..'\u00f6' |     // Latin Capital letter O with stroke - Latin Small Letter O with diaeresis
       '\u00f8'..'\u00ff' |     // Latin Small Letter O with stroke - Latin Small Letter Y with diaeresis
       '\u0100'..'\u1fff' |     // Latin Capital Letter A with macron - Latin Small Letter O with stroke and acute
       '\u3040'..'\u318f' |     // Hiragana
       '\u3300'..'\u337f' |     // CJK compatibility
       '\u3400'..'\u3d2d' |     // CJK compatibility
       '\u4e00'..'\u9fff' |     // CJK compatibility
       '\uf900'..'\ufaff'       // CJK compatibility
    ;

fragment
JavaIDDigit
    :  '\u0030'..'\u0039' |     // 0-9
       '\u0660'..'\u0669' |     // Arabic-Indic Digit 0-9
       '\u06f0'..'\u06f9' |     // Extended Arabic-Indic Digit 0-9
       '\u0966'..'\u096f' |     // Devanagari 0-9
       '\u09e6'..'\u09ef' |     // Bengali 0-9
       '\u0a66'..'\u0a6f' |     // Gurmukhi 0-9
       '\u0ae6'..'\u0aef' |     // Gujarati 0-9
       '\u0b66'..'\u0b6f' |     // Oriya 0-9
       '\u0be7'..'\u0bef' |     // Tami 0-9
       '\u0c66'..'\u0c6f' |     // Telugu 0-9
       '\u0ce6'..'\u0cef' |     // Kannada 0-9
       '\u0d66'..'\u0d6f' |     // Malayala 0-9
       '\u0e50'..'\u0e59' |     // Thai 0-9
       '\u0ed0'..'\u0ed9' |     // Lao 0-9
       '\u1040'..'\u1049'       // Myanmar 0-9?
   ;


