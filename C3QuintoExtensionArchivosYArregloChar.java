public class C3QuintoExtensionArchivosYArregloChar {
    public static void main(String[] args) {
        String archivo = "Un-Archivo.de.Vacaciones.pdf";
        int separador = archivo.lastIndexOf(".");

        System.out.println("---------------------------------------------------");
        System.out.println("Nombre del archivo: " + archivo.substring(0, separador));
        System.out.println("Extension: " + archivo.substring(separador));
        System.out.println("---------------------------------------------------");

        String cadena = "Cadena para arreglo de Chars";
        char[] arrayChar = cadena.toCharArray();

        for (int i = 0; i < arrayChar.length; i++) {
            System.out.print(arrayChar[i]);
        }

        System.out.println("-----------------");
        System.out.print("Arreglo de substr con split(\" \") = [ ");
        String[] arraySubString = cadena.split(" ");
        for (String elem : arraySubString) {
            System.out.print(elem + ", ");
        }
        System.out.print("\b\b ]");


        String[] arrayArch = archivo.split("\\."); // Se usa el \\ para usar el . ya que el . representa cualquier caracter en expresiones regulares
        //o bien [.]

        System.out.println("\n");
        System.out.println("Archivo = " + archivo);
        System.out.print("Arreglo de substr con split(\".\") de archiv = [ ");

        for (String elem : arrayArch) {
            System.out.print(elem + ", ");
        }
        System.out.print("\b\b ]");


    }
}
