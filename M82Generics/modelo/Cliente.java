package M82Generics.modelo;

import java.util.Objects;

public class Cliente {

    private Integer id;
    private String nombre;
    private String apellido;
    private static int ultimoId;

    public Cliente() {
        this.id=++ultimoId;
    }

    public Cliente(String nombre, String apellido) {
        this.id=++ultimoId;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id); //Objects es una clase Helper compara que no sea nulo el id y que sean iguales
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'';
    }

}
