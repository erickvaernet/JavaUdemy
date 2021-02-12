package L1Paquetes.homee;

public class Persona {

    //----------Atributos------------------
    private String nombre;
    private String apellido;

    //----------Constructor------------------
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //----------Métodos geters y seters------------------
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    //----------Métodos própios------------------
    public static void imprimir(){
        System.out.println("Se llamo método estático Persona.imprimir()");

    }
    protected static void imprimirProtegido(){
        System.out.println("Se llamo método estático Persona.imprimirProtegido()");

    }

    static void imprimirDefault(){
        System.out.println("Se llamo método estático Persona.imprimirDefault()");

    }

    private static void imprimirPrivado(){
        System.out.println("Se llamo método estático Persona.imprimirPrivado()");

    }


    //----------Métodos Sobrescritos------------------
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }



}

