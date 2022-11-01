package DataAccessObject;
import Modelo.Publicacion;
import java.util.ArrayList;

public interface DAOInterface {
    public boolean crearArchivo()throws Exception;
    public ArrayList<Publicacion> getPublicaciones();
    public boolean setPublicaciones(Publicacion publicacion);
    public boolean modificar(Publicacion publicacion);
    public boolean eliminar(Publicacion publicacion);
}
