grammar finalLool;// Matthew O'Connor final project grammar for checkpoint 2

options {
    language = Java;
}
start  returns [String r]	:	 program EOF {$r=$program.e;};
program returns [String e] :	module+ {$e=$module.r;};

module returns [String r]: mod_dec (inherit|) '{'(member)+ mod_end {$r="module";};
	mod_dec: 'module 'ID;
	mod_end:'}';
	inherit: 'childof 'ID;

member	: ID (array_dec|) type_dec | ('virtual') method_dec (ID ':' type(',' ID ':' type ) ) ')' ':' method_end ;
	method_dec:ID'(';
	method_end:type_dec '{'st+ '}';
	array_dec:'['INT']';
	type_dec: ':'type;

type : ID|INT|'string'|'void'|'bool';// Does type statements

st: while_loop xpression 'loop' st 'endloop'|if_clause xpression 'then' st ('else' st) | block_start st2+  block_end;
	while_loop:'while ';// while loops
	if_clause:'if ';
	block_start: '{';
	block_end: '}';
st2: ID (array_dec|) type_dec|'read' ID|'write' xpression|'continue'|'break'|assignment|return_st;
	assignment: xpression':='xpression;
	return_st:'return' xpression;
	
xpression: object_creation ID| INT| STRING_LITERAL| boolLit|ID ( function_call|)|xpression1 ; 
	///xpression access_member array_add_calc    	
	function_call:'['(xpression (',' xpression)*) ']';
	object_creation:'create';
	boolLit:'true'|'false';
	access_member:'.';
	array_add_calc:ID '[' xpression ']';
xpression1:xpression2 ('or' xpression2)*;// expressions
xpression2:xpression3('and'xpression3)*;
xpression3:('not'xpression4)*;	
xpression4: xpression5 ('=' xpression5)*|xpression5 ('!=' xpression5)*;
xpression5: (xpression6 '<')* xpression6|(xpression6 '>')* xpression6|(xpression6 '<=')* xpression6|(xpression6 '>=')* xpression6;
xpression6:xpression7(Sum xpression7 )*|xpression7 (Minus xpression7 )*;
	Sum:'+';
	Minus:'-';
xpression7: xpression8(Mult xpression8 )*|xpression8(Div xpression8 )*;
	Mult:'*';
	Div:'/';
xpression8 : ;

ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*{System.out.print("id");};
INT : ('+'|'-')?('1'..'9')('0'..'9')*|'0'{System.out.print("int");};
SingleLineComment : '%%' ~('\n'|'\r') '\n'  {System.out.println("SingleLineComment"); $channel = HIDDEN;};
MultiLineComment : '%%%' (options {greedy = false;} : .)* '%%%' {System.out.println("MultiLineComment");$channel = HIDDEN;};

WS : (' '|'\n'|'\t')+ {$channel=HIDDEN;};
STRING_LITERAL :  '"' (  ~('\\'|'"') )* '"'   ;
SYMB:'+'{System.out.print("+ ");}|'-'{System.out.print("- ");}
|'/'{System.out.print("/ ");}|'*'{System.out.print("* ");}
|'\\'{System.out.print("\\");}|'{'{System.out.print("{ ");}
|'}'{System.out.print("} ");}|';'{System.out.print("; ");}|
'='{System.out.print("= ");}|':'{System.out.print(": ");}|
'.'{System.out.print(". ");}|'!='{System.out.print("!= ");}|
'<'{System.out.print("< ");}|'<='{System.out.print("<= ");}
|'>'{System.out.print("> ");}|'>='{System.out.print(">= ");}
|','{System.out.print(", ");}|':='{System.out.print(":= ");}
|'['{System.out.print("[ ");}|']'{System.out.print("] ");}|
'('{System.out.print("( ");}|')'{System.out.print(") ");};

