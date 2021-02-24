package M82Generics.repositorio;

import M82Generics.modelo.Cliente;

import java.util.List;

public interface CrudRepository<T> {

    List<T> listar(); //Read
    T porId(Integer id); //
    void crear (T cliente); //Create
    void modificar (T cliente); //Update
    void eliminar (Integer id); //Delete

}
