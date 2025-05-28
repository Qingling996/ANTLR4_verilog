lexer grammar VerilogLexer;

@lexer::members {
    boolean isInAssignContext() {
        // 获取当前已识别的文本并移除所有空白
        String prevText = getText().replaceAll("\\s+", "");
        // 检查是否以 = 或 < 结尾（赋值或比较上下文）
        return prevText.endsWith("=") || prevText.endsWith("<");
    }
    
    boolean isNonBlockingAssign() {
        // 获取当前已识别的文本并移除所有空白
        String prevText = getText().replaceAll("\\s+", "");
        // 非阻塞赋值判断条件：
        // 1. 必须以 <= 结尾
        // 2. 不在条件语句上下文中（if/while/for）
        return prevText.endsWith("<=") && 
              !prevText.matches(".*\\b(if|while|for)\\b.*");
    }
}

channels { COMMENTS }

// 关键字（IEEE 1364-2005 附录A.1）
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

// system verilog
INT             : 'int';
SHORTINT        : 'shortint';
LONGINT         : 'longint';
BYTE            : 'byte';
BIT             : 'bit';
LOGIC           : 'logic';

// 完整数字常量模式
BINARY_CONSTANT
    : SIZE_DIGIT? SINGLE_QUOTE [bB] [01xXzZ_]+
    | SINGLE_QUOTE [01xXzZ]
    ;

// 标量常量特例（作为 BINARY_CONSTANT 的子集）
SCALAR_CONSTANT
    : '1\'b' [01]
    | '1\'B' [01]
    | '\'' [01]
    ;

// fragment 声明（表示该规则只能被其他词法规则引用，不能单独作为 token）
fragment DECIMAL_NUMBER
    : [0-9]+ ('_' [0-9]+)*                          // 纯整数
    | [0-9]+ ('_' [0-9]+)* '.' [0-9]+ ('_' [0-9]+)* // 小数
    | ( [0-9]+ ('_' [0-9]+)* | [0-9]+ ('_' [0-9]+)* '.' [0-9]+ ('_' [0-9]+)* )
      [eE] [+-]? [0-9]+ ('_' [0-9]+)*              // 科学计数法
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

// 数字常量（IEEE 1364-2005 第2.5节）
NUMBER
    : DECIMAL_NUMBER
    | OCTAL_NUMBER
    | BINARY_NUMBER
    | HEX_NUMBER
    | REAL_NUMBER
    ;

// 标识符（IEEE 1364-2005 第2.7节）
IDENTIFIER
    : SIMPLE_IDENTIFIER
    | ESCAPED_IDENTIFIER
    ;


// 标准表8-3/8-4/8-5中的符号
BANG: '!';
TILDE_CARET : '~^';  // 必须在 TILDE 和 CARET 之前定义
CARET_TILDE : '^~';  // 必须在 TILDE 和 CARET 之前定义

ONESTEP: 'x' | 'X';  // 标准允许的初始化简写
// 定义所有词法规则（大写开头）
STRING : '"' .*? '"' ;                      // 字符串规则
SIMPLE_IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_$]* ;  // 普通标识符
ESCAPED_IDENTIFIER : '\\' ~[ \r\t\n]+ ;     // 转义标识符（如 \abc ）

// 运算符（IEEE 1364-2005 第4.1节）

AND3            : '&&&';
PLUS            : '+';
MINUS           : '-';
STAR            : '*';
DIV             : '/';
MOD             : '%';
LOG_AND         : '&&';
LOG_OR          : '||';
LOG_NOT         : '!' { _input.LA(1) != '=' }?; // 确保不是 != 的情况
LOG_EQ          : '==';
LOG_NEQ         : '!=';
CASE_EQ         : '===';
CASE_NEQ        : '!==';
BIT_AND         : '&';
BIT_OR          : '|';
BIT_NOT         : '~';
BIT_XOR         : '^';
BIT_XNOR        : TILDE_CARET | CARET_TILDE;
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
ASSIGN_LE: '<=' { !isInAssignContext() }?; // 需要上下文判断
ASSIGN_NB: '<=' { isNonBlockingAssign() }?; // 需要上下文判断
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

PLUS_COLON      : '+:';
MINUS_COLON     : '-:';
IMPLIES         : '=>';
STAR_GT         : '*>';

SINGLE_QUOTE    : '\'';
BINARY_VALUE    : [01xXzZ];
BINARY_DIGIT    : [01];
SIZE_DIGIT      : [0-9]+;

// UDP专用符号（IEEE 1364-2005 第8.2节）
fragment UDP_EDGE: '(' BINARY_DIGIT BINARY_DIGIT ')';
UDP_EDGE_SYMBOL: UDP_EDGE;

// 系统任务和函数
DOLLAR_SETUP    : '$setup';
DOLLAR_HOLD     : '$hold';
DOLLAR_WIDTH    : '$width';
DOLLAR_RECOVERY : '$recovery';
DOLLAR_SKEW     : '$skew';

// 数字常量
BINARY_0        : '1\'b0';
BINARY_1        : '1\'b1';
BINARY_UPPER_0  : '1\'B0';
BINARY_UPPER_1  : '1\'B1';
QUOTED_0        : '\'0';
QUOTED_1        : '\'1';

// 门级原语延迟符号
ARROW           : '->';
ARROW_ARROW     : '->>';

// 相关保留字（如有需要）
PULSE           : 'pulse';
FULLSKEW        : 'fullskew';

POLARITY_OP     : '+' | '-';

// 基础空白和注释
WS              : [ \t\r\n]+ -> channel(HIDDEN);
BLOCK_COMMENT   : '/*' .*? '*/' -> channel(COMMENTS);
LINE_COMMENT    : '//' ~[\r\n]* -> channel(COMMENTS);