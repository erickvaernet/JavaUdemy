import java.util.Map;

public class F3ObtenerVarEntorno {
    public static void main(String[] args) {

        //Para obtener las variables de entorno del sistema se usa un diccionario, que en Java se conoce como maps o mapas
        Map<String, String> varEnv= System.getenv();
        System.out.println("-------------------INICIO-------------------------");
        System.out.println("varEnv = " + varEnv);
        System.out.println(".................................");

        //Para obtener solo una de las variables de entorno
        String varPers= System.getenv("USERNAME");
        System.out.println("varPers = " + varPers);
        
        //Se obtiene una de los valores del dicc o map con la clave o key
        String varPathExt = varEnv.get("PATHEXT");
        System.out.println("varPathExt = " + varPathExt);

        /*
        Se puede crear una variable de entorno en el terminal, con Win sería:
        setx NUEVA_VARIABLE_CUSTOM "Valor custom"
         */
        
        System.out.println("-------------------ITERAR MAP-------------------------");

        //Para recorrer el mapa obtenemos el keySet o conjunto de llaves y luego obtenmos sus valores con  el objeto map
        //mas el metodo .get(key) para obtener su valor correspondiente a la llave indicada como parametro
        for (String k:varEnv.keySet()) {
            System.out.println(k +" =>"+ varEnv.get(k));
        }

    }
}
