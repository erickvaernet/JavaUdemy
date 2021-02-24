package M82Generics.repositorio;

public interface FullRepository<T> extends CrudRepository<T>,
        OrdenableRepository<T>, PaginableRepository<T>, ContableRepository {

    //Se PUede heredar de muchas interfaces
}
