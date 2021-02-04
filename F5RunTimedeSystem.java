import java.util.Locale;
import java.util.Properties;

public class F5RunTimedeSystem {
    public static void main(String [] args) {
        /*
            Vamos a verificar el SO antes de abrir un programa por ejemplo, un editor de texto ya que
            en Windows y en linux son programas diferentes.
            Para ello usamos la clase System y el método getProperty() para comparar el nombre del SO
         */

        //Creamos un objeto RunTime de Java.lang con su método estatico que nos permite ejecutar programas y apps
        Runtime rt = Runtime.getRuntime();// Se obtiene la instancia del tiempo de ejecucion

        //Cuando ejecutamos un programa con runtime se retorna un obj de tipo process. por lo tanto creamos una var de este tipo
        Process proceso;

        try {
            if (System.getProperty("os.name").startsWith("Windows")){

                //Para ejecutar algo simplemente llamamos a exec() de Runtime y pasamos el comando asociado
                proceso= rt.exec("notepad");

            }else if (System.getProperty("os.name").toLowerCase().contains("nux") ||
                    System.getProperty("os.name").toLowerCase().contains("nix")){
                proceso= rt.exec("gedit");
            }else{
                proceso=rt.exec("textedit"); //en caso de que sea mac
            }
            //para que se mantenga abierto el notepad u otro editor
            proceso.waitFor();

        }catch (Exception e){
            System.err.println("Error al abrir el editor = " + e.getMessage());
            System.exit(1);
        }

        System.out.println("El editor se ah cerrado satisfactoriamente");
        System.exit(0);
    }


}
