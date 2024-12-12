package es.ies.puerto;

public class Ejercicio {
    static Persona persona;

    public static void main(String[] args) {
       persona = new Estudiante("nombre","ID","MATRICULA");
       System.out.println(persona.saludar());
    }
}
