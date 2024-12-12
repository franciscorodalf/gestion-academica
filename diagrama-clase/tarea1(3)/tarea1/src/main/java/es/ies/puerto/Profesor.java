package es.ies.puerto;

public class Profesor extends Persona{
        private String especialidad;

        public Profesor(){}

        public Profesor(String nombre, String id, String especialidad){
            super(nombre,id);
            this.especialidad = especialidad;
        }

        @Override
        String pensar() {
            return "Soy un profesoy y pienso en como dar la clase";
        }
}
