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
    public String mostrar() {
        StringBuilder sb= new StringBuilder(nombre);
        sb.append("/");
        for (Componente c: contenido){
            sb.append(c.mostrar());
            if (c instanceof Archivo){
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return nombre +"(Carpeta)";
    }


}
