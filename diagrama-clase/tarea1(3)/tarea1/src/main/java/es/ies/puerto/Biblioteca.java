package es.ies.puerto;

public class Biblioteca {
    private String nombre;


    public Biblioteca(){}

    public Biblioteca(String nombre){
        this.nombre = nombre;
    }

    public String registrarLibro(String Libro){
        return "Se ha registrado "+Libro+" en la biblioteca";
    }

    public String ListarLibro(){
        return "Se muestran los libros";
    }
}
