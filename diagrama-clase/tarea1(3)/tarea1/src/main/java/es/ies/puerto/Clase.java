package es.ies.puerto;
import java.util.Objects;

public class Clase {
    private String nombre;
    private String codigo;


    public Clase(){}

    public Clase(String nombre,String codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Clase nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Clase codigo(String codigo) {
        setCodigo(codigo);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Clase)) {
            return false;
        }
        Clase clase = (Clase) o;
        return Objects.equals(nombre, clase.nombre) && Objects.equals(codigo, clase.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, codigo);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", codigo='" + getCodigo() + "'" +
            "}";
    }
    
}
