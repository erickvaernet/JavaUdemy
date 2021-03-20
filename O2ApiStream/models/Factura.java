package O2ApiStream.models;

public class Factura {
    private String descripcion;
    private Integer precio;
    private Usuario usuario;

    public Factura(String descripcion, Integer precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "usuario='" + usuario + '\'' +
                ", precio=" + precio +
                ", descripcion=" + descripcion +
                '}';
    }
}
