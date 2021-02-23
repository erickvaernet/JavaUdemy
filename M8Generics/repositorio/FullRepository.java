package M8Generics.repositorio;

public interface FullRepository extends CrudRepository,
        OrdenableRepository, PaginableRepository, ContableRepository {

    //Se PUede heredar de muchas interfaces
}
