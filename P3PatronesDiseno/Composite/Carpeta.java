package P3PatronesDiseno.Composite;

import java.util.ArrayList;
import java.util.List;

public class Carpeta extends Componente {
    private List<Componente> contenido;

    public Carpeta(String nombre) {
        super(nombre);
        this.contenido= new ArrayList<>();
    }

    public Componente addComponent(Componente c){
        this.contenido.add(c);
        return this;
    }

    public boolean removeComponente(Componente c){
        return this.contenido.remove(c);
    }


    @Override
    public String mostrar(int nivel) {
        StringBuilder sb= new StringBuilder("\t".repeat(nivel));
        sb.append(nombre)
                .append("/")
                .append("\n");
        for (Componente c: contenido){
            sb.append(c.mostrar(nivel+1));
            if (c instanceof Archivo){
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public boolean buscar(String nombre) {
        if (this.nombre.equalsIgnoreCase(nombre)) return true;
        return contenido.stream().anyMatch((c)-> c.buscar(nombre));
    }

    @Override
    public String toString() {
        return nombre +"(Carpeta)";
    }


}
