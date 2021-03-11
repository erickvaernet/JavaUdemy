package O2ApiStream.models;

public class Usuario {
    private String name;
    private String apellido;

    public Usuario(String name) {
        this.name = name;
    }

    public Usuario(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
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

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

}
