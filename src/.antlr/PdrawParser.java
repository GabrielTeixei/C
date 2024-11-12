// Generated from /home/gabriel/Desktop/Proj_C/pdraw-t08/src/Pdraw.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PdrawParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, ID=44, NUMBER=45, DEGREE=46, 
		COLOR=47, STRING=48, BOOLEAN=49, LT=50, WS=51, COMMENT=52;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_penDefinition = 2, RULE_penAttributes = 3, 
		RULE_penAttribute = 4, RULE_penDeclaration = 5, RULE_penExecution = 6, 
		RULE_command = 7, RULE_penCommand = 8, RULE_drawCommand = 9, RULE_loop = 10, 
		RULE_conditional = 11, RULE_outputCommand = 12, RULE_inputCommand = 13, 
		RULE_assignment = 14, RULE_attributeAssign = 15, RULE_canvasDefinition = 16, 
		RULE_variableDeclaration = 17, RULE_dataType = 18, RULE_expressionStatement = 19, 
		RULE_endStatement = 20, RULE_expression = 21, RULE_typeCast = 22, RULE_functionCall = 23, 
		RULE_degreeExpression = 24, RULE_argumentList = 25, RULE_colorExpression = 26, 
		RULE_value = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "penDefinition", "penAttributes", "penAttribute", 
			"penDeclaration", "penExecution", "command", "penCommand", "drawCommand", 
			"loop", "conditional", "outputCommand", "inputCommand", "assignment", 
			"attributeAssign", "canvasDefinition", "variableDeclaration", "dataType", 
			"expressionStatement", "endStatement", "expression", "typeCast", "functionCall", 
			"degreeExpression", "argumentList", "colorExpression", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'define'", "'pen'", "'{'", "'}'", "';'", "'color'", "'='", "'position'", 
			"'('", "','", "')'", "'orientation'", "'thickness'", "'pressure'", "'new'", 
			"'<-'", "'execute'", "'pause'", "'forward'", "'backward'", "'left'", 
			"'right'", "'down'", "'up'", "'for'", "'until'", "'if'", "'->'", "'stdout'", 
			"'canvas'", "'int'", "'real'", "'string'", "'bool'", "'or'", "'+'", "'-'", 
			"'*'", "'/'", "'>'", "'=='", "'!='", "'stdin'", null, null, null, null, 
			null, null, "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "ID", "NUMBER", "DEGREE", 
			"COLOR", "STRING", "BOOLEAN", "LT", "WS", "COMMENT"
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
	public String getGrammarFileName() { return "Pdraw.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PdrawParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PdrawParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 977429572911622L) != 0)) {
				{
				{
				setState(56);
				statement();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
	public static class StatementContext extends ParserRuleContext {
		public PenDefinitionContext penDefinition() {
			return getRuleContext(PenDefinitionContext.class,0);
		}
		public PenDeclarationContext penDeclaration() {
			return getRuleContext(PenDeclarationContext.class,0);
		}
		public PenExecutionContext penExecution() {
			return getRuleContext(PenExecutionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public OutputCommandContext outputCommand() {
			return getRuleContext(OutputCommandContext.class,0);
		}
		public InputCommandContext inputCommand() {
			return getRuleContext(InputCommandContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CanvasDefinitionContext canvasDefinition() {
			return getRuleContext(CanvasDefinitionContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public EndStatementContext endStatement() {
			return getRuleContext(EndStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(77);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				penDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				penDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				penExecution();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				command();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(68);
				loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(69);
				conditional();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(70);
				outputCommand();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				inputCommand();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(72);
				assignment();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(73);
				canvasDefinition();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(74);
				variableDeclaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(75);
				expressionStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(76);
				endStatement();
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
	public static class PenDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public PenAttributesContext penAttributes() {
			return getRuleContext(PenAttributesContext.class,0);
		}
		public PenDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penDefinition; }
	}

	public final PenDefinitionContext penDefinition() throws RecognitionException {
		PenDefinitionContext _localctx = new PenDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_penDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(T__0);
			setState(80);
			match(T__1);
			setState(81);
			match(ID);
			setState(82);
			match(T__2);
			setState(83);
			penAttributes();
			setState(84);
			match(T__3);
			setState(85);
			match(T__4);
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
	public static class PenAttributesContext extends ParserRuleContext {
		public List<PenAttributeContext> penAttribute() {
			return getRuleContexts(PenAttributeContext.class);
		}
		public PenAttributeContext penAttribute(int i) {
			return getRuleContext(PenAttributeContext.class,i);
		}
		public PenAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penAttributes; }
	}

	public final PenAttributesContext penAttributes() throws RecognitionException {
		PenAttributesContext _localctx = new PenAttributesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_penAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 28992L) != 0)) {
				{
				{
				setState(87);
				penAttribute();
				setState(88);
				match(T__4);
				}
				}
				setState(94);
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
	public static class PenAttributeContext extends ParserRuleContext {
		public ColorExpressionContext colorExpression() {
			return getRuleContext(ColorExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DegreeExpressionContext degreeExpression() {
			return getRuleContext(DegreeExpressionContext.class,0);
		}
		public PenAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penAttribute; }
	}

	public final PenAttributeContext penAttribute() throws RecognitionException {
		PenAttributeContext _localctx = new PenAttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_penAttribute);
		try {
			setState(115);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				match(T__5);
				setState(96);
				match(T__6);
				setState(97);
				colorExpression();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__7);
				setState(99);
				match(T__6);
				setState(100);
				match(T__8);
				setState(101);
				expression(0);
				setState(102);
				match(T__9);
				setState(103);
				expression(0);
				setState(104);
				match(T__10);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				match(T__11);
				setState(107);
				match(T__6);
				setState(108);
				degreeExpression();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(T__12);
				setState(110);
				match(T__6);
				setState(111);
				expression(0);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(T__13);
				setState(113);
				match(T__6);
				setState(114);
				expression(0);
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
	public static class PenDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PdrawParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PdrawParser.ID, i);
		}
		public PenDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penDeclaration; }
	}

	public final PenDeclarationContext penDeclaration() throws RecognitionException {
		PenDeclarationContext _localctx = new PenDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_penDeclaration);
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(T__1);
				setState(118);
				match(ID);
				setState(119);
				match(T__6);
				setState(120);
				match(T__14);
				setState(121);
				match(ID);
				setState(122);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(T__1);
				setState(124);
				match(ID);
				setState(125);
				match(T__6);
				setState(126);
				match(T__14);
				setState(127);
				match(T__4);
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
	public static class PenExecutionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PdrawParser.STRING, 0); }
		public PenExecutionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penExecution; }
	}

	public final PenExecutionContext penExecution() throws RecognitionException {
		PenExecutionContext _localctx = new PenExecutionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_penExecution);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(ID);
			setState(131);
			match(T__15);
			setState(132);
			match(T__16);
			setState(133);
			match(STRING);
			setState(134);
			match(T__4);
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
	public static class CommandContext extends ParserRuleContext {
		public PenCommandContext penCommand() {
			return getRuleContext(PenCommandContext.class,0);
		}
		public DrawCommandContext drawCommand() {
			return getRuleContext(DrawCommandContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_command);
		int _la;
		try {
			int _alt;
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				penCommand();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				drawCommand();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(138);
				match(T__17);
				setState(139);
				expression(0);
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(140);
						match(T__4);
						}
						} 
					}
					setState(145);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(146);
				penCommand();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(147);
				drawCommand();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(148);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(149);
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
	public static class PenCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public PenCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penCommand; }
	}

	public final PenCommandContext penCommand() throws RecognitionException {
		PenCommandContext _localctx = new PenCommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_penCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(ID);
			setState(153);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(154);
			match(T__4);
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
	public static class DrawCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public DrawCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawCommand; }
	}

	public final DrawCommandContext drawCommand() throws RecognitionException {
		DrawCommandContext _localctx = new DrawCommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_drawCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(ID);
			setState(157);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7864320L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(158);
			expression(0);
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17592194170880L) != 0)) {
				{
				{
				setState(159);
				command();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			match(T__4);
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
	public static class LoopContext extends ParserRuleContext {
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_loop);
		int _la;
		try {
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(T__24);
				setState(168);
				match(T__8);
				setState(169);
				variableDeclaration();
				setState(170);
				expression(0);
				setState(171);
				match(T__4);
				setState(172);
				match(ID);
				setState(173);
				match(T__6);
				setState(174);
				expression(0);
				setState(175);
				match(T__10);
				setState(176);
				match(T__2);
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 977429572911622L) != 0)) {
					{
					{
					setState(177);
					statement();
					}
					}
					setState(182);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(183);
				match(T__3);
				setState(184);
				match(T__4);
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				match(T__25);
				setState(187);
				match(T__8);
				setState(188);
				expression(0);
				setState(189);
				match(T__10);
				setState(190);
				match(T__2);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 977429572911622L) != 0)) {
					{
					{
					setState(191);
					statement();
					}
					}
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(197);
				match(T__3);
				setState(198);
				match(T__4);
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
	public static class ConditionalContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__26);
			setState(203);
			match(T__8);
			setState(204);
			expression(0);
			setState(205);
			match(T__10);
			setState(206);
			match(T__2);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 977429572911622L) != 0)) {
				{
				{
				setState(207);
				statement();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(T__3);
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
	public static class OutputCommandContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OutputCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputCommand; }
	}

	public final OutputCommandContext outputCommand() throws RecognitionException {
		OutputCommandContext _localctx = new OutputCommandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_outputCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			expression(0);
			setState(216);
			match(T__27);
			setState(217);
			match(T__28);
			setState(218);
			match(T__4);
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
	public static class InputCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PdrawParser.STRING, 0); }
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public InputCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputCommand; }
	}

	public final InputCommandContext inputCommand() throws RecognitionException {
		InputCommandContext _localctx = new InputCommandContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inputCommand);
		try {
			setState(233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
				match(ID);
				setState(221);
				match(T__6);
				setState(222);
				match(T__14);
				setState(223);
				match(T__8);
				setState(224);
				match(STRING);
				setState(225);
				match(T__10);
				setState(226);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(ID);
				setState(228);
				match(T__6);
				setState(229);
				expressionStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(T__14);
				setState(231);
				match(STRING);
				setState(232);
				match(T__4);
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
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public AttributeAssignContext attributeAssign() {
			return getRuleContext(AttributeAssignContext.class,0);
		}
		public TerminalNode STRING() { return getToken(PdrawParser.STRING, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		int _la;
		try {
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				match(ID);
				setState(236);
				match(T__15);
				setState(237);
				attributeAssign();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4 || _la==T__9) {
					{
					{
					setState(238);
					_la = _input.LA(1);
					if ( !(_la==T__4 || _la==T__9) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
				match(ID);
				setState(245);
				match(T__15);
				setState(246);
				match(T__16);
				setState(247);
				match(STRING);
				setState(248);
				match(T__4);
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
	public static class AttributeAssignContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ColorExpressionContext colorExpression() {
			return getRuleContext(ColorExpressionContext.class,0);
		}
		public AttributeAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeAssign; }
	}

	public final AttributeAssignContext attributeAssign() throws RecognitionException {
		AttributeAssignContext _localctx = new AttributeAssignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attributeAssign);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28992L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(252);
					match(T__6);
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(258);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				match(T__5);
				setState(260);
				colorExpression();
				setState(261);
				match(T__6);
				setState(262);
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
	public static class CanvasDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public TerminalNode STRING() { return getToken(PdrawParser.STRING, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public CanvasDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_canvasDefinition; }
	}

	public final CanvasDefinitionContext canvasDefinition() throws RecognitionException {
		CanvasDefinitionContext _localctx = new CanvasDefinitionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_canvasDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__0);
			setState(267);
			match(T__29);
			setState(268);
			match(ID);
			setState(269);
			match(STRING);
			setState(270);
			match(T__8);
			setState(271);
			expression(0);
			setState(272);
			match(T__9);
			setState(273);
			expression(0);
			setState(274);
			match(T__10);
			setState(275);
			match(T__4);
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PdrawParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PdrawParser.ID, i);
		}
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> STRING() { return getTokens(PdrawParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(PdrawParser.STRING, i);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) {
				{
				{
				setState(277);
				dataType();
				}
				}
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(283);
			match(ID);
			{
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(284);
				match(T__6);
				setState(287);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(285);
					expression(0);
					}
					break;
				case 2:
					{
					setState(286);
					match(STRING);
					}
					break;
				}
				}
			}

			}
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(291);
				match(T__9);
				setState(292);
				match(ID);
				{
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(293);
					match(T__6);
					setState(296);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
					case 1:
						{
						setState(294);
						expression(0);
						}
						break;
					case 2:
						{
						setState(295);
						match(STRING);
						}
						break;
					}
					}
				}

				}
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(305);
			match(T__4);
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
	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
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
	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			expression(0);
			setState(310);
			match(T__4);
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
	public static class EndStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EndStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endStatement; }
	}

	public final EndStatementContext endStatement() throws RecognitionException {
		EndStatementContext _localctx = new EndStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_endStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			expression(0);
			setState(313);
			match(T__6);
			setState(314);
			expression(0);
			setState(315);
			match(T__34);
			setState(316);
			expression(0);
			setState(317);
			match(T__4);
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
	public static class VariableContext extends ExpressionContext {
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DegreeContext extends ExpressionContext {
		public DegreeExpressionContext degreeExpression() {
			return getRuleContext(DegreeExpressionContext.class,0);
		}
		public DegreeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ExpressionContext {
		public List<TerminalNode> ID() { return getTokens(PdrawParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PdrawParser.ID, i);
		}
		public AttributeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleansContext extends ExpressionContext {
		public TerminalNode BOOLEAN() { return getToken(PdrawParser.BOOLEAN, 0); }
		public BooleansContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GroupingContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupingContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DataContext extends ExpressionContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DataContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringsContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(PdrawParser.STRING, 0); }
		public StringsContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ExpressionContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InputContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(PdrawParser.STRING, 0); }
		public InputContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ExpressionContext {
		public TypeCastContext typeCast() {
			return getRuleContext(TypeCastContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlainContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(PdrawParser.NUMBER, 0); }
		public PlainContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConcatenationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConcatenationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualityContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualityContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TupleContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TupleContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(PdrawParser.LT, 0); }
		public ComparationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArithmeticContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(320);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792151040L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(321);
				expression(16);
				}
				break;
			case 2:
				{
				_localctx = new GroupingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(322);
				match(T__8);
				setState(323);
				expression(0);
				setState(324);
				match(T__10);
				}
				break;
			case 3:
				{
				_localctx = new TupleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				match(T__8);
				setState(327);
				expression(0);
				setState(328);
				match(T__9);
				setState(329);
				expression(0);
				setState(330);
				match(T__10);
				}
				break;
			case 4:
				{
				_localctx = new DegreeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				degreeExpression();
				}
				break;
			case 5:
				{
				_localctx = new PlainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(333);
				match(NUMBER);
				}
				break;
			case 6:
				{
				_localctx = new StringsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(334);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new BooleansContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(335);
				match(BOOLEAN);
				}
				break;
			case 8:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				functionCall();
				}
				break;
			case 9:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(337);
				match(ID);
				setState(338);
				match(T__27);
				setState(339);
				match(ID);
				}
				break;
			case 10:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				match(ID);
				}
				break;
			case 11:
				{
				_localctx = new InputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				match(T__42);
				setState(342);
				match(STRING);
				}
				break;
			case 12:
				{
				_localctx = new TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				typeCast();
				setState(344);
				match(T__8);
				setState(345);
				expression(0);
				setState(346);
				match(T__10);
				}
				break;
			case 13:
				{
				_localctx = new DataContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				dataType();
				setState(349);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(365);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(353);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(354);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792151040L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(355);
						expression(18);
						}
						break;
					case 2:
						{
						_localctx = new ConcatenationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(356);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(357);
						match(T__35);
						setState(358);
						expression(14);
						}
						break;
					case 3:
						{
						_localctx = new ComparationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(359);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(360);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==LT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(361);
						expression(13);
						}
						break;
					case 4:
						{
						_localctx = new EqualityContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(362);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(363);
						_la = _input.LA(1);
						if ( !(_la==T__40 || _la==T__41) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(364);
						expression(12);
						}
						break;
					}
					} 
				}
				setState(369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
	public static class TypeCastContext extends ParserRuleContext {
		public TypeCastContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCast; }
	}

	public final TypeCastContext typeCast() throws RecognitionException {
		TypeCastContext _localctx = new TypeCastContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_typeCast);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32212254720L) != 0)) ) {
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			match(ID);
			setState(373);
			match(T__8);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 977429329871360L) != 0)) {
				{
				setState(374);
				argumentList();
				}
			}

			setState(377);
			match(T__10);
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
	public static class DegreeExpressionContext extends ParserRuleContext {
		public TerminalNode DEGREE() { return getToken(PdrawParser.DEGREE, 0); }
		public DegreeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degreeExpression; }
	}

	public final DegreeExpressionContext degreeExpression() throws RecognitionException {
		DegreeExpressionContext _localctx = new DegreeExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_degreeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(DEGREE);
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
	public static class ArgumentListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			expression(0);
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(382);
				match(T__9);
				setState(383);
				expression(0);
				}
				}
				setState(388);
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
	public static class ColorExpressionContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(PdrawParser.COLOR, 0); }
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public ColorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colorExpression; }
	}

	public final ColorExpressionContext colorExpression() throws RecognitionException {
		ColorExpressionContext _localctx = new ColorExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_colorExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==COLOR) ) {
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
	public static class ValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLOR() { return getToken(PdrawParser.COLOR, 0); }
		public TerminalNode DEGREE() { return getToken(PdrawParser.DEGREE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_value);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(COLOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(DEGREE);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00014\u018d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0005\u0000:\b\u0000\n\u0000\f\u0000=\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001N\b\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003[\b\u0003\n\u0003\f\u0003"+
		"^\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004t\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0081\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"\u008e\b\u0007\n\u0007\f\u0007\u0091\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0097\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a1\b\t\n\t\f\t\u00a4\t\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00b3\b\n\n\n\f\n\u00b6\t\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00c1\b\n\n\n\f\n\u00c4\t\n\u0001\n\u0001\n\u0001\n\u0003\n"+
		"\u00c9\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0005\u000b\u00d1\b\u000b\n\u000b\f\u000b\u00d4\t\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u00ea\b\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00f0\b\u000e\n\u000e\f\u000e\u00f3\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00fa"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0005\u000f\u00fe\b\u000f\n\u000f\f\u000f"+
		"\u0101\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0109\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0005\u0011\u0117\b\u0011\n\u0011"+
		"\f\u0011\u011a\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0120\b\u0011\u0003\u0011\u0122\b\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0129\b\u0011\u0003"+
		"\u0011\u012b\b\u0011\u0005\u0011\u012d\b\u0011\n\u0011\f\u0011\u0130\t"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0160"+
		"\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0005\u0015\u016e\b\u0015\n\u0015\f\u0015\u0171\t\u0015\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0178\b\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0005\u0019\u0181\b\u0019\n\u0019\f\u0019\u0184\t\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u018b"+
		"\b\u001b\u0001\u001b\u0000\u0001*\u001c\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0246\u0000"+
		"\t\u0001\u0000\u0013\u0016\u0001\u0000\u0017\u0018\u0002\u0000\u0005\u0005"+
		"\n\n\u0003\u0000\u0006\u0006\b\b\f\u000e\u0001\u0000\u001f\"\u0001\u0000"+
		"$\'\u0002\u0000((22\u0001\u0000)*\u0002\u0000,,//\u01ae\u0000;\u0001\u0000"+
		"\u0000\u0000\u0002M\u0001\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000"+
		"\u0006\\\u0001\u0000\u0000\u0000\bs\u0001\u0000\u0000\u0000\n\u0080\u0001"+
		"\u0000\u0000\u0000\f\u0082\u0001\u0000\u0000\u0000\u000e\u0096\u0001\u0000"+
		"\u0000\u0000\u0010\u0098\u0001\u0000\u0000\u0000\u0012\u009c\u0001\u0000"+
		"\u0000\u0000\u0014\u00c8\u0001\u0000\u0000\u0000\u0016\u00ca\u0001\u0000"+
		"\u0000\u0000\u0018\u00d7\u0001\u0000\u0000\u0000\u001a\u00e9\u0001\u0000"+
		"\u0000\u0000\u001c\u00f9\u0001\u0000\u0000\u0000\u001e\u0108\u0001\u0000"+
		"\u0000\u0000 \u010a\u0001\u0000\u0000\u0000\"\u0118\u0001\u0000\u0000"+
		"\u0000$\u0133\u0001\u0000\u0000\u0000&\u0135\u0001\u0000\u0000\u0000("+
		"\u0138\u0001\u0000\u0000\u0000*\u015f\u0001\u0000\u0000\u0000,\u0172\u0001"+
		"\u0000\u0000\u0000.\u0174\u0001\u0000\u0000\u00000\u017b\u0001\u0000\u0000"+
		"\u00002\u017d\u0001\u0000\u0000\u00004\u0185\u0001\u0000\u0000\u00006"+
		"\u018a\u0001\u0000\u0000\u00008:\u0003\u0002\u0001\u000098\u0001\u0000"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">?\u0005\u0000\u0000\u0001?\u0001\u0001\u0000\u0000\u0000@N\u0003\u0004"+
		"\u0002\u0000AN\u0003\n\u0005\u0000BN\u0003\f\u0006\u0000CN\u0003\u000e"+
		"\u0007\u0000DN\u0003\u0014\n\u0000EN\u0003\u0016\u000b\u0000FN\u0003\u0018"+
		"\f\u0000GN\u0003\u001a\r\u0000HN\u0003\u001c\u000e\u0000IN\u0003 \u0010"+
		"\u0000JN\u0003\"\u0011\u0000KN\u0003&\u0013\u0000LN\u0003(\u0014\u0000"+
		"M@\u0001\u0000\u0000\u0000MA\u0001\u0000\u0000\u0000MB\u0001\u0000\u0000"+
		"\u0000MC\u0001\u0000\u0000\u0000MD\u0001\u0000\u0000\u0000ME\u0001\u0000"+
		"\u0000\u0000MF\u0001\u0000\u0000\u0000MG\u0001\u0000\u0000\u0000MH\u0001"+
		"\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000MJ\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000ML\u0001\u0000\u0000\u0000N\u0003\u0001\u0000"+
		"\u0000\u0000OP\u0005\u0001\u0000\u0000PQ\u0005\u0002\u0000\u0000QR\u0005"+
		",\u0000\u0000RS\u0005\u0003\u0000\u0000ST\u0003\u0006\u0003\u0000TU\u0005"+
		"\u0004\u0000\u0000UV\u0005\u0005\u0000\u0000V\u0005\u0001\u0000\u0000"+
		"\u0000WX\u0003\b\u0004\u0000XY\u0005\u0005\u0000\u0000Y[\u0001\u0000\u0000"+
		"\u0000ZW\u0001\u0000\u0000\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]\u0007\u0001\u0000\u0000\u0000"+
		"^\\\u0001\u0000\u0000\u0000_`\u0005\u0006\u0000\u0000`a\u0005\u0007\u0000"+
		"\u0000at\u00034\u001a\u0000bc\u0005\b\u0000\u0000cd\u0005\u0007\u0000"+
		"\u0000de\u0005\t\u0000\u0000ef\u0003*\u0015\u0000fg\u0005\n\u0000\u0000"+
		"gh\u0003*\u0015\u0000hi\u0005\u000b\u0000\u0000it\u0001\u0000\u0000\u0000"+
		"jk\u0005\f\u0000\u0000kl\u0005\u0007\u0000\u0000lt\u00030\u0018\u0000"+
		"mn\u0005\r\u0000\u0000no\u0005\u0007\u0000\u0000ot\u0003*\u0015\u0000"+
		"pq\u0005\u000e\u0000\u0000qr\u0005\u0007\u0000\u0000rt\u0003*\u0015\u0000"+
		"s_\u0001\u0000\u0000\u0000sb\u0001\u0000\u0000\u0000sj\u0001\u0000\u0000"+
		"\u0000sm\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000t\t\u0001\u0000"+
		"\u0000\u0000uv\u0005\u0002\u0000\u0000vw\u0005,\u0000\u0000wx\u0005\u0007"+
		"\u0000\u0000xy\u0005\u000f\u0000\u0000yz\u0005,\u0000\u0000z\u0081\u0005"+
		"\u0005\u0000\u0000{|\u0005\u0002\u0000\u0000|}\u0005,\u0000\u0000}~\u0005"+
		"\u0007\u0000\u0000~\u007f\u0005\u000f\u0000\u0000\u007f\u0081\u0005\u0005"+
		"\u0000\u0000\u0080u\u0001\u0000\u0000\u0000\u0080{\u0001\u0000\u0000\u0000"+
		"\u0081\u000b\u0001\u0000\u0000\u0000\u0082\u0083\u0005,\u0000\u0000\u0083"+
		"\u0084\u0005\u0010\u0000\u0000\u0084\u0085\u0005\u0011\u0000\u0000\u0085"+
		"\u0086\u00050\u0000\u0000\u0086\u0087\u0005\u0005\u0000\u0000\u0087\r"+
		"\u0001\u0000\u0000\u0000\u0088\u0097\u0003\u0010\b\u0000\u0089\u0097\u0003"+
		"\u0012\t\u0000\u008a\u008b\u0005\u0012\u0000\u0000\u008b\u008f\u0003*"+
		"\u0015\u0000\u008c\u008e\u0005\u0005\u0000\u0000\u008d\u008c\u0001\u0000"+
		"\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000"+
		"\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0097\u0001\u0000"+
		"\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0097\u0003\u0010"+
		"\b\u0000\u0093\u0097\u0003\u0012\t\u0000\u0094\u0095\u0007\u0000\u0000"+
		"\u0000\u0095\u0097\u0003*\u0015\u0000\u0096\u0088\u0001\u0000\u0000\u0000"+
		"\u0096\u0089\u0001\u0000\u0000\u0000\u0096\u008a\u0001\u0000\u0000\u0000"+
		"\u0096\u0092\u0001\u0000\u0000\u0000\u0096\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0097\u000f\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0005,\u0000\u0000\u0099\u009a\u0007\u0001\u0000\u0000\u009a"+
		"\u009b\u0005\u0005\u0000\u0000\u009b\u0011\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0005,\u0000\u0000\u009d\u009e\u0007\u0000\u0000\u0000\u009e\u00a2"+
		"\u0003*\u0015\u0000\u009f\u00a1\u0003\u000e\u0007\u0000\u00a0\u009f\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001"+
		"\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a5\u0001"+
		"\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"\u0005\u0000\u0000\u00a6\u0013\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005"+
		"\u0019\u0000\u0000\u00a8\u00a9\u0005\t\u0000\u0000\u00a9\u00aa\u0003\""+
		"\u0011\u0000\u00aa\u00ab\u0003*\u0015\u0000\u00ab\u00ac\u0005\u0005\u0000"+
		"\u0000\u00ac\u00ad\u0005,\u0000\u0000\u00ad\u00ae\u0005\u0007\u0000\u0000"+
		"\u00ae\u00af\u0003*\u0015\u0000\u00af\u00b0\u0005\u000b\u0000\u0000\u00b0"+
		"\u00b4\u0005\u0003\u0000\u0000\u00b1\u00b3\u0003\u0002\u0001\u0000\u00b2"+
		"\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4"+
		"\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0005\u0004\u0000\u0000\u00b8\u00b9\u0005\u0005\u0000\u0000\u00b9"+
		"\u00c9\u0001\u0000\u0000\u0000\u00ba\u00bb\u0005\u001a\u0000\u0000\u00bb"+
		"\u00bc\u0005\t\u0000\u0000\u00bc\u00bd\u0003*\u0015\u0000\u00bd\u00be"+
		"\u0005\u000b\u0000\u0000\u00be\u00c2\u0005\u0003\u0000\u0000\u00bf\u00c1"+
		"\u0003\u0002\u0001\u0000\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c5\u0001\u0000\u0000\u0000\u00c4\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005\u0004\u0000\u0000\u00c6\u00c7"+
		"\u0005\u0005\u0000\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8\u00a7"+
		"\u0001\u0000\u0000\u0000\u00c8\u00ba\u0001\u0000\u0000\u0000\u00c9\u0015"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cb\u0005\u001b\u0000\u0000\u00cb\u00cc"+
		"\u0005\t\u0000\u0000\u00cc\u00cd\u0003*\u0015\u0000\u00cd\u00ce\u0005"+
		"\u000b\u0000\u0000\u00ce\u00d2\u0005\u0003\u0000\u0000\u00cf\u00d1\u0003"+
		"\u0002\u0001\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0005\u0004\u0000\u0000\u00d6\u0017\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0003*\u0015\u0000\u00d8\u00d9\u0005\u001c"+
		"\u0000\u0000\u00d9\u00da\u0005\u001d\u0000\u0000\u00da\u00db\u0005\u0005"+
		"\u0000\u0000\u00db\u0019\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005,\u0000"+
		"\u0000\u00dd\u00de\u0005\u0007\u0000\u0000\u00de\u00df\u0005\u000f\u0000"+
		"\u0000\u00df\u00e0\u0005\t\u0000\u0000\u00e0\u00e1\u00050\u0000\u0000"+
		"\u00e1\u00e2\u0005\u000b\u0000\u0000\u00e2\u00ea\u0005\u0005\u0000\u0000"+
		"\u00e3\u00e4\u0005,\u0000\u0000\u00e4\u00e5\u0005\u0007\u0000\u0000\u00e5"+
		"\u00ea\u0003&\u0013\u0000\u00e6\u00e7\u0005\u000f\u0000\u0000\u00e7\u00e8"+
		"\u00050\u0000\u0000\u00e8\u00ea\u0005\u0005\u0000\u0000\u00e9\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e9\u00e3\u0001\u0000\u0000\u0000\u00e9\u00e6\u0001"+
		"\u0000\u0000\u0000\u00ea\u001b\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005"+
		",\u0000\u0000\u00ec\u00ed\u0005\u0010\u0000\u0000\u00ed\u00f1\u0003\u001e"+
		"\u000f\u0000\u00ee\u00f0\u0007\u0002\u0000\u0000\u00ef\u00ee\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f3\u0001\u0000\u0000\u0000\u00f1\u00ef\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f2\u0001\u0000\u0000\u0000\u00f2\u00fa\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f5\u0005,\u0000"+
		"\u0000\u00f5\u00f6\u0005\u0010\u0000\u0000\u00f6\u00f7\u0005\u0011\u0000"+
		"\u0000\u00f7\u00f8\u00050\u0000\u0000\u00f8\u00fa\u0005\u0005\u0000\u0000"+
		"\u00f9\u00eb\u0001\u0000\u0000\u0000\u00f9\u00f4\u0001\u0000\u0000\u0000"+
		"\u00fa\u001d\u0001\u0000\u0000\u0000\u00fb\u00ff\u0007\u0003\u0000\u0000"+
		"\u00fc\u00fe\u0005\u0007\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000"+
		"\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0109\u0003*\u0015\u0000\u0103"+
		"\u0104\u0005\u0006\u0000\u0000\u0104\u0105\u00034\u001a\u0000\u0105\u0106"+
		"\u0005\u0007\u0000\u0000\u0106\u0107\u0003*\u0015\u0000\u0107\u0109\u0001"+
		"\u0000\u0000\u0000\u0108\u00fb\u0001\u0000\u0000\u0000\u0108\u0103\u0001"+
		"\u0000\u0000\u0000\u0109\u001f\u0001\u0000\u0000\u0000\u010a\u010b\u0005"+
		"\u0001\u0000\u0000\u010b\u010c\u0005\u001e\u0000\u0000\u010c\u010d\u0005"+
		",\u0000\u0000\u010d\u010e\u00050\u0000\u0000\u010e\u010f\u0005\t\u0000"+
		"\u0000\u010f\u0110\u0003*\u0015\u0000\u0110\u0111\u0005\n\u0000\u0000"+
		"\u0111\u0112\u0003*\u0015\u0000\u0112\u0113\u0005\u000b\u0000\u0000\u0113"+
		"\u0114\u0005\u0005\u0000\u0000\u0114!\u0001\u0000\u0000\u0000\u0115\u0117"+
		"\u0003$\u0012\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a\u0001"+
		"\u0000\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001"+
		"\u0000\u0000\u0000\u011b\u0121\u0005,\u0000\u0000\u011c\u011f\u0005\u0007"+
		"\u0000\u0000\u011d\u0120\u0003*\u0015\u0000\u011e\u0120\u00050\u0000\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000"+
		"\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011c\u0001\u0000\u0000\u0000"+
		"\u0121\u0122\u0001\u0000\u0000\u0000\u0122\u012e\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0005\n\u0000\u0000\u0124\u012a\u0005,\u0000\u0000\u0125"+
		"\u0128\u0005\u0007\u0000\u0000\u0126\u0129\u0003*\u0015\u0000\u0127\u0129"+
		"\u00050\u0000\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0127\u0001"+
		"\u0000\u0000\u0000\u0129\u012b\u0001\u0000\u0000\u0000\u012a\u0125\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001"+
		"\u0000\u0000\u0000\u012c\u0123\u0001\u0000\u0000\u0000\u012d\u0130\u0001"+
		"\u0000\u0000\u0000\u012e\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001"+
		"\u0000\u0000\u0000\u012f\u0131\u0001\u0000\u0000\u0000\u0130\u012e\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0005\u0005\u0000\u0000\u0132#\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0007\u0004\u0000\u0000\u0134%\u0001\u0000\u0000"+
		"\u0000\u0135\u0136\u0003*\u0015\u0000\u0136\u0137\u0005\u0005\u0000\u0000"+
		"\u0137\'\u0001\u0000\u0000\u0000\u0138\u0139\u0003*\u0015\u0000\u0139"+
		"\u013a\u0005\u0007\u0000\u0000\u013a\u013b\u0003*\u0015\u0000\u013b\u013c"+
		"\u0005#\u0000\u0000\u013c\u013d\u0003*\u0015\u0000\u013d\u013e\u0005\u0005"+
		"\u0000\u0000\u013e)\u0001\u0000\u0000\u0000\u013f\u0140\u0006\u0015\uffff"+
		"\uffff\u0000\u0140\u0141\u0007\u0005\u0000\u0000\u0141\u0160\u0003*\u0015"+
		"\u0010\u0142\u0143\u0005\t\u0000\u0000\u0143\u0144\u0003*\u0015\u0000"+
		"\u0144\u0145\u0005\u000b\u0000\u0000\u0145\u0160\u0001\u0000\u0000\u0000"+
		"\u0146\u0147\u0005\t\u0000\u0000\u0147\u0148\u0003*\u0015\u0000\u0148"+
		"\u0149\u0005\n\u0000\u0000\u0149\u014a\u0003*\u0015\u0000\u014a\u014b"+
		"\u0005\u000b\u0000\u0000\u014b\u0160\u0001\u0000\u0000\u0000\u014c\u0160"+
		"\u00030\u0018\u0000\u014d\u0160\u0005-\u0000\u0000\u014e\u0160\u00050"+
		"\u0000\u0000\u014f\u0160\u00051\u0000\u0000\u0150\u0160\u0003.\u0017\u0000"+
		"\u0151\u0152\u0005,\u0000\u0000\u0152\u0153\u0005\u001c\u0000\u0000\u0153"+
		"\u0160\u0005,\u0000\u0000\u0154\u0160\u0005,\u0000\u0000\u0155\u0156\u0005"+
		"+\u0000\u0000\u0156\u0160\u00050\u0000\u0000\u0157\u0158\u0003,\u0016"+
		"\u0000\u0158\u0159\u0005\t\u0000\u0000\u0159\u015a\u0003*\u0015\u0000"+
		"\u015a\u015b\u0005\u000b\u0000\u0000\u015b\u0160\u0001\u0000\u0000\u0000"+
		"\u015c\u015d\u0003$\u0012\u0000\u015d\u015e\u0003*\u0015\u0001\u015e\u0160"+
		"\u0001\u0000\u0000\u0000\u015f\u013f\u0001\u0000\u0000\u0000\u015f\u0142"+
		"\u0001\u0000\u0000\u0000\u015f\u0146\u0001\u0000\u0000\u0000\u015f\u014c"+
		"\u0001\u0000\u0000\u0000\u015f\u014d\u0001\u0000\u0000\u0000\u015f\u014e"+
		"\u0001\u0000\u0000\u0000\u015f\u014f\u0001\u0000\u0000\u0000\u015f\u0150"+
		"\u0001\u0000\u0000\u0000\u015f\u0151\u0001\u0000\u0000\u0000\u015f\u0154"+
		"\u0001\u0000\u0000\u0000\u015f\u0155\u0001\u0000\u0000\u0000\u015f\u0157"+
		"\u0001\u0000\u0000\u0000\u015f\u015c\u0001\u0000\u0000\u0000\u0160\u016f"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\n\u0011\u0000\u0000\u0162\u0163\u0007"+
		"\u0005\u0000\u0000\u0163\u016e\u0003*\u0015\u0012\u0164\u0165\n\r\u0000"+
		"\u0000\u0165\u0166\u0005$\u0000\u0000\u0166\u016e\u0003*\u0015\u000e\u0167"+
		"\u0168\n\f\u0000\u0000\u0168\u0169\u0007\u0006\u0000\u0000\u0169\u016e"+
		"\u0003*\u0015\r\u016a\u016b\n\u000b\u0000\u0000\u016b\u016c\u0007\u0007"+
		"\u0000\u0000\u016c\u016e\u0003*\u0015\f\u016d\u0161\u0001\u0000\u0000"+
		"\u0000\u016d\u0164\u0001\u0000\u0000\u0000\u016d\u0167\u0001\u0000\u0000"+
		"\u0000\u016d\u016a\u0001\u0000\u0000\u0000\u016e\u0171\u0001\u0000\u0000"+
		"\u0000\u016f\u016d\u0001\u0000\u0000\u0000\u016f\u0170\u0001\u0000\u0000"+
		"\u0000\u0170+\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0007\u0004\u0000\u0000\u0173-\u0001\u0000\u0000\u0000\u0174"+
		"\u0175\u0005,\u0000\u0000\u0175\u0177\u0005\t\u0000\u0000\u0176\u0178"+
		"\u00032\u0019\u0000\u0177\u0176\u0001\u0000\u0000\u0000\u0177\u0178\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0005"+
		"\u000b\u0000\u0000\u017a/\u0001\u0000\u0000\u0000\u017b\u017c\u0005.\u0000"+
		"\u0000\u017c1\u0001\u0000\u0000\u0000\u017d\u0182\u0003*\u0015\u0000\u017e"+
		"\u017f\u0005\n\u0000\u0000\u017f\u0181\u0003*\u0015\u0000\u0180\u017e"+
		"\u0001\u0000\u0000\u0000\u0181\u0184\u0001\u0000\u0000\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u01833\u0001"+
		"\u0000\u0000\u0000\u0184\u0182\u0001\u0000\u0000\u0000\u0185\u0186\u0007"+
		"\b\u0000\u0000\u01865\u0001\u0000\u0000\u0000\u0187\u018b\u0003*\u0015"+
		"\u0000\u0188\u018b\u0005/\u0000\u0000\u0189\u018b\u0005.\u0000\u0000\u018a"+
		"\u0187\u0001\u0000\u0000\u0000\u018a\u0188\u0001\u0000\u0000\u0000\u018a"+
		"\u0189\u0001\u0000\u0000\u0000\u018b7\u0001\u0000\u0000\u0000\u001d;M"+
		"\\s\u0080\u008f\u0096\u00a2\u00b4\u00c2\u00c8\u00d2\u00e9\u00f1\u00f9"+
		"\u00ff\u0108\u0118\u011f\u0121\u0128\u012a\u012e\u015f\u016d\u016f\u0177"+
		"\u0182\u018a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}