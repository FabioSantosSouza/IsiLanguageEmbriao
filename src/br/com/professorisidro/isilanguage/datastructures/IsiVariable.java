package br.com.professorisidro.isilanguage.datastructures;

public class IsiVariable extends IsiSymbol {

	public static final int NUMBER = 0;
	public static final int TEXT = 1;
	public static final int LOGIC = 2;
	public static final int V_NUMBER = 3;
	public static final int V_TEXT = 4;
	public static final int V_LOGIC = 5;

	private int type;
	private String value;
	private String length;

	public IsiVariable(String name, int type, String value, String length) {
		super(name);
		this.type = type;
		this.value = value;
		this.length = length;
	}

	public IsiVariable(String name, int type, String value) {
		super(name);
		this.type = type;
		this.value = value;
		this.length = "";
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "IsiVariable [name=" + name + ", type=" + type + ", value=" + value + "]";
	}

	public String generateJavaCode() { // isiVariable se encarrega de passar as variáveis para o mundo java double
										// doze;
		String str;
		String strRight = "";

		if (type == NUMBER) {
			str = "double ";
		} else if (type == TEXT) {
			str = "String ";
		} else if (type == LOGIC) {
			str = "boolean ";
		} else if (type == V_LOGIC) {
			str = "boolean[] ";
			if (length != "") {
				strRight = "= new boolean[" + length + "]";
			}
		} else if (type == V_NUMBER) {
			str = "double[] ";
			if (length !="") {
				strRight = "= new double[" + length + "]";
			}
		} else {
			str = "String[] ";
			if (length != "") {
				strRight = "= new String[" + length + "]";
			}
		}
		return str + " " + super.name + strRight + ";";
	}

}
