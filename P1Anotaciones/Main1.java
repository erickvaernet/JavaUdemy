package P1Anotaciones;

import P1Anotaciones.models.Producto;
import P1Anotaciones.procesador.JsonSerializador;
import P1Anotaciones.procesador.exceptions.JsonSerializadorException;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {

        /* Las anotaciones son estructuras que nos permiten agregar metadata a nuestros programas
        Antes se usaba xml para eso, es una característica de java 5.
        Similares a interfaces, (Prácticamente interfaces)
        Ejemplo para convertir objeto cualquiera a json con JsonAtributo como anotacion.
         Usamos @ para agregar anotaciones sobre esta, como el uso de @Target que indica donde se va a aplicar
          la anotacion, @Targuet(ElementType.FIELD) indica que el objetivo es un campo de datos o atributo
         @Retention indica en que contexto se va a aplicar esta anotacion, @Retention(RetentionPolicy.RUNTIME) para
          indicar que lo hara en tiempo de ejecución
         @Document si se agrega a doocumentacion
         @Inherited si se utiliza en una clase padre y quiero que tambien las anotaciones se usen en las hijas

         Dentro de la Anotacion JsonAtributos podemos agregar atributos que son propios de la anotación como lo es
         nombre.
         String nombre default "valor por defecto";
         En este caso se indica un atributo nombre que si no se agrega un valor se usa por defecto la
         cadena "valor por defecto"

        En Producto usamos el nombre de la anotacion junto con el @ sobre los campos que queremos usar la anotacion
         */

        Producto producto= new Producto();
        producto.setFecha(LocalDate.now());
        producto.setNombrep("silla de METAL");
        producto.setPrecio(2000L);

        /*En este caso se usa  la api de Java Reflection, que nos permitira leer los metadatos de nuestras clases
         y trabajar con ellos.*/

        /*
        Field[] campos = producto.getClass().getDeclaredFields();
        String json= Arrays.stream(campos).filter((f)-> f.isAnnotationPresent(JsonAtributo.class))
                .map((f)->{
                    f.setAccessible(true); //para acceder a los campos privados
                    String nombre =f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ?f.getName()//Si el campo no tiene un valor para nombre, como en atrib precio se toma "" por defecto (valor default)
                            :f.getAnnotation(JsonAtributo.class).nombre();  // se va por este caso si el campo SI tiene un valor para el nombre de la anotecion, como en nombrep cuyo valor de la anotacion es nombre="descripcion"
                    try {
                        return "\"" +nombre+"\":\""+f.get(producto)+"\"";
                    } catch (IllegalAccessException e) {
                        throw  new RuntimeException("Error en la serializacion del JSON"+ e.getMessage());
                    }
                }).reduce("{",(a,b)->(a.equals("{")? a+b : a+", "+b).concat("}"));

        System.out.println("json = " + json);
         */

        //Incluimos lo anterior en una clase aparte para manejar cualquier tipo de objeto
        System.out.println("json = " + JsonSerializador.convertirJson(producto));

        System.out.println("init= "+JsonSerializador.convertirJson(producto));


    }
}
