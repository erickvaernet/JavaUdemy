package L1Paquetes.homee;


public class Persona1Hija extends Persona{

    public Persona1Hija(String nombre, String apellido) {
        super(nombre, apellido);
    }

   private static void imprimirPrivado(){
       System.out.println("Se llamo méto imprimirPrivado de Persona HIJA");
   }

   protected static void imprimirProtegido(){
       System.out.println("Se llamo méto imprimirProtegido de Persona HIJA");
   }

   public static void imprimir(){
       System.out.println("Se llamo méto imprimirPublico de Persona HIJA");
   }

   static void imprimirDefault(){
       System.out.println("Se llamo méto imprimirDefault de Persona HIJA");
   }
}
