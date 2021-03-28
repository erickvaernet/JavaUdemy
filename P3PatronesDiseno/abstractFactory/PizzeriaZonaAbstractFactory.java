package P3PatronesDiseno.abstractFactory;

abstract public class PizzeriaZonaAbstractFactory {

    //En 2do lugar creamos la clase abstracta de la abstractFactory

    public PizzaProduct oredenarPizza(String tipo){
        PizzaProduct pizza = crearPizza(tipo);
        System.out.println("Fabricando pizza:"+pizza.getNombre());
        pizza.preparar();
        pizza.cocinar();
        pizza.cortar();
        pizza.empaquetar();
        return pizza;
    }

    abstract  PizzaProduct crearPizza(String tipo);
}
