package P3PatronesDiseno.singleton;

public class ConexionBDSingleton {
    //La idea es que siempre se acceda a una misma y unica instancia

    //2do Un atributo estático para guardar la unica instancia de la clase
    private static ConexionBDSingleton instancia;

    //1ro, un Constructor privado ya que no debe poder crearse mas de uno (solo se puede acceder a este método desde dentro)
    private ConexionBDSingleton() {
        System.out.println("Conectando BD");
    }

    //en 3er lugar un método estático que nos devuelva una instancia de la clase
    public static ConexionBDSingleton getInstance(){
        if(instancia == null){
            instancia= new ConexionBDSingleton();
        }
        return instancia;
    }
}
