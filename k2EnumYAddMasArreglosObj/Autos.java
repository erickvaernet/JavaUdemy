package k2EnumYAddMasArreglosObj;

public enum Autos {
    SEDAN("Sedan","Mediano",4),
    CONVERTIBLE("Convertible","Mediano",2);

    private String nombre;
    private  String tamaño;
    private int puertas;

    Autos(String nombre, String tamaño, int puertas){
        this.nombre= nombre;
        this.tamaño= tamaño;
        this.puertas= puertas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public int getPuertas() {
        return puertas;
    }

    @Override
    public String toString() {
        return "Autos{" +
                "nombre='" + nombre + '\'' +
                ", tamaño='" + tamaño + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
