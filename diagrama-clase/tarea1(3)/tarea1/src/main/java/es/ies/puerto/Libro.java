package es.ies.puerto;

public class Libro {
    private String titulo;
    private String autor;

    public Libro(){}

    public Libro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public String detallesLibro(String Libro){
        return "Se muestran los detalles";
    }
}
