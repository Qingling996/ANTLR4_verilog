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
	 * Enter a parse tree produced by {@link VerilogParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(VerilogParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(VerilogParser.DescriptionContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#module_keyword}.
	 * @param ctx the parse tree
	 */
	void enterModule_keyword(VerilogParser.Module_keywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_keyword}.
	 * @param ctx the parse tree
	 */
	void exitModule_keyword(VerilogParser.Module_keywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUdp_declaration(VerilogParser.Udp_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUdp_declaration(VerilogParser.Udp_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_identifier}.
	 * @param ctx the parse tree
	 */
	void enterUdp_identifier(VerilogParser.Udp_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_identifier}.
	 * @param ctx the parse tree
	 */
	void exitUdp_identifier(VerilogParser.Udp_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_port_identifier}.
	 * @param ctx the parse tree
	 */
	void enterUdp_port_identifier(VerilogParser.Udp_port_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_port_identifier}.
	 * @param ctx the parse tree
	 */
	void exitUdp_port_identifier(VerilogParser.Udp_port_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#output_port_identifier}.
	 * @param ctx the parse tree
	 */
	void enterOutput_port_identifier(VerilogParser.Output_port_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#output_port_identifier}.
	 * @param ctx the parse tree
	 */
	void exitOutput_port_identifier(VerilogParser.Output_port_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_port_list}.
	 * @param ctx the parse tree
	 */
	void enterUdp_port_list(VerilogParser.Udp_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_port_list}.
	 * @param ctx the parse tree
	 */
	void exitUdp_port_list(VerilogParser.Udp_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#output_port}.
	 * @param ctx the parse tree
	 */
	void enterOutput_port(VerilogParser.Output_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#output_port}.
	 * @param ctx the parse tree
	 */
	void exitOutput_port(VerilogParser.Output_portContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#input_port}.
	 * @param ctx the parse tree
	 */
	void enterInput_port(VerilogParser.Input_portContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#input_port}.
	 * @param ctx the parse tree
	 */
	void exitInput_port(VerilogParser.Input_portContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#list_of_udp_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_udp_port_identifiers(VerilogParser.List_of_udp_port_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_udp_port_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_udp_port_identifiers(VerilogParser.List_of_udp_port_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterUdp_port_declaration(VerilogParser.Udp_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitUdp_port_declaration(VerilogParser.Udp_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_body}.
	 * @param ctx the parse tree
	 */
	void enterUdp_body(VerilogParser.Udp_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_body}.
	 * @param ctx the parse tree
	 */
	void exitUdp_body(VerilogParser.Udp_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#combinational_body}.
	 * @param ctx the parse tree
	 */
	void enterCombinational_body(VerilogParser.Combinational_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#combinational_body}.
	 * @param ctx the parse tree
	 */
	void exitCombinational_body(VerilogParser.Combinational_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#combinational_entry}.
	 * @param ctx the parse tree
	 */
	void enterCombinational_entry(VerilogParser.Combinational_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#combinational_entry}.
	 * @param ctx the parse tree
	 */
	void exitCombinational_entry(VerilogParser.Combinational_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequential_body}.
	 * @param ctx the parse tree
	 */
	void enterSequential_body(VerilogParser.Sequential_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequential_body}.
	 * @param ctx the parse tree
	 */
	void exitSequential_body(VerilogParser.Sequential_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#sequential_entry}.
	 * @param ctx the parse tree
	 */
	void enterSequential_entry(VerilogParser.Sequential_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#sequential_entry}.
	 * @param ctx the parse tree
	 */
	void exitSequential_entry(VerilogParser.Sequential_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_initial_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUdp_initial_stmt(VerilogParser.Udp_initial_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_initial_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUdp_initial_stmt(VerilogParser.Udp_initial_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#level_input_list}.
	 * @param ctx the parse tree
	 */
	void enterLevel_input_list(VerilogParser.Level_input_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#level_input_list}.
	 * @param ctx the parse tree
	 */
	void exitLevel_input_list(VerilogParser.Level_input_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#seq_input_list}.
	 * @param ctx the parse tree
	 */
	void enterSeq_input_list(VerilogParser.Seq_input_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#seq_input_list}.
	 * @param ctx the parse tree
	 */
	void exitSeq_input_list(VerilogParser.Seq_input_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#init_val}.
	 * @param ctx the parse tree
	 */
	void enterInit_val(VerilogParser.Init_valContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#init_val}.
	 * @param ctx the parse tree
	 */
	void exitInit_val(VerilogParser.Init_valContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#level_symbol}.
	 * @param ctx the parse tree
	 */
	void enterLevel_symbol(VerilogParser.Level_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#level_symbol}.
	 * @param ctx the parse tree
	 */
	void exitLevel_symbol(VerilogParser.Level_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#seq_symbol}.
	 * @param ctx the parse tree
	 */
	void enterSeq_symbol(VerilogParser.Seq_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#seq_symbol}.
	 * @param ctx the parse tree
	 */
	void exitSeq_symbol(VerilogParser.Seq_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#output_symbol}.
	 * @param ctx the parse tree
	 */
	void enterOutput_symbol(VerilogParser.Output_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#output_symbol}.
	 * @param ctx the parse tree
	 */
	void exitOutput_symbol(VerilogParser.Output_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#current_state}.
	 * @param ctx the parse tree
	 */
	void enterCurrent_state(VerilogParser.Current_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#current_state}.
	 * @param ctx the parse tree
	 */
	void exitCurrent_state(VerilogParser.Current_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#next_state}.
	 * @param ctx the parse tree
	 */
	void enterNext_state(VerilogParser.Next_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#next_state}.
	 * @param ctx the parse tree
	 */
	void exitNext_state(VerilogParser.Next_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#config_declaration}.
	 * @param ctx the parse tree
	 */
	void enterConfig_declaration(VerilogParser.Config_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#config_declaration}.
	 * @param ctx the parse tree
	 */
	void exitConfig_declaration(VerilogParser.Config_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#design_statement}.
	 * @param ctx the parse tree
	 */
	void enterDesign_statement(VerilogParser.Design_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#design_statement}.
	 * @param ctx the parse tree
	 */
	void exitDesign_statement(VerilogParser.Design_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#config_rule_statement}.
	 * @param ctx the parse tree
	 */
	void enterConfig_rule_statement(VerilogParser.Config_rule_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#config_rule_statement}.
	 * @param ctx the parse tree
	 */
	void exitConfig_rule_statement(VerilogParser.Config_rule_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void enterDefault_clause(VerilogParser.Default_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#default_clause}.
	 * @param ctx the parse tree
	 */
	void exitDefault_clause(VerilogParser.Default_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#inst_clause}.
	 * @param ctx the parse tree
	 */
	void enterInst_clause(VerilogParser.Inst_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#inst_clause}.
	 * @param ctx the parse tree
	 */
	void exitInst_clause(VerilogParser.Inst_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cell_clause}.
	 * @param ctx the parse tree
	 */
	void enterCell_clause(VerilogParser.Cell_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cell_clause}.
	 * @param ctx the parse tree
	 */
	void exitCell_clause(VerilogParser.Cell_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#liblist_clause}.
	 * @param ctx the parse tree
	 */
	void enterLiblist_clause(VerilogParser.Liblist_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#liblist_clause}.
	 * @param ctx the parse tree
	 */
	void exitLiblist_clause(VerilogParser.Liblist_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#use_clause}.
	 * @param ctx the parse tree
	 */
	void enterUse_clause(VerilogParser.Use_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#use_clause}.
	 * @param ctx the parse tree
	 */
	void exitUse_clause(VerilogParser.Use_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#config_identifier}.
	 * @param ctx the parse tree
	 */
	void enterConfig_identifier(VerilogParser.Config_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#config_identifier}.
	 * @param ctx the parse tree
	 */
	void exitConfig_identifier(VerilogParser.Config_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#inst_name}.
	 * @param ctx the parse tree
	 */
	void enterInst_name(VerilogParser.Inst_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#inst_name}.
	 * @param ctx the parse tree
	 */
	void exitInst_name(VerilogParser.Inst_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#library_identifier}.
	 * @param ctx the parse tree
	 */
	void enterLibrary_identifier(VerilogParser.Library_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#library_identifier}.
	 * @param ctx the parse tree
	 */
	void exitLibrary_identifier(VerilogParser.Library_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#cell_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCell_identifier(VerilogParser.Cell_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#cell_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCell_identifier(VerilogParser.Cell_identifierContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#parameter_override}.
	 * @param ctx the parse tree
	 */
	void enterParameter_override(VerilogParser.Parameter_overrideContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_override}.
	 * @param ctx the parse tree
	 */
	void exitParameter_override(VerilogParser.Parameter_overrideContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_defparam_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_defparam_assignments(VerilogParser.List_of_defparam_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_defparam_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_defparam_assignments(VerilogParser.List_of_defparam_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#defparam_assignment}.
	 * @param ctx the parse tree
	 */
	void enterDefparam_assignment(VerilogParser.Defparam_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#defparam_assignment}.
	 * @param ctx the parse tree
	 */
	void exitDefparam_assignment(VerilogParser.Defparam_assignmentContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_parameter_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_parameter_identifier(VerilogParser.Hierarchical_parameter_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_parameter_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_parameter_identifier(VerilogParser.Hierarchical_parameter_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parameter_identifier}.
	 * @param ctx the parse tree
	 */
	void enterParameter_identifier(VerilogParser.Parameter_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_identifier}.
	 * @param ctx the parse tree
	 */
	void exitParameter_identifier(VerilogParser.Parameter_identifierContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#local_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void enterLocal_parameter_declaration(VerilogParser.Local_parameter_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#local_parameter_declaration}.
	 * @param ctx the parse tree
	 */
	void exitLocal_parameter_declaration(VerilogParser.Local_parameter_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parameter_type}.
	 * @param ctx the parse tree
	 */
	void enterParameter_type(VerilogParser.Parameter_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parameter_type}.
	 * @param ctx the parse tree
	 */
	void exitParameter_type(VerilogParser.Parameter_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void enterInteger_type(VerilogParser.Integer_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#integer_type}.
	 * @param ctx the parse tree
	 */
	void exitInteger_type(VerilogParser.Integer_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#real_type}.
	 * @param ctx the parse tree
	 */
	void enterReal_type(VerilogParser.Real_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#real_type}.
	 * @param ctx the parse tree
	 */
	void exitReal_type(VerilogParser.Real_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#realtime_type}.
	 * @param ctx the parse tree
	 */
	void enterRealtime_type(VerilogParser.Realtime_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#realtime_type}.
	 * @param ctx the parse tree
	 */
	void exitRealtime_type(VerilogParser.Realtime_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#time_type}.
	 * @param ctx the parse tree
	 */
	void enterTime_type(VerilogParser.Time_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#time_type}.
	 * @param ctx the parse tree
	 */
	void exitTime_type(VerilogParser.Time_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#signed_type}.
	 * @param ctx the parse tree
	 */
	void enterSigned_type(VerilogParser.Signed_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#signed_type}.
	 * @param ctx the parse tree
	 */
	void exitSigned_type(VerilogParser.Signed_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#unsigned_type}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_type(VerilogParser.Unsigned_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#unsigned_type}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_type(VerilogParser.Unsigned_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void enterType_identifier(VerilogParser.Type_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#type_identifier}.
	 * @param ctx the parse tree
	 */
	void exitType_identifier(VerilogParser.Type_identifierContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#port_type}.
	 * @param ctx the parse tree
	 */
	void enterPort_type(VerilogParser.Port_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_type}.
	 * @param ctx the parse tree
	 */
	void exitPort_type(VerilogParser.Port_typeContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#net_type}.
	 * @param ctx the parse tree
	 */
	void enterNet_type(VerilogParser.Net_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_type}.
	 * @param ctx the parse tree
	 */
	void exitNet_type(VerilogParser.Net_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#port_direction}.
	 * @param ctx the parse tree
	 */
	void enterPort_direction(VerilogParser.Port_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#port_direction}.
	 * @param ctx the parse tree
	 */
	void exitPort_direction(VerilogParser.Port_directionContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#non_port_module_item}.
	 * @param ctx the parse tree
	 */
	void enterNon_port_module_item(VerilogParser.Non_port_module_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#non_port_module_item}.
	 * @param ctx the parse tree
	 */
	void exitNon_port_module_item(VerilogParser.Non_port_module_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#generate_region}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_region(VerilogParser.Generate_regionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_region}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_region(VerilogParser.Generate_regionContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#module_or_generate_item}.
	 * @param ctx the parse tree
	 */
	void enterModule_or_generate_item(VerilogParser.Module_or_generate_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_or_generate_item}.
	 * @param ctx the parse tree
	 */
	void exitModule_or_generate_item(VerilogParser.Module_or_generate_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#block_identifier}.
	 * @param ctx the parse tree
	 */
	void enterBlock_identifier(VerilogParser.Block_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#block_identifier}.
	 * @param ctx the parse tree
	 */
	void exitBlock_identifier(VerilogParser.Block_identifierContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#generate_conditional_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_conditional_statement(VerilogParser.Generate_conditional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_conditional_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_conditional_statement(VerilogParser.Generate_conditional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#generate_case_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_case_statement(VerilogParser.Generate_case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_case_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_case_statement(VerilogParser.Generate_case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#generate_case_item}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_case_item(VerilogParser.Generate_case_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_case_item}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_case_item(VerilogParser.Generate_case_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#generate_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_loop_statement(VerilogParser.Generate_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#generate_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_loop_statement(VerilogParser.Generate_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#genvar_initialization}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_initialization(VerilogParser.Genvar_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#genvar_initialization}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_initialization(VerilogParser.Genvar_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#genvar_iteration}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_iteration(VerilogParser.Genvar_iterationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#genvar_iteration}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_iteration(VerilogParser.Genvar_iterationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#genvar_expression}.
	 * @param ctx the parse tree
	 */
	void enterGenvar_expression(VerilogParser.Genvar_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#genvar_expression}.
	 * @param ctx the parse tree
	 */
	void exitGenvar_expression(VerilogParser.Genvar_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#list_of_genvar_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_genvar_identifiers(VerilogParser.List_of_genvar_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_genvar_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_genvar_identifiers(VerilogParser.List_of_genvar_identifiersContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#list_of_parameter_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_parameter_assignments(VerilogParser.List_of_parameter_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_parameter_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_parameter_assignments(VerilogParser.List_of_parameter_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ordered_parameter_assignment}.
	 * @param ctx the parse tree
	 */
	void enterOrdered_parameter_assignment(VerilogParser.Ordered_parameter_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ordered_parameter_assignment}.
	 * @param ctx the parse tree
	 */
	void exitOrdered_parameter_assignment(VerilogParser.Ordered_parameter_assignmentContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#ordered_port_connection}.
	 * @param ctx the parse tree
	 */
	void enterOrdered_port_connection(VerilogParser.Ordered_port_connectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ordered_port_connection}.
	 * @param ctx the parse tree
	 */
	void exitOrdered_port_connection(VerilogParser.Ordered_port_connectionContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEvent_declaration(VerilogParser.Event_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#event_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEvent_declaration(VerilogParser.Event_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_event_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_event_identifiers(VerilogParser.List_of_event_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_event_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_event_identifiers(VerilogParser.List_of_event_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#event_identifier}.
	 * @param ctx the parse tree
	 */
	void enterEvent_identifier(VerilogParser.Event_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#event_identifier}.
	 * @param ctx the parse tree
	 */
	void exitEvent_identifier(VerilogParser.Event_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dimension}.
	 * @param ctx the parse tree
	 */
	void enterDimension(VerilogParser.DimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dimension}.
	 * @param ctx the parse tree
	 */
	void exitDimension(VerilogParser.DimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#dimension_expression}.
	 * @param ctx the parse tree
	 */
	void enterDimension_expression(VerilogParser.Dimension_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#dimension_expression}.
	 * @param ctx the parse tree
	 */
	void exitDimension_expression(VerilogParser.Dimension_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#attribute_instance}.
	 * @param ctx the parse tree
	 */
	void enterAttribute_instance(VerilogParser.Attribute_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#attribute_instance}.
	 * @param ctx the parse tree
	 */
	void exitAttribute_instance(VerilogParser.Attribute_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#attr_spec}.
	 * @param ctx the parse tree
	 */
	void enterAttr_spec(VerilogParser.Attr_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#attr_spec}.
	 * @param ctx the parse tree
	 */
	void exitAttr_spec(VerilogParser.Attr_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void enterAttr_name(VerilogParser.Attr_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#attr_name}.
	 * @param ctx the parse tree
	 */
	void exitAttr_name(VerilogParser.Attr_nameContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#select_or_range}.
	 * @param ctx the parse tree
	 */
	void enterSelect_or_range(VerilogParser.Select_or_rangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#select_or_range}.
	 * @param ctx the parse tree
	 */
	void exitSelect_or_range(VerilogParser.Select_or_rangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_variable_identifier(VerilogParser.Hierarchical_variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_variable_identifier(VerilogParser.Hierarchical_variable_identifierContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#constant_bit_select}.
	 * @param ctx the parse tree
	 */
	void enterConstant_bit_select(VerilogParser.Constant_bit_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_bit_select}.
	 * @param ctx the parse tree
	 */
	void exitConstant_bit_select(VerilogParser.Constant_bit_selectContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(VerilogParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(VerilogParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void enterFor_initialization(VerilogParser.For_initializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#for_initialization}.
	 * @param ctx the parse tree
	 */
	void exitFor_initialization(VerilogParser.For_initializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#data_type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterData_type_declaration(VerilogParser.Data_type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#data_type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitData_type_declaration(VerilogParser.Data_type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_variable_decl_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_variable_decl_assignments(VerilogParser.List_of_variable_decl_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_variable_decl_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_variable_decl_assignments(VerilogParser.List_of_variable_decl_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#variable_decl_assignment}.
	 * @param ctx the parse tree
	 */
	void enterVariable_decl_assignment(VerilogParser.Variable_decl_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_decl_assignment}.
	 * @param ctx the parse tree
	 */
	void exitVariable_decl_assignment(VerilogParser.Variable_decl_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#for_step}.
	 * @param ctx the parse tree
	 */
	void enterFor_step(VerilogParser.For_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#for_step}.
	 * @param ctx the parse tree
	 */
	void exitFor_step(VerilogParser.For_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_variable_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_variable_assignments(VerilogParser.List_of_variable_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_variable_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_variable_assignments(VerilogParser.List_of_variable_assignmentsContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#delay3}.
	 * @param ctx the parse tree
	 */
	void enterDelay3(VerilogParser.Delay3Context ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delay3}.
	 * @param ctx the parse tree
	 */
	void exitDelay3(VerilogParser.Delay3Context ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_event_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_event_identifier(VerilogParser.Hierarchical_event_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_event_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_event_identifier(VerilogParser.Hierarchical_event_identifierContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#constant_primary}.
	 * @param ctx the parse tree
	 */
	void enterConstant_primary(VerilogParser.Constant_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_primary}.
	 * @param ctx the parse tree
	 */
	void exitConstant_primary(VerilogParser.Constant_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_range_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_range_expression(VerilogParser.Constant_range_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_range_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_range_expression(VerilogParser.Constant_range_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConstant_concatenation(VerilogParser.Constant_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConstant_concatenation(VerilogParser.Constant_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_multi_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterConstant_multi_concatenation(VerilogParser.Constant_multi_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_multi_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitConstant_multi_concatenation(VerilogParser.Constant_multi_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_function_call}.
	 * @param ctx the parse tree
	 */
	void enterConstant_function_call(VerilogParser.Constant_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_function_call}.
	 * @param ctx the parse tree
	 */
	void exitConstant_function_call(VerilogParser.Constant_function_callContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#system_constant}.
	 * @param ctx the parse tree
	 */
	void enterSystem_constant(VerilogParser.System_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#system_constant}.
	 * @param ctx the parse tree
	 */
	void exitSystem_constant(VerilogParser.System_constantContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#concatenation_expression}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation_expression(VerilogParser.Concatenation_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#concatenation_expression}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation_expression(VerilogParser.Concatenation_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#multiple_concatenation}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_concatenation(VerilogParser.Multiple_concatenationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#multiple_concatenation}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_concatenation(VerilogParser.Multiple_concatenationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#concatenation_lvalue}.
	 * @param ctx the parse tree
	 */
	void enterConcatenation_lvalue(VerilogParser.Concatenation_lvalueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#concatenation_lvalue}.
	 * @param ctx the parse tree
	 */
	void exitConcatenation_lvalue(VerilogParser.Concatenation_lvalueContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#system_function_call}.
	 * @param ctx the parse tree
	 */
	void enterSystem_function_call(VerilogParser.System_function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#system_function_call}.
	 * @param ctx the parse tree
	 */
	void exitSystem_function_call(VerilogParser.System_function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#system_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSystem_identifier(VerilogParser.System_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#system_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSystem_identifier(VerilogParser.System_identifierContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#list_of_net_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_net_assignments(VerilogParser.List_of_net_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_net_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_net_assignments(VerilogParser.List_of_net_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNet_assignment(VerilogParser.Net_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNet_assignment(VerilogParser.Net_assignmentContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_net_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_net_identifier(VerilogParser.Hierarchical_net_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_net_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_net_identifier(VerilogParser.Hierarchical_net_identifierContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#name_of_gate_instance}.
	 * @param ctx the parse tree
	 */
	void enterName_of_gate_instance(VerilogParser.Name_of_gate_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#name_of_gate_instance}.
	 * @param ctx the parse tree
	 */
	void exitName_of_gate_instance(VerilogParser.Name_of_gate_instanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#gate_type}.
	 * @param ctx the parse tree
	 */
	void enterGate_type(VerilogParser.Gate_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#gate_type}.
	 * @param ctx the parse tree
	 */
	void exitGate_type(VerilogParser.Gate_typeContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#udp_instantiation}.
	 * @param ctx the parse tree
	 */
	void enterUdp_instantiation(VerilogParser.Udp_instantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_instantiation}.
	 * @param ctx the parse tree
	 */
	void exitUdp_instantiation(VerilogParser.Udp_instantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#udp_instance}.
	 * @param ctx the parse tree
	 */
	void enterUdp_instance(VerilogParser.Udp_instanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#udp_instance}.
	 * @param ctx the parse tree
	 */
	void exitUdp_instance(VerilogParser.Udp_instanceContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#procedural_continuous_assignments}.
	 * @param ctx the parse tree
	 */
	void enterProcedural_continuous_assignments(VerilogParser.Procedural_continuous_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#procedural_continuous_assignments}.
	 * @param ctx the parse tree
	 */
	void exitProcedural_continuous_assignments(VerilogParser.Procedural_continuous_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void enterAssign_statement(VerilogParser.Assign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#assign_statement}.
	 * @param ctx the parse tree
	 */
	void exitAssign_statement(VerilogParser.Assign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#deassign_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeassign_statement(VerilogParser.Deassign_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#deassign_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeassign_statement(VerilogParser.Deassign_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#force_statement}.
	 * @param ctx the parse tree
	 */
	void enterForce_statement(VerilogParser.Force_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#force_statement}.
	 * @param ctx the parse tree
	 */
	void exitForce_statement(VerilogParser.Force_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#release_statement}.
	 * @param ctx the parse tree
	 */
	void enterRelease_statement(VerilogParser.Release_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#release_statement}.
	 * @param ctx the parse tree
	 */
	void exitRelease_statement(VerilogParser.Release_statementContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#wait_statement}.
	 * @param ctx the parse tree
	 */
	void enterWait_statement(VerilogParser.Wait_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#wait_statement}.
	 * @param ctx the parse tree
	 */
	void exitWait_statement(VerilogParser.Wait_statementContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_task_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_task_identifier(VerilogParser.Hierarchical_task_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_task_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_task_identifier(VerilogParser.Hierarchical_task_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#hierarchical_block_identifier}.
	 * @param ctx the parse tree
	 */
	void enterHierarchical_block_identifier(VerilogParser.Hierarchical_block_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#hierarchical_block_identifier}.
	 * @param ctx the parse tree
	 */
	void exitHierarchical_block_identifier(VerilogParser.Hierarchical_block_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#seq_block}.
	 * @param ctx the parse tree
	 */
	void enterSeq_block(VerilogParser.Seq_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#seq_block}.
	 * @param ctx the parse tree
	 */
	void exitSeq_block(VerilogParser.Seq_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#par_block}.
	 * @param ctx the parse tree
	 */
	void enterPar_block(VerilogParser.Par_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#par_block}.
	 * @param ctx the parse tree
	 */
	void exitPar_block(VerilogParser.Par_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#block_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterBlock_item_declaration(VerilogParser.Block_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#block_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitBlock_item_declaration(VerilogParser.Block_item_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#system_task_enable}.
	 * @param ctx the parse tree
	 */
	void enterSystem_task_enable(VerilogParser.System_task_enableContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#system_task_enable}.
	 * @param ctx the parse tree
	 */
	void exitSystem_task_enable(VerilogParser.System_task_enableContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#system_task_identifier}.
	 * @param ctx the parse tree
	 */
	void enterSystem_task_identifier(VerilogParser.System_task_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#system_task_identifier}.
	 * @param ctx the parse tree
	 */
	void exitSystem_task_identifier(VerilogParser.System_task_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#task_arg_list}.
	 * @param ctx the parse tree
	 */
	void enterTask_arg_list(VerilogParser.Task_arg_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_arg_list}.
	 * @param ctx the parse tree
	 */
	void exitTask_arg_list(VerilogParser.Task_arg_listContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#lifetime}.
	 * @param ctx the parse tree
	 */
	void enterLifetime(VerilogParser.LifetimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#lifetime}.
	 * @param ctx the parse tree
	 */
	void exitLifetime(VerilogParser.LifetimeContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#tf_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTf_port_declaration(VerilogParser.Tf_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#tf_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTf_port_declaration(VerilogParser.Tf_port_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#task_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterTask_item_declaration(VerilogParser.Task_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#task_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitTask_item_declaration(VerilogParser.Task_item_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#function_data_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_data_type(VerilogParser.Function_data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_data_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_data_type(VerilogParser.Function_data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#function_item_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunction_item_declaration(VerilogParser.Function_item_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#function_item_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunction_item_declaration(VerilogParser.Function_item_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#specify_block}.
	 * @param ctx the parse tree
	 */
	void enterSpecify_block(VerilogParser.Specify_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specify_block}.
	 * @param ctx the parse tree
	 */
	void exitSpecify_block(VerilogParser.Specify_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specify_item}.
	 * @param ctx the parse tree
	 */
	void enterSpecify_item(VerilogParser.Specify_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specify_item}.
	 * @param ctx the parse tree
	 */
	void exitSpecify_item(VerilogParser.Specify_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specparam_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSpecparam_declaration(VerilogParser.Specparam_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specparam_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSpecparam_declaration(VerilogParser.Specparam_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#path_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPath_declaration(VerilogParser.Path_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#path_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPath_declaration(VerilogParser.Path_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#system_timing_check}.
	 * @param ctx the parse tree
	 */
	void enterSystem_timing_check(VerilogParser.System_timing_checkContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#system_timing_check}.
	 * @param ctx the parse tree
	 */
	void exitSystem_timing_check(VerilogParser.System_timing_checkContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timing_check_event}.
	 * @param ctx the parse tree
	 */
	void enterTiming_check_event(VerilogParser.Timing_check_eventContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timing_check_event}.
	 * @param ctx the parse tree
	 */
	void exitTiming_check_event(VerilogParser.Timing_check_eventContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#edge_control}.
	 * @param ctx the parse tree
	 */
	void enterEdge_control(VerilogParser.Edge_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#edge_control}.
	 * @param ctx the parse tree
	 */
	void exitEdge_control(VerilogParser.Edge_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_path_expression}.
	 * @param ctx the parse tree
	 */
	void enterModule_path_expression(VerilogParser.Module_path_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_path_expression}.
	 * @param ctx the parse tree
	 */
	void exitModule_path_expression(VerilogParser.Module_path_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_path_primary}.
	 * @param ctx the parse tree
	 */
	void enterModule_path_primary(VerilogParser.Module_path_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_path_primary}.
	 * @param ctx the parse tree
	 */
	void exitModule_path_primary(VerilogParser.Module_path_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#unary_module_path_operator}.
	 * @param ctx the parse tree
	 */
	void enterUnary_module_path_operator(VerilogParser.Unary_module_path_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#unary_module_path_operator}.
	 * @param ctx the parse tree
	 */
	void exitUnary_module_path_operator(VerilogParser.Unary_module_path_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#binary_module_path_operator}.
	 * @param ctx the parse tree
	 */
	void enterBinary_module_path_operator(VerilogParser.Binary_module_path_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#binary_module_path_operator}.
	 * @param ctx the parse tree
	 */
	void exitBinary_module_path_operator(VerilogParser.Binary_module_path_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timing_check_condition}.
	 * @param ctx the parse tree
	 */
	void enterTiming_check_condition(VerilogParser.Timing_check_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timing_check_condition}.
	 * @param ctx the parse tree
	 */
	void exitTiming_check_condition(VerilogParser.Timing_check_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expression(VerilogParser.Simple_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#simple_expression}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expression(VerilogParser.Simple_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#timing_check_limit}.
	 * @param ctx the parse tree
	 */
	void enterTiming_check_limit(VerilogParser.Timing_check_limitContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#timing_check_limit}.
	 * @param ctx the parse tree
	 */
	void exitTiming_check_limit(VerilogParser.Timing_check_limitContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#constant_mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_mintypmax_expression(VerilogParser.Constant_mintypmax_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#constant_mintypmax_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_mintypmax_expression(VerilogParser.Constant_mintypmax_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#notifier_control}.
	 * @param ctx the parse tree
	 */
	void enterNotifier_control(VerilogParser.Notifier_controlContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#notifier_control}.
	 * @param ctx the parse tree
	 */
	void exitNotifier_control(VerilogParser.Notifier_controlContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_specparam_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_specparam_assignments(VerilogParser.List_of_specparam_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_specparam_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_specparam_assignments(VerilogParser.List_of_specparam_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specparam_assignment}.
	 * @param ctx the parse tree
	 */
	void enterSpecparam_assignment(VerilogParser.Specparam_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specparam_assignment}.
	 * @param ctx the parse tree
	 */
	void exitSpecparam_assignment(VerilogParser.Specparam_assignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#simple_path_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSimple_path_declaration(VerilogParser.Simple_path_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#simple_path_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSimple_path_declaration(VerilogParser.Simple_path_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parallel_path_description}.
	 * @param ctx the parse tree
	 */
	void enterParallel_path_description(VerilogParser.Parallel_path_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parallel_path_description}.
	 * @param ctx the parse tree
	 */
	void exitParallel_path_description(VerilogParser.Parallel_path_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#full_path_description}.
	 * @param ctx the parse tree
	 */
	void enterFull_path_description(VerilogParser.Full_path_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#full_path_description}.
	 * @param ctx the parse tree
	 */
	void exitFull_path_description(VerilogParser.Full_path_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#path_delay_value}.
	 * @param ctx the parse tree
	 */
	void enterPath_delay_value(VerilogParser.Path_delay_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#path_delay_value}.
	 * @param ctx the parse tree
	 */
	void exitPath_delay_value(VerilogParser.Path_delay_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specify_input_terminal_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterSpecify_input_terminal_descriptor(VerilogParser.Specify_input_terminal_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specify_input_terminal_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitSpecify_input_terminal_descriptor(VerilogParser.Specify_input_terminal_descriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#specify_output_terminal_descriptor}.
	 * @param ctx the parse tree
	 */
	void enterSpecify_output_terminal_descriptor(VerilogParser.Specify_output_terminal_descriptorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#specify_output_terminal_descriptor}.
	 * @param ctx the parse tree
	 */
	void exitSpecify_output_terminal_descriptor(VerilogParser.Specify_output_terminal_descriptorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#input_identifier}.
	 * @param ctx the parse tree
	 */
	void enterInput_identifier(VerilogParser.Input_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#input_identifier}.
	 * @param ctx the parse tree
	 */
	void exitInput_identifier(VerilogParser.Input_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#output_identifier}.
	 * @param ctx the parse tree
	 */
	void enterOutput_identifier(VerilogParser.Output_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#output_identifier}.
	 * @param ctx the parse tree
	 */
	void exitOutput_identifier(VerilogParser.Output_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_path_inputs}.
	 * @param ctx the parse tree
	 */
	void enterList_of_path_inputs(VerilogParser.List_of_path_inputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_path_inputs}.
	 * @param ctx the parse tree
	 */
	void exitList_of_path_inputs(VerilogParser.List_of_path_inputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_path_outputs}.
	 * @param ctx the parse tree
	 */
	void enterList_of_path_outputs(VerilogParser.List_of_path_outputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_path_outputs}.
	 * @param ctx the parse tree
	 */
	void exitList_of_path_outputs(VerilogParser.List_of_path_outputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_path_delay_expressions}.
	 * @param ctx the parse tree
	 */
	void enterList_of_path_delay_expressions(VerilogParser.List_of_path_delay_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_path_delay_expressions}.
	 * @param ctx the parse tree
	 */
	void exitList_of_path_delay_expressions(VerilogParser.List_of_path_delay_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void enterPath_delay_expression(VerilogParser.Path_delay_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#path_delay_expression}.
	 * @param ctx the parse tree
	 */
	void exitPath_delay_expression(VerilogParser.Path_delay_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#polarity_operator}.
	 * @param ctx the parse tree
	 */
	void enterPolarity_operator(VerilogParser.Polarity_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#polarity_operator}.
	 * @param ctx the parse tree
	 */
	void exitPolarity_operator(VerilogParser.Polarity_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#edge_sensitive_path_declaration}.
	 * @param ctx the parse tree
	 */
	void enterEdge_sensitive_path_declaration(VerilogParser.Edge_sensitive_path_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#edge_sensitive_path_declaration}.
	 * @param ctx the parse tree
	 */
	void exitEdge_sensitive_path_declaration(VerilogParser.Edge_sensitive_path_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#conditional_port_expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional_port_expression(VerilogParser.Conditional_port_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#conditional_port_expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional_port_expression(VerilogParser.Conditional_port_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#path_description}.
	 * @param ctx the parse tree
	 */
	void enterPath_description(VerilogParser.Path_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#path_description}.
	 * @param ctx the parse tree
	 */
	void exitPath_description(VerilogParser.Path_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#parallel_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 */
	void enterParallel_edge_sensitive_path_description(VerilogParser.Parallel_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#parallel_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 */
	void exitParallel_edge_sensitive_path_description(VerilogParser.Parallel_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#full_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 */
	void enterFull_edge_sensitive_path_description(VerilogParser.Full_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#full_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 */
	void exitFull_edge_sensitive_path_description(VerilogParser.Full_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#edge_identifier}.
	 * @param ctx the parse tree
	 */
	void enterEdge_identifier(VerilogParser.Edge_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#edge_identifier}.
	 * @param ctx the parse tree
	 */
	void exitEdge_identifier(VerilogParser.Edge_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#data_source_expression}.
	 * @param ctx the parse tree
	 */
	void enterData_source_expression(VerilogParser.Data_source_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#data_source_expression}.
	 * @param ctx the parse tree
	 */
	void exitData_source_expression(VerilogParser.Data_source_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#scalar_constant}.
	 * @param ctx the parse tree
	 */
	void enterScalar_constant(VerilogParser.Scalar_constantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#scalar_constant}.
	 * @param ctx the parse tree
	 */
	void exitScalar_constant(VerilogParser.Scalar_constantContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#state_dependent_path_declaration}.
	 * @param ctx the parse tree
	 */
	void enterState_dependent_path_declaration(VerilogParser.State_dependent_path_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#state_dependent_path_declaration}.
	 * @param ctx the parse tree
	 */
	void exitState_dependent_path_declaration(VerilogParser.State_dependent_path_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#polarity_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void enterPolarity_operator_declaration(VerilogParser.Polarity_operator_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#polarity_operator_declaration}.
	 * @param ctx the parse tree
	 */
	void exitPolarity_operator_declaration(VerilogParser.Polarity_operator_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_declaration}.
	 * @param ctx the parse tree
	 */
	void enterNet_declaration(VerilogParser.Net_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_declaration}.
	 * @param ctx the parse tree
	 */
	void exitNet_declaration(VerilogParser.Net_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#net_identifier}.
	 * @param ctx the parse tree
	 */
	void enterNet_identifier(VerilogParser.Net_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_identifier}.
	 * @param ctx the parse tree
	 */
	void exitNet_identifier(VerilogParser.Net_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_net_decl_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_net_decl_assignments(VerilogParser.List_of_net_decl_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_net_decl_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_net_decl_assignments(VerilogParser.List_of_net_decl_assignmentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#net_decl_assignment}.
	 * @param ctx the parse tree
	 */
	void enterNet_decl_assignment(VerilogParser.Net_decl_assignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#net_decl_assignment}.
	 * @param ctx the parse tree
	 */
	void exitNet_decl_assignment(VerilogParser.Net_decl_assignmentContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#realtime_declaration}.
	 * @param ctx the parse tree
	 */
	void enterRealtime_declaration(VerilogParser.Realtime_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#realtime_declaration}.
	 * @param ctx the parse tree
	 */
	void exitRealtime_declaration(VerilogParser.Realtime_declarationContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link VerilogParser#list_of_real_identifiers}.
	 * @param ctx the parse tree
	 */
	void enterList_of_real_identifiers(VerilogParser.List_of_real_identifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_real_identifiers}.
	 * @param ctx the parse tree
	 */
	void exitList_of_real_identifiers(VerilogParser.List_of_real_identifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void enterVariable_identifier(VerilogParser.Variable_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#variable_identifier}.
	 * @param ctx the parse tree
	 */
	void exitVariable_identifier(VerilogParser.Variable_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#real_identifier}.
	 * @param ctx the parse tree
	 */
	void enterReal_identifier(VerilogParser.Real_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#real_identifier}.
	 * @param ctx the parse tree
	 */
	void exitReal_identifier(VerilogParser.Real_identifierContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#drive_strength}.
	 * @param ctx the parse tree
	 */
	void enterDrive_strength(VerilogParser.Drive_strengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#drive_strength}.
	 * @param ctx the parse tree
	 */
	void exitDrive_strength(VerilogParser.Drive_strengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#strength0}.
	 * @param ctx the parse tree
	 */
	void enterStrength0(VerilogParser.Strength0Context ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#strength0}.
	 * @param ctx the parse tree
	 */
	void exitStrength0(VerilogParser.Strength0Context ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#strength1}.
	 * @param ctx the parse tree
	 */
	void enterStrength1(VerilogParser.Strength1Context ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#strength1}.
	 * @param ctx the parse tree
	 */
	void exitStrength1(VerilogParser.Strength1Context ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#highz0}.
	 * @param ctx the parse tree
	 */
	void enterHighz0(VerilogParser.Highz0Context ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#highz0}.
	 * @param ctx the parse tree
	 */
	void exitHighz0(VerilogParser.Highz0Context ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#highz1}.
	 * @param ctx the parse tree
	 */
	void enterHighz1(VerilogParser.Highz1Context ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#highz1}.
	 * @param ctx the parse tree
	 */
	void exitHighz1(VerilogParser.Highz1Context ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#delay_value}.
	 * @param ctx the parse tree
	 */
	void enterDelay_value(VerilogParser.Delay_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#delay_value}.
	 * @param ctx the parse tree
	 */
	void exitDelay_value(VerilogParser.Delay_valueContext ctx);
}