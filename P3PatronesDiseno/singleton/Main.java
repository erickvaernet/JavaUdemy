package P3PatronesDiseno.singleton;

public class Main {
    public static void main(String[] args) {

        /*Singleton: Patron que ns permite crear una sola istancia de una clase, la cual es compartida por toda la app
        se usa en base de datos haciendo que las conexiones se manejen por una unica instania.

        *Resuelve 2 problemas:
        1-Garantizar que una clase tenga una única instancia: El motivo más habitual es controlar el acceso a algún
        recurso compartido, por ejemplo, una base de datos o un archivo.
        2-Proporcionar un punto de acceso global a dicha instancia: el patrón Singleton nos permite acceder a un
        objeto desde cualquier parte del programa. No obstante, también evita que otro código sobreescriba esa instancia.

        *Todas las implementaciones del patrón Singleton tienen estos dos pasos en común:
        -Hacer privado el constructor por defecto para evitar que otros objetos utilicen el operador new con la clase
        Singleton.
        -Crear un método de creación estático que actúe como constructor. Por detras, este método invoca
        al constructor privado para crear un objeto y lo guarda en un campo estático. Las siguientes llamadas a este
        método devuelven el objeto almacenado en caché.

        *Usarlo en los siguientes casos:
         - Utiliza el patrón Singleton cuando una clase de tu programa tan solo deba tener una instancia disponible para
         todos los clientes; por ejemplo, un único objeto de base de datos compartido por distintas partes del programa.
         - Utiliza el patrón Singleton cuando necesites un control más estricto de las variables globales.

        */


        for (int i=0; i<9; i++){
            ConexionBDSingleton conexion= ConexionBDSingleton.getInstance();
            System.out.println("conexion = " + conexion);
        }

        ConexionBDSingleton con1= ConexionBDSingleton.getInstance();
        ConexionBDSingleton con2= ConexionBDSingleton.getInstance();
        System.out.println("con1==con2 :"+(con1==con2));

    }
}
