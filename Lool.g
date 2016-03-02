lexer grammar Lool;

options {
    language = Java;
}

MODULE	:	'module'       ;
CHILDOF	:	'childof' 	;
VIRTUAL	:	'virtual' 	;
CREATE	:	'create' 	;
INT	:	'int' 	;
BOOL	:	'bool'	;
STRING	:	'string'	;
VOID	:	'void'	;
AND	:	'and'	;
OR	:	'or' 	;       
NOT	:	'not'	;
TRUE	:	'true'	 ;
FALSE	:	'false' 	;
RETURN	:	'return'        ;
IF	:	'if' 	 ;
THEN	:	'then'	;
ELSE	:	'else'	;
ENDIF	:	'endif'	;
WHILE	:	'while'	;
LOOP	:	'loop'	;
ENDLOOP	:	'endloop'	;
BREAK	:	'break'	;
CONTINUE:		'continue'	;
READ	:	'read'	;

WRITE	:	'write'	;	



ERROR3	:	'0'+NUMBER			;
ERROR1	:	NUMBER ID			;



ZERO	:	('+'|'-')?('0')			;
ASSING 	:	(':=')			;
EQ	:	 '='  			;
GR 	:	'>'			;
SM 	:	 '<'			; 
GE 	:	 '>='			;
SE 	:	 '<= ' 			;
NE 	:	 '!='			; 

SemiColon	:	';'			;
Dot	:	'.'			;
Colon	:	':'			;
Comma	:	','			;		
BraceStart	:	'{'			;				
BraceEnd	:	'}'			;		
BracketsStart:	'[' 			;		
BracketsEnd:	']'			;		
ParenthesesStart:	'('			;		
ParenthesesEnd:	')'			;		
MULT	:	'*'			;		
DIV	:	'/'			;		
Sum	:	'+'			;		
Minus	:	'-'			;		
NUMBER       :	   ('+'|'-')? ('1'..'9')('0'..'9')*     	;
ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* 	;

NEWLINE:	(' '|'\t'|'\r')*'\n'+  ;
 WS	:	(' '|'\t')+		{$channel= HIDDEN;};


COMMENT
    :   '%%' ( options {greedy=false;} : . )*( '\n') {$channel=HIDDEN;}

//check
MULTICOMMENT
	:	
	    '%%%' ( options {greedy=false;} : . )* ('%%%')  {$channel=HIDDEN;};
    
    STRINGLIT
    :  '"' (  ~('\\'|'"') )* '"'   ;
    
 
ERR2	: '!'| '@'|'#'|'$'|'%'|'^'|'&'|'*'|'?';


ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');    
