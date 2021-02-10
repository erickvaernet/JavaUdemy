import java.util.Arrays;
import java.util.Scanner;

public class I3ArreglosBusqueda {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        //Busqueda de elementos en los arreglos

        int[] arr= {5,7,2,1,6,8,24,6,11,6};

        //Busqueda lineal

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Ingrese numero a buscar: ");
        int nb= sc.nextInt();
        System.out.println("----Busqueda Secuencial----");
        int i=0;
        while(arr[i]!=nb)i++;
        if (i != arr.length-1) System.out.println("El numero se encuentra en la posicion "+i);
        else System.out.println("No se encontro el numero");


        //busqueda binaria para arreglos ordenados (de menor a mayor en este caso)

        Arrays.sort(arr);
        System.out.println("----Busqueda Binaria----");
        System.out.println(Arrays.toString(arr));
        int izq = 0;
        int der = arr.length - 1;
        int centro = (izq+der)/2;

        while ((arr[centro] != nb) && (izq < der)) {
            if (arr [centro] < nb) {
                izq = centro + 1 ;
            }
            else {
                der = centro - 1;
            }
            centro = (izq + der) / 2;
        }
        if (nb == arr [centro]) {
            System.out.println("El numero buscado se encuentra en la posicion: "+centro);
        }
        else {
            System.out.println("No se encontro el número buscado en el arreglo");
        }

    }

}
