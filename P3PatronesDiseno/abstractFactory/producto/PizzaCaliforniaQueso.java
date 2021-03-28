package P3PatronesDiseno.abstractFactory.producto;

import P3PatronesDiseno.abstractFactory.PizzaProduct;

public class PizzaCaliforniaQueso extends PizzaProduct {

    public PizzaCaliforniaQueso() {
        super();
        nombre="Pizza Queso NY";
        masa="Masa a la piedra delgada";
        salsa="Salsa de tomate rucua";
        ingredientes.add("Extra queso mozzarella");
        ingredientes.add("Cebolla");
        ingredientes.add("Queso azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 35 min a 100°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos pequeños");
    }
}
