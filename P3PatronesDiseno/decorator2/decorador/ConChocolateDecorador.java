package P3PatronesDiseno.decorator2.decorador;

import P3PatronesDiseno.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecorador{

    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio()+30;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+", chocolate";
    }
}
