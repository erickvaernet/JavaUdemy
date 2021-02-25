package M82Generics;

import M82Generics.modelo.Cliente;
import M82Generics.modelo.Producto;
import M82Generics.repositorio.*;
import M82Generics.repositorio.listas.ClienteListRepository;
import M82Generics.repositorio.listas.ProductListRepository;

import java.util.List;

public class MainGenerics2 {
    public static void main(String[] args) {

        //Parte 2 de Genericos (vid 228)Se va apasar el CRUDRepository del M8Interface a uno con uso de genericos


        FullRepository<Cliente> repo= new ClienteListRepository(); //Podriamos reemplazar con FullRespository, en todos

        repo.crear(new Cliente("Erick","Vaernet"));
        repo.crear(new Cliente("Ian","Vaernet"));
        repo.crear(new Cliente("Daniela","Sasovsky"));

        List<Cliente> clientes= repo.listar();
        clientes .forEach(System.out::println); //for each resumido

        System.out.println("------ paginable -------");
        //clientes.subList(1,2).forEach(System.out::println);
        List<Cliente> clientesSub= repo.listar(1,3); //es por indice no id
        clientesSub.forEach(System.out::println);

        System.out.println("----- Ordenado por nombre----");
        List<Cliente> clientesOrdAsc= repo.listar("nombre", Direccion.ASC);
        clientesOrdAsc.forEach(System.out::println);

        System.out.println("---- Modificando -----");
        Cliente danielaNuevo = new Cliente("Daniela", "Vaernet");
        danielaNuevo.setId(3);
        repo.modificar(danielaNuevo);
        System.out.println(repo.porId(3));

        System.out.println("------- Eliminando -------");
        repo.eliminar(3);
        repo.listar().forEach(System.out::println);

        FullRepository<Producto> repo2= new ProductListRepository(); //Podriamos reemplazar con FullRespository, en todos

        repo2.crear(new Producto("Mesa",23000.99));
        repo2.crear(new Producto("Silla",4000));
        repo2.crear(new Producto("Sillon",36000));

        repo2.listar().forEach(System.out::println);

        System.out.println("---- Modificando -----");
        Producto sillon = new Producto("Sillonaso", 57800);
        sillon.setId(3);
        repo2.modificar(sillon);
        System.out.println(repo2.porId(3));

    }
}
