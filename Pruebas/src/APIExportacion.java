
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.APPEND;
import java.util.HashMap;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JosePertierra
 */
public class APIExportacion {
    
    String ruta;
    PrintWriter salida;
    String saltoLinea = "<br>";            
            // A partir del objeto File creamos el fichero físicamente
    String buffer = "";
    String bufferAux = "";
    LinkedList<String> cabeceras = new LinkedList();
    String nombrePrograma;
    String heading = "";
    String titulo;
    boolean cancelar = false;
    HashMap<String,String> controlVar = new HashMap<String,String>();
    LinkedList<String> controlAsig = new LinkedList<String>();
    String metaData = "<style>\n.indentado{margin-left: 1cm;}\n.cte {color:rgb(19,189,72);}\n.ident {color:rgb(55,40,244);}\n.palres {color:rgb(0,0,0);font-weight:bold;}\n</style>\n</head>\n<BODY>";
    
    public APIExportacion(String rutaIn){
        ruta = rutaIn;
        this.crearArchivo();
    }
    
    public void escribirBuffer(String cadena){
        this.bufferAux += cadena;
    }
    
    public void escribirBufferDelante(String cadena){
        this.bufferAux = cadena + this.bufferAux;
    }
    
    public void liberarBuffer(){
        this.escribirArchivo(this.bufferAux);
        this.bufferAux = "";
    }
    
    public void liberarBufferDelante(){
        this.escribirArchivoDelante(this.bufferAux);
        this.bufferAux = "";
    }
    
    public void crearArchivo(){
        
        try {
            File archivoNuevo = new File(ruta);
            
            // A partir del objeto File creamos el fichero físicamente
            if (archivoNuevo.createNewFile()){
                salida = new PrintWriter(archivoNuevo.getPath());
                System.out.println("El fichero se ha creado correctamente");
            }else
                salida = new PrintWriter(archivoNuevo.getPath());
            this.titulo = archivoNuevo.getName();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
    }
    
    public void escribirArchivo(String cadena){
        try{
            try{
                //salida.write(cadena);
                this.buffer += cadena;
            } catch (Exception e) {
                System.err.println(e);
            }
        }catch (Exception E){
            System.err.println("Ha ocurrido un error en la escritura");
        }
    }
    
    public void escribirArchivoDelante(String cadena){
        try{
            try{
                //salida.write(cadena);
                this.buffer = cadena + buffer;
            } catch (Exception e) {
                System.err.println(e);
            }
        }catch (Exception E){
            System.err.println("Ha ocurrido un error en la escritura");
        }
    }
    
    public void cerrarFichero(){
        if (!this.cancelar){
            this.salida.write("<HTML>\n<TITLE>"+this.titulo+"</TITLE>\n");
            this.salida.write(metaData);
            this.salida.write(heading);
            this.escribirCabeceras();
            this.salida.write(this.buffer);
            this.salida.write("\n</BODY>\n</HTML>");
            this.salida.close();
        }
        //System.out.println("Variables:\n"+this.controlVar.toString()+"\n;");
    }
    
    public void declaracionFP(String nombre){
        this.escribirArchivo("<a name='"+nombre+"'></a>");
    }
    
    public void declaracionIdent(String nombre){
        this.escribirArchivo("<a name='"+nombre+"'></a>");
    }
    
    public void escribirIdent(String nombre){
        this.escribirArchivo("<span class='ident'>"+nombre+"</span>");
    }
    
    
    public void addCabecera(String tipo, String nombre, String resto){
        //System.out.println("Cabecera añadida: "+tipo+nombre+resto);
        cabeceras.add("<a href='#"+nombre+"'>"+tipo+" "+nombre+" "+resto+"</a>");
    }
        
    public void escribirTituloArchivo(String nombrePrograma){
        
        heading = ("<h1>Programa: "+nombrePrograma+" </h1>");
        
    }
    
    public void escribirCabeceras(){
        
        salida.write("<h2>Funciones y Procedimientos</h2><a name='inicio'></a><ul>");
        for (String k : cabeceras){
            System.out.println("<li>"+k+"</li>");
            salida.write("<li>"+k+"</li>");
            
        }
        salida.write("<li><a href='#progPpal'>Programa principal</a></li>");
        salida.write("</ul>");
        
    }
    
    public void insertarVar(String ident,String tipo){
        
        this.controlVar.put(ident, tipo);
        
    }
    
    public String getTipo(String ident){
        System.out.println(this.controlVar);
        return this.controlVar.get(ident);
    }
    
    public void cancelar(){
        this.cancelar = true;
    }
    
    public boolean buscarAsignacion(String id){
        //System.out.println("Lista de asignaciones:\n"+this.controlAsig+"\n;");
        boolean aux = this.controlAsig.contains(id);
        this.controlAsig.clear();
        return aux;
    }
    
    public void insertAsig(String id){
        this.controlAsig.add(id);
    }
    
}
