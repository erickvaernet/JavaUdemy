import javax.naming.InsufficientResourcesException;
import javax.swing.*;
import java.util.Scanner;

public class A1Principal {
    public static void main (String [] args) {

        String entrada = JOptionPane.showInputDialog("Ingrese un entero:");
        int numeroDecimal=0;
        try {
            numeroDecimal= Integer.parseInt(entrada);
        }catch (NumberFormatException e){
            System.out.println("Error: " + e.getClass()+ "\nCause: "+e.getMessage()+"\nSolution:Use a number as an input");
            main(args);
            System.exit(0);
        }
        String nBinario= Integer.toBinaryString(numeroDecimal);
        String nHexa= Integer.toHexString(numeroDecimal);
        String nOcta=Integer.toOctalString(numeroDecimal);

        String mensaje="Numero decimal:"+numeroDecimal+
                "\nNumero en binario:"+nBinario+
                "\nNumero en Octal:"+nOcta+
                "\nNumero en Hexadecimal:"+nHexa;

        JOptionPane.showMessageDialog(null,mensaje);
    }
}