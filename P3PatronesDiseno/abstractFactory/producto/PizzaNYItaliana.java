package P3PatronesDiseno.abstractFactory.producto;

import P3PatronesDiseno.abstractFactory.PizzaProduct;

public class PizzaNYItaliana extends PizzaProduct {

    public PizzaNYItaliana() {
        super();
        nombre="Pizza Italiana NY";
        masa="Masa gruesa";
        salsa="Salsa de tomate italiana";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Jamon");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 30 min a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes");
    }
}
