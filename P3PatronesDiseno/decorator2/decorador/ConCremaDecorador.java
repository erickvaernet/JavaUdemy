package P3PatronesDiseno.decorator2.decorador;

import P3PatronesDiseno.decorator2.Configurable;

public class ConCremaDecorador extends CafeDecorador{

    public ConCremaDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio()+40;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+", crema";
    }
}
