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
	 * Visit a parse tree produced by {@link VerilogParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(VerilogParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_declaration(VerilogParser.Module_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_keyword(VerilogParser.Module_keywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_declaration(VerilogParser.Udp_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_identifier(VerilogParser.Udp_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_port_identifier(VerilogParser.Udp_port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#output_port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_port_identifier(VerilogParser.Output_port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_port_list(VerilogParser.Udp_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#output_port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_port(VerilogParser.Output_portContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#input_port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_port(VerilogParser.Input_portContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_port_declaration(VerilogParser.Udp_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#output_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_declaration(VerilogParser.Output_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#input_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_declaration(VerilogParser.Input_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_udp_port_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_udp_port_identifiers(VerilogParser.List_of_udp_port_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_body(VerilogParser.Udp_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#combinational_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinational_body(VerilogParser.Combinational_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#combinational_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombinational_entry(VerilogParser.Combinational_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequential_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequential_body(VerilogParser.Sequential_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#sequential_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequential_entry(VerilogParser.Sequential_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_initial_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_initial_stmt(VerilogParser.Udp_initial_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#level_input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel_input_list(VerilogParser.Level_input_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#seq_input_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_input_list(VerilogParser.Seq_input_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#init_val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit_val(VerilogParser.Init_valContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#level_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevel_symbol(VerilogParser.Level_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#seq_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_symbol(VerilogParser.Seq_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#output_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_symbol(VerilogParser.Output_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#current_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrent_state(VerilogParser.Current_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#next_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNext_state(VerilogParser.Next_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#config_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_declaration(VerilogParser.Config_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#design_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDesign_statement(VerilogParser.Design_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#config_rule_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_rule_statement(VerilogParser.Config_rule_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#default_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_clause(VerilogParser.Default_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#inst_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_clause(VerilogParser.Inst_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cell_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_clause(VerilogParser.Cell_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#liblist_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiblist_clause(VerilogParser.Liblist_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#use_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_clause(VerilogParser.Use_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#config_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig_identifier(VerilogParser.Config_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#inst_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInst_name(VerilogParser.Inst_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#library_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrary_identifier(VerilogParser.Library_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#cell_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCell_identifier(VerilogParser.Cell_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_declaration(VerilogParser.Parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#local_parameter_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_parameter_declaration(VerilogParser.Local_parameter_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange(VerilogParser.RangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_override}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_override(VerilogParser.Parameter_overrideContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_defparam_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_defparam_assignments(VerilogParser.List_of_defparam_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#defparam_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefparam_assignment(VerilogParser.Defparam_assignmentContext ctx);
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
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_parameter_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_parameter_identifier(VerilogParser.Hierarchical_parameter_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_identifier(VerilogParser.Parameter_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_port_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_port_list(VerilogParser.Parameter_port_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_type(VerilogParser.Parameter_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#integer_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_type(VerilogParser.Integer_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#real_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_type(VerilogParser.Real_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#realtime_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealtime_type(VerilogParser.Realtime_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#time_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_type(VerilogParser.Time_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#signed_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_type(VerilogParser.Signed_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#unsigned_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_type(VerilogParser.Unsigned_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#type_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_identifier(VerilogParser.Type_identifierContext ctx);
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
	 * Visit a parse tree produced by {@link VerilogParser#port_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_direction(VerilogParser.Port_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_type(VerilogParser.Net_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_port_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_identifiers(VerilogParser.List_of_port_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#non_port_module_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNon_port_module_item(VerilogParser.Non_port_module_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_declaration_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_declaration_item(VerilogParser.Module_declaration_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_instantiation_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_instantiation_item(VerilogParser.Module_instantiation_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_assignment_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_assignment_item(VerilogParser.Module_assignment_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_procedural_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_procedural_item(VerilogParser.Module_procedural_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_structural_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_structural_item(VerilogParser.Module_structural_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_task_function_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_task_function_item(VerilogParser.Module_task_function_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_region}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_region(VerilogParser.Generate_regionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_item(VerilogParser.Generate_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_declaration_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_declaration_item(VerilogParser.Generate_declaration_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_instantiation_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_instantiation_item(VerilogParser.Generate_instantiation_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_assignment_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_assignment_item(VerilogParser.Generate_assignment_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_procedural_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_procedural_item(VerilogParser.Generate_procedural_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_structural_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_structural_item(VerilogParser.Generate_structural_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_control_statement(VerilogParser.Generate_control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_identifier(VerilogParser.Block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_block(VerilogParser.Generate_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_conditional_statement(VerilogParser.Generate_conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_case_statement(VerilogParser.Generate_case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_case_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_case_item(VerilogParser.Generate_case_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#generate_loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_loop_statement(VerilogParser.Generate_loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_initialization(VerilogParser.Genvar_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_iteration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_iteration(VerilogParser.Genvar_iterationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_expression(VerilogParser.Genvar_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_declaration(VerilogParser.Genvar_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_genvar_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_genvar_identifiers(VerilogParser.List_of_genvar_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#genvar_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenvar_identifier(VerilogParser.Genvar_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_instantiation(VerilogParser.Module_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parameter_value_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter_value_assignment(VerilogParser.Parameter_value_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_parameter_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_parameter_assignments(VerilogParser.List_of_parameter_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ordered_parameter_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered_parameter_assignment(VerilogParser.Ordered_parameter_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#named_parameter_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_parameter_assignment(VerilogParser.Named_parameter_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_instance(VerilogParser.Module_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#name_of_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_of_instance(VerilogParser.Name_of_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_port_connections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_port_connections(VerilogParser.List_of_port_connectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#ordered_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrdered_port_connection(VerilogParser.Ordered_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#named_port_connection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamed_port_connection(VerilogParser.Named_port_connectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#event_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_declaration(VerilogParser.Event_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_event_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_event_identifiers(VerilogParser.List_of_event_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#event_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_identifier(VerilogParser.Event_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension(VerilogParser.DimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#dimension_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimension_expression(VerilogParser.Dimension_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#attribute_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_instance(VerilogParser.Attribute_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#attr_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_spec(VerilogParser.Attr_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#attr_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttr_name(VerilogParser.Attr_nameContext ctx);
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
	 * Visit a parse tree produced by {@link VerilogParser#select_or_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_or_range(VerilogParser.Select_or_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_variable_identifier(VerilogParser.Hierarchical_variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_identifier(VerilogParser.Hierarchical_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_bit_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_bit_select(VerilogParser.Constant_bit_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#bit_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBit_select(VerilogParser.Bit_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRange_expression(VerilogParser.Range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#concatenation_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation_lvalue(VerilogParser.Concatenation_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#conditional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_statement(VerilogParser.Conditional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(VerilogParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#for_initialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_initialization(VerilogParser.For_initializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#data_type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_declaration(VerilogParser.Data_type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_variable_decl_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_decl_assignments(VerilogParser.List_of_variable_decl_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_decl_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_decl_assignment(VerilogParser.Variable_decl_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#for_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_step(VerilogParser.For_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_variable_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_assignments(VerilogParser.List_of_variable_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_assignment(VerilogParser.Variable_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delay_or_event_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay_or_event_control(VerilogParser.Delay_or_event_controlContext ctx);
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
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_event_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_event_identifier(VerilogParser.Hierarchical_event_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(VerilogParser.Constant_expressionContext ctx);
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
	 * Visit a parse tree produced by {@link VerilogParser#constant_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_primary(VerilogParser.Constant_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_range_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_range_expression(VerilogParser.Constant_range_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_concatenation(VerilogParser.Constant_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_multi_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_multi_concatenation(VerilogParser.Constant_multi_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_function_call(VerilogParser.Constant_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#system_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_constant(VerilogParser.System_constantContext ctx);
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
	 * Visit a parse tree produced by {@link VerilogParser#concatenation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenation_expression(VerilogParser.Concatenation_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#multiple_concatenation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_concatenation(VerilogParser.Multiple_concatenationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(VerilogParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_identifier(VerilogParser.Function_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#system_function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_function_call(VerilogParser.System_function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#system_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_identifier(VerilogParser.System_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#mintypmax_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMintypmax_expression(VerilogParser.Mintypmax_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#continuous_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinuous_assign(VerilogParser.Continuous_assignContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_net_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_net_assignments(VerilogParser.List_of_net_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_assignment(VerilogParser.Net_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_lvalue(VerilogParser.Net_lvalueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_net_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_net_identifier(VerilogParser.Hierarchical_net_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#gate_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGate_instantiation(VerilogParser.Gate_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delay}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay(VerilogParser.DelayContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#delay3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelay3(VerilogParser.Delay3Context ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGate_instance(VerilogParser.Gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#name_of_gate_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_of_gate_instance(VerilogParser.Name_of_gate_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#gate_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGate_type(VerilogParser.Gate_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#terminal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminal(VerilogParser.TerminalContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_instantiation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_instantiation(VerilogParser.Udp_instantiationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#udp_instance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdp_instance(VerilogParser.Udp_instanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#initial_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitial_construct(VerilogParser.Initial_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#always_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlways_construct(VerilogParser.Always_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#statement_or_null}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_or_null(VerilogParser.Statement_or_nullContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(VerilogParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#procedural_continuous_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedural_continuous_assignments(VerilogParser.Procedural_continuous_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#assign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_statement(VerilogParser.Assign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#deassign_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeassign_statement(VerilogParser.Deassign_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#force_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForce_statement(VerilogParser.Force_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#release_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelease_statement(VerilogParser.Release_statementContext ctx);
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
	 * Visit a parse tree produced by {@link VerilogParser#wait_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWait_statement(VerilogParser.Wait_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#event_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_trigger(VerilogParser.Event_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_task_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_task_identifier(VerilogParser.Hierarchical_task_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#hierarchical_block_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHierarchical_block_identifier(VerilogParser.Hierarchical_block_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#seq_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeq_block(VerilogParser.Seq_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#par_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar_block(VerilogParser.Par_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#block_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_item_declaration(VerilogParser.Block_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_enable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_enable(VerilogParser.Task_enableContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#system_task_enable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_task_enable(VerilogParser.System_task_enableContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#system_task_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_task_identifier(VerilogParser.System_task_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_arg_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_arg_list(VerilogParser.Task_arg_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_declaration(VerilogParser.Task_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#lifetime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLifetime(VerilogParser.LifetimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_identifier(VerilogParser.Task_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#tf_port_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTf_port_declaration(VerilogParser.Tf_port_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#task_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTask_item_declaration(VerilogParser.Task_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_declaration(VerilogParser.Function_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_data_type(VerilogParser.Function_data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#function_item_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_item_declaration(VerilogParser.Function_item_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#disable_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisable_statement(VerilogParser.Disable_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specify_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_block(VerilogParser.Specify_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specify_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_item(VerilogParser.Specify_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specparam_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecparam_declaration(VerilogParser.Specparam_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_specparam_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_specparam_assignments(VerilogParser.List_of_specparam_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specparam_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecparam_assignment(VerilogParser.Specparam_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_declaration(VerilogParser.Path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#simple_path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_path_declaration(VerilogParser.Simple_path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parallel_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_path_description(VerilogParser.Parallel_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#full_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_path_description(VerilogParser.Full_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#edge_sensitive_path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_sensitive_path_declaration(VerilogParser.Edge_sensitive_path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#conditional_port_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional_port_expression(VerilogParser.Conditional_port_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_description(VerilogParser.Path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#parallel_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallel_edge_sensitive_path_description(VerilogParser.Parallel_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#full_edge_sensitive_path_description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_edge_sensitive_path_description(VerilogParser.Full_edge_sensitive_path_descriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#edge_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_identifier(VerilogParser.Edge_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#data_source_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_source_expression(VerilogParser.Data_source_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#scalar_constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_constant(VerilogParser.Scalar_constantContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#state_dependent_path_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_dependent_path_declaration(VerilogParser.State_dependent_path_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#polarity_operator_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolarity_operator_declaration(VerilogParser.Polarity_operator_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#path_delay_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_delay_value(VerilogParser.Path_delay_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_path_delay_expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_path_delay_expressions(VerilogParser.List_of_path_delay_expressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#path_delay_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath_delay_expression(VerilogParser.Path_delay_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specify_input_terminal_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_input_terminal_descriptor(VerilogParser.Specify_input_terminal_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#specify_output_terminal_descriptor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecify_output_terminal_descriptor(VerilogParser.Specify_output_terminal_descriptorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#input_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput_identifier(VerilogParser.Input_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#output_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_identifier(VerilogParser.Output_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_path_inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_path_inputs(VerilogParser.List_of_path_inputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_path_outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_path_outputs(VerilogParser.List_of_path_outputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#polarity_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPolarity_operator(VerilogParser.Polarity_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#system_timing_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_timing_check(VerilogParser.System_timing_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#timing_check_event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_check_event(VerilogParser.Timing_check_eventContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#edge_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdge_control(VerilogParser.Edge_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_path_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_expression(VerilogParser.Module_path_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_path_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_path_primary(VerilogParser.Module_path_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#unary_module_path_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_module_path_operator(VerilogParser.Unary_module_path_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#binary_module_path_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary_module_path_operator(VerilogParser.Binary_module_path_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#timing_check_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_check_condition(VerilogParser.Timing_check_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expression(VerilogParser.Simple_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#timing_check_limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTiming_check_limit(VerilogParser.Timing_check_limitContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#constant_mintypmax_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_mintypmax_expression(VerilogParser.Constant_mintypmax_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#notifier_control}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotifier_control(VerilogParser.Notifier_controlContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_declaration(VerilogParser.Net_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_net_identifiers_or_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_net_identifiers_or_assignments(VerilogParser.List_of_net_identifiers_or_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_net_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_net_identifiers(VerilogParser.List_of_net_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_identifier(VerilogParser.Net_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_net_decl_assignments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_net_decl_assignments(VerilogParser.List_of_net_decl_assignmentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#net_decl_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNet_decl_assignment(VerilogParser.Net_decl_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#reg_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReg_declaration(VerilogParser.Reg_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#integer_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInteger_declaration(VerilogParser.Integer_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#real_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_declaration(VerilogParser.Real_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#time_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_declaration(VerilogParser.Time_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#realtime_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealtime_declaration(VerilogParser.Realtime_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_variable_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_variable_identifiers(VerilogParser.List_of_variable_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#list_of_real_identifiers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_real_identifiers(VerilogParser.List_of_real_identifiersContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#variable_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_identifier(VerilogParser.Variable_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#real_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal_identifier(VerilogParser.Real_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#module_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_identifier(VerilogParser.Module_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#port_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_identifier(VerilogParser.Port_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(VerilogParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#drive_strength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrive_strength(VerilogParser.Drive_strengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#strength0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrength0(VerilogParser.Strength0Context ctx);
	/**
	 * Visit a parse tree produced by {@link VerilogParser#strength1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrength1(VerilogParser.Strength1Context ctx);
}