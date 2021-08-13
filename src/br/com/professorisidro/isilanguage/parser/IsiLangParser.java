// Generated from IsiLang.g4 by ANTLR 4.7.1
package br.com.professorisidro.isilanguage.parser;

	import br.com.professorisidro.isilanguage.datastructures.IsiSymbol;
	import br.com.professorisidro.isilanguage.datastructures.IsiVariable;
	import br.com.professorisidro.isilanguage.datastructures.IsiSymbolTable;
	import br.com.professorisidro.isilanguage.exceptions.IsiSemanticException;
	import br.com.professorisidro.isilanguage.ast.IsiProgram;
	import br.com.professorisidro.isilanguage.ast.AbstractCommand;
	import br.com.professorisidro.isilanguage.ast.CommandLeitura;
	import br.com.professorisidro.isilanguage.ast.CommandEscrita;
	import br.com.professorisidro.isilanguage.ast.CommandAtribuicao;
	import br.com.professorisidro.isilanguage.ast.CommandAtribueVector;
	import br.com.professorisidro.isilanguage.ast.CommandDecisao;
	import br.com.professorisidro.isilanguage.ast.CommandRepeticao;
	import br.com.professorisidro.isilanguage.ast.CommandFacaEnquanto;
	import br.com.professorisidro.isilanguage.ast.CommandPara;

	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, AP=13, FP=14, SC=15, OP=16, ATTR=17, VIR=18, 
		ACH=19, FCH=20, OB=21, CB=22, OPREL=23, ID=24, NUMBER=25, ASPAS=26, TEXT=27, 
		LOGIC=28, BIN_OP_LOGIC=29, UNIT_OP_LOGIC=30, WS=31, COMMENT=32, LINE_COMMENT=33, 
		DALE=34;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_declaraVector = 3, 
		RULE_tipo = 4, RULE_bloco = 5, RULE_cmd = 6, RULE_cmdleitura = 7, RULE_cmdescrita = 8, 
		RULE_cmdattrib = 9, RULE_attrib = 10, RULE_attribVector = 11, RULE_attribVectorAtIndex = 12, 
		RULE_vectorAtrExpr = 13, RULE_termoVector = 14, RULE_cmdselecao = 15, 
		RULE_condse = 16, RULE_cmdrepeticao = 17, RULE_condWhile = 18, RULE_cmdfacaenquanto = 19, 
		RULE_condDoWhile = 20, RULE_cmdpara = 21, RULE_attrFor = 22, RULE_condFor = 23, 
		RULE_expr = 24, RULE_logicexpr = 25, RULE_logicterm = 26, RULE_termo = 27;
	public static final String[] ruleNames = {
		"prog", "decl", "declaravar", "declaraVector", "tipo", "bloco", "cmd", 
		"cmdleitura", "cmdescrita", "cmdattrib", "attrib", "attribVector", "attribVectorAtIndex", 
		"vectorAtrExpr", "termoVector", "cmdselecao", "condse", "cmdrepeticao", 
		"condWhile", "cmdfacaenquanto", "condDoWhile", "cmdpara", "attrFor", "condFor", 
		"expr", "logicexpr", "logicterm", "termo"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog;'", "'numero'", "'texto'", "'logico'", "'leia'", 
		"'escreva'", "'se'", "'senao'", "'enquanto'", "'faca'", "'para'", "'('", 
		"')'", "';'", null, "'='", "','", "'{'", "'}'", "'['", "']'", null, null, 
		null, "'\"'", null, null, null, "'!'", null, null, null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OB", "CB", 
		"OPREL", "ID", "NUMBER", "ASPAS", "TEXT", "LOGIC", "BIN_OP_LOGIC", "UNIT_OP_LOGIC", 
		"WS", "COMMENT", "LINE_COMMENT", "DALE"
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
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private int _tipo =-1;
		private String _varName;
		private String _varValue;
		private IsiSymbolTable symbolTable = new IsiSymbolTable();
		private IsiSymbol symbol;
		private IsiProgram program = new IsiProgram();
		private ArrayList<AbstractCommand> curThread;
		private Stack<ArrayList<AbstractCommand>> stack = new Stack<ArrayList<AbstractCommand>>();
		private String _readID;
		private String _writeID;
		private int _exprType = -1; // tipo da expressão que foi avaliada
		private String _exprID;
		private String _exprContent;
		private String _exprDecision;
		private String _exprWhile;
		private boolean _exprMOL; // true for logic expr  0 for the others expr types 
		private String _exprDoWhile;
		private String _exprForB;
		private Stack<String> ifStatements = new Stack<String>();
		private Stack<String> whileStatements = new Stack<String>();
		private Stack<String> forStatements = new Stack<String>();
		private Stack<String> dowhileStatements = new Stack<String>();
		private String _exprVectorContent;


		
		private String _exprLOGICContent;

		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;
		private ArrayList<AbstractCommand> listaWhile;
		private ArrayList<AbstractCommand> listaFor; 
		private ArrayList<AbstractCommand> listaDoWhile; 
		
		private static final String[] TYPPES = {"NUMERO","TEXTO","LOGICO", "VECTOR_NUMBER", "VECTOR_TEXTO", "VECTOR_LOGICO"};
		
		
		public void verificaID(String id){
			if (!symbolTable.exists(id)){
				throw new IsiSemanticException("Symbol "+id+" not declared");
			}
		}
		
		public void exibeComandos(){
			for (AbstractCommand c: program.getComandos()){
				System.out.println(c);
			}
		}
		
		public void generateCode(){
			program.generateTarget();
		}
		

		
		public void exibeVarsNaoUsadas(){
			boolean naoUsadas = false;
			for ( IsiSymbol symbol : symbolTable.getAll() ){
				IsiVariable simbolo = (IsiVariable) symbol;
				if (simbolo.getValue() == null ){
					naoUsadas = true;
					break;
				}
			}
			
			if (naoUsadas) { 
				System.out.println("***Warning***\nThe follow variables is declared but not used!");
					for ( IsiSymbol symbol : symbolTable.getAll() ){
					IsiVariable simbolo = (IsiVariable) symbol;
					if (simbolo.getValue() == null ){
						System.out.println(simbolo.getName());
					}
				}
			 }
		}

	public IsiLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			decl();
			setState(58);
			bloco();
			setState(59);
			match(T__1);
			  
						  program.setVarTable(symbolTable);
			           	  program.setComandos(stack.pop());
			           	 
			           	 exibeVarsNaoUsadas();
						
			           
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

	public static class DeclContext extends ParserRuleContext {
		public List<DeclaravarContext> declaravar() {
			return getRuleContexts(DeclaravarContext.class);
		}
		public DeclaravarContext declaravar(int i) {
			return getRuleContext(DeclaravarContext.class,i);
		}
		public List<DeclaraVectorContext> declaraVector() {
			return getRuleContexts(DeclaraVectorContext.class);
		}
		public DeclaraVectorContext declaraVector(int i) {
			return getRuleContext(DeclaraVectorContext.class,i);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(64);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__3:
				case T__4:
					{
					setState(62);
					declaravar();
					}
					break;
				case OB:
					{
					setState(63);
					declaraVector();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(66); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << OB))) != 0) );
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

	public static class DeclaravarContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public List<TerminalNode> VIR() { return getTokens(IsiLangParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(IsiLangParser.VIR, i);
		}
		public DeclaravarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaravar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclaravar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclaravar(this);
		}
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			tipo();
			setState(69);
			match(ID);

				                  _varName = _input.LT(-1).getText();
				                  _varValue = null; 
				                  symbol = new IsiVariable(_varName, _tipo, _varValue);
				                  if (!symbolTable.exists(_varName)){
				                     symbolTable.add(symbol);	
				                  }
				                  else{
				                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
				                  }
			                    
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(71);
				match(VIR);
				setState(72);
				match(ID);

					                  _varName = _input.LT(-1).getText();
					                  _varValue = null;
					                  symbol = new IsiVariable(_varName, _tipo, _varValue);
					                  if (!symbolTable.exists(_varName)){
					                     symbolTable.add(symbol);	
					                  }
					                  else{
					                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
					                  }
				                    
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(SC);
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

	public static class DeclaraVectorContext extends ParserRuleContext {
		public TerminalNode OB() { return getToken(IsiLangParser.OB, 0); }
		public TerminalNode CB() { return getToken(IsiLangParser.CB, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public DeclaraVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraVector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclaraVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclaraVector(this);
		}
	}

	public final DeclaraVectorContext declaraVector() throws RecognitionException {
		DeclaraVectorContext _localctx = new DeclaraVectorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaraVector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(OB);
			setState(82);
			match(CB);
			setState(83);
			tipo();
			setState(84);
			match(ID);

								  _varName = _input.LT(-1).getText();
				                  _varValue = null; 
				                  symbol = new IsiVariable(_varName, _tipo + 3, _varValue);
				                  if (!symbolTable.exists(_varName)){
				                     symbolTable.add(symbol);	
				                  }
				                  else{
				                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
				                  }
			                    
			setState(86);
			match(SC);
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

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(T__2);
				 _tipo = IsiVariable.NUMBER; // 0 
										_exprVectorContent += _input.LT(-1).getText();  
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(T__3);
				 _tipo = IsiVariable.TEXT; // 1 
						              _exprVectorContent += _input.LT(-1).getText(); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(T__4);
				 _tipo = IsiVariable.LOGIC; // 2
						   				 _exprVectorContent += _input.LT(-1).getText();  
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

	public static class BlocoContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
						curThread = new ArrayList<AbstractCommand>(); 
				        stack.push(curThread);  
			          
			setState(98); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(97);
				cmd();
				}
				}
				setState(100); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
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

	public static class CmdContext extends ParserRuleContext {
		public CmdleituraContext cmdleitura() {
			return getRuleContext(CmdleituraContext.class,0);
		}
		public CmdescritaContext cmdescrita() {
			return getRuleContext(CmdescritaContext.class,0);
		}
		public CmdattribContext cmdattrib() {
			return getRuleContext(CmdattribContext.class,0);
		}
		public CmdselecaoContext cmdselecao() {
			return getRuleContext(CmdselecaoContext.class,0);
		}
		public CmdrepeticaoContext cmdrepeticao() {
			return getRuleContext(CmdrepeticaoContext.class,0);
		}
		public CmdfacaenquantoContext cmdfacaenquanto() {
			return getRuleContext(CmdfacaenquantoContext.class,0);
		}
		public CmdparaContext cmdpara() {
			return getRuleContext(CmdparaContext.class,0);
		}
		public AttribVectorContext attribVector() {
			return getRuleContext(AttribVectorContext.class,0);
		}
		public AttribVectorAtIndexContext attribVectorAtIndex() {
			return getRuleContext(AttribVectorAtIndexContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmd);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				cmdleitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				cmdescrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(104);
				cmdattrib();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				cmdselecao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				cmdrepeticao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(107);
				cmdfacaenquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(108);
				cmdpara();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(109);
				attribVector();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(110);
				attribVectorAtIndex();
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

	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdleitura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdleitura(this);
		}
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__5);
			setState(114);
			match(AP);
			setState(115);
			match(ID);
			 verificaID(_input.LT(-1).getText());
			                     	  _readID = _input.LT(-1).getText();
			                        
			setState(117);
			match(FP);
			setState(118);
			match(SC);

			              	IsiVariable var = (IsiVariable)symbolTable.get(_readID);
			              	CommandLeitura cmd = new CommandLeitura(_readID, var);
			              	stack.peek().add(cmd);
			              
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

	public static class CmdescritaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicexprContext logicexpr() {
			return getRuleContext(LogicexprContext.class,0);
		}
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdescrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdescrita(this);
		}
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__6);
			setState(122);
			match(AP);
			_exprLOGICContent = "";
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(124);
				expr();
				}
				break;
			case 2:
				{
				setState(125);
				logicexpr();
				}
				break;
			}
			setState(128);
			match(FP);
			setState(129);
			match(SC);

			               	CommandEscrita cmd;
							if (_exprMOL){
								cmd = new CommandEscrita(_exprContent.trim());
							} else { 
								cmd = new CommandEscrita(_exprLOGICContent.trim());
							}
			               	  stack.peek().add(cmd);
			               
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

	public static class CmdattribContext extends ParserRuleContext {
		public AttribContext attrib() {
			return getRuleContext(AttribContext.class,0);
		}
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdattrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdattrib(this);
		}
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			attrib();
			setState(133);
			match(SC);
			 
							   CommandAtribuicao cmd;
							if (_exprMOL){
								cmd = new CommandAtribuicao(_exprID, _exprContent.trim());
							} else { 
								cmd = new CommandAtribuicao(_exprID, _exprLOGICContent.trim());
							}	
			               	 
			               	 stack.peek().add(cmd);
			               
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

	public static class AttribContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicexprContext logicexpr() {
			return getRuleContext(LogicexprContext.class,0);
		}
		public AttribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrib; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterAttrib(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitAttrib(this);
		}
	}

	public final AttribContext attrib() throws RecognitionException {
		AttribContext _localctx = new AttribContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(ID);
			 verificaID(_input.LT(-1).getText());  
								
			                    
			                    _exprID = _input.LT(-1).getText();
			                   
			setState(138);
			match(ATTR);
			 _exprContent = ""; _exprLOGICContent = "";
			setState(142);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(140);
				expr();
				}
				break;
			case 2:
				{
				setState(141);
				logicexpr();
				}
				break;
			}
			 	
			               		IsiVariable currentVar = (IsiVariable) symbolTable.get(_exprID);
			               		currentVar.setValue("value");
			               		symbolTable.add(currentVar); 

			               		if ( _exprType != currentVar.getType() ){
			               	 		throw new IsiSemanticException("Type mismatch at variable named "+currentVar.getName()+", expecting "+ TYPPES[currentVar.getType()] + " but got " + TYPPES[_exprType] +"\n");
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

	public static class AttribVectorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode DALE() { return getToken(IsiLangParser.DALE, 0); }
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public TerminalNode ACH() { return getToken(IsiLangParser.ACH, 0); }
		public VectorAtrExprContext vectorAtrExpr() {
			return getRuleContext(VectorAtrExprContext.class,0);
		}
		public TerminalNode FCH() { return getToken(IsiLangParser.FCH, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public AttribVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribVector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterAttribVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitAttribVector(this);
		}
	}

	public final AttribVectorContext attribVector() throws RecognitionException {
		AttribVectorContext _localctx = new AttribVectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_attribVector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(ID);

								verificaID(_input.LT(-1).getText());  
			                    _exprID = _input.LT(-1).getText(); 
			                   
			setState(148);
			match(DALE);
			setState(149);
			match(ATTR);
			 _exprVectorContent = "";
			setState(151);
			match(ACH);
			 _exprVectorContent += "{";
			setState(153);
			vectorAtrExpr();
			setState(154);
			match(FCH);
			 _exprVectorContent += "}";
			 	
			               		IsiVariable currentVar = (IsiVariable) symbolTable.get(_exprID);
			               		currentVar.setValue("value");
			               		symbolTable.add(currentVar); 


			               
			setState(157);
			match(SC);
			 
							   CommandAtribueVector cmd;
							   cmd = new CommandAtribueVector(_exprID, _exprVectorContent, currentVar.getType() );
			               	 
			               	 stack.peek().add(cmd);
			               
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

	public static class AttribVectorAtIndexContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode OB() { return getToken(IsiLangParser.OB, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CB() { return getToken(IsiLangParser.CB, 0); }
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public LogicexprContext logicexpr() {
			return getRuleContext(LogicexprContext.class,0);
		}
		public AttribVectorAtIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribVectorAtIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterAttribVectorAtIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitAttribVectorAtIndex(this);
		}
	}

	public final AttribVectorAtIndexContext attribVectorAtIndex() throws RecognitionException {
		AttribVectorAtIndexContext _localctx = new AttribVectorAtIndexContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_attribVectorAtIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(ID);
				// ID [expr] = value; 
								verificaID(_input.LT(-1).getText());  
			                	_exprID = _input.LT(-1).getText(); 
			                
			setState(162);
			match(OB);
			 _exprID+= "[ (int)"; 
			setState(164);
			expr();
			 _exprID += _exprContent;
			setState(166);
			match(CB);
			 _exprID+="]";
			setState(168);
			match(ATTR);
			 _exprContent = ""; _exprLOGICContent= "";
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(170);
				expr();
				}
				break;
			case 2:
				{
				setState(171);
				logicexpr();
				}
				break;
			}
			setState(174);
			match(SC);
			 
							 	CommandAtribuicao cmd;
								if ( _exprContent == "") { 
									cmd = new CommandAtribuicao(_exprID,_exprLOGICContent.trim());
								}
								else {  
									cmd = new CommandAtribuicao(_exprID, _exprContent.trim());
								 }
								
								stack.peek().add(cmd);
						   
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

	public static class VectorAtrExprContext extends ParserRuleContext {
		public List<TermoVectorContext> termoVector() {
			return getRuleContexts(TermoVectorContext.class);
		}
		public TermoVectorContext termoVector(int i) {
			return getRuleContext(TermoVectorContext.class,i);
		}
		public List<TerminalNode> VIR() { return getTokens(IsiLangParser.VIR); }
		public TerminalNode VIR(int i) {
			return getToken(IsiLangParser.VIR, i);
		}
		public VectorAtrExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vectorAtrExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterVectorAtrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitVectorAtrExpr(this);
		}
	}

	public final VectorAtrExprContext vectorAtrExpr() throws RecognitionException {
		VectorAtrExprContext _localctx = new VectorAtrExprContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_vectorAtrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			termoVector();
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(178);
				match(VIR);
				 _exprVectorContent += ",";
				setState(180);
				termoVector();
				}
				}
				setState(185);
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

	public static class TermoVectorContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(IsiLangParser.TEXT, 0); }
		public TerminalNode LOGIC() { return getToken(IsiLangParser.LOGIC, 0); }
		public TermoVectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoVector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTermoVector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTermoVector(this);
		}
	}

	public final TermoVectorContext termoVector() throws RecognitionException {
		TermoVectorContext _localctx = new TermoVectorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_termoVector);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				match(NUMBER);
					
				              	_exprVectorContent += _input.LT(-1).getText();
								_tipo = IsiVariable.NUMBER; 
				              
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				match(TEXT);
				 
								  _tipo = IsiVariable.NUMBER;	
								  _exprVectorContent += _input.LT(-1).getText();
				              
				}
				break;
			case LOGIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				match(LOGIC);
				 
								  _tipo = IsiVariable.LOGIC;	
								  _exprVectorContent += _input.LT(-1).getText(); 
							  
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

	public static class CmdselecaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(IsiLangParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(IsiLangParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(IsiLangParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(IsiLangParser.FCH, i);
		}
		public CondseContext condse() {
			return getRuleContext(CondseContext.class,0);
		}
		public LogicexprContext logicexpr() {
			return getRuleContext(LogicexprContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdselecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdselecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdselecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdselecao(this);
		}
	}

	public final CmdselecaoContext cmdselecao() throws RecognitionException {
		CmdselecaoContext _localctx = new CmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(T__7);
			setState(195);
			match(AP);
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(196);
				condse();
				}
				break;
			case 2:
				{
				setState(197);
				logicexpr();
				ifStatements.push(_exprLOGICContent);
				}
				break;
			}
			setState(202);
			match(FP);
			setState(203);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(206); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(205);
				cmd();
				}
				}
				setState(208); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(210);
			match(FCH);
			listaTrue = stack.pop();
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(212);
				match(T__8);
				setState(213);
				match(ACH);

				                   	 	curThread = new ArrayList<AbstractCommand>();
				                   	 	stack.push(curThread);
				                   	 
				setState(216); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(215);
					cmd();
					}
					}
					setState(218); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
				setState(220);
				match(FCH);
				listaFalse = stack.pop();
				}
			}

			                   		
			                   		CommandDecisao cmd = new CommandDecisao(ifStatements.pop(), listaTrue, listaFalse);
			                   		stack.peek().add(cmd);
			                   		listaTrue = null;
			                   		listaFalse = null;
			                   
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

	public static class CondseContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCondse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCondse(this);
		}
	}

	public final CondseContext condse() throws RecognitionException {
		CondseContext _localctx = new CondseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(ID);
			_exprDecision = _input.LT(-1).getText(); 
			setState(229);
			match(OPREL);
			_exprDecision += _input.LT(-1).getText(); 
			setState(231);
			expr();
			_exprDecision += _exprContent;
			ifStatements.push(_exprDecision);
						System.out.println(_exprDecision);
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

	public static class CmdrepeticaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode ACH() { return getToken(IsiLangParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(IsiLangParser.FCH, 0); }
		public CondWhileContext condWhile() {
			return getRuleContext(CondWhileContext.class,0);
		}
		public LogicexprContext logicexpr() {
			return getRuleContext(LogicexprContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdrepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdrepeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdrepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdrepeticao(this);
		}
	}

	public final CmdrepeticaoContext cmdrepeticao() throws RecognitionException {
		CmdrepeticaoContext _localctx = new CmdrepeticaoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdrepeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(T__9);
			setState(236);
			match(AP);
			_exprLOGICContent = ""; _exprWhile = "";
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(238);
				condWhile();
				}
				break;
			case 2:
				{
				setState(239);
				logicexpr();
				whileStatements.push(_exprLOGICContent);
				}
				break;
			}
			setState(244);
			match(FP);
			setState(245);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
					                      stack.push(curThread);
					                    
			setState(248); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(247);
				cmd();
				}
				}
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(252);
			match(FCH);

					                       listaWhile = stack.pop();
					                       CommandRepeticao cmd = new CommandRepeticao(whileStatements.pop(), listaWhile);
					                       stack.peek().add(cmd);	
					                    
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

	public static class CondWhileContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCondWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCondWhile(this);
		}
	}

	public final CondWhileContext condWhile() throws RecognitionException {
		CondWhileContext _localctx = new CondWhileContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(ID);
			_exprWhile = _input.LT(-1).getText(); 
			setState(257);
			match(OPREL);
			_exprWhile += _input.LT(-1).getText(); 
			setState(259);
			expr();
			_exprWhile += _exprContent;
			whileStatements.push(_exprWhile);
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

	public static class CmdfacaenquantoContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(IsiLangParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(IsiLangParser.FCH, 0); }
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CondDoWhileContext condDoWhile() {
			return getRuleContext(CondDoWhileContext.class,0);
		}
		public LogicexprContext logicexpr() {
			return getRuleContext(LogicexprContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdfacaenquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdfacaenquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdfacaenquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdfacaenquanto(this);
		}
	}

	public final CmdfacaenquantoContext cmdfacaenquanto() throws RecognitionException {
		CmdfacaenquantoContext _localctx = new CmdfacaenquantoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdfacaenquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__10);
			 _exprDoWhile = "";
			setState(265);
			match(ACH);
			 
										  curThread = new ArrayList<AbstractCommand>(); 
					                      stack.push(curThread);
					                    
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				cmd();
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(272);
			match(FCH);


					                    
			setState(274);
			match(T__9);
			setState(275);
			match(AP);
			setState(280);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(276);
				condDoWhile();
				}
				break;
			case 2:
				{
				setState(277);
				logicexpr();
				dowhileStatements.push(_exprLOGICContent);
				}
				break;
			}
			setState(282);
			match(FP);
			setState(283);
			match(SC);
			 
										    listaDoWhile = stack.pop();
					                        CommandFacaEnquanto cmd = new CommandFacaEnquanto(dowhileStatements.pop(), listaDoWhile);
					                        stack.peek().add(cmd); 
										
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

	public static class CondDoWhileContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondDoWhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condDoWhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCondDoWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCondDoWhile(this);
		}
	}

	public final CondDoWhileContext condDoWhile() throws RecognitionException {
		CondDoWhileContext _localctx = new CondDoWhileContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_condDoWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(ID);
			_exprDoWhile = _input.LT(-1).getText(); 
			setState(288);
			match(OPREL);
			_exprDoWhile += _input.LT(-1).getText(); 
			setState(290);
			expr();
			_exprDoWhile += _exprContent;
			dowhileStatements.push(_exprDoWhile);
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

	public static class CmdparaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public List<AttrForContext> attrFor() {
			return getRuleContexts(AttrForContext.class);
		}
		public AttrForContext attrFor(int i) {
			return getRuleContext(AttrForContext.class,i);
		}
		public List<TerminalNode> SC() { return getTokens(IsiLangParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(IsiLangParser.SC, i);
		}
		public CondForContext condFor() {
			return getRuleContext(CondForContext.class,0);
		}
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode ACH() { return getToken(IsiLangParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(IsiLangParser.FCH, 0); }
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdparaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdpara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCmdpara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCmdpara(this);
		}
	}

	public final CmdparaContext cmdpara() throws RecognitionException {
		CmdparaContext _localctx = new CmdparaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__11);
			setState(295);
			match(AP);
			setState(296);
			attrFor();
			setState(297);
			match(SC);
			setState(298);
			condFor();
			setState(299);
			match(SC);
			setState(300);
			attrFor();
			setState(301);
			match(FP);
			setState(302);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(305); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(304);
				cmd();
				}
				}
				setState(307); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(309);
			match(FCH);

			                       listaFor = stack.pop();
			                       CommandPara cmd = new CommandPara(forStatements.pop(),forStatements.pop(),forStatements.pop(), listaFor);
			                       stack.peek().add(cmd);	
			                    
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

	public static class AttrForContext extends ParserRuleContext {
		public AttribContext attrib() {
			return getRuleContext(AttribContext.class,0);
		}
		public AttrForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterAttrFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitAttrFor(this);
		}
	}

	public final AttrForContext attrFor() throws RecognitionException {
		AttrForContext _localctx = new AttrForContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_attrFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			attrib();
			forStatements.push(_exprID+"="+_exprContent);
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

	public static class CondForContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CondForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterCondFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitCondFor(this);
		}
	}

	public final CondForContext condFor() throws RecognitionException {
		CondForContext _localctx = new CondForContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(ID);
			_exprForB = _input.LT(-1).getText(); 
			setState(317);
			match(OPREL);
			_exprForB += _input.LT(-1).getText(); 
			setState(319);
			expr();
			_exprForB += _exprContent;
			forStatements.push(_exprForB);
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

	public static class ExprContext extends ParserRuleContext {
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public List<TerminalNode> OB() { return getTokens(IsiLangParser.OB); }
		public TerminalNode OB(int i) {
			return getToken(IsiLangParser.OB, i);
		}
		public List<TerminalNode> CB() { return getTokens(IsiLangParser.CB); }
		public TerminalNode CB(int i) {
			return getToken(IsiLangParser.CB, i);
		}
		public List<TerminalNode> NUMBER() { return getTokens(IsiLangParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(IsiLangParser.NUMBER, i);
		}
		public List<TerminalNode> OP() { return getTokens(IsiLangParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(IsiLangParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_exprContent = "";
			setState(333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(324);
				termo();
				}
				break;
			case 2:
				{
				setState(325);
				match(ID);
				 _exprContent += _input.LT(-1).getText();
				setState(327);
				match(OB);
				 _exprContent += _input.LT(-1).getText();  _exprContent += "(int)";
				setState(329);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 _exprContent += _input.LT(-1).getText();
				setState(331);
				match(CB);
				 _exprContent += _input.LT(-1).getText();
				}
				break;
			}
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(335);
				match(OP);
				 _exprContent += _input.LT(-1).getText();
				setState(346);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(337);
					termo();
					}
					break;
				case 2:
					{
					setState(338);
					match(ID);
					 _exprContent += _input.LT(-1).getText();
					setState(340);
					match(OB);
					 _exprContent += _input.LT(-1).getText();  _exprContent += "(int)";
					setState(342);
					_la = _input.LA(1);
					if ( !(_la==ID || _la==NUMBER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					 _exprContent += _input.LT(-1).getText();
					setState(344);
					match(CB);
					 _exprContent += _input.LT(-1).getText();
					}
					break;
				}
				}
				}
				setState(352);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _exprMOL= true;
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

	public static class LogicexprContext extends ParserRuleContext {
		public List<LogictermContext> logicterm() {
			return getRuleContexts(LogictermContext.class);
		}
		public LogictermContext logicterm(int i) {
			return getRuleContext(LogictermContext.class,i);
		}
		public List<TerminalNode> BIN_OP_LOGIC() { return getTokens(IsiLangParser.BIN_OP_LOGIC); }
		public TerminalNode BIN_OP_LOGIC(int i) {
			return getToken(IsiLangParser.BIN_OP_LOGIC, i);
		}
		public LogicexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterLogicexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitLogicexpr(this);
		}
	}

	public final LogicexprContext logicexpr() throws RecognitionException {
		LogicexprContext _localctx = new LogicexprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logicexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			logicterm();
			 _exprMOL = false;
			setState(362);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIN_OP_LOGIC) {
				{
				{
				setState(357);
				match(BIN_OP_LOGIC);
				 _exprLOGICContent += _input.LT(-1).getText(); 
				setState(359);
				logicterm();
				}
				}
				setState(364);
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

	public static class LogictermContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode UNIT_OP_LOGIC() { return getToken(IsiLangParser.UNIT_OP_LOGIC, 0); }
		public TerminalNode LOGIC() { return getToken(IsiLangParser.LOGIC, 0); }
		public LogictermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicterm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterLogicterm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitLogicterm(this);
		}
	}

	public final LogictermContext logicterm() throws RecognitionException {
		LogictermContext _localctx = new LogictermContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logicterm);
		try {
			setState(375);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(ID);
				 
								verificaID(_input.LT(-1).getText());
					            _exprLOGICContent += _input.LT(-1).getText();
					            IsiVariable currentVar1 = (IsiVariable) symbolTable.get(_input.LT(-1).getText());
					            _exprType = currentVar1.getType();

								  
								 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(UNIT_OP_LOGIC);
				setState(368);
				match(ID);


								 verificaID(_input.LT(-1).getText());
					            _exprLOGICContent +=  "!" + _input.LT(-1).getText();
					            IsiVariable currentVar2 = (IsiVariable) symbolTable.get(_input.LT(-1).getText());
					            _exprType = currentVar2.getType();
							 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(370);
				match(LOGIC);
				 
								_exprLOGICContent += _input.LT(-1).getText();
				              	_exprType = IsiVariable.LOGIC; 

							 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(372);
				match(UNIT_OP_LOGIC);
				setState(373);
				match(LOGIC);

								 _exprLOGICContent += "!" + _input.LT(-1).getText();
				              	_exprType = IsiVariable.LOGIC; 
							 
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

	public static class TermoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public TerminalNode TEXT() { return getToken(IsiLangParser.TEXT, 0); }
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_termo);
		try {
			setState(383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(ID);
				 verificaID(_input.LT(-1).getText());
					               _exprContent += _input.LT(-1).getText();
					              IsiVariable currentVar = (IsiVariable) symbolTable.get(_input.LT(-1).getText());
					              _exprType = currentVar.getType();
				                 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(NUMBER);
					
				              	_exprContent += _input.LT(-1).getText();
				              	_exprType = IsiVariable.NUMBER;
				              
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(381);
				match(TEXT);
				 
				              	_exprContent += _input.LT(-1).getText();
				              	_exprType = IsiVariable.TEXT;
				              
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0184\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\6\3C\n\3\r\3\16\3D\3\4\3\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4"+
		"\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6"+
		"\3\7\3\7\6\7e\n\7\r\7\16\7f\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\br\n"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0091\n"+
		"\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00af\n\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00b8\n\17\f\17\16\17\u00bb\13"+
		"\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c3\n\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\5\21\u00cb\n\21\3\21\3\21\3\21\3\21\6\21\u00d1\n\21\r\21\16"+
		"\21\u00d2\3\21\3\21\3\21\3\21\3\21\3\21\6\21\u00db\n\21\r\21\16\21\u00dc"+
		"\3\21\3\21\3\21\5\21\u00e2\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f5\n\23\3\23\3\23"+
		"\3\23\3\23\6\23\u00fb\n\23\r\23\16\23\u00fc\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\6\25\u010f\n\25"+
		"\r\25\16\25\u0110\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u011b\n"+
		"\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\6\27\u0134\n\27\r\27"+
		"\16\27\u0135\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0150"+
		"\n\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u015d"+
		"\n\32\7\32\u015f\n\32\f\32\16\32\u0162\13\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\7\33\u016b\n\33\f\33\16\33\u016e\13\33\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u017a\n\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\5\35\u0182\n\35\3\35\2\2\36\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668\2\3\3\2\32\33\2\u018d\2:\3\2\2\2\4B\3\2\2\2"+
		"\6F\3\2\2\2\bS\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16q\3\2\2\2\20s\3\2\2\2\22"+
		"{\3\2\2\2\24\u0086\3\2\2\2\26\u008a\3\2\2\2\30\u0094\3\2\2\2\32\u00a2"+
		"\3\2\2\2\34\u00b3\3\2\2\2\36\u00c2\3\2\2\2 \u00c4\3\2\2\2\"\u00e5\3\2"+
		"\2\2$\u00ed\3\2\2\2&\u0101\3\2\2\2(\u0109\3\2\2\2*\u0120\3\2\2\2,\u0128"+
		"\3\2\2\2.\u013a\3\2\2\2\60\u013d\3\2\2\2\62\u0145\3\2\2\2\64\u0165\3\2"+
		"\2\2\66\u0179\3\2\2\28\u0181\3\2\2\2:;\7\3\2\2;<\5\4\3\2<=\5\f\7\2=>\7"+
		"\4\2\2>?\b\2\1\2?\3\3\2\2\2@C\5\6\4\2AC\5\b\5\2B@\3\2\2\2BA\3\2\2\2CD"+
		"\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\5\3\2\2\2FG\5\n\6\2GH\7\32\2\2HN\b\4\1\2"+
		"IJ\7\24\2\2JK\7\32\2\2KM\b\4\1\2LI\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2"+
		"\2OQ\3\2\2\2PN\3\2\2\2QR\7\21\2\2R\7\3\2\2\2ST\7\27\2\2TU\7\30\2\2UV\5"+
		"\n\6\2VW\7\32\2\2WX\b\5\1\2XY\7\21\2\2Y\t\3\2\2\2Z[\7\5\2\2[a\b\6\1\2"+
		"\\]\7\6\2\2]a\b\6\1\2^_\7\7\2\2_a\b\6\1\2`Z\3\2\2\2`\\\3\2\2\2`^\3\2\2"+
		"\2a\13\3\2\2\2bd\b\7\1\2ce\5\16\b\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3"+
		"\2\2\2g\r\3\2\2\2hr\5\20\t\2ir\5\22\n\2jr\5\24\13\2kr\5 \21\2lr\5$\23"+
		"\2mr\5(\25\2nr\5,\27\2or\5\30\r\2pr\5\32\16\2qh\3\2\2\2qi\3\2\2\2qj\3"+
		"\2\2\2qk\3\2\2\2ql\3\2\2\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2r\17"+
		"\3\2\2\2st\7\b\2\2tu\7\17\2\2uv\7\32\2\2vw\b\t\1\2wx\7\20\2\2xy\7\21\2"+
		"\2yz\b\t\1\2z\21\3\2\2\2{|\7\t\2\2|}\7\17\2\2}\u0080\b\n\1\2~\u0081\5"+
		"\62\32\2\177\u0081\5\64\33\2\u0080~\3\2\2\2\u0080\177\3\2\2\2\u0081\u0082"+
		"\3\2\2\2\u0082\u0083\7\20\2\2\u0083\u0084\7\21\2\2\u0084\u0085\b\n\1\2"+
		"\u0085\23\3\2\2\2\u0086\u0087\5\26\f\2\u0087\u0088\7\21\2\2\u0088\u0089"+
		"\b\13\1\2\u0089\25\3\2\2\2\u008a\u008b\7\32\2\2\u008b\u008c\b\f\1\2\u008c"+
		"\u008d\7\23\2\2\u008d\u0090\b\f\1\2\u008e\u0091\5\62\32\2\u008f\u0091"+
		"\5\64\33\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2\2\2\u0091\u0092\3\2\2\2"+
		"\u0092\u0093\b\f\1\2\u0093\27\3\2\2\2\u0094\u0095\7\32\2\2\u0095\u0096"+
		"\b\r\1\2\u0096\u0097\7$\2\2\u0097\u0098\7\23\2\2\u0098\u0099\b\r\1\2\u0099"+
		"\u009a\7\25\2\2\u009a\u009b\b\r\1\2\u009b\u009c\5\34\17\2\u009c\u009d"+
		"\7\26\2\2\u009d\u009e\b\r\1\2\u009e\u009f\b\r\1\2\u009f\u00a0\7\21\2\2"+
		"\u00a0\u00a1\b\r\1\2\u00a1\31\3\2\2\2\u00a2\u00a3\7\32\2\2\u00a3\u00a4"+
		"\b\16\1\2\u00a4\u00a5\7\27\2\2\u00a5\u00a6\b\16\1\2\u00a6\u00a7\5\62\32"+
		"\2\u00a7\u00a8\b\16\1\2\u00a8\u00a9\7\30\2\2\u00a9\u00aa\b\16\1\2\u00aa"+
		"\u00ab\7\23\2\2\u00ab\u00ae\b\16\1\2\u00ac\u00af\5\62\32\2\u00ad\u00af"+
		"\5\64\33\2\u00ae\u00ac\3\2\2\2\u00ae\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\u00b1\7\21\2\2\u00b1\u00b2\b\16\1\2\u00b2\33\3\2\2\2\u00b3\u00b9"+
		"\5\36\20\2\u00b4\u00b5\7\24\2\2\u00b5\u00b6\b\17\1\2\u00b6\u00b8\5\36"+
		"\20\2\u00b7\u00b4\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\35\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7\33\2"+
		"\2\u00bd\u00c3\b\20\1\2\u00be\u00bf\7\35\2\2\u00bf\u00c3\b\20\1\2\u00c0"+
		"\u00c1\7\36\2\2\u00c1\u00c3\b\20\1\2\u00c2\u00bc\3\2\2\2\u00c2\u00be\3"+
		"\2\2\2\u00c2\u00c0\3\2\2\2\u00c3\37\3\2\2\2\u00c4\u00c5\7\n\2\2\u00c5"+
		"\u00ca\7\17\2\2\u00c6\u00cb\5\"\22\2\u00c7\u00c8\5\64\33\2\u00c8\u00c9"+
		"\b\21\1\2\u00c9\u00cb\3\2\2\2\u00ca\u00c6\3\2\2\2\u00ca\u00c7\3\2\2\2"+
		"\u00cb\u00cc\3\2\2\2\u00cc\u00cd\7\20\2\2\u00cd\u00ce\7\25\2\2\u00ce\u00d0"+
		"\b\21\1\2\u00cf\u00d1\5\16\b\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2"+
		"\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5"+
		"\7\26\2\2\u00d5\u00e1\b\21\1\2\u00d6\u00d7\7\13\2\2\u00d7\u00d8\7\25\2"+
		"\2\u00d8\u00da\b\21\1\2\u00d9\u00db\5\16\b\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2"+
		"\2\2\u00de\u00df\7\26\2\2\u00df\u00e0\b\21\1\2\u00e0\u00e2\3\2\2\2\u00e1"+
		"\u00d6\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b\21"+
		"\1\2\u00e4!\3\2\2\2\u00e5\u00e6\7\32\2\2\u00e6\u00e7\b\22\1\2\u00e7\u00e8"+
		"\7\31\2\2\u00e8\u00e9\b\22\1\2\u00e9\u00ea\5\62\32\2\u00ea\u00eb\b\22"+
		"\1\2\u00eb\u00ec\b\22\1\2\u00ec#\3\2\2\2\u00ed\u00ee\7\f\2\2\u00ee\u00ef"+
		"\7\17\2\2\u00ef\u00f4\b\23\1\2\u00f0\u00f5\5&\24\2\u00f1\u00f2\5\64\33"+
		"\2\u00f2\u00f3\b\23\1\2\u00f3\u00f5\3\2\2\2\u00f4\u00f0\3\2\2\2\u00f4"+
		"\u00f1\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7\20\2\2\u00f7\u00f8\7"+
		"\25\2\2\u00f8\u00fa\b\23\1\2\u00f9\u00fb\5\16\b\2\u00fa\u00f9\3\2\2\2"+
		"\u00fb\u00fc\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe"+
		"\3\2\2\2\u00fe\u00ff\7\26\2\2\u00ff\u0100\b\23\1\2\u0100%\3\2\2\2\u0101"+
		"\u0102\7\32\2\2\u0102\u0103\b\24\1\2\u0103\u0104\7\31\2\2\u0104\u0105"+
		"\b\24\1\2\u0105\u0106\5\62\32\2\u0106\u0107\b\24\1\2\u0107\u0108\b\24"+
		"\1\2\u0108\'\3\2\2\2\u0109\u010a\7\r\2\2\u010a\u010b\b\25\1\2\u010b\u010c"+
		"\7\25\2\2\u010c\u010e\b\25\1\2\u010d\u010f\5\16\b\2\u010e\u010d\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0113\7\26\2\2\u0113\u0114\b\25\1\2\u0114\u0115\7\f\2\2"+
		"\u0115\u011a\7\17\2\2\u0116\u011b\5*\26\2\u0117\u0118\5\64\33\2\u0118"+
		"\u0119\b\25\1\2\u0119\u011b\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0117\3"+
		"\2\2\2\u011b\u011c\3\2\2\2\u011c\u011d\7\20\2\2\u011d\u011e\7\21\2\2\u011e"+
		"\u011f\b\25\1\2\u011f)\3\2\2\2\u0120\u0121\7\32\2\2\u0121\u0122\b\26\1"+
		"\2\u0122\u0123\7\31\2\2\u0123\u0124\b\26\1\2\u0124\u0125\5\62\32\2\u0125"+
		"\u0126\b\26\1\2\u0126\u0127\b\26\1\2\u0127+\3\2\2\2\u0128\u0129\7\16\2"+
		"\2\u0129\u012a\7\17\2\2\u012a\u012b\5.\30\2\u012b\u012c\7\21\2\2\u012c"+
		"\u012d\5\60\31\2\u012d\u012e\7\21\2\2\u012e\u012f\5.\30\2\u012f\u0130"+
		"\7\20\2\2\u0130\u0131\7\25\2\2\u0131\u0133\b\27\1\2\u0132\u0134\5\16\b"+
		"\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136"+
		"\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\26\2\2\u0138\u0139\b\27\1\2"+
		"\u0139-\3\2\2\2\u013a\u013b\5\26\f\2\u013b\u013c\b\30\1\2\u013c/\3\2\2"+
		"\2\u013d\u013e\7\32\2\2\u013e\u013f\b\31\1\2\u013f\u0140\7\31\2\2\u0140"+
		"\u0141\b\31\1\2\u0141\u0142\5\62\32\2\u0142\u0143\b\31\1\2\u0143\u0144"+
		"\b\31\1\2\u0144\61\3\2\2\2\u0145\u014f\b\32\1\2\u0146\u0150\58\35\2\u0147"+
		"\u0148\7\32\2\2\u0148\u0149\b\32\1\2\u0149\u014a\7\27\2\2\u014a\u014b"+
		"\b\32\1\2\u014b\u014c\t\2\2\2\u014c\u014d\b\32\1\2\u014d\u014e\7\30\2"+
		"\2\u014e\u0150\b\32\1\2\u014f\u0146\3\2\2\2\u014f\u0147\3\2\2\2\u0150"+
		"\u0160\3\2\2\2\u0151\u0152\7\22\2\2\u0152\u015c\b\32\1\2\u0153\u015d\5"+
		"8\35\2\u0154\u0155\7\32\2\2\u0155\u0156\b\32\1\2\u0156\u0157\7\27\2\2"+
		"\u0157\u0158\b\32\1\2\u0158\u0159\t\2\2\2\u0159\u015a\b\32\1\2\u015a\u015b"+
		"\7\30\2\2\u015b\u015d\b\32\1\2\u015c\u0153\3\2\2\2\u015c\u0154\3\2\2\2"+
		"\u015d\u015f\3\2\2\2\u015e\u0151\3\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163"+
		"\u0164\b\32\1\2\u0164\63\3\2\2\2\u0165\u0166\5\66\34\2\u0166\u016c\b\33"+
		"\1\2\u0167\u0168\7\37\2\2\u0168\u0169\b\33\1\2\u0169\u016b\5\66\34\2\u016a"+
		"\u0167\3\2\2\2\u016b\u016e\3\2\2\2\u016c\u016a\3\2\2\2\u016c\u016d\3\2"+
		"\2\2\u016d\65\3\2\2\2\u016e\u016c\3\2\2\2\u016f\u0170\7\32\2\2\u0170\u017a"+
		"\b\34\1\2\u0171\u0172\7 \2\2\u0172\u0173\7\32\2\2\u0173\u017a\b\34\1\2"+
		"\u0174\u0175\7\36\2\2\u0175\u017a\b\34\1\2\u0176\u0177\7 \2\2\u0177\u0178"+
		"\7\36\2\2\u0178\u017a\b\34\1\2\u0179\u016f\3\2\2\2\u0179\u0171\3\2\2\2"+
		"\u0179\u0174\3\2\2\2\u0179\u0176\3\2\2\2\u017a\67\3\2\2\2\u017b\u017c"+
		"\7\32\2\2\u017c\u0182\b\35\1\2\u017d\u017e\7\33\2\2\u017e\u0182\b\35\1"+
		"\2\u017f\u0180\7\35\2\2\u0180\u0182\b\35\1\2\u0181\u017b\3\2\2\2\u0181"+
		"\u017d\3\2\2\2\u0181\u017f\3\2\2\2\u01829\3\2\2\2\34BDN`fq\u0080\u0090"+
		"\u00ae\u00b9\u00c2\u00ca\u00d2\u00dc\u00e1\u00f4\u00fc\u0110\u011a\u0135"+
		"\u014f\u015c\u0160\u016c\u0179\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}