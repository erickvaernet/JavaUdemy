package O3Optional;

import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        /*Optional
         nos permite representar un valor que estee presente o ausente permitiendonos evitar
         la excepcion nullPointerException.
         Es un contenedor de un solo objeto
         Al no ser checkeada puede pasar silenciosa
         ventajas no se necesita controlar si es null un valor, con el optional mismo lo controlamos
         */

        //COSTRUCTOR

        String s1= "Andres";
        //***Construir optional, puede ser con Optional.empty()
        Optional<String> opt1 = Optional.empty();

        //***Se puede contruir con .of(), pero este no acepta nulos (Usarla cuando estamos seguros de que no hay null)
        Optional<String> opt2 = Optional.of(s1);

        //-Se usa isPresent para saber si contiene un objeto o no (null)
        System.out.println("opt2 = " + opt2);
        System.out.println("opt2.isPresent() = " + opt2.isPresent());

        //-Con .get() se obtiene el valor del optional
        if(opt2.isPresent()){
            System.out.println("hola " + opt2.get());
        }

        //-Lo anterior podemos simplificarlo con el método ifPresent(), si esta presente hacer algo,(Recibe un Consumer)
        opt2.ifPresent(value-> System.out.println(value.toUpperCase()));
        
        //***En caso de que pueda ser nulo un dato  usamos ofNullable()
        s1=null;
        Optional<String> opt3= Optional.ofNullable(s1);
        System.out.println("opt3 = " + opt3);
        System.out.println("opt3.isPresent() = " + opt3.isPresent());
        System.out.println("opt3.isEmpty() = " + opt3.isEmpty());

        //Este solo disponible desde JDK9, recibe un Consumer y para el else un Runnable

        opt3.ifPresentOrElse(System.out::println,()-> System.out.println("opt3 Esta vacio"));


    }
}
