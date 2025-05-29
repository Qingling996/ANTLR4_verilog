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

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) throws Exception {

        // 修改为从文件读取（参数传入路径）
        if (args.length == 0) {
            System.err.println("Usage: java Main  <file-or-directory>");
            return;
        }
        String filePath = args[0];
        CharStream input = CharStreams.fromFileName(filePath); // 关键修改
        
        // 解析管道
        VerilogLexer lexer = new VerilogLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VerilogParser parser = new VerilogParser(tokens);

        // 获取语法树
        ParseTree tree = parser.source_text();
        System.out.println(tree.toStringTree(parser));

        // 保存为JSON
        saveASTJson(parser, tree, "Verilog_AST.json");

        // 图形化展示
        if (!GraphicsEnvironment.isHeadless()) {
            showAST(parser, tree);
            saveASTImage(parser, tree, "Verilog_AST.png"); // 保存为 ast.png
        }
    }

    private static void showAST(VerilogParser parser, ParseTree tree) {
        JFrame frame = new JFrame("Verilog_AST");
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

    // 保存AST为图片
    private static void saveASTImage(VerilogParser parser, ParseTree tree, String filename) throws Exception {
        // 关键：设置连线颜色
        UIManager.put("Tree.hash", Color.BLACK);

        TreeViewer viewer = new TreeViewer(
            Arrays.asList(parser.getRuleNames()),
            tree
        );
        viewer.setScale(1.5f);
        viewer.setOpaque(true);
        viewer.setBackground(Color.WHITE);
        viewer.setSize(viewer.getPreferredSize());

        BufferedImage image = new BufferedImage(
            viewer.getWidth(), viewer.getHeight(),
            BufferedImage.TYPE_INT_ARGB
        );
        Graphics2D g2 = image.createGraphics();

        // 填充白色背景
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, image.getWidth(), image.getHeight());

        viewer.paint(g2);
        g2.dispose();

        ImageIO.write(image, "png", new File(filename));
        System.out.println("AST图片已保存到: " + filename);
    }

    // ParseTree转JSON字符串
    private static String parseTreeToJson(ParseTree tree, Parser parser) {
        StringBuilder sb = new StringBuilder();
        parseTreeToJsonHelper(tree, parser, sb, 0);
        return sb.toString();
    }

    private static void parseTreeToJsonHelper(ParseTree tree, Parser parser, StringBuilder sb, int indent) {
        String nodeName;
        if (tree instanceof ParserRuleContext) {
            nodeName = parser.getRuleNames()[((ParserRuleContext) tree).getRuleIndex()];
        } else {
            nodeName = tree.getText().replace("\"", "\\\"");
        }
        String indentStr = "  ".repeat(indent);
        sb.append(indentStr).append("{\n");
        sb.append(indentStr).append("  \"name\": \"").append(nodeName).append("\"");
        int childCount = tree.getChildCount();
        if (childCount > 0) {
            sb.append(",\n").append(indentStr).append("  \"children\": [\n");
            for (int i = 0; i < childCount; i++) {
                parseTreeToJsonHelper(tree.getChild(i), parser, sb, indent + 2);
                if (i != childCount - 1) sb.append(",\n");
            }
            sb.append("\n").append(indentStr).append("  ]\n");
            sb.append(indentStr).append("}");
        } else {
            sb.append(", \"value\": \"").append(tree.getText().replace("\"", "\\\"")).append("\"");
            sb.append("\n").append(indentStr).append("}");
        }
    }

    // 保存AST为JSON文件
    private static void saveASTJson(VerilogParser parser, ParseTree tree, String filename) throws Exception {
        String json = parseTreeToJson(tree, parser);
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(json);
        }
        System.out.println("AST已保存为JSON: " + filename);
    }
}
