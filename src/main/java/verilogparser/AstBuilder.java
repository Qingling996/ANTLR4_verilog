package verilogparser;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

import verilog.VerilogLexer;
import verilog.VerilogParser;
import verilog.VerilogParserBaseVisitor;

public class AstBuilder extends VerilogParserBaseVisitor<AstNode> {

    private final List<Token> tokens;
    private final Set<Integer> consumedCommentIndices = new HashSet<>();

    public AstBuilder(List<Token> tokens) {
        this.tokens = tokens;
    }

    @Override
    public AstNode visit(org.antlr.v4.runtime.tree.ParseTree tree) {
        if (tree == null) return null;
        AstNode node = super.visit(tree);
        // 对顶层节点进行特殊处理，捕获所有剩余的注释
        if (tree instanceof VerilogParser.Source_textContext) {
            attachComments(node, (ParserRuleContext) tree, true);
        }
        return node;
    }

    @Override
    protected AstNode defaultResult() {
        // 返回null，这样父节点在构建子列表时可以安全地忽略那些我们不关心的或空的子树
        return null;
    }
    
    @Override
    protected AstNode aggregateResult(AstNode aggregate, AstNode nextResult) {
        // 这个方法不用于构建子节点列表，我们在visit方法中手动处理
        // 总是返回第一个，因为我们不聚合平级的节点
        return aggregate;
    }

    @Override
    public AstNode visitTerminal(TerminalNode t) {
        Token symbol = t.getSymbol();
        if (symbol.getType() == Token.EOF) {
            return null; // 我们不希望EOF成为AST的一部分
        }

        AstNode node = new AstNode(VerilogParser.VOCABULARY.getSymbolicName(symbol.getType()));
        node.setValue(t.getText());
        node.setStart(new AstNode.Position(symbol.getLine(), symbol.getCharPositionInLine()));
        node.setEnd(new AstNode.Position(symbol.getLine(), symbol.getCharPositionInLine() + t.getText().length()));
        
        // 为Token附加注释，这里我们假设Token自身不直接拥有注释，而是其父规则节点拥有
        // 这个调用主要用于捕获某些特殊情况，但核心逻辑在 visitChildrenAndBuildNode 的 attachComments
        return node;
    }
    
    // 这是通用的visit方法，它会为所有规则节点构建子节点列表
    private AstNode visitChildrenAndBuildNode(ParserRuleContext ctx) {
        if (ctx == null) return null;
        String ruleName = VerilogParser.ruleNames[ctx.getRuleIndex()];
        AstNode node = new AstNode(ruleName);
        node.setStart(new AstNode.Position(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine()));
        node.setEnd(new AstNode.Position(ctx.getStop().getLine(), ctx.getStop().getCharPositionInLine() + ctx.getStop().getText().length()));

        for (int i = 0; i < ctx.getChildCount(); i++) {
            AstNode childNode = visit(ctx.getChild(i));
            if (childNode != null) {
                node.getChildren().add(childNode);
            }
        }
        
        // 关键：为规则节点附加注释
        attachComments(node, ctx, false);
        return node;
    }

    // 注释附加逻辑（保持不变）
    private void attachComments(AstNode node, ParserRuleContext ctx, boolean isRoot) {
        if (node == null || ctx == null) return;
        
        int startTokenIndex = ctx.getStart().getTokenIndex();
        int stopTokenIndex = ctx.getStop().getTokenIndex();
        
        // 1. 附加前导注释
        for (int i = startTokenIndex - 1; i >= 0; i--) {
            Token token = tokens.get(i);
            if (token.getChannel() == Token.DEFAULT_CHANNEL) break;
            if (token.getChannel() == VerilogLexer.COMMENTS) {
                if (!consumedCommentIndices.contains(token.getTokenIndex())) {
                    node.getLeadingComments().add(0, new AstNode.CommentInfo(token.getText(), "comment", token.getTokenIndex()));
                    consumedCommentIndices.add(token.getTokenIndex());
                }
            }
        }

        // 2. 附加后置注释
        for (int i = stopTokenIndex + 1; i < tokens.size(); i++) {
            Token token = tokens.get(i);
            if (token.getChannel() == Token.DEFAULT_CHANNEL) break;
            if (token.getChannel() == VerilogLexer.COMMENTS) {
                if (token.getLine() == ctx.getStop().getLine()) {
                    if (!consumedCommentIndices.contains(token.getTokenIndex())) {
                        node.getTrailingComments().add(new AstNode.CommentInfo(token.getText(), "comment", token.getTokenIndex()));
                        consumedCommentIndices.add(token.getTokenIndex());
                    }
                } else {
                    break;
                }
            }
        }
        
        // 如果是根节点，把所有剩下没消费的注释都给它
        if (isRoot) {
            for (Token token : tokens) {
                if (token.getChannel() == VerilogLexer.COMMENTS && !consumedCommentIndices.contains(token.getTokenIndex())) {
                     node.getLeadingComments().add(new AstNode.CommentInfo(token.getText(), "comment", token.getTokenIndex()));
                }
            }
        }
    }
    
    // --- 以下是为您 g4 文件中所有规则生成的 visit 方法重写 (已根据最新语法更新) ---

    @Override public AstNode visitSource_text(VerilogParser.Source_textContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitModule_declaration(VerilogParser.Module_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitParameter_port_list(VerilogParser.Parameter_port_listContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitParam_assignment(VerilogParser.Param_assignmentContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitPort_list(VerilogParser.Port_listContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitPort_declaration(VerilogParser.Port_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitInput_declaration(VerilogParser.Input_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitOutput_declaration(VerilogParser.Output_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitInout_declaration(VerilogParser.Inout_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitModule_item(VerilogParser.Module_itemContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitSignals_declaration(VerilogParser.Signals_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitParameter_declaration(VerilogParser.Parameter_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitLocalparam_declaration(VerilogParser.Localparam_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitReg_declaration(VerilogParser.Reg_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitWire_declaration(VerilogParser.Wire_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitInteger_declaration(VerilogParser.Integer_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitReal_declaration(VerilogParser.Real_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitTime_declaration(VerilogParser.Time_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitList_of_identifiers(VerilogParser.List_of_identifiersContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitContinuous_assign(VerilogParser.Continuous_assignContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitAlways_construct(VerilogParser.Always_constructContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitInitial_construct(VerilogParser.Initial_constructContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitStatement(VerilogParser.StatementContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitStatement_or_null(VerilogParser.Statement_or_nullContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitAssignment(VerilogParser.AssignmentContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitVariable_assignment(VerilogParser.Variable_assignmentContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitVariable_lvalue(VerilogParser.Variable_lvalueContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitHierarchical_identifier(VerilogParser.Hierarchical_identifierContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitConstant_expression(VerilogParser.Constant_expressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitDelay(VerilogParser.DelayContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitMintypmax_expression(VerilogParser.Mintypmax_expressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitCase_item(VerilogParser.Case_itemContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitTiming_control_statement(VerilogParser.Timing_control_statementContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitEvent_control(VerilogParser.Event_controlContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitDelay_control(VerilogParser.Delay_controlContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitEvent_expression(VerilogParser.Event_expressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitEvent_trigger(VerilogParser.Event_triggerContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitPosedge_expression(VerilogParser.Posedge_expressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitNegedge_expression(VerilogParser.Negedge_expressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitTask_enable_statement(VerilogParser.Task_enable_statementContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitList_of_arguments(VerilogParser.List_of_argumentsContext ctx) { return visitChildrenAndBuildNode(ctx); }

    // <<< --- 新增和修改的 Expression Visit 方法 --- >>>
    @Override public AstNode visitReplicationExpression(VerilogParser.ReplicationExpressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitBinaryExpression(VerilogParser.BinaryExpressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitTernaryExpression(VerilogParser.TernaryExpressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitUnaryExpression(VerilogParser.UnaryExpressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitPrimaryExpression(VerilogParser.PrimaryExpressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    
    @Override public AstNode visitPrimary(VerilogParser.PrimaryContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitConcatenation(VerilogParser.ConcatenationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitGate_instantiation(VerilogParser.Gate_instantiationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitGate_instance(VerilogParser.Gate_instanceContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitName_of_instance(VerilogParser.Name_of_instanceContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitTerminal(VerilogParser.TerminalContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitIdentifier_expression(VerilogParser.Identifier_expressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitCmos_switchtype(VerilogParser.Cmos_switchtypeContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitEnable_gatetype(VerilogParser.Enable_gatetypeContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitMos_switchtype(VerilogParser.Mos_switchtypeContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitN_input_gatetype(VerilogParser.N_input_gatetypeContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitTask_declaration(VerilogParser.Task_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitTask_tf_declaration(VerilogParser.Task_tf_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitFunction_declaration(VerilogParser.Function_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitFunction_local_declaration(VerilogParser.Function_local_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitGenerate_block(VerilogParser.Generate_blockContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitGenerate_item(VerilogParser.Generate_itemContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitGenerate_conditional(VerilogParser.Generate_conditionalContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitGenerate_loop(VerilogParser.Generate_loopContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitGenvar_declaration(VerilogParser.Genvar_declarationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitGenvar_assignment(VerilogParser.Genvar_assignmentContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitModule_instantiation(VerilogParser.Module_instantiationContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitParameter_value_assignment(VerilogParser.Parameter_value_assignmentContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitList_of_param_assignments(VerilogParser.List_of_param_assignmentsContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitNamed_parameter_assignment(VerilogParser.Named_parameter_assignmentContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitModule_instance(VerilogParser.Module_instanceContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitList_of_port_connections(VerilogParser.List_of_port_connectionsContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitNamed_port_connection(VerilogParser.Named_port_connectionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitRange_expression(VerilogParser.Range_expressionContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitDelay_or_event_control(VerilogParser.Delay_or_event_controlContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitDelay_value(VerilogParser.Delay_valueContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitUnary_operator(VerilogParser.Unary_operatorContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitBinary_operator(VerilogParser.Binary_operatorContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitFunction_call(VerilogParser.Function_callContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitNumber(VerilogParser.NumberContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitCompiler_directive(VerilogParser.Compiler_directiveContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitDefine_directive(VerilogParser.Define_directiveContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitTimescale_directive(VerilogParser.Timescale_directiveContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitInclude_directive(VerilogParser.Include_directiveContext ctx) { return visitChildrenAndBuildNode(ctx); }
    @Override public AstNode visitIfdef_directive(VerilogParser.Ifdef_directiveContext ctx) { return visitChildrenAndBuildNode(ctx); }
}

