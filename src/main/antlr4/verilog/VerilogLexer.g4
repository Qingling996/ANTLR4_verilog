lexer grammar VerilogLexer;


channels {
    WHITESPACE_CHANNEL,
    COMMENTS_CHANNEL
}

// 基础符号
SEMICOLON   : ';';
LBRACE      : '{';
RBRACE      : '}';
LBRACKET    : '[';
RBRACKET    : ']';
LPAREN      : '(';
RPAREN      : ')';
DOT         : '.';
COMMA       : ',';
COLON       : ':';
HASH        : '#';
AT          : '@';
QMARK       : '?';
EQUALS      : '=';
LE          : '<=';
PLUS        : '+';
MINUS       : '-';
MULT        : '*';
DIV         : '/';
MOD         : '%';
BITAND      : '&';
BITOR       : '|';
BITXOR      : '^';
BITNOT      : '~';
LT          : '<';
GT          : '>';
GE          : '>=';
SHL         : '<<';
SHR         : '>>';
SHRA        : '>>>';
SHLA        : '<<<';

// 关键字
MODULE      : 'module';
ENDMODULE   : 'endmodule';
INPUT       : 'input';
OUTPUT      : 'output';
INOUT       : 'inout';
PARAMETER   : 'parameter';
WIRE        : 'wire';
REG         : 'reg';
ASSIGN      : 'assign';
ALWAYS      : 'always';
INITIAL     : 'initial';
GENERATE    : 'generate';
ENDGENERATE : 'endgenerate';
IF          : 'if';
ELSE        : 'else';
FOR         : 'for';
TASK        : 'task';
ENDTASK     : 'endtask';
FUNCTION    : 'function';
ENDFUNCTION : 'endfunction';
CASE        : 'case';
ENDCASE     : 'endcase';
DEFAULT     : 'default';
WHILE       : 'while';
POSEDGE     : 'posedge';
NEGEDGE     : 'negedge';
DISABLE     : 'disable';

// 运算符
EQ          : '==';
NE          : '!=';
AND         : '&&';
OR          : '||';
BANG        : '!' ;

// 其他可能缺失的符号
DOLLAR      : '$';
BACKTICK    : '`';

// 数字字面量
Binary_number
    : [01]+ '\'' [bB] [01]+
    ;
Octal_number
    : [0-7]+ '\'' [oO] [0-7]+
    ;
Decimal_number
    : [0-9]+
    ;
Hex_number
    : [0-9a-fA-F]+ '\'' [hH] [0-9a-fA-F]+
    ;
Real_number
    : [0-9]+ '.' [0-9]+
    ;

// 标识符
Identifier
    : [a-zA-Z_] [a-zA-Z0-9_$]*
    ;

// 空白和注释
Whitespace
    : [ \t\r\n]+ -> channel(WHITESPACE_CHANNEL)
    ;

LineComment
    : '//' ~[\r\n]* -> channel(COMMENTS_CHANNEL)
    ;

BlockComment
    : '/*' .*? '*/' -> channel(COMMENTS_CHANNEL)
    ;
