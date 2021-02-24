package M8Generics;

import M8Generics.genericClass.*;
import M8Generics.modelo.Cliente;
import M8Generics.modelo.ClientePremium;

import java.util.Arrays;
import java.util.List;

public class MainGenerics {

    public static void main(String[] args) {

        /*Tipos Genericos, las carpetas modelo y repositorio se copiaron de la anterior.
        Los genericos nos permiten trabajar con cualquier tipo de dato que herede de Object en los métodos
        Existen los bounded generics o genericos limitados que nos permiten limitar a cierto grupo de objetos
        que heredan de una superclase o que implementan una interfaz
         */

        Cliente[] clientArray = {new Cliente("Erick", "sadf"), new Cliente("ian", "Vaerasf")};
        Integer[] integersArray = {1, 3, 56, 7, 1, 6};

        List<Cliente> clientList = fromArrayToList(clientArray);

        List<Cliente> asd = fromArrayToList(clientArray, new String[]{"asd", "asdljkl"});

        //generico limitado a obj qeu heredan de number
        printNumbers(integersArray);

        //Para tdo obj que herede de Ciente
        printClient(new ClientePremium("Erick", "Vaernet"));

        //tambien podemos limitar a que ademas implemente la interfaz comparable como cliente premium
        List<ClientePremium> clientePremiumList = arrayToList(new ClientePremium[]{
                new ClientePremium("erick", "as"), new ClientePremium("Mabel", "asfgfd")});

        /*
        Comodines para listas List <? extends Cliente>
        Si usaramos List<Cliente> y le pasamos una lista de Clientes premium no funcionara, ya que list<CllientesPremium>
        NO es una clase hija de List<Cliente> son cosas distintas. Clliente premium si hereda de cliente pero Lista de
        clase cliente NO es una hija de la lista de clase cliente premium. Enm estos casos usamos el comodin para listas
         */
        printClients(clientList);
        printClients(clientePremiumList);

        //puede lograrse con varios arg.

        System.out.println("Máximo entre 6, 23, 72: " + max(6, 23, 72));
        System.out.println("Máximo entre aba, bab, ca: " + max("aba", "bab", "ca"));

        //genericos tambien nos ayudan para evitar usa Object como tipo en los argumentos:
        Camion camion= new Camion(3);
        camion.add(new Animal("Rick","Cebra"));
        camion.add(new Animal("Koil","Cebra"));
        camion.add(new Animal("Koli","Cebra"));


        //tenemos que realizar el cast de object a Animal, si usaramos genericos no seria necesario
        for (Object o:camion) {
            Animal anim= (Animal) o;
            System.out.println(anim.getNombre()+" es un/a "+anim.getTipo());
        }

        /*
        //Podriamos Castear mal los tipos, por ejemplo a continuación casteamos a automovil cuando en realidad los
        //Objetos que van dentro del camion son del tipo Animal
        for (Object o:camion) {
            Automovil anim= (Automovil) o;
            System.out.println(anim.getNombre()+" es un/a "+anim.getTipo());
        }
         */

        /*Lo anterior era con la Clase Camion cuando no usaba tipos genéricos sino Object. Ahora haremos uso de CamionGenerico
        Indicamos entre <> el tipo de dato que va a contener camion*/
        CamionGenerico<Animal> camionG= new CamionGenerico<>(3); //podemos poner CamionGenerico<Animal>(3) pero es redundante
        camion.add(new Animal("Rick","Cebra"));
        camion.add(new Animal("Koil","Cebra"));
        camion.add(new Animal("Koli","Cebra"));


        System.out.println("==========----CamionG------===========");
        //No se necesita del cast de Object a Animal
        for (Animal a:camionG){
            System.out.println(a.getNombre()+" es un "+a.getTipo());
        }

        System.out.println("==========----CamionG y func imprimirContenido()------===========");
        //Función capaz de imprimir el contenido del camion, ya sea animales o automoviles o maquinaria
        imprimirContenido(camionG);


    }

    public static <T> List<T> fromArrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static <T, G> List<T> fromArrayToList(T[] a, G[] b) {
        for (G elem : b) {
            System.out.println(elem);
        }
        return Arrays.asList(a);
    }

    //para limitar el alcance del generico lo hacemos con extends asi solo los elementos que hereden de esa clase podran
    //ser usadps en el generico
    public static <N extends Number> void printNumbers(N[] nums) {
        for (N n : nums) {
            System.out.println(n);
        }
    }

    public static <C extends Cliente> void printClient(C cl) {
        System.out.println(cl);
    }

    //En este caso limitamos a que tiene que implementar la interfaz comparable
    public static <C extends Cliente & Comparable> List<C> arrayToList(C[] cl) {
        return Arrays.asList(cl);
    }

    public static void printClients(List<? extends Cliente> clientes) {
        clientes.forEach(System.out::println);
    }

    //extends tambien para interfaces
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static <T> void imprimirContenido(CamionGenerico<T> camiong){
        for (T a:camiong){
            if (a instanceof Animal){//Es necesario comprobar que sea instancia de Animal y realizar el cast a animal
                //ya que solo Animal tiene con seguridad los  métodos getNombre y getTipo,sino no se podria
                System.out.println(((Animal)a).getNombre()+" es un "+((Animal)a).getTipo());
            }
            else if (a instanceof Automovil){
                System.out.println("Este es un Automovil de marca"+((Automovil)a).getMarca());
            }
            else if (a instanceof Maquinaria){
                System.out.println("Esta es una maquinarioa de tipo "+((Maquinaria)a).getTipo());
            }
        }
    }
}
