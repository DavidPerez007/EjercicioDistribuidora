package Modelo;

public class Disco extends Publicacion{

    private int duracion;
    
    public Disco(String titulo, Double precio, String nombreEmpresa, int duracion){
        
        super(titulo, precio, nombreEmpresa);
        setDuracion(duracion);
    }
    
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
