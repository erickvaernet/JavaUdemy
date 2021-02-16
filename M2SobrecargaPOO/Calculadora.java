package M2SobrecargaPOO;

public class Calculadora {

    private Calculadora() {
    }

    public static int sumar (int a, int b){
        return a+b;
    }

    public static float sumar (float a, float b){
        return a+b;
    }

    public static float sumar (int a, float b){
        return a+b;
    }

    public static float sumar (float a, int b){
        return a+b;
    }

    public static double sumar(double a, double b){
        return a+b;
    }

    public static int sumar (String a, String b){
        return Integer.parseInt(a)+Integer.parseInt(b);
    }

    public static int sumar (int a, int b, int c){
        return a+b+c;
    }

    //Para crear método con argumentos variables:
    public static int sumarArgs (int... argumentos){
        int total=0;
        //Se puede acceder a los args tmb como arreglo ej: return argumentos[0];
        for (int arg:argumentos) {
            total+= arg;
        }
        return  total;
    }

    //Para crear método con argumentos variables y ademas un flotante:
    public static float sumarArgs (float flotante,int... argumentos){
        float total=flotante;// asignamos el flotante y vamos sumando los enteros
        for (int arg:argumentos) {
            total+= arg;
        }
        return  total;
    }




}
