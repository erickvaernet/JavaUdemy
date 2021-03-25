package P2Recursividad.models;

import java.util.ArrayList;
import java.util.List;

public class Componente {
    private String nombre;
    private List<Componente> componentes;
    int nivel;

    public Componente(String nombre) {
        this.nombre = nombre;
        this.componentes= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public Componente addComponente(Componente componente){
        this.componentes.add(componente);
        return this;
    }

    public boolean tieneHijos(){
        return !this.componentes.isEmpty();
    }

    @Override
    public String toString() {
        return "Componente{" +
                "nombre='" + nombre + '\'' +
                ", componentes=" + componentes +
                '}';
    }


}
