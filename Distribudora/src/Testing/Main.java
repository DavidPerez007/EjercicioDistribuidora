package Testing;
import DataAccessObject.*;
import Modelo.Publicacion;
import java.io.IOException;
import java.util.ArrayList;
public class Main {
    
    public static void main(String[] args) throws IOException{
        DAOInterface ano = new ProgramaDAOImpl();
        ArrayList<Publicacion> datos = new ArrayList<>(((ProgramaDAOImpl)ano).crearArchivo());

    }
        
}
