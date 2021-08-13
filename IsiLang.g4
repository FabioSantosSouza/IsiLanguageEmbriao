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
	import br.com.professorisidro.isilanguage.ast.CommandAtribueVector;
	import br.com.professorisidro.isilanguage.ast.CommandDecisao;
	import br.com.professorisidro.isilanguage.ast.CommandRepeticao;
	import br.com.professorisidro.isilanguage.ast.CommandFacaEnquanto;
	import br.com.professorisidro.isilanguage.ast.CommandPara;

	import java.util.ArrayList;
	import java.util.Stack;
}

@members{
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
}

prog	: 'programa' decl bloco 'fimprog;'
           {  
			  program.setVarTable(symbolTable);
           	  program.setComandos(stack.pop());
           	 
           	 exibeVarsNaoUsadas();
			
           } 
		;
		
decl    :  (declaravar | declaraVector )+
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
              )* SC
           ;

declaraVector : OB CB tipo ID {
					  _varName = _input.LT(-1).getText();
	                  _varValue = null; 
	                  symbol = new IsiVariable(_varName, _tipo + 3, _varValue);
	                  if (!symbolTable.exists(_varName)){
	                     symbolTable.add(symbol);	
	                  }
	                  else{
	                  	 throw new IsiSemanticException("Symbol "+_varName+" already declared");
	                  }
                    } SC 
           ;
           
tipo       : 'numero' { _tipo = IsiVariable.NUMBER; // 0 
						_exprVectorContent += _input.LT(-1).getText();  }
           | 'texto'  { _tipo = IsiVariable.TEXT; // 1 
		              _exprVectorContent += _input.LT(-1).getText(); }
           | 'logico'  { _tipo = IsiVariable.LOGIC; // 2
		   				 _exprVectorContent += _input.LT(-1).getText();  }
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
		|  attribVector
		|  attribVectorAtIndex
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
                 AP {_exprLOGICContent = "";}
				 (expr | logicexpr)
                 FP 
                 SC
               {
               	CommandEscrita cmd;
				if (_exprMOL){
					cmd = new CommandEscrita(_exprContent.trim());
				} else { 
					cmd = new CommandEscrita(_exprLOGICContent.trim());
				}
               	  stack.peek().add(cmd);
               }
			;
			
cmdattrib	:  attrib
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
			
attrib	:	ID { verificaID(_input.LT(-1).getText());  
					
                    
                    _exprID = _input.LT(-1).getText();
                   } 
                ATTR { _exprContent = ""; _exprLOGICContent = "";}
               
               (expr | logicexpr) 
               { 	
               		IsiVariable currentVar = (IsiVariable) symbolTable.get(_exprID);
               		currentVar.setValue("value");
               		symbolTable.add(currentVar); 

               		if ( _exprType != currentVar.getType() ){
               	 		throw new IsiSemanticException("Type mismatch at variable named "+currentVar.getName()+", expecting "+ TYPPES[currentVar.getType()] + " but got " + TYPPES[_exprType] +"\n");
               	 	}

               }
		;




attribVector	: ID {
					verificaID(_input.LT(-1).getText());  
                    _exprID = _input.LT(-1).getText(); 
                   } 
               DALE ATTR { _exprVectorContent = "";}    

			   ACH { _exprVectorContent += "{";}

			   vectorAtrExpr

			   FCH { _exprVectorContent += "}";}
               { 	
               		IsiVariable currentVar = (IsiVariable) symbolTable.get(_exprID);
               		currentVar.setValue("value");
               		symbolTable.add(currentVar); 


               }
			   SC 
               { 
				   CommandAtribueVector cmd;
				   cmd = new CommandAtribueVector(_exprID, _exprVectorContent, currentVar.getType() );
               	 
               	 stack.peek().add(cmd);
               } 
		;

attribVectorAtIndex	: 
				ID 
				{	// ID [expr] = value; 
					verificaID(_input.LT(-1).getText());  
                	_exprID = _input.LT(-1).getText(); 
                }

               OB { _exprID+= "[ (int)"; } expr { _exprID += _exprContent;} CB { _exprID+="]";}    

			 ATTR { _exprContent = ""; _exprLOGICContent= "";} 
			 ( expr | logicexpr)
			 SC 
			 	{ 
				 	CommandAtribuicao cmd;
					if ( _exprContent == "") { 
						cmd = new CommandAtribuicao(_exprID,_exprLOGICContent.trim());
					}
					else {  
						cmd = new CommandAtribuicao(_exprID, _exprContent.trim());
					 }
					
					stack.peek().add(cmd);
			   };
			





vectorAtrExpr : termoVector ( VIR { _exprVectorContent += ",";} termoVector)*;


termoVector		: 
              NUMBER
              {	
              	_exprVectorContent += _input.LT(-1).getText();
				_tipo = IsiVariable.NUMBER; 
              }
            	| TEXT 
              { 
				  _tipo = IsiVariable.NUMBER;	
				  _exprVectorContent += _input.LT(-1).getText();
              }
			  | LOGIC 
              { 
				  _tipo = IsiVariable.LOGIC;	
				  _exprVectorContent += _input.LT(-1).getText(); 
			  }
			;
			
cmdselecao  :  'se' AP
					(condse | logicexpr {ifStatements.push(_exprLOGICContent);})
                    FP 
                    ACH 
                    { curThread = new ArrayList<AbstractCommand>(); 
                      stack.push(curThread);
                    }
                    (cmd)+ 
                    
                    FCH 
                    {listaTrue = stack.pop();} 
                   ('senao' 
                   	 ACH
                   	 {
                   	 	curThread = new ArrayList<AbstractCommand>();
                   	 	stack.push(curThread);
                   	 } 
                   	(cmd)+
                   	
                   	FCH
                   	{listaFalse = stack.pop();} 
                   )?                   
                   {                   		
                   		CommandDecisao cmd = new CommandDecisao(ifStatements.pop(), listaTrue, listaFalse);
                   		stack.peek().add(cmd);
                   		listaTrue = null;
                   		listaFalse = null;
                   }
            ;

condse	:	ID    {_exprDecision = _input.LT(-1).getText(); }
			OPREL {_exprDecision += _input.LT(-1).getText(); } 
			expr {_exprDecision += _exprContent;}
			{ifStatements.push(_exprDecision);
			System.out.println(_exprDecision);}
		;

cmdrepeticao  :  'enquanto' AP{_exprLOGICContent = ""; _exprWhile = "";}
							(condWhile | logicexpr {whileStatements.push(_exprLOGICContent);})
							FP 
		                    ACH 
		                    { curThread = new ArrayList<AbstractCommand>(); 
		                      stack.push(curThread);
		                    }

		                    (cmd)+ 
		                    
		                    FCH 
		                    {
		                       listaWhile = stack.pop();
		                       CommandRepeticao cmd = new CommandRepeticao(whileStatements.pop(), listaWhile);
		                       stack.peek().add(cmd);	
		                    } 	
		    ; 
		    
condWhile:	ID    {_exprWhile = _input.LT(-1).getText(); }
			OPREL {_exprWhile += _input.LT(-1).getText(); } 
			expr {_exprWhile += _exprContent;}
			{whileStatements.push(_exprWhile);}
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
							(condDoWhile | logicexpr {dowhileStatements.push(_exprLOGICContent);})
		                    FP 
							SC 
							{ 
							    listaDoWhile = stack.pop();
		                        CommandFacaEnquanto cmd = new CommandFacaEnquanto(dowhileStatements.pop(), listaDoWhile);
		                        stack.peek().add(cmd); 
							}

		    ; 

condDoWhile:	ID    {_exprDoWhile = _input.LT(-1).getText(); }
				OPREL {_exprDoWhile += _input.LT(-1).getText(); } 
				expr {_exprDoWhile += _exprContent;}
				{dowhileStatements.push(_exprDoWhile);}
	;


cmdpara	:	'para' 	AP	attrFor SC condFor SC attrFor FP	
					ACH					
                    { curThread = new ArrayList<AbstractCommand>(); 
                      stack.push(curThread);
                    }
                    (cmd)+ 
                    FCH
                    {
                       listaFor = stack.pop();
                       CommandPara cmd = new CommandPara(forStatements.pop(),forStatements.pop(),forStatements.pop(), listaFor);
                       stack.peek().add(cmd);	
                    }
		;
					
attrFor:	attrib
			{forStatements.push(_exprID+"="+_exprContent);}
	;
	
condFor:	ID    {_exprForB = _input.LT(-1).getText(); }
			OPREL {_exprForB += _input.LT(-1).getText(); } 
			expr {_exprForB += _exprContent;}
			{forStatements.push(_exprForB);}
	;

expr		:  {_exprContent = "";}  

				(termo | ID { _exprContent += _input.LT(-1).getText();} 
						 OB { _exprContent += _input.LT(-1).getText();  _exprContent += "(int)";} 
						 (NUMBER | ID)  { _exprContent += _input.LT(-1).getText();} 
						 CB { _exprContent += _input.LT(-1).getText();} )   
						 
				( 
	             
				 OP { _exprContent += _input.LT(-1).getText();}
	            (termo | ID { _exprContent += _input.LT(-1).getText();} 
						 OB { _exprContent += _input.LT(-1).getText();  _exprContent += "(int)";} 
						 (NUMBER | ID)  { _exprContent += _input.LT(-1).getText();} 
						 CB { _exprContent += _input.LT(-1).getText();} )
	            
				
				)* { _exprMOL= true;}
	            
			;
logicexpr :  logicterm { _exprMOL = false;} ( BIN_OP_LOGIC { _exprLOGICContent += _input.LT(-1).getText(); } 
			 logicterm )* ; 


logicterm :  ID { 
				verificaID(_input.LT(-1).getText());
	            _exprLOGICContent += _input.LT(-1).getText();
	            IsiVariable currentVar1 = (IsiVariable) symbolTable.get(_input.LT(-1).getText());
	            _exprType = currentVar1.getType();

				  
				 }
			|	                           
			 UNIT_OP_LOGIC ID 
			 {

				 verificaID(_input.LT(-1).getText());
	            _exprLOGICContent +=  "!" + _input.LT(-1).getText();
	            IsiVariable currentVar2 = (IsiVariable) symbolTable.get(_input.LT(-1).getText());
	            _exprType = currentVar2.getType();
			 }
			 |
			 LOGIC { 
				_exprLOGICContent += _input.LT(-1).getText();
              	_exprType = IsiVariable.LOGIC; 

			 } 
			 | 
			 UNIT_OP_LOGIC LOGIC {
				 _exprLOGICContent += "!" + _input.LT(-1).getText();
              	_exprType = IsiVariable.LOGIC; 
			 } 
			;


termo		: ID { verificaID(_input.LT(-1).getText());
	               _exprContent += _input.LT(-1).getText();
	              IsiVariable currentVar = (IsiVariable) symbolTable.get(_input.LT(-1).getText());
	              _exprType = currentVar.getType();
                 } 
            | 
              NUMBER
              {	
              	_exprContent += _input.LT(-1).getText();
              	_exprType = IsiVariable.NUMBER;
              }
            | TEXT
              { 
              	_exprContent += _input.LT(-1).getText();
              	_exprType = IsiVariable.TEXT;
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

OB : '[' ; // open brackets 

CB : ']' ;  // close 
	 
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


DALE : '.';