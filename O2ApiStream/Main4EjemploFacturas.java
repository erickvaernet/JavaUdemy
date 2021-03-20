package O2ApiStream;

import O2ApiStream.models.Factura;
import O2ApiStream.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Main4EjemploFacturas {
    public static void main(String[] args) {


        Usuario u1= new Usuario("Erick");
        Usuario u2= new Usuario("Ian");

        Factura f1= new Factura("Mesa",5000);
        Factura f2= new Factura("Silla",800);
        Factura f3= new Factura("Hamburguesa",300);
        Factura f4= new Factura("Plato",1200);

        u1.addFactura(f1).addFactura(f2);
        u2.addFactura(f3).addFactura(f4);


        Stream<Usuario> mayor= Stream.of(u1,u2)
                .flatMap((u)->{
                    double total= 0;
                    for(Factura fact: u.getFacturas()) total+= fact.getPrecio();

                    if(total>3000) return Stream.of(u);
                    else return Stream.empty();
                });

        mayor.forEach(System.out::println);

        System.out.println("----------------");

        List<Usuario> usuarios= new ArrayList<>();
        usuarios.add(u1);
        usuarios.add(u2);

        /*
        usuarios.stream().peek(System.out::println)
                .flatMap((u)->u.getFacturas().stream())
                .forEach((f)-> System.out.println(f.getDescripcion()));

        Integer[] a= {1,2,3,4,5};
        */
        usuarios.stream()
                .flatMap((u)->u.getFacturas().stream())
                .forEach((f)->System.out.println(
                        f.getDescripcion()
                                .concat(" - Cliente: ")
                                .concat(f.getUsuario().getName())
                        )
                );



    }
}
