parser grammar VerilogParser;

options {
    output = AST; // 保持AST生成
    tokenVocab = VerilogLexer;
}

// 在tokens段添加JSON节点类型
tokens {
    JSON_OBJECT,
    JSON_ARRAY,
    JSON_PAIR 
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
// 一个描述块可以是模块、用户定义原语或配置。
//===========================================================================//
description
    : module_declaration
    | udp_declaration
    | config_declaration
    ;

//===========================================================================//
// 模块声明 (Module Declaration) - IEEE 1364-2005 Section 3.12
// 定义一个Verilog模块。
//===========================================================================//
module_declaration
    : ( attribute_instance )* module_keyword module_identifier
      ( parameter_port_list )?
      ( list_of_ports )? SEMI // 确保分号位置正确
      module_body
      ENDMODULE
    ;

module_body
    : module_declaration_section* 
      module_behavioral_section* 
      module_structural_section*
    ;

// 声明类内容（参数/网络/寄存器等）
module_declaration_section
    : ( parameter_declaration
      | local_parameter_declaration
      | net_declaration 
      | reg_declaration
      | integer_declaration )+
    ;
// 行为类内容（initial/always等）
module_behavioral_section
    : ( initial_construct
      | always_construct 
      | function_declaration
      | task_declaration )+
    ;
// 结构类内容（实例化/生成块等）  
module_structural_section
    : ( module_instantiation
      | gate_instantiation
      | generate_region
      | specify_block )+
    ;

module_keyword
    : MODULE | MACROMODULE ;

//===========================================================================//
// 用户定义原语 (UDP Declaration) - IEEE 1364-2005 Appendix A.8
// 定义一个用户定义原语。
//===========================================================================//
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

udp_port_identifier
    : identifier
    ;

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

// UDP端口声明 (UDP Port Declaration) - IEEE 1364-2005 Section 8.1.3
udp_port_declaration
    : output_declaration SEMI
    | input_declaration SEMI
    | reg_declaration SEMI // reg_declaration includes SEMI in its own rule
    ;

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

udp_body
    : combinational_body
    | sequential_body
    ;

combinational_body
    : TABLE combinational_entry+ ENDTABLE
    ;

// 组合逻辑表条目 (Combinational Entry) - Standard Table 8-1
combinational_entry
    : level_input_list COLON output_symbol SEMI
    ;

sequential_body
    : ( udp_initial_stmt )? TABLE sequential_entry + ENDTABLE
    ;

// 时序逻辑表条目 (Sequential Entry) - Standard Table 8-2
sequential_entry
    : seq_input_list COLON current_state COLON next_state SEMI
    ;

udp_initial_stmt
    : INITIAL output_port_identifier ASSIGN_EQ init_val SEMI
    ;

// 输入电平列表 (Level Input List) - Standard Section 8.2.1
level_input_list
    : level_symbol+
    ;

// 序列输入列表 (Seq Input List) - Standard Section 8.2.2
seq_input_list
    : seq_symbol+
    ;

// 初始化值 (Initial Value) - Standard Section 8.2.3
init_val
    : BINARY_NUMBER
    | DECIMAL_NUMBER
    | ONESTEP
    | ONESTEP BINARY_NUMBER // Assuming ONESTEP can be followed by a number
    ;

// 电平符号定义 (Level Symbol) - Standard Table 8-3
level_symbol
    : BINARY_DIGIT  // 0, 1
    | QUESTION      // ?
    | LOG_NOT       // !
    ;

// 序列符号定义 (Seq Symbol) - Standard Table 8-4
seq_symbol
    : level_symbol
    | UDP_EDGE_SYMBOL   // (01), (10), etc.
    ;

// 输出状态符号 (Output Symbol) - Standard Table 8-5
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
// 配置声明 (Config Declaration) - Standard Section 13.2
// 定义一个配置块。
//===========================================================================//
config_declaration:
    CONFIG config_identifier SEMI
    ( local_parameter_declaration )* // local_parameter_declaration includes SEMI
    design_statement
    ( config_rule_statement )*
    ENDCONFIG ( COLON config_identifier )?
    ;

// 设计语句 (Design Statement) - Standard Section 13.3
design_statement:
    DESIGN ( ( library_identifier DOT )? cell_identifier )? SEMI
    ;

// 配置规则语句 (Config Rule Statement) - Standard Section 13.4
config_rule_statement:
    default_clause liblist_clause SEMI
    | inst_clause liblist_clause SEMI
    | inst_clause use_clause SEMI
    | cell_clause liblist_clause SEMI
    | cell_clause use_clause SEMI
    ;

// 子句规则 (Clause Rules) - Standard Section 13.4.1-13.4.4
default_clause: DEFAULT;
inst_clause: INSTANCE inst_name;
cell_clause: CELL ( library_identifier DOT )? cell_identifier;
liblist_clause: LIBLIST ( library_identifier )*;
use_clause: USE ( library_identifier DOT )? cell_identifier ( COLON CONFIG )?;

// 辅助规则 for config
config_identifier: identifier;
inst_name: identifier ( DOT identifier )*;
library_identifier: identifier;
cell_identifier: identifier;

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
    : LOCALPARAM ( parameter_type list_of_param_assignments // Type specified
                   | list_of_param_assignments ) // No type, inferred
      SEMI
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
// 数据类型 (Data Types) - IEEE 1364-2005 Section 4
// 定义各种数据类型。
//===========================================================================//
parameter_type // Used in localparam declaration
    : integer_type
    | real_type
    | realtime_type
    | time_type
    | signed_type
    | unsigned_type
    | type_identifier  // User-defined types (SystemVerilog feature, but included for completeness)
    ;

integer_type
    : INTEGER       // Verilog standard type
    | REG           // Verilog register type
    | INT           // SystemVerilog shortint, int, longint (simplified representation)
    | SHORTINT
    | LONGINT
    | BYTE
    | BIT           // SystemVerilog bit type
    | LOGIC         // SystemVerilog 4-state logic
    ;
real_type : REAL | REALTIME;
realtime_type: REALTIME;
time_type: TIME;
signed_type: SIGNED;
unsigned_type: UNSIGNED;

type_identifier
    : identifier  // User defined type name
    ;

//======================================================================//
// 端口列表 (Port List) - IEEE 1364-2005 Section 12.3
// 模块头部可选的端口列表。
//======================================================================//
list_of_ports
    : LPAREN 
      ( port_declaration (COMMA port_declaration)* ) 
      RPAREN
    ;

port
    : ( attribute_instance )* port_expression? // Standard port connection (implicit or ordered)
    | ( attribute_instance )* DOT port_identifier LPAREN port_expression? RPAREN // Named port connection
    ;

port_expression
    : port_reference
    | LBRACE port_reference ( COMMA port_reference )* RBRACE // Concatenation in port list
    ;

port_reference
    : port_identifier
    | port_identifier LBRACK constant_expression RBRACK // Bit-select
    | port_identifier LBRACK range_expression RBRACK // Part-select (range_expression allows variables here)
    ;

//===========================================================================//
// 模块项 (Module Item) - IEEE 1364-2005 Section 3.12
// 模块内部的各种声明、定义、实例化和行为块等。
// 此规则通过分组实现层次化。
//===========================================================================//
module_item
    : port_declaration SEMI // Port declarations listed within the module body
    | non_port_module_item  // Other items within the module body
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
        | (INPUT | OUTPUT REG | OUTPUT | INOUT) port_identifier (dimension)? 
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
    | UWIRE // SystemVerilog uwire
    ;

list_of_port_identifiers
    : port_identifier ( COMMA port_identifier )*
    ;

//===========================================================================//
// 非端口模块项分组 (Grouped Non-Port Module Items) - IEEE 1364-2005 Section 3.12
// 将模块内部非端口声明的项进行分组，以提高解析树的层次结构。
//===========================================================================//
non_port_module_item
    : module_declaration_item       // Various declarations (net, reg, param, etc.)
    | module_instantiation_item     // Instantiations (module, udp, gate)
    | module_assignment_item        // Assignments (continuous, parameter override)
    | module_procedural_item      // Behavioral blocks (initial, always)
    | module_structural_item      // Structural items (generate, specify)
    | module_task_function_item     // Task and Function definitions
    ;

// Declarations within a module (grouped)
module_declaration_item
    : parameter_declaration // Includes SEMI
    | local_parameter_declaration // Includes SEMI
    | net_declaration // Includes SEMI
    | reg_declaration // Includes SEMI
    | integer_declaration // Includes SEMI
    | real_declaration // Includes SEMI
    | realtime_declaration SEMI // Need to add SEMI here as realtime_declaration rule might not have it
    | time_declaration // Includes SEMI
    | event_declaration // Includes SEMI
    | genvar_declaration // Includes SEMI
    ;

// Instantiations within a module (grouped)
module_instantiation_item
    : module_instantiation // Includes SEMI
    | udp_instantiation // Includes SEMI
    | gate_instantiation // Includes SEMI
    ;

// Assignments within a module (grouped)
module_assignment_item
    : continuous_assign // Includes SEMI
    | parameter_override // Includes SEMI
    ;

// Behavioral/Procedural blocks within a module (grouped)
module_procedural_item
    : initial_construct // Ends with statement_or_null
    | always_construct // Ends with statement_or_null
    ;

// Structural/Hierarchical items within a module (grouped)
module_structural_item
    : generate_region // Includes GENERATE/ENDGENERATE
    | specify_block // Includes SPECIFY/ENDSPECIFY
    ;

// Task and Function definitions within a module (grouped)
module_task_function_item
    : task_declaration // Includes TASK/ENDTASK
    | function_declaration // Includes FUNCTION/ENDFUNCTION
    ;


//===========================================================================//
// 生成区域 (Generate Region) - IEEE 1364-2005 Section 12.3.5
// 定义一个生成块，用于例化或生成代码。
//===========================================================================//
generate_region
    : GENERATE ( generate_item )* ENDGENERATE
    ;

//===========================================================================//
// 生成项 (Generate Item) - IEEE 1364-2005 Section 12.3.5
// 生成块内部的各种声明、实例化、行为块和控制结构。
// 此规则通过分组实现层次化。
//===========================================================================//
generate_item
    : generate_declaration_item     // Declarations within generate (subset)
    | generate_instantiation_item   // Instantiations within generate
    | generate_assignment_item      // Assignments within generate
    | generate_procedural_item    // Behavioral blocks within generate
    | generate_structural_item    // Nested generate region or block
    | generate_control_statement    // Conditional, case, loop generate statements
    ;

// Declarations allowed directly within a generate block (grouped)
generate_declaration_item
    : parameter_declaration // Includes SEMI
    | local_parameter_declaration // Includes SEMI
    | net_declaration // Includes SEMI
    | reg_declaration // Includes SEMI
    ;

// Instantiations allowed directly within a generate block (grouped)
generate_instantiation_item
    : gate_instantiation // Includes SEMI
    | module_instantiation // Includes SEMI
    ;

// Assignments allowed directly within a generate block (grouped)
generate_assignment_item
    : continuous_assign // Includes SEMI
    | parameter_override // Includes SEMI
    ;

// Behavioral/Procedural blocks allowed directly within a generate block (grouped)
generate_procedural_item
    : initial_construct // Ends with statement_or_null
    | always_construct // Ends with statement_or_null
    ;

// Structural/Hierarchical items allowed directly within a generate block (grouped)
generate_structural_item
    : generate_region // Nested generate region
    | generate_block  // Named or unnamed begin/end block
    ;

// Conditional and loop statements for generate (grouped)
generate_control_statement
    : generate_conditional_statement
    | generate_case_statement
    | generate_loop_statement
    ;


block_identifier
    : identifier
    ;

generate_block
    : BEGIN ( COLON block_identifier )?
      ( generate_item )* // Items within the generate begin/end block
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
    : constant_expression // Should be a constant expression
    ;

//===========================================================================//
// Genvar 声明 (Genvar Declaration) - IEEE 1364-2005 Section 12.3.5
// 声明用于生成循环的genvar变量。
//===========================================================================//
genvar_declaration
    : GENVAR list_of_genvar_identifiers SEMI
    ;

list_of_genvar_identifiers
    : genvar_identifier ( COMMA genvar_identifier )*
    ;

genvar_identifier
    : identifier
    ;

//===========================================================================//
// 模块实例化 (Module Instantiation) - IEEE 1364-2005 Section 12.3
// 实例化其他模块。
//===========================================================================//
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
    : name_of_instance ( range )? // Instance array optional range
      LPAREN list_of_port_connections RPAREN
    ;

name_of_instance
    : identifier
    ;

list_of_port_connections
    : ordered_port_connection ( COMMA ordered_port_connection )*
    | named_port_connection ( COMMA named_port_connection )*
    ;

ordered_port_connection
    : expression?  // Allows empty connection (e.g., .port())
    ;

named_port_connection
    : DOT port_identifier LPAREN expression? RPAREN // Allows empty connection (e.g., .port())
    ;

//===========================================================================//
// 事件声明 (Event Declaration) - IEEE 1364-2005 Section 7.5
// 声明同步事件变量。
//===========================================================================//
event_declaration
    : EVENT list_of_event_identifiers SEMI
    ;

list_of_event_identifiers
    : event_identifier ( dimension )? ( COMMA event_identifier ( dimension )? )*
    ;

event_identifier
    : identifier
    ;

//===========================================================================//
// 维度 (Dimension) - IEEE 1364-2005 Section 4.5
// 声明数组或存储器的维度。
//===========================================================================//
dimension
    : LBRACK dimension_expression ( COLON dimension_expression )? RBRACK
    ;

dimension_expression
    : constant_expression  // Must be a constant expression
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
    : variable_lvalue ASSIGN_LE ( delay_or_event_control )? expression
    ;

variable_lvalue
    : hierarchical_variable_identifier ( select_or_range )?
    | LBRACE variable_lvalue ( COMMA variable_lvalue )* RBRACE // Concatenation lvalue
    ;

select_or_range
    : LBRACK range_expression RBRACK    // Bit-select or part-select
    | DOT identifier                    // Structure member selection (SystemVerilog)
    ;

hierarchical_variable_identifier
    : ( identifier ( DOT identifier )* ) ( LBRACK constant_expression RBRACK )? // Allow array access on hierarchical path
    ;

hierarchical_identifier
    : (identifier constant_bit_select? DOT)* identifier constant_bit_select?
    ;

constant_bit_select
    : LBRACK constant_expression RBRACK
    ;

bit_select
    : LBRACK expression RBRACK // Can be non-constant in behavioral code
    ;

range_expression
    : expression ( COLON expression )? RBRACK  // Bit-select or part-select (variable or constant)
    ;

concatenation_lvalue // Explicit rule for concatenation on left side
    : LBRACE variable_lvalue ( COMMA variable_lvalue )* RBRACE
    ;

//===========================================================================//
// 条件语句 (Conditional Statement) - IEEE 1364-2005 Section 9.4
// if-else 结构。
//===========================================================================//

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
    : variable_lvalue ASSIGN_EQ expression  // Blocking assignment in assignment list
    | variable_lvalue ASSIGN_LE expression  // Non-blocking assignment in assignment list
    ;

//===========================================================================//
// 时序控制 (Timing Control) - IEEE 1364-2005 Section 9.7
// 延迟和事件控制。
//===========================================================================//
delay_or_event_control
    : delay_control
    | event_control
    | REPEAT LPAREN expression RPAREN event_control
    ;

delay_control
    : HASH delay_value // #delay_value
    | HASH LPAREN mintypmax_expression RPAREN // # (min:typ:max)
    | ARROW delay_value // ->delay_value (SystemVerilog delay)
    | ARROW_ARROW delay_value // =>delay_value (SystemVerilog delay)
    ;

delay_value
    : NUMBER
    | identifier
    ;

event_control
    : LPAREN (edge_identifier_list)? RPAREN
    ;

edge_identifier_list
    : edge_identifier (OR edge_identifier)*
    ;
// 单个边沿标识符定义
edge_identifier
    : (POSEDGE | NEGEDGE) identifier
    ;
event_expression
    : expression // Signal change
    | hierarchical_event_identifier // Event trigger
    | POSEDGE expression // Rising edge
    | NEGEDGE expression // Falling edge
    | event_expression OR event_expression // OR events
    | event_expression COMMA event_expression // Comma implies OR
    ;

hierarchical_event_identifier
    : ( identifier ( bit_select )? DOT )* event_identifier
    ;

//===========================================================================//
// 表达式 (Expression) - IEEE 1364-2005 Section 4
// 定义各种表达式的语法。
//===========================================================================//
constant_expression // Subset of expression that must be constant
    : constant_primary
    | unary_operator constant_primary
    | constant_expression binary_operator constant_expression
    | constant_expression QUESTION constant_expression COLON constant_expression
    | LPAREN constant_expression RPAREN
    ;

unary_operator
    : PLUS          // + (unary plus)
    | MINUS         // - (unary minus)
    | BANG          // ! (logical not)
    | BIT_NOT       // ~ (bitwise not)
    | AND           // & (bitwise AND reduction)
    | NAND          // ~& (bitwise NAND reduction)
    | OR            // | (bitwise OR reduction)
    | NOR           // ~| (bitwise NOR reduction)
    | XOR           // ^ (bitwise XOR reduction)
    | XNOR          // ~^ or ^~ (bitwise XNOR reduction)
    ;

binary_operator
    : PLUS          // + (addition)
    | MINUS         // - (subtraction)
    | STAR          // * (multiplication)
    | DIV           // / (division)
    | MOD           // % (modulo)
    | LOG_EQ        // == (logical equality)
    | LOG_NEQ       // != (logical inequality)
    | CASE_EQ       // === (case equality)
    | CASE_NEQ      // !== (case inequality)
    | AND           // & (bitwise AND)
    | OR            // | (bitwise OR)
    | XOR           // ^ (bitwise XOR)
    | LOG_AND       // && (logical AND)
    | LOG_OR        // || (logical OR)
    | LEFT_SHIFT    // << (left shift)
    | RIGHT_SHIFT   // >> (right shift)
    | LESS          // < (less than)
    | LESS_EQ       // <= (less than or equal to)
    | GREATER       // > (greater than)
    | GREATER_EQ    // >= (greater than or equal to)
    ;

constant_primary
    : NUMBER
    | parameter_identifier ( LBRACK constant_range_expression RBRACK )? // Parameter access
    | constant_concatenation
    | constant_function_call
    | LPAREN constant_expression RPAREN
    | MINUS NUMBER // Negative number constant
    | PLUS NUMBER  // Positive number constant
    ;

constant_range_expression
    : constant_expression // Single bit or index
    | constant_expression COLON constant_expression // Range [msb:lsb]
    | constant_expression PLUS_COLON constant_expression // Indexed part-select [index +: width]
    | constant_expression MINUS_COLON constant_expression // Indexed part-select [index -: width]
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

// General expression (can include variables, function calls, etc.)
// 优化表达式分层
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
    : relational_expression ( ( LOG_EQ | LOG_NEQ ) relational_expression )*
    ;

relational_expression
    : shift_expression ( ( LESS | LESS_EQ | GREATER | GREATER_EQ ) shift_expression )*
    ;

shift_expression
    : additive_expression ( ( LEFT_SHIFT | RIGHT_SHIFT | SHLA | SHRA ) additive_expression )*
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
    ;

concatenation_expression
    : LBRACE expression ( COMMA expression )* RBRACE
    ;

multiple_concatenation
    : LBRACE expression concatenation_expression RBRACE // { replication_constant { expression, ...} }
    ;

function_call
    : function_identifier ( attribute_instance )*
      LPAREN ( expression ( COMMA expression )* )? RPAREN
    ;

function_identifier
    : hierarchical_identifier
    ;

system_function_call
    : system_identifier ( attribute_instance )*
      LPAREN ( expression ( COMMA expression )* )? RPAREN
    ;

system_identifier
    : DOLLAR identifier
    ;

mintypmax_expression
    : expression ( COLON expression COLON expression )? // min:typ:max
    ;

//===========================================================================//
// 连续赋值 (Continuous Assignment) - IEEE 1364-2005 Section 6
// assign 语句。
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
    : hierarchical_net_identifier ( LBRACK constant_expression RBRACK )? // Bit/part-select on net
    | LBRACE net_lvalue ( COMMA net_lvalue )* RBRACE // Concatenation lvalue for nets
    ;

hierarchical_net_identifier
    : ( identifier DOT )* identifier
    ;

//===========================================================================//
// 门级实例化 (Gate Instantiation) - IEEE 1364-2005 Section 7
// 例化基本门原语。
//===========================================================================//
gate_instantiation
    : gate_type (drive_strength)? (delay3)? gate_instance (COMMA gate_instance)* SEMI
    ;

delay
    : HASH delay_value
    | HASH LPAREN mintypmax_expression ( COMMA mintypmax_expression ( COMMA mintypmax_expression )? )? RPAREN
    ;

delay3
    : HASH delay_value // #delay
    | HASH LPAREN mintypmax_expression (COMMA mintypmax_expression (COMMA mintypmax_expression)?)? RPAREN // # (d1), # (d1,d2), # (d1,d2,d3)
    | ARROW delay_value // ->delay (SystemVerilog delay)
    | ARROW_ARROW LPAREN delay_value COMMA delay_value RPAREN // => (d1,d2) (SystemVerilog delay)
    ;

gate_instance
    : ( name_of_gate_instance )? LPAREN terminal ( COMMA terminal )* RPAREN
    ;

name_of_gate_instance
    : identifier range? // Instance array optional range
    ;

gate_type // Subset of common gate types
    : AND | NAND | OR | NOR | XOR | XNOR
    | BUF | NOT | BUFIF0 | BUFIF1 | NOTIF0 | NOTIF1
    | NMOS | PMOS | RNMOS | RPMOS | TRAN | RTRAN
    ;

terminal // Input/output terminal connection for gates/udps
    : expression
    ;

//===========================================================================//
// 用户定义原语实例化 (UDP Instantiation) - IEEE 1364-2005 Section 8
// 例化用户定义原语。
//===========================================================================//

udp_instantiation
    : udp_identifier ( drive_strength )? ( delay )? udp_instance ( COMMA udp_instance )* SEMI
    ;

udp_instance
    : ( name_of_instance )? LPAREN terminal ( COMMA terminal )* RPAREN // name_of_instance already includes optional range
    ;

//===========================================================================//
// 行为建模 (Behavioral Modeling) - IEEE 1364-2005 Section 9
// initial 和 always 块，以及内部语句。
//===========================================================================//

initial_construct
    : INITIAL statement_or_null
    ;

statement
    : conditional_statement
    | statement_block
    | SEMI  // 允许空语句
    ;

always_construct
    : ALWAYS (AT ( attribute_instance )* event_control )? 
      statement_block  
    ;
// 边沿控制说明符 (Edge Control Specifier) - IEEE 1364-2005 Section 9.7.1
edge_control_specifier
    : edge_designator ( identifier | hierarchical_identifier )
    ;

edge_designator
    : POSEDGE
    | NEGEDGE
    ;

event_expression_or_list
    : event_expression ( COMMA event_expression )*
    | LPAREN event_expression ( COMMA event_expression )* RPAREN 
    ;

statement_block
    : BEGIN (BLOCK_COMMENT|LINE_COMMENT)* 
      ( statement )* (BLOCK_COMMENT|LINE_COMMENT)*
      END (BLOCK_COMMENT|LINE_COMMENT)*
    | assignment_statement  // 允许独立赋值语句
    ;


conditional_statement
    : IF LPAREN expression RPAREN 
      BEGIN statement* END
      ( ELSE BEGIN statement* END )?
    ;

statement_or_null
    : statement
    | SEMI
    ;

assignment_statement
    : hierarchical_identifier 
      ( ASSIGN_NB expression SEMI 
      | ASSIGN expression SEMI )
    ;

//===========================================================================//
// 过程语句 (Procedural Statements) - IEEE 1364-2005 Section 9
// 过程块内的各种语句类型。
//===========================================================================//

// Procedural continuous assignments (assign, deassign, force, release within blocks)
procedural_continuous_assignments
    : assign_statement
    | deassign_statement
    | force_statement
    | release_statement
    ;

assign_statement    : ASSIGN variable_assignment ; // variable_assignment includes = or <=
deassign_statement  : DEASSIGN variable_lvalue ;
force_statement     : FORCE (variable_assignment | net_assignment) ; // Can force reg or net
release_statement   : RELEASE (variable_lvalue | net_lvalue) ; // Can release reg or net

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

wait_statement  : WAIT LPAREN expression RPAREN statement_or_null ; // Wait for condition
event_trigger   : ( ARROW | ARROW_ARROW ) hierarchical_event_identifier ; // Trigger event

hierarchical_task_identifier
    : hierarchical_identifier
    ;


// Sequential block (begin/end)
seq_block
    : BEGIN ( COLON identifier )? // Optional named block
      block_item_declaration* // Declarations within the block
      statement* // Statements within the block
    END
    ;

// Loop statements (for/while/repeat)
loop_statement
    : FOR LPAREN list_of_variable_assignments SEMI expression SEMI list_of_variable_assignments RPAREN statement_or_null
    | WHILE LPAREN expression RPAREN statement_or_null
    | REPEAT LPAREN expression RPAREN statement_or_null
    ;

// Parallel block (fork/join)
par_block
    : FORK ( COLON identifier )? // Optional named block
      block_item_declaration* // Declarations within the block
      statement* // Statements within the block
    JOIN
    ;

// Declarations allowed within a block (begin/end or fork/join)
block_item_declaration
    : parameter_declaration // Includes SEMI
    | reg_declaration // Includes SEMI
    | integer_declaration // Includes SEMI
    | real_declaration // Includes SEMI
    | time_declaration // Includes SEMI
    | event_declaration // Includes SEMI
    | local_parameter_declaration // Includes SEMI
    | realtime_declaration SEMI // Need to add SEMI here
    ;

// Task and system task calls
task_enable : hierarchical_task_identifier ( LPAREN ( expression ( COMMA expression )* )? RPAREN )? ; // Task call
system_task_enable
    : system_task_identifier ( LPAREN task_arg_list? RPAREN )? SEMI // System task call includes SEMI
    ;

system_task_identifier
    : DOLLAR identifier
    ;

task_arg_list // Arguments for tasks
    : expression ( COMMA expression )* // Ordered arguments
    | named_parameter_assignment ( COMMA named_parameter_assignment )* // Named arguments (SystemVerilog feature, but often supported)
    ;

//===========================================================================//
// 任务和函数 (Tasks and Functions) - IEEE 1364-2005 Section 10
// 定义任务和函数。
//===========================================================================//

task_declaration
    : TASK lifetime? task_identifier SEMI // Task header
      tf_port_declaration* // Task/function ports
      task_item_declaration* // Declarations within task
      statement_or_null* // Statements in task body
      ENDTASK
    ;

lifetime
    : STATIC
    | AUTOMATIC
    ;

task_identifier
    : identifier
    ;

tf_port_declaration // Task/function port declaration
    : port_direction range? list_of_port_identifiers SEMI // input/output/inout var declaration
    | port_direction list_of_port_identifiers SEMI // input/output/inout simple var
    | range? list_of_port_identifiers SEMI // Implicit direction (input default)
    | list_of_port_identifiers SEMI // Implicit direction, no range
    ;

task_item_declaration // Declarations allowed within task/function
    : block_item_declaration // Parameter, reg, int, real, time, event, localparam
    | tf_port_declaration // Port declarations (redundant? Ports are declared using tf_port_declaration list above)
    ; // Note: Standard says 'tf_item_declaration' includes 'block_item_declaration' and 'tf_port_declaration'.
      // The structure above seems to correctly represent this by having tf_port_declaration listed in the header
      // and tf_item_declaration (using block_item_declaration) inside the body.

function_declaration
    : FUNCTION lifetime? function_data_type? function_identifier SEMI // Function header
      tf_port_declaration* // Function ports (must be input or inout, output is return value)
      function_item_declaration* // Declarations within function
      statement_or_null* // Statements in function body
      ENDFUNCTION
    ;

function_data_type // Function return type
    : integer_type
    | real_type
    | time_type
    | range              // Bit width declaration (e.g., function [7:0] func_name;)
    ;

function_item_declaration // Declarations allowed within function (subset of task_item_declaration)
    : block_item_declaration // Parameter, reg, int, real, time, event, localparam
    | tf_port_declaration // Ports (redundant here too, see task_item_declaration note)
    ; // Note: Function items usually exclude task/function declarations and certain other items allowed in tasks.
      // This grammar uses block_item_declaration which seems correct for common usage.

//===========================================================================//
// 禁用语句 (Disable Statement) - IEEE 1364-2005 Section 11
// 禁用任务或块。
//===========================================================================//

disable_statement
    : DISABLE hierarchical_task_identifier SEMI
    | DISABLE hierarchical_identifier SEMI
    ;

//===========================================================================//
// 指定块 (Specify Block) - IEEE 1364-2005 Section 14
// 声明模块的延迟和时序检查。
//===========================================================================//

specify_block
    : SPECIFY
      ( specify_item )*
      ENDSPECIFY
    ;

// 项
specify_item
    : specparam_declaration // Includes SEMI
    | path_declaration // simple or edge-sensitive
    | system_timing_check // Includes SEMI
    | state_dependent_path_declaration // Needs to be handled by path_declaration rules
    | polarity_operator_declaration // This rule seems non-standard as a top-level item. Polarity is part of path description. Removing.
    ;

// Specparam declaration
specparam_declaration
    : SPECPARAM list_of_specparam_assignments SEMI
    ;

list_of_specparam_assignments
    : specparam_assignment (COMMA specparam_assignment)*
    ;

specparam_assignment
    : identifier ASSIGN_EQ constant_expression // Simple value
    | identifier ASSIGN_EQ constant_mintypmax_expression // Min:Typ:Max value
    ;

// Path declaration (simple or edge-sensitive)
path_declaration
    : simple_path_declaration // Includes ASSIGN_EQ and path_delay_value
    | edge_sensitive_path_declaration // Includes ASSIGN_EQ and path_delay_value
    | state_dependent_path_declaration // Includes ASSIGN_EQ and path_delay_value
    ;

// Simple path (parallel or full)
simple_path_declaration
    : parallel_path_description ASSIGN_EQ path_delay_value SEMI // Added SEMI
    | full_path_description ASSIGN_EQ path_delay_value SEMI // Added SEMI
    ;

// Parallel path description (|=>)
parallel_path_description
    : LPAREN specify_input_terminal_descriptor ( polarity_operator )? IMPLIES
      specify_output_terminal_descriptor RPAREN
    ;

// Full path description (*>)
full_path_description
    : LPAREN list_of_path_inputs ( polarity_operator )? STAR_GT list_of_path_outputs RPAREN
    ;

// Edge-sensitive path (=>)
edge_sensitive_path_declaration
    : IF LPAREN conditional_port_expression RPAREN path_description ASSIGN_EQ path_delay_value SEMI // Added SEMI
    | IFNONE path_description ASSIGN_EQ path_delay_value SEMI // Added SEMI
    ;

// Conditional expression for state-dependent paths
conditional_port_expression
    : port_expression
    | LOG_NOT port_expression
    | port_expression LOG_EQ scalar_constant
    | port_expression CASE_EQ scalar_constant
    ;

// Path description (used in edge-sensitive paths)
path_description
    : parallel_edge_sensitive_path_description
    | full_edge_sensitive_path_description
    ;

// Parallel edge-sensitive path description (|=>)
parallel_edge_sensitive_path_description
    : LPAREN edge_identifier? specify_input_terminal_descriptor IMPLIES
      LPAREN specify_output_terminal_descriptor polarity_operator? COLON data_source_expression RPAREN RPAREN
    ;

// Full edge-sensitive path description (*>)
full_edge_sensitive_path_description
    : LPAREN edge_identifier? list_of_path_inputs STAR_GT
      LPAREN list_of_path_outputs polarity_operator? COLON data_source_expression RPAREN RPAREN
    ;

data_source_expression
    : port_expression // Expression driving the output terminal
    ;

scalar_constant // Single bit constant for comparisons
    : SCALAR_CONSTANT // 1'b0, 1'b1, 1'B0, 1'B1
    | BINARY_CONSTANT // 0, 1 (assuming context implies scalar)
    ;

// State-dependent path (if/ifnone with simple or edge-sensitive path)
state_dependent_path_declaration
    : IF LPAREN module_path_expression RPAREN simple_path_declaration // simple_path_declaration includes SEMI
    | IF LPAREN module_path_expression RPAREN edge_sensitive_path_declaration // edge_sensitive_path_declaration includes SEMI
    | IFNONE simple_path_declaration // simple_path_declaration includes SEMI
    ;

polarity_operator_declaration
    : POSEDGE path_description ASSIGN_EQ path_delay_value
    | NEGEDGE path_description ASSIGN_EQ path_delay_value
    ;

// Polarity operator declaration (This seems like a misinterpretation of the standard. Polarity is part of the path description.)
// Removed: polarity_operator_declaration: POSEDGE path_description ASSIGN_EQ path_delay_value | NEGEDGE path_description ASSIGN_EQ path_delay_value ;

// Path delay value
path_delay_value
    : list_of_path_delay_expressions // list is often 1, 2, 3, 6, or 12 values
    | LPAREN list_of_path_delay_expressions RPAREN // Optional parentheses
    ;

list_of_path_delay_expressions
    : path_delay_expression ( COMMA path_delay_expression )*
    ;

path_delay_expression
    : constant_mintypmax_expression // Each delay value can be min:typ:max
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

polarity_operator // + or - in path description
    : PLUS
    | MINUS
    ;

// System timing checks ($setup, $hold, etc.)
system_timing_check
    : DOLLAR_SETUP timing_check_event COMMA timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI
    | DOLLAR_HOLD timing_check_event COMMA timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI
    | DOLLAR_WIDTH timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI
    | DOLLAR_RECOVERY timing_check_event COMMA timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI
    | DOLLAR_SKEW timing_check_event COMMA timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI
    | DOLLAR_TIMESKEW timing_check_event COMMA timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI // Added timeskew
    | DOLLAR_FULLSKEW timing_check_event COMMA timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI // Added fullskew
    | DOLLAR_PERIOD timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI // Added period
    | DOLLAR_NOCHANGE timing_check_event COMMA timing_check_event COMMA timing_check_limit (LBRACK notifier_control RBRACK)? SEMI // Added nochange
    ;

timing_check_event
    : (edge_control)? module_path_expression (AND3 timing_check_condition)?
    ;

edge_control
    : POSEDGE | NEGEDGE // 0, 1, x, z (from standard) represented by SPECIFY_INPUT_LEVEL token
    ;

module_path_expression // Expression used in specify blocks
    : module_path_primary
    | unary_module_path_operator module_path_primary
    | module_path_expression binary_module_path_operator module_path_expression
    | LPAREN module_path_expression RPAREN
    ;

module_path_primary
    : NUMBER
    | identifier ( LBRACK constant_expression RBRACK )? // Identifier with bit/part-select
    ;

unary_module_path_operator
    : LOG_NOT | BIT_NOT | BIT_AND | REDUCE_NAND | BIT_OR | REDUCE_NOR | BIT_XOR | BIT_XNOR
    ;

binary_module_path_operator
    : LOG_EQ | LOG_NEQ | LOG_AND | LOG_OR
    | BIT_AND | BIT_OR | BIT_XOR | BIT_XNOR
    | LEFT_SHIFT | RIGHT_SHIFT | SHRA | SHLA
    | PLUS | MINUS | STAR | DIV | MOD
    ;

timing_check_condition // Condition for timing checks
    : simple_expression
    | BIT_NOT simple_expression
    ;

simple_expression // Identifier or parenthesized expression
    : identifier ( LBRACK constant_expression RBRACK )? // Identifier with optional bit/part-select
    | LPAREN expression RPAREN
    ;

timing_check_limit // Limit value for timing checks
    : constant_expression
    | constant_mintypmax_expression
    ;

constant_mintypmax_expression
    : constant_expression ( COLON constant_expression COLON constant_expression )?
    ;

notifier_control // Optional notifier signal for timing checks
    : identifier
    | hierarchical_identifier
    ;

//===========================================================================//
// 网线声明 (Net Declaration) - IEEE 1364-2005 Section 3.2
// 声明各种类型的网线。
//===========================================================================//

net_declaration
    : net_type ( drive_strength )?
      ( VECTORED | SCALARED )? // Optional keywords
      ( SIGNED )?
      ( range )? // Range before delay
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
    : identifier ( range )? // Net name with optional range
    ;

list_of_net_decl_assignments
    : net_decl_assignment ( COMMA net_decl_assignment )*
    ;

net_decl_assignment
    : identifier ( range )? ASSIGN_EQ expression // Net assignment during declaration
    ;

//===========================================================================//
// 变量声明 (Variable Declaration) - IEEE 1364-2005 Section 3.3
// 声明各种类型的变量 (reg, integer, real, time)。
//===========================================================================//

reg_declaration
    : REG ( SIGNED )? ( range )? list_of_variable_identifiers SEMI
    ;

integer_declaration
    : INTEGER ( range )? list_of_variable_identifiers SEMI // Integer can have range in SV
    ;

real_declaration
    : REAL list_of_real_identifiers SEMI
    ;

time_declaration
    : TIME ( range )? list_of_variable_identifiers SEMI // Time can have range in SV
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
    : identifier ( range )? // Variable name with optional range
    ;

real_identifier
    : identifier
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
