package P3PatronesDiseno.Composite;

public class Archivo extends Componente {

    public Archivo(String nombre) {
        super(nombre);
    }

    @Override
    public String mostrar() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return nombre +"(Archivo)";
    }
}
