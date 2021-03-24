package O3Optional.models;

import java.util.Optional;

public class Computador {
    private String nombre;
    private String modelo;

    public Computador() {
    }

    public Computador(String nombre) {
        this.nombre = nombre;
    }

    public Computador(String nombre, String modelo) {
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public Optional<String> getNombre2() {
        return Optional.ofNullable(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return  nombre +", "+ modelo;
    }
}
