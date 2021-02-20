package M7InterfacesCRUDyListas.repositorio;

import M7InterfacesCRUDyListas.modelo.Cliente;

import java.util.List;

public interface PaginableRepository {
    List<Cliente> listar(int desde, int hasta);
}
