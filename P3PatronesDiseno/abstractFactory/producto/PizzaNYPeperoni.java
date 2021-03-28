package P3PatronesDiseno.abstractFactory.producto;

import P3PatronesDiseno.abstractFactory.PizzaProduct;

public class PizzaNYPeperoni extends PizzaProduct {

    public PizzaNYPeperoni() {
        super();
        nombre="Pizza peperoni NY";
        masa="Masa delgada a la piedra";
        salsa="Salsa de tomate";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Extra peperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 40 min a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos");
    }
}
