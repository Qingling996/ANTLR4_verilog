// Generated from verilog/VerilogParser.g4 by ANTLR 4.13.2
package verilog;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link VerilogParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface VerilogParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link VerilogParser#source_text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_text(VerilogParser.Source_textContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_declaration(VerilogParser.Module_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_identifier(VerilogParser.Module_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_item(VerilogParser.Module_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_declaration(VerilogParser.Port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(VerilogParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#input_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_declaration(VerilogParser.Input_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#output_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_declaration(VerilogParser.Output_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#wire_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWire_declaration(VerilogParser.Wire_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#reg_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_declaration(VerilogParser.Reg_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(VerilogParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_lvalue(VerilogParser.Net_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bit_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_select(VerilogParser.Bit_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation(VerilogParser.ConcatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#always_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlways_block(VerilogParser.Always_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#initial_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_block(VerilogParser.Initial_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_block(VerilogParser.Generate_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_item(VerilogParser.Generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#conditional_generate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_generate(VerilogParser.Conditional_generateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#loop_generate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_generate(VerilogParser.Loop_generateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_assignment(VerilogParser.Genvar_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_identifier(VerilogParser.Genvar_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_declaration(VerilogParser.Task_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_identifier(VerilogParser.Task_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_item(VerilogParser.Task_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(VerilogParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_identifier(VerilogParser.Function_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_item(VerilogParser.Function_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VerilogParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#blocking_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocking_assignment(VerilogParser.Blocking_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#non_blocking_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_blocking_assignment(VerilogParser.Non_blocking_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_lvalue(VerilogParser.Variable_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(VerilogParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(VerilogParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#case_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_item(VerilogParser.Case_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(VerilogParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(VerilogParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delay_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_control(VerilogParser.Delay_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delay_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_value(VerilogParser.Delay_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#event_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_control(VerilogParser.Event_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#event_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_expression(VerilogParser.Event_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_enable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_enable(VerilogParser.Task_enableContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#disable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisable_statement(VerilogParser.Disable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(VerilogParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(VerilogParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(VerilogParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_arguments(VerilogParser.List_of_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#unary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator(VerilogParser.Unary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#binary_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_operator(VerilogParser.Binary_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(VerilogParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(VerilogParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(VerilogParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_ports}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_ports(VerilogParser.List_of_portsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(VerilogParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_identifier(VerilogParser.Port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_expression(VerilogParser.Port_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_reference(VerilogParser.Port_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(VerilogParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_expression(VerilogParser.Range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_identifiers(VerilogParser.List_of_port_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_param_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_param_assignments(VerilogParser.List_of_param_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#param_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_assignment(VerilogParser.Param_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_net_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_net_identifiers(VerilogParser.List_of_net_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_variable_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_identifiers(VerilogParser.List_of_variable_identifiersContext ctx);
}