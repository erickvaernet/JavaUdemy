import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class I2ArreglosOrdenamiento {
    public static void main(String[] args) {

        //areglo de enteros desordenados
        //int []arr ={1,34,6,4,25,12,2,45,63,43,92,24,14,57,9,26};
        String []arr ={"aa","ee","bb","dd","cc"};

        //Para Ordenar un arreglo se puede usar  una clase helper de java llamada Arrays y su metodo .sort()
        Arrays.sort(arr);

         /* HELPERS
        En la programación, un helper es una forma de agrupar funciones de uso común, destinadas a servir de ayuda a
        otros procesos. Un Helper se compone de funciones genéricas que se encargan de realizar acciones complementarias
        aplicables a cualquier elemento de un sistema
         */

        System.out.print("arr={");
        for (String num:
             arr) {
            System.out.print(num+",");
        }
        System.out.print("\b\b\b");
        System.out.print(arr[arr.length-1]);
        System.out.println("}");

        //Para ordenar al reverso podemos usar Collections.reverse() pero este recibe como parametro una lista
        //Por lo tanto podemos usar el helper Arrays con el método asList() para convertir arreglo a lista
        //Solo funciona con con objetos como String

        Collections.reverse(Arrays.asList(arr));
        System.out.print("Arr (reverse)= {");
        for (String n:arr){
            System.out.print(n+",");
        }
        System.out.println("}");



        //----------------------- *Ordenamiento Burbuja -------------------------------------

        int aux;

        System.out.println("-----Algoritmo burbuja-------");
        int [] arr1={2,6,98,4,2,56,7,842,267,1,47,1,4};
        System.out.println("arr1(unsorted)="+Arrays.toString(arr1));

        int comprobaciones=0;
        int intercambios=0;

        //-de menor a mayor:
        //El primer bucle controla la cantidad e vueltas, el segudno los intercambios

        for (int i=0; i< arr1.length-1; i++){
            for (int j=0; j<arr1.length-1; j++){
                //si arr en j es mayor que arr en j+1 se intercambia
                if(arr1[j]>arr1[j+1]){
                    aux= arr1[j];
                    arr1[j]= arr1[j+1];
                    arr1[j+1]=aux;
                    intercambios++;
                }
                comprobaciones++;
            }
        }

        //Impresión del arreglo de enteros
        System.out.print("arr1(sorted)={");
        for (int n:arr1) {
            System.out.print(n+",");
        }
        System.out.println("\b}");
        System.out.println("Comprobaciones="+comprobaciones+"\n"
                +"Intercambios="+intercambios);


        //-para String
        String [] str1={"F","B","Z","A","U","S","E"};
        String aux2;
        for (int i=0; i< str1.length-1; i++){
            for (int j=0; j<str1.length-1; j++){
                //si arr en j es mayor que arr en j+1 se intercambia
                if(str1[j].compareTo(str1[j+1])>0){
                    aux2= str1[j];
                    str1[j]= str1[j+1];
                    str1[j+1]=aux2;
                }

            }
        }

        //Impresión del arreglo de Strings
        System.out.print("arr2(sorted)={");
        for (String n:str1) {
            System.out.print(n+",");
        }
        System.out.println("\b}");


    }
}
