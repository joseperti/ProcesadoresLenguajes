
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.APPEND;

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
    
    public APIExportacion(String rutaIn){
        ruta = rutaIn;
        this.crearArchivo();
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
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
    }
    
    public void escribirArchivo(String cadena){
        try{
            try{
                salida.write(cadena);
            } catch (Exception e) {
                System.err.println(e);
            }
        }catch (Exception E){
            System.err.println("Ha ocurrido un error en la escritura");
        }
    }
    
    public void cerrarFichero(){
        this.salida.close();
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
    
    
}