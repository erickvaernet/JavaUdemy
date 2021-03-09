package O1ExpLambda;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main2FunctionyPredicate {

    public static void main(String[] args) {
        /*
        Function es una exp lambda que recibe un argumento como parametro y devuelve un valor, el tipo del parametro y
         del valor retornado se declaran en el operadoor <> como <tipoParametro,tipoRetorno>
         */

        Function<String, String> f1= parametro ->"Hola "+parametro;

        String resultado= f1.apply("Erick");
        System.out.println("resultado = " + resultado);

        //BiFunction es similar, pero recibe 2 paramteros y devuelve un valor
        BiFunction<String,String,String> concat= (s1,s2)->s1.toUpperCase().concat(s2.toUpperCase());
        concat.apply("Erick ","Vaernet");

        //Referencia de método
        Function <String,String> f2=String::toUpperCase;
        System.out.println(f2.apply("hola"));

        //Lo que se recibe or argumento se usa para invocar algun método, en este caso String
        BiFunction<String,String,Integer> bf2= String::compareTo;
        System.out.println(bf2.apply("erick","ian"));
        BiFunction<String,String,String> bf3= String::concat;
        System.out.println(bf2.apply("erick","ian"));

        //Predicate





    }

}
