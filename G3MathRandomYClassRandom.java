import java.util.Random;

public class G3MathRandomYClassRandom {
    public static void main(String[] args) {

        //Generar núm aleatorio entre 0 y 1

        double rand= Math.random();
        //Para entre 0 y 100
        System.out.println(((int)Math.floor(rand*100)));

        //para cualquier valor de M a N; 
        //int valorEntero = Math.floor(Math.random()*(N-M+1)+M);  // Valor entre M y N, ambos incluidos.M menor que N 

        int valorEntero = (int)Math.floor(Math.random()*(203-200+1)+200);
        System.out.println("valorEntero = " + valorEntero);
        
        String [] colores={"Amarillo","Azul","Verde","Rojo","Violeta","Marron"};
        System.out.println("colores[(int)rand*6] = " + colores[(int)(rand*colores.length)]);// de 0 a 5

        //Si no queremos un valor entero sino double, la fórmula es sin el +1
        // double valorAleatorio = Math.random()*(N-M)+M;

        //Class Random

        Random randObj= new Random();

        int ran=randObj.nextInt();// rango 2 a la 32 positiv y negativ
        System.out.println("ran = " + ran);
        long ranl= randObj.nextLong();
        System.out.println("ranl = " + ranl);
        ran= randObj.nextInt(10);
        System.out.println("ran 10 = " + ran);// de 0 a 10

        //Entero
        int ran2 = 15+ randObj.nextInt(25-15+1); // De 15 a 25


    }
}
