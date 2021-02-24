package M82Generics.repositorio;

import M82Generics.modelo.Cliente;

import java.util.List;

public interface OrdenableRepository<T> {

    List<T> listar(String campo, Direccion direccion);
}
