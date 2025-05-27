parser grammar VerilogParser;

options {
    tokenVocab = VerilogLexer; // 明确指定词法分析器
}

// 语法规则
source_text
    : (module_declaration | module_item)* EOF
    ;

module_declaration
    : MODULE module_identifier (list_of_ports)? SEMICOLON module_item* ENDMODULE
    ;

module_identifier
    : Identifier
    ;

module_item
    : port_declaration
    | parameter_declaration
    | input_declaration
    | output_declaration
    | wire_declaration
    | reg_declaration
    | assignment
    | always_block
    | initial_block
    | generate_block
    | task_declaration
    | function_declaration
    ;

port_declaration
    : INPUT (range)? list_of_port_identifiers SEMICOLON
    | OUTPUT (range)? list_of_port_identifiers SEMICOLON
    | INOUT (range)? list_of_port_identifiers SEMICOLON
    ;

parameter_declaration
    : PARAMETER list_of_param_assignments SEMICOLON
    ;

input_declaration
    : INPUT (range)? list_of_port_identifiers SEMICOLON
    ;

output_declaration
    : OUTPUT (range)? list_of_port_identifiers SEMICOLON
    ;

wire_declaration
    : WIRE (range)? list_of_net_identifiers SEMICOLON
    ;

reg_declaration
    : REG (range)? list_of_variable_identifiers SEMICOLON
    ;

assignment
    : ASSIGN net_lvalue EQUALS expression SEMICOLON
    ;

net_lvalue
    : Identifier
    | bit_select
    | concatenation
    ;

bit_select
    : Identifier LBRACKET expression RBRACKET
    ;

concatenation
    : LBRACE net_lvalue (COMMA net_lvalue)* RBRACE
    ;

always_block
    : ALWAYS AT LPAREN event_expression RPAREN statement
    ;

initial_block
    : INITIAL statement
    ;

generate_block
    : GENERATE generate_item* ENDGENERATE
    ;

generate_item
    : module_item
    | conditional_generate
    | loop_generate
    ;

conditional_generate
    : IF LPAREN expression RPAREN generate_item (ELSE generate_item)?
    ;

loop_generate
    : FOR LPAREN genvar_assignment SEMICOLON expression SEMICOLON genvar_assignment RPAREN generate_item
    ;

genvar_assignment
    : genvar_identifier EQUALS expression
    ;

genvar_identifier
    : Identifier
    ;

task_declaration
    : TASK task_identifier SEMICOLON task_item* ENDTASK
    ;

task_identifier
    : Identifier
    ;

task_item
    : port_declaration
    | reg_declaration
    | statement
    ;

function_declaration
    : FUNCTION (range)? function_identifier SEMICOLON function_item* ENDFUNCTION
    ;

function_identifier
    : Identifier
    ;

function_item
    : port_declaration
    | reg_declaration
    | statement
    ;

statement
    : blocking_assignment SEMICOLON
    | non_blocking_assignment SEMICOLON
    | conditional_statement
    | case_statement
    | for_loop
    | while_loop
    | delay_control
    | event_control
    | task_enable
    | disable_statement
    ;

blocking_assignment
    : variable_lvalue EQUALS expression
    ;

non_blocking_assignment
    : variable_lvalue LE expression
    ;

variable_lvalue
    : Identifier
    | bit_select
    | concatenation
    ;

conditional_statement
    : IF LPAREN expression RPAREN statement (ELSE statement)?
    ;

case_statement
    : CASE LPAREN expression RPAREN case_item+ ENDCASE
    ;

case_item
    : expression (COMMA expression)* COLON statement
    | DEFAULT COLON statement
    ;

for_loop
    : FOR LPAREN assignment SEMICOLON expression SEMICOLON assignment RPAREN statement
    ;

while_loop
    : WHILE LPAREN expression RPAREN statement
    ;

delay_control
    : HASH delay_value statement
    ;

delay_value
    : Decimal_number
    | expression
    ;

event_control
    : AT LPAREN event_expression RPAREN statement
    ;

event_expression
    : expression
    | POSEDGE expression
    | NEGEDGE expression
    ;

task_enable
    : task_identifier (LPAREN list_of_arguments RPAREN)? SEMICOLON
    ;

disable_statement
    : DISABLE task_identifier SEMICOLON
    ;

expression
    : primary
    | unary_operator expression
    | expression binary_operator expression
    | expression '?' expression ':' expression
    | LPAREN expression RPAREN
    ;

primary
    : number
    | identifier
    | LPAREN expression RPAREN
    | concatenation
    | function_call
    ;

function_call
    : function_identifier (LPAREN list_of_arguments RPAREN)?
    ;

list_of_arguments
    : expression (COMMA expression)*
    ;

unary_operator
    : PLUS
    | MINUS
    | BANG
    | BITNOT
    | BITAND
    | BITOR
    | BITXOR
    | BITNOT BITAND
    | BITNOT BITOR
    | BITXOR BITNOT
    ;

binary_operator
    : PLUS
    | MINUS
    | MULT
    | DIV
    | MOD
    | EQ
    | NE
    | AND
    | OR
    | LT
    | GT
    | LE
    | GE
    | BITAND
    | BITOR
    | BITXOR
    | SHL
    | SHR
    | SHRA
    | SHLA
    ;

number
    : Decimal_number
    | Binary_number
    | Octal_number
    | Hex_number
    | Real_number
    ;

identifier
    : Identifier
    ;

range
    : LBRACKET expression COLON expression RBRACKET
    ;

list_of_ports
    : '(' port (',' port)* ')'
    | '(' ')'
    ;

port
    : port_expression?
    | '.' port_identifier '(' port_expression? ')'
    ;

port_identifier
    : Identifier
    ;

port_expression
    : port_reference
    | '{' port_reference (',' port_reference)* '}'
    ;

port_reference
    : port_identifier
    | port_identifier LBRACKET constant_expression RBRACKET
    | port_identifier LBRACKET range_expression RBRACKET
    ;
constant_expression
    : expression
    ;

range_expression
    : expression
    | expression ':' expression
    ;

list_of_port_identifiers
    : identifier (COMMA identifier)*
    ;

list_of_param_assignments
    : param_assignment (COMMA param_assignment)*
    ;

param_assignment
    : identifier EQUALS expression
    ;

list_of_net_identifiers
    : identifier (COMMA identifier)*
    ;

list_of_variable_identifiers
    : identifier (COMMA identifier)*
    ;
