package O1ExpLambda.intFuncProp;

import java.util.function.BiFunction;

public class Calculadora {

    public double computar (double a, double b, Aritmetica lambda){
        return  lambda.operacion(a,b);
    }

    //Se Puede reemplazar con BiFunction
    public double computarBF (double a, double b, BiFunction<Double,Double,Double> bf){
        return  bf.apply(a,b);
    }
}
