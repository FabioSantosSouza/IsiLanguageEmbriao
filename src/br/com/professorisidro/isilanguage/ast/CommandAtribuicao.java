package br.com.professorisidro.isilanguage.ast;

import br.com.professorisidro.isilanguage.datastructures.IsiVariable;

public class CommandAtribuicao extends AbstractCommand{

	private String id;
	private String expr;
	
	public CommandAtribuicao(String id, String expr) {
		this.id = id;
		this.expr = expr;
	}
	@Override
	public String generateJavaCode() {
		// TODO Auto-generated method stub
		String temp = expr.replaceAll("Verdadeiro", "true").replaceAll("Falso","false");
		
		return id + " = "+temp+";";
	}
	@Override
	public String toString() {
		return "CommandAtribuicao [id=" + id + ", expr=" + expr + "]";
	}
	
	

}
