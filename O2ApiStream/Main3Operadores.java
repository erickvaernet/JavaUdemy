package O2ApiStream;

import O2ApiStream.models.Usuario;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main3Operadores {
    public static void main(String[] args) {

        long countEmpty= Stream.of("Erick","Dani","Ian",""," ").filter(String::isEmpty).count();
        System.out.println("countEmpty = " + countEmpty);

        /*
        .distinct() (Intermedio)
         Devueve el stream sin elementos repetidos
         */
        Stream.of("Erick","Dani","Ian","Erick","erick")
                .distinct()
                .forEach(System.out::println);

        /*
        .reduce() (terminal)
         Reduce el stream a un solo resultado, recibe como parametros el valor inicial y como unir elementos
         */
        String resumen= Stream.of("Erick","Rick","Ian").reduce("Resumen:",(a,b)->a+", "+b);
        System.out.println(resumen);

        int reduce2= Stream.of(10,20,30,40).reduce(0,Integer::sum);
        System.out.println("reduce2 = " + reduce2);

        //Para crear un  stream con un rango de enteros podemos usar IntStream
        IntStream rango= IntStream.range(5,20);
        rango.forEach(System.out::println);

        IntStream rango2= IntStream.rangeClosed(5,20);//Invluye el ultimo numero a dif del anterior

        //Para obtener estadisticas
        IntSummaryStatistics estad=  rango2.summaryStatistics();
        System.out.println("cantiddad de nums:"+estad.getCount());
        System.out.println("promedio:"+estad.getAverage()); //media o promedio

        //------Otros operadores-------------
        System.out.println("-----------------------------");

        /*
        .mapToInt() (Itnermedio)
         Podemos usarlo para mapear objetos a enteros
         */
        IntStream flujoInt= Stream.of("Erick","Ian","Dani","Ivan").map(Usuario::new)
                .mapToInt((u)->u.toString().length());

        //flujoInt.forEach(System.out::println);
       // System.out.println("flujoIntSum: "+flujoInt.sum()); //no podria usar sum y max al mismo tiempo ya que cuentan como terminales

        //por lo que usamos summaryStatistics
        IntSummaryStatistics estadInt= flujoInt.summaryStatistics();
        System.out.println("MaxInt"+estadInt.getMax());
        System.out.println("SumInt"+estadInt.getSum());
        System.out.println("MinInt"+estadInt.getMin());

        /*
        .flatMap() (Intermedio)
         Parecido al map pero la diferencia es que .map produce un valor de salida por cada
        valor de entrada y .flatmap produce de cero a n valores de salida por cada valor de entrada.
        Se retorna un nuevo Stream.
        Podemos hacer que flatMap retorne un nuevo stream con los valores que coincidan
        Va retornando stream por cada elemento pero luego se aplana en un solo stream
         */
        Stream<Usuario> f5 = Stream.of("Pepe Garcia", "Pedro Carruthers", "Juan Lopez", "Pepe Muña")
                .flatMap((u) ->{
                    String name= u.split(" ")[0];
                    String lastName= u.split(" ")[1];
                    if(name.equals("Pepe")) {
                        return Stream.of(new Usuario(name,lastName));
                    }
                    else return  Stream.empty();
            }
        );
        System.out.println("stream con flatmap: "+f5.count());

        /*
        .generate()
         Otra forma de Crear Streams es con Generate() el cual recibe por parametro un suplier con el cual
         genera elementos para el stream infinitamente. Se usa .limit() para limitar la cantidad de elementos
         */
        Stream.generate(()->{return Arrays.asList(1,2,3,4);}).limit(3).forEach(System.out::println);



    }
}
