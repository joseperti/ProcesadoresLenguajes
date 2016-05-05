
import java.util.ArrayList;
import java.util.Map


public class Simbolo {
	public String op;
	public Character tipoOperador;
	public String tipoDato;
	public ArrayList<String> arrayVariables;
	public Map<String,String> mapaVariables;
	
	public static final Character T_OP_LOG = 'l';
	public static final Character T_OP_ARIT = 'a';
	public static final Character T_OP_COMP = 'c';
	public static final String T_DATO_INTEGER = "Integer";
	public static final String T_DATO_REAL = "Real";
	public static final String T_DATO_CHARACTER = "Character";
        
        
	
}
