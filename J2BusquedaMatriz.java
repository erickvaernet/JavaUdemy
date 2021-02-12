import java.util.Scanner;

public class J2BusquedaMatriz {
    public static void main(String[] args) {

        int[][] matriz ={
                {21,43,15,83},
                {11,24,32,14},
                {84,34,21,17}
        };

        //Impresion de Matriz
        System.out.println("Matriz=");
        for (int[] arr:matriz) {
            for (int n:arr) {
                System.out.print(n+",");
            }
            System.out.print("\b\n");
        }

        //Busqueda sin repeticiones
        System.out.println("Ingrese número a buscar:");
        int nb= new Scanner(System.in).nextInt();

        boolean encontrado=false;
        int i;
        int j=0;
        busqueda: for(i=0; i<matriz.length;i++){
            for (j=0; j<matriz[0].length; j++){
                if (nb==matriz[i][j]){
                    encontrado=true;
                    break busqueda;
                }
            }
        }
        if (encontrado) System.out.println("El número buscado se encuentra en la posicion ["+i+"]["+j+"]");
        else System.out.println("No se encontro el número indicado");




    }
}
