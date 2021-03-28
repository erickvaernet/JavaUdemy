package P3PatronesDiseno.abstractFactory.main;

import P3PatronesDiseno.abstractFactory.PizzaProduct;
import P3PatronesDiseno.abstractFactory.PizzeriaCaliforniaFactory;
import P3PatronesDiseno.abstractFactory.PizzeriaNewYorkFactory;
import P3PatronesDiseno.abstractFactory.PizzeriaZonaAbstractFactory;

public class Main {
    public static void main(String[] args) {
        PizzeriaZonaAbstractFactory ny= new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california= new PizzeriaCaliforniaFactory();

        PizzaProduct pizza = california.oredenarPizza("vegetariana");
        System.out.println("Juan ordena la pizza:"+ pizza.getNombre());
        System.out.println("-----------------------------------------");

        pizza = ny.oredenarPizza("vegetariana");
        System.out.println("Pedro ordena la pizza:"+ pizza.getNombre());
        System.out.println("-----------------------------------------");

        pizza = ny.oredenarPizza("peperoni");
        System.out.println("Pablo ordena la pizza:"+ pizza.toString());
    }

}
