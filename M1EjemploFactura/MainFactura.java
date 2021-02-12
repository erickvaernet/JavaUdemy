package M1EjemploFactura;
import  M1EjemploFactura.modelo.*;

import java.util.Scanner;

public class MainFactura {
    public static void main(String[] args) {

        Cliente c1= new Cliente("Erick",12415);

        Scanner sc= new Scanner(System.in);

        System.out.println("Ingrese una descripcion de la factura:");
        Factura fact1= new Factura(sc.nextLine(),c1);


        int cantidad=0;
        System.out.println("Ingrese la cantidad de productos a cargar (El máximo es "+Factura.MAX_ITEMS+") :");
        cantidad= sc.nextInt();

        //Control para la cántidad de productos
        while (cantidad>Factura.MAX_ITEMS){
            System.out.println("El máximo de items es 10, vuelva a ingresarla cantidad de productos:");
            cantidad= sc.nextInt();
        }
        sc.nextLine();

        int cantidadProducto=0;
        int i=0;
        while (i<cantidad){
            Producto producto=new Producto( );

            System.out.println("Ingrese el producto Nº"+producto.getId()+":");
            producto.setNombre(sc.nextLine());

            System.out.println("Ingrese el Precio del producto:");
            producto.setPrecio(sc.nextDouble());

            System.out.println("Ingrese la Cantidad del producto:");
            fact1.addItemFactura(new ItemFactura(sc.nextInt(),producto));

            System.out.println();
            sc.nextLine();
            i++;
        }

        //System.out.println(fact1.generarDetalle());
        System.out.println(fact1);


    }
}
