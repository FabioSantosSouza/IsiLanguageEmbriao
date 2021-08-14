package br.com.professorisidro.isilanguage.ast;

import java.util.ArrayList;
public class CommandFacaEnquanto extends AbstractCommand{
	private String condition;
	private ArrayList<AbstractCommand> lista;

	public CommandFacaEnquanto(String condition, ArrayList<AbstractCommand> lt) {
		this.condition = condition;
		this.lista = lt;
	}
	
	@Override
	public String generateJavaCode() {
		StringBuilder str = new StringBuilder();
		str.append("do { \n");
            for (AbstractCommand cmd: lista) {
                str.append(cmd.generateJavaCode());
            }
		str.append("}while (" + condition+ ");");
		return str.toString().replaceAll("Verdadeiro", "true").replaceAll("Falso","false");
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "CommanFaçaEnquanto [condition=" + condition + ", expr=" + lista + "]";
	}
}
