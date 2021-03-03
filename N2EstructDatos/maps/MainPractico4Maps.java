package N2EstructDatos.maps;

import java.util.*;

public class MainPractico4Maps {
    public static void main(String[] args) {

        //No extiende de Collections pero permite almacenar valores, a modo de clave-valor

        //Se declara en el operador rombo, el tipo de la clave y del valor, no necesariamente tienen que ser
        //Strings, sino que pueden ser de cualquier tipo de Objeto
        Map<String,String> persona= new HashMap<>();

        /*
        Los hashSets por detras trabajan con un HashMaps por detras de escena donde usan como clave el valor
        hash code y como valor el objeto en si, de esa manera evitan repetidos. Usan el hashcode y el
        método equals para ver si son iguales. Primero el hashCode y despues el equals
         */
        persona.put("nombre","Erick");
        persona.put("apellido","Vaernet");
        //NO permite repetidos,deja el ultimo valor, por ejempplo en apellido quedara vaernet2
        persona.put("apellido","Vaernet2");
        persona.put(null,"Permite null pero solo uno");

        System.out.println("persona = " + persona);

        //Para obtener un valor usamos get
        System.out.println("Nombre->"+persona.get("nombre"));

        //para eliminar todos los valores asociativos se usa el .clear()

        //Para saber si existe una clave e el hashmap
        System.out.println("¿Existe apellido como clave? = "+persona.containsKey("apellido"));

        //Para saber si existe un valor en el hashmap:
        System.out.println("¿Existe el valor Vaernet? = "+persona.containsValue("Vaernet"));

        //Se usa .isEmpty() para saber si esta vacio

        //Podemos obtener un set de elementos a partir de las llaves del hashmap o de valores
        Set<String> keySet= persona.keySet();
        Collection<String> valueSet= persona.values();
        System.out.println("Claves disponibles: ");
        keySet.forEach(System.out::println);
        System.out.println("Valores:");
        valueSet.forEach(System.out::println);

        //Si se modifican o agregan valores, se vera reflejado en los sets de clave valor
        persona.put("mail","erickadrielnet@gmail.com");

        System.out.println("---Se agrego mail-----");
        System.out.println("Claves disponibles: ");
        keySet.forEach(System.out::println);
        System.out.println("Valores:");
        valueSet.forEach(System.out::println);

        /*Reccordatorio:  podemos crear objetos a partir de interfaces, por ejemplo, value() devuelve un
        objeto de tipo Colletion (Interfaz), no sabemos como implementan los métodos de collection el obj
        que se devuelve, pero sabemos que tiene los métodos de la interfaz. Asi como tambien podemos crear
        objetos al vuelo a partir de la intefaz (escribir Collection<String> col= new Coll.. y el ide
        automáticamente nos creara los métodos necesarios para la interfaz, la implementacion quedara a
        nuestro crtério, lo tendremos que hacer en el momento que creamos el objeto
         */





    }
}
