// Generated from /home/fabio/Vídeos/IsiLanguageEmbriao/IsiLang.g4 by ANTLR 4.8

	import br.com.professorisidro.isilanguage.datastructures.IsiSymbol;
	import br.com.professorisidro.isilanguage.datastructures.IsiVariable;
	import br.com.professorisidro.isilanguage.datastructures.IsiSymbolTable;
	import br.com.professorisidro.isilanguage.exceptions.IsiSemanticException;
	import br.com.professorisidro.isilanguage.ast.IsiProgram;
	import br.com.professorisidro.isilanguage.ast.AbstractCommand;
	import br.com.professorisidro.isilanguage.ast.CommandLeitura;
	import br.com.professorisidro.isilanguage.ast.CommandEscrita;
	import br.com.professorisidro.isilanguage.ast.CommandAtribuicao;
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
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, AP=13, FP=14, SC=15, OP=16, ATTR=17, VIR=18, 
		ACH=19, FCH=20, OPREL=21, ID=22, NUMBER=23, ASPAS=24, TEXT=25, LOGIC=26, 
		BIN_OP_LOGIC=27, UNIT_OP_LOGIC=28, WS=29, COMMENT=30, LINE_COMMENT=31;
	public static final int
		RULE_prog = 0, RULE_decl = 1, RULE_declaravar = 2, RULE_tipo = 3, RULE_bloco = 4, 
		RULE_cmd = 5, RULE_cmdleitura = 6, RULE_cmdescrita = 7, RULE_cmdattrib = 8, 
		RULE_cmdselecao = 9, RULE_cmdrepeticao = 10, RULE_cmdfacaenquanto = 11, 
		RULE_cmdpara = 12, RULE_incrementoFor = 13, RULE_attrFor = 14, RULE_condFor = 15, 
		RULE_expr = 16, RULE_logicexpr = 17, RULE_logicterm = 18, RULE_termo = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "decl", "declaravar", "tipo", "bloco", "cmd", "cmdleitura", "cmdescrita", 
			"cmdattrib", "cmdselecao", "cmdrepeticao", "cmdfacaenquanto", "cmdpara", 
			"incrementoFor", "attrFor", "condFor", "expr", "logicexpr", "logicterm", 
			"termo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'programa'", "'fimprog;'", "'numero'", "'texto'", "'logico'", 
			"'leia'", "'escreva'", "'se'", "'senao'", "'enquanto'", "'faca'", "'para'", 
			"'('", "')'", "';'", null, "'='", "','", "'{'", "'}'", null, null, null, 
			"'\"'", null, null, null, "'!'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", 
			"NUMBER", "ASPAS", "TEXT", "LOGIC", "BIN_OP_LOGIC", "UNIT_OP_LOGIC", 
			"WS", "COMMENT", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		private int _tipo;
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
		private String _exprRepetition;
		private boolean _exprMOL; // true for logic expr  0 for the others expr types 
		private String _exprDoWhile;
		private String _exprForA;
		private String _exprForB;
		private String _exprForC;

		private Stack<String> whileStatements = new Stack<String>();
		private String _exprLOGICContent;

		private ArrayList<AbstractCommand> listaTrue;
		private ArrayList<AbstractCommand> listaFalse;
		private ArrayList<AbstractCommand> listaWhile;
		private ArrayList<AbstractCommand> listaFor; 
		private ArrayList<AbstractCommand> listaDoWhile; 
		
		private static final String[] TYPPES = {"NUMERO","TEXTO","LOGICO"};
		
		
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
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(T__0);
			setState(41);
			decl();
			setState(42);
			bloco();
			setState(43);
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
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				declaravar();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4))) != 0) );
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
	}

	public final DeclaravarContext declaravar() throws RecognitionException {
		DeclaravarContext _localctx = new DeclaravarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaravar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			tipo();
			setState(52);
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
			                    
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIR) {
				{
				{
				setState(54);
				match(VIR);
				setState(55);
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
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tipo);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__2);
				 _tipo = IsiVariable.NUMBER;  
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				match(T__3);
				 _tipo = IsiVariable.TEXT;  
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(68);
				match(T__4);
				 _tipo = IsiVariable.LOGIC;  
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
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
						curThread = new ArrayList<AbstractCommand>(); 
				        stack.push(curThread);  
			          
			setState(74); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				cmd();
				}
				}
				setState(76); 
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
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmd);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				cmdleitura();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(79);
				cmdescrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				cmdattrib();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(81);
				cmdselecao();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 5);
				{
				setState(82);
				cmdrepeticao();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 6);
				{
				setState(83);
				cmdfacaenquanto();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 7);
				{
				setState(84);
				cmdpara();
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

	public static class CmdleituraContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdleituraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdleitura; }
	}

	public final CmdleituraContext cmdleitura() throws RecognitionException {
		CmdleituraContext _localctx = new CmdleituraContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdleitura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__5);
			setState(88);
			match(AP);
			setState(89);
			match(ID);
			 verificaID(_input.LT(-1).getText());
			                     	  _readID = _input.LT(-1).getText();
			                        
			setState(91);
			match(FP);
			setState(92);
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
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public CmdescritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdescrita; }
	}

	public final CmdescritaContext cmdescrita() throws RecognitionException {
		CmdescritaContext _localctx = new CmdescritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdescrita);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__6);
			setState(96);
			match(AP);
			setState(97);
			match(ID);
			 verificaID(_input.LT(-1).getText());
				                  _writeID = _input.LT(-1).getText();
			                     
			setState(99);
			match(FP);
			setState(100);
			match(SC);

			               	  CommandEscrita cmd = new CommandEscrita(_writeID);
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
		public TerminalNode ID() { return getToken(IsiLangParser.ID, 0); }
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LogicexprContext logicexpr() {
			return getRuleContext(LogicexprContext.class,0);
		}
		public CmdattribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdattrib; }
	}

	public final CmdattribContext cmdattrib() throws RecognitionException {
		CmdattribContext _localctx = new CmdattribContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdattrib);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(ID);
			 verificaID(_input.LT(-1).getText());  
								
			                    
			                    _exprID = _input.LT(-1).getText();
			                   
			setState(105);
			match(ATTR);
			 _exprContent = ""; _exprLOGICContent = "";
			setState(109);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(107);
				expr();
				}
				break;
			case 2:
				{
				setState(108);
				logicexpr();
				}
				break;
			}
			 	
			               		IsiVariable currentVar = (IsiVariable) symbolTable.get(_exprID);
			               		currentVar.setValue("debug");
			               		symbolTable.add(currentVar); 

			               		if ( _exprType != currentVar.getType() ){
			               	 		throw new IsiSemanticException("Type mismatch at variable named "+currentVar.getName()+", expecting "+ TYPPES[currentVar.getType()] + " but got " + TYPPES[_exprType] +"\n");
			               	 	}

			               
			setState(112);
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

	public static class CmdselecaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public List<TerminalNode> ACH() { return getTokens(IsiLangParser.ACH); }
		public TerminalNode ACH(int i) {
			return getToken(IsiLangParser.ACH, i);
		}
		public List<TerminalNode> FCH() { return getTokens(IsiLangParser.FCH); }
		public TerminalNode FCH(int i) {
			return getToken(IsiLangParser.FCH, i);
		}
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
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
	}

	public final CmdselecaoContext cmdselecao() throws RecognitionException {
		CmdselecaoContext _localctx = new CmdselecaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdselecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(T__7);
			setState(116);
			match(AP);
			setState(117);
			match(ID);
			 _exprDecision = _input.LT(-1).getText(); 
			setState(119);
			match(OPREL);
			 _exprDecision += _input.LT(-1).getText(); 
			setState(121);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprDecision += _input.LT(-1).getText(); 
			setState(123);
			match(FP);
			setState(124);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				cmd();
				}
				}
				setState(129); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(131);
			match(FCH);

			                       listaTrue = stack.pop();	
			                    
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(133);
				match(T__8);
				setState(134);
				match(ACH);

				                   	 	curThread = new ArrayList<AbstractCommand>();
				                   	 	stack.push(curThread);
				                   	 
				{
				setState(137); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(136);
					cmd();
					}
					}
					setState(139); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
				}
				setState(141);
				match(FCH);

				                   		listaFalse = stack.pop();
				                   		CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
				                   		stack.peek().add(cmd);
				                   	
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

	public static class CmdrepeticaoContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode ACH() { return getToken(IsiLangParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(IsiLangParser.FCH, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
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
	}

	public final CmdrepeticaoContext cmdrepeticao() throws RecognitionException {
		CmdrepeticaoContext _localctx = new CmdrepeticaoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdrepeticao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__9);
			setState(147);
			match(AP);
			setState(148);
			match(ID);
			 _exprRepetition = _input.LT(-1).getText(); 
			setState(150);
			match(OPREL);
			 _exprRepetition += _input.LT(-1).getText(); 
			setState(152);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprRepetition += _input.LT(-1).getText(); 
				 						
										whileStatements.push(_exprRepetition);
										
			setState(154);
			match(FP);
			setState(155);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
					                      stack.push(curThread);
					                    
			setState(158); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(157);
				cmd();
				}
				}
				setState(160); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(162);
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

	public static class CmdfacaenquantoContext extends ParserRuleContext {
		public TerminalNode ACH() { return getToken(IsiLangParser.ACH, 0); }
		public TerminalNode FCH() { return getToken(IsiLangParser.FCH, 0); }
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public TerminalNode FP() { return getToken(IsiLangParser.FP, 0); }
		public TerminalNode SC() { return getToken(IsiLangParser.SC, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
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
	}

	public final CmdfacaenquantoContext cmdfacaenquanto() throws RecognitionException {
		CmdfacaenquantoContext _localctx = new CmdfacaenquantoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_cmdfacaenquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(T__10);
			 _exprDoWhile = "";
			setState(167);
			match(ACH);
			 
										  curThread = new ArrayList<AbstractCommand>(); 
					                      stack.push(curThread);
					                    
			setState(170); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(169);
				cmd();
				}
				}
				setState(172); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(174);
			match(FCH);


					                    
			setState(176);
			match(T__9);
			setState(177);
			match(AP);
			setState(178);
			match(ID);
			 _exprDoWhile = _input.LT(-1).getText(); 
			setState(180);
			match(OPREL);
			 _exprDoWhile += _input.LT(-1).getText(); 
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 _exprDoWhile += _input.LT(-1).getText(); 
			setState(184);
			match(FP);
			setState(185);
			match(SC);
			 
										    listaDoWhile = stack.pop();
					                        CommandFacaEnquanto cmd = new CommandFacaEnquanto(_exprDoWhile, listaDoWhile);
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

	public static class CmdparaContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(IsiLangParser.AP, 0); }
		public AttrForContext attrFor() {
			return getRuleContext(AttrForContext.class,0);
		}
		public List<TerminalNode> SC() { return getTokens(IsiLangParser.SC); }
		public TerminalNode SC(int i) {
			return getToken(IsiLangParser.SC, i);
		}
		public CondForContext condFor() {
			return getRuleContext(CondForContext.class,0);
		}
		public IncrementoForContext incrementoFor() {
			return getRuleContext(IncrementoForContext.class,0);
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
	}

	public final CmdparaContext cmdpara() throws RecognitionException {
		CmdparaContext _localctx = new CmdparaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_cmdpara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__11);
			setState(189);
			match(AP);
			setState(190);
			attrFor();
			setState(191);
			match(SC);
			setState(192);
			condFor();
			setState(193);
			match(SC);
			setState(194);
			incrementoFor();
			setState(195);
			match(FP);
			setState(196);
			match(ACH);
			 curThread = new ArrayList<AbstractCommand>(); 
			                      stack.push(curThread);
			                    
			setState(199); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(198);
				cmd();
				}
				}
				setState(201); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << ID))) != 0) );
			setState(203);
			match(FCH);

			                       listaFor = stack.pop();
			                       CommandPara cmd = new CommandPara(_exprForA,_exprForB,_exprForC, listaFor);
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

	public static class IncrementoForContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(IsiLangParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(IsiLangParser.NUMBER, i);
		}
		public List<TerminalNode> OP() { return getTokens(IsiLangParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(IsiLangParser.OP, i);
		}
		public IncrementoForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementoFor; }
	}

	public final IncrementoForContext incrementoFor() throws RecognitionException {
		IncrementoForContext _localctx = new IncrementoForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_incrementoFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(ID);
			_exprForC = _input.LT(-1).getText();
			setState(208);
			match(ATTR);
			_exprForC += _input.LT(-1).getText();
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprForC += _input.LT(-1).getText();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(212);
				match(OP);
				_exprForC += _input.LT(-1).getText();
				setState(214);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==NUMBER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				_exprForC += _input.LT(-1).getText();
				}
				}
				setState(220);
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

	public static class AttrForContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode ATTR() { return getToken(IsiLangParser.ATTR, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public AttrForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrFor; }
	}

	public final AttrForContext attrFor() throws RecognitionException {
		AttrForContext _localctx = new AttrForContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_attrFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(ID);
			_exprForA = _input.LT(-1).getText();
			setState(223);
			match(ATTR);
			_exprForA += '='; 
			setState(225);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprForA += _input.LT(-1).getText();
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
		public List<TerminalNode> ID() { return getTokens(IsiLangParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(IsiLangParser.ID, i);
		}
		public TerminalNode OPREL() { return getToken(IsiLangParser.OPREL, 0); }
		public TerminalNode NUMBER() { return getToken(IsiLangParser.NUMBER, 0); }
		public CondForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condFor; }
	}

	public final CondForContext condFor() throws RecognitionException {
		CondForContext _localctx = new CondForContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condFor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			_exprForB = _input.LT(-1).getText(); 
			setState(230);
			match(OPREL);
			_exprForB += _input.LT(-1).getText(); 
			setState(232);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			_exprForB += _input.LT(-1).getText(); 
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
		public List<TerminalNode> OP() { return getTokens(IsiLangParser.OP); }
		public TerminalNode OP(int i) {
			return getToken(IsiLangParser.OP, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			termo();
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP) {
				{
				{
				setState(236);
				match(OP);
				 _exprContent += _input.LT(-1).getText();
				setState(238);
				termo();
				}
				}
				setState(243);
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
	}

	public final LogicexprContext logicexpr() throws RecognitionException {
		LogicexprContext _localctx = new LogicexprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			logicterm();
			 _exprMOL = false;
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BIN_OP_LOGIC) {
				{
				{
				setState(248);
				match(BIN_OP_LOGIC);
				 _exprLOGICContent += _input.LT(-1).getText(); 
				setState(250);
				logicterm();
				}
				}
				setState(255);
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
	}

	public final LogictermContext logicterm() throws RecognitionException {
		LogictermContext _localctx = new LogictermContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_logicterm);
		try {
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
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
				setState(258);
				match(UNIT_OP_LOGIC);
				setState(259);
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
				setState(261);
				match(LOGIC);
				 
								_exprLOGICContent += _input.LT(-1).getText();
				              	_exprType = IsiVariable.LOGIC; 

							 
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(263);
				match(UNIT_OP_LOGIC);
				setState(264);
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
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_termo);
		try {
			setState(274);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
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
				setState(270);
				match(NUMBER);
					
				              	_exprContent += _input.LT(-1).getText();
				              	_exprType = IsiVariable.NUMBER;
				              
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 3);
				{
				setState(272);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u0117\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\3\6\3\62\n\3"+
		"\r\3\16\3\63\3\4\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5I\n\5\3\6\3\6\6\6M\n\6\r\6\16\6N\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\5\7X\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\np\n\n\3\n\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u0082"+
		"\n\13\r\13\16\13\u0083\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u008c\n\13\r"+
		"\13\16\13\u008d\3\13\3\13\3\13\5\13\u0093\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\6\f\u00a1\n\f\r\f\16\f\u00a2\3\f\3\f\3\f\3\r"+
		"\3\r\3\r\3\r\3\r\6\r\u00ad\n\r\r\r\16\r\u00ae\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\6\16\u00ca\n\16\r\16\16\16\u00cb\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00db\n\17\f\17\16"+
		"\17\u00de\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\7\22\u00f2\n\22\f\22\16\22\u00f5\13"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\7\23\u00fe\n\23\f\23\16\23\u0101"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010d\n"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u0115\n\25\3\25\2\2\26\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \"$&(\2\3\3\2\30\31\2\u011c\2*\3\2\2\2"+
		"\4\61\3\2\2\2\6\65\3\2\2\2\bH\3\2\2\2\nJ\3\2\2\2\fW\3\2\2\2\16Y\3\2\2"+
		"\2\20a\3\2\2\2\22i\3\2\2\2\24u\3\2\2\2\26\u0094\3\2\2\2\30\u00a7\3\2\2"+
		"\2\32\u00be\3\2\2\2\34\u00d0\3\2\2\2\36\u00df\3\2\2\2 \u00e6\3\2\2\2\""+
		"\u00ed\3\2\2\2$\u00f8\3\2\2\2&\u010c\3\2\2\2(\u0114\3\2\2\2*+\7\3\2\2"+
		"+,\5\4\3\2,-\5\n\6\2-.\7\4\2\2./\b\2\1\2/\3\3\2\2\2\60\62\5\6\4\2\61\60"+
		"\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\66"+
		"\5\b\5\2\66\67\7\30\2\2\67=\b\4\1\289\7\24\2\29:\7\30\2\2:<\b\4\1\2;8"+
		"\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2@A\7\21\2\2"+
		"A\7\3\2\2\2BC\7\5\2\2CI\b\5\1\2DE\7\6\2\2EI\b\5\1\2FG\7\7\2\2GI\b\5\1"+
		"\2HB\3\2\2\2HD\3\2\2\2HF\3\2\2\2I\t\3\2\2\2JL\b\6\1\2KM\5\f\7\2LK\3\2"+
		"\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\13\3\2\2\2PX\5\16\b\2QX\5\20\t\2R"+
		"X\5\22\n\2SX\5\24\13\2TX\5\26\f\2UX\5\30\r\2VX\5\32\16\2WP\3\2\2\2WQ\3"+
		"\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2\2\2WV\3\2\2\2X\r\3\2\2\2YZ"+
		"\7\b\2\2Z[\7\17\2\2[\\\7\30\2\2\\]\b\b\1\2]^\7\20\2\2^_\7\21\2\2_`\b\b"+
		"\1\2`\17\3\2\2\2ab\7\t\2\2bc\7\17\2\2cd\7\30\2\2de\b\t\1\2ef\7\20\2\2"+
		"fg\7\21\2\2gh\b\t\1\2h\21\3\2\2\2ij\7\30\2\2jk\b\n\1\2kl\7\23\2\2lo\b"+
		"\n\1\2mp\5\"\22\2np\5$\23\2om\3\2\2\2on\3\2\2\2pq\3\2\2\2qr\b\n\1\2rs"+
		"\7\21\2\2st\b\n\1\2t\23\3\2\2\2uv\7\n\2\2vw\7\17\2\2wx\7\30\2\2xy\b\13"+
		"\1\2yz\7\27\2\2z{\b\13\1\2{|\t\2\2\2|}\b\13\1\2}~\7\20\2\2~\177\7\25\2"+
		"\2\177\u0081\b\13\1\2\u0080\u0082\5\f\7\2\u0081\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085"+
		"\u0086\7\26\2\2\u0086\u0092\b\13\1\2\u0087\u0088\7\13\2\2\u0088\u0089"+
		"\7\25\2\2\u0089\u008b\b\13\1\2\u008a\u008c\5\f\7\2\u008b\u008a\3\2\2\2"+
		"\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0090\7\26\2\2\u0090\u0091\b\13\1\2\u0091\u0093\3\2\2\2"+
		"\u0092\u0087\3\2\2\2\u0092\u0093\3\2\2\2\u0093\25\3\2\2\2\u0094\u0095"+
		"\7\f\2\2\u0095\u0096\7\17\2\2\u0096\u0097\7\30\2\2\u0097\u0098\b\f\1\2"+
		"\u0098\u0099\7\27\2\2\u0099\u009a\b\f\1\2\u009a\u009b\t\2\2\2\u009b\u009c"+
		"\b\f\1\2\u009c\u009d\7\20\2\2\u009d\u009e\7\25\2\2\u009e\u00a0\b\f\1\2"+
		"\u009f\u00a1\5\f\7\2\u00a0\u009f\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a5\7\26\2\2"+
		"\u00a5\u00a6\b\f\1\2\u00a6\27\3\2\2\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9"+
		"\b\r\1\2\u00a9\u00aa\7\25\2\2\u00aa\u00ac\b\r\1\2\u00ab\u00ad\5\f\7\2"+
		"\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\26\2\2\u00b1\u00b2\b\r\1\2"+
		"\u00b2\u00b3\7\f\2\2\u00b3\u00b4\7\17\2\2\u00b4\u00b5\7\30\2\2\u00b5\u00b6"+
		"\b\r\1\2\u00b6\u00b7\7\27\2\2\u00b7\u00b8\b\r\1\2\u00b8\u00b9\t\2\2\2"+
		"\u00b9\u00ba\b\r\1\2\u00ba\u00bb\7\20\2\2\u00bb\u00bc\7\21\2\2\u00bc\u00bd"+
		"\b\r\1\2\u00bd\31\3\2\2\2\u00be\u00bf\7\16\2\2\u00bf\u00c0\7\17\2\2\u00c0"+
		"\u00c1\5\36\20\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3\5 \21\2\u00c3\u00c4"+
		"\7\21\2\2\u00c4\u00c5\5\34\17\2\u00c5\u00c6\7\20\2\2\u00c6\u00c7\7\25"+
		"\2\2\u00c7\u00c9\b\16\1\2\u00c8\u00ca\5\f\7\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf\b\16\1\2\u00cf\33\3\2\2\2\u00d0"+
		"\u00d1\7\30\2\2\u00d1\u00d2\b\17\1\2\u00d2\u00d3\7\23\2\2\u00d3\u00d4"+
		"\b\17\1\2\u00d4\u00d5\t\2\2\2\u00d5\u00dc\b\17\1\2\u00d6\u00d7\7\22\2"+
		"\2\u00d7\u00d8\b\17\1\2\u00d8\u00d9\t\2\2\2\u00d9\u00db\b\17\1\2\u00da"+
		"\u00d6\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2"+
		"\2\2\u00dd\35\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\30\2\2\u00e0\u00e1"+
		"\b\20\1\2\u00e1\u00e2\7\23\2\2\u00e2\u00e3\b\20\1\2\u00e3\u00e4\t\2\2"+
		"\2\u00e4\u00e5\b\20\1\2\u00e5\37\3\2\2\2\u00e6\u00e7\7\30\2\2\u00e7\u00e8"+
		"\b\21\1\2\u00e8\u00e9\7\27\2\2\u00e9\u00ea\b\21\1\2\u00ea\u00eb\t\2\2"+
		"\2\u00eb\u00ec\b\21\1\2\u00ec!\3\2\2\2\u00ed\u00f3\5(\25\2\u00ee\u00ef"+
		"\7\22\2\2\u00ef\u00f0\b\22\1\2\u00f0\u00f2\5(\25\2\u00f1\u00ee\3\2\2\2"+
		"\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\b\22\1\2\u00f7#\3\2\2\2\u00f8"+
		"\u00f9\5&\24\2\u00f9\u00ff\b\23\1\2\u00fa\u00fb\7\35\2\2\u00fb\u00fc\b"+
		"\23\1\2\u00fc\u00fe\5&\24\2\u00fd\u00fa\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100%\3\2\2\2\u0101\u00ff\3\2\2\2"+
		"\u0102\u0103\7\30\2\2\u0103\u010d\b\24\1\2\u0104\u0105\7\36\2\2\u0105"+
		"\u0106\7\30\2\2\u0106\u010d\b\24\1\2\u0107\u0108\7\34\2\2\u0108\u010d"+
		"\b\24\1\2\u0109\u010a\7\36\2\2\u010a\u010b\7\34\2\2\u010b\u010d\b\24\1"+
		"\2\u010c\u0102\3\2\2\2\u010c\u0104\3\2\2\2\u010c\u0107\3\2\2\2\u010c\u0109"+
		"\3\2\2\2\u010d\'\3\2\2\2\u010e\u010f\7\30\2\2\u010f\u0115\b\25\1\2\u0110"+
		"\u0111\7\31\2\2\u0111\u0115\b\25\1\2\u0112\u0113\7\33\2\2\u0113\u0115"+
		"\b\25\1\2\u0114\u010e\3\2\2\2\u0114\u0110\3\2\2\2\u0114\u0112\3\2\2\2"+
		"\u0115)\3\2\2\2\23\63=HNWo\u0083\u008d\u0092\u00a2\u00ae\u00cb\u00dc\u00f3"+
		"\u00ff\u010c\u0114";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}