public class G1ClaseMath {
    public static void main(String[] args) {

        //Calcular valor absoluto de un numero entero positivo o negativo
        int value= Math.abs(-34);
        System.out.println("value = " + value);
        int value2= Math.abs(34);
        System.out.println("value2 = " + value2);
        System.out.println("value2=value : " + (value2==value2));
        System.out.println("-------------------------------------------------------");

        //valor max y min entre 2 números
        value=10;
        System.out.println("value2 = " + value2);
        value2=1;
        System.out.println("value2 = " + value2);
        int max= Math.max(value,value2);
        System.out.println("max = " + max);
        int min = Math.min(value,value2);
        System.out.println("min = " + min);
        System.out.println("-------------------------------------------------------");

        //Para redondear ceil para arriba y floor para abajo
        double value3 = 34.5;
        System.out.println("value3 = " + value3);
        System.out.println("Math.ceil(value3) = " + Math.ceil(value3));
        System.out.println("Math.floor(value3) = " + Math.floor(value3));
        System.out.println("-------------------------------------------------------");

        //Exponencial, euler elevado a 3
        System.out.println(Math.exp(3));

        //Logaritmo natural de 10
        System.out.println( Math.log(10));

        //Potencia, 10 a la 2
        System.out.println( Math.pow(10,2));


    }
}
