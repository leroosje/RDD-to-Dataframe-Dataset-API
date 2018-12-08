// Generated from /Users/jordan/Desktop/512/project-part2/src/main/java/Rdd.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RddParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, WHITESPACE=4, SC=5, VAL=6, IF=7, ELSE=8, ASSIGN=9, 
		DOT=10, LB=11, RB=12, LP=13, RP=14, COMMA=15, SEMICOLON=16, ARROW=17, 
		OP=18, COMP=19, ID=20, NUMBER=21;
	public static final int
		RULE_start = 0, RULE_mapops = 1, RULE_udf = 2, RULE_expression = 3, RULE_simpleexpression = 4, 
		RULE_tupleexpression = 5, RULE_complexexpression = 6, RULE_assignmentexpressions = 7, 
		RULE_assignmentexpression = 8, RULE_pureexpression = 9, RULE_comparisonexpression = 10;
	public static final String[] ruleNames = {
		"start", "mapops", "udf", "expression", "simpleexpression", "tupleexpression", 
		"complexexpression", "assignmentexpressions", "assignmentexpression", 
		"pureexpression", "comparisonexpression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'range'", "'collect'", "'map'", null, "'sc'", "'val'", "'if'", 
		"'else'", "'='", "'.'", "'{'", "'}'", "'('", "')'", "','", "';'", "'=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "WHITESPACE", "SC", "VAL", "IF", "ELSE", "ASSIGN", 
		"DOT", "LB", "RB", "LP", "RP", "COMMA", "SEMICOLON", "ARROW", "OP", "COMP", 
		"ID", "NUMBER"
	};
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
	public String getGrammarFileName() { return "Rdd.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RddParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public TerminalNode SC() { return getToken(RddParser.SC, 0); }
		public List<TerminalNode> DOT() { return getTokens(RddParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(RddParser.DOT, i);
		}
		public List<TerminalNode> LP() { return getTokens(RddParser.LP); }
		public TerminalNode LP(int i) {
			return getToken(RddParser.LP, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(RddParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(RddParser.NUMBER, i);
		}
		public TerminalNode COMMA() { return getToken(RddParser.COMMA, 0); }
		public List<TerminalNode> RP() { return getTokens(RddParser.RP); }
		public TerminalNode RP(int i) {
			return getToken(RddParser.RP, i);
		}
		public MapopsContext mapops() {
			return getRuleContext(MapopsContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			match(SC);
			setState(23);
			match(DOT);
			setState(24);
			match(T__0);
			setState(25);
			match(LP);
			setState(26);
			match(NUMBER);
			setState(27);
			match(COMMA);
			setState(28);
			match(NUMBER);
			setState(29);
			match(RP);
			setState(30);
			mapops(0);
			setState(31);
			match(DOT);
			setState(32);
			match(T__1);
			setState(33);
			match(LP);
			setState(34);
			match(RP);
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

	public static class MapopsContext extends ParserRuleContext {
		public MapopsContext mapops() {
			return getRuleContext(MapopsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(RddParser.DOT, 0); }
		public TerminalNode LP() { return getToken(RddParser.LP, 0); }
		public UdfContext udf() {
			return getRuleContext(UdfContext.class,0);
		}
		public TerminalNode RP() { return getToken(RddParser.RP, 0); }
		public MapopsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapops; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).enterMapops(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).exitMapops(this);
		}
	}

	public final MapopsContext mapops() throws RecognitionException {
		return mapops(0);
	}

	private MapopsContext mapops(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MapopsContext _localctx = new MapopsContext(_ctx, _parentState);
		MapopsContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_mapops, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MapopsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mapops);
					setState(37);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(38);
					match(DOT);
					setState(39);
					match(T__2);
					setState(40);
					match(LP);
					setState(41);
					udf();
					setState(42);
					match(RP);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
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

	public static class UdfContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(RddParser.ID, 0); }
		public TerminalNode ARROW() { return getToken(RddParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UdfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_udf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).enterUdf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).exitUdf(this);
		}
	}

	public final UdfContext udf() throws RecognitionException {
		UdfContext _localctx = new UdfContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_udf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(ID);
			setState(50);
			match(ARROW);
			setState(51);
			expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public SimpleexpressionContext simpleexpression() {
			return getRuleContext(SimpleexpressionContext.class,0);
		}
		public TerminalNode LB() { return getToken(RddParser.LB, 0); }
		public ComplexexpressionContext complexexpression() {
			return getRuleContext(ComplexexpressionContext.class,0);
		}
		public TerminalNode RB() { return getToken(RddParser.RB, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case LP:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				simpleexpression();
				}
				break;
			case LB:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(LB);
				setState(55);
				complexexpression();
				setState(56);
				match(RB);
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

	public static class SimpleexpressionContext extends ParserRuleContext {
		public PureexpressionContext pureexpression() {
			return getRuleContext(PureexpressionContext.class,0);
		}
		public TerminalNode LP() { return getToken(RddParser.LP, 0); }
		public TupleexpressionContext tupleexpression() {
			return getRuleContext(TupleexpressionContext.class,0);
		}
		public TerminalNode RP() { return getToken(RddParser.RP, 0); }
		public SimpleexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).enterSimpleexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).exitSimpleexpression(this);
		}
	}

	public final SimpleexpressionContext simpleexpression() throws RecognitionException {
		SimpleexpressionContext _localctx = new SimpleexpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_simpleexpression);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(60);
				pureexpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(61);
				match(LP);
				setState(62);
				tupleexpression(0);
				setState(63);
				match(RP);
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

	public static class TupleexpressionContext extends ParserRuleContext {
		public List<PureexpressionContext> pureexpression() {
			return getRuleContexts(PureexpressionContext.class);
		}
		public PureexpressionContext pureexpression(int i) {
			return getRuleContext(PureexpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(RddParser.COMMA, 0); }
		public TupleexpressionContext tupleexpression() {
			return getRuleContext(TupleexpressionContext.class,0);
		}
		public TupleexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).enterTupleexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).exitTupleexpression(this);
		}
	}

	public final TupleexpressionContext tupleexpression() throws RecognitionException {
		return tupleexpression(0);
	}

	private TupleexpressionContext tupleexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TupleexpressionContext _localctx = new TupleexpressionContext(_ctx, _parentState);
		TupleexpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_tupleexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(68);
			pureexpression(0);
			setState(69);
			match(COMMA);
			setState(70);
			pureexpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(77);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TupleexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_tupleexpression);
					setState(72);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(73);
					match(COMMA);
					setState(74);
					pureexpression(0);
					}
					} 
				}
				setState(79);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class ComplexexpressionContext extends ParserRuleContext {
		public SimpleexpressionContext simpleexpression() {
			return getRuleContext(SimpleexpressionContext.class,0);
		}
		public AssignmentexpressionsContext assignmentexpressions() {
			return getRuleContext(AssignmentexpressionsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RddParser.SEMICOLON, 0); }
		public ComplexexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).enterComplexexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).exitComplexexpression(this);
		}
	}

	public final ComplexexpressionContext complexexpression() throws RecognitionException {
		ComplexexpressionContext _localctx = new ComplexexpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_complexexpression);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case LP:
			case ID:
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				simpleexpression();
				}
				break;
			case VAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				assignmentexpressions(0);
				setState(82);
				match(SEMICOLON);
				setState(83);
				simpleexpression();
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

	public static class AssignmentexpressionsContext extends ParserRuleContext {
		public AssignmentexpressionContext assignmentexpression() {
			return getRuleContext(AssignmentexpressionContext.class,0);
		}
		public AssignmentexpressionsContext assignmentexpressions() {
			return getRuleContext(AssignmentexpressionsContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(RddParser.SEMICOLON, 0); }
		public AssignmentexpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).enterAssignmentexpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).exitAssignmentexpressions(this);
		}
	}

	public final AssignmentexpressionsContext assignmentexpressions() throws RecognitionException {
		return assignmentexpressions(0);
	}

	private AssignmentexpressionsContext assignmentexpressions(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AssignmentexpressionsContext _localctx = new AssignmentexpressionsContext(_ctx, _parentState);
		AssignmentexpressionsContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_assignmentexpressions, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(88);
			assignmentexpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AssignmentexpressionsContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_assignmentexpressions);
					setState(90);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(91);
					match(SEMICOLON);
					setState(92);
					assignmentexpression();
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class AssignmentexpressionContext extends ParserRuleContext {
		public TerminalNode VAL() { return getToken(RddParser.VAL, 0); }
		public TerminalNode ID() { return getToken(RddParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(RddParser.ASSIGN, 0); }
		public PureexpressionContext pureexpression() {
			return getRuleContext(PureexpressionContext.class,0);
		}
		public AssignmentexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).enterAssignmentexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).exitAssignmentexpression(this);
		}
	}

	public final AssignmentexpressionContext assignmentexpression() throws RecognitionException {
		AssignmentexpressionContext _localctx = new AssignmentexpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignmentexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(VAL);
			setState(99);
			match(ID);
			setState(100);
			match(ASSIGN);
			setState(101);
			pureexpression(0);
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

	public static class PureexpressionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(RddParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(RddParser.ID, i);
		}
		public TerminalNode DOT() { return getToken(RddParser.DOT, 0); }
		public TerminalNode NUMBER() { return getToken(RddParser.NUMBER, 0); }
		public TerminalNode LP() { return getToken(RddParser.LP, 0); }
		public List<PureexpressionContext> pureexpression() {
			return getRuleContexts(PureexpressionContext.class);
		}
		public PureexpressionContext pureexpression(int i) {
			return getRuleContext(PureexpressionContext.class,i);
		}
		public TerminalNode RP() { return getToken(RddParser.RP, 0); }
		public TerminalNode IF() { return getToken(RddParser.IF, 0); }
		public ComparisonexpressionContext comparisonexpression() {
			return getRuleContext(ComparisonexpressionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(RddParser.ELSE, 0); }
		public TerminalNode OP() { return getToken(RddParser.OP, 0); }
		public PureexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pureexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).enterPureexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).exitPureexpression(this);
		}
	}

	public final PureexpressionContext pureexpression() throws RecognitionException {
		return pureexpression(0);
	}

	private PureexpressionContext pureexpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PureexpressionContext _localctx = new PureexpressionContext(_ctx, _parentState);
		PureexpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_pureexpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(104);
				match(ID);
				}
				break;
			case 2:
				{
				setState(105);
				match(ID);
				setState(106);
				match(DOT);
				setState(107);
				match(ID);
				}
				break;
			case 3:
				{
				setState(108);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(109);
				match(LP);
				setState(110);
				pureexpression(0);
				setState(111);
				match(RP);
				}
				break;
			case 5:
				{
				setState(113);
				match(IF);
				setState(114);
				match(LP);
				setState(115);
				comparisonexpression();
				setState(116);
				match(RP);
				setState(117);
				pureexpression(0);
				setState(118);
				match(ELSE);
				setState(119);
				pureexpression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(128);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PureexpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pureexpression);
					setState(123);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(124);
					match(OP);
					setState(125);
					pureexpression(3);
					}
					} 
				}
				setState(130);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ComparisonexpressionContext extends ParserRuleContext {
		public List<PureexpressionContext> pureexpression() {
			return getRuleContexts(PureexpressionContext.class);
		}
		public PureexpressionContext pureexpression(int i) {
			return getRuleContext(PureexpressionContext.class,i);
		}
		public TerminalNode COMP() { return getToken(RddParser.COMP, 0); }
		public ComparisonexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonexpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).enterComparisonexpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RddListener ) ((RddListener)listener).exitComparisonexpression(this);
		}
	}

	public final ComparisonexpressionContext comparisonexpression() throws RecognitionException {
		ComparisonexpressionContext _localctx = new ComparisonexpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comparisonexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			pureexpression(0);
			setState(132);
			match(COMP);
			setState(133);
			pureexpression(0);
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
		case 1:
			return mapops_sempred((MapopsContext)_localctx, predIndex);
		case 5:
			return tupleexpression_sempred((TupleexpressionContext)_localctx, predIndex);
		case 7:
			return assignmentexpressions_sempred((AssignmentexpressionsContext)_localctx, predIndex);
		case 9:
			return pureexpression_sempred((PureexpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mapops_sempred(MapopsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean tupleexpression_sempred(TupleexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignmentexpressions_sempred(AssignmentexpressionsContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean pureexpression_sempred(PureexpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27\u008a\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3/\n\3\f\3\16\3\62\13\3\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\5\5=\n\5\3\6\3\6\3\6\3\6\3\6\5\6D\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7N\n\7\f\7\16\7Q\13\7\3\b\3\b\3\b\3\b\3\b\5"+
		"\bX\n\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t`\n\t\f\t\16\tc\13\t\3\n\3\n\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13|\n\13\3\13\3\13\3\13\7\13\u0081\n\13\f"+
		"\13\16\13\u0084\13\13\3\f\3\f\3\f\3\f\3\f\2\6\4\f\20\24\r\2\4\6\b\n\f"+
		"\16\20\22\24\26\2\2\2\u0089\2\30\3\2\2\2\4&\3\2\2\2\6\63\3\2\2\2\b<\3"+
		"\2\2\2\nC\3\2\2\2\fE\3\2\2\2\16W\3\2\2\2\20Y\3\2\2\2\22d\3\2\2\2\24{\3"+
		"\2\2\2\26\u0085\3\2\2\2\30\31\7\7\2\2\31\32\7\f\2\2\32\33\7\3\2\2\33\34"+
		"\7\17\2\2\34\35\7\27\2\2\35\36\7\21\2\2\36\37\7\27\2\2\37 \7\20\2\2 !"+
		"\5\4\3\2!\"\7\f\2\2\"#\7\4\2\2#$\7\17\2\2$%\7\20\2\2%\3\3\2\2\2&\60\b"+
		"\3\1\2\'(\f\4\2\2()\7\f\2\2)*\7\5\2\2*+\7\17\2\2+,\5\6\4\2,-\7\20\2\2"+
		"-/\3\2\2\2.\'\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2"+
		"\2\62\60\3\2\2\2\63\64\7\26\2\2\64\65\7\23\2\2\65\66\5\b\5\2\66\7\3\2"+
		"\2\2\67=\5\n\6\289\7\r\2\29:\5\16\b\2:;\7\16\2\2;=\3\2\2\2<\67\3\2\2\2"+
		"<8\3\2\2\2=\t\3\2\2\2>D\5\24\13\2?@\7\17\2\2@A\5\f\7\2AB\7\20\2\2BD\3"+
		"\2\2\2C>\3\2\2\2C?\3\2\2\2D\13\3\2\2\2EF\b\7\1\2FG\5\24\13\2GH\7\21\2"+
		"\2HI\5\24\13\2IO\3\2\2\2JK\f\3\2\2KL\7\21\2\2LN\5\24\13\2MJ\3\2\2\2NQ"+
		"\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\r\3\2\2\2QO\3\2\2\2RX\5\n\6\2ST\5\20\t\2"+
		"TU\7\22\2\2UV\5\n\6\2VX\3\2\2\2WR\3\2\2\2WS\3\2\2\2X\17\3\2\2\2YZ\b\t"+
		"\1\2Z[\5\22\n\2[a\3\2\2\2\\]\f\3\2\2]^\7\22\2\2^`\5\22\n\2_\\\3\2\2\2"+
		"`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\21\3\2\2\2ca\3\2\2\2de\7\b\2\2ef\7\26"+
		"\2\2fg\7\13\2\2gh\5\24\13\2h\23\3\2\2\2ij\b\13\1\2j|\7\26\2\2kl\7\26\2"+
		"\2lm\7\f\2\2m|\7\26\2\2n|\7\27\2\2op\7\17\2\2pq\5\24\13\2qr\7\20\2\2r"+
		"|\3\2\2\2st\7\t\2\2tu\7\17\2\2uv\5\26\f\2vw\7\20\2\2wx\5\24\13\2xy\7\n"+
		"\2\2yz\5\24\13\3z|\3\2\2\2{i\3\2\2\2{k\3\2\2\2{n\3\2\2\2{o\3\2\2\2{s\3"+
		"\2\2\2|\u0082\3\2\2\2}~\f\4\2\2~\177\7\24\2\2\177\u0081\5\24\13\5\u0080"+
		"}\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\25\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0086\5\24\13\2\u0086\u0087"+
		"\7\25\2\2\u0087\u0088\5\24\13\2\u0088\27\3\2\2\2\n\60<COWa{\u0082";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}