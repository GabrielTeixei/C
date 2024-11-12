// Generated from /home/gabriel/Desktop/Proj_C/pdraw-t08/Pdraw.g4 by ANTLR 4.13.1
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
		T__38=39, ID=40, NUMBER=41, DEGREE=42, COLOR=43, STRING=44, BOOLEAN=45, 
		LT=46, WS=47, COMMENT=48;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_variableDeclaration = 2, RULE_dataType = 3, 
		RULE_penDefinition = 4, RULE_penAttributes = 5, RULE_penAttribute = 6, 
		RULE_penDeclaration = 7, RULE_command = 8, RULE_penCommand = 9, RULE_drawCommand = 10, 
		RULE_outputCommand = 11, RULE_inputCommand = 12, RULE_assignment = 13, 
		RULE_attributeAssign = 14, RULE_canvasDefinition = 15, RULE_loop = 16, 
		RULE_conditional = 17, RULE_expressionStatement = 18, RULE_expression = 19, 
		RULE_functionCall = 20, RULE_argumentList = 21, RULE_degreeExpression = 22, 
		RULE_colorExpression = 23, RULE_value = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "variableDeclaration", "dataType", "penDefinition", 
			"penAttributes", "penAttribute", "penDeclaration", "command", "penCommand", 
			"drawCommand", "outputCommand", "inputCommand", "assignment", "attributeAssign", 
			"canvasDefinition", "loop", "conditional", "expressionStatement", "expression", 
			"functionCall", "argumentList", "degreeExpression", "colorExpression", 
			"value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "';'", "'int'", "'real'", "'string'", "'bool'", "'define'", 
			"'pen'", "'{'", "'}'", "'color'", "'position'", "'('", "','", "')'", 
			"'orientation'", "'thickness'", "'pressure'", "'new'", "'pause'", "'down'", 
			"'up'", "'forward'", "'backward'", "'left'", "'right'", "'with'", "'->'", 
			"'stdout'", "'input'", "'<-'", "'canvas'", "'for'", "'until'", "'if'", 
			"'+'", "'-'", "'*'", "'/'", null, null, null, null, null, null, "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "ID", "NUMBER", "DEGREE", "COLOR", "STRING", 
			"BOOLEAN", "LT", "WS", "COMMENT"
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
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61565261849080L) != 0)) {
				{
				{
				setState(50);
				statement();
				}
				}
				setState(55);
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
	public static class StatementContext extends ParserRuleContext {
		public PenDefinitionContext penDefinition() {
			return getRuleContext(PenDefinitionContext.class,0);
		}
		public PenDeclarationContext penDeclaration() {
			return getRuleContext(PenDeclarationContext.class,0);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				penDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				penDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(58);
				command();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				loop();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(60);
				conditional();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(61);
				outputCommand();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(62);
				inputCommand();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(63);
				assignment();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(64);
				canvasDefinition();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(65);
				variableDeclaration();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(66);
				expressionStatement();
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			dataType();
			setState(70);
			match(ID);
			setState(71);
			match(T__0);
			setState(72);
			expression(0);
			setState(73);
			match(T__1);
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
		enterRule(_localctx, 6, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120L) != 0)) ) {
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
		enterRule(_localctx, 8, RULE_penDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__6);
			setState(78);
			match(T__7);
			setState(79);
			match(ID);
			setState(80);
			match(T__8);
			setState(81);
			penAttributes();
			setState(82);
			match(T__9);
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
		enterRule(_localctx, 10, RULE_penAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 464896L) != 0)) {
				{
				{
				setState(84);
				penAttribute();
				setState(85);
				match(T__1);
				}
				}
				setState(91);
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
		enterRule(_localctx, 12, RULE_penAttribute);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(T__10);
				setState(93);
				match(T__0);
				setState(94);
				colorExpression();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				match(T__11);
				setState(96);
				match(T__0);
				setState(97);
				match(T__12);
				setState(98);
				expression(0);
				setState(99);
				match(T__13);
				setState(100);
				expression(0);
				setState(101);
				match(T__14);
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				match(T__15);
				setState(104);
				match(T__0);
				setState(105);
				degreeExpression();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 4);
				{
				setState(106);
				match(T__16);
				setState(107);
				match(T__0);
				setState(108);
				expression(0);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 5);
				{
				setState(109);
				match(T__17);
				setState(110);
				match(T__0);
				setState(111);
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
		enterRule(_localctx, 14, RULE_penDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__7);
			setState(115);
			match(ID);
			setState(116);
			match(T__0);
			setState(117);
			match(T__18);
			setState(118);
			match(ID);
			setState(119);
			match(T__1);
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
		enterRule(_localctx, 16, RULE_command);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				penCommand();
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__25:
				enterOuterAlt(_localctx, 2);
				{
				setState(122);
				drawCommand();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(T__19);
				setState(124);
				expression(0);
				setState(125);
				match(T__1);
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
	public static class PenCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public PenCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_penCommand; }
	}

	public final PenCommandContext penCommand() throws RecognitionException {
		PenCommandContext _localctx = new PenCommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_penCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(T__7);
			setState(130);
			match(ID);
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
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
	public static class DrawCommandContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ID() { return getToken(PdrawParser.ID, 0); }
		public DrawCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawCommand; }
	}

	public final DrawCommandContext drawCommand() throws RecognitionException {
		DrawCommandContext _localctx = new DrawCommandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_drawCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(134);
			expression(0);
			setState(135);
			match(T__26);
			setState(136);
			match(ID);
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
		enterRule(_localctx, 22, RULE_outputCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			expression(0);
			setState(139);
			match(T__27);
			setState(140);
			match(T__28);
			setState(141);
			match(T__1);
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
		public InputCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputCommand; }
	}

	public final InputCommandContext inputCommand() throws RecognitionException {
		InputCommandContext _localctx = new InputCommandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inputCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(ID);
			setState(144);
			match(T__0);
			setState(145);
			match(T__29);
			setState(146);
			match(T__12);
			setState(147);
			match(STRING);
			setState(148);
			match(T__14);
			setState(149);
			match(T__1);
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
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ID);
			setState(152);
			match(T__30);
			setState(153);
			attributeAssign();
			setState(154);
			match(T__1);
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
		public AttributeAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeAssign; }
	}

	public final AttributeAssignContext attributeAssign() throws RecognitionException {
		AttributeAssignContext _localctx = new AttributeAssignContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attributeAssign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 464896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(157);
			match(T__0);
			setState(158);
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
		enterRule(_localctx, 30, RULE_canvasDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__6);
			setState(161);
			match(T__31);
			setState(162);
			match(ID);
			setState(163);
			match(STRING);
			setState(164);
			match(T__12);
			setState(165);
			expression(0);
			setState(166);
			match(T__13);
			setState(167);
			expression(0);
			setState(168);
			match(T__14);
			setState(169);
			match(T__1);
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
		enterRule(_localctx, 32, RULE_loop);
		int _la;
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(T__32);
				setState(172);
				match(T__12);
				setState(173);
				variableDeclaration();
				setState(174);
				expression(0);
				setState(175);
				match(T__1);
				setState(176);
				match(ID);
				setState(177);
				match(T__0);
				setState(178);
				expression(0);
				setState(179);
				match(T__14);
				setState(180);
				match(T__8);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61565261849080L) != 0)) {
					{
					{
					setState(181);
					statement();
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(T__9);
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(T__33);
				setState(190);
				match(T__12);
				setState(191);
				expression(0);
				setState(192);
				match(T__14);
				setState(193);
				match(T__8);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61565261849080L) != 0)) {
					{
					{
					setState(194);
					statement();
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(200);
				match(T__9);
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
		enterRule(_localctx, 34, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__34);
			setState(205);
			match(T__12);
			setState(206);
			expression(0);
			setState(207);
			match(T__14);
			setState(208);
			match(T__8);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61565261849080L) != 0)) {
				{
				{
				setState(209);
				statement();
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(T__9);
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
		enterRule(_localctx, 36, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			expression(0);
			setState(218);
			match(T__1);
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
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TypeContext(ExpressionContext ctx) { copyFrom(ctx); }
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
	public static class PlainContext extends ExpressionContext {
		public TerminalNode NUMBER() { return getToken(PdrawParser.NUMBER, 0); }
		public PlainContext(ExpressionContext ctx) { copyFrom(ctx); }
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
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(221);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792151040L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(222);
				expression(12);
				}
				break;
			case 2:
				{
				_localctx = new GroupingContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(223);
				match(T__12);
				setState(224);
				expression(0);
				setState(225);
				match(T__14);
				}
				break;
			case 3:
				{
				_localctx = new ConcatenationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(227);
				match(T__12);
				setState(228);
				expression(0);
				setState(229);
				expression(0);
				setState(230);
				match(T__14);
				}
				break;
			case 4:
				{
				_localctx = new DegreeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(232);
				degreeExpression();
				}
				break;
			case 5:
				{
				_localctx = new PlainContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(233);
				match(NUMBER);
				}
				break;
			case 6:
				{
				_localctx = new StringsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(234);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new BooleansContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(235);
				match(BOOLEAN);
				}
				break;
			case 8:
				{
				_localctx = new FunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(236);
				functionCall();
				}
				break;
			case 9:
				{
				_localctx = new AttributeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(237);
				match(ID);
				setState(238);
				match(T__27);
				setState(239);
				match(ID);
				}
				break;
			case 10:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(240);
				match(ID);
				}
				break;
			case 11:
				{
				_localctx = new InputContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(T__29);
				setState(242);
				match(T__12);
				setState(243);
				match(STRING);
				setState(244);
				match(T__14);
				}
				break;
			case 12:
				{
				_localctx = new TypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				dataType();
				setState(246);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithmeticContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(250);
					if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
					setState(251);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1030792151040L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(252);
					expression(14);
					}
					} 
				}
				setState(257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
		enterRule(_localctx, 40, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(ID);
			setState(259);
			match(T__12);
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 61505005428856L) != 0)) {
				{
				setState(260);
				argumentList();
				}
			}

			setState(263);
			match(T__14);
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
		enterRule(_localctx, 42, RULE_argumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			expression(0);
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(266);
				match(T__13);
				setState(267);
				expression(0);
				}
				}
				setState(272);
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
	public static class DegreeExpressionContext extends ParserRuleContext {
		public TerminalNode DEGREE() { return getToken(PdrawParser.DEGREE, 0); }
		public DegreeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_degreeExpression; }
	}

	public final DegreeExpressionContext degreeExpression() throws RecognitionException {
		DegreeExpressionContext _localctx = new DegreeExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_degreeExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 46, RULE_colorExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
		enterRule(_localctx, 48, RULE_value);
		try {
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(COLOR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
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
		case 19:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u011b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0005\u00004\b\u0000\n\u0000\f\u00007\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001D\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005X\b\u0005\n\u0005\f\u0005[\t\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006q\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\b\u0080\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u00b7\b\u0010\n\u0010\f\u0010\u00ba\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00c4\b\u0010\n\u0010\f\u0010\u00c7\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u00cb\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0005\u0011\u00d3\b\u0011\n\u0011\f\u0011"+
		"\u00d6\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00f9\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00fe\b\u0013\n\u0013"+
		"\f\u0013\u0101\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0106\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0005\u0015\u010d\b\u0015\n\u0015\f\u0015\u0110\t\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0119\b\u0018\u0001\u0018\u0000\u0001&\u0019\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.0\u0000\u0006\u0001\u0000\u0003\u0006\u0001\u0000\u0015\u0016\u0001"+
		"\u0000\u0017\u001a\u0002\u0000\u000b\f\u0010\u0012\u0001\u0000$\'\u0002"+
		"\u0000((++\u0127\u00005\u0001\u0000\u0000\u0000\u0002C\u0001\u0000\u0000"+
		"\u0000\u0004E\u0001\u0000\u0000\u0000\u0006K\u0001\u0000\u0000\u0000\b"+
		"M\u0001\u0000\u0000\u0000\nY\u0001\u0000\u0000\u0000\fp\u0001\u0000\u0000"+
		"\u0000\u000er\u0001\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000\u0000"+
		"\u0012\u0081\u0001\u0000\u0000\u0000\u0014\u0085\u0001\u0000\u0000\u0000"+
		"\u0016\u008a\u0001\u0000\u0000\u0000\u0018\u008f\u0001\u0000\u0000\u0000"+
		"\u001a\u0097\u0001\u0000\u0000\u0000\u001c\u009c\u0001\u0000\u0000\u0000"+
		"\u001e\u00a0\u0001\u0000\u0000\u0000 \u00ca\u0001\u0000\u0000\u0000\""+
		"\u00cc\u0001\u0000\u0000\u0000$\u00d9\u0001\u0000\u0000\u0000&\u00f8\u0001"+
		"\u0000\u0000\u0000(\u0102\u0001\u0000\u0000\u0000*\u0109\u0001\u0000\u0000"+
		"\u0000,\u0111\u0001\u0000\u0000\u0000.\u0113\u0001\u0000\u0000\u00000"+
		"\u0118\u0001\u0000\u0000\u000024\u0003\u0002\u0001\u000032\u0001\u0000"+
		"\u0000\u000047\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u000056\u0001"+
		"\u0000\u0000\u00006\u0001\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u00008D\u0003\b\u0004\u00009D\u0003\u000e\u0007\u0000:D\u0003\u0010\b"+
		"\u0000;D\u0003 \u0010\u0000<D\u0003\"\u0011\u0000=D\u0003\u0016\u000b"+
		"\u0000>D\u0003\u0018\f\u0000?D\u0003\u001a\r\u0000@D\u0003\u001e\u000f"+
		"\u0000AD\u0003\u0004\u0002\u0000BD\u0003$\u0012\u0000C8\u0001\u0000\u0000"+
		"\u0000C9\u0001\u0000\u0000\u0000C:\u0001\u0000\u0000\u0000C;\u0001\u0000"+
		"\u0000\u0000C<\u0001\u0000\u0000\u0000C=\u0001\u0000\u0000\u0000C>\u0001"+
		"\u0000\u0000\u0000C?\u0001\u0000\u0000\u0000C@\u0001\u0000\u0000\u0000"+
		"CA\u0001\u0000\u0000\u0000CB\u0001\u0000\u0000\u0000D\u0003\u0001\u0000"+
		"\u0000\u0000EF\u0003\u0006\u0003\u0000FG\u0005(\u0000\u0000GH\u0005\u0001"+
		"\u0000\u0000HI\u0003&\u0013\u0000IJ\u0005\u0002\u0000\u0000J\u0005\u0001"+
		"\u0000\u0000\u0000KL\u0007\u0000\u0000\u0000L\u0007\u0001\u0000\u0000"+
		"\u0000MN\u0005\u0007\u0000\u0000NO\u0005\b\u0000\u0000OP\u0005(\u0000"+
		"\u0000PQ\u0005\t\u0000\u0000QR\u0003\n\u0005\u0000RS\u0005\n\u0000\u0000"+
		"S\t\u0001\u0000\u0000\u0000TU\u0003\f\u0006\u0000UV\u0005\u0002\u0000"+
		"\u0000VX\u0001\u0000\u0000\u0000WT\u0001\u0000\u0000\u0000X[\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u000b"+
		"\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u000b\u0000"+
		"\u0000]^\u0005\u0001\u0000\u0000^q\u0003.\u0017\u0000_`\u0005\f\u0000"+
		"\u0000`a\u0005\u0001\u0000\u0000ab\u0005\r\u0000\u0000bc\u0003&\u0013"+
		"\u0000cd\u0005\u000e\u0000\u0000de\u0003&\u0013\u0000ef\u0005\u000f\u0000"+
		"\u0000fq\u0001\u0000\u0000\u0000gh\u0005\u0010\u0000\u0000hi\u0005\u0001"+
		"\u0000\u0000iq\u0003,\u0016\u0000jk\u0005\u0011\u0000\u0000kl\u0005\u0001"+
		"\u0000\u0000lq\u0003&\u0013\u0000mn\u0005\u0012\u0000\u0000no\u0005\u0001"+
		"\u0000\u0000oq\u0003&\u0013\u0000p\\\u0001\u0000\u0000\u0000p_\u0001\u0000"+
		"\u0000\u0000pg\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000\u0000pm\u0001"+
		"\u0000\u0000\u0000q\r\u0001\u0000\u0000\u0000rs\u0005\b\u0000\u0000st"+
		"\u0005(\u0000\u0000tu\u0005\u0001\u0000\u0000uv\u0005\u0013\u0000\u0000"+
		"vw\u0005(\u0000\u0000wx\u0005\u0002\u0000\u0000x\u000f\u0001\u0000\u0000"+
		"\u0000y\u0080\u0003\u0012\t\u0000z\u0080\u0003\u0014\n\u0000{|\u0005\u0014"+
		"\u0000\u0000|}\u0003&\u0013\u0000}~\u0005\u0002\u0000\u0000~\u0080\u0001"+
		"\u0000\u0000\u0000\u007fy\u0001\u0000\u0000\u0000\u007fz\u0001\u0000\u0000"+
		"\u0000\u007f{\u0001\u0000\u0000\u0000\u0080\u0011\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005\b\u0000\u0000\u0082\u0083\u0005(\u0000\u0000\u0083"+
		"\u0084\u0007\u0001\u0000\u0000\u0084\u0013\u0001\u0000\u0000\u0000\u0085"+
		"\u0086\u0007\u0002\u0000\u0000\u0086\u0087\u0003&\u0013\u0000\u0087\u0088"+
		"\u0005\u001b\u0000\u0000\u0088\u0089\u0005(\u0000\u0000\u0089\u0015\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0003&\u0013\u0000\u008b\u008c\u0005\u001c"+
		"\u0000\u0000\u008c\u008d\u0005\u001d\u0000\u0000\u008d\u008e\u0005\u0002"+
		"\u0000\u0000\u008e\u0017\u0001\u0000\u0000\u0000\u008f\u0090\u0005(\u0000"+
		"\u0000\u0090\u0091\u0005\u0001\u0000\u0000\u0091\u0092\u0005\u001e\u0000"+
		"\u0000\u0092\u0093\u0005\r\u0000\u0000\u0093\u0094\u0005,\u0000\u0000"+
		"\u0094\u0095\u0005\u000f\u0000\u0000\u0095\u0096\u0005\u0002\u0000\u0000"+
		"\u0096\u0019\u0001\u0000\u0000\u0000\u0097\u0098\u0005(\u0000\u0000\u0098"+
		"\u0099\u0005\u001f\u0000\u0000\u0099\u009a\u0003\u001c\u000e\u0000\u009a"+
		"\u009b\u0005\u0002\u0000\u0000\u009b\u001b\u0001\u0000\u0000\u0000\u009c"+
		"\u009d\u0007\u0003\u0000\u0000\u009d\u009e\u0005\u0001\u0000\u0000\u009e"+
		"\u009f\u0003&\u0013\u0000\u009f\u001d\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005\u0007\u0000\u0000\u00a1\u00a2\u0005 \u0000\u0000\u00a2\u00a3\u0005"+
		"(\u0000\u0000\u00a3\u00a4\u0005,\u0000\u0000\u00a4\u00a5\u0005\r\u0000"+
		"\u0000\u00a5\u00a6\u0003&\u0013\u0000\u00a6\u00a7\u0005\u000e\u0000\u0000"+
		"\u00a7\u00a8\u0003&\u0013\u0000\u00a8\u00a9\u0005\u000f\u0000\u0000\u00a9"+
		"\u00aa\u0005\u0002\u0000\u0000\u00aa\u001f\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005!\u0000\u0000\u00ac\u00ad\u0005\r\u0000\u0000\u00ad\u00ae"+
		"\u0003\u0004\u0002\u0000\u00ae\u00af\u0003&\u0013\u0000\u00af\u00b0\u0005"+
		"\u0002\u0000\u0000\u00b0\u00b1\u0005(\u0000\u0000\u00b1\u00b2\u0005\u0001"+
		"\u0000\u0000\u00b2\u00b3\u0003&\u0013\u0000\u00b3\u00b4\u0005\u000f\u0000"+
		"\u0000\u00b4\u00b8\u0005\t\u0000\u0000\u00b5\u00b7\u0003\u0002\u0001\u0000"+
		"\u00b6\u00b5\u0001\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000"+
		"\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\n\u0000\u0000\u00bc\u00cb\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0005\"\u0000\u0000\u00be\u00bf\u0005\r\u0000\u0000\u00bf\u00c0"+
		"\u0003&\u0013\u0000\u00c0\u00c1\u0005\u000f\u0000\u0000\u00c1\u00c5\u0005"+
		"\t\u0000\u0000\u00c2\u00c4\u0003\u0002\u0001\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\n\u0000"+
		"\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ca\u00bd\u0001\u0000\u0000\u0000\u00cb!\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005#\u0000\u0000\u00cd\u00ce\u0005\r\u0000\u0000\u00ce"+
		"\u00cf\u0003&\u0013\u0000\u00cf\u00d0\u0005\u000f\u0000\u0000\u00d0\u00d4"+
		"\u0005\t\u0000\u0000\u00d1\u00d3\u0003\u0002\u0001\u0000\u00d2\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000\u0000\u0000\u00d5\u00d7\u0001"+
		"\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005"+
		"\n\u0000\u0000\u00d8#\u0001\u0000\u0000\u0000\u00d9\u00da\u0003&\u0013"+
		"\u0000\u00da\u00db\u0005\u0002\u0000\u0000\u00db%\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0006\u0013\uffff\uffff\u0000\u00dd\u00de\u0007\u0004\u0000"+
		"\u0000\u00de\u00f9\u0003&\u0013\f\u00df\u00e0\u0005\r\u0000\u0000\u00e0"+
		"\u00e1\u0003&\u0013\u0000\u00e1\u00e2\u0005\u000f\u0000\u0000\u00e2\u00f9"+
		"\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005\r\u0000\u0000\u00e4\u00e5\u0003"+
		"&\u0013\u0000\u00e5\u00e6\u0003&\u0013\u0000\u00e6\u00e7\u0005\u000f\u0000"+
		"\u0000\u00e7\u00f9\u0001\u0000\u0000\u0000\u00e8\u00f9\u0003,\u0016\u0000"+
		"\u00e9\u00f9\u0005)\u0000\u0000\u00ea\u00f9\u0005,\u0000\u0000\u00eb\u00f9"+
		"\u0005-\u0000\u0000\u00ec\u00f9\u0003(\u0014\u0000\u00ed\u00ee\u0005("+
		"\u0000\u0000\u00ee\u00ef\u0005\u001c\u0000\u0000\u00ef\u00f9\u0005(\u0000"+
		"\u0000\u00f0\u00f9\u0005(\u0000\u0000\u00f1\u00f2\u0005\u001e\u0000\u0000"+
		"\u00f2\u00f3\u0005\r\u0000\u0000\u00f3\u00f4\u0005,\u0000\u0000\u00f4"+
		"\u00f9\u0005\u000f\u0000\u0000\u00f5\u00f6\u0003\u0006\u0003\u0000\u00f6"+
		"\u00f7\u0003&\u0013\u0001\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00dc"+
		"\u0001\u0000\u0000\u0000\u00f8\u00df\u0001\u0000\u0000\u0000\u00f8\u00e3"+
		"\u0001\u0000\u0000\u0000\u00f8\u00e8\u0001\u0000\u0000\u0000\u00f8\u00e9"+
		"\u0001\u0000\u0000\u0000\u00f8\u00ea\u0001\u0000\u0000\u0000\u00f8\u00eb"+
		"\u0001\u0000\u0000\u0000\u00f8\u00ec\u0001\u0000\u0000\u0000\u00f8\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f0\u0001\u0000\u0000\u0000\u00f8\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f8\u00f5\u0001\u0000\u0000\u0000\u00f9\u00ff"+
		"\u0001\u0000\u0000\u0000\u00fa\u00fb\n\r\u0000\u0000\u00fb\u00fc\u0007"+
		"\u0004\u0000\u0000\u00fc\u00fe\u0003&\u0013\u000e\u00fd\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\'\u0001\u0000\u0000"+
		"\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0005(\u0000\u0000"+
		"\u0103\u0105\u0005\r\u0000\u0000\u0104\u0106\u0003*\u0015\u0000\u0105"+
		"\u0104\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0005\u000f\u0000\u0000\u0108"+
		")\u0001\u0000\u0000\u0000\u0109\u010e\u0003&\u0013\u0000\u010a\u010b\u0005"+
		"\u000e\u0000\u0000\u010b\u010d\u0003&\u0013\u0000\u010c\u010a\u0001\u0000"+
		"\u0000\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000"+
		"\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f+\u0001\u0000\u0000"+
		"\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0005*\u0000\u0000"+
		"\u0112-\u0001\u0000\u0000\u0000\u0113\u0114\u0007\u0005\u0000\u0000\u0114"+
		"/\u0001\u0000\u0000\u0000\u0115\u0119\u0003&\u0013\u0000\u0116\u0119\u0005"+
		"+\u0000\u0000\u0117\u0119\u0005*\u0000\u0000\u0118\u0115\u0001\u0000\u0000"+
		"\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0117\u0001\u0000\u0000"+
		"\u0000\u01191\u0001\u0000\u0000\u0000\u000e5CYp\u007f\u00b8\u00c5\u00ca"+
		"\u00d4\u00f8\u00ff\u0105\u010e\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}