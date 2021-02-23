package M8Generics.repositorio;

import M8Generics.modelo.Cliente;

import java.util.List;

public interface PaginableRepository {
    List<Cliente> listar(int desde, int hasta);
}
