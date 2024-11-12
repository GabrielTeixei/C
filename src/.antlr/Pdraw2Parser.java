// Generated from /home/gabriel/Desktop/Proj_C/pdraw-t08/src/Pdraw2.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class Pdraw2Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		STRING=25, DIGIT=26, COLOR=27, ID=28, L=29, WHITESPACE=30, COMMENT=31;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_command = 2, RULE_position_command = 3, 
		RULE_pen_control = 4, RULE_move_command = 5, RULE_turn_command = 6, RULE_define_command = 7, 
		RULE_pen_attribute = 8, RULE_distance = 9, RULE_angle = 10, RULE_number = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "command", "position_command", "pen_control", 
			"move_command", "turn_command", "define_command", "pen_attribute", "distance", 
			"angle", "number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'position'", "'('", "','", "')'", "'down'", "'up'", "'forward'", 
			"'backward'", "'left'", "'right'", "'define'", "'pen'", "'{'", "'}'", 
			"'color'", "'='", "'orientation'", "'\\u00BA'", "'thickness'", "'pressure'", 
			"'label'", "'-'", "'.'", null, null, null, null, "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "STRING", "DIGIT", "COLOR", "ID", "L", "WHITESPACE", "COMMENT"
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
	public String getGrammarFileName() { return "Pdraw2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Pdraw2Parser(TokenStream input) {
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
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8132L) != 0)) {
				{
				{
				setState(24);
				statement();
				}
				}
				setState(29);
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
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			command();
			setState(31);
			match(T__0);
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
		public Position_commandContext position_command() {
			return getRuleContext(Position_commandContext.class,0);
		}
		public Pen_controlContext pen_control() {
			return getRuleContext(Pen_controlContext.class,0);
		}
		public Move_commandContext move_command() {
			return getRuleContext(Move_commandContext.class,0);
		}
		public Turn_commandContext turn_command() {
			return getRuleContext(Turn_commandContext.class,0);
		}
		public Define_commandContext define_command() {
			return getRuleContext(Define_commandContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_command);
		try {
			setState(38);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				position_command();
				}
				break;
			case T__5:
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				pen_control();
				}
				break;
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(35);
				move_command();
				}
				break;
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				turn_command();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(37);
				define_command();
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
	public static class Position_commandContext extends ParserRuleContext {
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public Position_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position_command; }
	}

	public final Position_commandContext position_command() throws RecognitionException {
		Position_commandContext _localctx = new Position_commandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_position_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__1);
			setState(41);
			match(T__2);
			setState(42);
			number();
			setState(43);
			match(T__3);
			setState(44);
			number();
			setState(45);
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
	public static class Pen_controlContext extends ParserRuleContext {
		public Pen_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pen_control; }
	}

	public final Pen_controlContext pen_control() throws RecognitionException {
		Pen_controlContext _localctx = new Pen_controlContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_pen_control);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==T__5 || _la==T__6) ) {
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
	public static class Move_commandContext extends ParserRuleContext {
		public DistanceContext distance() {
			return getRuleContext(DistanceContext.class,0);
		}
		public Move_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_move_command; }
	}

	public final Move_commandContext move_command() throws RecognitionException {
		Move_commandContext _localctx = new Move_commandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_move_command);
		try {
			setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				match(T__7);
				setState(50);
				distance();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(T__8);
				setState(52);
				distance();
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
	public static class Turn_commandContext extends ParserRuleContext {
		public AngleContext angle() {
			return getRuleContext(AngleContext.class,0);
		}
		public Turn_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn_command; }
	}

	public final Turn_commandContext turn_command() throws RecognitionException {
		Turn_commandContext _localctx = new Turn_commandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_turn_command);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__9);
				setState(56);
				angle();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__10);
				setState(58);
				angle();
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
	public static class Define_commandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Pdraw2Parser.ID, 0); }
		public List<Pen_attributeContext> pen_attribute() {
			return getRuleContexts(Pen_attributeContext.class);
		}
		public Pen_attributeContext pen_attribute(int i) {
			return getRuleContext(Pen_attributeContext.class,i);
		}
		public Define_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_define_command; }
	}

	public final Define_commandContext define_command() throws RecognitionException {
		Define_commandContext _localctx = new Define_commandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_define_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(T__11);
			setState(62);
			match(T__12);
			setState(63);
			match(ID);
			setState(64);
			match(T__13);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7667716L) != 0)) {
				{
				{
				setState(65);
				pen_attribute();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(71);
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
	public static class Pen_attributeContext extends ParserRuleContext {
		public TerminalNode COLOR() { return getToken(Pdraw2Parser.COLOR, 0); }
		public List<NumberContext> number() {
			return getRuleContexts(NumberContext.class);
		}
		public NumberContext number(int i) {
			return getRuleContext(NumberContext.class,i);
		}
		public TerminalNode STRING() { return getToken(Pdraw2Parser.STRING, 0); }
		public Pen_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pen_attribute; }
	}

	public final Pen_attributeContext pen_attribute() throws RecognitionException {
		Pen_attributeContext _localctx = new Pen_attributeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pen_attribute);
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(73);
				match(T__15);
				setState(74);
				match(T__16);
				setState(75);
				match(COLOR);
				setState(76);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(T__1);
				setState(78);
				match(T__16);
				setState(79);
				match(T__2);
				setState(80);
				number();
				setState(81);
				match(T__3);
				setState(82);
				number();
				setState(83);
				match(T__4);
				setState(84);
				match(T__0);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(86);
				match(T__17);
				setState(87);
				match(T__16);
				setState(88);
				number();
				setState(89);
				match(T__18);
				setState(90);
				match(T__0);
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				match(T__19);
				setState(93);
				match(T__16);
				setState(94);
				number();
				setState(95);
				match(T__0);
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				match(T__20);
				setState(98);
				match(T__16);
				setState(99);
				number();
				setState(100);
				match(T__0);
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 6);
				{
				setState(102);
				match(T__21);
				setState(103);
				match(T__16);
				setState(104);
				match(STRING);
				setState(105);
				match(T__0);
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
	public static class DistanceContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public DistanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distance; }
	}

	public final DistanceContext distance() throws RecognitionException {
		DistanceContext _localctx = new DistanceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_distance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			number();
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
	public static class AngleContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AngleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_angle; }
	}

	public final AngleContext angle() throws RecognitionException {
		AngleContext _localctx = new AngleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_angle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			number();
			setState(111);
			match(T__18);
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
		public List<TerminalNode> DIGIT() { return getTokens(Pdraw2Parser.DIGIT); }
		public TerminalNode DIGIT(int i) {
			return getToken(Pdraw2Parser.DIGIT, i);
		}
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(113);
				match(T__22);
				}
			}

			setState(117); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(116);
				match(DIGIT);
				}
				}
				setState(119); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==DIGIT );
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(121);
				match(T__23);
				setState(123); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(122);
					match(DIGIT);
					}
					}
					setState(125); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==DIGIT );
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

	public static final String _serializedATN =
		"\u0004\u0001\u001f\u0082\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0005\u0000\u001a\b\u0000\n\u0000\f\u0000\u001d\t\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u00056\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006<\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007C\b\u0007\n\u0007\f\u0007F\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bk\b\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0003\u000bs\b\u000b\u0001\u000b"+
		"\u0004\u000bv\b\u000b\u000b\u000b\f\u000bw\u0001\u000b\u0001\u000b\u0004"+
		"\u000b|\b\u000b\u000b\u000b\f\u000b}\u0003\u000b\u0080\b\u000b\u0001\u000b"+
		"\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0000\u0001\u0001\u0000\u0006\u0007\u0086\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004&\u0001\u0000\u0000\u0000"+
		"\u0006(\u0001\u0000\u0000\u0000\b/\u0001\u0000\u0000\u0000\n5\u0001\u0000"+
		"\u0000\u0000\f;\u0001\u0000\u0000\u0000\u000e=\u0001\u0000\u0000\u0000"+
		"\u0010j\u0001\u0000\u0000\u0000\u0012l\u0001\u0000\u0000\u0000\u0014n"+
		"\u0001\u0000\u0000\u0000\u0016r\u0001\u0000\u0000\u0000\u0018\u001a\u0003"+
		"\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000\u001a\u001d\u0001"+
		"\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001b\u001c\u0001"+
		"\u0000\u0000\u0000\u001c\u0001\u0001\u0000\u0000\u0000\u001d\u001b\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0003\u0004\u0002\u0000\u001f \u0005\u0001"+
		"\u0000\u0000 \u0003\u0001\u0000\u0000\u0000!\'\u0003\u0006\u0003\u0000"+
		"\"\'\u0003\b\u0004\u0000#\'\u0003\n\u0005\u0000$\'\u0003\f\u0006\u0000"+
		"%\'\u0003\u000e\u0007\u0000&!\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000"+
		"\u0000&#\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000&%\u0001\u0000"+
		"\u0000\u0000\'\u0005\u0001\u0000\u0000\u0000()\u0005\u0002\u0000\u0000"+
		")*\u0005\u0003\u0000\u0000*+\u0003\u0016\u000b\u0000+,\u0005\u0004\u0000"+
		"\u0000,-\u0003\u0016\u000b\u0000-.\u0005\u0005\u0000\u0000.\u0007\u0001"+
		"\u0000\u0000\u0000/0\u0007\u0000\u0000\u00000\t\u0001\u0000\u0000\u0000"+
		"12\u0005\b\u0000\u000026\u0003\u0012\t\u000034\u0005\t\u0000\u000046\u0003"+
		"\u0012\t\u000051\u0001\u0000\u0000\u000053\u0001\u0000\u0000\u00006\u000b"+
		"\u0001\u0000\u0000\u000078\u0005\n\u0000\u00008<\u0003\u0014\n\u00009"+
		":\u0005\u000b\u0000\u0000:<\u0003\u0014\n\u0000;7\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<\r\u0001\u0000\u0000\u0000=>\u0005\f\u0000"+
		"\u0000>?\u0005\r\u0000\u0000?@\u0005\u001c\u0000\u0000@D\u0005\u000e\u0000"+
		"\u0000AC\u0003\u0010\b\u0000BA\u0001\u0000\u0000\u0000CF\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001\u0000"+
		"\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\u000f\u0000\u0000H\u000f"+
		"\u0001\u0000\u0000\u0000IJ\u0005\u0010\u0000\u0000JK\u0005\u0011\u0000"+
		"\u0000KL\u0005\u001b\u0000\u0000Lk\u0005\u0001\u0000\u0000MN\u0005\u0002"+
		"\u0000\u0000NO\u0005\u0011\u0000\u0000OP\u0005\u0003\u0000\u0000PQ\u0003"+
		"\u0016\u000b\u0000QR\u0005\u0004\u0000\u0000RS\u0003\u0016\u000b\u0000"+
		"ST\u0005\u0005\u0000\u0000TU\u0005\u0001\u0000\u0000Uk\u0001\u0000\u0000"+
		"\u0000VW\u0005\u0012\u0000\u0000WX\u0005\u0011\u0000\u0000XY\u0003\u0016"+
		"\u000b\u0000YZ\u0005\u0013\u0000\u0000Z[\u0005\u0001\u0000\u0000[k\u0001"+
		"\u0000\u0000\u0000\\]\u0005\u0014\u0000\u0000]^\u0005\u0011\u0000\u0000"+
		"^_\u0003\u0016\u000b\u0000_`\u0005\u0001\u0000\u0000`k\u0001\u0000\u0000"+
		"\u0000ab\u0005\u0015\u0000\u0000bc\u0005\u0011\u0000\u0000cd\u0003\u0016"+
		"\u000b\u0000de\u0005\u0001\u0000\u0000ek\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0016\u0000\u0000gh\u0005\u0011\u0000\u0000hi\u0005\u0019\u0000\u0000"+
		"ik\u0005\u0001\u0000\u0000jI\u0001\u0000\u0000\u0000jM\u0001\u0000\u0000"+
		"\u0000jV\u0001\u0000\u0000\u0000j\\\u0001\u0000\u0000\u0000ja\u0001\u0000"+
		"\u0000\u0000jf\u0001\u0000\u0000\u0000k\u0011\u0001\u0000\u0000\u0000"+
		"lm\u0003\u0016\u000b\u0000m\u0013\u0001\u0000\u0000\u0000no\u0003\u0016"+
		"\u000b\u0000op\u0005\u0013\u0000\u0000p\u0015\u0001\u0000\u0000\u0000"+
		"qs\u0005\u0017\u0000\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000su\u0001\u0000\u0000\u0000tv\u0005\u001a\u0000\u0000ut\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000x\u007f\u0001\u0000\u0000\u0000y{\u0005\u0018\u0000"+
		"\u0000z|\u0005\u001a\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u0080"+
		"\u0001\u0000\u0000\u0000\u007fy\u0001\u0000\u0000\u0000\u007f\u0080\u0001"+
		"\u0000\u0000\u0000\u0080\u0017\u0001\u0000\u0000\u0000\n\u001b&5;Djrw"+
		"}\u007f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}