package O2ApiStream;

import O2ApiStream.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class Main2Optional {
    public static void main(String[] args) {
        /*Optional nos da una capa de abstraccion. Nos permite evitar el prolema de que alsgun stream u
        operacion retorne null y al querer realizar una operacion se tire el error nullPointerException,
        y asi determinar si el objeto fue encontrado o no y devolver algun calor por defecto o no
         */

        Stream<Usuario> st1= Stream.of("Erick Vaernet","Ian Vaernet","Ivan Rodriguez")
                .map((s)->new Usuario(s.split(" ")[0],s.split(" ")[1]))
                .filter((u)->u.getApellido().equals("Vaernet"));

        Optional<Usuario> opt1= st1.findFirst();
        /* .orElse permite obtener el Usuario que coincida con el filtro o en caso de no encontrarlo, se pasa el valor por
        defecto que se encuentra como parametro, Si se encuentra el usuario con apellido vaernet se mostrara el nombre,
        caso contrario se mostrara el nombre de nuestro usuario por defecto*/
        //System.out.println((opt1.orElse(new Usuario("UsuarioPorDefecto")).getName()));

        //con orElseGet se recibe un Suplier como parametro, y no un valor por defecto
        //System.out.println((opt1.orElseGet(()->new Usuario("UsuarioPorDefecto")).getName()));

        //orElseThrow, podemos pasar una excepcion personalizada o, sin parametros, tirara error noSuchElementExcept
        //System.out.println((opt1.orElseThrow()));

        /*Podemos usar .isPresent para saber si el Optional posee o no un objeto y realizar o no alguna accion,
         o podemos usar isEmpty para saber si esta vacio (disponible a partir de JDK11 en adelante)*/


        if(opt1.isPresent()){
            System.out.println(opt1.get());
        }else{
            System.out.println("Objeto no encontrado");
        }

        //Una forma funcional de hacer algo si esta presente
        //opt1.ifPresent(Usuario::getName);



    }
}
