package O1ExpLambda;

import O1ExpLambda.modelo.User;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Main1 {
    public static void main(String[] args) {

        /*

      *-Expresiones Lambda-*.
  wiki: es una subrutina definida que no está enlazada a un identificador

        * A partir de java8 en adelante, junto con programacion funcional y apiStream.
        Expresion lambda es implementar un método sin necesidad de implementar una clase, implementamos un método
        al vuelo, tambien se conoce como método flecha o funciones anónimas. No necesita de una clase para implementarse
        Una expresión lambda consiste en una lista separada por comas de los parámetros formales encerrados entre
        paréntesis, un símbolo de flecha (->) y un cuerpo. Los tipos de datos de los parámetros siempre se pueden
        omitir, al igual que los paréntesis si solo hay un parámetro.
        Las expresiones Lambda se convierten en "interfaces funcionales" (definidas como interfaces que contienen solo
        un método abstracto además de uno o más métodos predeterminados o estáticos.
        Por detras de escena se define como una interfaz funcional

        */

        //Consumidor es una Interfaz funcional, que nos permite pasarle un parametro y hacer algo con el sin retornar nada
        Consumer<Date> consumidor= fecha ->{
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println(formatter.format(fecha));
        };

        consumidor.accept(new Date());

        //Exite el BiConsumer que nos permite trabajar con 2 Parametros en vez de uno
        BiConsumer<String,Integer> biConsumer= (name,age)->System.out.println("Nombre:"+name+". Edad:"+age);

        biConsumer.accept("Erick",25);

        //Uso de método de referencia
        Consumer<String> consumer= System.out::println;
        consumer.accept("Hola");

        //Se usan mucho en Apis propias de java como apiStream y en for each.
        List<String> lista= Arrays.asList("Erick","Adriel","Vaernet");
        lista.forEach(consumer);//recibe como parametro un Consumer

        //Tambien podemos simpleficar con método de referencia cuando tenemos 2 parametros
        User usuario= new User();
        BiConsumer<User,String> asignarNombre = User::setName;

        asignarNombre.accept(usuario,"Erick Vaernet");
        System.out.println("Usuario:"+usuario.getName());

        //Uso de Suplier (exp Landa). No recibe argumento y devuelve un valor entr <> el valor que devuelve
        Supplier<String> holaMundo = ()->"Hola Mundo! (LambdaSuppliet)";
        System.out.println(holaMundo.get());

        //simplificacion de suplier y new con métodos de referencia
        Supplier<User> createUser= User::new;
        User user1= createUser.get();
        asignarNombre.accept(user1,"Jose");
        System.out.println("Usuario1:"+user1.getName());






    }
}
