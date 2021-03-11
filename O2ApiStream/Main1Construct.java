package O2ApiStream;

import O2ApiStream.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main1Construct {
    public static void main(String[] args) {

        /*
        ApiStrem
        Combinación entre Iterator y programación funcional, para ilementar flujo de datos, podemos definir
        como una secuencia de elementos que provienen desde una fuente de datos, típicamente desde una
        lista o una colección de java (Set,List,etc) o arreglo. Idea de realizar operaciones que se van
        aplicando a esos datos o estructuras.
        Los Streams no son estructuras de datos, estos transmiten esos elementos desde una fuente como una
        tubería.
        -Nos permiten crear flujos de datos continuos para procesar secuencias de elementos.
        -Los operadores reducen notablemete las tareas de transformaciones.
        -Transforma y compone flujos con los operadores maps, filte, concat, distrinct(),flatmap,sorted,foresch, reduce,etc
        -Pueden ser creados desde listas, arreglos, rangos, etc.
        -Son INMUTABLES
        -Concurrencica hecho fácil
         */

        //Podemos crear un flujo mediante Stream.of()
        Stream<String> flujo= Stream.of("Rick","Erick","Ivan","Ian","Daniela");

        //O podemos crearlo con un array o coleccion y mediante Arrays.stream()
        String[] palabras= {"Ian","Daniela","Erick","Ivan","Rick"};
        Stream<String> flujo2= Arrays.stream(palabras);

        //O mediante el Builder de Stream
        Stream<String> flujo3 = Stream.<String>builder()
                .add("Erick")
                .add("Rick")
                .add("Pato")
                .build();

        //Tambien mediante un obj de tipo Colection
        List<String> lista = new ArrayList<>();
        lista.add("Rass");
        lista.add("Erick");
        lista.add("Rick");
        lista.add("Pato");
        //Stream<String> flujo4=lista.stream();
        System.out.println("-------f4---------");
        lista.stream().forEach(System.out::println);

        /*Existen dos tipos de operadores, los intermedios y los finales. Los intermedio son para realizar
        transformaciones como map,peek,filter, y los finales para realizar acciones (imprimir con foreach)
         o convertir flujo a otro tipo, como flujo a list, ejemplos: forEach() collect()
         */

        //El forEach recibe un consumer
        System.out.println("-------f1---------");
        flujo.forEach(System.out::println);

        System.out.println("-------f2Map---------");
        /*
        -------------------------------**-Map y Peek-**-----------------------------------------------------------
         Map: para transformaciones (intermedio), como parametro recibe una interfaz Function
         Peek: Recibe un Consumer como parametro

        */

        //Stream <String> f2map =flujo2.map(String::toUpperCase);
        //f2map.forEach(System.out::println);
        flujo2.map(String::toUpperCase).forEach(System.out::println);

        //Es neccesario un operador terminal par ejecutar el stream, sino no se ejecuta Ej:
        Stream <String> f2=Stream.of("asd","dsa","asd").peek(System.out::println).map(String::toUpperCase);
        System.out.println("---");
        //f2.forEach(System.out::println); //cuando se usa el operador terminal foreach recien se aplica

        //Para pasar a lista (Terminal)
        List<String> listOfStream =f2.collect(Collectors.toList());
        System.out.println("-----Lista a partir de stream-----");
        listOfStream.forEach(System.out::println);

        //Stream a otros flujoos de dato
        Stream<String> f3= Stream.of("Erick","Rick","Gisela","Graciela");

        //f3.map(Usuario::new).map(Usuario::getName).forEach(System.out::println);
        /*
        List<Usuario> listUsuarios= new ArrayList<>();
        f3.forEach( (usu)->listUsuarios.add(new Usuario(usu)));
        listUsuarios.forEach((u)->System.out.println(u.getName()));
         */
        System.out.println("____Lista2____");
        List<Usuario> listUsuarios= f3.map(Usuario::new).collect(Collectors.toList());
        listUsuarios.forEach((u)->System.out.println(u.getName()));

        /*
        -----------------------------------*-Filter-*----------------------------------------------
        Filter: Reibe un Predicate como parametro. Convierte el flujo en otro con los datos que cumplan
        con el Predicate
         */

        System.out.println("----l3-----");
        Stream<Usuario> f5 = Stream.of("Pepe Garcia","Pedro Carruthers","Juan Lopez","Pepe Muña")
                .map((s)->new Usuario(s.split(" ")[0],s.split(" ")[1]))
                .filter((u)->u.getName().equals("Pepe"))
                .peek(System.out::println);

        List<Usuario> listU= f5.collect(Collectors.toList());
        listU.forEach(System.out::println);


    }

}
