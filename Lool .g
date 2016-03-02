grammar Lool;

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

type : ID|INT|'string'|'void'|'bool';

st: while_loop expr 'loop' st 'endloop'|if_clause expr 'then' st ('else' st) | block_start st2+  block_end;
	while_loop:'while ';
	if_clause:'if ';
	block_start: '{';
	block_end: '}';
st2: ID (array_dec|) type_dec|'read' ID|'write' expr|'continue'|'break'|assignment|return_st;
	assignment: expr':='expr;
	return_st:'return' expr;
	
expr: object_creation ID| INT| STRINGLIT| boolLit|ID ( function_call|)|exp1 ; 
	///expr access_member array_add_calc    	
	function_call:'['(expr (',' expr)*) ']';
	object_creation:'create';
	boolLit:'true'|'false';
	access_member:'.';
	array_add_calc:ID '[' expr ']';
exp1:exp2 ('or' exp2)*;
exp2:exp3('and'exp3)*;
exp3:('not'exp4)*;	
exp4: exp5 ('=' exp5)*|exp5 ('!=' exp5)*;
exp5: (exp6 '<')* exp6|(exp6 '>')* exp6|(exp6 '<=')* exp6|(exp6 '>=')* exp6;
exp6:exp7(Sum exp7 )*|exp7 (Minus exp7 )*;
	Sum:'+';
	Minus:'-';
exp7: exp8(Mult exp8 )*|exp8(Div exp8 )*;
	Mult:'*';
	Div:'/';
exp8 : ;

ID : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*{System.out.print("id");};
INT : ('+'|'-')?('1'..'9')('0'..'9')*|'0'{System.out.print("int");};
SingleLineComment : '%%' ~('\n'|'\r') '\n'  {System.out.println("SingleLineComment"); $channel = HIDDEN;};
MultiLineComment : '%%%' (options {greedy = false;} : .)* '%%%' {System.out.println("MultiLineComment");$channel = HIDDEN;};

WS : (' '|'\n'|'\t')+ {$channel=HIDDEN;};
STRINGLIT :  '"' (  ~('\\'|'"') )* '"'   ;
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
