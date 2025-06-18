lexer grammar VerilogLexer;

channels { COMMENTS }

// =========================================================================
// Fragments (辅助规则，不生成独立Token，只供其他规则引用)
// =========================================================================
fragment DECIMAL_DIGIT : [0-9];
fragment SIZE_PREFIX : DECIMAL_DIGIT+ ('_'* DECIMAL_DIGIT+)*; // 例如 16 或 1_2
fragment XZ : [xXzZ];
fragment BIN : [01];
fragment OCT : [0-7];
fragment HEX : [0-9a-fA-F];

// =========================================================================
// Keywords (IEEE 1364-2005 附录A.1) - 必须在 IDENTIFIER 之前定义
// =========================================================================
ALWAYS          : 'always';
AND             : 'and';
ASSIGN          : 'assign';
AUTOMATIC       : 'automatic';
BUF             : 'buf';
BUFIF0          : 'bufif0';
BUFIF1          : 'bufif1';
BEGIN           : 'begin';
CASE            : 'case';
CASEX           : 'casex';
CASEZ           : 'casez';
CELL            : 'cell';
CMOS            : 'cmos';
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
IFNONE          : 'ifnone';
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
SIGNED          : 'signed';
SMALL           : 'small';
SPECIFY         : 'specify';
SPECPARAM       : 'specparam';
STATIC          : 'static';
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
UNSIGNED        : 'unsigned';
UWIRE           : 'uwire';
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
INT             : 'int';
SHORTINT        : 'shortint';
LONGINT         : 'longint';
BYTE            : 'byte';
BIT             : 'bit';
LOGIC           : 'logic';

// =========================================================================
// Compiler Directives (编译器指令)
// =========================================================================
TICK_TIMESCALE      : '`timescale' -> pushMode(TimescaleMode); // 看到 `timescale 就进入 TimescaleMode
TICK_DEFINE         : '`define' -> pushMode(DefineMode);
TICK_INCLUDE        : '`include';
TICK_IFDEF          : '`ifdef';
TICK_IFNDEF         : '`ifndef';
TICK_ELSE           : '`else';
TICK_ELSIF          : '`elsif';
TICK_ENDIF          : '`endif';
TICK_UNCONNECTED_DRIVE : '`unconnected_drive';
TICK_RESETALL       : '`resetall';
TICK_CELLDEFINE     : '`celldefine';
TICK_ENDCELLDEFINE  : '`endcelldefine';

// =========================================================================
// Multi-character Operators
// =========================================================================
AND3            : '&&&';
LOG_AND         : '&&';
LOG_OR          : '||';
CASE_EQ         : '===';
CASE_NEQ        : '!==';
LOG_EQ          : '==';
LOG_NEQ         : '!=';
SHRA            : '>>>';
SHLA            : '<<<';
LEFT_SHIFT      : '<<';
RIGHT_SHIFT     : '>>';
LE_OP           : '<=';
GREATER_EQ      : '>=';
TILDE_CARET     : '~^';
CARET_TILDE     : '^~';
REDUCE_NOR      : '~|';
REDUCE_NAND     : '~&';
IMPLIES         : '=>';
STAR_GT         : '*>';
PLUS_COLON      : '+:';
MINUS_COLON     : '-:';
ARROW           : '->';
ARROW_ARROW     : '->>';

// =========================================================================
// Whitespace and Comments
// =========================================================================
WS              : [ \t\r\n]+ -> skip;
BLOCK_COMMENT   : '/*' .*? '*/' -> channel(COMMENTS);
LINE_COMMENT    : '//' ~[\r\n]* -> channel(COMMENTS);

// =========================================================================
// Single-character Operators and Punctuation
// =========================================================================
PLUS            : '+';
MINUS           : '-';
STAR            : '*';
DIV             : '/';
MOD             : '%';
LOG_NOT         : '!';
BIT_AND         : '&';
BIT_OR          : '|';
BIT_NOT         : '~';
BIT_XOR         : '^';
LESS            : '<';
GREATER         : '>';
ASSIGN_EQ       : '=';
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

// =========================================================================
// Identifiers (关键字必须在此之前定义)
// =========================================================================
// IDENTIFIER          : [a-zA-Z_] [a-zA-Z_0-9$]*; // 通用标识符
IDENTIFIER
    : SIMPLE_IDENTIFIER
    | ESCAPED_IDENTIFIER
    ;
// 【关键修正】: 下面两个规则改为 fragment
fragment SIMPLE_IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_$]*;
fragment ESCAPED_IDENTIFIER : '\\' ~[ \r\t\n]+ ;
STRING_LITERAL      : '"' ( ~["] | '""' )* '"';
TIME_LITERAL        : [0-9]+ ('s' | 'ms' | 'us' | 'ns' | 'ps' | 'fs');
// =========================================================================
// Numbers
// =========================================================================
NUMBER
    : SIZED_NUMBER
    | DECIMAL_NUMBER_NO_SIZE
    ;
// 【关键修正】: 下面两个规则改为 fragment
fragment SIZED_NUMBER
    : SIZE_PREFIX? '\'' [sS]? [bB] [01xXzZ_]+
    | SIZE_PREFIX? '\'' [sS]? [oO] [0-7xXzZ_]+
    | SIZE_PREFIX? '\'' [sS]? [dD] [0-9xXzZ_]+
    | SIZE_PREFIX? '\'' [sS]? [hH] [0-9a-fA-FxXzZ_]+
    ;
fragment DECIMAL_NUMBER_NO_SIZE
    : DECIMAL_DIGIT+ ([eE] [+-]? DECIMAL_DIGIT+)?
    | DECIMAL_DIGIT* '.' DECIMAL_DIGIT+ ([eE] [+-]? DECIMAL_DIGIT+)?
    ;

// =========================================================================
// Other Literals and Symbols
// =========================================================================
STRING : '"' ( ~[ "\r\n\\] | '\\' . )* '"' ;
fragment BINARY_DIGIT : [01xXzZ];
UDP_EDGE_SYMBOL: '(' BINARY_DIGIT BINARY_DIGIT ')';
DOLLAR_SETUP    : '$setup';
DOLLAR_HOLD     : '$hold';
DOLLAR_WIDTH    : '$width';
DOLLAR_RECOVERY : '$recovery';
DOLLAR_SKEW     : '$skew';
DOLLAR_TIMESKEW : '$timeskew';
DOLLAR_FULLSKEW : '$fullskew';
DOLLAR_PERIOD   : '$period';
DOLLAR_NOCHANGE : '$nochange';
PULSE           : 'pulse';
FULLSKEW        : 'fullskew';

// =========================================================================
// Define 模式 (阶段 1: 寻找宏名称)
// =========================================================================
mode DefineMode;
// 任务1: 跳过 `define 和宏名称之间的空格
D_WS                : [ \t]+ -> skip;

// 任务2: 捕获宏名称，然后切换到 DefineBodyMode 准备捕获主体
MACRO_IDENTIFIER    : [a-zA-Z_] [a-zA-Z_0-9$]* -> pushMode(DefineBodyMode);

// 任务3: 如果 `define` 后面直接换行了，就退出
D_NL                : [\r\n]+ -> popMode;

// =========================================================================
// Define Body 模式 (阶段 2: 捕获宏主体)
// =========================================================================
mode DefineBodyMode;

// 任务1: 跳过宏名称和宏主体之间的空格
DB_WS               : [ \t]+ -> skip;

// 任务2: 将行内剩余的所有内容作为宏的主体，然后一次性退出两个模式
MACRO_BODY          : ~[\r\n]+ -> mode(DEFAULT_MODE); // 【关键】使用 mode(DEFAULT_MODE) 彻底重置模式栈

// 任务3: 如果只有宏名称没有主体，遇到换行也要能正确退出
DB_NL               : [\r\n]+ -> mode(DEFAULT_MODE); // 【关键】同样重置模式栈

// =========================================================================
// Timescale 模式下的专属规则
// =========================================================================
mode TimescaleMode;
// 这个 Token 会匹配 `timescale` 后面的所有内容，直到换行符
TIMESCALE_VALUE     : ~[\r\n]+ -> popMode; // 匹配所有非换行符，然后退出 TimescaleMode
// 在 TimescaleMode 中，我们忽略空白，但不隐藏它，以便 TIMESCALE_VALUE 能匹配到
TS_WS               : [ \t]+ -> skip;
