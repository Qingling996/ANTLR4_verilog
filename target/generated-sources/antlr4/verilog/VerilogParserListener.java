// Generated from verilog/VerilogParser.g4 by ANTLR 4.13.2
package verilog;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VerilogParser}.
 */
public interface VerilogParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VerilogParser#source_text}.
	 * @param ctx the parse tree
	 */
	void enterSource_text(VerilogParser.Source_textContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#source_text}.
	 * @param ctx the parse tree
	 */
	void exitSource_text(VerilogParser.Source_textContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_declaration}.
	 * @param ctx the parse tree
	 */
	void enterModule_declaration(VerilogParser.Module_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_declaration}.
	 * @param ctx the parse tree
	 */
	void exitModule_declaration(VerilogParser.Module_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_identifier}.
	 * @param ctx the parse tree
	 */
	void enterModule_identifier(VerilogParser.Module_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_identifier}.
	 * @param ctx the parse tree
	 */
	void exitModule_identifier(VerilogParser.Module_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_item}.
	 * @param ctx the parse tree
	 */
	void enterModule_item(VerilogParser.Module_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_item}.
	 * @param ctx the parse tree
	 */
	void exitModule_item(VerilogParser.Module_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPort_declaration(VerilogParser.Port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPort_declaration(VerilogParser.Port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterParameter_declaration(VerilogParser.Parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitParameter_declaration(VerilogParser.Parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#input_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInput_declaration(VerilogParser.Input_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#input_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInput_declaration(VerilogParser.Input_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#output_declaration}.
	 * @param ctx the parse tree
	 */
	void enterOutput_declaration(VerilogParser.Output_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#output_declaration}.
	 * @param ctx the parse tree
	 */
	void exitOutput_declaration(VerilogParser.Output_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#wire_declaration}.
	 * @param ctx the parse tree
	 */
	void enterWire_declaration(VerilogParser.Wire_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#wire_declaration}.
	 * @param ctx the parse tree
	 */
	void exitWire_declaration(VerilogParser.Wire_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#reg_declaration}.
	 * @param ctx the parse tree
	 */
	void enterReg_declaration(VerilogParser.Reg_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#reg_declaration}.
	 * @param ctx the parse tree
	 */
	void exitReg_declaration(VerilogParser.Reg_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(VerilogParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(VerilogParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_lvalue}.
	 * @param ctx the parse tree
	 */
	void enterNet_lvalue(VerilogParser.Net_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_lvalue}.
	 * @param ctx the parse tree
	 */
	void exitNet_lvalue(VerilogParser.Net_lvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#bit_select}.
	 * @param ctx the parse tree
	 */
	void enterBit_select(VerilogParser.Bit_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#bit_select}.
	 * @param ctx the parse tree
	 */
	void exitBit_select(VerilogParser.Bit_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation(VerilogParser.ConcatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation(VerilogParser.ConcatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#always_block}.
	 * @param ctx the parse tree
	 */
	void enterAlways_block(VerilogParser.Always_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#always_block}.
	 * @param ctx the parse tree
	 */
	void exitAlways_block(VerilogParser.Always_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#initial_block}.
	 * @param ctx the parse tree
	 */
	void enterInitial_block(VerilogParser.Initial_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#initial_block}.
	 * @param ctx the parse tree
	 */
	void exitInitial_block(VerilogParser.Initial_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#generate_block}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_block(VerilogParser.Generate_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_block}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_block(VerilogParser.Generate_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#generate_item}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_item(VerilogParser.Generate_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_item}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_item(VerilogParser.Generate_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#conditional_generate}.
	 * @param ctx the parse tree
	 */
	void enterConditional_generate(VerilogParser.Conditional_generateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#conditional_generate}.
	 * @param ctx the parse tree
	 */
	void exitConditional_generate(VerilogParser.Conditional_generateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#loop_generate}.
	 * @param ctx the parse tree
	 */
	void enterLoop_generate(VerilogParser.Loop_generateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#loop_generate}.
	 * @param ctx the parse tree
	 */
	void exitLoop_generate(VerilogParser.Loop_generateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#genvar_assignment}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_assignment(VerilogParser.Genvar_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#genvar_assignment}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_assignment(VerilogParser.Genvar_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#genvar_identifier}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_identifier(VerilogParser.Genvar_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#genvar_identifier}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_identifier(VerilogParser.Genvar_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#task_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTask_declaration(VerilogParser.Task_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTask_declaration(VerilogParser.Task_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#task_identifier}.
	 * @param ctx the parse tree
	 */
	void enterTask_identifier(VerilogParser.Task_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_identifier}.
	 * @param ctx the parse tree
	 */
	void exitTask_identifier(VerilogParser.Task_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#task_item}.
	 * @param ctx the parse tree
	 */
	void enterTask_item(VerilogParser.Task_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_item}.
	 * @param ctx the parse tree
	 */
	void exitTask_item(VerilogParser.Task_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_declaration(VerilogParser.Function_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_declaration(VerilogParser.Function_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void enterFunction_identifier(VerilogParser.Function_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_identifier}.
	 * @param ctx the parse tree
	 */
	void exitFunction_identifier(VerilogParser.Function_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_item}.
	 * @param ctx the parse tree
	 */
	void enterFunction_item(VerilogParser.Function_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_item}.
	 * @param ctx the parse tree
	 */
	void exitFunction_item(VerilogParser.Function_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VerilogParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VerilogParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#blocking_assignment}.
	 * @param ctx the parse tree
	 */
	void enterBlocking_assignment(VerilogParser.Blocking_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#blocking_assignment}.
	 * @param ctx the parse tree
	 */
	void exitBlocking_assignment(VerilogParser.Blocking_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#non_blocking_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNon_blocking_assignment(VerilogParser.Non_blocking_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#non_blocking_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNon_blocking_assignment(VerilogParser.Non_blocking_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void enterVariable_lvalue(VerilogParser.Variable_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_lvalue}.
	 * @param ctx the parse tree
	 */
	void exitVariable_lvalue(VerilogParser.Variable_lvalueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterConditional_statement(VerilogParser.Conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitConditional_statement(VerilogParser.Conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(VerilogParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(VerilogParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#case_item}.
	 * @param ctx the parse tree
	 */
	void enterCase_item(VerilogParser.Case_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#case_item}.
	 * @param ctx the parse tree
	 */
	void exitCase_item(VerilogParser.Case_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(VerilogParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(VerilogParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(VerilogParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(VerilogParser.While_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#delay_control}.
	 * @param ctx the parse tree
	 */
	void enterDelay_control(VerilogParser.Delay_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delay_control}.
	 * @param ctx the parse tree
	 */
	void exitDelay_control(VerilogParser.Delay_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#delay_value}.
	 * @param ctx the parse tree
	 */
	void enterDelay_value(VerilogParser.Delay_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delay_value}.
	 * @param ctx the parse tree
	 */
	void exitDelay_value(VerilogParser.Delay_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#event_control}.
	 * @param ctx the parse tree
	 */
	void enterEvent_control(VerilogParser.Event_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#event_control}.
	 * @param ctx the parse tree
	 */
	void exitEvent_control(VerilogParser.Event_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#event_expression}.
	 * @param ctx the parse tree
	 */
	void enterEvent_expression(VerilogParser.Event_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#event_expression}.
	 * @param ctx the parse tree
	 */
	void exitEvent_expression(VerilogParser.Event_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#task_enable}.
	 * @param ctx the parse tree
	 */
	void enterTask_enable(VerilogParser.Task_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_enable}.
	 * @param ctx the parse tree
	 */
	void exitTask_enable(VerilogParser.Task_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#disable_statement}.
	 * @param ctx the parse tree
	 */
	void enterDisable_statement(VerilogParser.Disable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#disable_statement}.
	 * @param ctx the parse tree
	 */
	void exitDisable_statement(VerilogParser.Disable_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(VerilogParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(VerilogParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(VerilogParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(VerilogParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(VerilogParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(VerilogParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_arguments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_arguments(VerilogParser.List_of_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_arguments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_arguments(VerilogParser.List_of_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator(VerilogParser.Unary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#unary_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator(VerilogParser.Unary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_operator(VerilogParser.Binary_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#binary_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_operator(VerilogParser.Binary_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(VerilogParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(VerilogParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(VerilogParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(VerilogParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(VerilogParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(VerilogParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_ports}.
	 * @param ctx the parse tree
	 */
	void enterList_of_ports(VerilogParser.List_of_portsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_ports}.
	 * @param ctx the parse tree
	 */
	void exitList_of_ports(VerilogParser.List_of_portsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(VerilogParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(VerilogParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port_identifier}.
	 * @param ctx the parse tree
	 */
	void enterPort_identifier(VerilogParser.Port_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_identifier}.
	 * @param ctx the parse tree
	 */
	void exitPort_identifier(VerilogParser.Port_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port_expression}.
	 * @param ctx the parse tree
	 */
	void enterPort_expression(VerilogParser.Port_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_expression}.
	 * @param ctx the parse tree
	 */
	void exitPort_expression(VerilogParser.Port_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port_reference}.
	 * @param ctx the parse tree
	 */
	void enterPort_reference(VerilogParser.Port_referenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_reference}.
	 * @param ctx the parse tree
	 */
	void exitPort_reference(VerilogParser.Port_referenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(VerilogParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(VerilogParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void enterRange_expression(VerilogParser.Range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#range_expression}.
	 * @param ctx the parse tree
	 */
	void exitRange_expression(VerilogParser.Range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_identifiers(VerilogParser.List_of_port_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_identifiers(VerilogParser.List_of_port_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_param_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_param_assignments(VerilogParser.List_of_param_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_param_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_param_assignments(VerilogParser.List_of_param_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#param_assignment}.
	 * @param ctx the parse tree
	 */
	void enterParam_assignment(VerilogParser.Param_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#param_assignment}.
	 * @param ctx the parse tree
	 */
	void exitParam_assignment(VerilogParser.Param_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_net_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_net_identifiers(VerilogParser.List_of_net_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_net_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_net_identifiers(VerilogParser.List_of_net_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_variable_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_variable_identifiers(VerilogParser.List_of_variable_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_variable_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_variable_identifiers(VerilogParser.List_of_variable_identifiersContext ctx);
}