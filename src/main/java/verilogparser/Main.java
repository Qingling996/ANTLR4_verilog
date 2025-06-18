package verilogparser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTree;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import verilog.VerilogLexer;
import verilog.VerilogParser;

public class Main {

    // ==================================================================================
    // 改进 1：添加一个自定义的错误监听器
    // 当ANTLR遇到语法错误时，这个类会抛出异常，从而立即终止程序，而不是继续错误地解析。
    // ==================================================================================
    public static class ThrowingErrorListener extends BaseErrorListener {
        public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
                throws ParseCancellationException {
            // 抛出异常，附带清晰的错误信息
            throw new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg);
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java -jar <jar-file> <input-verilog-file> <output-json-file>");
            System.exit(1);
        }
        String inputFilePath = args[0];
        String outputFilePath = args[1];

        try {
            // ==================================================================================
            // 关键诊断代码：打印程序实际读取到的文件内容
            // ==================================================================================
            String content = new String(Files.readAllBytes(Paths.get(inputFilePath)));
            System.out.println("----------- FILE CONTENT AS SEEN BY JAVA -----------");
            System.out.println("Reading from file: " + Paths.get(inputFilePath).toAbsolutePath()); // 打印绝对路径，防止混淆
            System.out.println(content);
            System.out.println("----------------------------------------------------");
            // ==================================================================================


            CharStream stream = CharStreams.fromString(content);
            VerilogLexer lexer = new VerilogLexer(stream);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            
            // 注意：下面的 tokenStream.fill() 不是必需的，因为Parser会自动消费token。
            // 除非你在parser运行前就要操作所有token，否则可以注释掉。
            // tokenStream.fill(); 
            List<Token> allTokens = tokenStream.getTokens();

            VerilogParser parser = new VerilogParser(tokenStream);

            // ==================================================================================
            // 改进 2：应用我们的自定义错误监听器
            // ==================================================================================
            parser.removeErrorListeners(); // 移除默认的控制台输出监听器
            parser.addErrorListener(ThrowingErrorListener.INSTANCE); // 添加我们自己的、会抛出异常的监听器

            ParseTree tree = parser.source_text(); // 现在，如果解析出错，这一行会直接抛出异常

            // 如果程序能运行到这里，说明解析完全成功，没有任何语法错误
            System.out.println("Parsing completed successfully. Generating AST...");

            AstBuilder astBuilder = new AstBuilder(allTokens);
            AstNode rootNode = astBuilder.visit(tree);

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String jsonOutput = gson.toJson(rootNode);

            try (FileWriter writer = new FileWriter(outputFilePath)) {
                writer.write(jsonOutput);
            }

            System.out.println("AST successfully generated at: " + outputFilePath);

        } catch (IOException e) {
            // 处理文件读写错误
            System.err.println("Error reading or writing file: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        } catch (ParseCancellationException e) {
            // ==================================================================================
            // 改进 3：捕获我们的自定义解析异常
            // ==================================================================================
            System.err.println("Parsing failed!");
            System.err.println("Error: " + e.getMessage()); // 打印我们格式化过的、清晰的错误信息
            System.exit(1);
        }
    }
}
