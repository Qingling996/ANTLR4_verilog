lexer grammar VerilogLexer;

// 移除所有 @lexer::members 块，Lexer 应该尽可能无状态
// @lexer::members {
//     boolean isInAssignContext() { /* ... */ }
//     boolean isNonBlockingAssign() { /* ... */ }
//     private boolean inNumberContext() { /* ... */ }
//     @Override public void recover(RecognitionException e) { /* ... */ }
//     private void notifyListeners(String msg) { /* ... */ }
// }

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
OR              : 'or'; // 关键字 'or'
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

// SystemVerilog Keywords (如果需要支持SystemVerilog数据类型)
INT             : 'int';
SHORTINT        : 'shortint';
LONGINT         : 'longint';
BYTE            : 'byte';
BIT             : 'bit';
LOGIC           : 'logic';

// =========================================================================
// Multi-character Operators (多字符操作符) - 必须在单字符操作符之前定义
// =========================================================================
AND3            : '&&&';
LOG_AND         : '&&';
LOG_OR          : '||';
LOG_EQ          : '==';
LOG_NEQ         : '!=';
CASE_EQ         : '===';
CASE_NEQ        : '!==';
LE_OP           : '<='; // 合并 ASSIGN_LE 和 LESS_EQ ，由 Parser 区分
LEFT_SHIFT      : '<<';
RIGHT_SHIFT     : '>>';
SHRA            : '>>>';
SHLA            : '<<<';
GREATER_EQ      : '>=';
TILDE_CARET     : '~^';  // 必须在 BIT_NOT 和 BIT_XOR 之前定义
CARET_TILDE     : '^~';  // 必须在 BIT_NOT 和 BIT_XOR 之前定义
REDUCE_NOR      : '~|';
REDUCE_NAND     : '~&';
IMPLIES         : '=>';
STAR_GT         : '*>';
PLUS_COLON      : '+:';
MINUS_COLON     : '-:';
ARROW           : '->';
ARROW_ARROW     : '->>';

// =========================================================================
// Single-character Operators and Punctuation (单字符操作符和标点符号)
// =========================================================================
PLUS            : '+';
MINUS           : '-';
STAR            : '*';
DIV             : '/';
MOD             : '%';
LOG_NOT         : '!' { _input.LA(1) != '=' }?; // 确保不是 != 的情况
BIT_AND         : '&';
BIT_OR          : '|';
BIT_NOT         : '~';
BIT_XOR         : '^';
LESS            : '<';
GREATER         : '>';
ASSIGN_EQ       : '=';
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

// =========================================================================
// Identifiers (标识符) - 必须在所有关键字之后定义
// =========================================================================
IDENTIFIER
    : SIMPLE_IDENTIFIER
    | ESCAPED_IDENTIFIER
    ;

SIMPLE_IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_$]*;  // 普通标识符
ESCAPED_IDENTIFIER : '\\' ~[ \r\t\n]+ ;     // 转义标识符（如 \abc ）

// =========================================================================
// Numbers (数字字面量) - 必须在标识符之后定义，以避免歧义
// =========================================================================
NUMBER
    : SIZED_NUMBER // 优先匹配带位宽的数字，如 16'd0, 1'b0
    | DECIMAL_NUMBER_NO_SIZE // 匹配不带位宽的十进制数，如 123, 3.14, 1e-6
    ;

// 带位宽和基数的数字 (例如 16'd0, 1'b0, 8'hFF)
SIZED_NUMBER
    : SIZE_PREFIX? '\'' [sS]? [bB] [01xXzZ_]+ // Binary
    | SIZE_PREFIX? '\'' [sS]? [oO] [0-7xXzZ_]+ // Octal
    | SIZE_PREFIX? '\'' [sS]? [dD] [0-9xXzZ_]+ // Decimal
    | SIZE_PREFIX? '\'' [sS]? [hH] [0-9a-fA-FxXzZ_]+ // Hex
    ;

// 不带位宽的十进制数和实数
DECIMAL_NUMBER_NO_SIZE
    : DECIMAL_DIGIT+ ([eE] [+-]? DECIMAL_DIGIT+)? // Integer or scientific notation (e.g., 123, 1e6)
    | DECIMAL_DIGIT* '.' DECIMAL_DIGIT+ ([eE] [+-]? DECIMAL_DIGIT+)? // Floating point (e.g., .5, 3.14, 1.2e-3)
    ;

// =========================================================================
// Other Literals and Symbols
// =========================================================================
STRING : '"' ( ~[ "\r\n\\] | '\\' . )* '"' ; // 字符串规则，处理转义字符
ONESTEP: 'x' | 'X'; // UDP初始化简写

// UDP专用符号（IEEE 1364-2005 第8.2节）
// UDP专用符号（IEEE 1364-2005 第8.2节）
fragment BINARY_DIGIT
    : [01xXzZ]
    ;
UDP_EDGE_SYMBOL: '(' BINARY_DIGIT BINARY_DIGIT ')'; // 例如 (01)

// 系统任务和函数
DOLLAR_SETUP    : '$setup';
DOLLAR_HOLD     : '$hold';
DOLLAR_WIDTH    : '$width';
DOLLAR_RECOVERY : '$recovery';
DOLLAR_SKEW     : '$skew';
DOLLAR_TIMESKEW : '$timeskew';
DOLLAR_FULLSKEW : '$fullskew';
DOLLAR_PERIOD   : '$period';
DOLLAR_NOCHANGE : '$nochange';

// 其他可能需要的保留字或特殊符号
PULSE           : 'pulse';
FULLSKEW        : 'fullskew'; // 已经作为关键字，这里可能重复

// =========================================================================
// Whitespace and Comments (空白和注释) - 通常放在最后，并设置为跳过或发送到特定通道
// =========================================================================
WS              : [ \t\r\n]+ -> skip; // 跳过空白字符
BLOCK_COMMENT   : '/*' .*? '*/' -> channel(COMMENTS); // 发送到 COMMENTS 通道
LINE_COMMENT    : '//' ~[\r\n]* -> channel(COMMENTS); // 发送到 COMMENTS 通道

// =========================================================================
// Error Handling (错误处理)
// =========================================================================
// UNMATCHED_QUOTE : '\'' ; // 移除，因为 Lexer 内部的谓词已移除，此规则不再有意义
