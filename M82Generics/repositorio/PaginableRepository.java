package M82Generics.repositorio;

import M82Generics.modelo.Cliente;

import java.util.List;

public interface PaginableRepository<T> {
    List<T> listar(int desde, int hasta);
}
