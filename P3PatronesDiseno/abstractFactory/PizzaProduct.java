package P3PatronesDiseno.abstractFactory;

import java.util.ArrayList;
import java.util.List;

abstract public class PizzaProduct {

    //1r creamos la clase abstracta "Producto" con sus atrib y metodos

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;
    protected double precio;

    public PizzaProduct() {
        this.ingredientes= new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void preparar(){
        System.out.println("Preparando:"+nombre);
        System.out.println("Seleccionando la masa:"+masa);
        System.out.println("Selecionando la salsa:"+salsa);
        System.out.println("Agregando ingredientes:");
        ingredientes.forEach(System.out::println);
    }

    public void empaquetar(){
        System.out.println("Empaquetando la pizza...");
    }

    abstract public void cocinar();

    abstract public void cortar();

    @Override
    public String toString() {
        return "PizzaProduct{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                ", precio=" + precio +
                '}';
    }
}
