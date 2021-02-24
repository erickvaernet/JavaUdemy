package M8Generics.genericClass;

public class Animal {

    private String tipo;
    private String nombre;

    public Animal(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }
}
