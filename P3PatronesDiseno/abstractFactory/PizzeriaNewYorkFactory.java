package P3PatronesDiseno.abstractFactory;

import P3PatronesDiseno.abstractFactory.producto.PizzaNYItaliana;
import P3PatronesDiseno.abstractFactory.producto.PizzaNYPeperoni;
import P3PatronesDiseno.abstractFactory.producto.PizzaNYVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{
    @Override
    PizzaProduct crearPizza(String tipo) {
        //solo usar este switch a partir de jdk13 en adelante
        return switch (tipo){
            case "vegetariana"-> new PizzaNYVegetariana();
            case "italiana"-> new PizzaNYItaliana();
            case "peperoni"-> new PizzaNYPeperoni();
            default -> null;
        };
    }
}
