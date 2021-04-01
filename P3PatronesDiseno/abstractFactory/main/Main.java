package P3PatronesDiseno.abstractFactory.main;

import P3PatronesDiseno.abstractFactory.PizzaProduct;
import P3PatronesDiseno.abstractFactory.PizzeriaCaliforniaFactory;
import P3PatronesDiseno.abstractFactory.PizzeriaNewYorkFactory;
import P3PatronesDiseno.abstractFactory.PizzeriaZonaAbstractFactory;

public class Main {
    public static void main(String[] args) {

        /*
         *AbstractFactory: Para crear familias de objetos que estan relacionados.
        En este patron se divide basicamente en "productos", prodA(interface),prodB(interface), y "fabricas abstractas"
        (interface o clase abstracta). Cuando tenemos una misma lógica pero mostramos de forma diferente, por ej,
        segun sist Op. Productos como familias de objetos que los podemos implementar d dif maneras
        Nos Permite producir familias de objetos relacionados sin especificar sus clases concretas

        * Problema: Cuando tenemos familias de productos relacionados y variantes de estos

        *Solucion Lo primero que sugiere el patrón Abstract Factory es que declaremos de forma explícita interfaces para
        cada producto diferente de la familia de productos (por ejemplo, silla, sofá o mesilla). Después podemos hacer
        que todas las variantes de los productos sigan esas interfaces.
         El siguiente paso consiste en declarar la Fábrica abstracta: una interfaz con una lista de métodos de creación
        para todos los productos que son parte de la familia de productos (por ejemplo, crearSilla, crearSofá y crearMesilla).
        Para cada variante de una familia de productos, creamos una clase de fábrica independiente basada en la interfaz
        FábricaAbstracta. Una fábrica es una clase que devuelve productos de un tipo particular. Por ejemplo, la
        FábricadeMueblesModernos sólo puede crear objetos de SillaModerna, SofáModerno y MesillaModerna.El código
        cliente tiene que funcionar con fábricas y productos a través de sus respectivas interfaces abstractas. Esto nos
        permite cambiar el tipo de fábrica que pasamos al código cliente, así como la variante del producto que recibe
        el código cliente, sin descomponer el propio código cliente.

        * Utiliza el patrón Abstract Factory cuando tu código deba funcionar con varias familias de productos
        relacionados, pero no desees que dependa de las clases concretas de esos productos, ya que puede ser que no los
        conozcas de antemano o sencillamente quieras permitir una futura extensibilidad.

        * Implementacion:
        Mapea una matriz de distintos tipos de productos frente a variantes de dichos productos.
        Declara interfaces abstractas de producto para todos los tipos de productos. Después haz que todas las clases
        concretas de productos implementen esas interfaces.
        Declara la interfaz de la fábrica abstracta con un grupo de métodos de creación para todos los productos abstractos.
        Implementa un grupo de clases concretas de fábrica, una por cada variante de producto.
        Crea un código de inicialización de la fábrica en algún punto de la aplicación. Deberá instanciar una de las
        clases concretas de la fábrica, dependiendo de la configuración de la aplicación o del entorno actual. Pasa este
        objeto de fábrica a todas las clases que construyen productos.
        Explora el código y encuentra todas las llamadas directas a constructores de producto. Sustitúyelas por llamadas
        al método de creación adecuado dentro del objeto de fábrica.

         */

        //Ejemplo: Fabricas de diferentes zonas con diferentes tipos de pizza
        PizzeriaZonaAbstractFactory ny= new PizzeriaNewYorkFactory();
        PizzeriaZonaAbstractFactory california= new PizzeriaCaliforniaFactory();

        PizzaProduct pizza = california.oredenarPizza("vegetariana");
        System.out.println("Juan ordena la pizza:"+ pizza.getNombre());
        System.out.println("-----------------------------------------");

        pizza = ny.oredenarPizza("vegetariana");
        System.out.println("Pedro ordena la pizza:"+ pizza.getNombre());
        System.out.println("-----------------------------------------");

        pizza = ny.oredenarPizza("peperoni");
        System.out.println("Pablo ordena la pizza:"+ pizza.toString());
    }

}
