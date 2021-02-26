package N1Excepciones.repositorio;

public interface FullRepository<T> extends CrudRepository<T>,
        OrdenableRepository<T>, PaginableRepository<T>, ContableRepository {

    //Se PUede heredar de muchas interfaces
}
