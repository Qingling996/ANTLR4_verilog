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
	 * Enter a parse tree produced by {@link VerilogParser#module_body}.
	 * @param ctx the parse tree
	 */
	void enterModule_body(VerilogParser.Module_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_body}.
	 * @param ctx the parse tree
	 */
	void exitModule_body(VerilogParser.Module_bodyContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#module_declaration_item}.
	 * @param ctx the parse tree
	 */
	void enterModule_declaration_item(VerilogParser.Module_declaration_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_declaration_item}.
	 * @param ctx the parse tree
	 */
	void exitModule_declaration_item(VerilogParser.Module_declaration_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_procedural_item}.
	 * @param ctx the parse tree
	 */
	void enterModule_procedural_item(VerilogParser.Module_procedural_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_procedural_item}.
	 * @param ctx the parse tree
	 */
	void exitModule_procedural_item(VerilogParser.Module_procedural_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#module_instantiation_item}.
	 * @param ctx the parse tree
	 */
	void enterModule_instantiation_item(VerilogParser.Module_instantiation_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#module_instantiation_item}.
	 * @param ctx the parse tree
	 */
	void exitModule_instantiation_item(VerilogParser.Module_instantiation_itemContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#ansi_port_list}.
	 * @param ctx the parse tree
	 */
	void enterAnsi_port_list(VerilogParser.Ansi_port_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ansi_port_list}.
	 * @param ctx the parse tree
	 */
	void exitAnsi_port_list(VerilogParser.Ansi_port_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#ansi_port_declaration}.
	 * @param ctx the parse tree
	 */
	void enterAnsi_port_declaration(VerilogParser.Ansi_port_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#ansi_port_declaration}.
	 * @param ctx the parse tree
	 */
	void exitAnsi_port_declaration(VerilogParser.Ansi_port_declarationContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#event_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterEvent_expression_list(VerilogParser.Event_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#event_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitEvent_expression_list(VerilogParser.Event_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#event_primary}.
	 * @param ctx the parse tree
	 */
	void enterEvent_primary(VerilogParser.Event_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#event_primary}.
	 * @param ctx the parse tree
	 */
	void exitEvent_primary(VerilogParser.Event_primaryContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_or_expression(VerilogParser.Logical_or_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#logical_or_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_or_expression(VerilogParser.Logical_or_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void enterLogical_and_expression(VerilogParser.Logical_and_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#logical_and_expression}.
	 * @param ctx the parse tree
	 */
	void exitLogical_and_expression(VerilogParser.Logical_and_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void enterEquality_expression(VerilogParser.Equality_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#equality_expression}.
	 * @param ctx the parse tree
	 */
	void exitEquality_expression(VerilogParser.Equality_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational_expression(VerilogParser.Relational_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#relational_expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational_expression(VerilogParser.Relational_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void enterShift_expression(VerilogParser.Shift_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#shift_expression}.
	 * @param ctx the parse tree
	 */
	void exitShift_expression(VerilogParser.Shift_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expression(VerilogParser.Additive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#additive_expression}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expression(VerilogParser.Additive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expression(VerilogParser.Multiplicative_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#multiplicative_expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expression(VerilogParser.Multiplicative_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_expression(VerilogParser.Unary_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#unary_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_expression(VerilogParser.Unary_expressionContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void enterElse_clause(VerilogParser.Else_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#else_clause}.
	 * @param ctx the parse tree
	 */
	void exitElse_clause(VerilogParser.Else_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VerilogParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void enterStatement_block(VerilogParser.Statement_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#statement_block}.
	 * @param ctx the parse tree
	 */
	void exitStatement_block(VerilogParser.Statement_blockContext ctx);
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
	 * Enter a parse tree produced by {@link VerilogParser#list_of_net_identifiers_or_assignments}.
	 * @param ctx the parse tree
	 */
	void enterList_of_net_identifiers_or_assignments(VerilogParser.List_of_net_identifiers_or_assignmentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VerilogParser#list_of_net_identifiers_or_assignments}.
	 * @param ctx the parse tree
	 */
	void exitList_of_net_identifiers_or_assignments(VerilogParser.List_of_net_identifiers_or_assignmentsContext ctx);
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
}