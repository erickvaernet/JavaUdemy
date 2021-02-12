package M1EjemploFactura.modelo;

public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private static int ultimoId;

    public Producto() {
    }

    public Producto(int id, String nombre, double precio) {
        this.id = ++ultimoId;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return  id +
                "\t" + nombre +
                '\t' + precio ;
    }
}
