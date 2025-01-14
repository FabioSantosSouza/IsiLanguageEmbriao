package br.com.professorisidro.isilanguage.ast;

import java.util.ArrayList;

public class CommandRepeticao extends AbstractCommand{
	private String condition;
	private ArrayList<AbstractCommand> lista;

	public CommandRepeticao(String condition, ArrayList<AbstractCommand> lt) {
		this.condition = condition;
		this.lista = lt;
	}
	
	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		str.append("while ("+condition+") {\n");
		for (AbstractCommand cmd: lista) {
			str.append(cmd.generateJavaCode());
		}
		str.append("}");
		return str.toString().replaceAll("Verdadeiro", "true").replaceAll("Falso","false");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CommandRepeticao [condition=" + condition + ", expr=" + lista + "]";
	}
}
