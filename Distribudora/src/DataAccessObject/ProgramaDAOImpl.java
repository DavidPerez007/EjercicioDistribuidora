package DataAccessObject;
import Modelo.Publicacion;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class ProgramaDAOImpl implements DAOInterface{
    
    public ArrayList<Publicacion> publicaciones = new ArrayList<>();

    @Override
    public boolean crearArchivo() throws IOException{
        boolean bandera = false;
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter("publicaciones.txt");
            myWriter.write("Hola");
            myWriter.close();
            bandera = true;
    
        }  
        //No sé si el try catch está bien implementado
        catch(Exception exception) {
            System.out.println(exception);
            exception.printStackTrace();
        }
        return bandera;
    }
    public void escribirPublicacion() throws IOException{
        File file = new File("./src/Data/publicaciones.txt");
        if(file.exists()){
            //Escribir en el archivo
        } else {
            crearArchivo();
        }
        
        
    }
    
   

    @Override
    public ArrayList<Publicacion> getPublicaciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean setPublicaciones(Publicacion publicacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean modificar(Publicacion publicacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean eliminar(Publicacion publicacion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
