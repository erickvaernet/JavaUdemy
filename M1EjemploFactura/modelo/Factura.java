package M1EjemploFactura.modelo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Factura {

    private int folio;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private ItemFactura[] items;// Agregacion por que hay que agregar items
    private int indiceItems;
    public static final int MAX_ITEMS=10;
    private static int indiceFolio;

    //CONSTRUCTOR


    public Factura(String descripcion, Cliente cliente) {
        this.descripcion = descripcion;
        this.cliente = cliente;
        this.items= new ItemFactura[MAX_ITEMS];
        this.folio= ++indiceFolio; //al principio ++ asi comienza en 1
        this.fecha= new Date();
    }

    //GETERs
    public int getFolio() {
        return folio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ItemFactura[] getItems() {
        return items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    //SETERs

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {

        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //Métodos propios

    public void addItemFactura(ItemFactura itemFactura){

        if (indiceItems<MAX_ITEMS)this.items[indiceItems++]=itemFactura;
        else System.out.println("No se puede agregar más items a la Factura");
    }

    public double calcularTotal(){
        double total=0d;
        for (ItemFactura item:items){
            if (item==null) continue;
            total+=item.calcularImporte();
        }
        return total;
    }

    public String generarDetalle(){
        StringBuilder strBuilder= new StringBuilder("Factura Nº:");
        SimpleDateFormat formater= new SimpleDateFormat("dd\\mm\\YYYY");

        strBuilder.append(this.folio)
                .append("\nCliente: ").append(this.cliente.getNombre())
                .append("\nCUIT: ").append(this.cliente.getCuit())
                .append("\nFecha: ").append(formater.format(this.fecha))
                .append("\nDescripción: ")
                .append(this.descripcion)
                .append("\n");

        strBuilder.append("\n#\tNombre\t$\t\tCant.\tTotal\n");

        for (ItemFactura item:items){
            if (item==null) continue;

            strBuilder.append(item).
                    append("\n");

            /*
            strBuilder.append(item.getProducto().getId())
                    .append("\t")
                    .append(item.getProducto().getNombre())
                    .append("\t")
                    .append(item.getProducto().getPrecio())
                    .append("\t")
                    .append(item.getCantidad())
                    .append("\t").
                    append(item.calcularImporte())
                    .append("\n");

             */
        }

        strBuilder.append("\nTotal de compra: ").append(this.calcularTotal());

        return strBuilder.toString();

    }

    //Métodos Sobrescritos

    @Override
    public String toString() {
        return generarDetalle();
    }

}
