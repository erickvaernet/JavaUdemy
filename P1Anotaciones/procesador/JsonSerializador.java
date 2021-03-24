package P1Anotaciones.procesador;

import P1Anotaciones.Init;
import P1Anotaciones.JsonAtributo;
import P1Anotaciones.procesador.exceptions.JsonSerializadorException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class JsonSerializador {

    public static String convertirJson(Object obj){
        if (Objects.isNull(obj)) throw new JsonSerializadorException("El Objeto a serializar no puede ser null");
        inicializarObjeto(obj);
        Field[] campos = obj.getClass().getDeclaredFields();
        return Arrays.stream(campos).filter((f)-> f.isAnnotationPresent(JsonAtributo.class))
                .map((f)->{
                    f.setAccessible(true);  //para acceder a los campos privados
                    String nombre =f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName()  //Si el campo no tiene un valor para nombre, como en atrib precio se toma "" por defecto (valor default)
                            : f.getAnnotation(JsonAtributo.class).nombre();  // se va por este caso si el campo SI tiene un valor para el nombre de la anotecion, como en nombrep cuyo valor de la anotacion es nombre="descripcion"
                    try {
                        Object objectValue=  f.get(obj);
                        if(f.getAnnotation(JsonAtributo.class).capitalizar() && objectValue instanceof String)
                        {
                            String newValue= (String) objectValue;
                            newValue = Arrays.stream(newValue.split(" "))
                                    .map((word)-> word.substring(0,1).toUpperCase()+
                                                  word.substring(1).toLowerCase())
                                    .collect(Collectors.joining(" "));

                                  /* = (newValue).substring(0,1).toUpperCase()+(newValue).substring(1).toLowerCase();
                            f.set(obj,newValue);*/
                        } 
                        return "\"" +nombre+"\":\""+f.get(obj)+"\"";
                    } catch (IllegalAccessException e) {
                        throw  new JsonSerializadorException("Error en la serializacion del JSON"+ e.getMessage());
                    }
                }).reduce("{",(a,b)->(a.equals("{")? a+b : a+", "+b).concat("}"));
    }

    public static void inicializarObjeto(Object object){

        if (Objects.isNull(object)) throw new JsonSerializadorException("El Objeto a serializar no puede ser null");
        Method[] metodos  = object.getClass().getDeclaredMethods();
        Arrays.stream(metodos).filter((m)->m.isAnnotationPresent(Init.class)).forEach((m)-> {
            m.setAccessible(true);
            try {
                m.invoke(object);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new JsonSerializadorException("Error al serializar, no se puede iniciar el objeto "
                        + e.getMessage());
            }
        });

    }
}
