package M8Generics.repositorio;

import M8Generics.modelo.Cliente;

import java.util.List;

public interface CrudRepository {

    List<Cliente> listar(); //Read
    Cliente porId(Integer id); //
    void crear (Cliente cliente); //Create
    void modificar (Cliente cliente); //Update
    void eliminar (Integer id); //Delete

}
