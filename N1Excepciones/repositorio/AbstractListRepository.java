package N1Excepciones.repositorio;

import N1Excepciones.modelo.BaseEntity;
import N1Excepciones.modelo.Cliente;
import N1Excepciones.repositorio.exceptions.AccessReadDataException;
import N1Excepciones.repositorio.exceptions.AccessWriteDataException;
import N1Excepciones.repositorio.exceptions.DuplicateRegisterException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractListRepository<T extends BaseEntity> implements FullRepository<T> //implements CrudRepository,OrdenableRepository,PaginableRepository
{

    protected List<T> dataSource;

    public AbstractListRepository() {
        this.dataSource = new ArrayList<>();
    }

    @Override
    public List<T> listar() {
        return dataSource;
    }

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


    @Override
    public T porId(Integer id)throws AccessReadDataException {
        if(id==0 || id==null)throw new AccessReadDataException("Id Invalido, debe ser mayor a 0");
        T resultado= null;
        for (T t : dataSource) {
            if (t.getId().equals(id)) resultado= t;
        }
        if (resultado==null) throw new AccessReadDataException("No se encontró el registro de id "+id);
        return resultado;
    }


    @Override
    public void crear(T t) throws  AccessWriteDataException{
        if(t==null) throw new AccessWriteDataException("No se puede crear un objeto de valor nulo");
        if (dataSource.contains(t))throw new DuplicateRegisterException("Ya existe el elemento de id: "+t.getId());
        this.dataSource.add(t);
    }


    @Override
    public void eliminar(Integer id) throws AccessReadDataException {
        dataSource.remove(this.porId(id));
    }


    @Override
    public int total() {
        return this.dataSource.size();
    }
}
