package M6Interfaces.modelo;

public enum Generos {

    DRAMA("Drama"),
    ACCION("Accion"),
    AVENTURA("Aventura"),
    TERROR("Terror"),
    CIENCIA_FICCION("Ciencia Ficcion"),
    PROGRAMACION("Programacion");

    private String nombre;

    Generos(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre ;
    }
}
