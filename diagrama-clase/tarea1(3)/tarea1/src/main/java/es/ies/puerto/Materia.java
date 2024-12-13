package es.ies.puerto;

public class Materia extends Clase{


    public Materia(String nombre, String codigo){
        super(nombre,codigo);
    }


    public String accederDetalles(){
        return "Se accede a los detalles";
    }

}
