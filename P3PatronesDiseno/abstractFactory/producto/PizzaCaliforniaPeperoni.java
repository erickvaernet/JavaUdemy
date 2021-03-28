package P3PatronesDiseno.abstractFactory.producto;

import P3PatronesDiseno.abstractFactory.PizzaProduct;

public class PizzaCaliforniaPeperoni extends PizzaProduct {

    public PizzaCaliforniaPeperoni() {
        super();
        nombre="Pizza peperoni California";
        masa="Masa a la piedra gruesa";
        salsa="Salsa de tomate";
        ingredientes.add("Extra queso Mozzarella");
        ingredientes.add("Peperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 55 min a 80°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rectanglos pequeños");
    }
}
