package verilogparser;

import verilog.VerilogLexer;
import verilog.VerilogParser;
import verilog.VerilogParserBaseListener;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // 1. 准备Verilog代码
        String verilogCode = "module example(input a, output b);\n" +
                            "  assign b = ~a;\n" +
                            "endmodule";
        
        // 2. 创建输入流
        CharStream input = CharStreams.fromString(verilogCode);
        
        // 3. 创建词法分析器
        VerilogLexer lexer = new VerilogLexer(input);
        
        // 4. 创建词法符号流
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // 5. 创建语法分析器
        VerilogParser parser = new VerilogParser(tokens);
        
        // 6. 开始解析(从source_text规则开始)
        ParseTree tree = parser.source_text();
        
        // 7. 打印解析树
        System.out.println("=== 基础解析树 ===");
        System.out.println(tree.toStringTree(parser));
        
        // 8. 使用详细监听器分析
        System.out.println("\n=== 语法树详细分析 ===");
        new ParseTreeWalker().walk(new VerboseListener(), tree);
        
        // 9. 使用原始监听器（可选）
        visualizeParseTree(tree, parser);
    }
    
    // 可视化解析树的辅助方法
    private static void visualizeParseTree(ParseTree tree, Parser parser) {
        ParseTreeWalker walker = new ParseTreeWalker();
        BaseVerilogListener listener = new BaseVerilogListener();
        walker.walk(listener, tree);
    }
    
    // 基础监听器实现
    static class BaseVerilogListener extends VerilogParserBaseListener {
        @Override
        public void enterModule_declaration(VerilogParser.Module_declarationContext ctx) {
            System.out.println("[基础监听] 发现模块: " + ctx.module_identifier().getText());
        }
        
        @Override
        public void enterAssignment(VerilogParser.AssignmentContext ctx) {
            System.out.println("[基础监听] 发现赋值: " + ctx.getText());
        }
    }
    
    // 详细监听器实现
    static class VerboseListener extends VerilogParserBaseListener {
        private int indent = 0;
        
        private String indent() {
            return "  ".repeat(indent);
        }
        
        @Override 
        public void enterEveryRule(ParserRuleContext ctx) {
            System.out.println(indent() + "进入规则: " + VerilogParser.ruleNames[ctx.getRuleIndex()]);
            indent++;
        }
        
        @Override 
        public void exitEveryRule(ParserRuleContext ctx) {
            indent--;
            System.out.println(indent() + "退出规则: " + VerilogParser.ruleNames[ctx.getRuleIndex()]);
        }
        
        @Override
        public void visitTerminal(TerminalNode node) {
            System.out.println(indent() + "终端: " + node.getText());
        }
    }
}
