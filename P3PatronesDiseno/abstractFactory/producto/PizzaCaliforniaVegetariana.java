package P3PatronesDiseno.abstractFactory.producto;

import P3PatronesDiseno.abstractFactory.PizzaProduct;

public class PizzaCaliforniaVegetariana extends PizzaProduct {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre="Pizza vegetariana California";
        masa="Masa delgada light";
        salsa="Salsa BBQ light";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Tomates");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
        ingredientes.add("Cebolla");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 20min a 180°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas rectangulares");
    }
}
