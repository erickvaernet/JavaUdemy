package O2ApiStream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main3Operadores {
    public static void main(String[] args) {

        long countEmpty= Stream.of("Erick","Dani","Ian",""," ").filter(String::isEmpty).count();
        System.out.println("countEmpty = " + countEmpty);

        //distinct devueve el stream sin elementos repetidos
        Stream.of("Erick","Dani","Ian","Erick","erick")
                .distinct()
                .forEach(System.out::println);

        //Reduce() (terminal) reduce el stream a un solo resultado, recibe como parametros el valor inicial y como unir elementos
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



    }
}
