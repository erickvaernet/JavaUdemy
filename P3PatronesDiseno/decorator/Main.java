package P3PatronesDiseno.decorator;

import P3PatronesDiseno.decorator.decorador.MayusculaDecorador;
import P3PatronesDiseno.decorator.decorador.ReemplazarEspaciosDecorador;
import P3PatronesDiseno.decorator.decorador.SubrayadoDecordor;

public class Main {
    public static void main(String[] args) {
        /*
        Decorator: Tiene la finalidad de agregar funcionalidad dinamica al objeto pero sin utilizar la herencia.

        *Cuando Usarlo:
         -Utiliza el patrón Decorator cuando necesites asignar funcionalidades adicionales a objetos durante el tiempo
         de ejecución sin descomponer el código que utiliza esos objetos.
         El patrón Decorator te permite estructurar tu lógica de negocio en capas, crear un decorador para cada capa y
         componer objetos con varias combinaciones de esta lógica, durante el tiempo de ejecución. El código cliente
         puede tratar a todos estos objetos de la misma forma, ya que todos siguen una interfaz común.
         - Utiliza el patrón cuando resulte extraño o no sea posible extender el comportamiento de un objeto utilizando
         la herencia.
         Muchos lenguajes de programación cuentan con la palabra clave final que puede utilizarse para evitar que una
         clase siga extendiéndose. Para una clase final, la única forma de reutilizar el comportamiento existente será
         envolver la clase con tu propio wrapper, utilizando el patrón Decorator.

         *Implementacion:
         -Asegúrate de que tu dominio de negocio puede representarse como un componente primario con varias capas
         opcionales encima.
         -Decide qué métodos son comunes al componente primario y las capas opcionales. Crea una interfaz de componente y
         declara esos métodos en ella.
         -Crea una clase concreta de componente y define en ella el comportamiento base.
         -Crea una clase base decoradora. Debe tener un campo para almacenar una referencia a un objeto envuelto. El
         campo debe declararse con el tipo de interfaz de componente para permitir la vinculación a componentes
         concretos, así como a decoradores. La clase decoradora base debe delegar todas las operaciones al objeto
         envuelto.
         -Asegúrate de que todas las clases implementan la interfaz de componente.
         -Crea decoradores concretos extendiéndolos a partir de la decoradora base. Un decorador concreto debe ejecutar
         su comportamiento antes o después de la llamada al método padre (que siempre delega al objeto envuelto).
         -El código cliente debe ser responsable de crear decoradores y componerlos del modo que el cliente necesite.
         */

        Formateable texto= new Texto("Hola que tal");
        MayusculaDecorador mayus= new MayusculaDecorador(texto);
        SubrayadoDecordor sub = new SubrayadoDecordor(mayus);
        ReemplazarEspaciosDecorador textoreem= new ReemplazarEspaciosDecorador(sub);
        System.out.println(textoreem.darFormato());




    }
}
