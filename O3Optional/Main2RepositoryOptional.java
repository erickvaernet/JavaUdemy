package O3Optional;

import O3Optional.models.Computador;
import O3Optional.repositorio.ComputadorRepositorio;

import javax.crypto.spec.PSource;
import javax.swing.*;
import javax.swing.text.html.Option;
import java.util.Optional;
import java.util.stream.Stream;

public class Main2RepositoryOptional {
    public static void main(String[] args) {


        ComputadorRepositorio repo= new ComputadorRepositorio();

        /*
        //Cuando filter devolvia solo Computador y no el Optional
        String busqueda = "Asus Rog";
        Optional<Computador> opt= Optional.ofNullable(
                repo.filtrar(busqueda)
        );

        opt.ifPresentOrElse(System.out::println,()-> System.out.println("No se encuentra "+busqueda));
         */

        String busqueda= JOptionPane.showInputDialog("Ingrese el computador buscado:");

        repo.filtrar(busqueda).ifPresentOrElse( System.out::println,
                ()-> System.out.println("No se encuentra "+busqueda));

        /* podemos usar .orElse, en caso de que no se encuentre el obj se devuelve un obj
         por defecto indicado en el parametro, DIFERENCIA CON orElseGet() es que or else crea el objeto si o si,
         estee presente el objeto principal o no, este objeto por deffeccto se crea si o si
         */
        String busqueda2="sadas";
        Computador defecto= new Computador("Asus 9","x100");

        Computador compOpt =repo.filtrar(busqueda2).orElse(defecto);
        System.out.println("compOpt = " + compOpt);

        //orElseGet() a diferencia de solo orElse, usa como parametro un Supplier. Mucho mejor que el orElse. Es mas optimizado
        Computador computadorOpt2 = repo.filtrar(busqueda2).orElseGet(() -> {
            return defecto;
        });

        //orElseThrow() En caso de que no exista el objeto y queremos que se lance una excepcion para manejarla.
        //Computador c3= repo.filtrar(busqueda2).orElseThrow(IllegalStateException::new); // reemplazara al get(?

        //ejemplo de busqueda nombre de un archivo
        String nombreArch= "document.pdf";
        String opArch= Optional.ofNullable(nombreArch).filter((a)->a.contains("."))
                .map((a)-> a.substring(a.indexOf(".")+1)).orElseThrow();
        System.out.println("opArch = " + opArch);

    }
}
