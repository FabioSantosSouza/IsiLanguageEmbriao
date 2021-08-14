package br.com.professorisidro.isilanguage.ast;

import java.util.ArrayList;

public class CommandPara extends AbstractCommand{
	private String condition1,condition2,condition3;
	private ArrayList<AbstractCommand> lista;
	
	public CommandPara (String c3,String c2, String c1, ArrayList<AbstractCommand> lt) {
		this.condition1 = c1;
		this.condition2 = c2;
		this.condition3 = c3;
		this.lista = lt;
	}

	@Override
	public String generateJavaCode() {
		StringBuilder str = new StringBuilder();
		str.append("for ("+condition1+";"+condition2+";"+condition3+") {\n");
		for (AbstractCommand cmd: lista) {
			str.append(cmd.generateJavaCode());
		}
		str.append("}");
		return str.toString().replaceAll("Verdadeiro", "true").replaceAll("Falso","false");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CommandPara [condition=" + condition1+";"+condition2+";"+condition3+", expr=" + lista + "]";
	}
}