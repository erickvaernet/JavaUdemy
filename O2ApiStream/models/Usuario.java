package O2ApiStream.models;


import java.lang.management.GarbageCollectorMXBean;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String name;
    private String apellido;
    private Integer id;
    private static int lastId;
    private List<Factura> facturas;

    public Usuario(String name) {
        this.name = name;
        this.id=++lastId;
        this.facturas= new ArrayList<>();

    }

    public Usuario(String name, String apellido) {
        this.name = name;
        this.apellido = apellido;
        this.id=++lastId;
        this.facturas= new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Usuario addFactura(Factura factura){
        this.facturas.add(factura);
        factura.setUsuario(this);
        return this;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "name='" + name + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';

    }


}
