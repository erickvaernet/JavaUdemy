import javax.swing.*;

public class D2EtiquetasBucle {
    public static void main(String[] args) {

        //para hacer referencia al for padre dentro del hijo
        /*
        bucle1 : for (int i=0;i<6; i++){
            for (int j=0;j<6; j++){
                if(i==2) break bucle1;//continue sirve tambien
                System.out.println(i+"-"+j);
            }
        }
         */

        //ejemplo de uso de etiquetas para buscar palabras en frase

        String frase= JOptionPane.showInputDialog("Ingrese una frase: ");
        String palabra =JOptionPane.showInputDialog("Ingrese la palabra a buscar en la frase");

        int largoFrase= frase.length();
        int largoPalabra= palabra.length();

        int repeticiones=0;
        Busqueda: for (int i=0; i<largoFrase; i++){

            System.out.println(i+"primero");
            int k=i;
            for (int j=0; j<largoPalabra; j++){
                if( frase.charAt(k++) !=palabra.charAt(j)  ){
                    continue Busqueda;
                }
            }
            repeticiones++;
            i+=(largoPalabra-1);//lo hace mas rápido asi no recorre la palabra ya encontrada

        }

        System.out.println("Se encontraron "+repeticiones+" cantidad de veces la palabra '"+palabra+"' en la frase:");
        System.out.println(frase);


    }
}
