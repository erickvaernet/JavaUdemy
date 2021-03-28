package P3PatronesDiseno.abstractFactory;

import P3PatronesDiseno.abstractFactory.producto.*;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProduct crearPizza(String tipo) {
        //solo usar este switch a partir de jdk13 en adelante
        return switch (tipo){
            case "vegetariana"-> new PizzaCaliforniaVegetariana();
            case "queso"-> new PizzaCaliforniaQueso();
            case "peperoni"-> new PizzaCaliforniaPeperoni();
            default -> null;
        };
    }
}
