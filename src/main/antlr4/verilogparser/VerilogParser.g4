parser grammar VerilogParser;

options { tokenVocab=VerilogLexer; }

// =========================================================================
// 顶层规则
// =========================================================================
source_text : ( module_declaration | compiler_directive )* EOF ; // <<< 修改: 允许编译器指令

// =========================================================================
// 模块声明
// =========================================================================
module_declaration : 
    MODULE                                  
    IDENTIFIER                              
    ( parameter_port_list )?                
    (port_list)?                            
    SEMI                                    
    module_item*                            
    ENDMODULE ;                             

parameter_port_list : 
    HASH LPAREN                             
    param_assignment                        
    ( COMMA param_assignment )*             
    RPAREN                                  
    ;

param_assignment : 
    PARAMETER                               
    ( SIGNED )?                             
    ( range_expression )?                   
    IDENTIFIER                              
    ASSIGN_EQ                               
    constant_expression                     
    ;

port_list : 
    LPAREN                                  
    port_declaration                        
    ( COMMA port_declaration )*             
    RPAREN                                  
    ;

port_declaration 
    : input_declaration                     
    | output_declaration                    
    | inout_declaration                     
    ;

input_declaration  : INPUT  ( WIRE )?       ( SIGNED )? ( range_expression )? IDENTIFIER ;
output_declaration : OUTPUT ( WIRE | REG )? ( SIGNED )? ( range_expression )? IDENTIFIER ;
inout_declaration  : INOUT  ( WIRE )?       ( SIGNED )? ( range_expression )? IDENTIFIER ;

// =========================================================================
// 模块项（模块内部元素）
// =========================================================================
module_item  
    : signals_declaration SEMI      
    | gate_instantiation            
    | continuous_assign SEMI        
    | always_construct              
    | initial_construct             
    | task_declaration              
    | function_declaration          
    | generate_block                
    | module_instantiation          
    | compiler_directive            // <<< 新增: 允许在模块内部使用编译器指令
    ;

/* ================================================================================================  */
/*                                              信号声明                                              */
/* ================================================================================================  */
signals_declaration 
    : parameter_declaration         
    | localparam_declaration        
    | reg_declaration               
    | wire_declaration              
    | integer_declaration           
    | real_declaration              
    | time_declaration              
    ;

parameter_declaration : PARAMETER  ( SIGNED )? ( range_expression )? list_of_identifiers  ASSIGN_EQ constant_expression;
localparam_declaration: LOCALPARAM ( SIGNED )? ( range_expression )? list_of_identifiers  ASSIGN_EQ constant_expression;
reg_declaration       : REG  ( SIGNED )? ( range_expression )?       list_of_identifiers ;
wire_declaration      : WIRE ( SIGNED )? ( range_expression )?       list_of_identifiers ;
integer_declaration   : INTEGER                                      list_of_identifiers ;
real_declaration      : REAL                                         list_of_identifiers ;
time_declaration      : TIME                                         list_of_identifiers ;
list_of_identifiers   : IDENTIFIER ( COMMA IDENTIFIER )* ;

/* ================================================================================================  */
/*                                          连续赋值和过程块                                          */
/* ================================================================================================  */

continuous_assign : ASSIGN variable_lvalue ASSIGN_EQ expression ;
always_construct  : ALWAYS ( event_control )? statement_or_null ;
initial_construct : INITIAL statement ;

// =========================================================================
// 语句结构
// =========================================================================
statement
    : ( BEGIN ( COLON IDENTIFIER )? ( statement | compiler_directive )* END ( COLON IDENTIFIER )? )      // 块语句, 允许指令
    | ( IF LPAREN expression RPAREN statement_or_null ( ELSE statement_or_null )? )                     // If 语句
    | ( ( CASE | CASEZ | CASEX ) LPAREN expression RPAREN ( case_item )+ ENDCASE )                      // Case 语句
    | ( FOR LPAREN variable_assignment? SEMI expression? SEMI variable_assignment? RPAREN statement )   // For 循环
    | ( REPEAT LPAREN expression RPAREN statement )                                                     // Repeat 循环
    | ( WHILE LPAREN expression RPAREN statement )                                                      // While 循环
    | ( FOREVER statement )                                                                             // Forever 循环
    | ( WAIT LPAREN expression RPAREN statement_or_null )                                               // Wait 语句
    | ( timing_control_statement )? assignment SEMI                                                     // 赋值语句
    | ( task_enable_statement SEMI )                                                                    // 任务使能
    | ( compiler_directive )                                                                            // 允许指令作为语句
    | ( SEMI )                                                                                          // 空语句
    ;

statement_or_null
    : statement
    | SEMI
    ;

assignment  
    : variable_lvalue ASSIGN_EQ expression    
    | variable_lvalue LE_OP expression ;      

variable_assignment 
    : variable_lvalue ASSIGN_EQ expression
    ;

variable_lvalue
    : IDENTIFIER ( range_expression )?
    | LBRACE variable_lvalue ( COMMA variable_lvalue )* RBRACE 
    | hierarchical_identifier
    ;

hierarchical_identifier
    : IDENTIFIER ( LBRACK expression RBRACK )* ( DOT IDENTIFIER ( LBRACK expression RBRACK )* )*
    ;

constant_expression
    : number                                                    
    | IDENTIFIER                                                
    | unary_operator constant_expression                        
    | constant_expression binary_operator constant_expression   
    | LPAREN constant_expression RPAREN                         
    ;

delay  
    : HASH delay_value                                          
    | HASH LPAREN mintypmax_expression RPAREN                   
    ;

mintypmax_expression : expression ( COLON expression ( COLON expression )? )? ;

case_item
    : expression ( COMMA expression )* COLON statement_or_null
    | DEFAULT ( COLON )? statement_or_null
    ;

/* ================================================================================================  */
/*                                              时序控制                                              */
/* ================================================================================================  */

timing_control_statement
    : event_control                         
    | delay_control                         
    ;

event_control  : AT ( LPAREN event_expression RPAREN | event_trigger ) ;
delay_control  : HASH delay_value ;

event_expression
    : STAR
    | event_trigger ( (COMMA | OR) event_trigger )*
    ;

event_trigger
    : posedge_expression
    | negedge_expression
    | hierarchical_identifier
    ;

posedge_expression : POSEDGE hierarchical_identifier ;
negedge_expression : NEGEDGE hierarchical_identifier ;

/* ================================================================================================  */
/*                                              任务使能                                              */
/* ================================================================================================  */
task_enable_statement  
    : IDENTIFIER ( LPAREN list_of_arguments RPAREN )?
    | DOLLAR IDENTIFIER ( LPAREN list_of_arguments RPAREN )? 
    ;

list_of_arguments  
    : expression ( COMMA expression )*
    | DOT IDENTIFIER LPAREN expression RPAREN ( COMMA DOT IDENTIFIER LPAREN expression RPAREN )*
    ;

// =========================================================================
// 表达式结构 (已修正左递归)
// =========================================================================
expression
    : expression LBRACE expression RBRACE                 # ReplicationExpression 
    | expression binary_operator expression               # BinaryExpression      
    | expression QUESTION expression COLON expression     # TernaryExpression     
    | unary_operator expression                           # UnaryExpression       
    | primary                                             # PrimaryExpression     
    ;

primary
    : number 
    | IDENTIFIER ( range_expression )? 
    | concatenation 
    | function_call 
    | LPAREN expression RPAREN
    ;

concatenation : LBRACE expression ( COMMA expression )* RBRACE ;

// =========================================================================
// 门级建模和实例化
// =========================================================================
gate_instantiation : ( cmos_switchtype | enable_gatetype | mos_switchtype | n_input_gatetype ) ( delay )? gate_instance ( COMMA gate_instance )* SEMI ;
gate_instance : ( name_of_instance )? LPAREN terminal ( COMMA terminal )* RPAREN ;
name_of_instance : IDENTIFIER ( range_expression )? ;

terminal  
    : identifier_expression     
    | hierarchical_identifier   
    | constant_expression       
    ;

identifier_expression: IDENTIFIER ( range_expression )? ;
cmos_switchtype : CMOS | RCMOS ;
enable_gatetype : BUFIF0 | BUFIF1 | NOTIF0 | NOTIF1 ;
mos_switchtype  : NMOS | PMOS | RNMOS | RPMOS ;
n_input_gatetype: AND | NAND | OR | NOR | XOR | XNOR ;

// =========================================================================
// 任务和函数
// =========================================================================
task_declaration : 
    TASK ( AUTOMATIC )? IDENTIFIER SEMI 
    ( task_tf_declaration )*       
    statement ENDTASK ;

task_tf_declaration  
    :(input_declaration | output_declaration | inout_declaration | reg_declaration 
    | integer_declaration | time_declaration | localparam_declaration ) SEMI ;

function_declaration  
    : FUNCTION ( AUTOMATIC )? ( SIGNED )? ( range_expression )? IDENTIFIER SEMI
    ( input_declaration SEMI )+   
    ( function_local_declaration )* 
    statement ENDFUNCTION ;

function_local_declaration  
    :(reg_declaration | integer_declaration | time_declaration | real_declaration
    | localparam_declaration ) SEMI ;

// =========================================================================
// 生成块结构
// =========================================================================
generate_block : GENERATE ( generate_item )* ENDGENERATE ;
generate_item  
    : generate_conditional 
    | generate_loop 
    | module_item ;

generate_conditional : IF LPAREN constant_expression RPAREN generate_item ( ELSE generate_item )? ;
generate_loop : FOR LPAREN genvar_declaration SEMI constant_expression SEMI genvar_assignment RPAREN generate_block;
genvar_declaration : GENVAR IDENTIFIER ASSIGN_EQ constant_expression;
genvar_assignment : IDENTIFIER ASSIGN_EQ constant_expression;

/* ================================================================================================  */
/*                                             模块实例化                                             */
/* ================================================================================================  */
module_instantiation
    : IDENTIFIER                                    
      ( parameter_value_assignment )?               
      module_instance ( COMMA module_instance )*    
      SEMI                                          
    ;

parameter_value_assignment : HASH LPAREN list_of_param_assignments RPAREN ;
list_of_param_assignments  : named_parameter_assignment (COMMA named_parameter_assignment)*;
named_parameter_assignment : DOT IDENTIFIER LPAREN expression RPAREN ;
module_instance            : name_of_instance LPAREN ( list_of_port_connections )? RPAREN ;
list_of_port_connections   : named_port_connection ( COMMA named_port_connection )* ;
named_port_connection      : DOT IDENTIFIER LPAREN ( expression )? RPAREN ;

// =========================================================================
// 辅助规则
// =========================================================================
range_expression
    : LBRACK expression ( COLON expression | PLUS_COLON expression | MINUS_COLON expression )? RBRACK ;

delay_or_event_control  
    : HASH delay_value | AT event_trigger | HASH LPAREN mintypmax_expression RPAREN ;

delay_value
    : NUMBER | IDENTIFIER | LPAREN mintypmax_expression RPAREN ;

unary_operator
    : PLUS | MINUS | LOG_NOT | BIT_NOT
    | BIT_AND | REDUCE_NAND | BIT_OR | REDUCE_NOR | BIT_XOR | CARET_TILDE | TILDE_CARET
    ;

binary_operator  
    : PLUS | MINUS | STAR | DIV | MOD | LOG_EQ | LOG_NEQ | CASE_EQ | CASE_NEQ 
    | LESS | LE_OP | GREATER | GREATER_EQ | LOG_AND | LOG_OR | LEFT_SHIFT | RIGHT_SHIFT 
    | SHRA | SHLA | BIT_AND | BIT_OR | BIT_XOR | TILDE_CARET | CARET_TILDE;

function_call  
    : IDENTIFIER ( LPAREN list_of_arguments RPAREN )?
    | hierarchical_identifier ( LPAREN list_of_arguments RPAREN )?;

number : NUMBER | STRING ;

// ==========================================================
// 修正后的编译器指令规则
// ==========================================================
compiler_directive
    : define_directive
    | ifdef_directive
    | include_directive
    | timescale_directive
    ;

define_directive: TICK_DEFINE MACRO_IDENTIFIER (MACRO_BODY)?;

include_directive: TICK_INCLUDE STRING_LITERAL;

timescale_directive : TICK_TIMESCALE TIMESCALE_VALUE;

ifdef_directive:
    (TICK_IFDEF | TICK_IFNDEF) IDENTIFIER
    (module_declaration | compiler_directive)* // 递归地允许模块或其他指令
    ( TICK_ELSIF IDENTIFIER (module_declaration | compiler_directive)* )*
    ( TICK_ELSE (module_declaration | compiler_directive)* )?
    TICK_ENDIF
    ;
