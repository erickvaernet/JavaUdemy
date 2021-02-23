package M8Generics.repositorio;

import M8Generics.modelo.Cliente;

import java.util.List;

public interface OrdenableRepository {

    List<Cliente> listar(String campo, Direccion direccion);
}
