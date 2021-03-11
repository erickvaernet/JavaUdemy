package O2ApiStream.models;

import com.sun.management.GarbageCollectionNotificationInfo;

import java.lang.management.GarbageCollectorMXBean;

public class Usuario {
    private String name;
    private String apellido;
    private Integer id;
    private static int lastId;

    public Usuario(String name) {
        this.name = name;
        this.id=++lastId;

    }

    public Usuario(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
        this.id=++lastId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';

    }


}
