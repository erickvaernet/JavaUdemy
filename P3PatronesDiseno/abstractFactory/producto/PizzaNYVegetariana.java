package P3PatronesDiseno.abstractFactory.producto;

import P3PatronesDiseno.abstractFactory.PizzaProduct;

public class PizzaNYVegetariana extends PizzaProduct {

    public PizzaNYVegetariana() {
        super();
        nombre="Pizza vegetariana NY";
        masa="Masa integral vegana";
        salsa="Salsa de tomate";
        ingredientes.add("Queso vegano");
        ingredientes.add("Tomates");
        ingredientes.add("Espinacas");
        ingredientes.add("Berenjenas");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando 50min a 150°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas");
    }
}
