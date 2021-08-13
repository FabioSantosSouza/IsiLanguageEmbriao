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
	import java.util.HashMap;
	import java.util.Map;

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
		PONTO=34;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_declaraVectorStatic = 3, 
		RULE_declaraVectorDynamic = 4, RULE_tipo = 5, RULE_bloco = 6, RULE_cmd = 7, 
		RULE_cmdleitura = 8, RULE_cmdescrita = 9, RULE_cmdattrib = 10, RULE_attrib = 11, 
		RULE_attribVector = 12, RULE_attribVectorAtIndex = 13, RULE_vectorAtrExpr = 14, 
		RULE_termoVector = 15, RULE_cmdselecao = 16, RULE_condse = 17, RULE_cmdrepeticao = 18, 
		RULE_condWhile = 19, RULE_cmdfacaenquanto = 20, RULE_condDoWhile = 21, 
		RULE_cmdpara = 22, RULE_attrFor = 23, RULE_condFor = 24, RULE_expr = 25, 
		RULE_logicexpr = 26, RULE_logicterm = 27, RULE_termo = 28;
	public static final String[] ruleNames = {
		"prog", "decl", "declaravar", "declaraVectorStatic", "declaraVectorDynamic", 
		"tipo", "bloco", "cmd", "cmdleitura", "cmdescrita", "cmdattrib", "attrib", 
		"attribVector", "attribVectorAtIndex", "vectorAtrExpr", "termoVector", 
		"cmdselecao", "condse", "cmdrepeticao", "condWhile", "cmdfacaenquanto", 
		"condDoWhile", "cmdpara", "attrFor", "condFor", "expr", "logicexpr", "logicterm", 
		"termo"
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
		"WS", "COMMENT", "LINE_COMMENT", "PONTO"
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
		private String _debug;
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

		// Flasgs para vetores 
		Map<String,String> vectorLengthDeclr = new HashMap<String,String>(); // mapa de vetores dinamicos em seus tamanhos declarados
		Integer vectorLenghVerified = 0; // lido em cada termo da expressão interna do vetor 
		private boolean vectorStatic = false;  // se for estatico -> uma expr , cc joga outra
		private String __temp = "";
	 	
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
			setState(58);
			match(T__0);
			setState(59);
			decl();
			setState(60);
			bloco();
			setState(61);
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
		public List<DeclaraVectorStaticContext> declaraVectorStatic() {
			return getRuleContexts(DeclaraVectorStaticContext.class);
		}
		public DeclaraVectorStaticContext declaraVectorStatic(int i) {
			return getRuleContext(DeclaraVectorStaticContext.class,i);
		}
		public List<DeclaraVectorDynamicContext> declaraVectorDynamic() {
			return getRuleContexts(DeclaraVectorDynamicContext.class);
		}
		public DeclaraVectorDynamicContext declaraVectorDynamic(int i) {
			return getRuleContext(DeclaraVectorDynamicContext.class,i);
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
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(67);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(64);
					declaravar();
					}
					break;
				case 2:
					{
					setState(65);
					declaraVectorStatic();
					}
					break;
				case 3:
					{
					setState(66);
					declaraVectorDynamic();
					}
					break;
				}
				}
				setState(69); 
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
			setState(71);
			tipo();
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
			                    
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(74);
				match(VIR);
				setState(75);
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
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
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

	public static class DeclaraVectorStaticContext extends ParserRuleContext {
		public TerminalNode OB() { return getToken(IsiLangParser.OB, 0); }
		public TerminalNode CB() { return getToken(IsiLangParser.CB, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public DeclaraVectorStaticContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraVectorStatic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclaraVectorStatic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclaraVectorStatic(this);
		}
	}

	public final DeclaraVectorStaticContext declaraVectorStatic() throws RecognitionException {
		DeclaraVectorStaticContext _localctx = new DeclaraVectorStaticContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaraVectorStatic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(OB);
			setState(85);
			match(CB);
			setState(86);
			tipo();
			setState(87);
			match(ID);
			    vectorStatic = true;
								  _varName = _input.LT(-1).getText();
				                  _varValue = null; 
				                  symbol = new IsiVariable(_varName, _tipo + 3, _varValue);
				                  if (!symbolTable.exists(_varName)){
				                     symbolTable.add(symbol);	
				                  }
				                  else{
				                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
				                  }
			                    
			setState(89);
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

	public static class DeclaraVectorDynamicContext extends ParserRuleContext {
		public TerminalNode OB() { return getToken(IsiLangParser.OB, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public TerminalNode CB() { return getToken(IsiLangParser.CB, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public DeclaraVectorDynamicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraVectorDynamic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).enterDeclaraVectorDynamic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IsiLangListener ) ((IsiLangListener)listener).exitDeclaraVectorDynamic(this);
		}
	}

	public final DeclaraVectorDynamicContext declaraVectorDynamic() throws RecognitionException {
		DeclaraVectorDynamicContext _localctx = new DeclaraVectorDynamicContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declaraVectorDynamic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(OB);
			setState(92);
			match(NUMBER);
			 __temp =  _input.LT(-1).getText(); 
			setState(94);
			match(CB);
			setState(95);
			tipo();
			setState(96);
			match(ID);

									vectorStatic = false;
								  _varName = _input.LT(-1).getText();
				                  _varValue = null; 
				                  symbol = new IsiVariable(_varName, _tipo + 3, _varValue, __temp.trim());
								  vectorLengthDeclr.put(_varName,__temp.trim());
				                  if (!symbolTable.exists(_varName)){
				                     symbolTable.add(symbol);	
				                  }
				                  else{
				                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
				                  }
			                    
			setState(98);
			match(SC);
			 __temp = "";
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
		enterRule(_localctx, 10, RULE_tipo);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(T__2);
				 _tipo = IsiVariable.NUMBER; // 0 
										_exprVectorContent += _input.LT(-1).getText();  
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(103);
				match(T__3);
				 _tipo = IsiVariable.TEXT; // 1 
						              _exprVectorContent += _input.LT(-1).getText(); 
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
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
		enterRule(_localctx, 12, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
						curThread = new ArrayList<AbstractCommand>(); 
				        stack.push(curThread);  
			          
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				cmd();
				}
				}
				setState(113); 
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
		enterRule(_localctx, 14, RULE_cmd);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				cmdleitura();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				cmdescrita();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				cmdattrib();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				cmdselecao();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				cmdrepeticao();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				cmdfacaenquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				cmdpara();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(122);
				attribVector();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
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
		enterRule(_localctx, 16, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__5);
			setState(127);
			match(AP);
			setState(128);
			match(ID);
			 verificaID(_input.LT(-1).getText());
			                     	  _readID = _input.LT(-1).getText();
			                        
			setState(130);
			match(FP);
			setState(131);
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
		enterRule(_localctx, 18, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__6);
			setState(135);
			match(AP);
			_exprLOGICContent = "";
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(137);
				expr();
				}
				break;
			case 2:
				{
				setState(138);
				logicexpr();
				}
				break;
			}
			setState(141);
			match(FP);
			setState(142);
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
		enterRule(_localctx, 20, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			attrib();
			setState(146);
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
		enterRule(_localctx, 22, RULE_attrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ID);
			 verificaID(_input.LT(-1).getText());  
								
			                    
			                    _exprID = _input.LT(-1).getText();
			                   
			setState(151);
			match(ATTR);
			 _exprContent = ""; _exprLOGICContent = "";
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(153);
				expr();
				}
				break;
			case 2:
				{
				setState(154);
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
		public TerminalNode PONTO() { return getToken(IsiLangParser.PONTO, 0); }
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
		enterRule(_localctx, 24, RULE_attribVector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(ID);

								verificaID(_input.LT(-1).getText());  
			                    _exprID = _input.LT(-1).getText(); 
			                   
			setState(161);
			match(PONTO);
			setState(162);
			match(ATTR);
			 _exprVectorContent = "";
			setState(164);
			match(ACH);
			 _exprVectorContent += "{";
			setState(166);
			vectorAtrExpr();
			setState(167);
			match(FCH);
			 _exprVectorContent += "}";


			               		IsiVariable currentVar = (IsiVariable) symbolTable.get(_exprID);
			               		currentVar.setValue("value");
			               		symbolTable.add(currentVar); 
								if ( _tipo != currentVar.getType()-3 ){
			               	 		throw new IsiSemanticException("Type mismatch at variable named "+currentVar.getName()+", expecting "+ TYPPES[currentVar.getType()-3] + " but got " + TYPPES[_tipo] +"\n");
			               	 	}

								if ( !vectorStatic ) { // se nao for statico 
										String tamanhoDeclarado = vectorLengthDeclr.get(_exprID);
										
										if ( !vectorLenghVerified.toString().trim().equals(tamanhoDeclarado) ){
										throw new IsiSemanticException("Mismatch sizes for vector " + currentVar.getName() +", size declared :" + tamanhoDeclarado + ",but got "+ vectorLenghVerified.toString() + "!\n"   );
										}
								 }
									vectorLenghVerified = 0;
			               
			setState(170);
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
		enterRule(_localctx, 26, RULE_attribVectorAtIndex);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ID);
				// ID [expr] = value; 
								verificaID(_input.LT(-1).getText());  
			                	_exprID = _input.LT(-1).getText();
			                	IsiVariable currentVar = (IsiVariable) symbolTable.get(_exprID);
			               		currentVar.setValue("value"); 
			                
			setState(175);
			match(OB);
			 _exprID+= "[ (int)"; 
			setState(177);
			expr();
			 _exprID += _exprContent;
			setState(179);
			match(CB);
			 _exprID+="]";
			setState(181);
			match(ATTR);
			 _exprContent = ""; _exprLOGICContent= "";
			setState(185);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(183);
				expr();
				}
				break;
			case 2:
				{
				setState(184);
				logicexpr();
				}
				break;
			}
			setState(187);
			match(SC);
			 
								if ( _exprType != currentVar.getType()-3 ){
			               	 		throw new IsiSemanticException("Type mismatch at variable named "+currentVar.getName()+", expecting "+ TYPPES[currentVar.getType()-3] + " but got " + TYPPES[_exprType] +"\n");
			               	 	}
			               	 		
							 	
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
		enterRule(_localctx, 28, RULE_vectorAtrExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			termoVector();
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(191);
				match(VIR);
				 _exprVectorContent += ",";
				setState(193);
				termoVector();
				}
				}
				setState(198);
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
		public TerminalNode FCH() { return getToken(IsiLangParser.FCH, 0); }
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
		enterRule(_localctx, 30, RULE_termoVector);
		try {
			setState(207);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(199);
				match(FCH);

							  	_debug =_input.LT(-1).getText();
							  	
							  	 
							  	 if( _debug == _debug){
							  		throw new IsiSemanticException("Invalid size atribuiton for the vector named "+_exprID+"\n");
							  	 }
							  
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(NUMBER);
						if (!vectorStatic){  vectorLenghVerified++; }
				              	_exprVectorContent += _input.LT(-1).getText();
								_tipo = IsiVariable.NUMBER;
								IsiVariable currentVar = (IsiVariable) symbolTable.get(_exprID);
				               	 currentVar.setValue("value");
				               	 symbolTable.add(currentVar);
								if ( _tipo != currentVar.getType()-3 ){
				               		throw new IsiSemanticException("Type mismatch at variable named "+currentVar.getName()+", expecting "+ TYPPES[currentVar.getType()-3] + " but got " + TYPPES[_tipo] +"\n");
				               	 } 
				              
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(203);
				match(TEXT);
				 		if (!vectorStatic){  vectorLenghVerified++; }
								  _tipo = IsiVariable.TEXT;	
								  _exprVectorContent += _input.LT(-1).getText();
								  IsiVariable currentVar = (IsiVariable) symbolTable.get(_exprID);
				               	 currentVar.setValue("value");
				               	 symbolTable.add(currentVar);
								 if ( _tipo != currentVar.getType()-3 ){
				               		throw new IsiSemanticException("Type mismatch at variable named "+currentVar.getName()+", expecting "+ TYPPES[currentVar.getType()-3] + " but got " + TYPPES[_tipo] +"\n");
				               	 }
				              
				}
				break;
			case LOGIC:
				enterOuterAlt(_localctx, 4);
				{
				setState(205);
				match(LOGIC);
				 		if (!vectorStatic){  vectorLenghVerified++; }
								  _tipo = IsiVariable.LOGIC;	
								  _exprVectorContent += _input.LT(-1).getText();
								  IsiVariable currentVar = (IsiVariable) symbolTable.get(_exprID);
				               	 currentVar.setValue("value");
				               	 symbolTable.add(currentVar);
								 if ( _tipo != currentVar.getType()-3 ){
				               		throw new IsiSemanticException("Type mismatch at variable named "+currentVar.getName()+", expecting "+ TYPPES[currentVar.getType()-3] + " but got " + TYPPES[_tipo] +"\n");
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
		enterRule(_localctx, 32, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(T__7);
			setState(210);
			match(AP);
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(211);
				condse();
				}
				break;
			case 2:
				{
				setState(212);
				logicexpr();
				ifStatements.push(_exprLOGICContent);
				}
				break;
			}
			setState(217);
			match(FP);
			setState(218);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(221); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(220);
				cmd();
				}
				}
				setState(223); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(225);
			match(FCH);
			listaTrue = stack.pop();
			setState(238);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(227);
				match(T__8);
				setState(228);
				match(ACH);

				                   	 	curThread = new ArrayList<AbstractCommand>();
				                   	 	stack.push(curThread);
				                   	 
				setState(231); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(230);
					cmd();
					}
					}
					setState(233); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
				setState(235);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
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
		enterRule(_localctx, 34, RULE_condse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			expr();
			_exprDecision = _exprContent; 
			setState(244);
			match(OPREL);
			_exprDecision += _input.LT(-1).getText(); 
			setState(246);
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
		enterRule(_localctx, 36, RULE_cmdrepeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__9);
			setState(251);
			match(AP);
			_exprLOGICContent = ""; _exprWhile = "";
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(253);
				condWhile();
				}
				break;
			case 2:
				{
				setState(254);
				logicexpr();
				whileStatements.push(_exprLOGICContent);
				}
				break;
			}
			setState(259);
			match(FP);
			setState(260);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
					                      stack.push(curThread);
					                    
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(262);
				cmd();
				}
				}
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(267);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
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
		enterRule(_localctx, 38, RULE_condWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			expr();
			_exprWhile = _exprContent; 
			setState(272);
			match(OPREL);
			_exprWhile += _input.LT(-1).getText(); 
			setState(274);
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
		enterRule(_localctx, 40, RULE_cmdfacaenquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__10);
			 _exprDoWhile = "";
			setState(280);
			match(ACH);
			 
										  curThread = new ArrayList<AbstractCommand>(); 
					                      stack.push(curThread);
					                    
			setState(283); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(282);
				cmd();
				}
				}
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(287);
			match(FCH);


					                    
			setState(289);
			match(T__9);
			setState(290);
			match(AP);
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(291);
				condDoWhile();
				}
				break;
			case 2:
				{
				setState(292);
				logicexpr();
				dowhileStatements.push(_exprLOGICContent);
				}
				break;
			}
			setState(297);
			match(FP);
			setState(298);
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
		enterRule(_localctx, 42, RULE_condDoWhile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(ID);
			_exprDoWhile = _input.LT(-1).getText(); 
			setState(303);
			match(OPREL);
			_exprDoWhile += _input.LT(-1).getText(); 
			setState(305);
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
		enterRule(_localctx, 44, RULE_cmdpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			match(T__11);
			setState(310);
			match(AP);
			setState(311);
			attrFor();
			setState(312);
			match(SC);
			setState(313);
			condFor();
			setState(314);
			match(SC);
			setState(315);
			attrFor();
			setState(316);
			match(FP);
			setState(317);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(320); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(319);
				cmd();
				}
				}
				setState(322); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(324);
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
		enterRule(_localctx, 46, RULE_attrFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
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
		enterRule(_localctx, 48, RULE_condFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			expr();
			_exprForB = _exprContent; 
			setState(332);
			match(OPREL);
			_exprForB += _input.LT(-1).getText(); 
			setState(334);
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
		enterRule(_localctx, 50, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			_exprContent = "";
			setState(348);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(339);
				termo();
				}
				break;
			case 2:
				{
				setState(340);
				match(ID);
				 _exprContent += _input.LT(-1).getText();
				setState(342);
				match(OB);
				 _exprContent += _input.LT(-1).getText();  _exprContent += "(int)";
							
				setState(344);
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
				setState(346);
				match(CB);
				 _exprContent += _input.LT(-1).getText();
							
				}
				break;
			}
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(350);
				match(OP);
				 _exprContent += _input.LT(-1).getText();
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(352);
					termo();
					}
					break;
				case 2:
					{
					setState(353);
					match(ID);
					 _exprContent += _input.LT(-1).getText();
					setState(355);
					match(OB);
					 _exprContent += _input.LT(-1).getText();  _exprContent += "(int)";
									
					setState(357);
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
					setState(359);
					match(CB);
					 _exprContent += _input.LT(-1).getText();
									
					}
					break;
				}
				}
				}
				setState(367);
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
		enterRule(_localctx, 52, RULE_logicexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			logicterm();
			 _exprMOL = false;
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIN_OP_LOGIC) {
				{
				{
				setState(372);
				match(BIN_OP_LOGIC);
				 _exprLOGICContent += _input.LT(-1).getText(); 
				setState(374);
				logicterm();
				}
				}
				setState(379);
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
		enterRule(_localctx, 54, RULE_logicterm);
		try {
			setState(390);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
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
				setState(382);
				match(UNIT_OP_LOGIC);
				setState(383);
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
				setState(385);
				match(LOGIC);
				 
								_exprLOGICContent += _input.LT(-1).getText();
				              	_exprType = IsiVariable.LOGIC; 

							 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(387);
				match(UNIT_OP_LOGIC);
				setState(388);
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
		enterRule(_localctx, 56, RULE_termo);
		try {
			setState(398);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(392);
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
				setState(394);
				match(NUMBER);
					
				              	_exprContent += _input.LT(-1).getText();
				              	_exprType = IsiVariable.NUMBER;
				              
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(396);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3$\u0193\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\6\3F\n\3\r\3\16\3G\3\4\3\4\3\4\3\4\3\4\3\4\7\4P\n\4\f"+
		"\4\16\4S\13\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7n\n\7\3\b\3\b\6\br\n\b"+
		"\r\b\16\bs\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\177\n\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\5\13\u008e\n\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009e\n\r\3\r\3"+
		"\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00bc"+
		"\n\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\7\20\u00c5\n\20\f\20\16\20\u00c8"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d2\n\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\5\22\u00da\n\22\3\22\3\22\3\22\3\22\6\22\u00e0"+
		"\n\22\r\22\16\22\u00e1\3\22\3\22\3\22\3\22\3\22\3\22\6\22\u00ea\n\22\r"+
		"\22\16\22\u00eb\3\22\3\22\3\22\5\22\u00f1\n\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0104"+
		"\n\24\3\24\3\24\3\24\3\24\6\24\u010a\n\24\r\24\16\24\u010b\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\6"+
		"\26\u011e\n\26\r\26\16\26\u011f\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u012a\n\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\6\30\u0143"+
		"\n\30\r\30\16\30\u0144\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\33\5\33\u015f\n\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u016c\n\33\7\33\u016e\n\33\f\33\16\33\u0171\13\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\7\34\u017a\n\34\f\34\16\34\u017d\13\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0189\n\35\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u0191\n\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\3\3\2\32\33\2\u019d\2<\3\2"+
		"\2\2\4E\3\2\2\2\6I\3\2\2\2\bV\3\2\2\2\n]\3\2\2\2\fm\3\2\2\2\16o\3\2\2"+
		"\2\20~\3\2\2\2\22\u0080\3\2\2\2\24\u0088\3\2\2\2\26\u0093\3\2\2\2\30\u0097"+
		"\3\2\2\2\32\u00a1\3\2\2\2\34\u00af\3\2\2\2\36\u00c0\3\2\2\2 \u00d1\3\2"+
		"\2\2\"\u00d3\3\2\2\2$\u00f4\3\2\2\2&\u00fc\3\2\2\2(\u0110\3\2\2\2*\u0118"+
		"\3\2\2\2,\u012f\3\2\2\2.\u0137\3\2\2\2\60\u0149\3\2\2\2\62\u014c\3\2\2"+
		"\2\64\u0154\3\2\2\2\66\u0174\3\2\2\28\u0188\3\2\2\2:\u0190\3\2\2\2<=\7"+
		"\3\2\2=>\5\4\3\2>?\5\16\b\2?@\7\4\2\2@A\b\2\1\2A\3\3\2\2\2BF\5\6\4\2C"+
		"F\5\b\5\2DF\5\n\6\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2FG\3\2\2\2GE\3\2\2\2"+
		"GH\3\2\2\2H\5\3\2\2\2IJ\5\f\7\2JK\7\32\2\2KQ\b\4\1\2LM\7\24\2\2MN\7\32"+
		"\2\2NP\b\4\1\2OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2"+
		"\2\2TU\7\21\2\2U\7\3\2\2\2VW\7\27\2\2WX\7\30\2\2XY\5\f\7\2YZ\7\32\2\2"+
		"Z[\b\5\1\2[\\\7\21\2\2\\\t\3\2\2\2]^\7\27\2\2^_\7\33\2\2_`\b\6\1\2`a\7"+
		"\30\2\2ab\5\f\7\2bc\7\32\2\2cd\b\6\1\2de\7\21\2\2ef\b\6\1\2f\13\3\2\2"+
		"\2gh\7\5\2\2hn\b\7\1\2ij\7\6\2\2jn\b\7\1\2kl\7\7\2\2ln\b\7\1\2mg\3\2\2"+
		"\2mi\3\2\2\2mk\3\2\2\2n\r\3\2\2\2oq\b\b\1\2pr\5\20\t\2qp\3\2\2\2rs\3\2"+
		"\2\2sq\3\2\2\2st\3\2\2\2t\17\3\2\2\2u\177\5\22\n\2v\177\5\24\13\2w\177"+
		"\5\26\f\2x\177\5\"\22\2y\177\5&\24\2z\177\5*\26\2{\177\5.\30\2|\177\5"+
		"\32\16\2}\177\5\34\17\2~u\3\2\2\2~v\3\2\2\2~w\3\2\2\2~x\3\2\2\2~y\3\2"+
		"\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\21\3\2\2\2\u0080\u0081"+
		"\7\b\2\2\u0081\u0082\7\17\2\2\u0082\u0083\7\32\2\2\u0083\u0084\b\n\1\2"+
		"\u0084\u0085\7\20\2\2\u0085\u0086\7\21\2\2\u0086\u0087\b\n\1\2\u0087\23"+
		"\3\2\2\2\u0088\u0089\7\t\2\2\u0089\u008a\7\17\2\2\u008a\u008d\b\13\1\2"+
		"\u008b\u008e\5\64\33\2\u008c\u008e\5\66\34\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\7\20\2\2\u0090\u0091\7"+
		"\21\2\2\u0091\u0092\b\13\1\2\u0092\25\3\2\2\2\u0093\u0094\5\30\r\2\u0094"+
		"\u0095\7\21\2\2\u0095\u0096\b\f\1\2\u0096\27\3\2\2\2\u0097\u0098\7\32"+
		"\2\2\u0098\u0099\b\r\1\2\u0099\u009a\7\23\2\2\u009a\u009d\b\r\1\2\u009b"+
		"\u009e\5\64\33\2\u009c\u009e\5\66\34\2\u009d\u009b\3\2\2\2\u009d\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\b\r\1\2\u00a0\31\3\2\2\2\u00a1"+
		"\u00a2\7\32\2\2\u00a2\u00a3\b\16\1\2\u00a3\u00a4\7$\2\2\u00a4\u00a5\7"+
		"\23\2\2\u00a5\u00a6\b\16\1\2\u00a6\u00a7\7\25\2\2\u00a7\u00a8\b\16\1\2"+
		"\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\b\16\1\2\u00ab"+
		"\u00ac\b\16\1\2\u00ac\u00ad\7\21\2\2\u00ad\u00ae\b\16\1\2\u00ae\33\3\2"+
		"\2\2\u00af\u00b0\7\32\2\2\u00b0\u00b1\b\17\1\2\u00b1\u00b2\7\27\2\2\u00b2"+
		"\u00b3\b\17\1\2\u00b3\u00b4\5\64\33\2\u00b4\u00b5\b\17\1\2\u00b5\u00b6"+
		"\7\30\2\2\u00b6\u00b7\b\17\1\2\u00b7\u00b8\7\23\2\2\u00b8\u00bb\b\17\1"+
		"\2\u00b9\u00bc\5\64\33\2\u00ba\u00bc\5\66\34\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\21\2\2\u00be\u00bf\b"+
		"\17\1\2\u00bf\35\3\2\2\2\u00c0\u00c6\5 \21\2\u00c1\u00c2\7\24\2\2\u00c2"+
		"\u00c3\b\20\1\2\u00c3\u00c5\5 \21\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3"+
		"\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\37\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\7\26\2\2\u00ca\u00d2\b\21\1\2\u00cb\u00cc\7"+
		"\33\2\2\u00cc\u00d2\b\21\1\2\u00cd\u00ce\7\35\2\2\u00ce\u00d2\b\21\1\2"+
		"\u00cf\u00d0\7\36\2\2\u00d0\u00d2\b\21\1\2\u00d1\u00c9\3\2\2\2\u00d1\u00cb"+
		"\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2!\3\2\2\2\u00d3"+
		"\u00d4\7\n\2\2\u00d4\u00d9\7\17\2\2\u00d5\u00da\5$\23\2\u00d6\u00d7\5"+
		"\66\34\2\u00d7\u00d8\b\22\1\2\u00d8\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2"+
		"\u00d9\u00d6\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\20\2\2\u00dc\u00dd"+
		"\7\25\2\2\u00dd\u00df\b\22\1\2\u00de\u00e0\5\20\t\2\u00df\u00de\3\2\2"+
		"\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3"+
		"\3\2\2\2\u00e3\u00e4\7\26\2\2\u00e4\u00f0\b\22\1\2\u00e5\u00e6\7\13\2"+
		"\2\u00e6\u00e7\7\25\2\2\u00e7\u00e9\b\22\1\2\u00e8\u00ea\5\20\t\2\u00e9"+
		"\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\7\26\2\2\u00ee\u00ef\b\22\1\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f3\b\22\1\2\u00f3#\3\2\2\2\u00f4\u00f5\5\64\33\2\u00f5\u00f6"+
		"\b\23\1\2\u00f6\u00f7\7\31\2\2\u00f7\u00f8\b\23\1\2\u00f8\u00f9\5\64\33"+
		"\2\u00f9\u00fa\b\23\1\2\u00fa\u00fb\b\23\1\2\u00fb%\3\2\2\2\u00fc\u00fd"+
		"\7\f\2\2\u00fd\u00fe\7\17\2\2\u00fe\u0103\b\24\1\2\u00ff\u0104\5(\25\2"+
		"\u0100\u0101\5\66\34\2\u0101\u0102\b\24\1\2\u0102\u0104\3\2\2\2\u0103"+
		"\u00ff\3\2\2\2\u0103\u0100\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\7\20"+
		"\2\2\u0106\u0107\7\25\2\2\u0107\u0109\b\24\1\2\u0108\u010a\5\20\t\2\u0109"+
		"\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\26\2\2\u010e\u010f\b\24\1\2\u010f"+
		"\'\3\2\2\2\u0110\u0111\5\64\33\2\u0111\u0112\b\25\1\2\u0112\u0113\7\31"+
		"\2\2\u0113\u0114\b\25\1\2\u0114\u0115\5\64\33\2\u0115\u0116\b\25\1\2\u0116"+
		"\u0117\b\25\1\2\u0117)\3\2\2\2\u0118\u0119\7\r\2\2\u0119\u011a\b\26\1"+
		"\2\u011a\u011b\7\25\2\2\u011b\u011d\b\26\1\2\u011c\u011e\5\20\t\2\u011d"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2"+
		"\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7\26\2\2\u0122\u0123\b\26\1\2\u0123"+
		"\u0124\7\f\2\2\u0124\u0129\7\17\2\2\u0125\u012a\5,\27\2\u0126\u0127\5"+
		"\66\34\2\u0127\u0128\b\26\1\2\u0128\u012a\3\2\2\2\u0129\u0125\3\2\2\2"+
		"\u0129\u0126\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012c\7\20\2\2\u012c\u012d"+
		"\7\21\2\2\u012d\u012e\b\26\1\2\u012e+\3\2\2\2\u012f\u0130\7\32\2\2\u0130"+
		"\u0131\b\27\1\2\u0131\u0132\7\31\2\2\u0132\u0133\b\27\1\2\u0133\u0134"+
		"\5\64\33\2\u0134\u0135\b\27\1\2\u0135\u0136\b\27\1\2\u0136-\3\2\2\2\u0137"+
		"\u0138\7\16\2\2\u0138\u0139\7\17\2\2\u0139\u013a\5\60\31\2\u013a\u013b"+
		"\7\21\2\2\u013b\u013c\5\62\32\2\u013c\u013d\7\21\2\2\u013d\u013e\5\60"+
		"\31\2\u013e\u013f\7\20\2\2\u013f\u0140\7\25\2\2\u0140\u0142\b\30\1\2\u0141"+
		"\u0143\5\20\t\2\u0142\u0141\3\2\2\2\u0143\u0144\3\2\2\2\u0144\u0142\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\26\2\2\u0147"+
		"\u0148\b\30\1\2\u0148/\3\2\2\2\u0149\u014a\5\30\r\2\u014a\u014b\b\31\1"+
		"\2\u014b\61\3\2\2\2\u014c\u014d\5\64\33\2\u014d\u014e\b\32\1\2\u014e\u014f"+
		"\7\31\2\2\u014f\u0150\b\32\1\2\u0150\u0151\5\64\33\2\u0151\u0152\b\32"+
		"\1\2\u0152\u0153\b\32\1\2\u0153\63\3\2\2\2\u0154\u015e\b\33\1\2\u0155"+
		"\u015f\5:\36\2\u0156\u0157\7\32\2\2\u0157\u0158\b\33\1\2\u0158\u0159\7"+
		"\27\2\2\u0159\u015a\b\33\1\2\u015a\u015b\t\2\2\2\u015b\u015c\b\33\1\2"+
		"\u015c\u015d\7\30\2\2\u015d\u015f\b\33\1\2\u015e\u0155\3\2\2\2\u015e\u0156"+
		"\3\2\2\2\u015f\u016f\3\2\2\2\u0160\u0161\7\22\2\2\u0161\u016b\b\33\1\2"+
		"\u0162\u016c\5:\36\2\u0163\u0164\7\32\2\2\u0164\u0165\b\33\1\2\u0165\u0166"+
		"\7\27\2\2\u0166\u0167\b\33\1\2\u0167\u0168\t\2\2\2\u0168\u0169\b\33\1"+
		"\2\u0169\u016a\7\30\2\2\u016a\u016c\b\33\1\2\u016b\u0162\3\2\2\2\u016b"+
		"\u0163\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u0160\3\2\2\2\u016e\u0171\3\2"+
		"\2\2\u016f\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0172\3\2\2\2\u0171"+
		"\u016f\3\2\2\2\u0172\u0173\b\33\1\2\u0173\65\3\2\2\2\u0174\u0175\58\35"+
		"\2\u0175\u017b\b\34\1\2\u0176\u0177\7\37\2\2\u0177\u0178\b\34\1\2\u0178"+
		"\u017a\58\35\2\u0179\u0176\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2"+
		"\2\2\u017b\u017c\3\2\2\2\u017c\67\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f"+
		"\7\32\2\2\u017f\u0189\b\35\1\2\u0180\u0181\7 \2\2\u0181\u0182\7\32\2\2"+
		"\u0182\u0189\b\35\1\2\u0183\u0184\7\36\2\2\u0184\u0189\b\35\1\2\u0185"+
		"\u0186\7 \2\2\u0186\u0187\7\36\2\2\u0187\u0189\b\35\1\2\u0188\u017e\3"+
		"\2\2\2\u0188\u0180\3\2\2\2\u0188\u0183\3\2\2\2\u0188\u0185\3\2\2\2\u0189"+
		"9\3\2\2\2\u018a\u018b\7\32\2\2\u018b\u0191\b\36\1\2\u018c\u018d\7\33\2"+
		"\2\u018d\u0191\b\36\1\2\u018e\u018f\7\35\2\2\u018f\u0191\b\36\1\2\u0190"+
		"\u018a\3\2\2\2\u0190\u018c\3\2\2\2\u0190\u018e\3\2\2\2\u0191;\3\2\2\2"+
		"\34EGQms~\u008d\u009d\u00bb\u00c6\u00d1\u00d9\u00e1\u00eb\u00f0\u0103"+
		"\u010b\u011f\u0129\u0144\u015e\u016b\u016f\u017b\u0188\u0190";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}