package Modelo;

public class Libro extends Publicacion{
   
    private int anioPublicacion;
    private int numPaginas;
    
    public Libro(String titulo, Double precio, String nombreEmpresa, int anioPublicacion, int numPaginas){
        
        super(titulo, precio, nombreEmpresa);
        setAnioPublicacion(anioPublicacion);
        setNumPaginas(numPaginas);
    }
    
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
