// Generated from verilogparser/VerilogParser.g4 by ANTLR 4.13.1
package verilog;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class VerilogParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALWAYS=1, AND=2, ASSIGN=3, AUTOMATIC=4, BUF=5, BUFIF0=6, BUFIF1=7, BEGIN=8, 
		CASE=9, CASEX=10, CASEZ=11, CELL=12, CMOS=13, DEASSIGN=14, DEFAULT=15, 
		DEFPARAM=16, DISABLE=17, EDGE=18, ELSE=19, END=20, ENDCASE=21, ENDGENERATE=22, 
		ENDMODULE=23, ENDFUNCTION=24, ENDPRIMITIVE=25, ENDSPECIFY=26, ENDTABLE=27, 
		ENDTASK=28, EVENT=29, FOR=30, FORCE=31, FOREVER=32, FORK=33, FUNCTION=34, 
		GENERATE=35, GENVAR=36, HIGHZ0=37, HIGHZ1=38, IF=39, INITIAL=40, INOUT=41, 
		INPUT=42, INTEGER=43, IFNONE=44, JOIN=45, LARGE=46, LOCALPARAM=47, MACROMODULE=48, 
		MEDIUM=49, MODULE=50, NAND=51, NEGEDGE=52, NMOS=53, NOR=54, NOT=55, NOTIF0=56, 
		NOTIF1=57, OR=58, OUTPUT=59, PARAMETER=60, PMOS=61, POSEDGE=62, PRIMITIVE=63, 
		PULL0=64, PULL1=65, PULLUP=66, PULLDOWN=67, RCMOS=68, REAL=69, REALTIME=70, 
		REG=71, RELEASE=72, REPEAT=73, RNMOS=74, RPMOS=75, RTRAN=76, RTRANIF0=77, 
		RTRANIF1=78, SCALARED=79, SIGNED=80, SMALL=81, SPECIFY=82, SPECPARAM=83, 
		STATIC=84, STRONG0=85, STRONG1=86, SUPPLY0=87, SUPPLY1=88, TABLE=89, TASK=90, 
		TIME=91, TRAN=92, TRANIF0=93, TRANIF1=94, TRI=95, TRI0=96, TRI1=97, TRIAND=98, 
		TRIOR=99, TRIREG=100, UNSIGNED=101, UWIRE=102, VECTORED=103, WAIT=104, 
		WAND=105, WEAK0=106, WEAK1=107, WHILE=108, WIRE=109, WOR=110, XNOR=111, 
		XOR=112, CONFIG=113, ENDCONFIG=114, DESIGN=115, INSTANCE=116, LIBLIST=117, 
		USE=118, INT=119, SHORTINT=120, LONGINT=121, BYTE=122, BIT=123, LOGIC=124, 
		TICK_TIMESCALE=125, TICK_DEFINE=126, TICK_INCLUDE=127, TICK_IFDEF=128, 
		TICK_IFNDEF=129, TICK_ELSE=130, TICK_ELSIF=131, TICK_ENDIF=132, TICK_UNCONNECTED_DRIVE=133, 
		TICK_RESETALL=134, TICK_CELLDEFINE=135, TICK_ENDCELLDEFINE=136, AND3=137, 
		LOG_AND=138, LOG_OR=139, CASE_EQ=140, CASE_NEQ=141, LOG_EQ=142, LOG_NEQ=143, 
		SHRA=144, SHLA=145, LEFT_SHIFT=146, RIGHT_SHIFT=147, LE_OP=148, GREATER_EQ=149, 
		TILDE_CARET=150, CARET_TILDE=151, REDUCE_NOR=152, REDUCE_NAND=153, IMPLIES=154, 
		STAR_GT=155, PLUS_COLON=156, MINUS_COLON=157, ARROW=158, ARROW_ARROW=159, 
		WS=160, BLOCK_COMMENT=161, LINE_COMMENT=162, PLUS=163, MINUS=164, STAR=165, 
		DIV=166, MOD=167, LOG_NOT=168, BIT_AND=169, BIT_OR=170, BIT_NOT=171, BIT_XOR=172, 
		LESS=173, GREATER=174, ASSIGN_EQ=175, AT=176, HASH=177, DOLLAR=178, QUESTION=179, 
		COLON=180, SEMI=181, COMMA=182, DOT=183, LPAREN=184, RPAREN=185, LBRACK=186, 
		RBRACK=187, LBRACE=188, RBRACE=189, IDENTIFIER=190, STRING_LITERAL=191, 
		TIME_LITERAL=192, NUMBER=193, STRING=194, UDP_EDGE_SYMBOL=195, DOLLAR_SETUP=196, 
		DOLLAR_HOLD=197, DOLLAR_WIDTH=198, DOLLAR_RECOVERY=199, DOLLAR_SKEW=200, 
		DOLLAR_TIMESKEW=201, DOLLAR_FULLSKEW=202, DOLLAR_PERIOD=203, DOLLAR_NOCHANGE=204, 
		PULSE=205, FULLSKEW=206, D_WS=207, MACRO_IDENTIFIER=208, D_NL=209, DB_WS=210, 
		MACRO_BODY=211, DB_NL=212, TIMESCALE_VALUE=213, TS_WS=214;
	public static final int
		RULE_source_text = 0, RULE_module_declaration = 1, RULE_parameter_port_list = 2, 
		RULE_param_assignment = 3, RULE_port_list = 4, RULE_port_declaration = 5, 
		RULE_input_declaration = 6, RULE_output_declaration = 7, RULE_inout_declaration = 8, 
		RULE_module_item = 9, RULE_signals_declaration = 10, RULE_parameter_declaration = 11, 
		RULE_localparam_declaration = 12, RULE_reg_declaration = 13, RULE_wire_declaration = 14, 
		RULE_integer_declaration = 15, RULE_real_declaration = 16, RULE_time_declaration = 17, 
		RULE_list_of_identifiers = 18, RULE_continuous_assign = 19, RULE_always_construct = 20, 
		RULE_initial_construct = 21, RULE_statement = 22, RULE_statement_or_null = 23, 
		RULE_assignment = 24, RULE_variable_assignment = 25, RULE_variable_lvalue = 26, 
		RULE_hierarchical_identifier = 27, RULE_constant_expression = 28, RULE_delay = 29, 
		RULE_mintypmax_expression = 30, RULE_case_item = 31, RULE_timing_control_statement = 32, 
		RULE_event_control = 33, RULE_delay_control = 34, RULE_event_expression = 35, 
		RULE_event_trigger = 36, RULE_posedge_expression = 37, RULE_negedge_expression = 38, 
		RULE_task_enable_statement = 39, RULE_list_of_arguments = 40, RULE_expression = 41, 
		RULE_primary = 42, RULE_concatenation = 43, RULE_gate_instantiation = 44, 
		RULE_gate_instance = 45, RULE_name_of_instance = 46, RULE_terminal = 47, 
		RULE_identifier_expression = 48, RULE_cmos_switchtype = 49, RULE_enable_gatetype = 50, 
		RULE_mos_switchtype = 51, RULE_n_input_gatetype = 52, RULE_task_declaration = 53, 
		RULE_task_tf_declaration = 54, RULE_function_declaration = 55, RULE_function_local_declaration = 56, 
		RULE_generate_block = 57, RULE_generate_item = 58, RULE_generate_conditional = 59, 
		RULE_generate_loop = 60, RULE_genvar_declaration = 61, RULE_genvar_assignment = 62, 
		RULE_module_instantiation = 63, RULE_parameter_value_assignment = 64, 
		RULE_list_of_param_assignments = 65, RULE_named_parameter_assignment = 66, 
		RULE_module_instance = 67, RULE_list_of_port_connections = 68, RULE_named_port_connection = 69, 
		RULE_range_expression = 70, RULE_delay_or_event_control = 71, RULE_delay_value = 72, 
		RULE_unary_operator = 73, RULE_binary_operator = 74, RULE_function_call = 75, 
		RULE_number = 76, RULE_compiler_directive = 77, RULE_define_directive = 78, 
		RULE_include_directive = 79, RULE_timescale_directive = 80, RULE_ifdef_directive = 81;
	private static String[] makeRuleNames() {
		return new String[] {
			"source_text", "module_declaration", "parameter_port_list", "param_assignment", 
			"port_list", "port_declaration", "input_declaration", "output_declaration", 
			"inout_declaration", "module_item", "signals_declaration", "parameter_declaration", 
			"localparam_declaration", "reg_declaration", "wire_declaration", "integer_declaration", 
			"real_declaration", "time_declaration", "list_of_identifiers", "continuous_assign", 
			"always_construct", "initial_construct", "statement", "statement_or_null", 
			"assignment", "variable_assignment", "variable_lvalue", "hierarchical_identifier", 
			"constant_expression", "delay", "mintypmax_expression", "case_item", 
			"timing_control_statement", "event_control", "delay_control", "event_expression", 
			"event_trigger", "posedge_expression", "negedge_expression", "task_enable_statement", 
			"list_of_arguments", "expression", "primary", "concatenation", "gate_instantiation", 
			"gate_instance", "name_of_instance", "terminal", "identifier_expression", 
			"cmos_switchtype", "enable_gatetype", "mos_switchtype", "n_input_gatetype", 
			"task_declaration", "task_tf_declaration", "function_declaration", "function_local_declaration", 
			"generate_block", "generate_item", "generate_conditional", "generate_loop", 
			"genvar_declaration", "genvar_assignment", "module_instantiation", "parameter_value_assignment", 
			"list_of_param_assignments", "named_parameter_assignment", "module_instance", 
			"list_of_port_connections", "named_port_connection", "range_expression", 
			"delay_or_event_control", "delay_value", "unary_operator", "binary_operator", 
			"function_call", "number", "compiler_directive", "define_directive", 
			"include_directive", "timescale_directive", "ifdef_directive"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'always'", "'and'", "'assign'", "'automatic'", "'buf'", "'bufif0'", 
			"'bufif1'", "'begin'", "'case'", "'casex'", "'casez'", "'cell'", "'cmos'", 
			"'deassign'", "'default'", "'defparam'", "'disable'", "'edge'", "'else'", 
			"'end'", "'endcase'", "'endgenerate'", "'endmodule'", "'endfunction'", 
			"'endprimitive'", "'endspecify'", "'endtable'", "'endtask'", "'event'", 
			"'for'", "'force'", "'forever'", "'fork'", "'function'", "'generate'", 
			"'genvar'", "'highz0'", "'highz1'", "'if'", "'initial'", "'inout'", "'input'", 
			"'integer'", "'ifnone'", "'join'", "'large'", "'localparam'", "'macromodule'", 
			"'medium'", "'module'", "'nand'", "'negedge'", "'nmos'", "'nor'", "'not'", 
			"'notif0'", "'notif1'", "'or'", "'output'", "'parameter'", "'pmos'", 
			"'posedge'", "'primitive'", "'pull0'", "'pull1'", "'pullup'", "'pulldown'", 
			"'rcmos'", "'real'", "'realtime'", "'reg'", "'release'", "'repeat'", 
			"'rnmos'", "'rpmos'", "'rtran'", "'rtranif0'", "'rtranif1'", "'scalared'", 
			"'signed'", "'small'", "'specify'", "'specparam'", "'static'", "'strong0'", 
			"'strong1'", "'supply0'", "'supply1'", "'table'", "'task'", "'time'", 
			"'tran'", "'tranif0'", "'tranif1'", "'tri'", "'tri0'", "'tri1'", "'triand'", 
			"'trior'", "'trireg'", "'unsigned'", "'uwire'", "'vectored'", "'wait'", 
			"'wand'", "'weak0'", "'weak1'", "'while'", "'wire'", "'wor'", "'xnor'", 
			"'xor'", "'config'", "'endconfig'", "'design'", "'instance'", "'liblist'", 
			"'use'", "'int'", "'shortint'", "'longint'", "'byte'", "'bit'", "'logic'", 
			"'`timescale'", "'`define'", "'`include'", "'`ifdef'", "'`ifndef'", "'`else'", 
			"'`elsif'", "'`endif'", "'`unconnected_drive'", "'`resetall'", "'`celldefine'", 
			"'`endcelldefine'", "'&&&'", "'&&'", "'||'", "'==='", "'!=='", "'=='", 
			"'!='", "'>>>'", "'<<<'", "'<<'", "'>>'", "'<='", "'>='", "'~^'", "'^~'", 
			"'~|'", "'~&'", "'=>'", "'*>'", "'+:'", "'-:'", "'->'", "'->>'", null, 
			null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'&'", "'|'", "'~'", 
			"'^'", "'<'", "'>'", "'='", "'@'", "'#'", "'$'", "'?'", "':'", "';'", 
			"','", "'.'", "'('", "')'", "'['", "']'", "'{'", "'}'", null, null, null, 
			null, null, null, "'$setup'", "'$hold'", "'$width'", "'$recovery'", "'$skew'", 
			"'$timeskew'", "'$fullskew'", "'$period'", "'$nochange'", "'pulse'", 
			"'fullskew'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALWAYS", "AND", "ASSIGN", "AUTOMATIC", "BUF", "BUFIF0", "BUFIF1", 
			"BEGIN", "CASE", "CASEX", "CASEZ", "CELL", "CMOS", "DEASSIGN", "DEFAULT", 
			"DEFPARAM", "DISABLE", "EDGE", "ELSE", "END", "ENDCASE", "ENDGENERATE", 
			"ENDMODULE", "ENDFUNCTION", "ENDPRIMITIVE", "ENDSPECIFY", "ENDTABLE", 
			"ENDTASK", "EVENT", "FOR", "FORCE", "FOREVER", "FORK", "FUNCTION", "GENERATE", 
			"GENVAR", "HIGHZ0", "HIGHZ1", "IF", "INITIAL", "INOUT", "INPUT", "INTEGER", 
			"IFNONE", "JOIN", "LARGE", "LOCALPARAM", "MACROMODULE", "MEDIUM", "MODULE", 
			"NAND", "NEGEDGE", "NMOS", "NOR", "NOT", "NOTIF0", "NOTIF1", "OR", "OUTPUT", 
			"PARAMETER", "PMOS", "POSEDGE", "PRIMITIVE", "PULL0", "PULL1", "PULLUP", 
			"PULLDOWN", "RCMOS", "REAL", "REALTIME", "REG", "RELEASE", "REPEAT", 
			"RNMOS", "RPMOS", "RTRAN", "RTRANIF0", "RTRANIF1", "SCALARED", "SIGNED", 
			"SMALL", "SPECIFY", "SPECPARAM", "STATIC", "STRONG0", "STRONG1", "SUPPLY0", 
			"SUPPLY1", "TABLE", "TASK", "TIME", "TRAN", "TRANIF0", "TRANIF1", "TRI", 
			"TRI0", "TRI1", "TRIAND", "TRIOR", "TRIREG", "UNSIGNED", "UWIRE", "VECTORED", 
			"WAIT", "WAND", "WEAK0", "WEAK1", "WHILE", "WIRE", "WOR", "XNOR", "XOR", 
			"CONFIG", "ENDCONFIG", "DESIGN", "INSTANCE", "LIBLIST", "USE", "INT", 
			"SHORTINT", "LONGINT", "BYTE", "BIT", "LOGIC", "TICK_TIMESCALE", "TICK_DEFINE", 
			"TICK_INCLUDE", "TICK_IFDEF", "TICK_IFNDEF", "TICK_ELSE", "TICK_ELSIF", 
			"TICK_ENDIF", "TICK_UNCONNECTED_DRIVE", "TICK_RESETALL", "TICK_CELLDEFINE", 
			"TICK_ENDCELLDEFINE", "AND3", "LOG_AND", "LOG_OR", "CASE_EQ", "CASE_NEQ", 
			"LOG_EQ", "LOG_NEQ", "SHRA", "SHLA", "LEFT_SHIFT", "RIGHT_SHIFT", "LE_OP", 
			"GREATER_EQ", "TILDE_CARET", "CARET_TILDE", "REDUCE_NOR", "REDUCE_NAND", 
			"IMPLIES", "STAR_GT", "PLUS_COLON", "MINUS_COLON", "ARROW", "ARROW_ARROW", 
			"WS", "BLOCK_COMMENT", "LINE_COMMENT", "PLUS", "MINUS", "STAR", "DIV", 
			"MOD", "LOG_NOT", "BIT_AND", "BIT_OR", "BIT_NOT", "BIT_XOR", "LESS", 
			"GREATER", "ASSIGN_EQ", "AT", "HASH", "DOLLAR", "QUESTION", "COLON", 
			"SEMI", "COMMA", "DOT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "LBRACE", 
			"RBRACE", "IDENTIFIER", "STRING_LITERAL", "TIME_LITERAL", "NUMBER", "STRING", 
			"UDP_EDGE_SYMBOL", "DOLLAR_SETUP", "DOLLAR_HOLD", "DOLLAR_WIDTH", "DOLLAR_RECOVERY", 
			"DOLLAR_SKEW", "DOLLAR_TIMESKEW", "DOLLAR_FULLSKEW", "DOLLAR_PERIOD", 
			"DOLLAR_NOCHANGE", "PULSE", "FULLSKEW", "D_WS", "MACRO_IDENTIFIER", "D_NL", 
			"DB_WS", "MACRO_BODY", "DB_NL", "TIMESCALE_VALUE", "TS_WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "VerilogParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VerilogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Source_textContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(VerilogParser.EOF, 0); }
		public List<Module_declarationContext> module_declaration() {
			return getRuleContexts(Module_declarationContext.class);
		}
		public Module_declarationContext module_declaration(int i) {
			return getRuleContext(Module_declarationContext.class,i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public Source_textContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_text; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterSource_text(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitSource_text(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitSource_text(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_textContext source_text() throws RecognitionException {
		Source_textContext _localctx = new Source_textContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_source_text);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODULE || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 31L) != 0)) {
				{
				setState(166);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULE:
					{
					setState(164);
					module_declaration();
					}
					break;
				case TICK_TIMESCALE:
				case TICK_DEFINE:
				case TICK_INCLUDE:
				case TICK_IFDEF:
				case TICK_IFNDEF:
					{
					setState(165);
					compiler_directive();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_declarationContext extends ParserRuleContext {
		public TerminalNode MODULE() { return getToken(VerilogParser.MODULE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(VerilogParser.SEMI, 0); }
		public TerminalNode ENDMODULE() { return getToken(VerilogParser.ENDMODULE, 0); }
		public Parameter_port_listContext parameter_port_list() {
			return getRuleContext(Parameter_port_listContext.class,0);
		}
		public Port_listContext port_list() {
			return getRuleContext(Port_listContext.class,0);
		}
		public List<Module_itemContext> module_item() {
			return getRuleContexts(Module_itemContext.class);
		}
		public Module_itemContext module_item(int i) {
			return getRuleContext(Module_itemContext.class,i);
		}
		public Module_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterModule_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitModule_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitModule_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_declarationContext module_declaration() throws RecognitionException {
		Module_declarationContext _localctx = new Module_declarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(MODULE);
			setState(174);
			match(IDENTIFIER);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(175);
				parameter_port_list();
				}
			}

			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(178);
				port_list();
				}
			}

			setState(181);
			match(SEMI);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3992591754296565966L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 4467599417666437323L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(182);
				module_item();
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(ENDMODULE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_port_listContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(VerilogParser.HASH, 0); }
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public List<Param_assignmentContext> param_assignment() {
			return getRuleContexts(Param_assignmentContext.class);
		}
		public Param_assignmentContext param_assignment(int i) {
			return getRuleContext(Param_assignmentContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public Parameter_port_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_port_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterParameter_port_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitParameter_port_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitParameter_port_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_port_listContext parameter_port_list() throws RecognitionException {
		Parameter_port_listContext _localctx = new Parameter_port_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_parameter_port_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(HASH);
			setState(191);
			match(LPAREN);
			setState(192);
			param_assignment();
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(193);
				match(COMMA);
				setState(194);
				param_assignment();
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(200);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Param_assignmentContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(VerilogParser.PARAMETER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN_EQ() { return getToken(VerilogParser.ASSIGN_EQ, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode SIGNED() { return getToken(VerilogParser.SIGNED, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public Param_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterParam_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitParam_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitParam_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_assignmentContext param_assignment() throws RecognitionException {
		Param_assignmentContext _localctx = new Param_assignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(PARAMETER);
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNED) {
				{
				setState(203);
				match(SIGNED);
				}
			}

			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(206);
				range_expression();
				}
			}

			setState(209);
			match(IDENTIFIER);
			setState(210);
			match(ASSIGN_EQ);
			setState(211);
			constant_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Port_listContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public List<Port_declarationContext> port_declaration() {
			return getRuleContexts(Port_declarationContext.class);
		}
		public Port_declarationContext port_declaration(int i) {
			return getRuleContext(Port_declarationContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public Port_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterPort_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitPort_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitPort_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_listContext port_list() throws RecognitionException {
		Port_listContext _localctx = new Port_listContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_port_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(LPAREN);
			setState(214);
			port_declaration();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(215);
				match(COMMA);
				setState(216);
				port_declaration();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Port_declarationContext extends ParserRuleContext {
		public Input_declarationContext input_declaration() {
			return getRuleContext(Input_declarationContext.class,0);
		}
		public Output_declarationContext output_declaration() {
			return getRuleContext(Output_declarationContext.class,0);
		}
		public Inout_declarationContext inout_declaration() {
			return getRuleContext(Inout_declarationContext.class,0);
		}
		public Port_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterPort_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitPort_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitPort_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Port_declarationContext port_declaration() throws RecognitionException {
		Port_declarationContext _localctx = new Port_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_port_declaration);
		try {
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				input_declaration();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 2);
				{
				setState(225);
				output_declaration();
				}
				break;
			case INOUT:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				inout_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Input_declarationContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(VerilogParser.INPUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode WIRE() { return getToken(VerilogParser.WIRE, 0); }
		public TerminalNode SIGNED() { return getToken(VerilogParser.SIGNED, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public Input_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterInput_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitInput_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitInput_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Input_declarationContext input_declaration() throws RecognitionException {
		Input_declarationContext _localctx = new Input_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_input_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(INPUT);
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WIRE) {
				{
				setState(230);
				match(WIRE);
				}
			}

			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNED) {
				{
				setState(233);
				match(SIGNED);
				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(236);
				range_expression();
				}
			}

			setState(239);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Output_declarationContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(VerilogParser.OUTPUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode SIGNED() { return getToken(VerilogParser.SIGNED, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public TerminalNode WIRE() { return getToken(VerilogParser.WIRE, 0); }
		public TerminalNode REG() { return getToken(VerilogParser.REG, 0); }
		public Output_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterOutput_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitOutput_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitOutput_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_declarationContext output_declaration() throws RecognitionException {
		Output_declarationContext _localctx = new Output_declarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_output_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(OUTPUT);
			setState(243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REG || _la==WIRE) {
				{
				setState(242);
				_la = _input.LA(1);
				if ( !(_la==REG || _la==WIRE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNED) {
				{
				setState(245);
				match(SIGNED);
				}
			}

			setState(249);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(248);
				range_expression();
				}
			}

			setState(251);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Inout_declarationContext extends ParserRuleContext {
		public TerminalNode INOUT() { return getToken(VerilogParser.INOUT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode WIRE() { return getToken(VerilogParser.WIRE, 0); }
		public TerminalNode SIGNED() { return getToken(VerilogParser.SIGNED, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public Inout_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inout_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterInout_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitInout_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitInout_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Inout_declarationContext inout_declaration() throws RecognitionException {
		Inout_declarationContext _localctx = new Inout_declarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_inout_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(INOUT);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WIRE) {
				{
				setState(254);
				match(WIRE);
				}
			}

			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNED) {
				{
				setState(257);
				match(SIGNED);
				}
			}

			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(260);
				range_expression();
				}
			}

			setState(263);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_itemContext extends ParserRuleContext {
		public Signals_declarationContext signals_declaration() {
			return getRuleContext(Signals_declarationContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VerilogParser.SEMI, 0); }
		public Gate_instantiationContext gate_instantiation() {
			return getRuleContext(Gate_instantiationContext.class,0);
		}
		public Continuous_assignContext continuous_assign() {
			return getRuleContext(Continuous_assignContext.class,0);
		}
		public Always_constructContext always_construct() {
			return getRuleContext(Always_constructContext.class,0);
		}
		public Initial_constructContext initial_construct() {
			return getRuleContext(Initial_constructContext.class,0);
		}
		public Task_declarationContext task_declaration() {
			return getRuleContext(Task_declarationContext.class,0);
		}
		public Function_declarationContext function_declaration() {
			return getRuleContext(Function_declarationContext.class,0);
		}
		public Generate_blockContext generate_block() {
			return getRuleContext(Generate_blockContext.class,0);
		}
		public Module_instantiationContext module_instantiation() {
			return getRuleContext(Module_instantiationContext.class,0);
		}
		public Compiler_directiveContext compiler_directive() {
			return getRuleContext(Compiler_directiveContext.class,0);
		}
		public Module_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterModule_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitModule_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitModule_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_itemContext module_item() throws RecognitionException {
		Module_itemContext _localctx = new Module_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_module_item);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case LOCALPARAM:
			case PARAMETER:
			case REAL:
			case REG:
			case TIME:
			case WIRE:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				signals_declaration();
				setState(266);
				match(SEMI);
				}
				break;
			case AND:
			case BUFIF0:
			case BUFIF1:
			case CMOS:
			case NAND:
			case NMOS:
			case NOR:
			case NOTIF0:
			case NOTIF1:
			case OR:
			case PMOS:
			case RCMOS:
			case RNMOS:
			case RPMOS:
			case XNOR:
			case XOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(268);
				gate_instantiation();
				}
				break;
			case ASSIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				continuous_assign();
				setState(270);
				match(SEMI);
				}
				break;
			case ALWAYS:
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				always_construct();
				}
				break;
			case INITIAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				initial_construct();
				}
				break;
			case TASK:
				enterOuterAlt(_localctx, 6);
				{
				setState(274);
				task_declaration();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 7);
				{
				setState(275);
				function_declaration();
				}
				break;
			case GENERATE:
				enterOuterAlt(_localctx, 8);
				{
				setState(276);
				generate_block();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 9);
				{
				setState(277);
				module_instantiation();
				}
				break;
			case TICK_TIMESCALE:
			case TICK_DEFINE:
			case TICK_INCLUDE:
			case TICK_IFDEF:
			case TICK_IFNDEF:
				enterOuterAlt(_localctx, 10);
				{
				setState(278);
				compiler_directive();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Signals_declarationContext extends ParserRuleContext {
		public Parameter_declarationContext parameter_declaration() {
			return getRuleContext(Parameter_declarationContext.class,0);
		}
		public Localparam_declarationContext localparam_declaration() {
			return getRuleContext(Localparam_declarationContext.class,0);
		}
		public Reg_declarationContext reg_declaration() {
			return getRuleContext(Reg_declarationContext.class,0);
		}
		public Wire_declarationContext wire_declaration() {
			return getRuleContext(Wire_declarationContext.class,0);
		}
		public Integer_declarationContext integer_declaration() {
			return getRuleContext(Integer_declarationContext.class,0);
		}
		public Real_declarationContext real_declaration() {
			return getRuleContext(Real_declarationContext.class,0);
		}
		public Time_declarationContext time_declaration() {
			return getRuleContext(Time_declarationContext.class,0);
		}
		public Signals_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signals_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterSignals_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitSignals_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitSignals_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signals_declarationContext signals_declaration() throws RecognitionException {
		Signals_declarationContext _localctx = new Signals_declarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_signals_declaration);
		try {
			setState(288);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARAMETER:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				parameter_declaration();
				}
				break;
			case LOCALPARAM:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				localparam_declaration();
				}
				break;
			case REG:
				enterOuterAlt(_localctx, 3);
				{
				setState(283);
				reg_declaration();
				}
				break;
			case WIRE:
				enterOuterAlt(_localctx, 4);
				{
				setState(284);
				wire_declaration();
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(285);
				integer_declaration();
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 6);
				{
				setState(286);
				real_declaration();
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 7);
				{
				setState(287);
				time_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_declarationContext extends ParserRuleContext {
		public TerminalNode PARAMETER() { return getToken(VerilogParser.PARAMETER, 0); }
		public List_of_identifiersContext list_of_identifiers() {
			return getRuleContext(List_of_identifiersContext.class,0);
		}
		public TerminalNode ASSIGN_EQ() { return getToken(VerilogParser.ASSIGN_EQ, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode SIGNED() { return getToken(VerilogParser.SIGNED, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public Parameter_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterParameter_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitParameter_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitParameter_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_declarationContext parameter_declaration() throws RecognitionException {
		Parameter_declarationContext _localctx = new Parameter_declarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_parameter_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(PARAMETER);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNED) {
				{
				setState(291);
				match(SIGNED);
				}
			}

			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(294);
				range_expression();
				}
			}

			setState(297);
			list_of_identifiers();
			setState(298);
			match(ASSIGN_EQ);
			setState(299);
			constant_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Localparam_declarationContext extends ParserRuleContext {
		public TerminalNode LOCALPARAM() { return getToken(VerilogParser.LOCALPARAM, 0); }
		public List_of_identifiersContext list_of_identifiers() {
			return getRuleContext(List_of_identifiersContext.class,0);
		}
		public TerminalNode ASSIGN_EQ() { return getToken(VerilogParser.ASSIGN_EQ, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode SIGNED() { return getToken(VerilogParser.SIGNED, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public Localparam_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localparam_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterLocalparam_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitLocalparam_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitLocalparam_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Localparam_declarationContext localparam_declaration() throws RecognitionException {
		Localparam_declarationContext _localctx = new Localparam_declarationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_localparam_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(LOCALPARAM);
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNED) {
				{
				setState(302);
				match(SIGNED);
				}
			}

			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(305);
				range_expression();
				}
			}

			setState(308);
			list_of_identifiers();
			setState(309);
			match(ASSIGN_EQ);
			setState(310);
			constant_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Reg_declarationContext extends ParserRuleContext {
		public TerminalNode REG() { return getToken(VerilogParser.REG, 0); }
		public List_of_identifiersContext list_of_identifiers() {
			return getRuleContext(List_of_identifiersContext.class,0);
		}
		public TerminalNode SIGNED() { return getToken(VerilogParser.SIGNED, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public Reg_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reg_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterReg_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitReg_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitReg_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reg_declarationContext reg_declaration() throws RecognitionException {
		Reg_declarationContext _localctx = new Reg_declarationContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_reg_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(REG);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNED) {
				{
				setState(313);
				match(SIGNED);
				}
			}

			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(316);
				range_expression();
				}
			}

			setState(319);
			list_of_identifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Wire_declarationContext extends ParserRuleContext {
		public TerminalNode WIRE() { return getToken(VerilogParser.WIRE, 0); }
		public List_of_identifiersContext list_of_identifiers() {
			return getRuleContext(List_of_identifiersContext.class,0);
		}
		public TerminalNode SIGNED() { return getToken(VerilogParser.SIGNED, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public Wire_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wire_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterWire_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitWire_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitWire_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Wire_declarationContext wire_declaration() throws RecognitionException {
		Wire_declarationContext _localctx = new Wire_declarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_wire_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(WIRE);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNED) {
				{
				setState(322);
				match(SIGNED);
				}
			}

			setState(326);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(325);
				range_expression();
				}
			}

			setState(328);
			list_of_identifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Integer_declarationContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(VerilogParser.INTEGER, 0); }
		public List_of_identifiersContext list_of_identifiers() {
			return getRuleContext(List_of_identifiersContext.class,0);
		}
		public Integer_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integer_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterInteger_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitInteger_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitInteger_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Integer_declarationContext integer_declaration() throws RecognitionException {
		Integer_declarationContext _localctx = new Integer_declarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_integer_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(INTEGER);
			setState(331);
			list_of_identifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Real_declarationContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(VerilogParser.REAL, 0); }
		public List_of_identifiersContext list_of_identifiers() {
			return getRuleContext(List_of_identifiersContext.class,0);
		}
		public Real_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_real_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterReal_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitReal_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitReal_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Real_declarationContext real_declaration() throws RecognitionException {
		Real_declarationContext _localctx = new Real_declarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_real_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			match(REAL);
			setState(334);
			list_of_identifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Time_declarationContext extends ParserRuleContext {
		public TerminalNode TIME() { return getToken(VerilogParser.TIME, 0); }
		public List_of_identifiersContext list_of_identifiers() {
			return getRuleContext(List_of_identifiersContext.class,0);
		}
		public Time_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterTime_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitTime_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitTime_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_declarationContext time_declaration() throws RecognitionException {
		Time_declarationContext _localctx = new Time_declarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_time_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(TIME);
			setState(337);
			list_of_identifiers();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_of_identifiersContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(VerilogParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(VerilogParser.IDENTIFIER, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public List_of_identifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_identifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterList_of_identifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitList_of_identifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitList_of_identifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_identifiersContext list_of_identifiers() throws RecognitionException {
		List_of_identifiersContext _localctx = new List_of_identifiersContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_list_of_identifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(IDENTIFIER);
			setState(344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(340);
				match(COMMA);
				setState(341);
				match(IDENTIFIER);
				}
				}
				setState(346);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Continuous_assignContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(VerilogParser.ASSIGN, 0); }
		public Variable_lvalueContext variable_lvalue() {
			return getRuleContext(Variable_lvalueContext.class,0);
		}
		public TerminalNode ASSIGN_EQ() { return getToken(VerilogParser.ASSIGN_EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Continuous_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continuous_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterContinuous_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitContinuous_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitContinuous_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continuous_assignContext continuous_assign() throws RecognitionException {
		Continuous_assignContext _localctx = new Continuous_assignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_continuous_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			match(ASSIGN);
			setState(348);
			variable_lvalue();
			setState(349);
			match(ASSIGN_EQ);
			setState(350);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Always_constructContext extends ParserRuleContext {
		public TerminalNode ALWAYS() { return getToken(VerilogParser.ALWAYS, 0); }
		public Statement_or_nullContext statement_or_null() {
			return getRuleContext(Statement_or_nullContext.class,0);
		}
		public Event_controlContext event_control() {
			return getRuleContext(Event_controlContext.class,0);
		}
		public Always_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_always_construct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterAlways_construct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitAlways_construct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitAlways_construct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Always_constructContext always_construct() throws RecognitionException {
		Always_constructContext _localctx = new Always_constructContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_always_construct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(ALWAYS);
			setState(354);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(353);
				event_control();
				}
				break;
			}
			setState(356);
			statement_or_null();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Initial_constructContext extends ParserRuleContext {
		public TerminalNode INITIAL() { return getToken(VerilogParser.INITIAL, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Initial_constructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initial_construct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterInitial_construct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitInitial_construct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitInitial_construct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Initial_constructContext initial_construct() throws RecognitionException {
		Initial_constructContext _localctx = new Initial_constructContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_initial_construct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(INITIAL);
			setState(359);
			statement();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(VerilogParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(VerilogParser.END, 0); }
		public List<TerminalNode> COLON() { return getTokens(VerilogParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(VerilogParser.COLON, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(VerilogParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(VerilogParser.IDENTIFIER, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public TerminalNode IF() { return getToken(VerilogParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public List<Statement_or_nullContext> statement_or_null() {
			return getRuleContexts(Statement_or_nullContext.class);
		}
		public Statement_or_nullContext statement_or_null(int i) {
			return getRuleContext(Statement_or_nullContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VerilogParser.ELSE, 0); }
		public TerminalNode ENDCASE() { return getToken(VerilogParser.ENDCASE, 0); }
		public TerminalNode CASE() { return getToken(VerilogParser.CASE, 0); }
		public TerminalNode CASEZ() { return getToken(VerilogParser.CASEZ, 0); }
		public TerminalNode CASEX() { return getToken(VerilogParser.CASEX, 0); }
		public List<Case_itemContext> case_item() {
			return getRuleContexts(Case_itemContext.class);
		}
		public Case_itemContext case_item(int i) {
			return getRuleContext(Case_itemContext.class,i);
		}
		public TerminalNode FOR() { return getToken(VerilogParser.FOR, 0); }
		public List<TerminalNode> SEMI() { return getTokens(VerilogParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VerilogParser.SEMI, i);
		}
		public List<Variable_assignmentContext> variable_assignment() {
			return getRuleContexts(Variable_assignmentContext.class);
		}
		public Variable_assignmentContext variable_assignment(int i) {
			return getRuleContext(Variable_assignmentContext.class,i);
		}
		public TerminalNode REPEAT() { return getToken(VerilogParser.REPEAT, 0); }
		public TerminalNode WHILE() { return getToken(VerilogParser.WHILE, 0); }
		public TerminalNode FOREVER() { return getToken(VerilogParser.FOREVER, 0); }
		public TerminalNode WAIT() { return getToken(VerilogParser.WAIT, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public Timing_control_statementContext timing_control_statement() {
			return getRuleContext(Timing_control_statementContext.class,0);
		}
		public Task_enable_statementContext task_enable_statement() {
			return getRuleContext(Task_enable_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statement);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(361);
				match(BEGIN);
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(362);
					match(COLON);
					setState(363);
					match(IDENTIFIER);
					}
				}

				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 555124526848L) != 0) || ((((_la - 73)) & ~0x3f) == 0 && ((1L << (_la - 73)) & 139611624955707393L) != 0) || ((((_la - 176)) & ~0x3f) == 0 && ((1L << (_la - 176)) & 20519L) != 0)) {
					{
					setState(368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						setState(366);
						statement();
						}
						break;
					case 2:
						{
						setState(367);
						compiler_directive();
						}
						break;
					}
					}
					setState(372);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(373);
				match(END);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(374);
					match(COLON);
					setState(375);
					match(IDENTIFIER);
					}
				}

				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(378);
				match(IF);
				setState(379);
				match(LPAREN);
				setState(380);
				expression(0);
				setState(381);
				match(RPAREN);
				setState(382);
				statement_or_null();
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(383);
					match(ELSE);
					setState(384);
					statement_or_null();
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(387);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(388);
				match(LPAREN);
				setState(389);
				expression(0);
				setState(390);
				match(RPAREN);
				setState(392); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(391);
					case_item();
					}
					}
					setState(394); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DEFAULT || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & 27779856621583L) != 0) );
				setState(396);
				match(ENDCASE);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(398);
				match(FOR);
				setState(399);
				match(LPAREN);
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE || _la==IDENTIFIER) {
					{
					setState(400);
					variable_assignment();
					}
				}

				setState(403);
				match(SEMI);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & 27779856621583L) != 0)) {
					{
					setState(404);
					expression(0);
					}
				}

				setState(407);
				match(SEMI);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACE || _la==IDENTIFIER) {
					{
					setState(408);
					variable_assignment();
					}
				}

				setState(411);
				match(RPAREN);
				setState(412);
				statement();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(413);
				match(REPEAT);
				setState(414);
				match(LPAREN);
				setState(415);
				expression(0);
				setState(416);
				match(RPAREN);
				setState(417);
				statement();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(419);
				match(WHILE);
				setState(420);
				match(LPAREN);
				setState(421);
				expression(0);
				setState(422);
				match(RPAREN);
				setState(423);
				statement();
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(425);
				match(FOREVER);
				setState(426);
				statement();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(427);
				match(WAIT);
				setState(428);
				match(LPAREN);
				setState(429);
				expression(0);
				setState(430);
				match(RPAREN);
				setState(431);
				statement_or_null();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AT || _la==HASH) {
					{
					setState(433);
					timing_control_statement();
					}
				}

				setState(436);
				assignment();
				setState(437);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				{
				setState(439);
				task_enable_statement();
				setState(440);
				match(SEMI);
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				{
				setState(442);
				compiler_directive();
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				{
				setState(443);
				match(SEMI);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Statement_or_nullContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(VerilogParser.SEMI, 0); }
		public Statement_or_nullContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement_or_null; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterStatement_or_null(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitStatement_or_null(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitStatement_or_null(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Statement_or_nullContext statement_or_null() throws RecognitionException {
		Statement_or_nullContext _localctx = new Statement_or_nullContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_statement_or_null);
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public Variable_lvalueContext variable_lvalue() {
			return getRuleContext(Variable_lvalueContext.class,0);
		}
		public TerminalNode ASSIGN_EQ() { return getToken(VerilogParser.ASSIGN_EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LE_OP() { return getToken(VerilogParser.LE_OP, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignment);
		try {
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				variable_lvalue();
				setState(451);
				match(ASSIGN_EQ);
				setState(452);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				variable_lvalue();
				setState(455);
				match(LE_OP);
				setState(456);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_assignmentContext extends ParserRuleContext {
		public Variable_lvalueContext variable_lvalue() {
			return getRuleContext(Variable_lvalueContext.class,0);
		}
		public TerminalNode ASSIGN_EQ() { return getToken(VerilogParser.ASSIGN_EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Variable_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterVariable_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitVariable_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitVariable_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_assignmentContext variable_assignment() throws RecognitionException {
		Variable_assignmentContext _localctx = new Variable_assignmentContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_variable_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(460);
			variable_lvalue();
			setState(461);
			match(ASSIGN_EQ);
			setState(462);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Variable_lvalueContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(VerilogParser.LBRACE, 0); }
		public List<Variable_lvalueContext> variable_lvalue() {
			return getRuleContexts(Variable_lvalueContext.class);
		}
		public Variable_lvalueContext variable_lvalue(int i) {
			return getRuleContext(Variable_lvalueContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(VerilogParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public Hierarchical_identifierContext hierarchical_identifier() {
			return getRuleContext(Hierarchical_identifierContext.class,0);
		}
		public Variable_lvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterVariable_lvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitVariable_lvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitVariable_lvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_lvalueContext variable_lvalue() throws RecognitionException {
		Variable_lvalueContext _localctx = new Variable_lvalueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_variable_lvalue);
		int _la;
		try {
			setState(480);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(464);
				match(IDENTIFIER);
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LBRACK) {
					{
					setState(465);
					range_expression();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(468);
				match(LBRACE);
				setState(469);
				variable_lvalue();
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(470);
					match(COMMA);
					setState(471);
					variable_lvalue();
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(477);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				hierarchical_identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Hierarchical_identifierContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(VerilogParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(VerilogParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(VerilogParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(VerilogParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(VerilogParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(VerilogParser.RBRACK, i);
		}
		public List<TerminalNode> DOT() { return getTokens(VerilogParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VerilogParser.DOT, i);
		}
		public Hierarchical_identifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hierarchical_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterHierarchical_identifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitHierarchical_identifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitHierarchical_identifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hierarchical_identifierContext hierarchical_identifier() throws RecognitionException {
		Hierarchical_identifierContext _localctx = new Hierarchical_identifierContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_hierarchical_identifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(IDENTIFIER);
			setState(489);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					match(LBRACK);
					setState(484);
					expression(0);
					setState(485);
					match(RBRACK);
					}
					} 
				}
				setState(491);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			}
			setState(505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(492);
					match(DOT);
					setState(493);
					match(IDENTIFIER);
					setState(500);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(494);
							match(LBRACK);
							setState(495);
							expression(0);
							setState(496);
							match(RBRACK);
							}
							} 
						}
						setState(502);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
					}
					}
					} 
				}
				setState(507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Constant_expressionContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public List<Constant_expressionContext> constant_expression() {
			return getRuleContexts(Constant_expressionContext.class);
		}
		public Constant_expressionContext constant_expression(int i) {
			return getRuleContext(Constant_expressionContext.class,i);
		}
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public Constant_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterConstant_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitConstant_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitConstant_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_expressionContext constant_expression() throws RecognitionException {
		return constant_expression(0);
	}

	private Constant_expressionContext constant_expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Constant_expressionContext _localctx = new Constant_expressionContext(_ctx, _parentState);
		Constant_expressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_constant_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case STRING:
				{
				setState(509);
				number();
				}
				break;
			case IDENTIFIER:
				{
				setState(510);
				match(IDENTIFIER);
				}
				break;
			case TILDE_CARET:
			case CARET_TILDE:
			case REDUCE_NOR:
			case REDUCE_NAND:
			case PLUS:
			case MINUS:
			case LOG_NOT:
			case BIT_AND:
			case BIT_OR:
			case BIT_NOT:
			case BIT_XOR:
				{
				setState(511);
				unary_operator();
				setState(512);
				constant_expression(3);
				}
				break;
			case LPAREN:
				{
				setState(514);
				match(LPAREN);
				setState(515);
				constant_expression(0);
				setState(516);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Constant_expressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_constant_expression);
					setState(520);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(521);
					binary_operator();
					setState(522);
					constant_expression(3);
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DelayContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(VerilogParser.HASH, 0); }
		public Delay_valueContext delay_value() {
			return getRuleContext(Delay_valueContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public Mintypmax_expressionContext mintypmax_expression() {
			return getRuleContext(Mintypmax_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public DelayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterDelay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitDelay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitDelay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelayContext delay() throws RecognitionException {
		DelayContext _localctx = new DelayContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_delay);
		try {
			setState(536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(529);
				match(HASH);
				setState(530);
				delay_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(531);
				match(HASH);
				setState(532);
				match(LPAREN);
				setState(533);
				mintypmax_expression();
				setState(534);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mintypmax_expressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(VerilogParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(VerilogParser.COLON, i);
		}
		public Mintypmax_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mintypmax_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterMintypmax_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitMintypmax_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitMintypmax_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mintypmax_expressionContext mintypmax_expression() throws RecognitionException {
		Mintypmax_expressionContext _localctx = new Mintypmax_expressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_mintypmax_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			expression(0);
			setState(545);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(539);
				match(COLON);
				setState(540);
				expression(0);
				setState(543);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(541);
					match(COLON);
					setState(542);
					expression(0);
					}
				}

				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Case_itemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COLON() { return getToken(VerilogParser.COLON, 0); }
		public Statement_or_nullContext statement_or_null() {
			return getRuleContext(Statement_or_nullContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public TerminalNode DEFAULT() { return getToken(VerilogParser.DEFAULT, 0); }
		public Case_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterCase_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitCase_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitCase_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_itemContext case_item() throws RecognitionException {
		Case_itemContext _localctx = new Case_itemContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_case_item);
		int _la;
		try {
			setState(563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TILDE_CARET:
			case CARET_TILDE:
			case REDUCE_NOR:
			case REDUCE_NAND:
			case PLUS:
			case MINUS:
			case LOG_NOT:
			case BIT_AND:
			case BIT_OR:
			case BIT_NOT:
			case BIT_XOR:
			case LPAREN:
			case LBRACE:
			case IDENTIFIER:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				expression(0);
				setState(552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(548);
					match(COMMA);
					setState(549);
					expression(0);
					}
					}
					setState(554);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(555);
				match(COLON);
				setState(556);
				statement_or_null();
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				match(DEFAULT);
				setState(560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(559);
					match(COLON);
					}
				}

				setState(562);
				statement_or_null();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Timing_control_statementContext extends ParserRuleContext {
		public Event_controlContext event_control() {
			return getRuleContext(Event_controlContext.class,0);
		}
		public Delay_controlContext delay_control() {
			return getRuleContext(Delay_controlContext.class,0);
		}
		public Timing_control_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timing_control_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterTiming_control_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitTiming_control_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitTiming_control_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timing_control_statementContext timing_control_statement() throws RecognitionException {
		Timing_control_statementContext _localctx = new Timing_control_statementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_timing_control_statement);
		try {
			setState(567);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				enterOuterAlt(_localctx, 1);
				{
				setState(565);
				event_control();
				}
				break;
			case HASH:
				enterOuterAlt(_localctx, 2);
				{
				setState(566);
				delay_control();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Event_controlContext extends ParserRuleContext {
		public TerminalNode AT() { return getToken(VerilogParser.AT, 0); }
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public Event_expressionContext event_expression() {
			return getRuleContext(Event_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public Event_triggerContext event_trigger() {
			return getRuleContext(Event_triggerContext.class,0);
		}
		public Event_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterEvent_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitEvent_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitEvent_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_controlContext event_control() throws RecognitionException {
		Event_controlContext _localctx = new Event_controlContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_event_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(569);
			match(AT);
			setState(575);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				{
				setState(570);
				match(LPAREN);
				setState(571);
				event_expression();
				setState(572);
				match(RPAREN);
				}
				break;
			case NEGEDGE:
			case POSEDGE:
			case IDENTIFIER:
				{
				setState(574);
				event_trigger();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delay_controlContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(VerilogParser.HASH, 0); }
		public Delay_valueContext delay_value() {
			return getRuleContext(Delay_valueContext.class,0);
		}
		public Delay_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterDelay_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitDelay_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitDelay_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delay_controlContext delay_control() throws RecognitionException {
		Delay_controlContext _localctx = new Delay_controlContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_delay_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(HASH);
			setState(578);
			delay_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Event_expressionContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(VerilogParser.STAR, 0); }
		public List<Event_triggerContext> event_trigger() {
			return getRuleContexts(Event_triggerContext.class);
		}
		public Event_triggerContext event_trigger(int i) {
			return getRuleContext(Event_triggerContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public List<TerminalNode> OR() { return getTokens(VerilogParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(VerilogParser.OR, i);
		}
		public Event_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterEvent_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitEvent_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitEvent_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_expressionContext event_expression() throws RecognitionException {
		Event_expressionContext _localctx = new Event_expressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_event_expression);
		int _la;
		try {
			setState(589);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				match(STAR);
				}
				break;
			case NEGEDGE:
			case POSEDGE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				event_trigger();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR || _la==COMMA) {
					{
					{
					setState(582);
					_la = _input.LA(1);
					if ( !(_la==OR || _la==COMMA) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(583);
					event_trigger();
					}
					}
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Event_triggerContext extends ParserRuleContext {
		public Posedge_expressionContext posedge_expression() {
			return getRuleContext(Posedge_expressionContext.class,0);
		}
		public Negedge_expressionContext negedge_expression() {
			return getRuleContext(Negedge_expressionContext.class,0);
		}
		public Hierarchical_identifierContext hierarchical_identifier() {
			return getRuleContext(Hierarchical_identifierContext.class,0);
		}
		public Event_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event_trigger; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterEvent_trigger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitEvent_trigger(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitEvent_trigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Event_triggerContext event_trigger() throws RecognitionException {
		Event_triggerContext _localctx = new Event_triggerContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_event_trigger);
		try {
			setState(594);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case POSEDGE:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				posedge_expression();
				}
				break;
			case NEGEDGE:
				enterOuterAlt(_localctx, 2);
				{
				setState(592);
				negedge_expression();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(593);
				hierarchical_identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Posedge_expressionContext extends ParserRuleContext {
		public TerminalNode POSEDGE() { return getToken(VerilogParser.POSEDGE, 0); }
		public Hierarchical_identifierContext hierarchical_identifier() {
			return getRuleContext(Hierarchical_identifierContext.class,0);
		}
		public Posedge_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_posedge_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterPosedge_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitPosedge_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitPosedge_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Posedge_expressionContext posedge_expression() throws RecognitionException {
		Posedge_expressionContext _localctx = new Posedge_expressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_posedge_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			match(POSEDGE);
			setState(597);
			hierarchical_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Negedge_expressionContext extends ParserRuleContext {
		public TerminalNode NEGEDGE() { return getToken(VerilogParser.NEGEDGE, 0); }
		public Hierarchical_identifierContext hierarchical_identifier() {
			return getRuleContext(Hierarchical_identifierContext.class,0);
		}
		public Negedge_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_negedge_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterNegedge_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitNegedge_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitNegedge_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Negedge_expressionContext negedge_expression() throws RecognitionException {
		Negedge_expressionContext _localctx = new Negedge_expressionContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_negedge_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(599);
			match(NEGEDGE);
			setState(600);
			hierarchical_identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Task_enable_statementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public List_of_argumentsContext list_of_arguments() {
			return getRuleContext(List_of_argumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public TerminalNode DOLLAR() { return getToken(VerilogParser.DOLLAR, 0); }
		public Task_enable_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_enable_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterTask_enable_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitTask_enable_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitTask_enable_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Task_enable_statementContext task_enable_statement() throws RecognitionException {
		Task_enable_statementContext _localctx = new Task_enable_statementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_task_enable_statement);
		int _la;
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(602);
				match(IDENTIFIER);
				setState(607);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(603);
					match(LPAREN);
					setState(604);
					list_of_arguments();
					setState(605);
					match(RPAREN);
					}
				}

				}
				break;
			case DOLLAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(609);
				match(DOLLAR);
				setState(610);
				match(IDENTIFIER);
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(611);
					match(LPAREN);
					setState(612);
					list_of_arguments();
					setState(613);
					match(RPAREN);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_of_argumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public List<TerminalNode> DOT() { return getTokens(VerilogParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(VerilogParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(VerilogParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(VerilogParser.IDENTIFIER, i);
		}
		public List<TerminalNode> LPAREN() { return getTokens(VerilogParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(VerilogParser.LPAREN, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(VerilogParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(VerilogParser.RPAREN, i);
		}
		public List_of_argumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterList_of_arguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitList_of_arguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitList_of_arguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_argumentsContext list_of_arguments() throws RecognitionException {
		List_of_argumentsContext _localctx = new List_of_argumentsContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_list_of_arguments);
		int _la;
		try {
			setState(644);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TILDE_CARET:
			case CARET_TILDE:
			case REDUCE_NOR:
			case REDUCE_NAND:
			case PLUS:
			case MINUS:
			case LOG_NOT:
			case BIT_AND:
			case BIT_OR:
			case BIT_NOT:
			case BIT_XOR:
			case LPAREN:
			case LBRACE:
			case IDENTIFIER:
			case NUMBER:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(619);
				expression(0);
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(620);
					match(COMMA);
					setState(621);
					expression(0);
					}
					}
					setState(626);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(627);
				match(DOT);
				setState(628);
				match(IDENTIFIER);
				setState(629);
				match(LPAREN);
				setState(630);
				expression(0);
				setState(631);
				match(RPAREN);
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(632);
					match(COMMA);
					setState(633);
					match(DOT);
					setState(634);
					match(IDENTIFIER);
					setState(635);
					match(LPAREN);
					setState(636);
					expression(0);
					setState(637);
					match(RPAREN);
					}
					}
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TernaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode QUESTION() { return getToken(VerilogParser.QUESTION, 0); }
		public TerminalNode COLON() { return getToken(VerilogParser.COLON, 0); }
		public TernaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterTernaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitTernaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitTernaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Binary_operatorContext binary_operator() {
			return getRuleContext(Binary_operatorContext.class,0);
		}
		public BinaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitBinaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitBinaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReplicationExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(VerilogParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(VerilogParser.RBRACE, 0); }
		public ReplicationExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterReplicationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitReplicationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitReplicationExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionContext extends ExpressionContext {
		public Unary_operatorContext unary_operator() {
			return getRuleContext(Unary_operatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TILDE_CARET:
			case CARET_TILDE:
			case REDUCE_NOR:
			case REDUCE_NAND:
			case PLUS:
			case MINUS:
			case LOG_NOT:
			case BIT_AND:
			case BIT_OR:
			case BIT_NOT:
			case BIT_XOR:
				{
				_localctx = new UnaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(647);
				unary_operator();
				setState(648);
				expression(2);
				}
				break;
			case LPAREN:
			case LBRACE:
			case IDENTIFIER:
			case NUMBER:
			case STRING:
				{
				_localctx = new PrimaryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(650);
				primary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(670);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(668);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						_localctx = new BinaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(653);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(654);
						binary_operator();
						setState(655);
						expression(5);
						}
						break;
					case 2:
						{
						_localctx = new TernaryExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(657);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(658);
						match(QUESTION);
						setState(659);
						expression(0);
						setState(660);
						match(COLON);
						setState(661);
						expression(4);
						}
						break;
					case 3:
						{
						_localctx = new ReplicationExpressionContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(663);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(664);
						match(LBRACE);
						setState(665);
						expression(0);
						setState(666);
						match(RBRACE);
						}
						break;
					}
					} 
				}
				setState(672);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_primary);
		try {
			setState(684);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(673);
				number();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(674);
				match(IDENTIFIER);
				setState(676);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
				case 1:
					{
					setState(675);
					range_expression();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(678);
				concatenation();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(679);
				function_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(680);
				match(LPAREN);
				setState(681);
				expression(0);
				setState(682);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConcatenationContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(VerilogParser.LBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACE() { return getToken(VerilogParser.RBRACE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public ConcatenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcatenationContext concatenation() throws RecognitionException {
		ConcatenationContext _localctx = new ConcatenationContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_concatenation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(LBRACE);
			setState(687);
			expression(0);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(688);
				match(COMMA);
				setState(689);
				expression(0);
				}
				}
				setState(694);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(695);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Gate_instantiationContext extends ParserRuleContext {
		public List<Gate_instanceContext> gate_instance() {
			return getRuleContexts(Gate_instanceContext.class);
		}
		public Gate_instanceContext gate_instance(int i) {
			return getRuleContext(Gate_instanceContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(VerilogParser.SEMI, 0); }
		public Cmos_switchtypeContext cmos_switchtype() {
			return getRuleContext(Cmos_switchtypeContext.class,0);
		}
		public Enable_gatetypeContext enable_gatetype() {
			return getRuleContext(Enable_gatetypeContext.class,0);
		}
		public Mos_switchtypeContext mos_switchtype() {
			return getRuleContext(Mos_switchtypeContext.class,0);
		}
		public N_input_gatetypeContext n_input_gatetype() {
			return getRuleContext(N_input_gatetypeContext.class,0);
		}
		public DelayContext delay() {
			return getRuleContext(DelayContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public Gate_instantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gate_instantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterGate_instantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitGate_instantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitGate_instantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gate_instantiationContext gate_instantiation() throws RecognitionException {
		Gate_instantiationContext _localctx = new Gate_instantiationContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_gate_instantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(701);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CMOS:
			case RCMOS:
				{
				setState(697);
				cmos_switchtype();
				}
				break;
			case BUFIF0:
			case BUFIF1:
			case NOTIF0:
			case NOTIF1:
				{
				setState(698);
				enable_gatetype();
				}
				break;
			case NMOS:
			case PMOS:
			case RNMOS:
			case RPMOS:
				{
				setState(699);
				mos_switchtype();
				}
				break;
			case AND:
			case NAND:
			case NOR:
			case OR:
			case XNOR:
			case XOR:
				{
				setState(700);
				n_input_gatetype();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(703);
				delay();
				}
			}

			setState(706);
			gate_instance();
			setState(711);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(707);
				match(COMMA);
				setState(708);
				gate_instance();
				}
				}
				setState(713);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(714);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Gate_instanceContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public List<TerminalContext> terminal() {
			return getRuleContexts(TerminalContext.class);
		}
		public TerminalContext terminal(int i) {
			return getRuleContext(TerminalContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public Name_of_instanceContext name_of_instance() {
			return getRuleContext(Name_of_instanceContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public Gate_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gate_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterGate_instance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitGate_instance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitGate_instance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Gate_instanceContext gate_instance() throws RecognitionException {
		Gate_instanceContext _localctx = new Gate_instanceContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_gate_instance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(717);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFIER) {
				{
				setState(716);
				name_of_instance();
				}
			}

			setState(719);
			match(LPAREN);
			setState(720);
			terminal();
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(721);
				match(COMMA);
				setState(722);
				terminal();
				}
				}
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(728);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Name_of_instanceContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public Name_of_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name_of_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterName_of_instance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitName_of_instance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitName_of_instance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Name_of_instanceContext name_of_instance() throws RecognitionException {
		Name_of_instanceContext _localctx = new Name_of_instanceContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_name_of_instance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(730);
			match(IDENTIFIER);
			setState(732);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(731);
				range_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminalContext extends ParserRuleContext {
		public Identifier_expressionContext identifier_expression() {
			return getRuleContext(Identifier_expressionContext.class,0);
		}
		public Hierarchical_identifierContext hierarchical_identifier() {
			return getRuleContext(Hierarchical_identifierContext.class,0);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterTerminal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitTerminal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitTerminal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminalContext terminal() throws RecognitionException {
		TerminalContext _localctx = new TerminalContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_terminal);
		try {
			setState(737);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(734);
				identifier_expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				hierarchical_identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(736);
				constant_expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Identifier_expressionContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public Identifier_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterIdentifier_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitIdentifier_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitIdentifier_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Identifier_expressionContext identifier_expression() throws RecognitionException {
		Identifier_expressionContext _localctx = new Identifier_expressionContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_identifier_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(739);
			match(IDENTIFIER);
			setState(741);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(740);
				range_expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Cmos_switchtypeContext extends ParserRuleContext {
		public TerminalNode CMOS() { return getToken(VerilogParser.CMOS, 0); }
		public TerminalNode RCMOS() { return getToken(VerilogParser.RCMOS, 0); }
		public Cmos_switchtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmos_switchtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterCmos_switchtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitCmos_switchtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitCmos_switchtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cmos_switchtypeContext cmos_switchtype() throws RecognitionException {
		Cmos_switchtypeContext _localctx = new Cmos_switchtypeContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_cmos_switchtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(743);
			_la = _input.LA(1);
			if ( !(_la==CMOS || _la==RCMOS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Enable_gatetypeContext extends ParserRuleContext {
		public TerminalNode BUFIF0() { return getToken(VerilogParser.BUFIF0, 0); }
		public TerminalNode BUFIF1() { return getToken(VerilogParser.BUFIF1, 0); }
		public TerminalNode NOTIF0() { return getToken(VerilogParser.NOTIF0, 0); }
		public TerminalNode NOTIF1() { return getToken(VerilogParser.NOTIF1, 0); }
		public Enable_gatetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enable_gatetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterEnable_gatetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitEnable_gatetype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitEnable_gatetype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Enable_gatetypeContext enable_gatetype() throws RecognitionException {
		Enable_gatetypeContext _localctx = new Enable_gatetypeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_enable_gatetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(745);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 216172782113784000L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Mos_switchtypeContext extends ParserRuleContext {
		public TerminalNode NMOS() { return getToken(VerilogParser.NMOS, 0); }
		public TerminalNode PMOS() { return getToken(VerilogParser.PMOS, 0); }
		public TerminalNode RNMOS() { return getToken(VerilogParser.RNMOS, 0); }
		public TerminalNode RPMOS() { return getToken(VerilogParser.RPMOS, 0); }
		public Mos_switchtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mos_switchtype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterMos_switchtype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitMos_switchtype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitMos_switchtype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mos_switchtypeContext mos_switchtype() throws RecognitionException {
		Mos_switchtypeContext _localctx = new Mos_switchtypeContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_mos_switchtype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(747);
			_la = _input.LA(1);
			if ( !(((((_la - 53)) & ~0x3f) == 0 && ((1L << (_la - 53)) & 6291713L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class N_input_gatetypeContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(VerilogParser.AND, 0); }
		public TerminalNode NAND() { return getToken(VerilogParser.NAND, 0); }
		public TerminalNode OR() { return getToken(VerilogParser.OR, 0); }
		public TerminalNode NOR() { return getToken(VerilogParser.NOR, 0); }
		public TerminalNode XOR() { return getToken(VerilogParser.XOR, 0); }
		public TerminalNode XNOR() { return getToken(VerilogParser.XNOR, 0); }
		public N_input_gatetypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n_input_gatetype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterN_input_gatetype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitN_input_gatetype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitN_input_gatetype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final N_input_gatetypeContext n_input_gatetype() throws RecognitionException {
		N_input_gatetypeContext _localctx = new N_input_gatetypeContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_n_input_gatetype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(749);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 308496574474878980L) != 0) || _la==XNOR || _la==XOR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Task_declarationContext extends ParserRuleContext {
		public TerminalNode TASK() { return getToken(VerilogParser.TASK, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode SEMI() { return getToken(VerilogParser.SEMI, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ENDTASK() { return getToken(VerilogParser.ENDTASK, 0); }
		public TerminalNode AUTOMATIC() { return getToken(VerilogParser.AUTOMATIC, 0); }
		public List<Task_tf_declarationContext> task_tf_declaration() {
			return getRuleContexts(Task_tf_declarationContext.class);
		}
		public Task_tf_declarationContext task_tf_declaration(int i) {
			return getRuleContext(Task_tf_declarationContext.class,i);
		}
		public Task_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterTask_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitTask_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitTask_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Task_declarationContext task_declaration() throws RecognitionException {
		Task_declarationContext _localctx = new Task_declarationContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_task_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			match(TASK);
			setState(753);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTOMATIC) {
				{
				setState(752);
				match(AUTOMATIC);
				}
			}

			setState(755);
			match(IDENTIFIER);
			setState(756);
			match(SEMI);
			setState(760);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & 1125900980846663L) != 0)) {
				{
				{
				setState(757);
				task_tf_declaration();
				}
				}
				setState(762);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(763);
			statement();
			setState(764);
			match(ENDTASK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Task_tf_declarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(VerilogParser.SEMI, 0); }
		public Input_declarationContext input_declaration() {
			return getRuleContext(Input_declarationContext.class,0);
		}
		public Output_declarationContext output_declaration() {
			return getRuleContext(Output_declarationContext.class,0);
		}
		public Inout_declarationContext inout_declaration() {
			return getRuleContext(Inout_declarationContext.class,0);
		}
		public Reg_declarationContext reg_declaration() {
			return getRuleContext(Reg_declarationContext.class,0);
		}
		public Integer_declarationContext integer_declaration() {
			return getRuleContext(Integer_declarationContext.class,0);
		}
		public Time_declarationContext time_declaration() {
			return getRuleContext(Time_declarationContext.class,0);
		}
		public Localparam_declarationContext localparam_declaration() {
			return getRuleContext(Localparam_declarationContext.class,0);
		}
		public Task_tf_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_task_tf_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterTask_tf_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitTask_tf_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitTask_tf_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Task_tf_declarationContext task_tf_declaration() throws RecognitionException {
		Task_tf_declarationContext _localctx = new Task_tf_declarationContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_task_tf_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(773);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INPUT:
				{
				setState(766);
				input_declaration();
				}
				break;
			case OUTPUT:
				{
				setState(767);
				output_declaration();
				}
				break;
			case INOUT:
				{
				setState(768);
				inout_declaration();
				}
				break;
			case REG:
				{
				setState(769);
				reg_declaration();
				}
				break;
			case INTEGER:
				{
				setState(770);
				integer_declaration();
				}
				break;
			case TIME:
				{
				setState(771);
				time_declaration();
				}
				break;
			case LOCALPARAM:
				{
				setState(772);
				localparam_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(775);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_declarationContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(VerilogParser.FUNCTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public List<TerminalNode> SEMI() { return getTokens(VerilogParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VerilogParser.SEMI, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ENDFUNCTION() { return getToken(VerilogParser.ENDFUNCTION, 0); }
		public TerminalNode AUTOMATIC() { return getToken(VerilogParser.AUTOMATIC, 0); }
		public TerminalNode SIGNED() { return getToken(VerilogParser.SIGNED, 0); }
		public Range_expressionContext range_expression() {
			return getRuleContext(Range_expressionContext.class,0);
		}
		public List<Input_declarationContext> input_declaration() {
			return getRuleContexts(Input_declarationContext.class);
		}
		public Input_declarationContext input_declaration(int i) {
			return getRuleContext(Input_declarationContext.class,i);
		}
		public List<Function_local_declarationContext> function_local_declaration() {
			return getRuleContexts(Function_local_declarationContext.class);
		}
		public Function_local_declarationContext function_local_declaration(int i) {
			return getRuleContext(Function_local_declarationContext.class,i);
		}
		public Function_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterFunction_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitFunction_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitFunction_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_declarationContext function_declaration() throws RecognitionException {
		Function_declarationContext _localctx = new Function_declarationContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_function_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(FUNCTION);
			setState(779);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AUTOMATIC) {
				{
				setState(778);
				match(AUTOMATIC);
				}
			}

			setState(782);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIGNED) {
				{
				setState(781);
				match(SIGNED);
				}
			}

			setState(785);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(784);
				range_expression();
				}
			}

			setState(787);
			match(IDENTIFIER);
			setState(788);
			match(SEMI);
			setState(792); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(789);
				input_declaration();
				setState(790);
				match(SEMI);
				}
				}
				setState(794); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==INPUT );
			setState(799);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & 281475312254993L) != 0)) {
				{
				{
				setState(796);
				function_local_declaration();
				}
				}
				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(802);
			statement();
			setState(803);
			match(ENDFUNCTION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_local_declarationContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(VerilogParser.SEMI, 0); }
		public Reg_declarationContext reg_declaration() {
			return getRuleContext(Reg_declarationContext.class,0);
		}
		public Integer_declarationContext integer_declaration() {
			return getRuleContext(Integer_declarationContext.class,0);
		}
		public Time_declarationContext time_declaration() {
			return getRuleContext(Time_declarationContext.class,0);
		}
		public Real_declarationContext real_declaration() {
			return getRuleContext(Real_declarationContext.class,0);
		}
		public Localparam_declarationContext localparam_declaration() {
			return getRuleContext(Localparam_declarationContext.class,0);
		}
		public Function_local_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_local_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterFunction_local_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitFunction_local_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitFunction_local_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_local_declarationContext function_local_declaration() throws RecognitionException {
		Function_local_declarationContext _localctx = new Function_local_declarationContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_function_local_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(810);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REG:
				{
				setState(805);
				reg_declaration();
				}
				break;
			case INTEGER:
				{
				setState(806);
				integer_declaration();
				}
				break;
			case TIME:
				{
				setState(807);
				time_declaration();
				}
				break;
			case REAL:
				{
				setState(808);
				real_declaration();
				}
				break;
			case LOCALPARAM:
				{
				setState(809);
				localparam_declaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(812);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generate_blockContext extends ParserRuleContext {
		public TerminalNode GENERATE() { return getToken(VerilogParser.GENERATE, 0); }
		public TerminalNode ENDGENERATE() { return getToken(VerilogParser.ENDGENERATE, 0); }
		public List<Generate_itemContext> generate_item() {
			return getRuleContexts(Generate_itemContext.class);
		}
		public Generate_itemContext generate_item(int i) {
			return getRuleContext(Generate_itemContext.class,i);
		}
		public Generate_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generate_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterGenerate_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitGenerate_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitGenerate_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generate_blockContext generate_block() throws RecognitionException {
		Generate_blockContext _localctx = new Generate_blockContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_generate_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(814);
			match(GENERATE);
			setState(818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3992592305126121678L) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 4467599417666437323L) != 0) || _la==IDENTIFIER) {
				{
				{
				setState(815);
				generate_item();
				}
				}
				setState(820);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(821);
			match(ENDGENERATE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generate_itemContext extends ParserRuleContext {
		public Generate_conditionalContext generate_conditional() {
			return getRuleContext(Generate_conditionalContext.class,0);
		}
		public Generate_loopContext generate_loop() {
			return getRuleContext(Generate_loopContext.class,0);
		}
		public Module_itemContext module_item() {
			return getRuleContext(Module_itemContext.class,0);
		}
		public Generate_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generate_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterGenerate_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitGenerate_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitGenerate_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generate_itemContext generate_item() throws RecognitionException {
		Generate_itemContext _localctx = new Generate_itemContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_generate_item);
		try {
			setState(826);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(823);
				generate_conditional();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(824);
				generate_loop();
				}
				break;
			case ALWAYS:
			case AND:
			case ASSIGN:
			case BUFIF0:
			case BUFIF1:
			case CMOS:
			case FUNCTION:
			case GENERATE:
			case INITIAL:
			case INTEGER:
			case LOCALPARAM:
			case NAND:
			case NMOS:
			case NOR:
			case NOTIF0:
			case NOTIF1:
			case OR:
			case PARAMETER:
			case PMOS:
			case RCMOS:
			case REAL:
			case REG:
			case RNMOS:
			case RPMOS:
			case TASK:
			case TIME:
			case WIRE:
			case XNOR:
			case XOR:
			case TICK_TIMESCALE:
			case TICK_DEFINE:
			case TICK_INCLUDE:
			case TICK_IFDEF:
			case TICK_IFNDEF:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(825);
				module_item();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generate_conditionalContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(VerilogParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public List<Generate_itemContext> generate_item() {
			return getRuleContexts(Generate_itemContext.class);
		}
		public Generate_itemContext generate_item(int i) {
			return getRuleContext(Generate_itemContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(VerilogParser.ELSE, 0); }
		public Generate_conditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generate_conditional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterGenerate_conditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitGenerate_conditional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitGenerate_conditional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generate_conditionalContext generate_conditional() throws RecognitionException {
		Generate_conditionalContext _localctx = new Generate_conditionalContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_generate_conditional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(828);
			match(IF);
			setState(829);
			match(LPAREN);
			setState(830);
			constant_expression(0);
			setState(831);
			match(RPAREN);
			setState(832);
			generate_item();
			setState(835);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(833);
				match(ELSE);
				setState(834);
				generate_item();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Generate_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(VerilogParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public Genvar_declarationContext genvar_declaration() {
			return getRuleContext(Genvar_declarationContext.class,0);
		}
		public List<TerminalNode> SEMI() { return getTokens(VerilogParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(VerilogParser.SEMI, i);
		}
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Genvar_assignmentContext genvar_assignment() {
			return getRuleContext(Genvar_assignmentContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public Generate_blockContext generate_block() {
			return getRuleContext(Generate_blockContext.class,0);
		}
		public Generate_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_generate_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterGenerate_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitGenerate_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitGenerate_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Generate_loopContext generate_loop() throws RecognitionException {
		Generate_loopContext _localctx = new Generate_loopContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_generate_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			match(FOR);
			setState(838);
			match(LPAREN);
			setState(839);
			genvar_declaration();
			setState(840);
			match(SEMI);
			setState(841);
			constant_expression(0);
			setState(842);
			match(SEMI);
			setState(843);
			genvar_assignment();
			setState(844);
			match(RPAREN);
			setState(845);
			generate_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Genvar_declarationContext extends ParserRuleContext {
		public TerminalNode GENVAR() { return getToken(VerilogParser.GENVAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN_EQ() { return getToken(VerilogParser.ASSIGN_EQ, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Genvar_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genvar_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterGenvar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitGenvar_declaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitGenvar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Genvar_declarationContext genvar_declaration() throws RecognitionException {
		Genvar_declarationContext _localctx = new Genvar_declarationContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_genvar_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(847);
			match(GENVAR);
			setState(848);
			match(IDENTIFIER);
			setState(849);
			match(ASSIGN_EQ);
			setState(850);
			constant_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Genvar_assignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN_EQ() { return getToken(VerilogParser.ASSIGN_EQ, 0); }
		public Constant_expressionContext constant_expression() {
			return getRuleContext(Constant_expressionContext.class,0);
		}
		public Genvar_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genvar_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterGenvar_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitGenvar_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitGenvar_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Genvar_assignmentContext genvar_assignment() throws RecognitionException {
		Genvar_assignmentContext _localctx = new Genvar_assignmentContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_genvar_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			match(IDENTIFIER);
			setState(853);
			match(ASSIGN_EQ);
			setState(854);
			constant_expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_instantiationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public List<Module_instanceContext> module_instance() {
			return getRuleContexts(Module_instanceContext.class);
		}
		public Module_instanceContext module_instance(int i) {
			return getRuleContext(Module_instanceContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(VerilogParser.SEMI, 0); }
		public Parameter_value_assignmentContext parameter_value_assignment() {
			return getRuleContext(Parameter_value_assignmentContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public Module_instantiationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_instantiation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterModule_instantiation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitModule_instantiation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitModule_instantiation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_instantiationContext module_instantiation() throws RecognitionException {
		Module_instantiationContext _localctx = new Module_instantiationContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_module_instantiation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(IDENTIFIER);
			setState(858);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(857);
				parameter_value_assignment();
				}
			}

			setState(860);
			module_instance();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(861);
				match(COMMA);
				setState(862);
				module_instance();
				}
				}
				setState(867);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(868);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parameter_value_assignmentContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(VerilogParser.HASH, 0); }
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public List_of_param_assignmentsContext list_of_param_assignments() {
			return getRuleContext(List_of_param_assignmentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public Parameter_value_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter_value_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterParameter_value_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitParameter_value_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitParameter_value_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parameter_value_assignmentContext parameter_value_assignment() throws RecognitionException {
		Parameter_value_assignmentContext _localctx = new Parameter_value_assignmentContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_parameter_value_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(870);
			match(HASH);
			setState(871);
			match(LPAREN);
			setState(872);
			list_of_param_assignments();
			setState(873);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_of_param_assignmentsContext extends ParserRuleContext {
		public List<Named_parameter_assignmentContext> named_parameter_assignment() {
			return getRuleContexts(Named_parameter_assignmentContext.class);
		}
		public Named_parameter_assignmentContext named_parameter_assignment(int i) {
			return getRuleContext(Named_parameter_assignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public List_of_param_assignmentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_param_assignments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterList_of_param_assignments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitList_of_param_assignments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitList_of_param_assignments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_param_assignmentsContext list_of_param_assignments() throws RecognitionException {
		List_of_param_assignmentsContext _localctx = new List_of_param_assignmentsContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_list_of_param_assignments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(875);
			named_parameter_assignment();
			setState(880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(876);
				match(COMMA);
				setState(877);
				named_parameter_assignment();
				}
				}
				setState(882);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Named_parameter_assignmentContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(VerilogParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public Named_parameter_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_parameter_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterNamed_parameter_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitNamed_parameter_assignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitNamed_parameter_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_parameter_assignmentContext named_parameter_assignment() throws RecognitionException {
		Named_parameter_assignmentContext _localctx = new Named_parameter_assignmentContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_named_parameter_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			match(DOT);
			setState(884);
			match(IDENTIFIER);
			setState(885);
			match(LPAREN);
			setState(886);
			expression(0);
			setState(887);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Module_instanceContext extends ParserRuleContext {
		public Name_of_instanceContext name_of_instance() {
			return getRuleContext(Name_of_instanceContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public List_of_port_connectionsContext list_of_port_connections() {
			return getRuleContext(List_of_port_connectionsContext.class,0);
		}
		public Module_instanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module_instance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterModule_instance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitModule_instance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitModule_instance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Module_instanceContext module_instance() throws RecognitionException {
		Module_instanceContext _localctx = new Module_instanceContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_module_instance);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(889);
			name_of_instance();
			setState(890);
			match(LPAREN);
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(891);
				list_of_port_connections();
				}
			}

			setState(894);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class List_of_port_connectionsContext extends ParserRuleContext {
		public List<Named_port_connectionContext> named_port_connection() {
			return getRuleContexts(Named_port_connectionContext.class);
		}
		public Named_port_connectionContext named_port_connection(int i) {
			return getRuleContext(Named_port_connectionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(VerilogParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(VerilogParser.COMMA, i);
		}
		public List_of_port_connectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_of_port_connections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterList_of_port_connections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitList_of_port_connections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitList_of_port_connections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_of_port_connectionsContext list_of_port_connections() throws RecognitionException {
		List_of_port_connectionsContext _localctx = new List_of_port_connectionsContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_list_of_port_connections);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(896);
			named_port_connection();
			setState(901);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(897);
				match(COMMA);
				setState(898);
				named_port_connection();
				}
				}
				setState(903);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Named_port_connectionContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(VerilogParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Named_port_connectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_named_port_connection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterNamed_port_connection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitNamed_port_connection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitNamed_port_connection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Named_port_connectionContext named_port_connection() throws RecognitionException {
		Named_port_connectionContext _localctx = new Named_port_connectionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_named_port_connection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			match(DOT);
			setState(905);
			match(IDENTIFIER);
			setState(906);
			match(LPAREN);
			setState(908);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & 27779856621583L) != 0)) {
				{
				setState(907);
				expression(0);
				}
			}

			setState(910);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Range_expressionContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(VerilogParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RBRACK() { return getToken(VerilogParser.RBRACK, 0); }
		public TerminalNode COLON() { return getToken(VerilogParser.COLON, 0); }
		public TerminalNode PLUS_COLON() { return getToken(VerilogParser.PLUS_COLON, 0); }
		public TerminalNode MINUS_COLON() { return getToken(VerilogParser.MINUS_COLON, 0); }
		public Range_expressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_range_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterRange_expression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitRange_expression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitRange_expression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Range_expressionContext range_expression() throws RecognitionException {
		Range_expressionContext _localctx = new Range_expressionContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_range_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(912);
			match(LBRACK);
			setState(913);
			expression(0);
			setState(920);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLON:
				{
				setState(914);
				match(COLON);
				setState(915);
				expression(0);
				}
				break;
			case PLUS_COLON:
				{
				setState(916);
				match(PLUS_COLON);
				setState(917);
				expression(0);
				}
				break;
			case MINUS_COLON:
				{
				setState(918);
				match(MINUS_COLON);
				setState(919);
				expression(0);
				}
				break;
			case RBRACK:
				break;
			default:
				break;
			}
			setState(922);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delay_or_event_controlContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(VerilogParser.HASH, 0); }
		public Delay_valueContext delay_value() {
			return getRuleContext(Delay_valueContext.class,0);
		}
		public TerminalNode AT() { return getToken(VerilogParser.AT, 0); }
		public Event_triggerContext event_trigger() {
			return getRuleContext(Event_triggerContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public Mintypmax_expressionContext mintypmax_expression() {
			return getRuleContext(Mintypmax_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public Delay_or_event_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay_or_event_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterDelay_or_event_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitDelay_or_event_control(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitDelay_or_event_control(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delay_or_event_controlContext delay_or_event_control() throws RecognitionException {
		Delay_or_event_controlContext _localctx = new Delay_or_event_controlContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_delay_or_event_control);
		try {
			setState(933);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(924);
				match(HASH);
				setState(925);
				delay_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(926);
				match(AT);
				setState(927);
				event_trigger();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(928);
				match(HASH);
				setState(929);
				match(LPAREN);
				setState(930);
				mintypmax_expression();
				setState(931);
				match(RPAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delay_valueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VerilogParser.NUMBER, 0); }
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public Mintypmax_expressionContext mintypmax_expression() {
			return getRuleContext(Mintypmax_expressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public Delay_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delay_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterDelay_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitDelay_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitDelay_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delay_valueContext delay_value() throws RecognitionException {
		Delay_valueContext _localctx = new Delay_valueContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_delay_value);
		try {
			setState(941);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(935);
				match(NUMBER);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(936);
				match(IDENTIFIER);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(937);
				match(LPAREN);
				setState(938);
				mintypmax_expression();
				setState(939);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Unary_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(VerilogParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VerilogParser.MINUS, 0); }
		public TerminalNode LOG_NOT() { return getToken(VerilogParser.LOG_NOT, 0); }
		public TerminalNode BIT_NOT() { return getToken(VerilogParser.BIT_NOT, 0); }
		public TerminalNode BIT_AND() { return getToken(VerilogParser.BIT_AND, 0); }
		public TerminalNode REDUCE_NAND() { return getToken(VerilogParser.REDUCE_NAND, 0); }
		public TerminalNode BIT_OR() { return getToken(VerilogParser.BIT_OR, 0); }
		public TerminalNode REDUCE_NOR() { return getToken(VerilogParser.REDUCE_NOR, 0); }
		public TerminalNode BIT_XOR() { return getToken(VerilogParser.BIT_XOR, 0); }
		public TerminalNode CARET_TILDE() { return getToken(VerilogParser.CARET_TILDE, 0); }
		public TerminalNode TILDE_CARET() { return getToken(VerilogParser.TILDE_CARET, 0); }
		public Unary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterUnary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitUnary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitUnary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Unary_operatorContext unary_operator() throws RecognitionException {
		Unary_operatorContext _localctx = new Unary_operatorContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_unary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(943);
			_la = _input.LA(1);
			if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & 8151055L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Binary_operatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(VerilogParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(VerilogParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(VerilogParser.STAR, 0); }
		public TerminalNode DIV() { return getToken(VerilogParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(VerilogParser.MOD, 0); }
		public TerminalNode LOG_EQ() { return getToken(VerilogParser.LOG_EQ, 0); }
		public TerminalNode LOG_NEQ() { return getToken(VerilogParser.LOG_NEQ, 0); }
		public TerminalNode CASE_EQ() { return getToken(VerilogParser.CASE_EQ, 0); }
		public TerminalNode CASE_NEQ() { return getToken(VerilogParser.CASE_NEQ, 0); }
		public TerminalNode LESS() { return getToken(VerilogParser.LESS, 0); }
		public TerminalNode LE_OP() { return getToken(VerilogParser.LE_OP, 0); }
		public TerminalNode GREATER() { return getToken(VerilogParser.GREATER, 0); }
		public TerminalNode GREATER_EQ() { return getToken(VerilogParser.GREATER_EQ, 0); }
		public TerminalNode LOG_AND() { return getToken(VerilogParser.LOG_AND, 0); }
		public TerminalNode LOG_OR() { return getToken(VerilogParser.LOG_OR, 0); }
		public TerminalNode LEFT_SHIFT() { return getToken(VerilogParser.LEFT_SHIFT, 0); }
		public TerminalNode RIGHT_SHIFT() { return getToken(VerilogParser.RIGHT_SHIFT, 0); }
		public TerminalNode SHRA() { return getToken(VerilogParser.SHRA, 0); }
		public TerminalNode SHLA() { return getToken(VerilogParser.SHLA, 0); }
		public TerminalNode BIT_AND() { return getToken(VerilogParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(VerilogParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(VerilogParser.BIT_XOR, 0); }
		public TerminalNode TILDE_CARET() { return getToken(VerilogParser.TILDE_CARET, 0); }
		public TerminalNode CARET_TILDE() { return getToken(VerilogParser.CARET_TILDE, 0); }
		public Binary_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binary_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterBinary_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitBinary_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitBinary_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Binary_operatorContext binary_operator() throws RecognitionException {
		Binary_operatorContext _localctx = new Binary_operatorContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_binary_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(945);
			_la = _input.LA(1);
			if ( !(((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & 127741739007L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(VerilogParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(VerilogParser.LPAREN, 0); }
		public List_of_argumentsContext list_of_arguments() {
			return getRuleContext(List_of_argumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(VerilogParser.RPAREN, 0); }
		public Hierarchical_identifierContext hierarchical_identifier() {
			return getRuleContext(Hierarchical_identifierContext.class,0);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_function_call);
		try {
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(947);
				match(IDENTIFIER);
				setState(952);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(948);
					match(LPAREN);
					setState(949);
					list_of_arguments();
					setState(950);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(954);
				hierarchical_identifier();
				setState(959);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(955);
					match(LPAREN);
					setState(956);
					list_of_arguments();
					setState(957);
					match(RPAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VerilogParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(VerilogParser.STRING, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(963);
			_la = _input.LA(1);
			if ( !(_la==NUMBER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Compiler_directiveContext extends ParserRuleContext {
		public Define_directiveContext define_directive() {
			return getRuleContext(Define_directiveContext.class,0);
		}
		public Ifdef_directiveContext ifdef_directive() {
			return getRuleContext(Ifdef_directiveContext.class,0);
		}
		public Include_directiveContext include_directive() {
			return getRuleContext(Include_directiveContext.class,0);
		}
		public Timescale_directiveContext timescale_directive() {
			return getRuleContext(Timescale_directiveContext.class,0);
		}
		public Compiler_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compiler_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterCompiler_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitCompiler_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitCompiler_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Compiler_directiveContext compiler_directive() throws RecognitionException {
		Compiler_directiveContext _localctx = new Compiler_directiveContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_compiler_directive);
		try {
			setState(969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TICK_DEFINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(965);
				define_directive();
				}
				break;
			case TICK_IFDEF:
			case TICK_IFNDEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(966);
				ifdef_directive();
				}
				break;
			case TICK_INCLUDE:
				enterOuterAlt(_localctx, 3);
				{
				setState(967);
				include_directive();
				}
				break;
			case TICK_TIMESCALE:
				enterOuterAlt(_localctx, 4);
				{
				setState(968);
				timescale_directive();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Define_directiveContext extends ParserRuleContext {
		public TerminalNode TICK_DEFINE() { return getToken(VerilogParser.TICK_DEFINE, 0); }
		public TerminalNode MACRO_IDENTIFIER() { return getToken(VerilogParser.MACRO_IDENTIFIER, 0); }
		public TerminalNode MACRO_BODY() { return getToken(VerilogParser.MACRO_BODY, 0); }
		public Define_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterDefine_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitDefine_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitDefine_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Define_directiveContext define_directive() throws RecognitionException {
		Define_directiveContext _localctx = new Define_directiveContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_define_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(TICK_DEFINE);
			setState(972);
			match(MACRO_IDENTIFIER);
			setState(974);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MACRO_BODY) {
				{
				setState(973);
				match(MACRO_BODY);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Include_directiveContext extends ParserRuleContext {
		public TerminalNode TICK_INCLUDE() { return getToken(VerilogParser.TICK_INCLUDE, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(VerilogParser.STRING_LITERAL, 0); }
		public Include_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_include_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterInclude_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitInclude_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitInclude_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Include_directiveContext include_directive() throws RecognitionException {
		Include_directiveContext _localctx = new Include_directiveContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_include_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(976);
			match(TICK_INCLUDE);
			setState(977);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Timescale_directiveContext extends ParserRuleContext {
		public TerminalNode TICK_TIMESCALE() { return getToken(VerilogParser.TICK_TIMESCALE, 0); }
		public TerminalNode TIMESCALE_VALUE() { return getToken(VerilogParser.TIMESCALE_VALUE, 0); }
		public Timescale_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timescale_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterTimescale_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitTimescale_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitTimescale_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Timescale_directiveContext timescale_directive() throws RecognitionException {
		Timescale_directiveContext _localctx = new Timescale_directiveContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_timescale_directive);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(979);
			match(TICK_TIMESCALE);
			setState(980);
			match(TIMESCALE_VALUE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Ifdef_directiveContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(VerilogParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(VerilogParser.IDENTIFIER, i);
		}
		public TerminalNode TICK_ENDIF() { return getToken(VerilogParser.TICK_ENDIF, 0); }
		public TerminalNode TICK_IFDEF() { return getToken(VerilogParser.TICK_IFDEF, 0); }
		public TerminalNode TICK_IFNDEF() { return getToken(VerilogParser.TICK_IFNDEF, 0); }
		public List<Module_declarationContext> module_declaration() {
			return getRuleContexts(Module_declarationContext.class);
		}
		public Module_declarationContext module_declaration(int i) {
			return getRuleContext(Module_declarationContext.class,i);
		}
		public List<Compiler_directiveContext> compiler_directive() {
			return getRuleContexts(Compiler_directiveContext.class);
		}
		public Compiler_directiveContext compiler_directive(int i) {
			return getRuleContext(Compiler_directiveContext.class,i);
		}
		public List<TerminalNode> TICK_ELSIF() { return getTokens(VerilogParser.TICK_ELSIF); }
		public TerminalNode TICK_ELSIF(int i) {
			return getToken(VerilogParser.TICK_ELSIF, i);
		}
		public TerminalNode TICK_ELSE() { return getToken(VerilogParser.TICK_ELSE, 0); }
		public Ifdef_directiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifdef_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).enterIfdef_directive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VerilogParserListener ) ((VerilogParserListener)listener).exitIfdef_directive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VerilogParserVisitor ) return ((VerilogParserVisitor<? extends T>)visitor).visitIfdef_directive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ifdef_directiveContext ifdef_directive() throws RecognitionException {
		Ifdef_directiveContext _localctx = new Ifdef_directiveContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_ifdef_directive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(982);
			_la = _input.LA(1);
			if ( !(_la==TICK_IFDEF || _la==TICK_IFNDEF) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(983);
			match(IDENTIFIER);
			setState(988);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODULE || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 31L) != 0)) {
				{
				setState(986);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MODULE:
					{
					setState(984);
					module_declaration();
					}
					break;
				case TICK_TIMESCALE:
				case TICK_DEFINE:
				case TICK_INCLUDE:
				case TICK_IFDEF:
				case TICK_IFNDEF:
					{
					setState(985);
					compiler_directive();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(990);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1002);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TICK_ELSIF) {
				{
				{
				setState(991);
				match(TICK_ELSIF);
				setState(992);
				match(IDENTIFIER);
				setState(997);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MODULE || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 31L) != 0)) {
					{
					setState(995);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MODULE:
						{
						setState(993);
						module_declaration();
						}
						break;
					case TICK_TIMESCALE:
					case TICK_DEFINE:
					case TICK_INCLUDE:
					case TICK_IFDEF:
					case TICK_IFNDEF:
						{
						setState(994);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(999);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(1004);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TICK_ELSE) {
				{
				setState(1005);
				match(TICK_ELSE);
				setState(1010);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MODULE || ((((_la - 125)) & ~0x3f) == 0 && ((1L << (_la - 125)) & 31L) != 0)) {
					{
					setState(1008);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MODULE:
						{
						setState(1006);
						module_declaration();
						}
						break;
					case TICK_TIMESCALE:
					case TICK_DEFINE:
					case TICK_INCLUDE:
					case TICK_IFDEF:
					case TICK_IFNDEF:
						{
						setState(1007);
						compiler_directive();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(1012);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1015);
			match(TICK_ENDIF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return constant_expression_sempred((Constant_expressionContext)_localctx, predIndex);
		case 41:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean constant_expression_sempred(Constant_expressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u00d6\u03fa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0001\u0000\u0001\u0000\u0005\u0000\u00a7"+
		"\b\u0000\n\u0000\f\u0000\u00aa\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001\u00b1\b\u0001\u0001\u0001\u0003\u0001"+
		"\u00b4\b\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u00b8\b\u0001\n\u0001"+
		"\f\u0001\u00bb\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u00c4\b\u0002\n\u0002"+
		"\f\u0002\u00c7\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0003\u0003\u00cd\b\u0003\u0001\u0003\u0003\u0003\u00d0\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0005\u0004\u00da\b\u0004\n\u0004\f\u0004\u00dd\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u00e4\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00e8\b\u0006\u0001"+
		"\u0006\u0003\u0006\u00eb\b\u0006\u0001\u0006\u0003\u0006\u00ee\b\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u00f4\b\u0007"+
		"\u0001\u0007\u0003\u0007\u00f7\b\u0007\u0001\u0007\u0003\u0007\u00fa\b"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u0100\b\b\u0001"+
		"\b\u0003\b\u0103\b\b\u0001\b\u0003\b\u0106\b\b\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0118\b\t\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0121\b\n\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u0125\b\u000b\u0001\u000b\u0003\u000b\u0128\b\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0003"+
		"\f\u0130\b\f\u0001\f\u0003\f\u0133\b\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0003\r\u013b\b\r\u0001\r\u0003\r\u013e\b\r\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0003\u000e\u0144\b\u000e\u0001\u000e\u0003"+
		"\u000e\u0147\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0157\b\u0012\n"+
		"\u0012\f\u0012\u015a\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0003\u0014\u0163\b\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0003\u0016\u016d\b\u0016\u0001\u0016\u0001\u0016\u0005"+
		"\u0016\u0171\b\u0016\n\u0016\f\u0016\u0174\t\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0179\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0182\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0004\u0016"+
		"\u0189\b\u0016\u000b\u0016\f\u0016\u018a\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0192\b\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u0196\b\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u019a"+
		"\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003"+
		"\u0016\u01b3\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01bd\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u01c1\b\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u01cb\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u01d3\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0005\u001a\u01d9\b\u001a\n\u001a\f\u001a\u01dc\t\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u01e1\b\u001a\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01e8\b\u001b"+
		"\n\u001b\f\u001b\u01eb\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u01f3\b\u001b\n\u001b\f\u001b"+
		"\u01f6\t\u001b\u0005\u001b\u01f8\b\u001b\n\u001b\f\u001b\u01fb\t\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u0207\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u020d\b\u001c"+
		"\n\u001c\f\u001c\u0210\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u0219\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0220"+
		"\b\u001e\u0003\u001e\u0222\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0005\u001f\u0227\b\u001f\n\u001f\f\u001f\u022a\t\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0231\b\u001f\u0001"+
		"\u001f\u0003\u001f\u0234\b\u001f\u0001 \u0001 \u0003 \u0238\b \u0001!"+
		"\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0240\b!\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0005#\u0249\b#\n#\f#\u024c\t#\u0003#\u024e"+
		"\b#\u0001$\u0001$\u0001$\u0003$\u0253\b$\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0260\b\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u0268\b\'\u0003\'\u026a"+
		"\b\'\u0001(\u0001(\u0001(\u0005(\u026f\b(\n(\f(\u0272\t(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001"+
		"(\u0005(\u0280\b(\n(\f(\u0283\t(\u0003(\u0285\b(\u0001)\u0001)\u0001)"+
		"\u0001)\u0001)\u0003)\u028c\b)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0005"+
		")\u029d\b)\n)\f)\u02a0\t)\u0001*\u0001*\u0001*\u0003*\u02a5\b*\u0001*"+
		"\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u02ad\b*\u0001+\u0001+\u0001"+
		"+\u0001+\u0005+\u02b3\b+\n+\f+\u02b6\t+\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0003,\u02be\b,\u0001,\u0003,\u02c1\b,\u0001,\u0001,\u0001,\u0005"+
		",\u02c6\b,\n,\f,\u02c9\t,\u0001,\u0001,\u0001-\u0003-\u02ce\b-\u0001-"+
		"\u0001-\u0001-\u0001-\u0005-\u02d4\b-\n-\f-\u02d7\t-\u0001-\u0001-\u0001"+
		".\u0001.\u0003.\u02dd\b.\u0001/\u0001/\u0001/\u0003/\u02e2\b/\u00010\u0001"+
		"0\u00030\u02e6\b0\u00011\u00011\u00012\u00012\u00013\u00013\u00014\u0001"+
		"4\u00015\u00015\u00035\u02f2\b5\u00015\u00015\u00015\u00055\u02f7\b5\n"+
		"5\f5\u02fa\t5\u00015\u00015\u00015\u00016\u00016\u00016\u00016\u00016"+
		"\u00016\u00016\u00036\u0306\b6\u00016\u00016\u00017\u00017\u00037\u030c"+
		"\b7\u00017\u00037\u030f\b7\u00017\u00037\u0312\b7\u00017\u00017\u0001"+
		"7\u00017\u00017\u00047\u0319\b7\u000b7\f7\u031a\u00017\u00057\u031e\b"+
		"7\n7\f7\u0321\t7\u00017\u00017\u00017\u00018\u00018\u00018\u00018\u0001"+
		"8\u00038\u032b\b8\u00018\u00018\u00019\u00019\u00059\u0331\b9\n9\f9\u0334"+
		"\t9\u00019\u00019\u0001:\u0001:\u0001:\u0003:\u033b\b:\u0001;\u0001;\u0001"+
		";\u0001;\u0001;\u0001;\u0001;\u0003;\u0344\b;\u0001<\u0001<\u0001<\u0001"+
		"<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001<\u0001=\u0001=\u0001=\u0001"+
		"=\u0001=\u0001>\u0001>\u0001>\u0001>\u0001?\u0001?\u0003?\u035b\b?\u0001"+
		"?\u0001?\u0001?\u0005?\u0360\b?\n?\f?\u0363\t?\u0001?\u0001?\u0001@\u0001"+
		"@\u0001@\u0001@\u0001@\u0001A\u0001A\u0001A\u0005A\u036f\bA\nA\fA\u0372"+
		"\tA\u0001B\u0001B\u0001B\u0001B\u0001B\u0001B\u0001C\u0001C\u0001C\u0003"+
		"C\u037d\bC\u0001C\u0001C\u0001D\u0001D\u0001D\u0005D\u0384\bD\nD\fD\u0387"+
		"\tD\u0001E\u0001E\u0001E\u0001E\u0003E\u038d\bE\u0001E\u0001E\u0001F\u0001"+
		"F\u0001F\u0001F\u0001F\u0001F\u0001F\u0001F\u0003F\u0399\bF\u0001F\u0001"+
		"F\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0001G\u0003"+
		"G\u03a6\bG\u0001H\u0001H\u0001H\u0001H\u0001H\u0001H\u0003H\u03ae\bH\u0001"+
		"I\u0001I\u0001J\u0001J\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u03b9"+
		"\bK\u0001K\u0001K\u0001K\u0001K\u0001K\u0003K\u03c0\bK\u0003K\u03c2\b"+
		"K\u0001L\u0001L\u0001M\u0001M\u0001M\u0001M\u0003M\u03ca\bM\u0001N\u0001"+
		"N\u0001N\u0003N\u03cf\bN\u0001O\u0001O\u0001O\u0001P\u0001P\u0001P\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0005Q\u03db\bQ\nQ\fQ\u03de\tQ\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0005Q\u03e4\bQ\nQ\fQ\u03e7\tQ\u0005Q\u03e9\bQ\nQ\fQ\u03ec\t"+
		"Q\u0001Q\u0001Q\u0001Q\u0005Q\u03f1\bQ\nQ\fQ\u03f4\tQ\u0003Q\u03f6\bQ"+
		"\u0001Q\u0001Q\u0001Q\u0000\u00028RR\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDF"+
		"HJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u0000"+
		"\u000b\u0002\u0000GGmm\u0001\u0000\t\u000b\u0002\u0000::\u00b6\u00b6\u0002"+
		"\u0000\r\rDD\u0002\u0000\u0006\u000789\u0003\u000055==JK\u0005\u0000\u0002"+
		"\u00023366::op\u0003\u0000\u0096\u0099\u00a3\u00a4\u00a8\u00ac\u0004\u0000"+
		"\u008a\u0097\u00a3\u00a7\u00a9\u00aa\u00ac\u00ae\u0001\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0080\u0081\u044e\u0000\u00a8\u0001\u0000\u0000\u0000\u0002"+
		"\u00ad\u0001\u0000\u0000\u0000\u0004\u00be\u0001\u0000\u0000\u0000\u0006"+
		"\u00ca\u0001\u0000\u0000\u0000\b\u00d5\u0001\u0000\u0000\u0000\n\u00e3"+
		"\u0001\u0000\u0000\u0000\f\u00e5\u0001\u0000\u0000\u0000\u000e\u00f1\u0001"+
		"\u0000\u0000\u0000\u0010\u00fd\u0001\u0000\u0000\u0000\u0012\u0117\u0001"+
		"\u0000\u0000\u0000\u0014\u0120\u0001\u0000\u0000\u0000\u0016\u0122\u0001"+
		"\u0000\u0000\u0000\u0018\u012d\u0001\u0000\u0000\u0000\u001a\u0138\u0001"+
		"\u0000\u0000\u0000\u001c\u0141\u0001\u0000\u0000\u0000\u001e\u014a\u0001"+
		"\u0000\u0000\u0000 \u014d\u0001\u0000\u0000\u0000\"\u0150\u0001\u0000"+
		"\u0000\u0000$\u0153\u0001\u0000\u0000\u0000&\u015b\u0001\u0000\u0000\u0000"+
		"(\u0160\u0001\u0000\u0000\u0000*\u0166\u0001\u0000\u0000\u0000,\u01bc"+
		"\u0001\u0000\u0000\u0000.\u01c0\u0001\u0000\u0000\u00000\u01ca\u0001\u0000"+
		"\u0000\u00002\u01cc\u0001\u0000\u0000\u00004\u01e0\u0001\u0000\u0000\u0000"+
		"6\u01e2\u0001\u0000\u0000\u00008\u0206\u0001\u0000\u0000\u0000:\u0218"+
		"\u0001\u0000\u0000\u0000<\u021a\u0001\u0000\u0000\u0000>\u0233\u0001\u0000"+
		"\u0000\u0000@\u0237\u0001\u0000\u0000\u0000B\u0239\u0001\u0000\u0000\u0000"+
		"D\u0241\u0001\u0000\u0000\u0000F\u024d\u0001\u0000\u0000\u0000H\u0252"+
		"\u0001\u0000\u0000\u0000J\u0254\u0001\u0000\u0000\u0000L\u0257\u0001\u0000"+
		"\u0000\u0000N\u0269\u0001\u0000\u0000\u0000P\u0284\u0001\u0000\u0000\u0000"+
		"R\u028b\u0001\u0000\u0000\u0000T\u02ac\u0001\u0000\u0000\u0000V\u02ae"+
		"\u0001\u0000\u0000\u0000X\u02bd\u0001\u0000\u0000\u0000Z\u02cd\u0001\u0000"+
		"\u0000\u0000\\\u02da\u0001\u0000\u0000\u0000^\u02e1\u0001\u0000\u0000"+
		"\u0000`\u02e3\u0001\u0000\u0000\u0000b\u02e7\u0001\u0000\u0000\u0000d"+
		"\u02e9\u0001\u0000\u0000\u0000f\u02eb\u0001\u0000\u0000\u0000h\u02ed\u0001"+
		"\u0000\u0000\u0000j\u02ef\u0001\u0000\u0000\u0000l\u0305\u0001\u0000\u0000"+
		"\u0000n\u0309\u0001\u0000\u0000\u0000p\u032a\u0001\u0000\u0000\u0000r"+
		"\u032e\u0001\u0000\u0000\u0000t\u033a\u0001\u0000\u0000\u0000v\u033c\u0001"+
		"\u0000\u0000\u0000x\u0345\u0001\u0000\u0000\u0000z\u034f\u0001\u0000\u0000"+
		"\u0000|\u0354\u0001\u0000\u0000\u0000~\u0358\u0001\u0000\u0000\u0000\u0080"+
		"\u0366\u0001\u0000\u0000\u0000\u0082\u036b\u0001\u0000\u0000\u0000\u0084"+
		"\u0373\u0001\u0000\u0000\u0000\u0086\u0379\u0001\u0000\u0000\u0000\u0088"+
		"\u0380\u0001\u0000\u0000\u0000\u008a\u0388\u0001\u0000\u0000\u0000\u008c"+
		"\u0390\u0001\u0000\u0000\u0000\u008e\u03a5\u0001\u0000\u0000\u0000\u0090"+
		"\u03ad\u0001\u0000\u0000\u0000\u0092\u03af\u0001\u0000\u0000\u0000\u0094"+
		"\u03b1\u0001\u0000\u0000\u0000\u0096\u03c1\u0001\u0000\u0000\u0000\u0098"+
		"\u03c3\u0001\u0000\u0000\u0000\u009a\u03c9\u0001\u0000\u0000\u0000\u009c"+
		"\u03cb\u0001\u0000\u0000\u0000\u009e\u03d0\u0001\u0000\u0000\u0000\u00a0"+
		"\u03d3\u0001\u0000\u0000\u0000\u00a2\u03d6\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a7\u0003\u0002\u0001\u0000\u00a5\u00a7\u0003\u009aM\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u00aa"+
		"\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8"+
		"\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\u0000\u0000\u0001\u00ac\u0001"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u00052\u0000\u0000\u00ae\u00b0\u0005"+
		"\u00be\u0000\u0000\u00af\u00b1\u0003\u0004\u0002\u0000\u00b0\u00af\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b2\u00b4\u0003\b\u0004\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b9\u0005\u00b5\u0000\u0000\u00b6\u00b8\u0003\u0012"+
		"\t\u0000\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000"+
		"\u0000\u00b9\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005\u0017\u0000\u0000\u00bd\u0003\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0005\u00b1\u0000\u0000\u00bf\u00c0\u0005\u00b8\u0000"+
		"\u0000\u00c0\u00c5\u0003\u0006\u0003\u0000\u00c1\u00c2\u0005\u00b6\u0000"+
		"\u0000\u00c2\u00c4\u0003\u0006\u0003\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u00b9\u0000"+
		"\u0000\u00c9\u0005\u0001\u0000\u0000\u0000\u00ca\u00cc\u0005<\u0000\u0000"+
		"\u00cb\u00cd\u0005P\u0000\u0000\u00cc\u00cb\u0001\u0000\u0000\u0000\u00cc"+
		"\u00cd\u0001\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce"+
		"\u00d0\u0003\u008cF\u0000\u00cf\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2"+
		"\u0005\u00be\u0000\u0000\u00d2\u00d3\u0005\u00af\u0000\u0000\u00d3\u00d4"+
		"\u00038\u001c\u0000\u00d4\u0007\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"\u00b8\u0000\u0000\u00d6\u00db\u0003\n\u0005\u0000\u00d7\u00d8\u0005\u00b6"+
		"\u0000\u0000\u00d8\u00da\u0003\n\u0005\u0000\u00d9\u00d7\u0001\u0000\u0000"+
		"\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000"+
		"\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0005\u00b9\u0000"+
		"\u0000\u00df\t\u0001\u0000\u0000\u0000\u00e0\u00e4\u0003\f\u0006\u0000"+
		"\u00e1\u00e4\u0003\u000e\u0007\u0000\u00e2\u00e4\u0003\u0010\b\u0000\u00e3"+
		"\u00e0\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3"+
		"\u00e2\u0001\u0000\u0000\u0000\u00e4\u000b\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e7\u0005*\u0000\u0000\u00e6\u00e8\u0005m\u0000\u0000\u00e7\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00ea\u0001"+
		"\u0000\u0000\u0000\u00e9\u00eb\u0005P\u0000\u0000\u00ea\u00e9\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ee\u0003\u008cF\u0000\u00ed\u00ec\u0001\u0000\u0000"+
		"\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ef\u00f0\u0005\u00be\u0000\u0000\u00f0\r\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f3\u0005;\u0000\u0000\u00f2\u00f4\u0007\u0000\u0000\u0000\u00f3"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f7\u0005P\u0000\u0000\u00f6\u00f5"+
		"\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9"+
		"\u0001\u0000\u0000\u0000\u00f8\u00fa\u0003\u008cF\u0000\u00f9\u00f8\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fc\u0005\u00be\u0000\u0000\u00fc\u000f\u0001"+
		"\u0000\u0000\u0000\u00fd\u00ff\u0005)\u0000\u0000\u00fe\u0100\u0005m\u0000"+
		"\u0000\u00ff\u00fe\u0001\u0000\u0000\u0000\u00ff\u0100\u0001\u0000\u0000"+
		"\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u0103\u0005P\u0000\u0000"+
		"\u0102\u0101\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000"+
		"\u0103\u0105\u0001\u0000\u0000\u0000\u0104\u0106\u0003\u008cF\u0000\u0105"+
		"\u0104\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u00be\u0000\u0000\u0108"+
		"\u0011\u0001\u0000\u0000\u0000\u0109\u010a\u0003\u0014\n\u0000\u010a\u010b"+
		"\u0005\u00b5\u0000\u0000\u010b\u0118\u0001\u0000\u0000\u0000\u010c\u0118"+
		"\u0003X,\u0000\u010d\u010e\u0003&\u0013\u0000\u010e\u010f\u0005\u00b5"+
		"\u0000\u0000\u010f\u0118\u0001\u0000\u0000\u0000\u0110\u0118\u0003(\u0014"+
		"\u0000\u0111\u0118\u0003*\u0015\u0000\u0112\u0118\u0003j5\u0000\u0113"+
		"\u0118\u0003n7\u0000\u0114\u0118\u0003r9\u0000\u0115\u0118\u0003~?\u0000"+
		"\u0116\u0118\u0003\u009aM\u0000\u0117\u0109\u0001\u0000\u0000\u0000\u0117"+
		"\u010c\u0001\u0000\u0000\u0000\u0117\u010d\u0001\u0000\u0000\u0000\u0117"+
		"\u0110\u0001\u0000\u0000\u0000\u0117\u0111\u0001\u0000\u0000\u0000\u0117"+
		"\u0112\u0001\u0000\u0000\u0000\u0117\u0113\u0001\u0000\u0000\u0000\u0117"+
		"\u0114\u0001\u0000\u0000\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117"+
		"\u0116\u0001\u0000\u0000\u0000\u0118\u0013\u0001\u0000\u0000\u0000\u0119"+
		"\u0121\u0003\u0016\u000b\u0000\u011a\u0121\u0003\u0018\f\u0000\u011b\u0121"+
		"\u0003\u001a\r\u0000\u011c\u0121\u0003\u001c\u000e\u0000\u011d\u0121\u0003"+
		"\u001e\u000f\u0000\u011e\u0121\u0003 \u0010\u0000\u011f\u0121\u0003\""+
		"\u0011\u0000\u0120\u0119\u0001\u0000\u0000\u0000\u0120\u011a\u0001\u0000"+
		"\u0000\u0000\u0120\u011b\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000"+
		"\u0000\u0000\u0120\u011d\u0001\u0000\u0000\u0000\u0120\u011e\u0001\u0000"+
		"\u0000\u0000\u0120\u011f\u0001\u0000\u0000\u0000\u0121\u0015\u0001\u0000"+
		"\u0000\u0000\u0122\u0124\u0005<\u0000\u0000\u0123\u0125\u0005P\u0000\u0000"+
		"\u0124\u0123\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000"+
		"\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0128\u0003\u008cF\u0000\u0127"+
		"\u0126\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000\u0128"+
		"\u0129\u0001\u0000\u0000\u0000\u0129\u012a\u0003$\u0012\u0000\u012a\u012b"+
		"\u0005\u00af\u0000\u0000\u012b\u012c\u00038\u001c\u0000\u012c\u0017\u0001"+
		"\u0000\u0000\u0000\u012d\u012f\u0005/\u0000\u0000\u012e\u0130\u0005P\u0000"+
		"\u0000\u012f\u012e\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000"+
		"\u0000\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u0133\u0003\u008cF\u0000"+
		"\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u0135\u0003$\u0012\u0000\u0135"+
		"\u0136\u0005\u00af\u0000\u0000\u0136\u0137\u00038\u001c\u0000\u0137\u0019"+
		"\u0001\u0000\u0000\u0000\u0138\u013a\u0005G\u0000\u0000\u0139\u013b\u0005"+
		"P\u0000\u0000\u013a\u0139\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u013e\u0003\u008c"+
		"F\u0000\u013d\u013c\u0001\u0000\u0000\u0000\u013d\u013e\u0001\u0000\u0000"+
		"\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140\u0003$\u0012\u0000"+
		"\u0140\u001b\u0001\u0000\u0000\u0000\u0141\u0143\u0005m\u0000\u0000\u0142"+
		"\u0144\u0005P\u0000\u0000\u0143\u0142\u0001\u0000\u0000\u0000\u0143\u0144"+
		"\u0001\u0000\u0000\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0147"+
		"\u0003\u008cF\u0000\u0146\u0145\u0001\u0000\u0000\u0000\u0146\u0147\u0001"+
		"\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0149\u0003"+
		"$\u0012\u0000\u0149\u001d\u0001\u0000\u0000\u0000\u014a\u014b\u0005+\u0000"+
		"\u0000\u014b\u014c\u0003$\u0012\u0000\u014c\u001f\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0005E\u0000\u0000\u014e\u014f\u0003$\u0012\u0000\u014f!"+
		"\u0001\u0000\u0000\u0000\u0150\u0151\u0005[\u0000\u0000\u0151\u0152\u0003"+
		"$\u0012\u0000\u0152#\u0001\u0000\u0000\u0000\u0153\u0158\u0005\u00be\u0000"+
		"\u0000\u0154\u0155\u0005\u00b6\u0000\u0000\u0155\u0157\u0005\u00be\u0000"+
		"\u0000\u0156\u0154\u0001\u0000\u0000\u0000\u0157\u015a\u0001\u0000\u0000"+
		"\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0159\u0001\u0000\u0000"+
		"\u0000\u0159%\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0005\u0003\u0000\u0000\u015c\u015d\u00034\u001a\u0000\u015d"+
		"\u015e\u0005\u00af\u0000\u0000\u015e\u015f\u0003R)\u0000\u015f\'\u0001"+
		"\u0000\u0000\u0000\u0160\u0162\u0005\u0001\u0000\u0000\u0161\u0163\u0003"+
		"B!\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0162\u0163\u0001\u0000\u0000"+
		"\u0000\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0165\u0003.\u0017\u0000"+
		"\u0165)\u0001\u0000\u0000\u0000\u0166\u0167\u0005(\u0000\u0000\u0167\u0168"+
		"\u0003,\u0016\u0000\u0168+\u0001\u0000\u0000\u0000\u0169\u016c\u0005\b"+
		"\u0000\u0000\u016a\u016b\u0005\u00b4\u0000\u0000\u016b\u016d\u0005\u00be"+
		"\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000\u016c\u016d\u0001\u0000"+
		"\u0000\u0000\u016d\u0172\u0001\u0000\u0000\u0000\u016e\u0171\u0003,\u0016"+
		"\u0000\u016f\u0171\u0003\u009aM\u0000\u0170\u016e\u0001\u0000\u0000\u0000"+
		"\u0170\u016f\u0001\u0000\u0000\u0000\u0171\u0174\u0001\u0000\u0000\u0000"+
		"\u0172\u0170\u0001\u0000\u0000\u0000\u0172\u0173\u0001\u0000\u0000\u0000"+
		"\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0175\u0178\u0005\u0014\u0000\u0000\u0176\u0177\u0005\u00b4\u0000\u0000"+
		"\u0177\u0179\u0005\u00be\u0000\u0000\u0178\u0176\u0001\u0000\u0000\u0000"+
		"\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u01bd\u0001\u0000\u0000\u0000"+
		"\u017a\u017b\u0005\'\u0000\u0000\u017b\u017c\u0005\u00b8\u0000\u0000\u017c"+
		"\u017d\u0003R)\u0000\u017d\u017e\u0005\u00b9\u0000\u0000\u017e\u0181\u0003"+
		".\u0017\u0000\u017f\u0180\u0005\u0013\u0000\u0000\u0180\u0182\u0003.\u0017"+
		"\u0000\u0181\u017f\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0182\u01bd\u0001\u0000\u0000\u0000\u0183\u0184\u0007\u0001\u0000"+
		"\u0000\u0184\u0185\u0005\u00b8\u0000\u0000\u0185\u0186\u0003R)\u0000\u0186"+
		"\u0188\u0005\u00b9\u0000\u0000\u0187\u0189\u0003>\u001f\u0000\u0188\u0187"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u0188"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0001\u0000\u0000\u0000\u018c\u018d\u0005\u0015\u0000\u0000\u018d\u01bd"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\u0005\u001e\u0000\u0000\u018f\u0191"+
		"\u0005\u00b8\u0000\u0000\u0190\u0192\u00032\u0019\u0000\u0191\u0190\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192\u0193\u0001"+
		"\u0000\u0000\u0000\u0193\u0195\u0005\u00b5\u0000\u0000\u0194\u0196\u0003"+
		"R)\u0000\u0195\u0194\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000"+
		"\u0000\u0196\u0197\u0001\u0000\u0000\u0000\u0197\u0199\u0005\u00b5\u0000"+
		"\u0000\u0198\u019a\u00032\u0019\u0000\u0199\u0198\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019b\u0001\u0000\u0000\u0000"+
		"\u019b\u019c\u0005\u00b9\u0000\u0000\u019c\u01bd\u0003,\u0016\u0000\u019d"+
		"\u019e\u0005I\u0000\u0000\u019e\u019f\u0005\u00b8\u0000\u0000\u019f\u01a0"+
		"\u0003R)\u0000\u01a0\u01a1\u0005\u00b9\u0000\u0000\u01a1\u01a2\u0003,"+
		"\u0016\u0000\u01a2\u01bd\u0001\u0000\u0000\u0000\u01a3\u01a4\u0005l\u0000"+
		"\u0000\u01a4\u01a5\u0005\u00b8\u0000\u0000\u01a5\u01a6\u0003R)\u0000\u01a6"+
		"\u01a7\u0005\u00b9\u0000\u0000\u01a7\u01a8\u0003,\u0016\u0000\u01a8\u01bd"+
		"\u0001\u0000\u0000\u0000\u01a9\u01aa\u0005 \u0000\u0000\u01aa\u01bd\u0003"+
		",\u0016\u0000\u01ab\u01ac\u0005h\u0000\u0000\u01ac\u01ad\u0005\u00b8\u0000"+
		"\u0000\u01ad\u01ae\u0003R)\u0000\u01ae\u01af\u0005\u00b9\u0000\u0000\u01af"+
		"\u01b0\u0003.\u0017\u0000\u01b0\u01bd\u0001\u0000\u0000\u0000\u01b1\u01b3"+
		"\u0003@ \u0000\u01b2\u01b1\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b5\u00030\u0018"+
		"\u0000\u01b5\u01b6\u0005\u00b5\u0000\u0000\u01b6\u01bd\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b8\u0003N\'\u0000\u01b8\u01b9\u0005\u00b5\u0000\u0000"+
		"\u01b9\u01bd\u0001\u0000\u0000\u0000\u01ba\u01bd\u0003\u009aM\u0000\u01bb"+
		"\u01bd\u0005\u00b5\u0000\u0000\u01bc\u0169\u0001\u0000\u0000\u0000\u01bc"+
		"\u017a\u0001\u0000\u0000\u0000\u01bc\u0183\u0001\u0000\u0000\u0000\u01bc"+
		"\u018e\u0001\u0000\u0000\u0000\u01bc\u019d\u0001\u0000\u0000\u0000\u01bc"+
		"\u01a3\u0001\u0000\u0000\u0000\u01bc\u01a9\u0001\u0000\u0000\u0000\u01bc"+
		"\u01ab\u0001\u0000\u0000\u0000\u01bc\u01b2\u0001\u0000\u0000\u0000\u01bc"+
		"\u01b7\u0001\u0000\u0000\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc"+
		"\u01bb\u0001\u0000\u0000\u0000\u01bd-\u0001\u0000\u0000\u0000\u01be\u01c1"+
		"\u0003,\u0016\u0000\u01bf\u01c1\u0005\u00b5\u0000\u0000\u01c0\u01be\u0001"+
		"\u0000\u0000\u0000\u01c0\u01bf\u0001\u0000\u0000\u0000\u01c1/\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c3\u00034\u001a\u0000\u01c3\u01c4\u0005\u00af\u0000"+
		"\u0000\u01c4\u01c5\u0003R)\u0000\u01c5\u01cb\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u00034\u001a\u0000\u01c7\u01c8\u0005\u0094\u0000\u0000\u01c8\u01c9"+
		"\u0003R)\u0000\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c2\u0001\u0000"+
		"\u0000\u0000\u01ca\u01c6\u0001\u0000\u0000\u0000\u01cb1\u0001\u0000\u0000"+
		"\u0000\u01cc\u01cd\u00034\u001a\u0000\u01cd\u01ce\u0005\u00af\u0000\u0000"+
		"\u01ce\u01cf\u0003R)\u0000\u01cf3\u0001\u0000\u0000\u0000\u01d0\u01d2"+
		"\u0005\u00be\u0000\u0000\u01d1\u01d3\u0003\u008cF\u0000\u01d2\u01d1\u0001"+
		"\u0000\u0000\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01e1\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0005\u00bc\u0000\u0000\u01d5\u01da\u0003"+
		"4\u001a\u0000\u01d6\u01d7\u0005\u00b6\u0000\u0000\u01d7\u01d9\u00034\u001a"+
		"\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01dc\u0001\u0000\u0000"+
		"\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000\u0000"+
		"\u0000\u01db\u01dd\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000"+
		"\u0000\u01dd\u01de\u0005\u00bd\u0000\u0000\u01de\u01e1\u0001\u0000\u0000"+
		"\u0000\u01df\u01e1\u00036\u001b\u0000\u01e0\u01d0\u0001\u0000\u0000\u0000"+
		"\u01e0\u01d4\u0001\u0000\u0000\u0000\u01e0\u01df\u0001\u0000\u0000\u0000"+
		"\u01e15\u0001\u0000\u0000\u0000\u01e2\u01e9\u0005\u00be\u0000\u0000\u01e3"+
		"\u01e4\u0005\u00ba\u0000\u0000\u01e4\u01e5\u0003R)\u0000\u01e5\u01e6\u0005"+
		"\u00bb\u0000\u0000\u01e6\u01e8\u0001\u0000\u0000\u0000\u01e7\u01e3\u0001"+
		"\u0000\u0000\u0000\u01e8\u01eb\u0001\u0000\u0000\u0000\u01e9\u01e7\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0001\u0000\u0000\u0000\u01ea\u01f9\u0001"+
		"\u0000\u0000\u0000\u01eb\u01e9\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005"+
		"\u00b7\u0000\u0000\u01ed\u01f4\u0005\u00be\u0000\u0000\u01ee\u01ef\u0005"+
		"\u00ba\u0000\u0000\u01ef\u01f0\u0003R)\u0000\u01f0\u01f1\u0005\u00bb\u0000"+
		"\u0000\u01f1\u01f3\u0001\u0000\u0000\u0000\u01f2\u01ee\u0001\u0000\u0000"+
		"\u0000\u01f3\u01f6\u0001\u0000\u0000\u0000\u01f4\u01f2\u0001\u0000\u0000"+
		"\u0000\u01f4\u01f5\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000"+
		"\u0000\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f7\u01ec\u0001\u0000\u0000"+
		"\u0000\u01f8\u01fb\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01fa7\u0001\u0000\u0000\u0000"+
		"\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fc\u01fd\u0006\u001c\uffff\uffff"+
		"\u0000\u01fd\u0207\u0003\u0098L\u0000\u01fe\u0207\u0005\u00be\u0000\u0000"+
		"\u01ff\u0200\u0003\u0092I\u0000\u0200\u0201\u00038\u001c\u0003\u0201\u0207"+
		"\u0001\u0000\u0000\u0000\u0202\u0203\u0005\u00b8\u0000\u0000\u0203\u0204"+
		"\u00038\u001c\u0000\u0204\u0205\u0005\u00b9\u0000\u0000\u0205\u0207\u0001"+
		"\u0000\u0000\u0000\u0206\u01fc\u0001\u0000\u0000\u0000\u0206\u01fe\u0001"+
		"\u0000\u0000\u0000\u0206\u01ff\u0001\u0000\u0000\u0000\u0206\u0202\u0001"+
		"\u0000\u0000\u0000\u0207\u020e\u0001\u0000\u0000\u0000\u0208\u0209\n\u0002"+
		"\u0000\u0000\u0209\u020a\u0003\u0094J\u0000\u020a\u020b\u00038\u001c\u0003"+
		"\u020b\u020d\u0001\u0000\u0000\u0000\u020c\u0208\u0001\u0000\u0000\u0000"+
		"\u020d\u0210\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000"+
		"\u020e\u020f\u0001\u0000\u0000\u0000\u020f9\u0001\u0000\u0000\u0000\u0210"+
		"\u020e\u0001\u0000\u0000\u0000\u0211\u0212\u0005\u00b1\u0000\u0000\u0212"+
		"\u0219\u0003\u0090H\u0000\u0213\u0214\u0005\u00b1\u0000\u0000\u0214\u0215"+
		"\u0005\u00b8\u0000\u0000\u0215\u0216\u0003<\u001e\u0000\u0216\u0217\u0005"+
		"\u00b9\u0000\u0000\u0217\u0219\u0001\u0000\u0000\u0000\u0218\u0211\u0001"+
		"\u0000\u0000\u0000\u0218\u0213\u0001\u0000\u0000\u0000\u0219;\u0001\u0000"+
		"\u0000\u0000\u021a\u0221\u0003R)\u0000\u021b\u021c\u0005\u00b4\u0000\u0000"+
		"\u021c\u021f\u0003R)\u0000\u021d\u021e\u0005\u00b4\u0000\u0000\u021e\u0220"+
		"\u0003R)\u0000\u021f\u021d\u0001\u0000\u0000\u0000\u021f\u0220\u0001\u0000"+
		"\u0000\u0000\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u021b\u0001\u0000"+
		"\u0000\u0000\u0221\u0222\u0001\u0000\u0000\u0000\u0222=\u0001\u0000\u0000"+
		"\u0000\u0223\u0228\u0003R)\u0000\u0224\u0225\u0005\u00b6\u0000\u0000\u0225"+
		"\u0227\u0003R)\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0227\u022a\u0001"+
		"\u0000\u0000\u0000\u0228\u0226\u0001\u0000\u0000\u0000\u0228\u0229\u0001"+
		"\u0000\u0000\u0000\u0229\u022b\u0001\u0000\u0000\u0000\u022a\u0228\u0001"+
		"\u0000\u0000\u0000\u022b\u022c\u0005\u00b4\u0000\u0000\u022c\u022d\u0003"+
		".\u0017\u0000\u022d\u0234\u0001\u0000\u0000\u0000\u022e\u0230\u0005\u000f"+
		"\u0000\u0000\u022f\u0231\u0005\u00b4\u0000\u0000\u0230\u022f\u0001\u0000"+
		"\u0000\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231\u0232\u0001\u0000"+
		"\u0000\u0000\u0232\u0234\u0003.\u0017\u0000\u0233\u0223\u0001\u0000\u0000"+
		"\u0000\u0233\u022e\u0001\u0000\u0000\u0000\u0234?\u0001\u0000\u0000\u0000"+
		"\u0235\u0238\u0003B!\u0000\u0236\u0238\u0003D\"\u0000\u0237\u0235\u0001"+
		"\u0000\u0000\u0000\u0237\u0236\u0001\u0000\u0000\u0000\u0238A\u0001\u0000"+
		"\u0000\u0000\u0239\u023f\u0005\u00b0\u0000\u0000\u023a\u023b\u0005\u00b8"+
		"\u0000\u0000\u023b\u023c\u0003F#\u0000\u023c\u023d\u0005\u00b9\u0000\u0000"+
		"\u023d\u0240\u0001\u0000\u0000\u0000\u023e\u0240\u0003H$\u0000\u023f\u023a"+
		"\u0001\u0000\u0000\u0000\u023f\u023e\u0001\u0000\u0000\u0000\u0240C\u0001"+
		"\u0000\u0000\u0000\u0241\u0242\u0005\u00b1\u0000\u0000\u0242\u0243\u0003"+
		"\u0090H\u0000\u0243E\u0001\u0000\u0000\u0000\u0244\u024e\u0005\u00a5\u0000"+
		"\u0000\u0245\u024a\u0003H$\u0000\u0246\u0247\u0007\u0002\u0000\u0000\u0247"+
		"\u0249\u0003H$\u0000\u0248\u0246\u0001\u0000\u0000\u0000\u0249\u024c\u0001"+
		"\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024a\u024b\u0001"+
		"\u0000\u0000\u0000\u024b\u024e\u0001\u0000\u0000\u0000\u024c\u024a\u0001"+
		"\u0000\u0000\u0000\u024d\u0244\u0001\u0000\u0000\u0000\u024d\u0245\u0001"+
		"\u0000\u0000\u0000\u024eG\u0001\u0000\u0000\u0000\u024f\u0253\u0003J%"+
		"\u0000\u0250\u0253\u0003L&\u0000\u0251\u0253\u00036\u001b\u0000\u0252"+
		"\u024f\u0001\u0000\u0000\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252"+
		"\u0251\u0001\u0000\u0000\u0000\u0253I\u0001\u0000\u0000\u0000\u0254\u0255"+
		"\u0005>\u0000\u0000\u0255\u0256\u00036\u001b\u0000\u0256K\u0001\u0000"+
		"\u0000\u0000\u0257\u0258\u00054\u0000\u0000\u0258\u0259\u00036\u001b\u0000"+
		"\u0259M\u0001\u0000\u0000\u0000\u025a\u025f\u0005\u00be\u0000\u0000\u025b"+
		"\u025c\u0005\u00b8\u0000\u0000\u025c\u025d\u0003P(\u0000\u025d\u025e\u0005"+
		"\u00b9\u0000\u0000\u025e\u0260\u0001\u0000\u0000\u0000\u025f\u025b\u0001"+
		"\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260\u026a\u0001"+
		"\u0000\u0000\u0000\u0261\u0262\u0005\u00b2\u0000\u0000\u0262\u0267\u0005"+
		"\u00be\u0000\u0000\u0263\u0264\u0005\u00b8\u0000\u0000\u0264\u0265\u0003"+
		"P(\u0000\u0265\u0266\u0005\u00b9\u0000\u0000\u0266\u0268\u0001\u0000\u0000"+
		"\u0000\u0267\u0263\u0001\u0000\u0000\u0000\u0267\u0268\u0001\u0000\u0000"+
		"\u0000\u0268\u026a\u0001\u0000\u0000\u0000\u0269\u025a\u0001\u0000\u0000"+
		"\u0000\u0269\u0261\u0001\u0000\u0000\u0000\u026aO\u0001\u0000\u0000\u0000"+
		"\u026b\u0270\u0003R)\u0000\u026c\u026d\u0005\u00b6\u0000\u0000\u026d\u026f"+
		"\u0003R)\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026f\u0272\u0001\u0000"+
		"\u0000\u0000\u0270\u026e\u0001\u0000\u0000\u0000\u0270\u0271\u0001\u0000"+
		"\u0000\u0000\u0271\u0285\u0001\u0000\u0000\u0000\u0272\u0270\u0001\u0000"+
		"\u0000\u0000\u0273\u0274\u0005\u00b7\u0000\u0000\u0274\u0275\u0005\u00be"+
		"\u0000\u0000\u0275\u0276\u0005\u00b8\u0000\u0000\u0276\u0277\u0003R)\u0000"+
		"\u0277\u0281\u0005\u00b9\u0000\u0000\u0278\u0279\u0005\u00b6\u0000\u0000"+
		"\u0279\u027a\u0005\u00b7\u0000\u0000\u027a\u027b\u0005\u00be\u0000\u0000"+
		"\u027b\u027c\u0005\u00b8\u0000\u0000\u027c\u027d\u0003R)\u0000\u027d\u027e"+
		"\u0005\u00b9\u0000\u0000\u027e\u0280\u0001\u0000\u0000\u0000\u027f\u0278"+
		"\u0001\u0000\u0000\u0000\u0280\u0283\u0001\u0000\u0000\u0000\u0281\u027f"+
		"\u0001\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0285"+
		"\u0001\u0000\u0000\u0000\u0283\u0281\u0001\u0000\u0000\u0000\u0284\u026b"+
		"\u0001\u0000\u0000\u0000\u0284\u0273\u0001\u0000\u0000\u0000\u0285Q\u0001"+
		"\u0000\u0000\u0000\u0286\u0287\u0006)\uffff\uffff\u0000\u0287\u0288\u0003"+
		"\u0092I\u0000\u0288\u0289\u0003R)\u0002\u0289\u028c\u0001\u0000\u0000"+
		"\u0000\u028a\u028c\u0003T*\u0000\u028b\u0286\u0001\u0000\u0000\u0000\u028b"+
		"\u028a\u0001\u0000\u0000\u0000\u028c\u029e\u0001\u0000\u0000\u0000\u028d"+
		"\u028e\n\u0004\u0000\u0000\u028e\u028f\u0003\u0094J\u0000\u028f\u0290"+
		"\u0003R)\u0005\u0290\u029d\u0001\u0000\u0000\u0000\u0291\u0292\n\u0003"+
		"\u0000\u0000\u0292\u0293\u0005\u00b3\u0000\u0000\u0293\u0294\u0003R)\u0000"+
		"\u0294\u0295\u0005\u00b4\u0000\u0000\u0295\u0296\u0003R)\u0004\u0296\u029d"+
		"\u0001\u0000\u0000\u0000\u0297\u0298\n\u0005\u0000\u0000\u0298\u0299\u0005"+
		"\u00bc\u0000\u0000\u0299\u029a\u0003R)\u0000\u029a\u029b\u0005\u00bd\u0000"+
		"\u0000\u029b\u029d\u0001\u0000\u0000\u0000\u029c\u028d\u0001\u0000\u0000"+
		"\u0000\u029c\u0291\u0001\u0000\u0000\u0000\u029c\u0297\u0001\u0000\u0000"+
		"\u0000\u029d\u02a0\u0001\u0000\u0000\u0000\u029e\u029c\u0001\u0000\u0000"+
		"\u0000\u029e\u029f\u0001\u0000\u0000\u0000\u029fS\u0001\u0000\u0000\u0000"+
		"\u02a0\u029e\u0001\u0000\u0000\u0000\u02a1\u02ad\u0003\u0098L\u0000\u02a2"+
		"\u02a4\u0005\u00be\u0000\u0000\u02a3\u02a5\u0003\u008cF\u0000\u02a4\u02a3"+
		"\u0001\u0000\u0000\u0000\u02a4\u02a5\u0001\u0000\u0000\u0000\u02a5\u02ad"+
		"\u0001\u0000\u0000\u0000\u02a6\u02ad\u0003V+\u0000\u02a7\u02ad\u0003\u0096"+
		"K\u0000\u02a8\u02a9\u0005\u00b8\u0000\u0000\u02a9\u02aa\u0003R)\u0000"+
		"\u02aa\u02ab\u0005\u00b9\u0000\u0000\u02ab\u02ad\u0001\u0000\u0000\u0000"+
		"\u02ac\u02a1\u0001\u0000\u0000\u0000\u02ac\u02a2\u0001\u0000\u0000\u0000"+
		"\u02ac\u02a6\u0001\u0000\u0000\u0000\u02ac\u02a7\u0001\u0000\u0000\u0000"+
		"\u02ac\u02a8\u0001\u0000\u0000\u0000\u02adU\u0001\u0000\u0000\u0000\u02ae"+
		"\u02af\u0005\u00bc\u0000\u0000\u02af\u02b4\u0003R)\u0000\u02b0\u02b1\u0005"+
		"\u00b6\u0000\u0000\u02b1\u02b3\u0003R)\u0000\u02b2\u02b0\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b6\u0001\u0000\u0000\u0000\u02b4\u02b2\u0001\u0000\u0000"+
		"\u0000\u02b4\u02b5\u0001\u0000\u0000\u0000\u02b5\u02b7\u0001\u0000\u0000"+
		"\u0000\u02b6\u02b4\u0001\u0000\u0000\u0000\u02b7\u02b8\u0005\u00bd\u0000"+
		"\u0000\u02b8W\u0001\u0000\u0000\u0000\u02b9\u02be\u0003b1\u0000\u02ba"+
		"\u02be\u0003d2\u0000\u02bb\u02be\u0003f3\u0000\u02bc\u02be\u0003h4\u0000"+
		"\u02bd\u02b9\u0001\u0000\u0000\u0000\u02bd\u02ba\u0001\u0000\u0000\u0000"+
		"\u02bd\u02bb\u0001\u0000\u0000\u0000\u02bd\u02bc\u0001\u0000\u0000\u0000"+
		"\u02be\u02c0\u0001\u0000\u0000\u0000\u02bf\u02c1\u0003:\u001d\u0000\u02c0"+
		"\u02bf\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000\u02c1"+
		"\u02c2\u0001\u0000\u0000\u0000\u02c2\u02c7\u0003Z-\u0000\u02c3\u02c4\u0005"+
		"\u00b6\u0000\u0000\u02c4\u02c6\u0003Z-\u0000\u02c5\u02c3\u0001\u0000\u0000"+
		"\u0000\u02c6\u02c9\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000"+
		"\u0000\u02c7\u02c8\u0001\u0000\u0000\u0000\u02c8\u02ca\u0001\u0000\u0000"+
		"\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02ca\u02cb\u0005\u00b5\u0000"+
		"\u0000\u02cbY\u0001\u0000\u0000\u0000\u02cc\u02ce\u0003\\.\u0000\u02cd"+
		"\u02cc\u0001\u0000\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce"+
		"\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d0\u0005\u00b8\u0000\u0000\u02d0"+
		"\u02d5\u0003^/\u0000\u02d1\u02d2\u0005\u00b6\u0000\u0000\u02d2\u02d4\u0003"+
		"^/\u0000\u02d3\u02d1\u0001\u0000\u0000\u0000\u02d4\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d5\u02d3\u0001\u0000\u0000\u0000\u02d5\u02d6\u0001\u0000\u0000"+
		"\u0000\u02d6\u02d8\u0001\u0000\u0000\u0000\u02d7\u02d5\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d9\u0005\u00b9\u0000\u0000\u02d9[\u0001\u0000\u0000\u0000"+
		"\u02da\u02dc\u0005\u00be\u0000\u0000\u02db\u02dd\u0003\u008cF\u0000\u02dc"+
		"\u02db\u0001\u0000\u0000\u0000\u02dc\u02dd\u0001\u0000\u0000\u0000\u02dd"+
		"]\u0001\u0000\u0000\u0000\u02de\u02e2\u0003`0\u0000\u02df\u02e2\u0003"+
		"6\u001b\u0000\u02e0\u02e2\u00038\u001c\u0000\u02e1\u02de\u0001\u0000\u0000"+
		"\u0000\u02e1\u02df\u0001\u0000\u0000\u0000\u02e1\u02e0\u0001\u0000\u0000"+
		"\u0000\u02e2_\u0001\u0000\u0000\u0000\u02e3\u02e5\u0005\u00be\u0000\u0000"+
		"\u02e4\u02e6\u0003\u008cF\u0000\u02e5\u02e4\u0001\u0000\u0000\u0000\u02e5"+
		"\u02e6\u0001\u0000\u0000\u0000\u02e6a\u0001\u0000\u0000\u0000\u02e7\u02e8"+
		"\u0007\u0003\u0000\u0000\u02e8c\u0001\u0000\u0000\u0000\u02e9\u02ea\u0007"+
		"\u0004\u0000\u0000\u02eae\u0001\u0000\u0000\u0000\u02eb\u02ec\u0007\u0005"+
		"\u0000\u0000\u02ecg\u0001\u0000\u0000\u0000\u02ed\u02ee\u0007\u0006\u0000"+
		"\u0000\u02eei\u0001\u0000\u0000\u0000\u02ef\u02f1\u0005Z\u0000\u0000\u02f0"+
		"\u02f2\u0005\u0004\u0000\u0000\u02f1\u02f0\u0001\u0000\u0000\u0000\u02f1"+
		"\u02f2\u0001\u0000\u0000\u0000\u02f2\u02f3\u0001\u0000\u0000\u0000\u02f3"+
		"\u02f4\u0005\u00be\u0000\u0000\u02f4\u02f8\u0005\u00b5\u0000\u0000\u02f5"+
		"\u02f7\u0003l6\u0000\u02f6\u02f5\u0001\u0000\u0000\u0000\u02f7\u02fa\u0001"+
		"\u0000\u0000\u0000\u02f8\u02f6\u0001\u0000\u0000\u0000\u02f8\u02f9\u0001"+
		"\u0000\u0000\u0000\u02f9\u02fb\u0001\u0000\u0000\u0000\u02fa\u02f8\u0001"+
		"\u0000\u0000\u0000\u02fb\u02fc\u0003,\u0016\u0000\u02fc\u02fd\u0005\u001c"+
		"\u0000\u0000\u02fdk\u0001\u0000\u0000\u0000\u02fe\u0306\u0003\f\u0006"+
		"\u0000\u02ff\u0306\u0003\u000e\u0007\u0000\u0300\u0306\u0003\u0010\b\u0000"+
		"\u0301\u0306\u0003\u001a\r\u0000\u0302\u0306\u0003\u001e\u000f\u0000\u0303"+
		"\u0306\u0003\"\u0011\u0000\u0304\u0306\u0003\u0018\f\u0000\u0305\u02fe"+
		"\u0001\u0000\u0000\u0000\u0305\u02ff\u0001\u0000\u0000\u0000\u0305\u0300"+
		"\u0001\u0000\u0000\u0000\u0305\u0301\u0001\u0000\u0000\u0000\u0305\u0302"+
		"\u0001\u0000\u0000\u0000\u0305\u0303\u0001\u0000\u0000\u0000\u0305\u0304"+
		"\u0001\u0000\u0000\u0000\u0306\u0307\u0001\u0000\u0000\u0000\u0307\u0308"+
		"\u0005\u00b5\u0000\u0000\u0308m\u0001\u0000\u0000\u0000\u0309\u030b\u0005"+
		"\"\u0000\u0000\u030a\u030c\u0005\u0004\u0000\u0000\u030b\u030a\u0001\u0000"+
		"\u0000\u0000\u030b\u030c\u0001\u0000\u0000\u0000\u030c\u030e\u0001\u0000"+
		"\u0000\u0000\u030d\u030f\u0005P\u0000\u0000\u030e\u030d\u0001\u0000\u0000"+
		"\u0000\u030e\u030f\u0001\u0000\u0000\u0000\u030f\u0311\u0001\u0000\u0000"+
		"\u0000\u0310\u0312\u0003\u008cF\u0000\u0311\u0310\u0001\u0000\u0000\u0000"+
		"\u0311\u0312\u0001\u0000\u0000\u0000\u0312\u0313\u0001\u0000\u0000\u0000"+
		"\u0313\u0314\u0005\u00be\u0000\u0000\u0314\u0318\u0005\u00b5\u0000\u0000"+
		"\u0315\u0316\u0003\f\u0006\u0000\u0316\u0317\u0005\u00b5\u0000\u0000\u0317"+
		"\u0319\u0001\u0000\u0000\u0000\u0318\u0315\u0001\u0000\u0000\u0000\u0319"+
		"\u031a\u0001\u0000\u0000\u0000\u031a\u0318\u0001\u0000\u0000\u0000\u031a"+
		"\u031b\u0001\u0000\u0000\u0000\u031b\u031f\u0001\u0000\u0000\u0000\u031c"+
		"\u031e\u0003p8\u0000\u031d\u031c\u0001\u0000\u0000\u0000\u031e\u0321\u0001"+
		"\u0000\u0000\u0000\u031f\u031d\u0001\u0000\u0000\u0000\u031f\u0320\u0001"+
		"\u0000\u0000\u0000\u0320\u0322\u0001\u0000\u0000\u0000\u0321\u031f\u0001"+
		"\u0000\u0000\u0000\u0322\u0323\u0003,\u0016\u0000\u0323\u0324\u0005\u0018"+
		"\u0000\u0000\u0324o\u0001\u0000\u0000\u0000\u0325\u032b\u0003\u001a\r"+
		"\u0000\u0326\u032b\u0003\u001e\u000f\u0000\u0327\u032b\u0003\"\u0011\u0000"+
		"\u0328\u032b\u0003 \u0010\u0000\u0329\u032b\u0003\u0018\f\u0000\u032a"+
		"\u0325\u0001\u0000\u0000\u0000\u032a\u0326\u0001\u0000\u0000\u0000\u032a"+
		"\u0327\u0001\u0000\u0000\u0000\u032a\u0328\u0001\u0000\u0000\u0000\u032a"+
		"\u0329\u0001\u0000\u0000\u0000\u032b\u032c\u0001\u0000\u0000\u0000\u032c"+
		"\u032d\u0005\u00b5\u0000\u0000\u032dq\u0001\u0000\u0000\u0000\u032e\u0332"+
		"\u0005#\u0000\u0000\u032f\u0331\u0003t:\u0000\u0330\u032f\u0001\u0000"+
		"\u0000\u0000\u0331\u0334\u0001\u0000\u0000\u0000\u0332\u0330\u0001\u0000"+
		"\u0000\u0000\u0332\u0333\u0001\u0000\u0000\u0000\u0333\u0335\u0001\u0000"+
		"\u0000\u0000\u0334\u0332\u0001\u0000\u0000\u0000\u0335\u0336\u0005\u0016"+
		"\u0000\u0000\u0336s\u0001\u0000\u0000\u0000\u0337\u033b\u0003v;\u0000"+
		"\u0338\u033b\u0003x<\u0000\u0339\u033b\u0003\u0012\t\u0000\u033a\u0337"+
		"\u0001\u0000\u0000\u0000\u033a\u0338\u0001\u0000\u0000\u0000\u033a\u0339"+
		"\u0001\u0000\u0000\u0000\u033bu\u0001\u0000\u0000\u0000\u033c\u033d\u0005"+
		"\'\u0000\u0000\u033d\u033e\u0005\u00b8\u0000\u0000\u033e\u033f\u00038"+
		"\u001c\u0000\u033f\u0340\u0005\u00b9\u0000\u0000\u0340\u0343\u0003t:\u0000"+
		"\u0341\u0342\u0005\u0013\u0000\u0000\u0342\u0344\u0003t:\u0000\u0343\u0341"+
		"\u0001\u0000\u0000\u0000\u0343\u0344\u0001\u0000\u0000\u0000\u0344w\u0001"+
		"\u0000\u0000\u0000\u0345\u0346\u0005\u001e\u0000\u0000\u0346\u0347\u0005"+
		"\u00b8\u0000\u0000\u0347\u0348\u0003z=\u0000\u0348\u0349\u0005\u00b5\u0000"+
		"\u0000\u0349\u034a\u00038\u001c\u0000\u034a\u034b\u0005\u00b5\u0000\u0000"+
		"\u034b\u034c\u0003|>\u0000\u034c\u034d\u0005\u00b9\u0000\u0000\u034d\u034e"+
		"\u0003r9\u0000\u034ey\u0001\u0000\u0000\u0000\u034f\u0350\u0005$\u0000"+
		"\u0000\u0350\u0351\u0005\u00be\u0000\u0000\u0351\u0352\u0005\u00af\u0000"+
		"\u0000\u0352\u0353\u00038\u001c\u0000\u0353{\u0001\u0000\u0000\u0000\u0354"+
		"\u0355\u0005\u00be\u0000\u0000\u0355\u0356\u0005\u00af\u0000\u0000\u0356"+
		"\u0357\u00038\u001c\u0000\u0357}\u0001\u0000\u0000\u0000\u0358\u035a\u0005"+
		"\u00be\u0000\u0000\u0359\u035b\u0003\u0080@\u0000\u035a\u0359\u0001\u0000"+
		"\u0000\u0000\u035a\u035b\u0001\u0000\u0000\u0000\u035b\u035c\u0001\u0000"+
		"\u0000\u0000\u035c\u0361\u0003\u0086C\u0000\u035d\u035e\u0005\u00b6\u0000"+
		"\u0000\u035e\u0360\u0003\u0086C\u0000\u035f\u035d\u0001\u0000\u0000\u0000"+
		"\u0360\u0363\u0001\u0000\u0000\u0000\u0361\u035f\u0001\u0000\u0000\u0000"+
		"\u0361\u0362\u0001\u0000\u0000\u0000\u0362\u0364\u0001\u0000\u0000\u0000"+
		"\u0363\u0361\u0001\u0000\u0000\u0000\u0364\u0365\u0005\u00b5\u0000\u0000"+
		"\u0365\u007f\u0001\u0000\u0000\u0000\u0366\u0367\u0005\u00b1\u0000\u0000"+
		"\u0367\u0368\u0005\u00b8\u0000\u0000\u0368\u0369\u0003\u0082A\u0000\u0369"+
		"\u036a\u0005\u00b9\u0000\u0000\u036a\u0081\u0001\u0000\u0000\u0000\u036b"+
		"\u0370\u0003\u0084B\u0000\u036c\u036d\u0005\u00b6\u0000\u0000\u036d\u036f"+
		"\u0003\u0084B\u0000\u036e\u036c\u0001\u0000\u0000\u0000\u036f\u0372\u0001"+
		"\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000\u0000\u0370\u0371\u0001"+
		"\u0000\u0000\u0000\u0371\u0083\u0001\u0000\u0000\u0000\u0372\u0370\u0001"+
		"\u0000\u0000\u0000\u0373\u0374\u0005\u00b7\u0000\u0000\u0374\u0375\u0005"+
		"\u00be\u0000\u0000\u0375\u0376\u0005\u00b8\u0000\u0000\u0376\u0377\u0003"+
		"R)\u0000\u0377\u0378\u0005\u00b9\u0000\u0000\u0378\u0085\u0001\u0000\u0000"+
		"\u0000\u0379\u037a\u0003\\.\u0000\u037a\u037c\u0005\u00b8\u0000\u0000"+
		"\u037b\u037d\u0003\u0088D\u0000\u037c\u037b\u0001\u0000\u0000\u0000\u037c"+
		"\u037d\u0001\u0000\u0000\u0000\u037d\u037e\u0001\u0000\u0000\u0000\u037e"+
		"\u037f\u0005\u00b9\u0000\u0000\u037f\u0087\u0001\u0000\u0000\u0000\u0380"+
		"\u0385\u0003\u008aE\u0000\u0381\u0382\u0005\u00b6\u0000\u0000\u0382\u0384"+
		"\u0003\u008aE\u0000\u0383\u0381\u0001\u0000\u0000\u0000\u0384\u0387\u0001"+
		"\u0000\u0000\u0000\u0385\u0383\u0001\u0000\u0000\u0000\u0385\u0386\u0001"+
		"\u0000\u0000\u0000\u0386\u0089\u0001\u0000\u0000\u0000\u0387\u0385\u0001"+
		"\u0000\u0000\u0000\u0388\u0389\u0005\u00b7\u0000\u0000\u0389\u038a\u0005"+
		"\u00be\u0000\u0000\u038a\u038c\u0005\u00b8\u0000\u0000\u038b\u038d\u0003"+
		"R)\u0000\u038c\u038b\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000"+
		"\u0000\u038d\u038e\u0001\u0000\u0000\u0000\u038e\u038f\u0005\u00b9\u0000"+
		"\u0000\u038f\u008b\u0001\u0000\u0000\u0000\u0390\u0391\u0005\u00ba\u0000"+
		"\u0000\u0391\u0398\u0003R)\u0000\u0392\u0393\u0005\u00b4\u0000\u0000\u0393"+
		"\u0399\u0003R)\u0000\u0394\u0395\u0005\u009c\u0000\u0000\u0395\u0399\u0003"+
		"R)\u0000\u0396\u0397\u0005\u009d\u0000\u0000\u0397\u0399\u0003R)\u0000"+
		"\u0398\u0392\u0001\u0000\u0000\u0000\u0398\u0394\u0001\u0000\u0000\u0000"+
		"\u0398\u0396\u0001\u0000\u0000\u0000\u0398\u0399\u0001\u0000\u0000\u0000"+
		"\u0399\u039a\u0001\u0000\u0000\u0000\u039a\u039b\u0005\u00bb\u0000\u0000"+
		"\u039b\u008d\u0001\u0000\u0000\u0000\u039c\u039d\u0005\u00b1\u0000\u0000"+
		"\u039d\u03a6\u0003\u0090H\u0000\u039e\u039f\u0005\u00b0\u0000\u0000\u039f"+
		"\u03a6\u0003H$\u0000\u03a0\u03a1\u0005\u00b1\u0000\u0000\u03a1\u03a2\u0005"+
		"\u00b8\u0000\u0000\u03a2\u03a3\u0003<\u001e\u0000\u03a3\u03a4\u0005\u00b9"+
		"\u0000\u0000\u03a4\u03a6\u0001\u0000\u0000\u0000\u03a5\u039c\u0001\u0000"+
		"\u0000\u0000\u03a5\u039e\u0001\u0000\u0000\u0000\u03a5\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a6\u008f\u0001\u0000\u0000\u0000\u03a7\u03ae\u0005\u00c1"+
		"\u0000\u0000\u03a8\u03ae\u0005\u00be\u0000\u0000\u03a9\u03aa\u0005\u00b8"+
		"\u0000\u0000\u03aa\u03ab\u0003<\u001e\u0000\u03ab\u03ac\u0005\u00b9\u0000"+
		"\u0000\u03ac\u03ae\u0001\u0000\u0000\u0000\u03ad\u03a7\u0001\u0000\u0000"+
		"\u0000\u03ad\u03a8\u0001\u0000\u0000\u0000\u03ad\u03a9\u0001\u0000\u0000"+
		"\u0000\u03ae\u0091\u0001\u0000\u0000\u0000\u03af\u03b0\u0007\u0007\u0000"+
		"\u0000\u03b0\u0093\u0001\u0000\u0000\u0000\u03b1\u03b2\u0007\b\u0000\u0000"+
		"\u03b2\u0095\u0001\u0000\u0000\u0000\u03b3\u03b8\u0005\u00be\u0000\u0000"+
		"\u03b4\u03b5\u0005\u00b8\u0000\u0000\u03b5\u03b6\u0003P(\u0000\u03b6\u03b7"+
		"\u0005\u00b9\u0000\u0000\u03b7\u03b9\u0001\u0000\u0000\u0000\u03b8\u03b4"+
		"\u0001\u0000\u0000\u0000\u03b8\u03b9\u0001\u0000\u0000\u0000\u03b9\u03c2"+
		"\u0001\u0000\u0000\u0000\u03ba\u03bf\u00036\u001b\u0000\u03bb\u03bc\u0005"+
		"\u00b8\u0000\u0000\u03bc\u03bd\u0003P(\u0000\u03bd\u03be\u0005\u00b9\u0000"+
		"\u0000\u03be\u03c0\u0001\u0000\u0000\u0000\u03bf\u03bb\u0001\u0000\u0000"+
		"\u0000\u03bf\u03c0\u0001\u0000\u0000\u0000\u03c0\u03c2\u0001\u0000\u0000"+
		"\u0000\u03c1\u03b3\u0001\u0000\u0000\u0000\u03c1\u03ba\u0001\u0000\u0000"+
		"\u0000\u03c2\u0097\u0001\u0000\u0000\u0000\u03c3\u03c4\u0007\t\u0000\u0000"+
		"\u03c4\u0099\u0001\u0000\u0000\u0000\u03c5\u03ca\u0003\u009cN\u0000\u03c6"+
		"\u03ca\u0003\u00a2Q\u0000\u03c7\u03ca\u0003\u009eO\u0000\u03c8\u03ca\u0003"+
		"\u00a0P\u0000\u03c9\u03c5\u0001\u0000\u0000\u0000\u03c9\u03c6\u0001\u0000"+
		"\u0000\u0000\u03c9\u03c7\u0001\u0000\u0000\u0000\u03c9\u03c8\u0001\u0000"+
		"\u0000\u0000\u03ca\u009b\u0001\u0000\u0000\u0000\u03cb\u03cc\u0005~\u0000"+
		"\u0000\u03cc\u03ce\u0005\u00d0\u0000\u0000\u03cd\u03cf\u0005\u00d3\u0000"+
		"\u0000\u03ce\u03cd\u0001\u0000\u0000\u0000\u03ce\u03cf\u0001\u0000\u0000"+
		"\u0000\u03cf\u009d\u0001\u0000\u0000\u0000\u03d0\u03d1\u0005\u007f\u0000"+
		"\u0000\u03d1\u03d2\u0005\u00bf\u0000\u0000\u03d2\u009f\u0001\u0000\u0000"+
		"\u0000\u03d3\u03d4\u0005}\u0000\u0000\u03d4\u03d5\u0005\u00d5\u0000\u0000"+
		"\u03d5\u00a1\u0001\u0000\u0000\u0000\u03d6\u03d7\u0007\n\u0000\u0000\u03d7"+
		"\u03dc\u0005\u00be\u0000\u0000\u03d8\u03db\u0003\u0002\u0001\u0000\u03d9"+
		"\u03db\u0003\u009aM\u0000\u03da\u03d8\u0001\u0000\u0000\u0000\u03da\u03d9"+
		"\u0001\u0000\u0000\u0000\u03db\u03de\u0001\u0000\u0000\u0000\u03dc\u03da"+
		"\u0001\u0000\u0000\u0000\u03dc\u03dd\u0001\u0000\u0000\u0000\u03dd\u03ea"+
		"\u0001\u0000\u0000\u0000\u03de\u03dc\u0001\u0000\u0000\u0000\u03df\u03e0"+
		"\u0005\u0083\u0000\u0000\u03e0\u03e5\u0005\u00be\u0000\u0000\u03e1\u03e4"+
		"\u0003\u0002\u0001\u0000\u03e2\u03e4\u0003\u009aM\u0000\u03e3\u03e1\u0001"+
		"\u0000\u0000\u0000\u03e3\u03e2\u0001\u0000\u0000\u0000\u03e4\u03e7\u0001"+
		"\u0000\u0000\u0000\u03e5\u03e3\u0001\u0000\u0000\u0000\u03e5\u03e6\u0001"+
		"\u0000\u0000\u0000\u03e6\u03e9\u0001\u0000\u0000\u0000\u03e7\u03e5\u0001"+
		"\u0000\u0000\u0000\u03e8\u03df\u0001\u0000\u0000\u0000\u03e9\u03ec\u0001"+
		"\u0000\u0000\u0000\u03ea\u03e8\u0001\u0000\u0000\u0000\u03ea\u03eb\u0001"+
		"\u0000\u0000\u0000\u03eb\u03f5\u0001\u0000\u0000\u0000\u03ec\u03ea\u0001"+
		"\u0000\u0000\u0000\u03ed\u03f2\u0005\u0082\u0000\u0000\u03ee\u03f1\u0003"+
		"\u0002\u0001\u0000\u03ef\u03f1\u0003\u009aM\u0000\u03f0\u03ee\u0001\u0000"+
		"\u0000\u0000\u03f0\u03ef\u0001\u0000\u0000\u0000\u03f1\u03f4\u0001\u0000"+
		"\u0000\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000\u03f2\u03f3\u0001\u0000"+
		"\u0000\u0000\u03f3\u03f6\u0001\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000"+
		"\u0000\u0000\u03f5\u03ed\u0001\u0000\u0000\u0000\u03f5\u03f6\u0001\u0000"+
		"\u0000\u0000\u03f6\u03f7\u0001\u0000\u0000\u0000\u03f7\u03f8\u0005\u0084"+
		"\u0000\u0000\u03f8\u00a3\u0001\u0000\u0000\u0000u\u00a6\u00a8\u00b0\u00b3"+
		"\u00b9\u00c5\u00cc\u00cf\u00db\u00e3\u00e7\u00ea\u00ed\u00f3\u00f6\u00f9"+
		"\u00ff\u0102\u0105\u0117\u0120\u0124\u0127\u012f\u0132\u013a\u013d\u0143"+
		"\u0146\u0158\u0162\u016c\u0170\u0172\u0178\u0181\u018a\u0191\u0195\u0199"+
		"\u01b2\u01bc\u01c0\u01ca\u01d2\u01da\u01e0\u01e9\u01f4\u01f9\u0206\u020e"+
		"\u0218\u021f\u0221\u0228\u0230\u0233\u0237\u023f\u024a\u024d\u0252\u025f"+
		"\u0267\u0269\u0270\u0281\u0284\u028b\u029c\u029e\u02a4\u02ac\u02b4\u02bd"+
		"\u02c0\u02c7\u02cd\u02d5\u02dc\u02e1\u02e5\u02f1\u02f8\u0305\u030b\u030e"+
		"\u0311\u031a\u031f\u032a\u0332\u033a\u0343\u035a\u0361\u0370\u037c\u0385"+
		"\u038c\u0398\u03a5\u03ad\u03b8\u03bf\u03c1\u03c9\u03ce\u03da\u03dc\u03e3"+
		"\u03e5\u03ea\u03f0\u03f2\u03f5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}