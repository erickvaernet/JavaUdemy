package P1Anotaciones.models;

import P1Anotaciones.Init;
import P1Anotaciones.JsonAtributo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Producto {

    @JsonAtributo(nombre = "descripcion", capitalizar = true)
    private String nombrep;
    @JsonAtributo()
    private Long precio;
    private LocalDate fecha;

    public String getNombrep() {
        return nombrep;
    }

    public void setNombrep(String nombre) {
        this.nombrep = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Init
    private void init(){
        this.nombrep=Arrays.stream(nombrep.split(" "))
                .map((word)-> word.substring(0,1).toUpperCase()+
                        word.substring(1).toLowerCase())
                .collect(Collectors.joining(" "));
    }
}
