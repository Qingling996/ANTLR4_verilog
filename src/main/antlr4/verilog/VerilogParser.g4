parser grammar VerilogParser;

options {
    tokenVocab = VerilogLexer;
}

// 源文本结构（IEEE 1364-2005 第3章）
source_text
    : ( description )* EOF
    ;

description
    : module_declaration
    | udp_declaration
    | config_declaration
    ;

// 模块声明（IEEE 1364-2005 第3.12节）
module_declaration
    : ( attribute_instance )* module_keyword module_identifier
      ( parameter_port_list )?
      ( list_of_ports )? SEMI
      ( module_item )*
      ENDMODULE
    ;

module_keyword
    : MODULE
    | MACROMODULE
    ;

/* IEEE 1364-2005 附录A.8 用户定义原语 */
udp_declaration
    : ( attribute_instance )* PRIMITIVE udp_identifier
      LPAREN udp_port_list RPAREN SEMI
      udp_port_declaration+
      udp_body
      ENDPRIMITIVE
    ;

udp_identifier
    : identifier
    ;

// 端口标识符扩展
udp_port_identifier
    : identifier
    ;

// 输出端口标识符（特殊规则）
output_port_identifier
    : identifier
    ;

udp_port_list
    : output_port COMMA input_port ( COMMA input_port )*
    ;

// UDP端口定义
output_port
    : port_identifier
    ;

input_port
    : port_identifier
    ;

// UDP端口声明（IEEE 1364-2005 第8.1.3节）
output_declaration
    : OUTPUT output_port_identifier
    | OUTPUT REG output_port_identifier ( ASSIGN_EQ constant_expression )?
    ;

input_declaration
    : INPUT list_of_udp_port_identifiers
    ;

list_of_udp_port_identifiers
    : udp_port_identifier ( COMMA udp_port_identifier )*
    ;

udp_port_declaration
    : output_declaration SEMI
    | input_declaration SEMI
    | reg_declaration SEMI
    ;

udp_body
    : combinational_body
    | sequential_body
    ;

combinational_body
    : TABLE combinational_entry+ ENDTABLE
    ;

// 组合逻辑表条目（标准表8-1）
combinational_entry
    : level_input_list COLON output_symbol SEMI
    ;


sequential_body
    : ( udp_initial_stmt )? TABLE sequential_entry + ENDTABLE
    ;

// 时序逻辑表条目（标准表8-2）
sequential_entry
    : seq_input_list COLON current_state COLON next_state SEMI
    ;

udp_initial_stmt
    : INITIAL output_port_identifier ASSIGN_EQ init_val SEMI
    ;

// 输入电平列表（标准第8.2.1节）
level_input_list
    : level_symbol+
    ;

// 序列输入列表（标准第8.2.2节）
seq_input_list
    : seq_symbol+
    ;

// 初始化值（标准第8.2.3节）
init_val
    : BINARY_NUMBER
    | DECIMAL_NUMBER
    | ONESTEP
    | ONESTEP BINARY_NUMBER
    ;

// 电平符号定义（标准表8-3）
level_symbol
    : BINARY_DIGIT  // 0, 1
    | QUESTION      // ?
    | LOG_NOT          // !
    ;

// 序列符号定义（标准表8-4）
seq_symbol
    : level_symbol
    | UDP_EDGE_SYMBOL   // (01), (10), etc.
    ;

// 输出状态符号（标准表8-5）
output_symbol
    : BINARY_DIGIT
    | QUESTION
    | MINUS         // -
    ;

current_state
    : output_symbol
    ;

next_state
    : output_symbol
    ;
//===========================================================================//
// 配置声明（标准第13.2节）
//===========================================================================//
config_declaration:
    CONFIG config_identifier SEMI
    ( local_parameter_declaration )*
    design_statement
    ( config_rule_statement )*
    ENDCONFIG ( COLON config_identifier )?
    ;

// 设计语句（标准第13.3节）
design_statement:
    DESIGN ( ( library_identifier DOT )? cell_identifier )? SEMI
    ;

// 配置规则语句（标准第13.4节）
config_rule_statement:
    default_clause liblist_clause SEMI
    | inst_clause liblist_clause SEMI
    | inst_clause use_clause SEMI
    | cell_clause liblist_clause SEMI
    | cell_clause use_clause SEMI
    ;

// 子句规则（标准第13.4.1-13.4.4节）
default_clause: DEFAULT;
inst_clause: INSTANCE inst_name;
cell_clause: CELL ( library_identifier DOT )? cell_identifier;
liblist_clause: LIBLIST ( library_identifier )*;
use_clause: USE ( library_identifier DOT )? cell_identifier ( COLON CONFIG )?;

// 辅助规则
config_identifier: identifier;
inst_name: identifier ( DOT identifier )*;
library_identifier: identifier;
cell_identifier: identifier;
//===============================================================//
// 参数端口列表（IEEE 1364-2005 第12.2节）
//===============================================================//
// 参数声明部分（保持原有简洁格式）
parameter_declaration
    : (PARAMETER | LOCALPARAM) 
      ( SIGNED )? ( range )? 
      list_of_param_assignments SEMI
    ;

// 参数覆盖部分（使用完整格式）
parameter_override
    : DEFPARAM list_of_defparam_assignments SEMI  // 修改规则名避免歧义
    ;
list_of_defparam_assignments
    : defparam_assignment ( COMMA defparam_assignment )*
    ;
defparam_assignment
    : hierarchical_parameter_identifier ASSIGN constant_expression  // 强制要求赋值
    ;

list_of_param_assignments
    : param_assignment ( COMMA param_assignment )*
    ;

param_assignment
    : parameter_identifier ( ASSIGN_EQ constant_expression )?  // 兼容原有规则
    | hierarchical_parameter_identifier ASSIGN constant_expression  // 新增defparam专用格式
    ;

hierarchical_parameter_identifier
    : ( identifier DOT )* parameter_identifier
    ;

parameter_identifier
    : identifier
    ;

parameter_port_list
    : HASH LPAREN ( param_assignment ( COMMA param_assignment )* )? RPAREN
    ;

local_parameter_declaration
    : LOCALPARAM ( parameter_type list_of_param_assignments
                   | list_of_param_assignments )
    ;

parameter_type
    : integer_type
    | real_type
    | realtime_type
    | time_type
    | signed_type
    | unsigned_type
    | type_identifier  // 用户定义类型
    ;

// 基础类型（标准第4章）
integer_type
    : INTEGER       // Verilog标准类型
    | REG           // Verilog寄存器类型
    | INT           // SystemVerilog短整型
    | SHORTINT      // SystemVerilog短整型
    | LONGINT       // SystemVerilog长整型
    | BYTE          // SystemVerilog字节类型
    | BIT           // SystemVerilog二进制类型
    | LOGIC         // SystemVerilog四态逻辑
    ;
real_type : REAL | REALTIME;
realtime_type: REALTIME;
time_type: TIME;
signed_type: SIGNED;
unsigned_type: UNSIGNED;

type_identifier
    : identifier  // 用户定义类型名
    ;

//======================================================================//
// 端口声明（IEEE 1364-2005 第12.3节）
//======================================================================//
list_of_ports
    : LPAREN port ( COMMA port )* RPAREN
    | LPAREN RPAREN
    ;

port
    : ( attribute_instance )* port_expression?
    | ( attribute_instance )* DOT port_identifier LPAREN port_expression? RPAREN
    ;

port_expression
    : port_reference
    | LBRACE port_reference ( COMMA port_reference )* RBRACE
    ;

port_reference
    : port_identifier
    | port_identifier LBRACK constant_expression RBRACK
    | port_identifier LBRACK range_expression RBRACK
    ;

// 模块项（IEEE 1364-2005 第3.12节）
module_item
    : port_declaration SEMI
    | non_port_module_item
    ;

port_declaration
    : ( port_type )? ( range )? list_of_port_identifiers
    ;

port_type
    : net_type
    | REG ( range )?
    ;

range
    : LBRACK constant_expression COLON constant_expression RBRACK
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
    ;

port_direction
    : INPUT
    | OUTPUT
    | INOUT
    ;

list_of_port_identifiers
    : port_identifier ( COMMA port_identifier )*
    ;


// 非端口模块项（IEEE 1364-2005 第3.12节）
non_port_module_item
    : generate_region
    | parameter_override SEMI
    | gate_instantiation
    | udp_instantiation
    | module_instantiation
    | specify_block
    | initial_construct
    | always_construct
    | continuous_assign SEMI
    | net_declaration
    | reg_declaration
    | time_declaration SEMI
    | integer_declaration SEMI
    | real_declaration SEMI
    | event_declaration SEMI
    | genvar_declaration SEMI
    | task_declaration
    | function_declaration
    | local_parameter_declaration SEMI
    | parameter_declaration SEMI
    ;
/* ================================================================================================  */
/*                                          generate_region                                          */
/* ================================================================================================  */
generate_region
    : GENERATE ( generate_item )* ENDGENERATE
    ;

generate_item
    : module_or_generate_item
    | generate_conditional_statement
    | generate_case_statement
    | generate_loop_statement
    | generate_block
    ;

module_or_generate_item
    : parameter_override
    | gate_instantiation
    | module_instantiation
    | net_declaration
    | reg_declaration
    | continuous_assign
    | initial_construct
    | always_construct
    | generate_region
    ;

block_identifier
    : identifier
    ;

generate_block
    : BEGIN ( COLON block_identifier )? 
      ( generate_item )* 
      END
    ;

generate_conditional_statement
    : IF LPAREN constant_expression RPAREN generate_item
      ( ELSE generate_item )?
    ;

generate_case_statement
    : CASE LPAREN constant_expression RPAREN
      generate_case_item+
      ENDCASE
    ;

generate_case_item
    : constant_expression ( COMMA constant_expression )* COLON generate_item
    | DEFAULT ( COLON )? generate_item
    ;

generate_loop_statement
    : FOR LPAREN genvar_initialization SEMI constant_expression SEMI genvar_iteration RPAREN
      generate_item
    ;

genvar_initialization
    : genvar_identifier ASSIGN constant_expression
    ;

genvar_iteration
    : genvar_identifier ASSIGN genvar_expression
    ;

genvar_expression
    : constant_expression
    ;

/* ================================================================================================  */
/*                                         genvar_declaration                                        */
/* ================================================================================================  */

genvar_declaration
    : GENVAR list_of_genvar_identifiers SEMI
    ;

list_of_genvar_identifiers
    : genvar_identifier ( COMMA genvar_identifier )*
    ;

genvar_identifier
    : identifier
    ;

/* ================================================================================================  */
/*                                        module_instantiation                                       */
/* ================================================================================================  */
module_instantiation
    : module_identifier ( drive_strength )? ( parameter_value_assignment )?
      module_instance ( COMMA module_instance )* SEMI
    ;

parameter_value_assignment
    : HASH LPAREN list_of_parameter_assignments RPAREN
    ;

list_of_parameter_assignments
    : ordered_parameter_assignment ( COMMA ordered_parameter_assignment )*
    | named_parameter_assignment ( COMMA named_parameter_assignment )*
    ;

ordered_parameter_assignment
    : expression
    ;

named_parameter_assignment
    : DOT parameter_identifier LPAREN expression? RPAREN
    ;

module_instance
    : name_of_instance LPAREN list_of_port_connections RPAREN
    ;

name_of_instance
    : identifier ( range )?
    ;

list_of_port_connections
    : ordered_port_connection ( COMMA ordered_port_connection )*
    | named_port_connection ( COMMA named_port_connection )*
    ;

ordered_port_connection
    : expression?  // 允许空连接（标准12.3.3）
    ;

named_port_connection
    : DOT port_identifier LPAREN expression? RPAREN
    ;

/* ================================================================================================  */
/*                                         event_declaration                                         */
/* ================================================================================================  */
event_declaration
    : EVENT list_of_event_identifiers SEMI
    ;

list_of_event_identifiers
    : event_identifier ( dimension )? ( COMMA event_identifier ( dimension )? )*
    ;

event_identifier
    : identifier
    ;

dimension
    : LBRACK dimension_expression ( COLON dimension_expression )? RBRACK
    ;

dimension_expression
    : constant_expression  // 必须为常量表达式（标准第4.5节）
    ;

/* IEEE 1364-2005 第12.1.3节 属性实例 */
attribute_instance
    : LPAREN STAR attr_spec ( COMMA attr_spec )* STAR RPAREN
    ;

attr_spec
    : attr_name ( ASSIGN_EQ constant_expression )?
    ;

attr_name
    : identifier
    ;

/* ================================================================================================  */
/*                                赋值语句（IEEE 1364-2005 第9.2节）                                  */
/* ================================================================================================  */
blocking_assignment
    : variable_lvalue ASSIGN_EQ ( delay_or_event_control )? expression SEMI
    ;

non_blocking_assignment
    : variable_lvalue ASSIGN_LE ( delay_or_event_control )? expression SEMI
    ;

variable_lvalue
    : hierarchical_variable_identifier ( select_or_range )?
    | LBRACE variable_lvalue ( COMMA variable_lvalue )* RBRACE
    ;

select_or_range
    : LBRACK range_expression RBRACK    // 位选/片选
    | DOT identifier                    // 结构体成员选择
    ;

hierarchical_variable_identifier
    : ( identifier ( DOT identifier )* ) ( LBRACK constant_expression RBRACK )?
    ;

hierarchical_identifier
    : (identifier constant_bit_select? DOT)* identifier constant_bit_select?
    ;

constant_bit_select
    : LBRACK constant_expression RBRACK
    ;

bit_select
    : LBRACK constant_expression RBRACK
    ;

range_expression
    : LBRACK expression ( COLON expression )? RBRACK  // 包含单比特和范围两种形式
    ;
concatenation
    : LBRACE variable_lvalue ( COMMA variable_lvalue )* RBRACE
    ;
/* ================================================================================================  */
/*                                 条件语句（IEEE 1364-2005 第9.4节）                                 */
/* ================================================================================================  */
conditional_statement
    : IF LPAREN expression RPAREN statement_or_null
      ( ELSE statement_or_null )?
    ;
/* ================================================================================================  */
/*                                 循环语句（IEEE 1364-2005 第9.6节）                                 */
/* ================================================================================================  */
loop_statement
    : FOREVER statement_or_null                         // ForeverLoop
    | REPEAT LPAREN expression RPAREN statement_or_null // RepeatLoop
    | WHILE LPAREN expression RPAREN statement_or_null  // WhileLoop
    | FOR LPAREN 
        for_initialization? SEMI 
        expression? SEMI 
        for_step? 
      RPAREN statement_or_null                          // ForLoop
    ;

for_initialization
    : list_of_variable_assignments
    | data_type_declaration list_of_variable_decl_assignments
    ;

data_type_declaration
    : INTEGER
    | REAL
    | REALTIME
    | TIME
    ;

list_of_variable_decl_assignments
    : variable_decl_assignment (COMMA variable_decl_assignment)*
    ;

variable_decl_assignment
    : identifier (ASSIGN_EQ expression)?
    ;

for_step
    : list_of_variable_assignments
    ;

list_of_variable_assignments
    : variable_assignment (COMMA variable_assignment)*
    ;

variable_assignment
    : variable_lvalue ASSIGN_EQ expression  // 阻塞赋值
    | variable_lvalue ASSIGN_LE expression  // 非阻塞赋值
    ;

/* ================================================================================================  */
/*                                 时序控制（IEEE 1364-2005 第9.7节）                                 */
/* ================================================================================================  */
delay_or_event_control
    : delay_control
    | event_control
    | REPEAT LPAREN expression RPAREN event_control
    ;

delay_control
    : HASH delay_value
    | HASH LPAREN mintypmax_expression RPAREN
    | ARROW delay_value
    | ARROW_ARROW delay_value
    ;

gate_instantiation
    : gate_type (drive_strength)? (delay3)? gate_instance (COMMA gate_instance)* SEMI
    ;

delay3
    : HASH delay_value
    | HASH LPAREN mintypmax_expression (COMMA mintypmax_expression (COMMA mintypmax_expression)?)? RPAREN
    | ARROW delay_value
    | ARROW_ARROW LPAREN delay_value COMMA delay_value RPAREN
    ;

event_control
    : AT LPAREN event_expression RPAREN
    | AT STAR
    | AT LPAREN STAR RPAREN
    ;

event_expression
    : expression
    | hierarchical_event_identifier
    | POSEDGE expression
    | NEGEDGE expression
    | event_expression OR event_expression
    | event_expression COMMA event_expression
    ;

hierarchical_event_identifier
    : ( identifier ( bit_select )? DOT )* event_identifier
    ;

/* ================================================================================================  */
/*                                     IEEE 1364-2005 第4章 表达式                                    */
/* ================================================================================================  */
constant_expression
    : constant_primary
    | unary_operator constant_primary
    | constant_expression binary_operator constant_expression
    | constant_expression QUESTION constant_expression COLON constant_expression
    ;

unary_operator
    : PLUS          // +
    | MINUS         // -
    | BANG          // !
    | BIT_NOT       // ~
    | AND           // &
    | NAND          // ~&
    | OR            // |
    | NOR           // ~|
    | XOR           // ^
    | XNOR          // ~^ 或 ^~
    ;       

binary_operator     
    : PLUS          // +
    | MINUS         // -
    | STAR          // *
    | DIV           // /
    | MOD           // %
    | LOG_EQ        // ==
    | LOG_NEQ       // !=
    | CASE_EQ       // ===
    | CASE_NEQ      // !==
    | AND           // &
    | OR            // |
    | XOR           // ^
    | LOG_AND       // &&
    | LOG_OR        // ||
    | LEFT_SHIFT    // <<
    | RIGHT_SHIFT   // >>
    | LESS          // <
    | LESS_EQ       // <=
    | GREATER       // >
    | GREATER_EQ    // >=
    ;

constant_primary
    : number
    | parameter_identifier ( LBRACK constant_range_expression RBRACK )?
    | constant_concatenation
    | constant_function_call
    | LPAREN constant_expression RPAREN
    | system_constant
    ;

constant_range_expression
    : constant_expression
    | constant_expression COLON constant_expression
    | constant_expression PLUS_COLON constant_expression
    | constant_expression MINUS_COLON constant_expression
    ;

constant_concatenation
    : LBRACE constant_expression ( COMMA constant_expression )* RBRACE
    | LBRACE constant_multi_concatenation RBRACE
    ;

constant_multi_concatenation
    : constant_expression LBRACE constant_expression ( COMMA constant_expression )* RBRACE
    ;

constant_function_call
    : function_identifier ( attribute_instance )* 
      LPAREN ( constant_expression ( COMMA constant_expression )* )? RPAREN
    ;

function_identifier
    : hierarchical_identifier
    ;

system_constant
    : TICK identifier
    SINGLE_QUOTE BINARY_VALUE
    ;
/* ================================================================================================  */
/*                                             Expression                                            */
/* ================================================================================================  */
expression
    : primary
    | unary_operator ( attribute_instance )* primary
    | expression ( attribute_instance )* binary_operator ( attribute_instance )* expression
    | expression ( attribute_instance )* QUESTION ( attribute_instance )* expression COLON expression
    | LPAREN expression RPAREN
    | STRING  // 新增字符串支持（标准第3.6节）
    ;

primary
    : number
    | identifier
    | identifier LBRACK range_expression RBRACK
    | concatenation_expression      // 表达式上下文使用
    | multiple_concatenation
    | function_call
    | system_function_call
    | constant_function_call
    | LPAREN mintypmax_expression RPAREN
    ;

concatenation_expression
    : LBRACE expression ( COMMA expression )* RBRACE
    ;

multiple_concatenation
    : LBRACE expression concatenation RBRACE
    ;

concatenation_lvalue
    : LBRACE variable_lvalue ( COMMA variable_lvalue )* RBRACE
    ;

function_call
    : function_identifier ( attribute_instance )* 
      LPAREN ( expression ( COMMA expression )* )? RPAREN
    ;

system_function_call
    : system_identifier ( attribute_instance )* 
      LPAREN ( expression ( COMMA expression )* )? RPAREN
    ;

system_identifier
    : DOLLAR identifier
    ;

mintypmax_expression
    : expression ( COLON expression COLON expression )?
    ;

/* IEEE 1364-2005 第5章 调度语义 */
// (已通过事件控制表达式实现)
// 数据类型（IEEE 1364-2005 第3.2节）

/* ================================================================================================  */
/*                                      IEEE 1364-2005 第6章 赋值                                     */
/* ================================================================================================  */
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
    : hierarchical_net_identifier ( LBRACK constant_expression RBRACK )?
    | LBRACE net_lvalue ( COMMA net_lvalue )* RBRACE
    ;

hierarchical_net_identifier
    : ( identifier DOT )* identifier
    ;

/* ================================================================================================  */
/*                                    IEEE 1364-2005 第7章 门级建模                                   */
/* ================================================================================================  */
gate_instance
    : ( name_of_gate_instance )? LPAREN terminal ( COMMA terminal )* RPAREN
    ;

name_of_gate_instance
    : identifier range?
    ;

gate_type
    : AND | NAND | OR | NOR | XOR | XNOR
    | BUF | NOT | BUFIF0 | BUFIF1 | NOTIF0 | NOTIF1
    | NMOS | PMOS | RNMOS | RPMOS | TRAN | RTRAN
    ;

terminal
    : expression
    ;

/* ================================================================================================  */
/*                                  IEEE 1364-2005 第8章 用户定义原语                                 */
/* ================================================================================================  */

udp_instantiation
    : udp_identifier ( drive_strength )? ( delay )? udp_instance ( COMMA udp_instance )* SEMI
    ;

udp_instance
    : ( name_of_instance )? LPAREN terminal ( COMMA terminal )* RPAREN
    ;

/* ================================================================================================  */
/*                                    IEEE 1364-2005 第9章 行为建模                                   */
/* ================================================================================================  */

initial_construct
    : INITIAL statement_or_null
    ;

always_construct
    : ALWAYS statement_or_null
    ;

statement_or_null
    : statement
    | SEMI
    ;

statement
    : blocking_assignment SEMI
    | non_blocking_assignment SEMI
    | procedural_continuous_assignments SEMI
    | case_statement
    | conditional_statement
    | loop_statement
    | wait_statement
    | disable_statement
    | event_trigger SEMI
    | seq_block
    | par_block
    | task_enable
    | system_task_enable SEMI
    ;

procedural_continuous_assignments
    : assign_statement
    | deassign_statement
    | force_statement
    | release_statement
    ;

assign_statement    : ASSIGN variable_assignment ;
deassign_statement  : DEASSIGN variable_lvalue ;
force_statement     : FORCE (variable_assignment | net_assignment) ;
release_statement   : RELEASE (variable_lvalue | net_lvalue) ;

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

wait_statement  : WAIT LPAREN expression RPAREN statement_or_null ;
event_trigger   : ( ARROW | ARROW_ARROW ) hierarchical_event_identifier ;

hierarchical_task_identifier
    : hierarchical_identifier
    ;

hierarchical_block_identifier
    : hierarchical_identifier
    ;
seq_block
    : BEGIN ( COLON identifier )? 
      block_item_declaration* 
      statement* 
    END
    ;

par_block
    : FORK ( COLON identifier )?
      block_item_declaration*
      statement*
    JOIN
    ;

block_item_declaration
    : parameter_declaration
    | reg_declaration
    | integer_declaration
    | real_declaration
    | time_declaration
    | event_declaration
    | local_parameter_declaration
    ;

task_enable : hierarchical_task_identifier ( LPAREN ( expression ( COMMA expression )* )? RPAREN )? ;
system_task_enable
    : system_task_identifier ( LPAREN task_arg_list? RPAREN )? SEMI
    ;

system_task_identifier
    : DOLLAR identifier
    ;

task_arg_list
    : expression ( COMMA expression )*
    | named_parameter_assignment ( COMMA named_parameter_assignment )*
    ;

/* ================================================================================================  */
/*                                  IEEE 1364-2005 第10章 任务和函数                                  */
/* ================================================================================================  */

task_declaration
    : TASK lifetime? task_identifier SEMI
      tf_port_declaration*
      task_item_declaration*
      statement_or_null*
      ENDTASK
    ;

lifetime
    : STATIC
    | AUTOMATIC
    ;

task_identifier
    : identifier
    ;

tf_port_declaration
    : port_direction range? list_of_port_identifiers SEMI
    ;

task_item_declaration
    : block_item_declaration
    | tf_port_declaration
    ;

function_declaration
    : FUNCTION lifetime? function_data_type? function_identifier SEMI
      function_item_declaration*
      statement_or_null*
      ENDFUNCTION
    ;

function_data_type
    : integer_type
    | real_type
    | range              // 位宽声明
    ;

function_item_declaration
    : block_item_declaration
    | tf_port_declaration
    ;

/* ================================================================================================  */
/*                                     IEEE 1364-2005 第11章 禁用                                     */
/* ================================================================================================  */

disable_statement
    : DISABLE hierarchical_task_identifier SEMI
    | DISABLE hierarchical_block_identifier SEMI
    ;

/* 补充基础规则 */
number
    : NUMBER
    ;

/* ================================================================================================  */
/*                                    IEEE 1364-2005 第14章 指定块                                    */
/* ================================================================================================  */

specify_block
    : SPECIFY
      ( specify_item )*
      ENDSPECIFY
    ;

specify_item
    : specparam_declaration
    | path_declaration
    | system_timing_check
    | state_dependent_path_declaration  
    | polarity_operator_declaration    
    ;

specparam_declaration
    : SPECPARAM list_of_specparam_assignments SEMI
    ;

path_declaration
    : simple_path_declaration
    | edge_sensitive_path_declaration
    | state_dependent_path_declaration
    ;

system_timing_check
    : DOLLAR_SETUP timing_check_event COMMA timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI
    | DOLLAR_HOLD timing_check_event COMMA timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI
    | DOLLAR_WIDTH timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI
    | DOLLAR_RECOVERY timing_check_event COMMA timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI
    | DOLLAR_SKEW timing_check_event COMMA timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI
    ;

timing_check_event
    : (edge_control)? module_path_expression (AND3 timing_check_condition)?
    ;

edge_control
    : POSEDGE | NEGEDGE
    ;

module_path_expression
    : module_path_primary
    | unary_module_path_operator module_path_primary
    | module_path_expression binary_module_path_operator module_path_expression
    ;

module_path_primary
    : number
    | identifier
    | LPAREN module_path_expression RPAREN
    ;

unary_module_path_operator
    : LOG_NOT | BIT_NOT | BIT_AND | REDUCE_NAND | BIT_OR | REDUCE_NOR | BIT_XOR | BIT_XNOR
    ;

binary_module_path_operator
    : LOG_EQ | LOG_NEQ | LOG_AND | LOG_OR 
    | BIT_AND | BIT_OR | BIT_XOR | BIT_XNOR
    | RIGHT_SHIFT | LEFT_SHIFT | SHRA | SHLA
    | PLUS | MINUS | STAR | DIV | MOD
    ;

timing_check_condition
    : simple_expression
    | BIT_NOT simple_expression
    ;

simple_expression
    : identifier
    | LPAREN expression RPAREN
    ;

timing_check_limit
    : constant_expression
    | constant_mintypmax_expression
    ;

constant_mintypmax_expression
    : constant_expression ( COLON constant_expression COLON constant_expression )?
    ;

notifier_control
    : identifier
    | hierarchical_identifier
    ;

list_of_specparam_assignments
    : specparam_assignment (COMMA specparam_assignment)*
    ;

specparam_assignment
    : identifier ASSIGN_EQ constant_expression
    | identifier ASSIGN_EQ constant_mintypmax_expression
    ;

/* ================================================================================================  */
/*                                      simple_path_declaration                                      */
/* ================================================================================================  */

simple_path_declaration
    : parallel_path_description ASSIGN_EQ path_delay_value
    | full_path_description ASSIGN_EQ path_delay_value
    ;

parallel_path_description
    : LPAREN specify_input_terminal_descriptor ( polarity_operator )? IMPLIES 
      specify_output_terminal_descriptor RPAREN
    ;

full_path_description
    : LPAREN list_of_path_inputs ( polarity_operator )? STAR_GT list_of_path_outputs RPAREN
    ;

path_delay_value
    : list_of_path_delay_expressions
    | LPAREN list_of_path_delay_expressions RPAREN
    ;

specify_input_terminal_descriptor
    : input_identifier ( LBRACK constant_range_expression RBRACK )?
    ;

specify_output_terminal_descriptor
    : output_identifier ( LBRACK constant_range_expression RBRACK )?
    ;

input_identifier
    : identifier
    | hierarchical_identifier
    ;

output_identifier
    : identifier
    | hierarchical_identifier
    ;

list_of_path_inputs
    : specify_input_terminal_descriptor ( COMMA specify_input_terminal_descriptor )*
    ;

list_of_path_outputs
    : specify_output_terminal_descriptor ( COMMA specify_output_terminal_descriptor )*
    ;

list_of_path_delay_expressions
    : path_delay_expression ( COMMA path_delay_expression )*
    ;

path_delay_expression
    : constant_mintypmax_expression
    ;

polarity_operator
    : PLUS
    | MINUS
    ;

/* ================================================================================================  */
/*                                  edge_sensitive_path_declaration                                  */
/* ================================================================================================  */

edge_sensitive_path_declaration
    : IF LPAREN conditional_port_expression RPAREN path_description ASSIGN_EQ path_delay_value
    | IFNONE path_description ASSIGN_EQ path_delay_value
    ;

conditional_port_expression
    : port_expression
    | LOG_NOT port_expression
    | port_expression LOG_EQ scalar_constant
    | port_expression CASE_EQ scalar_constant
    ;

path_description
    : parallel_edge_sensitive_path_description
    | full_edge_sensitive_path_description
    ;

parallel_edge_sensitive_path_description
    : LPAREN edge_identifier? specify_input_terminal_descriptor IMPLIES 
      LPAREN specify_output_terminal_descriptor polarity_operator? COLON data_source_expression RPAREN RPAREN
    ;

full_edge_sensitive_path_description
    : LPAREN edge_identifier? list_of_path_inputs STAR_GT 
      LPAREN list_of_path_outputs polarity_operator? COLON data_source_expression RPAREN RPAREN
    ;

edge_identifier
    : POSEDGE
    | NEGEDGE
    ;

data_source_expression
    : port_expression
    ;

scalar_constant
    : SCALAR_CONSTANT
    | BINARY_CONSTANT
    ;

/* ================================================================================================  */
/*                                  state_dependent_path_declaration                                 */
/* ================================================================================================  */

state_dependent_path_declaration
    : IF LPAREN module_path_expression RPAREN simple_path_declaration
    | IF LPAREN module_path_expression RPAREN edge_sensitive_path_declaration
    | IFNONE simple_path_declaration
    ;

polarity_operator_declaration
    : POSEDGE path_description ASSIGN_EQ path_delay_value
    | NEGEDGE path_description ASSIGN_EQ path_delay_value
    ;

/* ================================================================================================  */
/*                                          net_declaration                                          */
/* ================================================================================================  */

net_declaration
    : net_type ( drive_strength )? 
      ( VECTORED | SCALARED )?
      ( SIGNED )?
      ( delay )?
      list_of_net_identifiers SEMI
    | net_type ( drive_strength )?
      ( SIGNED )?
      ( delay )?
      list_of_net_decl_assignments SEMI
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

/* ================================================================================================  */
/*                                              变量声明                                              */
/* ================================================================================================  */

reg_declaration
    : REG ( range )? list_of_variable_identifiers SEMI
    ;

integer_declaration
    : INTEGER list_of_variable_identifiers SEMI
    ;

real_declaration
    : REAL list_of_real_identifiers SEMI
    ;

time_declaration
    : TIME list_of_variable_identifiers SEMI
    ;

realtime_declaration
    : REALTIME list_of_real_identifiers SEMI
    ;

// 共用子规则
list_of_variable_identifiers
    : variable_identifier ( COMMA variable_identifier )*
    ;

list_of_real_identifiers
    : real_identifier ( COMMA real_identifier )*
    ;

variable_identifier
    : identifier ( range )?
    ;

real_identifier
    : identifier
    ;

// 标识符系统（IEEE 1364-2005 第3.9节）
module_identifier
    : identifier
    ;

// 基础标识符规则（需确保已存在）
identifier
    : SIMPLE_IDENTIFIER
    | ESCAPED_IDENTIFIER
    ;

port_identifier
    : identifier
    ;

// 驱动强度（IEEE 1364-2005 第3.2.1节）
drive_strength
    : LPAREN strength0 COMMA strength1 RPAREN
    | LPAREN strength1 COMMA strength0 RPAREN
    | LPAREN strength0 COMMA highz1 RPAREN
    | LPAREN strength1 COMMA highz0 RPAREN
    | LPAREN highz0 COMMA strength1 RPAREN
    | LPAREN highz1 COMMA strength0 RPAREN
    ;

strength0
    : SUPPLY0 | STRONG0 | PULL0 | WEAK0
    ;

strength1
    : SUPPLY1 | STRONG1 | PULL1 | WEAK1
    ;

highz0
    : HIGHZ0
    ;

highz1
    : HIGHZ1
    ;

// 延迟控制（IEEE 1364-2005 第3.2.2节）
delay
    : HASH delay_value
    | HASH LPAREN mintypmax_expression ( COMMA mintypmax_expression ( COMMA mintypmax_expression )? )? RPAREN
    ;

delay_value
    : number
    | identifier
    ;
