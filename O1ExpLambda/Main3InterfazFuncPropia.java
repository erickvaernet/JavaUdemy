package O1ExpLambda;

import O1ExpLambda.intFuncProp.Aritmetica;
import O1ExpLambda.intFuncProp.Calculadora;

public class Main3InterfazFuncPropia {
    public static void main(String[] args) {

        /*Por lo general con los métodos dados basta, pero damos como ejemplo la creacion de una interfaz
        Funcional, para ver como implementarla*/

        Aritmetica suma =(a,b)->a+b;
        Aritmetica resta =(a,b)->a-b;

        Calculadora calculadora= new Calculadora();

        System.out.println("calculadora.computar(10,5,suma); = " + calculadora.computar(10,5,suma));
        System.out.println("calculadora.computar(10,5,resta) = " + calculadora.computar(10,5,resta));
        System.out.println("calculadora.computar(10,5,lambda(Multiplicar) = "
                + calculadora.computar(10,5,(a,b)->a*b));

        //Pero se podria hacer con bifunction
        Double conBF=calculadora.computarBF(10,5,(a,b)->a*b);
        System.out.println("conBF = " + conBF);


    }
}
