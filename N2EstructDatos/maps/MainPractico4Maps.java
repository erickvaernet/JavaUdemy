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

        System.out.println("-----Entry set, par (Clave-Valor)-------");
        for (Map.Entry<String,String> par:persona.entrySet()){
            System.out.println(par.getKey()+"=>"+par.getValue());
        }

        System.out.println("------Con for each de llave ------");
        for (String clave: persona.keySet()){
            System.out.println(clave+"="+persona.get(clave));
        }

        System.out.println("-----Con Lambda func. (java 8)----");
        persona.forEach((clave,valor)->System.out.println(clave+"->"+valor));


        /*Reccordatorio:  podemos crear objetos a partir de interfaces, por ejemplo, value() devuelve un
        objeto de tipo Colletion (Interfaz), no sabemos como implementan los métodos de collection el obj
        que se devuelve, pero sabemos que tiene los métodos de la interfaz. Asi como tambien podemos crear
        objetos al vuelo a partir de la intefaz (escribir Collection<String> col= new Coll.. y el ide
        automáticamente nos creara los métodos necesarios para la interfaz, la implementacion quedara a
        nuestro crtério, lo tendremos que hacer en el momento que creamos el objeto
         */

        System.out.println("------Completo:-----");
        System.out.println(persona);


        //Podemos remover segun clave o clave-valor
        persona.remove("apellido");
        System.out.println("------Remover apellido-----");
        System.out.println(persona);

        //Reemplazar un valor correspondiente a una clave (retorna el valor antiguo o null en caso de no poder reemplazar):
        persona.replace("nombre","Erick2");
        System.out.println("------Reemplazo1-----");
        System.out.println(persona);

        //Esta otra reemplaza siempre y cuando el valor viejo ademas de la clave sean iguales, sino no lo hace y retorna false
        persona.replace("nombre","Erick2","Erick3");
        System.out.println("------Reemplazo2-----");
        System.out.println(persona);


        //Podemos crear un map que cotenga otro map, pero debemos usar Object en lugar de String
        System.out.println("---------------Maps con Maps------------------");
        Map<String,Object> personaMap= new HashMap<>();
        Map<String,String> dir= new HashMap<>();
        dir.put("Marcelo T. Alv","335");
        personaMap.put("direccion",dir);

        System.out.println(personaMap);
        personaMap.forEach((key,value)-> System.out.println(key+" "+value));

        //Tenemos que castear a tipo Map ya que en n principio declaramos que el mapa era <String,Object>
        Map<String,String> dire=(Map<String, String>) personaMap.get("direccion");

        System.out.println("dire.get(\"Marcelo T. Alv\") = " + dire.get("Marcelo T. Alv"));
        System.out.println("dire.getOrdefault =" + dire.getOrDefault("M","Dire default"));


        //TREEMAPS -Es ordenado -no puedeexistir elem nulos e treeMap a dif de hashmap
        Map<String,Object> personaTreeMap= new TreeMap<>();
        personaTreeMap.put("nombre","Erick");
        personaTreeMap.put("apellido","Vaernet");
        Map<String,String> d= new TreeMap<>(Comparator.naturalOrder());
        d.put("calle","Marcelo T. de Alv.");
        d.put("numero","335");
        personaTreeMap.put("direccion",d);
        personaTreeMap.put("mail","erickadrielnet@gmail.com");
        System.out.println(personaTreeMap);






    }
}
