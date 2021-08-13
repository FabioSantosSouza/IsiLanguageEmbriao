package br.com.professorisidro.isilanguage.ast;

import br.com.professorisidro.isilanguage.datastructures.IsiVariable;

public class CommandAtribueVector extends AbstractCommand{

	private String id;
	private String expr;
    private int type;
	
	public CommandAtribueVector(String id, String expr, int type) {
        this.id = id;
        this.expr = expr;
        this.type = type;
    }
	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
		String temp = expr.replaceAll("Verdadeiro", "true").replaceAll("Falso","false");
		
		if ( this.type == 0 || this.type == 3)  {
            return id + " = " + "new double[]" +temp+";";
        } else if ( this.type == 2 || this.type == 5) {
            return id + " = " + "new boolean[]" +temp+";";
        } else {
            return id + " = " + "new String[]" +temp+";";
        }   
	}
	@Override
	public String toString() {
		return "CommandAtribueVector [id=" + id + ", expr=" + expr + ", type=" + type +  "]" ;
	}
	
	

}



// [] TYPE ID ; -> ONDE ELEA VAI ? 

