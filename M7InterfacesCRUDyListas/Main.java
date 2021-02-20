package M7InterfacesCRUDyListas;

import M7InterfacesCRUDyListas.modelo.Cliente;
import M7InterfacesCRUDyListas.repositorio.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Creando CRUD Repository: Create, Read, Update, Delete. Implementado con Interface. Herencia Mùltiple
        Repositorio es para realizar consultas, tambien se lo conoce como patron DAO o Data Acces Object.

        -Ver EXPRESIONES LAMBDA en el SWITCH de ClienteListRepository.listar(String campo, Direccion dir);
        -VEr Switch con Arrow
        -aca Abajo foreach ABREVIADO con ::
        */

        //implementacion de un DAO
        CrudRepository repo= new ClienteListRepository();

        repo.crear(new Cliente("Erick","Vaernet"));
        repo.crear(new Cliente("Ian","Vaernet"));
        repo.crear(new Cliente("Daniela","Sasovsky"));

        List<Cliente> clientes= repo.listar();
        clientes .forEach(System.out::println); //for each resumido

        System.out.println("------ paginable -------");
        //clientes.subList(1,2).forEach(System.out::println);
        List<Cliente> clientesSub= ((PaginableRepository)repo).listar(1,3); //es por indice no id
        clientesSub.forEach(System.out::println);

        System.out.println("----- Ordenado por nombre----");
        List<Cliente> clientesOrdAsc= ((OrdenableRepository) repo).listar("nombre", Direccion.ASC);
        clientesOrdAsc.forEach(System.out::println);

        System.out.println("---- Modificando -----");
        Cliente danielaNuevo = new Cliente("Daniela", "Vaernet");
        danielaNuevo.setId(3);
        repo.modificar(danielaNuevo);
        System.out.println(repo.porId(3));

        System.out.println("------- Eliminando -------");
        repo.eliminar(3);
        repo.listar().forEach(System.out::println);



    }
}
