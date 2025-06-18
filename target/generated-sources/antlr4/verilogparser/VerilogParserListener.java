// Generated from verilogparser/VerilogParser.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link VerilogParser#parameter_port_list}.
	 * @param ctx the parse tree
	 */
	void enterParameter_port_list(VerilogParser.Parameter_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_port_list}.
	 * @param ctx the parse tree
	 */
	void exitParameter_port_list(VerilogParser.Parameter_port_listContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#port_list}.
	 * @param ctx the parse tree
	 */
	void enterPort_list(VerilogParser.Port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_list}.
	 * @param ctx the parse tree
	 */
	void exitPort_list(VerilogParser.Port_listContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#inout_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInout_declaration(VerilogParser.Inout_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#inout_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInout_declaration(VerilogParser.Inout_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#signals_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSignals_declaration(VerilogParser.Signals_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#signals_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSignals_declaration(VerilogParser.Signals_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#localparam_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalparam_declaration(VerilogParser.Localparam_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#localparam_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalparam_declaration(VerilogParser.Localparam_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#integer_declaration}.
	 * @param ctx the parse tree
	 */
	void enterInteger_declaration(VerilogParser.Integer_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#integer_declaration}.
	 * @param ctx the parse tree
	 */
	void exitInteger_declaration(VerilogParser.Integer_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#real_declaration}.
	 * @param ctx the parse tree
	 */
	void enterReal_declaration(VerilogParser.Real_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#real_declaration}.
	 * @param ctx the parse tree
	 */
	void exitReal_declaration(VerilogParser.Real_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#time_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTime_declaration(VerilogParser.Time_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#time_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTime_declaration(VerilogParser.Time_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_identifiers(VerilogParser.List_of_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_identifiers(VerilogParser.List_of_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#continuous_assign}.
	 * @param ctx the parse tree
	 */
	void enterContinuous_assign(VerilogParser.Continuous_assignContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#continuous_assign}.
	 * @param ctx the parse tree
	 */
	void exitContinuous_assign(VerilogParser.Continuous_assignContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#always_construct}.
	 * @param ctx the parse tree
	 */
	void enterAlways_construct(VerilogParser.Always_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#always_construct}.
	 * @param ctx the parse tree
	 */
	void exitAlways_construct(VerilogParser.Always_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#initial_construct}.
	 * @param ctx the parse tree
	 */
	void enterInitial_construct(VerilogParser.Initial_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#initial_construct}.
	 * @param ctx the parse tree
	 */
	void exitInitial_construct(VerilogParser.Initial_constructContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#statement_or_null}.
	 * @param ctx the parse tree
	 */
	void enterStatement_or_null(VerilogParser.Statement_or_nullContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#statement_or_null}.
	 * @param ctx the parse tree
	 */
	void exitStatement_or_null(VerilogParser.Statement_or_nullContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_assignment(VerilogParser.Variable_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_assignment(VerilogParser.Variable_assignmentContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_identifier(VerilogParser.Hierarchical_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_identifier(VerilogParser.Hierarchical_identifierContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#delay}.
	 * @param ctx the parse tree
	 */
	void enterDelay(VerilogParser.DelayContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delay}.
	 * @param ctx the parse tree
	 */
	void exitDelay(VerilogParser.DelayContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void enterMintypmax_expression(VerilogParser.Mintypmax_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void exitMintypmax_expression(VerilogParser.Mintypmax_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#timing_control_statement}.
	 * @param ctx the parse tree
	 */
	void enterTiming_control_statement(VerilogParser.Timing_control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timing_control_statement}.
	 * @param ctx the parse tree
	 */
	void exitTiming_control_statement(VerilogParser.Timing_control_statementContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#event_trigger}.
	 * @param ctx the parse tree
	 */
	void enterEvent_trigger(VerilogParser.Event_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#event_trigger}.
	 * @param ctx the parse tree
	 */
	void exitEvent_trigger(VerilogParser.Event_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#posedge_expression}.
	 * @param ctx the parse tree
	 */
	void enterPosedge_expression(VerilogParser.Posedge_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#posedge_expression}.
	 * @param ctx the parse tree
	 */
	void exitPosedge_expression(VerilogParser.Posedge_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#negedge_expression}.
	 * @param ctx the parse tree
	 */
	void enterNegedge_expression(VerilogParser.Negedge_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#negedge_expression}.
	 * @param ctx the parse tree
	 */
	void exitNegedge_expression(VerilogParser.Negedge_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#task_enable_statement}.
	 * @param ctx the parse tree
	 */
	void enterTask_enable_statement(VerilogParser.Task_enable_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_enable_statement}.
	 * @param ctx the parse tree
	 */
	void exitTask_enable_statement(VerilogParser.Task_enable_statementContext ctx);
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
	 * Enter a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTernaryExpression(VerilogParser.TernaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TernaryExpression}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTernaryExpression(VerilogParser.TernaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrimaryExpression}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(VerilogParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrimaryExpression}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(VerilogParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(VerilogParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BinaryExpression}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(VerilogParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReplicationExpression}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterReplicationExpression(VerilogParser.ReplicationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReplicationExpression}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitReplicationExpression(VerilogParser.ReplicationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(VerilogParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryExpression}
	 * labeled alternative in {@link VerilogParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(VerilogParser.UnaryExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#gate_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterGate_instantiation(VerilogParser.Gate_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#gate_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitGate_instantiation(VerilogParser.Gate_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterGate_instance(VerilogParser.Gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitGate_instance(VerilogParser.Gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#name_of_instance}.
	 * @param ctx the parse tree
	 */
	void enterName_of_instance(VerilogParser.Name_of_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#name_of_instance}.
	 * @param ctx the parse tree
	 */
	void exitName_of_instance(VerilogParser.Name_of_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#terminal}.
	 * @param ctx the parse tree
	 */
	void enterTerminal(VerilogParser.TerminalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#terminal}.
	 * @param ctx the parse tree
	 */
	void exitTerminal(VerilogParser.TerminalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#identifier_expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_expression(VerilogParser.Identifier_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#identifier_expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_expression(VerilogParser.Identifier_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cmos_switchtype}.
	 * @param ctx the parse tree
	 */
	void enterCmos_switchtype(VerilogParser.Cmos_switchtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cmos_switchtype}.
	 * @param ctx the parse tree
	 */
	void exitCmos_switchtype(VerilogParser.Cmos_switchtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#enable_gatetype}.
	 * @param ctx the parse tree
	 */
	void enterEnable_gatetype(VerilogParser.Enable_gatetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#enable_gatetype}.
	 * @param ctx the parse tree
	 */
	void exitEnable_gatetype(VerilogParser.Enable_gatetypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#mos_switchtype}.
	 * @param ctx the parse tree
	 */
	void enterMos_switchtype(VerilogParser.Mos_switchtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#mos_switchtype}.
	 * @param ctx the parse tree
	 */
	void exitMos_switchtype(VerilogParser.Mos_switchtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#n_input_gatetype}.
	 * @param ctx the parse tree
	 */
	void enterN_input_gatetype(VerilogParser.N_input_gatetypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#n_input_gatetype}.
	 * @param ctx the parse tree
	 */
	void exitN_input_gatetype(VerilogParser.N_input_gatetypeContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#task_tf_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTask_tf_declaration(VerilogParser.Task_tf_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_tf_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTask_tf_declaration(VerilogParser.Task_tf_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#function_local_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_local_declaration(VerilogParser.Function_local_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_local_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_local_declaration(VerilogParser.Function_local_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#generate_conditional}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_conditional(VerilogParser.Generate_conditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_conditional}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_conditional(VerilogParser.Generate_conditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#generate_loop}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_loop(VerilogParser.Generate_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_loop}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_loop(VerilogParser.Generate_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#genvar_declaration}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_declaration(VerilogParser.Genvar_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#genvar_declaration}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_declaration(VerilogParser.Genvar_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterModule_instantiation(VerilogParser.Module_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitModule_instantiation(VerilogParser.Module_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parameter_value_assignment}.
	 * @param ctx the parse tree
	 */
	void enterParameter_value_assignment(VerilogParser.Parameter_value_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_value_assignment}.
	 * @param ctx the parse tree
	 */
	void exitParameter_value_assignment(VerilogParser.Parameter_value_assignmentContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#named_parameter_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNamed_parameter_assignment(VerilogParser.Named_parameter_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#named_parameter_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNamed_parameter_assignment(VerilogParser.Named_parameter_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_instance}.
	 * @param ctx the parse tree
	 */
	void enterModule_instance(VerilogParser.Module_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_instance}.
	 * @param ctx the parse tree
	 */
	void exitModule_instance(VerilogParser.Module_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 */
	void enterList_of_port_connections(VerilogParser.List_of_port_connectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 */
	void exitList_of_port_connections(VerilogParser.List_of_port_connectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#named_port_connection}.
	 * @param ctx the parse tree
	 */
	void enterNamed_port_connection(VerilogParser.Named_port_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#named_port_connection}.
	 * @param ctx the parse tree
	 */
	void exitNamed_port_connection(VerilogParser.Named_port_connectionContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#delay_or_event_control}.
	 * @param ctx the parse tree
	 */
	void enterDelay_or_event_control(VerilogParser.Delay_or_event_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delay_or_event_control}.
	 * @param ctx the parse tree
	 */
	void exitDelay_or_event_control(VerilogParser.Delay_or_event_controlContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void enterCompiler_directive(VerilogParser.Compiler_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#compiler_directive}.
	 * @param ctx the parse tree
	 */
	void exitCompiler_directive(VerilogParser.Compiler_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#define_directive}.
	 * @param ctx the parse tree
	 */
	void enterDefine_directive(VerilogParser.Define_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#define_directive}.
	 * @param ctx the parse tree
	 */
	void exitDefine_directive(VerilogParser.Define_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#include_directive}.
	 * @param ctx the parse tree
	 */
	void enterInclude_directive(VerilogParser.Include_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#include_directive}.
	 * @param ctx the parse tree
	 */
	void exitInclude_directive(VerilogParser.Include_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timescale_directive}.
	 * @param ctx the parse tree
	 */
	void enterTimescale_directive(VerilogParser.Timescale_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timescale_directive}.
	 * @param ctx the parse tree
	 */
	void exitTimescale_directive(VerilogParser.Timescale_directiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ifdef_directive}.
	 * @param ctx the parse tree
	 */
	void enterIfdef_directive(VerilogParser.Ifdef_directiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ifdef_directive}.
	 * @param ctx the parse tree
	 */
	void exitIfdef_directive(VerilogParser.Ifdef_directiveContext ctx);
}