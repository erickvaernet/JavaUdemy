package P3PatronesDiseno.decorator2.decorador;

import P3PatronesDiseno.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador{

    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public double getPrecio() {
        return cafe.getPrecio()+50;
    }

    @Override
    public String getIngredientes() {
        return cafe.getIngredientes()+", leche";
    }
}
