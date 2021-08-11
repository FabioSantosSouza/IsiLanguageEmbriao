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
	import br.com.professorisidro.isilanguage.ast.CommandDecisao;
	import br.com.professorisidro.isilanguage.ast.CommandRepeticao;
	import br.com.professorisidro.isilanguage.ast.CommandFacaEnquanto;
	import br.com.professorisidro.isilanguage.ast.CommandPara;
	import java.util.ArrayList;
	import java.util.Stack;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IsiLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, AP=13, FP=14, SC=15, OP=16, ATTR=17, VIR=18, 
		ACH=19, FCH=20, OPREL=21, ID=22, NUMBER=23, ASPAS=24, TEXT=25, LOGIC=26, 
		BIN_OP_LOGIC=27, UNIT_OP_LOGIC=28, WS=29, COMMENT=30, LINE_COMMENT=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", 
		"FCH", "OPREL", "ID", "NUMBER", "ASPAS", "TEXT", "LOGIC", "BIN_OP_LOGIC", 
		"UNIT_OP_LOGIC", "WS", "COMMENT", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'programa'", "'fimprog;'", "'numero'", "'texto'", "'logico'", "'leia'", 
		"'escreva'", "'se'", "'senao'", "'enquanto'", "'faca'", "'para'", "'('", 
		"')'", "';'", null, "'='", "','", "'{'", "'}'", null, null, null, "'\"'", 
		null, null, null, "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "AP", "FP", "SC", "OP", "ATTR", "VIR", "ACH", "FCH", "OPREL", "ID", 
		"NUMBER", "ASPAS", "TEXT", "LOGIC", "BIN_OP_LOGIC", "UNIT_OP_LOGIC", "WS", 
		"COMMENT", "LINE_COMMENT"
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


	public IsiLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IsiLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0100\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\5\26\u00aa\n\26\3\27\3\27\7\27\u00ae\n\27\f"+
		"\27\16\27\u00b1\13\27\3\30\6\30\u00b4\n\30\r\30\16\30\u00b5\3\30\3\30"+
		"\6\30\u00ba\n\30\r\30\16\30\u00bb\5\30\u00be\n\30\3\31\3\31\3\32\3\32"+
		"\7\32\u00c4\n\32\f\32\16\32\u00c7\13\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u00da\n\33"+
		"\3\34\3\34\3\34\3\34\5\34\u00e0\n\34\3\35\3\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\7\37\u00ec\n\37\f\37\16\37\u00ef\13\37\3\37\3\37\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \7 \u00fa\n \f \16 \u00fd\13 \3 \3 \3\u00ed\2!\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!\3\2\n\5\2,-//\61\61\4\2>>@@\3\2c|\5\2\62;C\\c|\3\2\62;\3\2$$\5\2\13"+
		"\f\17\17\"\"\4\2\f\f\17\17\2\u010c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2"+
		"\2\5J\3\2\2\2\7S\3\2\2\2\tZ\3\2\2\2\13`\3\2\2\2\rg\3\2\2\2\17l\3\2\2\2"+
		"\21t\3\2\2\2\23w\3\2\2\2\25}\3\2\2\2\27\u0086\3\2\2\2\31\u008b\3\2\2\2"+
		"\33\u0090\3\2\2\2\35\u0092\3\2\2\2\37\u0094\3\2\2\2!\u0096\3\2\2\2#\u0098"+
		"\3\2\2\2%\u009a\3\2\2\2\'\u009c\3\2\2\2)\u009e\3\2\2\2+\u00a9\3\2\2\2"+
		"-\u00ab\3\2\2\2/\u00b3\3\2\2\2\61\u00bf\3\2\2\2\63\u00c1\3\2\2\2\65\u00d9"+
		"\3\2\2\2\67\u00df\3\2\2\29\u00e1\3\2\2\2;\u00e3\3\2\2\2=\u00e7\3\2\2\2"+
		"?\u00f5\3\2\2\2AB\7r\2\2BC\7t\2\2CD\7q\2\2DE\7i\2\2EF\7t\2\2FG\7c\2\2"+
		"GH\7o\2\2HI\7c\2\2I\4\3\2\2\2JK\7h\2\2KL\7k\2\2LM\7o\2\2MN\7r\2\2NO\7"+
		"t\2\2OP\7q\2\2PQ\7i\2\2QR\7=\2\2R\6\3\2\2\2ST\7p\2\2TU\7w\2\2UV\7o\2\2"+
		"VW\7g\2\2WX\7t\2\2XY\7q\2\2Y\b\3\2\2\2Z[\7v\2\2[\\\7g\2\2\\]\7z\2\2]^"+
		"\7v\2\2^_\7q\2\2_\n\3\2\2\2`a\7n\2\2ab\7q\2\2bc\7i\2\2cd\7k\2\2de\7e\2"+
		"\2ef\7q\2\2f\f\3\2\2\2gh\7n\2\2hi\7g\2\2ij\7k\2\2jk\7c\2\2k\16\3\2\2\2"+
		"lm\7g\2\2mn\7u\2\2no\7e\2\2op\7t\2\2pq\7g\2\2qr\7x\2\2rs\7c\2\2s\20\3"+
		"\2\2\2tu\7u\2\2uv\7g\2\2v\22\3\2\2\2wx\7u\2\2xy\7g\2\2yz\7p\2\2z{\7c\2"+
		"\2{|\7q\2\2|\24\3\2\2\2}~\7g\2\2~\177\7p\2\2\177\u0080\7s\2\2\u0080\u0081"+
		"\7w\2\2\u0081\u0082\7c\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084"+
		"\u0085\7q\2\2\u0085\26\3\2\2\2\u0086\u0087\7h\2\2\u0087\u0088\7c\2\2\u0088"+
		"\u0089\7e\2\2\u0089\u008a\7c\2\2\u008a\30\3\2\2\2\u008b\u008c\7r\2\2\u008c"+
		"\u008d\7c\2\2\u008d\u008e\7t\2\2\u008e\u008f\7c\2\2\u008f\32\3\2\2\2\u0090"+
		"\u0091\7*\2\2\u0091\34\3\2\2\2\u0092\u0093\7+\2\2\u0093\36\3\2\2\2\u0094"+
		"\u0095\7=\2\2\u0095 \3\2\2\2\u0096\u0097\t\2\2\2\u0097\"\3\2\2\2\u0098"+
		"\u0099\7?\2\2\u0099$\3\2\2\2\u009a\u009b\7.\2\2\u009b&\3\2\2\2\u009c\u009d"+
		"\7}\2\2\u009d(\3\2\2\2\u009e\u009f\7\177\2\2\u009f*\3\2\2\2\u00a0\u00aa"+
		"\t\3\2\2\u00a1\u00a2\7@\2\2\u00a2\u00aa\7?\2\2\u00a3\u00a4\7>\2\2\u00a4"+
		"\u00aa\7?\2\2\u00a5\u00a6\7?\2\2\u00a6\u00aa\7?\2\2\u00a7\u00a8\7#\2\2"+
		"\u00a8\u00aa\7?\2\2\u00a9\u00a0\3\2\2\2\u00a9\u00a1\3\2\2\2\u00a9\u00a3"+
		"\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa,\3\2\2\2\u00ab"+
		"\u00af\t\4\2\2\u00ac\u00ae\t\5\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2"+
		"\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0.\3\2\2\2\u00b1\u00af"+
		"\3\2\2\2\u00b2\u00b4\t\6\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00bd\3\2\2\2\u00b7\u00b9\7\60"+
		"\2\2\u00b8\u00ba\t\6\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00b7\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\60\3\2\2\2\u00bf\u00c0\7$\2\2\u00c0\62"+
		"\3\2\2\2\u00c1\u00c5\5\61\31\2\u00c2\u00c4\n\7\2\2\u00c3\u00c2\3\2\2\2"+
		"\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8"+
		"\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c9\5\61\31\2\u00c9\64\3\2\2\2\u00ca"+
		"\u00cb\7X\2\2\u00cb\u00cc\7g\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7f\2\2"+
		"\u00ce\u00cf\7c\2\2\u00cf\u00d0\7f\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2"+
		"\7k\2\2\u00d2\u00d3\7t\2\2\u00d3\u00da\7q\2\2\u00d4\u00d5\7H\2\2\u00d5"+
		"\u00d6\7c\2\2\u00d6\u00d7\7n\2\2\u00d7\u00d8\7u\2\2\u00d8\u00da\7q\2\2"+
		"\u00d9\u00ca\3\2\2\2\u00d9\u00d4\3\2\2\2\u00da\66\3\2\2\2\u00db\u00dc"+
		"\7(\2\2\u00dc\u00e0\7(\2\2\u00dd\u00de\7~\2\2\u00de\u00e0\7~\2\2\u00df"+
		"\u00db\3\2\2\2\u00df\u00dd\3\2\2\2\u00e08\3\2\2\2\u00e1\u00e2\7#\2\2\u00e2"+
		":\3\2\2\2\u00e3\u00e4\t\b\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e6\b\36\2\2"+
		"\u00e6<\3\2\2\2\u00e7\u00e8\7\61\2\2\u00e8\u00e9\7,\2\2\u00e9\u00ed\3"+
		"\2\2\2\u00ea\u00ec\13\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f2\7\61\2\2\u00f2\u00f3\3\2\2\2\u00f3"+
		"\u00f4\b\37\2\2\u00f4>\3\2\2\2\u00f5\u00f6\7\61\2\2\u00f6\u00f7\7\61\2"+
		"\2\u00f7\u00fb\3\2\2\2\u00f8\u00fa\n\t\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd"+
		"\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u00ff\b \2\2\u00ff@\3\2\2\2\16\2\u00a9\u00ad\u00af"+
		"\u00b5\u00bb\u00bd\u00c5\u00d9\u00df\u00ed\u00fb\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}