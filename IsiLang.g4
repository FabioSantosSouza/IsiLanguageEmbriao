grammar IsiLang;

@header{
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
}

@members{
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


	private String _exprLOGICContent;

	private ArrayList<AbstractCommand> listaTrue;
	private ArrayList<AbstractCommand> listaFalse;
	private ArrayList<AbstractCommand> listaWhile;
	private ArrayList<AbstractCommand> listaFor; 
	private ArrayList<AbstractCommand> listaDoWhile; 
	
	
	
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
	
	public void printaOla(){
		System.out.println("Olá teste");
	}
	
	public void exibeVarsNaoUsadas(){
		System.out.println("As seguintes variáveis não estão sendo ultilizadas");
		for ( IsiSymbol symbol : symbolTable.getAll() ){
			IsiVariable simbolo = (IsiVariable) symbol;
			if (simbolo.getValue() == null ){
				System.out.println(simbolo.getName());
			}
		}
	}
}

prog	: 'programa' decl bloco 'fimprog;'
           {  program.setVarTable(symbolTable);
           	  program.setComandos(stack.pop());
           	 
           	 exibeVarsNaoUsadas();
			
           } 
		;
		
decl    :  (declaravar)+
        ;
        
        
declaravar :  tipo ID  {
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
              (  VIR 
              	 ID {
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
              )* 
               SC
           ;
           
tipo       : 'numero' { _tipo = IsiVariable.NUMBER;  }
           | 'texto'  { _tipo = IsiVariable.TEXT;  }
           | 'logico'  { _tipo = IsiVariable.LOGIC;  }
           ;
        
bloco	: { 
			curThread = new ArrayList<AbstractCommand>(); 
	        stack.push(curThread);  
          }
          (cmd)+
		;
		

cmd		:  cmdleitura  
 		|  cmdescrita 
 		|  cmdattrib
 		|  cmdselecao
		|  cmdrepeticao
		|  cmdfacaenquanto
		|  cmdpara
		;
		
cmdleitura	: 'leia' AP
                     ID { verificaID(_input.LT(-1).getText());
                     	  _readID = _input.LT(-1).getText();
                        } 
                     FP 
                     SC 
                     
              {
              	IsiVariable var = (IsiVariable)symbolTable.get(_readID);
              	CommandLeitura cmd = new CommandLeitura(_readID, var);
              	stack.peek().add(cmd);
              }   
			;
			
cmdescrita	: 'escreva' 
                 AP 
                 ID { verificaID(_input.LT(-1).getText());
	                  _writeID = _input.LT(-1).getText();
                     } 
                 FP 
                 SC
               {
               	  CommandEscrita cmd = new CommandEscrita(_writeID);
               	  stack.peek().add(cmd);
               }
			;
			
cmdattrib	:  ID { verificaID(_input.LT(-1).getText());
					
                    
                    _exprID = _input.LT(-1).getText();
                   } 
               ATTR { _exprContent = ""; _exprLOGICContent = "";} 
               
               (expr | logicexpr) 
               { 	
               		IsiVariable currentVar = (IsiVariable) symbolTable.get(_exprID);
               		currentVar.setValue("debug");
               		symbolTable.add(currentVar);
               		if ( _exprType != currentVar.getType() ){
               	 		throw new IsiSemanticException("Type mismatch at variable named #"+currentVar.getName()+"#, expecting  "+ _exprType + " but got " + currentVar.getType() +"\n");
               	 	}
                	//System.out.println(_exprContent.trim());
               }
               SC
               { 
				   CommandAtribuicao cmd;
				if (_exprMOL){
					cmd = new CommandAtribuicao(_exprID, _exprContent.trim());
				} else { 
					cmd = new CommandAtribuicao(_exprID, _exprLOGICContent.trim());
				}	
               	 
               	 stack.peek().add(cmd);
               }
			;
			
			
cmdselecao  :  'se' AP
                    ID    { _exprDecision = _input.LT(-1).getText(); }
                    OPREL { _exprDecision += _input.LT(-1).getText(); }
                    (ID | NUMBER) {_exprDecision += _input.LT(-1).getText(); }
                    FP 
                    ACH 
                    { curThread = new ArrayList<AbstractCommand>(); 
                      stack.push(curThread);
                    }
                    (cmd)+ 
                    
                    FCH 
                    {
                       listaTrue = stack.pop();	
                    } 
                   ('senao' 
                   	 ACH
                   	 {
                   	 	curThread = new ArrayList<AbstractCommand>();
                   	 	stack.push(curThread);
                   	 } 
                   	(cmd+) 
                   	FCH
                   	{
                   		listaFalse = stack.pop();
                   		CommandDecisao cmd = new CommandDecisao(_exprDecision, listaTrue, listaFalse);
                   		stack.peek().add(cmd);
                   	}
                   )?
            ;

cmdrepeticao  :  'enquanto' AP
		                    ID    { _exprRepetition = _input.LT(-1).getText(); }
		                    OPREL { _exprRepetition += _input.LT(-1).getText(); }
		                    (ID | NUMBER) {_exprRepetition += _input.LT(-1).getText(); }
		                    FP 
		                    ACH 
		                    { curThread = new ArrayList<AbstractCommand>(); 
		                      stack.push(curThread);
		                    }
		                    (cmd)+ 
		                    
		                    FCH 
		                    {
		                       listaWhile = stack.pop();
		                       CommandRepeticao cmd = new CommandRepeticao(_exprRepetition, listaWhile);
		                       stack.peek().add(cmd);	
		                    } 	
		    ; 

cmdfacaenquanto  :  'faca' { _exprDoWhile = "";} ACH 
		                    { 
							  curThread = new ArrayList<AbstractCommand>(); 
		                      stack.push(curThread);
		                    }
		                    (cmd)+ 
		                    
		                    FCH 
		                    {

		                    } 
							'enquanto'
							AP
		                    ID    { _exprDoWhile = _input.LT(-1).getText(); }
		                    OPREL { _exprDoWhile += _input.LT(-1).getText(); }
		                    (ID | NUMBER) { _exprDoWhile += _input.LT(-1).getText(); }
		                    FP 
							SC 
							{ 
							    listaDoWhile = stack.pop();
		                        CommandFacaEnquanto cmd = new CommandFacaEnquanto(_exprDoWhile, listaDoWhile);
		                        stack.peek().add(cmd); 
							}

		    ; 


cmdpara	:	'para' 	AP	attrFor SC condFor SC incrementoFor FP	
					ACH					
                    { curThread = new ArrayList<AbstractCommand>(); 
                      stack.push(curThread);
                    }
                    (cmd)+ 
                    FCH
                    {
                       listaFor = stack.pop();
                       CommandPara cmd = new CommandPara(_exprForA,_exprForB,_exprForC, listaFor);
                       stack.peek().add(cmd);	
                    }
		;
					
incrementoFor: 		ID {_exprForC = _input.LT(-1).getText();}
					ATTR {_exprForC += _input.LT(-1).getText();}
					(ID | NUMBER) {_exprForC += _input.LT(-1).getText();}				
					( OP {_exprForC += _input.LT(-1).getText();}
					(ID | NUMBER) {_exprForC += _input.LT(-1).getText();}
					)*

			;			

attrFor:	ID {_exprForA = _input.LT(-1).getText();} 
			ATTR {_exprForA += '='; }
			(ID | NUMBER) {_exprForA += _input.LT(-1).getText();}
	;
	
condFor:	ID    {_exprForB = _input.LT(-1).getText(); }
			OPREL {_exprForB += _input.LT(-1).getText(); } 
			(ID | NUMBER) {_exprForB += _input.LT(-1).getText(); }
	;


expr		:  termo ( 
	             OP { _exprContent += _input.LT(-1).getText();}
	            termo
	            )* { _exprMOL= true;}
	            
			;
logicexpr :  (UNIT_OP_LOGIC)? {   System.out.println(_input.LT(-1).getText());
                                 if ( _input.LT(-1).getText() == "!") {
								_exprLOGICContent += _input.LT(-1).getText();
								}
				} termo ( 
							  
				 BIN_OP_LOGIC { _exprLOGICContent += _input.LT(-1).getText();}
	           (UNIT_OP_LOGIC)? { 
				   if ( _input.LT(-1).getText() == "!") {
								_exprLOGICContent += _input.LT(-1).getText();
								}

			   } termo
	            )* {  _exprMOL = false; 
				System.out.println(_exprLOGICContent);}
	            
			;

			
termo		: ID { verificaID(_input.LT(-1).getText());
	               _exprContent += _input.LT(-1).getText();
	               _exprLOGICContent += _input.LT(-1).getText();
	              IsiVariable currentVar = (IsiVariable) symbolTable.get(_input.LT(-1).getText());
	              _exprType = currentVar.getType();
                 } 
            | 
              NUMBER
              {	
              	_exprLOGICContent += _input.LT(-1).getText();
              	_exprContent += _input.LT(-1).getText();
              	_exprType = IsiVariable.NUMBER;
              }
            | TEXT
              { 
                _exprLOGICContent += _input.LT(-1).getText();
              	_exprContent += _input.LT(-1).getText();
              	_exprType = IsiVariable.TEXT;
              }
			| LOGIC
              { 
              	_exprLOGICContent += _input.LT(-1).getText();
              	_exprContent += _input.LT(-1).getText();
              	_exprType = IsiVariable.LOGIC;
              }
			;
			
	
AP	: '('
	;
	
FP	: ')'
	;
	
SC	: ';'
	;
	
OP	: '+' | '-' | '*' | '/'
	;
	
ATTR : '='
	 ;
	 
VIR  : ','
     ;
     
ACH  : '{'
     ;
     
FCH  : '}'
     ;
	 
	 
OPREL : '>' | '<' | '>=' | '<=' | '==' | '!='
      ;
      
ID	: [a-z] ([a-z] | [A-Z] | [0-9])*
	;
	
NUMBER	: [0-9]+ ('.' [0-9]+)?
		;
		
ASPAS : '"'
      ; 

TEXT : ASPAS (~'"')* ASPAS 
     ;

LOGIC : 'Verdadeiro' | 'Falso' ;

	
BIN_OP_LOGIC	: '&&' | '||' ;

UNIT_OP_LOGIC : '!' ; 

WS	: (' ' | '\t' | '\n' | '\r') -> skip;

COMMENT
: '/*' .*? '*/' -> skip
;
LINE_COMMENT
: '//' ~[\r\n]* -> skip
;
