package br.com.professorisidro.isilanguage.datastructures;

public class IsiVariable extends IsiSymbol {
	
	public static final int NUMBER=0;
	public static final int TEXT  =1;
	public static final int LOGIC =2;
	public static final int V_NUMBER =3;
	public static final int V_TEXT = 4;
	public static final int V_LOGIC =5;
	
	private int type;
	private String value;
	
	public IsiVariable(String name, int type, String value) {
		super(name);
		this.type = type;
		this.value = value;
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
	
	public String generateJavaCode() {
       String str;
       if (type == NUMBER) {
    	   str = "double ";
       }
       else if ( type == TEXT) {
    	   str = "String ";
       } 
	   else if ( type == LOGIC) {
		str = "boolean ";
	   } 
	   else if ( type == V_LOGIC) {
		str = "boolean[] ";
	   } else if ( type == V_NUMBER) {
		str = "double[] ";
	   } else  {
		str = "String[] ";
	   }
       return str + " "+super.name+";";
	}
	
	

}
