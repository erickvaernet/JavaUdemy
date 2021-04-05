package P4ManejoArchivos;


public class Main1 {
    public static void main(String[] args) {

        ArchivoServicio archivoServicio= new ArchivoServicio();

        archivoServicio.crearArchivo("archivoNuevo.txt");

        System.out.println(archivoServicio.leerArchivo("archivoNuevo.txt"));

    }
}
