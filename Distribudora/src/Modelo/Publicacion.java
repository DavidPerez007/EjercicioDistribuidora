
package Modelo;

public abstract class Publicacion {

    private String titulo;
    private Double precio;
    private String nombreEmpresa;
    
    public Publicacion(String titulo, Double precio, String nombreEmpresa){
        this.titulo = titulo;
        this.precio = precio;
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

}
