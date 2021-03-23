package O3Optional;

import O3Optional.models.Computador;
import O3Optional.repositorio.ComputadorRepositorio;

import javax.swing.*;
import java.util.Optional;

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
         por defecto indicado en el parametro, DIFERENCIA CON orElseGet() es que or else llama al método del argumetno
          por defecto, se encuentre o no el objeto, (esto en caso de que se pase por argumento un método que devuelve un obj)
         */
        String busqueda2="sadas";
        Computador defecto= new Computador("Asus 9","x100");
        Computador compOpt =repo.filtrar(busqueda2).orElse(defecto);
        System.out.println("compOpt = " + compOpt);

        //orElseGet() a diferencia de solo orElse, usa como parametro un Supplier
        Computador computadorOpt2= repo.filtrar(busqueda2).orElseGet(()->return defecto);




    }
}
