package M2SobrescrituraPOO;

public class Main {
    public static void main(String[] args) {

        Calculadora cal= new Calculadora();

        System.out.println("cal.sumar int-int = " + cal.sumar(3,3));

        //Alaramos con f o F al final del numero que el tipo de dato es flotante (obligatorio);
        System.out.println("cal.sumar float-float = " + cal.sumar(3F,3.3F));
        System.out.println("cal.sumar int-float = " + cal.sumar(3,4F));
        System.out.println("cal.sumar float-int = " + cal.sumar(3F,4));

        //Por defecto al agregar el . por ejemplo 4.0 o 3.5, el dato es de tipo double
        System.out.println("cal.sumar double = " + cal.sumar(4.0,3.0));// Es lo mismo 3D o 4D

        System.out.println("cal.sumar Strings = " + cal.sumar("3","6"));
        System.out.println("cal.sumar(4,2,6) = " + cal.sumar(4,2,6));

        //Para suma de tipo Long no existe un método péro entrara como float (con L o l indicamos de tipo long)
        System.out.println("cal.sumar(3L,2L) = " + cal.sumar(3L,2L));

        /*
        Por más que el Long sea un dato de 64 bits y el float sea de 32bits, el float tiene la capacidad
        de almacenar coon notación científica, por lo tanto puede almacenar datos grandes. En double
        tambien se usa notación cientifica pero es de mayor presicion y de mayor capacidad(64bits).
        Si no existiera el método con argumentos de tipo float-float, se llamaria al de double-double
        para almacenar el long. T0do esto en caso de no existir un método long-long
         */

        //En el siguiente caso se suman como 2 int:
        System.out.println("cal.sumar(20,'@') int-int = " + cal.sumar(20,'@'));
        /* En este caso, @ tiene un valor entero (64) en la tabla unicode. Por lo que se toma ese valor
        para la suma, por ello se toma como suma de enteros
         */

        //Argumentos Variables, Se puede poner un número de argumentos variables,Ej:







    }
}
