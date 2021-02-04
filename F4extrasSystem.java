import java.io.FileInputStream;

public class F4extrasSystem {
    public static void main (String [] args){
        //Clase System es static y final, no se instancia ni se hereda

        //Se puede usar la clase System para manejar errores

        try{
            FileInputStream archivo = new FileInputStream("src/archivoFalso");
        }catch (Exception e){

            //Usando System.err en vez de .out se emite un mensaje de error
            System.err.println("Se Produjo un error al cargar el archivo: " + e.getMessage());

            //Podemos forzar la salida con codigo 1 correspondiente a error o a -1; con 0 seria si no hay error
            System.exit(1);
        }
        /*
            Tambien podemos forzar a que actue el recolector de basura; Generalmente este se invoca automáticamente
            Pero podriamos querer forzar a usarlo para que la recoleccion sea mas rápida en casos específicos
            Ya que este GC elimina todos los obj que no están siendo utilizados
         */
        System.gc(); //gc son las iniciales de Garbage Colector

        //Codigo de salida igual a 0 o sin error
        System.exit(0);

    }
}
