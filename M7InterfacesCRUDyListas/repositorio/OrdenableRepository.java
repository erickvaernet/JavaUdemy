package M7InterfacesCRUDyListas.repositorio;

import M7InterfacesCRUDyListas.modelo.Cliente;

import java.util.List;

public interface OrdenableRepository {

    List<Cliente> listar(String campo, Direccion direccion);
}
