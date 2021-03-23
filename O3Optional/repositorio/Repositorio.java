package O3Optional.repositorio;

import O3Optional.models.Computador;

import java.util.Optional;

public interface Repositorio<T> {
    Optional filtrar(String nombre);
}
