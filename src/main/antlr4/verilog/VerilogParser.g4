parser grammar VerilogParser;

options {
    output = AST; // 保持AST生成
    tokenVocab = VerilogLexer;
}

//===========================================================================//
// 源文本结构 (Source Text Structure) - IEEE 1364-2005 Section 3
// 定义Verilog源文件的顶级结构，包含一个或多个描述块。
//===========================================================================//
source_text
    : ( description )* EOF
    ;

//===========================================================================//
// 描述块 (Description) - IEEE 1364-2005 Section 3
// 一个描述块只能是模块声明。
//===========================================================================//
description
    : module_declaration
    ;

//===========================================================================//
// 模块声明 (Module Declaration) - IEEE 1364-2005 Section 3.12
// 定义一个Verilog模块。
//===========================================================================//
module_declaration
    : ( attribute_instance )* module_keyword module_identifier
      ( parameter_port_list )?
      ( ansi_port_list )? SEMI
      module_body
      ENDMODULE
    ;

module_body
    : module_item*
    ;

module_keyword
    : MODULE | MACROMODULE ;

//===========================================================================//
// 模块项 (Module Item) - IEEE 1364-2005 Section 3.12
// 模块内部的各种声明、定义和行为块等。
//===========================================================================//
module_item
    : port_declaration SEMI
    | non_port_module_item
    ;

//===========================================================================//
// 非端口模块项分组 (Grouped Non-Port Module Items)
// 将模块内部非端口声明的项进行分组。
//===========================================================================//
non_port_module_item
    : module_declaration_item
    | continuous_assign
    | parameter_override
    | module_procedural_item
    ;

// 模块内部的声明项
module_declaration_item
    : parameter_declaration
    | local_parameter_declaration
    | net_declaration
    | reg_declaration
    | integer_declaration
    ;

// 模块内部的行为块项
module_procedural_item
    : initial_construct
    | always_construct
    ;

//===========================================================================//
// 参数和局部参数声明 (Parameter and Localparam Declaration) - IEEE 1364-2005 Section 12.1
// 定义参数或局部参数。
//===========================================================================//
parameter_declaration
    : (PARAMETER | LOCALPARAM)
      ( SIGNED )? ( range )?
      list_of_param_assignments SEMI
    ;

local_parameter_declaration
    : LOCALPARAM list_of_param_assignments SEMI
    ;

range
    : LBRACK constant_expression COLON constant_expression RBRACK
    ;

//===========================================================================//
// 参数覆盖 (Parameter Override / Defparam) - IEEE 1364-2005 Section 12.2.5
// 使用defparam关键字覆盖参数值。
//===========================================================================//
parameter_override
    : DEFPARAM list_of_defparam_assignments SEMI
    ;

list_of_defparam_assignments
    : defparam_assignment ( COMMA defparam_assignment )*
    ;

defparam_assignment
    : hierarchical_parameter_identifier ASSIGN constant_expression
    ;

//===========================================================================//
// 参数赋值列表 (List of Parameter Assignments)
// 用于参数声明和参数端口列表。
//===========================================================================//
list_of_param_assignments
    : param_assignment ( COMMA param_assignment )*
    ;

param_assignment
    : parameter_identifier ( ASSIGN_EQ constant_expression )?
    ;

hierarchical_parameter_identifier
    : ( identifier DOT )* parameter_identifier
    ;

parameter_identifier
    : identifier
    ;

//===========================================================================//
// 参数端口列表 (Parameter Port List) - IEEE 1364-2005 Section 12.2
// 模块头部可选的参数列表。
//===========================================================================//
parameter_port_list
    : HASH LPAREN ( param_assignment ( COMMA param_assignment )* )? RPAREN
    ;

//===========================================================================//
// ANSI C 风格端口列表 (ANSI C Style Port List)
// 模块头部可选的端口列表，包含方向、类型和名称。
//===========================================================================//
ansi_port_list
    : LPAREN
      ( ansi_port_declaration (COMMA ansi_port_declaration)* )?
      RPAREN
    ;

// ANSI C 风格端口声明 (用于模块头部)
ansi_port_declaration
    : (BLOCK_COMMENT|LINE_COMMENT)*
      (
        ( attribute_instance )* port_direction ( net_type )? ( range )? list_of_port_identifiers
        | ( attribute_instance )* port_direction REG ( range )? list_of_port_identifiers
        | ( attribute_instance )* ( net_type )? ( range )? list_of_port_identifiers
        | ( attribute_instance )* REG ( range )? list_of_port_identifiers
      )
      (BLOCK_COMMENT|LINE_COMMENT)*
    ;

//===========================================================================//
// 端口声明 (Port Declaration) - IEEE 1364-2005 Section 12.3
// 模块内部对端口的详细声明。
//===========================================================================//
port_declaration
    : (BLOCK_COMMENT|LINE_COMMENT)*
      (
        ( attribute_instance )* port_direction ( net_type )? ( range )? list_of_port_identifiers
        | ( attribute_instance )* port_direction REG ( range )? list_of_port_identifiers
        | ( attribute_instance )* ( net_type )? ( range )? list_of_port_identifiers
        | ( attribute_instance )* REG ( range )? list_of_port_identifiers
      )
      (BLOCK_COMMENT|LINE_COMMENT)*
    ;

port_direction
    : INPUT
    | OUTPUT
    | INOUT
    ;

net_type
    : WIRE
    | WAND
    | WOR
    | TRI
    | TRIAND
    | TRIOR
    | TRI0
    | TRI1
    | SUPPLY0
    | SUPPLY1
    | UWIRE
    ;

list_of_port_identifiers
    : port_identifier ( COMMA port_identifier )*
    ;

//===========================================================================//
// 属性实例 (Attribute Instance) - IEEE 1364-2005 Section 12.1.3
// 附加用户定义的属性到Verilog语法元素。
//===========================================================================//
attribute_instance
    : LPAREN STAR attr_spec ( COMMA attr_spec )* STAR RPAREN
    ;

attr_spec
    : attr_name ( ASSIGN_EQ constant_expression )?
    ;

attr_name
    : identifier
    ;

//===========================================================================//
// 赋值语句 (Assignment Statements) - IEEE 1364-2005 Section 9.2
// 过程块内的阻塞和非阻塞赋值。
//===========================================================================//
blocking_assignment
    : variable_lvalue ASSIGN_EQ ( delay_or_event_control )? expression
    ;

non_blocking_assignment
    : variable_lvalue LE_OP ( delay_or_event_control )? expression
    ;

variable_lvalue
    : hierarchical_variable_identifier ( select_or_range )?
    | LBRACE variable_lvalue ( COMMA variable_lvalue )* RBRACE
    ;

select_or_range
    : LBRACK range_expression RBRACK
    ;

hierarchical_variable_identifier
    : ( identifier ( DOT identifier )* )
    ;

hierarchical_identifier
    : (identifier constant_bit_select? DOT)* identifier constant_bit_select?
    ;

constant_bit_select
    : LBRACK constant_expression RBRACK
    ;

bit_select
    : LBRACK expression RBRACK
    ;

range_expression
    : expression ( COLON expression )?
    ;

//===========================================================================//
// 时序控制 (Timing Control) - IEEE 1364-2005 Section 9.7
// 延迟和事件控制。
//===========================================================================//
delay_or_event_control
    : delay_control
    | event_control
    ;

delay_control
    : HASH delay_value
    | HASH LPAREN mintypmax_expression RPAREN
    ;

delay_value
    : NUMBER
    | identifier
    ;

event_control
    : AT ( attribute_instance )* ( LPAREN event_expression_list RPAREN | STAR )
    ;

// 优化事件表达式，支持 'posedge clk or negedge rst_n'
event_expression_list
    : event_primary ( ( OR | COMMA ) event_primary )*
    ;

event_primary
    : ( POSEDGE | NEGEDGE )? expression
    ;

//===========================================================================//
// 表达式 (Expression) - IEEE 1364-2005 Section 4
// 定义各种表达式的语法。
//===========================================================================//
constant_expression
    : constant_primary
    | unary_operator constant_primary
    | constant_expression binary_operator constant_expression
    | constant_expression QUESTION constant_expression COLON constant_expression
    | LPAREN constant_expression RPAREN
    ;

unary_operator
    : PLUS
    | MINUS
    | LOG_NOT
    | BIT_NOT
    | BIT_AND
    | NAND
    | BIT_OR
    | NOR
    | BIT_XOR
    | XNOR
    ;

binary_operator
    : PLUS
    | MINUS
    | STAR
    | DIV
    | MOD
    | LOG_EQ
    | LOG_NEQ
    | CASE_EQ
    | CASE_NEQ
    | BIT_AND
    | BIT_OR
    | BIT_XOR
    | LOG_AND
    | LOG_OR
    | LEFT_SHIFT
    | RIGHT_SHIFT
    | LESS
    | LE_OP
    | GREATER
    | GREATER_EQ
    ;

constant_primary
    : NUMBER
    | parameter_identifier ( LBRACK constant_range_expression RBRACK )?
    | constant_concatenation
    | LPAREN constant_expression RPAREN
    | MINUS NUMBER
    | PLUS NUMBER
    ;

constant_range_expression
    : constant_expression
    | constant_expression COLON constant_expression
    ;

constant_concatenation
    : LBRACE constant_expression ( COMMA constant_expression )* RBRACE
    | LBRACE constant_multi_concatenation RBRACE
    ;

constant_multi_concatenation
    : constant_expression LBRACE constant_expression ( COMMA constant_expression )* RBRACE
    ;

// General expression (can include variables, function calls, etc.)
expression
    : logical_or_expression
    ;

logical_or_expression
    : logical_and_expression ( LOG_OR logical_and_expression )*
    ;

logical_and_expression
    : equality_expression ( LOG_AND equality_expression )*
    ;

equality_expression
    : relational_expression ( ( LOG_EQ | LOG_NEQ | CASE_EQ | CASE_NEQ ) relational_expression )*
    ;

relational_expression
    : shift_expression ( ( LESS | LE_OP | GREATER | GREATER_EQ ) shift_expression )*
    ;

shift_expression
    : additive_expression ( ( LEFT_SHIFT | RIGHT_SHIFT ) additive_expression )*
    ;

additive_expression
    : multiplicative_expression ((PLUS | MINUS) multiplicative_expression)*
    ;

multiplicative_expression
    : unary_expression ((STAR | DIV | MOD) unary_expression)*
    ;

unary_expression
    : (unary_operator)? primary
    ;

primary
    : NUMBER
    | hierarchical_identifier
    | LPAREN expression RPAREN
    | concatenation_expression
    | multiple_concatenation
    ;

concatenation_expression
    : LBRACE expression ( COMMA expression )* RBRACE
    ;

multiple_concatenation
    : LBRACE expression concatenation_expression RBRACE
    ;

mintypmax_expression
    : expression ( COLON expression COLON expression )?
    ;

//===========================================================================//
// 连续赋值 (Continuous Assignment) - IEEE 1364-2005 Section 6
//===========================================================================//
continuous_assign
    : ASSIGN ( drive_strength )? ( delay )? list_of_net_assignments SEMI
    ;

list_of_net_assignments
    : net_assignment ( COMMA net_assignment )*
    ;

net_assignment
    : net_lvalue ASSIGN_EQ expression
    ;

net_lvalue
    : hierarchical_net_identifier ( LBRACK expression RBRACK )?
    | LBRACE net_lvalue ( COMMA net_lvalue )* RBRACE
    ;

hierarchical_net_identifier
    : ( identifier DOT )* identifier
    ;

delay
    : HASH delay_value
    | HASH LPAREN mintypmax_expression ( COMMA mintypmax_expression ( COMMA mintypmax_expression )? )? RPAREN
    ;

//===========================================================================//
// 行为建模 (Behavioral Modeling) - IEEE 1364-2005 Section 9
// initial 和 always 块，以及内部语句。
//===========================================================================//

initial_construct
    : INITIAL statement_or_null
    ;

always_construct
    : ALWAYS ( event_control )?
      statement_or_null
    ;

statement_or_null
    : statement
    | SEMI
    ;

statement
    : blocking_assignment SEMI
    | non_blocking_assignment SEMI
    | conditional_statement // No SEMI here, it's a compound statement
    | case_statement // No SEMI here
    | statement_block // No SEMI here
    | assign_statement SEMI
    | deassign_statement SEMI
    | loop_statement // No SEMI here
    ;

// 条件语句 (Conditional Statement) - IEEE 1364-2005 Section 9.4
// 优化以更明确地处理 else-if 链
conditional_statement
    : IF LPAREN expression RPAREN statement_or_null (else_clause)?
    ;

else_clause
    : ELSE statement_or_null
    | ELSE IF LPAREN expression RPAREN statement_or_null (else_clause)? // 递归处理 else if
    ;

statement_block
    : BEGIN (BLOCK_COMMENT|LINE_COMMENT)*
      ( block_item_declaration )*
      ( statement_or_null )*
      (BLOCK_COMMENT|LINE_COMMENT)*
      END (BLOCK_COMMENT|LINE_COMMENT)*
    ;

// Case statements (case, casez, casex)
case_statement
    : CASE LPAREN expression RPAREN
        case_item+
      ENDCASE
    | CASEZ LPAREN expression RPAREN
        case_item+
      ENDCASE
    | CASEX LPAREN expression RPAREN
        case_item+
      ENDCASE
    ;

case_item
    : expression (COMMA expression)* COLON statement_or_null
    | DEFAULT (COLON)? statement_or_null
    ;

// Procedural continuous assignments (assign, deassign within blocks)
assign_statement    : ASSIGN variable_lvalue ASSIGN_EQ expression ;
deassign_statement  : DEASSIGN variable_lvalue ;

//===========================================================================//
// 循环语句 (Loop Statements) - IEEE 1364-2005 Section 9.5
//===========================================================================//
loop_statement
    : FOR LPAREN list_of_variable_assignments SEMI expression SEMI list_of_variable_assignments RPAREN
      statement_or_null
    ;

list_of_variable_assignments
    : variable_assignment (COMMA variable_assignment)*
    ;

variable_assignment
    : variable_lvalue ASSIGN_EQ expression  // Blocking assignment in assignment list
    | variable_lvalue LE_OP expression  // Non-blocking assignment in assignment list
    ;

// Declarations allowed within a block (begin/end)
block_item_declaration
    : parameter_declaration
    | local_parameter_declaration
    | reg_declaration
    | integer_declaration
    ;

//===========================================================================//
// 网线声明 (Net Declaration) - IEEE 1364-2005 Section 3.2
// 声明各种类型的网线。
//===========================================================================//

net_declaration
    : net_type ( drive_strength )?
      ( VECTORED | SCALARED )?
      ( SIGNED )?
      ( range )?
      ( delay )?
      list_of_net_identifiers_or_assignments SEMI
    ;

list_of_net_identifiers_or_assignments
    : list_of_net_identifiers
    | list_of_net_decl_assignments
    ;

list_of_net_identifiers
    : net_identifier ( COMMA net_identifier )*
    ;

net_identifier
    : identifier ( range )?
    ;

list_of_net_decl_assignments
    : net_decl_assignment ( COMMA net_decl_assignment )*
    ;

net_decl_assignment
    : identifier ( range )? ASSIGN_EQ expression
    ;

//===========================================================================//
// 变量声明 (Variable Declaration) - IEEE 1364-2005 Section 3.3
// 声明各种类型的变量 (reg, integer)。
//===========================================================================//

reg_declaration
    : REG ( SIGNED )? ( range )? list_of_variable_identifiers SEMI
    ;

integer_declaration
    : INTEGER ( range )? list_of_variable_identifiers SEMI
    ;

// 共用子规则
list_of_variable_identifiers
    : variable_identifier ( COMMA variable_identifier )*
    ;

variable_identifier
    : identifier ( range )?
    ;

//===========================================================================//
// 标识符系统 (Identifier System) - IEEE 1364-2005 Section 3.9
// 定义各种上下文中的标识符。
//===========================================================================//
module_identifier
    : identifier
    ;

port_identifier
    : identifier
    ;

// 基础标识符规则 (Assumed from Lexer)
identifier
    : IDENTIFIER
    ;

//===========================================================================//
// 驱动强度 (Drive Strength) - IEEE 1364-2005 Section 3.2.1
// 定义网线或门输出的驱动强度。
//===========================================================================//
drive_strength
    : LPAREN strength0 COMMA strength1 RPAREN
    | LPAREN strength1 COMMA strength0
    ;

strength0
    : SUPPLY0 | STRONG0 | PULL0 | WEAK0
    ;

strength1
    : SUPPLY1 | STRONG1 | PULL1 | WEAK1
    ;
