package verilogparser;

import java.util.List;
import java.util.ArrayList;

/**
 * 表示抽象语法树（AST）的通用节点。
 * 这个结构被设计为可以100%还原原始代码，因为它包含了所有语法元素（通过递归的children）
 * 和非语法元素（通过leading/trailing comments）。
 */
public class AstNode {
    /**
     * 节点的类型，通常是ANTLR规则的名称（如 "module_declaration"）或Token的名称（如 "IDENTIFIER"）。
     */
    private String name;

    /**
     * 节点的值。对于TerminalNode（叶子节点），这是它在代码中的文本。对于RuleNode（非叶子节点），通常为null。
     */
    private String value;

    /**
     * 该节点的子节点列表，构成了树的结构。
     */
    private List<AstNode> children;

    /**
     * 在该节点对应的代码文本之前出现的注释列表。
     */
    private List<CommentInfo> leadingComments;

    /**
     * 在该节点对应的代码文本之后、且在同一行出现的注释列表。
     */
    private List<CommentInfo> trailingComments;

    /**
     * 该节点在原始代码中的起始位置（行号和列号）。
     */
    private Position start;

    /**
     * 该节点在原始代码中的结束位置（行号和列号）。
     */
    private Position end;

    /**
     * 构造函数
     * @param name 节点的名称/类型。
     */
    public AstNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
        this.leadingComments = new ArrayList<>();
        this.trailingComments = new ArrayList<>();
    }

    // --- Getters and Setters ---

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public List<AstNode> getChildren() {
        return children;
    }

    public void setChildren(List<AstNode> children) {
        this.children = children;
    }

    public List<CommentInfo> getLeadingComments() {
        return leadingComments;
    }

    public void setLeadingComments(List<CommentInfo> leadingComments) {
        this.leadingComments = leadingComments;
    }

    public List<CommentInfo> getTrailingComments() {
        return trailingComments;
    }

    public void setTrailingComments(List<CommentInfo> trailingComments) {
        this.trailingComments = trailingComments;
    }

    public Position getStart() {
        return start;
    }

    public void setStart(Position start) {
        this.start = start;
    }

    public Position getEnd() {
        return end;
    }

    public void setEnd(Position end) {
        this.end = end;
    }

    // --- 内部静态类 ---

    /**
     * 存储单个注释的信息。
     */
    public static class CommentInfo {
        public String text;
        public String type; // 例如 "comment", "line_comment", "block_comment"
        public int originalTokenIndex; // 注释在原始Token流中的索引，用于调试

        public CommentInfo(String text, String type, int originalTokenIndex) {
            this.text = text;
            this.type = type;
            this.originalTokenIndex = originalTokenIndex;
        }

        // --- Getters and Setters for CommentInfo ---
        public String getText() { return text; }
        public void setText(String text) { this.text = text; }
        public String getType() { return type; }
        public void setType(String type) { this.type = type; }
        public int getOriginalTokenIndex() { return originalTokenIndex; }
        public void setOriginalTokenIndex(int originalTokenIndex) { this.originalTokenIndex = originalTokenIndex; }
    }

    /**
     * 存储在代码中的位置信息（行和列）。
     */
    public static class Position {
        public int line;
        public int column;

        public Position(int line, int column) {
            this.line = line;
            this.column = column;
        }
        
        // --- Getters and Setters for Position ---
        public int getLine() { return line; }
        public void setLine(int line) { this.line = line; }
        public int getColumn() { return column; }
        public void setColumn(int column) { this.column = column; }
    }
}
