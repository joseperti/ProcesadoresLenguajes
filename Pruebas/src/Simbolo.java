
import java.util.ArrayList;


public class Simbolo {
	public String op;
	public Character tipoOperador;
	public String tipoDato;
        public String tipoDatoBasico;
	public ArrayList<String> arrayVariables;
	public String auxiliar = "";
        public String nombre = "";
        
	public static final Character T_OP_LOG = 'l';
	public static final Character T_OP_ARIT = 'a';
	public static final Character T_OP_COMP = 'c';
	public static final String T_DATO_INTEGER = "<span class='palres'> INTEGER </span>";
	public static final String T_DATO_REAL = "<span class='palres'> REAL </span>";
	public static final String T_DATO_CHARACTER = "<span class='palres'> CHARACTER </span>";
        public static final String T_INTEGER = "INTEGER";
	public static final String T_REAL = "REAL";
	public static final String T_CHARACTER = "CHARACTER";
        public static final String T_RECORD = "REGISTRO";
        public static final String T_ARRAY = "ARRAY";
        
        public void insertarTiposHash(String tipo,APIExportacion apiExp){
            
            for (String id : this.arrayVariables){
                apiExp.insertarVar(id, tipo);
            }
            
        }
	
}
