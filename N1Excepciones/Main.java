package N1Excepciones;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        /*
        Una excepcion es un problema o evento que ocurre durante la ejecucion de un programa que interrumpe el flujo normal
        -esta nos permite separar el codigo que gestiona los errores del codigo del programa principal
        -permite manejar error y continuar con la ejecucion del programa
        -Agrupa y dif entre distintos tipos de errores
        -Propaga errores hacia arriba en la pila de llamadas (Stack Trace). un error en el método de una clase que va
         escalando hasta el ultimo método donde fue llamado (gralmente el main) siempre que no se maneje la excepcion
         */

        //Podemos encadenar los catch
        try{
            String value= JOptionPane.showInputDialog(null,"Ingrese un numero entero");

            int numero= Integer.parseInt(value);// Puede lanzar NumberFormatException

            System.out.println("2/numero = " + 2/numero);// Puede lanzar ArtihmeticException

            //Las Excepciones las manejamos en orden en el que podrian aparecer
        }catch (NumberFormatException ne){
            System.out.println("Se introdujo un valor que no es un entero");
        }catch (ArithmeticException ae){
            System.out.println("Se introdujo un valor igual a 0, imposible dividir");
        }

        /*
        Cuando se lanza una excepcion se lanza una instancia de Exception o clase hija.
        Esta tiene 2 constructores y 2 métodos import:
         */
        //Constructores
        Exception excNueva= new Exception();
        Exception excNueva2= new Exception("Mensaje de Error");
        //Métodos
        excNueva2.getMessage(); //Para el mensaje de error de la excepcion
        excNueva2.getStackTrace();// Para trazar la ruta de  excepciones. Desde donde se origina el error

        /*
        Hay 2 tipos de excepciones, las checked que es obligatorio manejar con try catch como IOException o SQLException
        (derivan directamente de Exception) y el otro tipo unchecked que no es obligatorio manejarlas como lo son las
        vistas recientemente NumberFormatExc o ArithmeticEx (Derivan de RuntimeException, o nullPointerException)
        -Regla: Checked cuando podemos recuperarnos del error y continuar el flujo normal del error, Unchecked cuando no
         */

        //Exception al igual que Error(No checkeada y de parte del sistema propiamente, no se pueden manejar) son hijas
        // de Throwable, es decir que se pueden lanzar con throw

        /*
        Clausula throws indica que el método lanzara un tipo de excepcion
        public Cliente porId(int id) throws Exception{
         //o manejamos aca la excepcion con try catch o manejamos en main es decir mas arrriba o propagarla
         if(id==0){
         throw new Exception("El id no puede ser 0") //Exception si es checked  o de RUntimeExc si es unchecked
         }
        }
       */



    }
}
