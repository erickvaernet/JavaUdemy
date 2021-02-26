package N1Excepciones.repositorio;

import N1Excepciones.repositorio.exceptions.AccessReadDataException;
import N1Excepciones.repositorio.exceptions.DataAccessException;

import java.util.List;

public interface CrudRepository<T> {

    List<T> listar(); //Read
    T porId(Integer id) throws DataAccessException; //Mejor usar la mas generica de Excepciones
    void crear (T objeto)throws DataAccessException; //Create
    void modificar (T objeto) throws DataAccessException; //Update
    void eliminar (Integer id)throws DataAccessException; //Delete

}
