package P4ManejoArchivos;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre){

        //Creamos una representacion del archivo con la ruta y nombre del mismo
        //File archivo = new File("C:\\Users\\erick\\Desktop\\nuevoTXT-Java.txt");
        File archivo = new File("C:\\Users\\erick\\Desktop\\"+nombre);

        try {
            /*Lo pasamos al "escritor" por argumento, esto deberia crear un archivo vacio en el segundo parametro
            indicamos si dejamos abierto a modificaciones posteriores, de esta manera si exite el archivo no se crea uno
            nuevo sino que escribe lo que indiquemos despues del contenido original del archivo, de manera que si ejecutamos
            este metodo 3 veces, se escribira 3 veces lo indicado, uno despues del otro.*/
            FileWriter escritor = new FileWriter(archivo,true);

            //Podemos usar el método append que nos devuelve el mismo escritor o simplemente write()
            escritor.append("Primera linea\n").append("Segunda Linea\n");

            //Luego debemos cerrar el FileWriter una vez finalizado lo que queremos escribir
            escritor.close();

            System.out.println("El archivo se creo con exito");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void crearArchivo2(String nombre){

        File archivo = new File("C:\\Users\\erick\\Desktop\\"+nombre);
        try {
            FileWriter escritor = new FileWriter(archivo,true);
            /*Para gan cantidad de palabras debemos usar el BufferWriter que es mucho mas optimizado que el filewriter.
            Ya que con FileWriter cada vez que escribimos accedemos al disco, sin embargo con BufferWriter vamos usando
            el buffer a medida que usamos append, es decir se escriben las paalabras hasta que se llene el buffer
            (8100 palabras aprox), una vez que el buffer se llena (o si se usa close antes que eso) recien se accede
            a memoria
             */
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);
            bufferedWriter.append("Primera linea\n").append("Segunda Linea\n");
            bufferedWriter.close();
            System.out.println("El archivo se creo con exito");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void crearArchivo3(String nombre){
        File archivo = new File("C:\\Users\\erick\\Desktop\\"+nombre);
        //Info: https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
        //A partir de java 7 podemos usar de esta manera el try (como recurso):
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(archivo,true))){

            //Esta manera permite que no sea necesario el uso del close, ya que se cierra automáticamente
            bufferedWriter.append("Primera linea\n").append("Segunda Linea\n");
            //bufferedWriter.close();
            System.out.println("El archivo se creo con exito");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void crearArchivo4(String nombre){
        File archivo = new File("C:\\Users\\erick\\Desktop\\"+nombre);

        /*Podemos hacer uso del printWriter el cual por debajo actua como BufferedWriter pero permite trabajar como si
        fuera una consola, es decir con comandos como println y printf*/

        try (PrintWriter printer = new PrintWriter(new FileWriter(archivo,true))){

            printer.println("Primera linea\n");
            printer.println("Segunda Linea\n");
            System.out.println("El archivo se creo con exito");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String leerArchivo(String nombre){
        //Lo primero es implementar un StringBuilder donde vamos a ir guardando el contenido linea a linea
        StringBuilder sb= new StringBuilder();
        File archivo = new File("C:\\Users\\erick\\Desktop\\"+nombre);
        try {
            BufferedReader reader= new BufferedReader(new FileReader(archivo));

            //Para leer una linea
            //String linea= reader.readLine();

            //Pero queremos leer tdo, por lo tanto debemos usar un while e ir uniendo las lineas dentro del stringbuilder
            String linea;
            while ( (linea=reader.readLine()) != null){
                sb.append(linea).append("\n");
            }

            //reader.lines().forEach(sb::append); //usando api stream

            //No es obligacion cuando se esta leyendo un archivo pero siempre se recomienda cerrarlo
            //Como alternativa se puede usar el buffer reader como parametro del try asi no es necesario el close
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return  sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb= new StringBuilder();
        File archivo = new File("C:\\Users\\erick\\Desktop\\"+nombre);
        try {
            //Usando Scanner: Tanto el Buffer reader como Scanner estan bien optimizado
            Scanner sc= new Scanner(archivo);
            String linea;
            //Es necesario colocar un delimittador o el patron que indica el salto de linea:
            sc.useDelimiter("\n");
            while ( sc.hasNext()){
                sb.append(sc.next()).append("\n");
            }

            //No es obligacion cuando se esta leyendo un archivo pero siempre se recomienda
            //Como alternativa se puede usar el Scanner como parametro del try asi no es necesario el close
            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return  sb.toString();
    }

    /* Comparacion de BufferReader y Scanner, buffer reader es un poco mas optimizado entre otras diferencias:
     -BufferedReader is synchronous while Scanner is not. BufferedReader should be used if we are working with
    multiplethreads.
     -BufferedReader has significantly larger buffer memory than Scanner.
     -The Scanner has a little buffer (1KB char buffer) as opposed to the BufferedReader (8KB byte buffer), but it’s more
    than enough.
     -BufferedReader is a bit faster as compared to scanner because scanner does parsing of input data and BufferedReader
    simply reads sequence of characters.
     */
}
