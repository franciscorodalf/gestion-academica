package es.ies.puerto;

public class Examen {
    private String fecha;

    public Examen(){}

    public Examen(String fecha){
        this.fecha = fecha;
    }

    public String ProgramarFecha(String fecha){
        return "Se ha programado el examen para el "+fecha;
    }

}
