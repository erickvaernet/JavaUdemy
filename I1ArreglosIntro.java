import java.beans.IntrospectionException;

public class I1ArreglosIntro {
    public static void main(String[] args) {

        //¡¡¡¡¡
        //Se omite cosas básicas de arreglos por ya haberlos practicado en otros lenguajes, solo se hace un pequeño repaso
        //!!!!!

        //Los arreglos son tipos por referencia, un arreglo es una instancia de un objeto; hereda de object
        //Convencion: el nombre del arreglo tiene que estar en plural ya que representa una agrupacion de elementoas
        String [] palabras={"gol","hola"};
        String [] words={"gol","hola<"};
        String [] words2= new String[3];
        words[0]="asd";

        //Por defecto en tipos primitivos el valor que se asigna al reservar espacio es 0
        int[] nums= new int[3];

        for (int i=0; i<nums.length; i++){
            System.out.println("nums [" + i+"] = "+ nums[i]);
        }
        //En boolean es false en decimales como float o double es 0.0 etc,

        //Tambien podemos contener tipos por referencia no solo primitivos
        //En los cuales el valor por defecto es null y no 0
        String [] s= new String[3];
        for (int i=0; i<s.length; i++){
            System.out.println("s [" + i+"] ="+s[i]);
        }

        //En char por defecto es el Carater null \0
        char[] chs= new char[3];
        for (int i=0; i<chs.length; i++){
            System.out.println("chs [" + i+"]= "+chs[i]);
        }

        //asignamos el char null para comprobarlo
        chs[0]='\0';
        System.out.println("chs[0] = (\\0) = " + chs[0]);

        //Para objetos tambien sirve {}
        Product [] products= {new Product("Corn"),new Product("Potato"),new Product("Cheese")};

        for (int i =0; i<products.length;i++){
            System.out.println("procuts [" + i+"]= "+products[i].toString());
        }

        //Otra forma de recorrer los arreglos con for each donde cada elemento p toma el valor de un producto diferente por iteracion
        for (Product p:products) {
            System.out.println("p.toString() = " + p.toString());
        }
        /*
           Cuando uno se pasa del indice del arreglo al recorrerlo con un bucle for o si tratamos de acceder
           al arreglo con un indice mayor al limite, se lanza un error de tipo indexOutOfBoundException

         */
        int a= Integer.parseInt("3");

    }

}
class Product{

    String nameProduct;

    public Product(String nameProduct){
        this.nameProduct =nameProduct;
    }

    public String toString(){
        return this.nameProduct;
    }
}
