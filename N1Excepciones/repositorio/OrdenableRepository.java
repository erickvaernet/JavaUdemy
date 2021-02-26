package N1Excepciones.repositorio;

import java.util.List;

public interface OrdenableRepository<T> {

    List<T> listar(String campo, Direccion direccion);
}
