package P3PatronesDiseno.decorator2;

public class Cafe implements Configurable{
    private double precio;
    private String ingredientes;

    public Cafe(double precio, String ingredientes) {
        this.precio = precio;
        this.ingredientes = ingredientes;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String getIngredientes() {
        return this.ingredientes;
    }
}
