package P3PatronesDiseno.decorator2;

import P3PatronesDiseno.decorator2.decorador.ConChocolateDecorador;
import P3PatronesDiseno.decorator2.decorador.ConCremaDecorador;
import P3PatronesDiseno.decorator2.decorador.ConLecheDecorador;

public class Main {
    public static void main(String[] args) {
        Configurable cafe= new Cafe(100,"Cafe Moca");
        ConLecheDecorador cLeche= new ConLecheDecorador(cafe);
        ConChocolateDecorador cChocolate= new ConChocolateDecorador(cLeche);
        ConCremaDecorador cCrema= new ConCremaDecorador(cChocolate);

        System.out.println("Precio="+ cCrema.getPrecio());
        System.out.println("Ingredientes="+ cCrema.getIngredientes());
    }
}
