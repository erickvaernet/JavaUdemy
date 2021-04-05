package P3PatronesDiseno.Composite;

public class Archivo extends Componente {

    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public String mostrar(int nivel) {
        return "\t".repeat(nivel)+ this.nombre;
    }

    @Override
    public boolean buscar(String nombre) {
        return this.nombre.equalsIgnoreCase(nombre);
    }

    @Override
    public String toString() {
        return nombre +"(Archivo)";
    }
}
