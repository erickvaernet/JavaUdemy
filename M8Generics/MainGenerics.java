package M8Generics;

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

        Cliente[] clientArray={new Cliente("Erick","sadf"), new Cliente("ian","Vaerasf")};
        Integer [] integersArray= {1,3,56,7,1,6};

        List<Cliente> clientList= fromArrayToList(clientArray);

        List<Cliente> asd= fromArrayToList(clientArray,new String[]{"asd","asdljkl"});

        //generico limitado a obj qeu heredan de number
        printNumbers(integersArray);

        //Para tdo obj que herede de Ciente
        printClient( new ClientePremium("Erick","Vaernet"));

        //tambien podemos limitar a que ademas implemente la interfaz comparable como cliente premium
        List<ClientePremium> clientePremiumList= arrayToList(new ClientePremium[]{
                new ClientePremium("erick","as"), new ClientePremium("Mabel","asfgfd")});

        /*
        Comodines para listas List <? extends Cliente>
        Si usaramos List<Cliente> y le pasamos una lista de Clientes premium no funcionara, ya que list<CllientesPremium>
        NO es una clase hija de List<Cliente> son cosas distintas. Clliente premium si hereda de cliente pero Lista de
        clase cliente NO es una hija de la lista de clase cliente premium. Enm estos casos usamos el comodin para listas
         */
        printClients(clientList);
        printClients(clientePremiumList);


    }

    public static <T> List<T> fromArrayToList(T[] array){
        return Arrays.asList(array);
    }

    public static <T, G> List<T> fromArrayToList(T[] a, G[] b){
        for (G elem: b){
            System.out.println(elem);
        }
         return Arrays.asList(a);
    }

    //para limitar el alcance del generico lo hacemos con extends asi solo los elementos que hereden de esa clase podran
    //ser usadps en el generico
    public static <N extends Number> void printNumbers(N[] nums){
        for (N n:nums) {
            System.out.println( n);
        }
    }

    public static <C extends Cliente> void printClient(C cl){
        System.out.println(cl);
    }

    //En este caso limitamos a que tiene que implementar la interfaz comparable
    public static <C extends Cliente & Comparable > List<C> arrayToList(C[] cl){
       return Arrays.asList(cl);
    }

    public static void printClients(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);
    }
}
