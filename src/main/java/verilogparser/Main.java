package verilogparser;

import verilog.VerilogLexer;
import verilog.VerilogParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.gui.TreeViewer;

// 新增的GUI相关导入
import javax.swing.*;
import java.awt.*; // 包含GraphicsEnvironment
import java.util.Arrays; // 新增的Arrays导入

public class Main {
    public static void main(String[] args) throws Exception {
        // String verilogCode = "module example(input a, output b); assign b = ~a; endmodule";

        // 修改为从文件读取（参数传入路径）
        if (args.length == 0) {
            System.err.println("Usage: java Main  <file-or-directory>");
            return;
        }
        String filePath = args[0];
        CharStream input = CharStreams.fromFileName(filePath); // 关键修改
        
        // 解析管道
        // CharStream input = CharStreams.fromString(verilogCode);
        VerilogLexer lexer = new VerilogLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VerilogParser parser = new VerilogParser(tokens);

        // 获取语法树
        ParseTree tree = parser.source_text();
        System.out.println(tree.toStringTree(parser));

        // 图形化展示
        if (!GraphicsEnvironment.isHeadless()) {
            showAST(parser, tree);
        }
    }

    private static void showAST(VerilogParser parser, ParseTree tree) {
        JFrame frame = new JFrame("Verilog AST");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        TreeViewer viewer = new TreeViewer(
            Arrays.asList(parser.getRuleNames()), 
            tree
        );
        
        viewer.setScale(1.5);
        JScrollPane scrollPane = new JScrollPane(viewer);
        frame.add(scrollPane);
        
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
