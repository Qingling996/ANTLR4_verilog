lexer grammar VerilogLexer;


channels { COMMENTS }

// 关键字（IEEE 1364-2005 附录A.1）
ALWAYS          : 'always';
AND             : 'and';
ASSIGN          : 'assign';
BUF             : 'buf';
BUFIF0          : 'bufif0';
BUFIF1          : 'bufif1';
BEGIN           : 'begin';
CASE            : 'case';
CASEX           : 'casex';
CASEZ           : 'casez';
CELL            : 'cell';
DEASSIGN        : 'deassign';
DEFAULT         : 'default';
DEFPARAM        : 'defparam';
DISABLE         : 'disable';
EDGE            : 'edge';
ELSE            : 'else';
END             : 'end';
ENDCASE         : 'endcase';
ENDGENERATE     : 'endgenerate';
ENDMODULE       : 'endmodule';
ENDFUNCTION     : 'endfunction';
ENDPRIMITIVE    : 'endprimitive';
ENDSPECIFY      : 'endspecify';
ENDTABLE        : 'endtable';
ENDTASK         : 'endtask';
EVENT           : 'event';
FOR             : 'for';
FORCE           : 'force';
FOREVER         : 'forever';
FORK            : 'fork';
FUNCTION        : 'function';
GENERATE        : 'generate';
GENVAR          : 'genvar';
HIGHZ0          : 'highz0';
HIGHZ1          : 'highz1';
IF              : 'if';
INITIAL         : 'initial';
INOUT           : 'inout';
INPUT           : 'input';
INTEGER         : 'integer';
JOIN            : 'join';
LARGE           : 'large';
LOCALPARAM      : 'localparam';
MACROMODULE     : 'macromodule';
MEDIUM          : 'medium';
MODULE          : 'module';
NAND            : 'nand';
NEGEDGE         : 'negedge';
NMOS            : 'nmos';
NOR             : 'nor';
NOT             : 'not';
NOTIF0          : 'notif0';
NOTIF1          : 'notif1';
OR              : 'or';
OUTPUT          : 'output';
PARAMETER       : 'parameter';
PMOS            : 'pmos';
POSEDGE         : 'posedge';
PRIMITIVE       : 'primitive';
PULL0           : 'pull0';
PULL1           : 'pull1';
PULLUP          : 'pullup';
PULLDOWN        : 'pulldown';
RCMOS           : 'rcmos';
REAL            : 'real';
REALTIME        : 'realtime';
REG             : 'reg';
RELEASE         : 'release';
REPEAT          : 'repeat';
RNMOS           : 'rnmos';
RPMOS           : 'rpmos';
RTRAN           : 'rtran';
RTRANIF0        : 'rtranif0';
RTRANIF1        : 'rtranif1';
SCALARED        : 'scalared';
SMALL           : 'small';
SPECIFY         : 'specify';
SPECPARAM       : 'specparam';
STRONG0         : 'strong0';
STRONG1         : 'strong1';
SUPPLY0         : 'supply0';
SUPPLY1         : 'supply1';
TABLE           : 'table';
TASK            : 'task';
TIME            : 'time';
TRAN            : 'tran';
TRANIF0         : 'tranif0';
TRANIF1         : 'tranif1';
TRI             : 'tri';
TRI0            : 'tri0';
TRI1            : 'tri1';
TRIAND          : 'triand';
TRIOR           : 'trior';
TRIREG          : 'trireg';
VECTORED        : 'vectored';
WAIT            : 'wait';
WAND            : 'wand';
WEAK0           : 'weak0';
WEAK1           : 'weak1';
WHILE           : 'while';
WIRE            : 'wire';
WOR             : 'wor';
XNOR            : 'xnor';
XOR             : 'xor';
CONFIG          : 'config';
ENDCONFIG       : 'endconfig';
DESIGN          : 'design';
INSTANCE        : 'instance';
LIBLIST         : 'liblist';
USE             : 'use';

// 数字常量（IEEE 1364-2005 第2.5节）
NUMBER
    : DECIMAL_NUMBER
    | OCTAL_NUMBER
    | BINARY_NUMBER
    | HEX_NUMBER
    | REAL_NUMBER
    ;

fragment DECIMAL_NUMBER
    : [0-9]+ ('_' [0-9]+)*
    | [0-9]+ ('_' [0-9]+)* [eE] [+-]? [0-9]+ ('_' [0-9]+)*
    ;

fragment OCTAL_NUMBER
    : '0' [oO] [0-7]+ ('_' [0-7]+)*
    ;

fragment BINARY_NUMBER
    : '0' [bB] [01]+ ('_' [01]+)*
    ;

fragment HEX_NUMBER
    : '0' [hH] [0-9a-fA-F]+ ('_' [0-9a-fA-F]+)*
    ;

fragment REAL_NUMBER
    : [0-9]+ '.' [0-9]+
    | '.' [0-9]+
    | [0-9]+ [eE] [+-]? [0-9]+
    ;

// 标识符（IEEE 1364-2005 第2.7节）
IDENTIFIER
    : SIMPLE_IDENTIFIER
    | ESCAPED_IDENTIFIER
    ;

fragment SIMPLE_IDENTIFIER
    : [a-zA-Z_] [a-zA-Z0-9_$]*
    ;

fragment ESCAPED_IDENTIFIER
    : '\\' ~[ \r\n\t]+
    ;

// UDP专用符号（IEEE 1364-2005 第8.2节）
fragment BINARY_DIGIT: [01];
fragment UDP_EDGE: '(' BINARY_DIGIT BINARY_DIGIT ')';

// 标准表8-3/8-4/8-5中的符号
BANG: '!';
UDP_EDGE_SYMBOL: UDP_EDGE;
ONESTEP: 'x' | 'X';  // 标准允许的初始化简写

// 运算符（IEEE 1364-2005 第4.1节）
PLUS            : '+';
MINUS           : '-';
STAR            : '*';
DIV             : '/';
MOD             : '%';
LOG_AND         : '&&';
LOG_OR          : '||';
LOG_NOT         : '!' ;
LOG_EQ          : '==';
LOG_NEQ         : '!=';
CASE_EQ         : '===';
CASE_NEQ        : '!==';
BIT_AND         : '&';
BIT_OR          : '|';
BIT_NOT         : '~';
BIT_XOR         : '^';
BIT_XNOR        : '~^' | '^~';
REDUCE_NOR      : '~|';
REDUCE_NAND     : '~&';
LEFT_SHIFT      : '<<';
RIGHT_SHIFT     : '>>';
SHRA            : '>>>';
SHLA            : '<<<';
LESS            : '<';
LESS_EQ         : '<=';
GREATER         : '>';
GREATER_EQ      : '>=';
ASSIGN_EQ       : '=';
ASSIGN_LE       : '<=';
ASSIGN_NB       : '<=';
TICK            : '`';
AT              : '@';
HASH            : '#';
DOLLAR          : '$';
QUESTION        : '?';
COLON           : ':';
SEMI            : ';';
COMMA           : ',';
DOT             : '.';
LPAREN          : '(';
RPAREN          : ')';
LBRACK          : '[';
RBRACK          : ']';
LBRACE          : '{';
RBRACE          : '}';

// 基础空白和注释
WS              : [ \t\r\n]+ -> channel(HIDDEN);
BLOCK_COMMENT   : '/*' .*? '*/' -> channel(COMMENTS);
LINE_COMMENT    : '//' ~[\r\n]* -> channel(COMMENTS);