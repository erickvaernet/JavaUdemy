package M7InterfacesCRUDyListas.repositorio;

public interface FullRepository extends CrudRepository,
        OrdenableRepository, PaginableRepository, ContableRepository{

    //Se PUede heredar de muchas interfaces
}
