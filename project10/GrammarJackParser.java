// Generated from GrammarJack.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarJackParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INTEGERCONSTANT=1, STRINGCONSTANT=2, KW1=3, KW2=4, KW3=5, KW4=6, KW5=7, 
		KW6=8, KW7=9, KW8=10, KW9=11, KW10=12, KW11=13, KW12=14, KW13=15, KW14=16, 
		KW15=17, KW16=18, KW17=19, KW18=20, KW19=21, KW20=22, KW21=23, SIM1=24, 
		SIM2=25, SIM3=26, SIM4=27, SIM5=28, SIM6=29, SIM7=30, SIM8=31, SIM9=32, 
		SIM10=33, SIM11=34, SIM12=35, SIM13=36, SIM14=37, SIM15=38, SIM16=39, 
		SIM17=40, SIM18=41, SIM19=42, IDENTIFIER=43, WS=44, LINE_COMMENT=45, BLOCK_COMMENT=46;
	public static final int
		RULE_classAxiom = 0, RULE_classVarDec = 1, RULE_type = 2, RULE_subroutineDec = 3, 
		RULE_parameterList = 4, RULE_subroutineBody = 5, RULE_varDec = 6, RULE_className = 7, 
		RULE_subroutineName = 8, RULE_varName = 9, RULE_statements = 10, RULE_statement = 11, 
		RULE_letStatement = 12, RULE_ifStatement = 13, RULE_whileStatement = 14, 
		RULE_doStatement = 15, RULE_returnStatement = 16, RULE_expression = 17, 
		RULE_term = 18, RULE_subroutineCall = 19, RULE_expressionList = 20, RULE_operator = 21, 
		RULE_unaryOperator = 22, RULE_keywordConstant = 23;
	public static final String[] ruleNames = {
		"classAxiom", "classVarDec", "type", "subroutineDec", "parameterList", 
		"subroutineBody", "varDec", "className", "subroutineName", "varName", 
		"statements", "statement", "letStatement", "ifStatement", "whileStatement", 
		"doStatement", "returnStatement", "expression", "term", "subroutineCall", 
		"expressionList", "operator", "unaryOperator", "keywordConstant"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'class'", "'constructor'", "'function'", "'method'", 
		"'field'", "'static'", "'var'", "'int'", "'char'", "'boolean'", "'void'", 
		"'true'", "'false'", "'null'", "'this'", "'let'", "'do'", "'if'", "'else'", 
		"'while'", "'return'", "'{'", "'}'", "'('", "')'", "'['", "']'", "'.'", 
		"','", "';'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'<'", "'>'", 
		"'='", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INTEGERCONSTANT", "STRINGCONSTANT", "KW1", "KW2", "KW3", "KW4", 
		"KW5", "KW6", "KW7", "KW8", "KW9", "KW10", "KW11", "KW12", "KW13", "KW14", 
		"KW15", "KW16", "KW17", "KW18", "KW19", "KW20", "KW21", "SIM1", "SIM2", 
		"SIM3", "SIM4", "SIM5", "SIM6", "SIM7", "SIM8", "SIM9", "SIM10", "SIM11", 
		"SIM12", "SIM13", "SIM14", "SIM15", "SIM16", "SIM17", "SIM18", "SIM19", 
		"IDENTIFIER", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "GrammarJack.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarJackParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ClassAxiomContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public List<ClassVarDecContext> classVarDec() {
			return getRuleContexts(ClassVarDecContext.class);
		}
		public ClassVarDecContext classVarDec(int i) {
			return getRuleContext(ClassVarDecContext.class,i);
		}
		public List<SubroutineDecContext> subroutineDec() {
			return getRuleContexts(SubroutineDecContext.class);
		}
		public SubroutineDecContext subroutineDec(int i) {
			return getRuleContext(SubroutineDecContext.class,i);
		}
		public ClassAxiomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classAxiom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterClassAxiom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitClassAxiom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitClassAxiom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassAxiomContext classAxiom() throws RecognitionException {
		ClassAxiomContext _localctx = new ClassAxiomContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_classAxiom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(KW1);
			setState(49);
			className();
			setState(50);
			match(SIM1);
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW5 || _la==KW6) {
				{
				{
				setState(51);
				classVarDec();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW2) | (1L << KW3) | (1L << KW4))) != 0)) {
				{
				{
				setState(57);
				subroutineDec();
				}
				}
				setState(62);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(63);
			match(SIM2);
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

	public static class ClassVarDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public ClassVarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classVarDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterClassVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitClassVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitClassVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassVarDecContext classVarDec() throws RecognitionException {
		ClassVarDecContext _localctx = new ClassVarDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classVarDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_la = _input.LA(1);
			if ( !(_la==KW5 || _la==KW6) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(66);
			type();
			setState(67);
			varName();
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIM8) {
				{
				{
				setState(68);
				match(SIM8);
				setState(69);
				varName();
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(SIM9);
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

	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NombreClaseContext extends TypeContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public NombreClaseContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterNombreClase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitNombreClase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitNombreClase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CaracterContext extends TypeContext {
		public CaracterContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterCaracter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitCaracter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitCaracter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanoContext extends TypeContext {
		public BooleanoContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EnteroContext extends TypeContext {
		public EnteroContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitEntero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitEntero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_type);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW8:
				_localctx = new EnteroContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(KW8);
				}
				break;
			case KW9:
				_localctx = new CaracterContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				match(KW9);
				}
				break;
			case KW10:
				_localctx = new BooleanoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				match(KW10);
				}
				break;
			case IDENTIFIER:
				_localctx = new NombreClaseContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				className();
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

	public static class SubroutineDecContext extends ParserRuleContext {
		public SubroutineNameContext subroutineName() {
			return getRuleContext(SubroutineNameContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public SubroutineBodyContext subroutineBody() {
			return getRuleContext(SubroutineBodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SubroutineDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterSubroutineDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitSubroutineDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitSubroutineDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineDecContext subroutineDec() throws RecognitionException {
		SubroutineDecContext _localctx = new SubroutineDecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_subroutineDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW2) | (1L << KW3) | (1L << KW4))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW11:
				{
				setState(84);
				match(KW11);
				}
				break;
			case KW8:
			case KW9:
			case KW10:
			case IDENTIFIER:
				{
				setState(85);
				type();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(88);
			subroutineName();
			setState(89);
			match(SIM3);
			setState(90);
			parameterList();
			setState(91);
			match(SIM4);
			setState(92);
			subroutineBody();
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW8) | (1L << KW9) | (1L << KW10) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(94);
				type();
				setState(95);
				varName();
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SIM8) {
					{
					{
					setState(97);
					match(SIM8);
					setState(98);
					type();
					setState(99);
					varName();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class SubroutineBodyContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public List<VarDecContext> varDec() {
			return getRuleContexts(VarDecContext.class);
		}
		public VarDecContext varDec(int i) {
			return getRuleContext(VarDecContext.class,i);
		}
		public SubroutineBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterSubroutineBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitSubroutineBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitSubroutineBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineBodyContext subroutineBody() throws RecognitionException {
		SubroutineBodyContext _localctx = new SubroutineBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_subroutineBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(SIM1);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==KW7) {
				{
				{
				setState(109);
				varDec();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			statements();
			setState(116);
			match(SIM2);
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

	public static class VarDecContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarNameContext> varName() {
			return getRuleContexts(VarNameContext.class);
		}
		public VarNameContext varName(int i) {
			return getRuleContext(VarNameContext.class,i);
		}
		public VarDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterVarDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitVarDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitVarDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecContext varDec() throws RecognitionException {
		VarDecContext _localctx = new VarDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_varDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(KW7);
			setState(119);
			type();
			setState(120);
			varName();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SIM8) {
				{
				{
				setState(121);
				match(SIM8);
				setState(122);
				varName();
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(128);
			match(SIM9);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GrammarJackParser.IDENTIFIER, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitClassName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
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

	public static class SubroutineNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GrammarJackParser.IDENTIFIER, 0); }
		public SubroutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterSubroutineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitSubroutineName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitSubroutineName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineNameContext subroutineName() throws RecognitionException {
		SubroutineNameContext _localctx = new SubroutineNameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_subroutineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
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

	public static class VarNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(GrammarJackParser.IDENTIFIER, 0); }
		public VarNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterVarName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitVarName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitVarName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarNameContext varName() throws RecognitionException {
		VarNameContext _localctx = new VarNameContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
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

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW16) | (1L << KW17) | (1L << KW18) | (1L << KW20) | (1L << KW21))) != 0)) {
				{
				{
				setState(136);
				statement();
				}
				}
				setState(141);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OperationDoContext extends StatementContext {
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public OperationDoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterOperationDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitOperationDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitOperationDo(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationWhileContext extends StatementContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public OperationWhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterOperationWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitOperationWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitOperationWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationReturnContext extends StatementContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public OperationReturnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterOperationReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitOperationReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitOperationReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationLetContext extends StatementContext {
		public LetStatementContext letStatement() {
			return getRuleContext(LetStatementContext.class,0);
		}
		public OperationLetContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterOperationLet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitOperationLet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitOperationLet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OperationIfContext extends StatementContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public OperationIfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterOperationIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitOperationIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitOperationIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW16:
				_localctx = new OperationLetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				letStatement();
				}
				break;
			case KW18:
				_localctx = new OperationIfContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				ifStatement();
				}
				break;
			case KW20:
				_localctx = new OperationWhileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				whileStatement();
				}
				break;
			case KW17:
				_localctx = new OperationDoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(145);
				doStatement();
				}
				break;
			case KW21:
				_localctx = new OperationReturnContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(146);
				returnStatement();
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

	public static class LetStatementContext extends ParserRuleContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LetStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterLetStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitLetStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitLetStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetStatementContext letStatement() throws RecognitionException {
		LetStatementContext _localctx = new LetStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_letStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(KW16);
			setState(150);
			varName();
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SIM5) {
				{
				setState(151);
				match(SIM5);
				setState(152);
				expression();
				setState(153);
				match(SIM6);
				}
			}

			setState(157);
			match(SIM18);
			setState(158);
			expression();
			setState(159);
			match(SIM9);
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

	public static class IfStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(KW18);
			setState(162);
			match(SIM3);
			setState(163);
			expression();
			setState(164);
			match(SIM4);
			setState(165);
			match(SIM1);
			setState(166);
			statements();
			setState(167);
			match(SIM2);
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW19) {
				{
				setState(168);
				match(KW19);
				setState(169);
				match(SIM1);
				setState(170);
				statements();
				setState(171);
				match(SIM2);
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

	public static class WhileStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(KW20);
			setState(176);
			match(SIM3);
			setState(177);
			expression();
			setState(178);
			match(SIM4);
			setState(179);
			match(SIM1);
			setState(180);
			statements();
			setState(181);
			match(SIM2);
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

	public static class DoStatementContext extends ParserRuleContext {
		public SubroutineCallContext subroutineCall() {
			return getRuleContext(SubroutineCallContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitDoStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitDoStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_doStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(KW17);
			setState(184);
			subroutineCall();
			setState(185);
			match(SIM9);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(KW21);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONSTANT) | (1L << STRINGCONSTANT) | (1L << KW12) | (1L << KW13) | (1L << KW14) | (1L << KW15) | (1L << SIM3) | (1L << SIM11) | (1L << SIM19) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(188);
				expression();
				}
			}

			setState(191);
			match(SIM9);
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
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			term();
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIM10) | (1L << SIM11) | (1L << SIM12) | (1L << SIM13) | (1L << SIM14) | (1L << SIM15) | (1L << SIM16) | (1L << SIM17) | (1L << SIM18))) != 0)) {
				{
				{
				setState(194);
				operator();
				setState(195);
				term();
				}
				}
				setState(201);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpresionParentContext extends TermContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpresionParentContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterExpresionParent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitExpresionParent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitExpresionParent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableNameContext extends TermContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public VariableNameContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitVariableName(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantKeywordContext extends TermContext {
		public KeywordConstantContext keywordConstant() {
			return getRuleContext(KeywordConstantContext.class,0);
		}
		public ConstantKeywordContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterConstantKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitConstantKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitConstantKeyword(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubroutCallContext extends TermContext {
		public SubroutineCallContext subroutineCall() {
			return getRuleContext(SubroutineCallContext.class,0);
		}
		public SubroutCallContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterSubroutCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitSubroutCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitSubroutCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryOpContext extends TermContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public UnaryOpContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarArrayContext extends TermContext {
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarArrayContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterVarArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitVarArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitVarArray(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantStringContext extends TermContext {
		public TerminalNode STRINGCONSTANT() { return getToken(GrammarJackParser.STRINGCONSTANT, 0); }
		public ConstantStringContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterConstantString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitConstantString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitConstantString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantIntContext extends TermContext {
		public TerminalNode INTEGERCONSTANT() { return getToken(GrammarJackParser.INTEGERCONSTANT, 0); }
		public ConstantIntContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterConstantInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitConstantInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitConstantInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_term);
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				_localctx = new ConstantIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				match(INTEGERCONSTANT);
				}
				break;
			case 2:
				_localctx = new ConstantStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(STRINGCONSTANT);
				}
				break;
			case 3:
				_localctx = new ConstantKeywordContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				keywordConstant();
				}
				break;
			case 4:
				_localctx = new VariableNameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				varName();
				}
				break;
			case 5:
				_localctx = new VarArrayContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				varName();
				setState(207);
				match(SIM5);
				setState(208);
				expression();
				setState(209);
				match(SIM6);
				}
				break;
			case 6:
				_localctx = new SubroutCallContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(211);
				subroutineCall();
				}
				break;
			case 7:
				_localctx = new ExpresionParentContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(212);
				match(SIM3);
				setState(213);
				expression();
				setState(214);
				match(SIM4);
				}
				break;
			case 8:
				_localctx = new UnaryOpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(216);
				unaryOperator();
				setState(217);
				term();
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

	public static class SubroutineCallContext extends ParserRuleContext {
		public SubroutineCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subroutineCall; }
	 
		public SubroutineCallContext() { }
		public void copyFrom(SubroutineCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjectCallContext extends SubroutineCallContext {
		public SubroutineNameContext subroutineName() {
			return getRuleContext(SubroutineNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public VarNameContext varName() {
			return getRuleContext(VarNameContext.class,0);
		}
		public ObjectCallContext(SubroutineCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterObjectCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitObjectCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitObjectCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectCallContext extends SubroutineCallContext {
		public SubroutineNameContext subroutineName() {
			return getRuleContext(SubroutineNameContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public DirectCallContext(SubroutineCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterDirectCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitDirectCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitDirectCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubroutineCallContext subroutineCall() throws RecognitionException {
		SubroutineCallContext _localctx = new SubroutineCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_subroutineCall);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new DirectCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				subroutineName();
				setState(222);
				match(SIM3);
				setState(223);
				expressionList();
				setState(224);
				match(SIM4);
				}
				break;
			case 2:
				_localctx = new ObjectCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(228);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(226);
					className();
					}
					break;
				case 2:
					{
					setState(227);
					varName();
					}
					break;
				}
				setState(230);
				match(SIM7);
				setState(231);
				subroutineName();
				setState(232);
				match(SIM3);
				setState(233);
				expressionList();
				setState(234);
				match(SIM4);
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

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INTEGERCONSTANT) | (1L << STRINGCONSTANT) | (1L << KW12) | (1L << KW13) | (1L << KW14) | (1L << KW15) | (1L << SIM3) | (1L << SIM11) | (1L << SIM19) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(238);
				expression();
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==SIM8) {
					{
					{
					setState(239);
					match(SIM8);
					setState(240);
					expression();
					}
					}
					setState(245);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	public static class OperatorContext extends ParserRuleContext {
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
	 
		public OperatorContext() { }
		public void copyFrom(OperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SumaContext extends OperatorContext {
		public SumaContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitSuma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitSuma(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DivisionContext extends OperatorContext {
		public DivisionContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitDivision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitDivision(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends OperatorContext {
		public MultContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitMult(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends OperatorContext {
		public OrContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MayorContext extends OperatorContext {
		public MayorContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitMayor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends OperatorContext {
		public AndContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MenorContext extends OperatorContext {
		public MenorContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IgualContext extends OperatorContext {
		public IgualContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RestaContext extends OperatorContext {
		public RestaContext(OperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitResta(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitResta(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_operator);
		try {
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIM10:
				_localctx = new SumaContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(SIM10);
				}
				break;
			case SIM11:
				_localctx = new RestaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(SIM11);
				}
				break;
			case SIM12:
				_localctx = new MultContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(SIM12);
				}
				break;
			case SIM13:
				_localctx = new DivisionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(SIM13);
				}
				break;
			case SIM14:
				_localctx = new AndContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				match(SIM14);
				}
				break;
			case SIM15:
				_localctx = new OrContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				match(SIM15);
				}
				break;
			case SIM16:
				_localctx = new MenorContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(254);
				match(SIM16);
				}
				break;
			case SIM17:
				_localctx = new MayorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(255);
				match(SIM17);
				}
				break;
			case SIM18:
				_localctx = new IgualContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(256);
				match(SIM18);
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

	public static class UnaryOperatorContext extends ParserRuleContext {
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
	 
		public UnaryOperatorContext() { }
		public void copyFrom(UnaryOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegContext extends UnaryOperatorContext {
		public NegContext(UnaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterNeg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitNeg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitNeg(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends UnaryOperatorContext {
		public NotContext(UnaryOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_unaryOperator);
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIM11:
				_localctx = new NegContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(SIM11);
				}
				break;
			case SIM19:
				_localctx = new NotContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				match(SIM19);
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

	public static class KeywordConstantContext extends ParserRuleContext {
		public KeywordConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordConstant; }
	 
		public KeywordConstantContext() { }
		public void copyFrom(KeywordConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullContext extends KeywordConstantContext {
		public NullContext(KeywordConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitNull(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitNull(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrueContext extends KeywordConstantContext {
		public TrueContext(KeywordConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitTrue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitTrue(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FalseContext extends KeywordConstantContext {
		public FalseContext(KeywordConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitFalse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitFalse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ThisContext extends KeywordConstantContext {
		public ThisContext(KeywordConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).enterThis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarJackListener ) ((GrammarJackListener)listener).exitThis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarJackVisitor ) return ((GrammarJackVisitor<? extends T>)visitor).visitThis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordConstantContext keywordConstant() throws RecognitionException {
		KeywordConstantContext _localctx = new KeywordConstantContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_keywordConstant);
		try {
			setState(267);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW12:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(263);
				match(KW12);
				}
				break;
			case KW13:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(KW13);
				}
				break;
			case KW14:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(265);
				match(KW14);
				}
				break;
			case KW15:
				_localctx = new ThisContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(266);
				match(KW15);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0110\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\7\2=\n\2\f\2\16\2@\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\5\4T\n\4\3\5\3\5\3\5\5\5Y\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\7\6h\n\6\f\6\16\6k\13\6\5\6m\n\6\3\7\3\7\7\7q\n\7\f"+
		"\7\16\7t\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b~\n\b\f\b\16\b\u0081"+
		"\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\7\f\u008c\n\f\f\f\16\f\u008f"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\5\r\u0096\n\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16\u009e\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00b0\n\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\5\22\u00c0\n\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\7\23\u00c8\n\23\f\23\16\23\u00cb\13\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\5\24\u00de\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00e7\n\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\5\25\u00ef\n\25\3\26\3\26\3\26\7\26\u00f4"+
		"\n\26\f\26\16\26\u00f7\13\26\5\26\u00f9\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\5\27\u0104\n\27\3\30\3\30\5\30\u0108\n\30\3\31\3"+
		"\31\3\31\3\31\5\31\u010e\n\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\2\4\3\2\t\n\3\2\6\b\2\u0122\2\62\3\2\2\2\4C\3\2"+
		"\2\2\6S\3\2\2\2\bU\3\2\2\2\nl\3\2\2\2\fn\3\2\2\2\16x\3\2\2\2\20\u0084"+
		"\3\2\2\2\22\u0086\3\2\2\2\24\u0088\3\2\2\2\26\u008d\3\2\2\2\30\u0095\3"+
		"\2\2\2\32\u0097\3\2\2\2\34\u00a3\3\2\2\2\36\u00b1\3\2\2\2 \u00b9\3\2\2"+
		"\2\"\u00bd\3\2\2\2$\u00c3\3\2\2\2&\u00dd\3\2\2\2(\u00ee\3\2\2\2*\u00f8"+
		"\3\2\2\2,\u0103\3\2\2\2.\u0107\3\2\2\2\60\u010d\3\2\2\2\62\63\7\5\2\2"+
		"\63\64\5\20\t\2\648\7\32\2\2\65\67\5\4\3\2\66\65\3\2\2\2\67:\3\2\2\28"+
		"\66\3\2\2\289\3\2\2\29>\3\2\2\2:8\3\2\2\2;=\5\b\5\2<;\3\2\2\2=@\3\2\2"+
		"\2><\3\2\2\2>?\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\33\2\2B\3\3\2\2\2CD\t\2"+
		"\2\2DE\5\6\4\2EJ\5\24\13\2FG\7!\2\2GI\5\24\13\2HF\3\2\2\2IL\3\2\2\2JH"+
		"\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MN\7\"\2\2N\5\3\2\2\2OT\7\f\2\2"+
		"PT\7\r\2\2QT\7\16\2\2RT\5\20\t\2SO\3\2\2\2SP\3\2\2\2SQ\3\2\2\2SR\3\2\2"+
		"\2T\7\3\2\2\2UX\t\3\2\2VY\7\17\2\2WY\5\6\4\2XV\3\2\2\2XW\3\2\2\2YZ\3\2"+
		"\2\2Z[\5\22\n\2[\\\7\34\2\2\\]\5\n\6\2]^\7\35\2\2^_\5\f\7\2_\t\3\2\2\2"+
		"`a\5\6\4\2ab\5\24\13\2bi\3\2\2\2cd\7!\2\2de\5\6\4\2ef\5\24\13\2fh\3\2"+
		"\2\2gc\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jm\3\2\2\2ki\3\2\2\2l`\3\2"+
		"\2\2lm\3\2\2\2m\13\3\2\2\2nr\7\32\2\2oq\5\16\b\2po\3\2\2\2qt\3\2\2\2r"+
		"p\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\5\26\f\2vw\7\33\2\2w\r\3\2\2"+
		"\2xy\7\13\2\2yz\5\6\4\2z\177\5\24\13\2{|\7!\2\2|~\5\24\13\2}{\3\2\2\2"+
		"~\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081"+
		"\177\3\2\2\2\u0082\u0083\7\"\2\2\u0083\17\3\2\2\2\u0084\u0085\7-\2\2\u0085"+
		"\21\3\2\2\2\u0086\u0087\7-\2\2\u0087\23\3\2\2\2\u0088\u0089\7-\2\2\u0089"+
		"\25\3\2\2\2\u008a\u008c\5\30\r\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2"+
		"\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\27\3\2\2\2\u008f\u008d"+
		"\3\2\2\2\u0090\u0096\5\32\16\2\u0091\u0096\5\34\17\2\u0092\u0096\5\36"+
		"\20\2\u0093\u0096\5 \21\2\u0094\u0096\5\"\22\2\u0095\u0090\3\2\2\2\u0095"+
		"\u0091\3\2\2\2\u0095\u0092\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0094\3\2"+
		"\2\2\u0096\31\3\2\2\2\u0097\u0098\7\24\2\2\u0098\u009d\5\24\13\2\u0099"+
		"\u009a\7\36\2\2\u009a\u009b\5$\23\2\u009b\u009c\7\37\2\2\u009c\u009e\3"+
		"\2\2\2\u009d\u0099\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\7+\2\2\u00a0\u00a1\5$\23\2\u00a1\u00a2\7\"\2\2\u00a2\33\3\2\2\2"+
		"\u00a3\u00a4\7\26\2\2\u00a4\u00a5\7\34\2\2\u00a5\u00a6\5$\23\2\u00a6\u00a7"+
		"\7\35\2\2\u00a7\u00a8\7\32\2\2\u00a8\u00a9\5\26\f\2\u00a9\u00af\7\33\2"+
		"\2\u00aa\u00ab\7\27\2\2\u00ab\u00ac\7\32\2\2\u00ac\u00ad\5\26\f\2\u00ad"+
		"\u00ae\7\33\2\2\u00ae\u00b0\3\2\2\2\u00af\u00aa\3\2\2\2\u00af\u00b0\3"+
		"\2\2\2\u00b0\35\3\2\2\2\u00b1\u00b2\7\30\2\2\u00b2\u00b3\7\34\2\2\u00b3"+
		"\u00b4\5$\23\2\u00b4\u00b5\7\35\2\2\u00b5\u00b6\7\32\2\2\u00b6\u00b7\5"+
		"\26\f\2\u00b7\u00b8\7\33\2\2\u00b8\37\3\2\2\2\u00b9\u00ba\7\25\2\2\u00ba"+
		"\u00bb\5(\25\2\u00bb\u00bc\7\"\2\2\u00bc!\3\2\2\2\u00bd\u00bf\7\31\2\2"+
		"\u00be\u00c0\5$\23\2\u00bf\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1"+
		"\3\2\2\2\u00c1\u00c2\7\"\2\2\u00c2#\3\2\2\2\u00c3\u00c9\5&\24\2\u00c4"+
		"\u00c5\5,\27\2\u00c5\u00c6\5&\24\2\u00c6\u00c8\3\2\2\2\u00c7\u00c4\3\2"+
		"\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"%\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00de\7\3\2\2\u00cd\u00de\7\4\2\2"+
		"\u00ce\u00de\5\60\31\2\u00cf\u00de\5\24\13\2\u00d0\u00d1\5\24\13\2\u00d1"+
		"\u00d2\7\36\2\2\u00d2\u00d3\5$\23\2\u00d3\u00d4\7\37\2\2\u00d4\u00de\3"+
		"\2\2\2\u00d5\u00de\5(\25\2\u00d6\u00d7\7\34\2\2\u00d7\u00d8\5$\23\2\u00d8"+
		"\u00d9\7\35\2\2\u00d9\u00de\3\2\2\2\u00da\u00db\5.\30\2\u00db\u00dc\5"+
		"&\24\2\u00dc\u00de\3\2\2\2\u00dd\u00cc\3\2\2\2\u00dd\u00cd\3\2\2\2\u00dd"+
		"\u00ce\3\2\2\2\u00dd\u00cf\3\2\2\2\u00dd\u00d0\3\2\2\2\u00dd\u00d5\3\2"+
		"\2\2\u00dd\u00d6\3\2\2\2\u00dd\u00da\3\2\2\2\u00de\'\3\2\2\2\u00df\u00e0"+
		"\5\22\n\2\u00e0\u00e1\7\34\2\2\u00e1\u00e2\5*\26\2\u00e2\u00e3\7\35\2"+
		"\2\u00e3\u00ef\3\2\2\2\u00e4\u00e7\5\20\t\2\u00e5\u00e7\5\24\13\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9\7 "+
		"\2\2\u00e9\u00ea\5\22\n\2\u00ea\u00eb\7\34\2\2\u00eb\u00ec\5*\26\2\u00ec"+
		"\u00ed\7\35\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00df\3\2\2\2\u00ee\u00e6\3"+
		"\2\2\2\u00ef)\3\2\2\2\u00f0\u00f5\5$\23\2\u00f1\u00f2\7!\2\2\u00f2\u00f4"+
		"\5$\23\2\u00f3\u00f1\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00f0\3\2"+
		"\2\2\u00f8\u00f9\3\2\2\2\u00f9+\3\2\2\2\u00fa\u0104\7#\2\2\u00fb\u0104"+
		"\7$\2\2\u00fc\u0104\7%\2\2\u00fd\u0104\7&\2\2\u00fe\u0104\7\'\2\2\u00ff"+
		"\u0104\7(\2\2\u0100\u0104\7)\2\2\u0101\u0104\7*\2\2\u0102\u0104\7+\2\2"+
		"\u0103\u00fa\3\2\2\2\u0103\u00fb\3\2\2\2\u0103\u00fc\3\2\2\2\u0103\u00fd"+
		"\3\2\2\2\u0103\u00fe\3\2\2\2\u0103\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0102\3\2\2\2\u0104-\3\2\2\2\u0105\u0108\7$\2\2\u0106"+
		"\u0108\7,\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108/\3\2\2\2\u0109"+
		"\u010e\7\20\2\2\u010a\u010e\7\21\2\2\u010b\u010e\7\22\2\2\u010c\u010e"+
		"\7\23\2\2\u010d\u0109\3\2\2\2\u010d\u010a\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010d\u010c\3\2\2\2\u010e\61\3\2\2\2\318>JSXilr\177\u008d\u0095\u009d"+
		"\u00af\u00bf\u00c9\u00dd\u00e6\u00ee\u00f5\u00f8\u0103\u0107\u010d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}