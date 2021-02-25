package M82Generics.repositorio;

import M82Generics.modelo.BaseEntity;

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

    /*
    @Override
    public List<T> listar(String campo, Direccion direccion) {

        List<T> listaOrdenada = new ArrayList<>(dataSource);
        listaOrdenada.sort(new Comparator<>() {

            @Override
            public int compare(Cliente o1, Cliente o2) {
                int resultado = 0;
                if (direccion == Direccion.ASC) {
                    resultado = this.ordenar(o1, o2);
                } else if (direccion == Direccion.DESC) {
                    resultado = this.ordenar(o2, o1);
                }
                return resultado;
            }

            private int ordenar(Cliente a, Cliente b) {
                int result = 0;
                switch (campo) {
                    case "id" -> result = a.getId().compareTo(b.getId());
                    case "nombre" -> result = a.getNombre().compareTo(b.getNombre());
                    case "apellido" -> result = a.getApellido().compareTo(b.getApellido());
                }
                return result;
            }
        });
        return listaOrdenada;
    }*/

    @Override
    public List<T> listar(int desde, int hasta) {
        return dataSource.subList(desde, hasta);
    }


    @Override
    public T porId(Integer id) {
        for (T cl : dataSource) {
            if (cl.getId().equals(id)) return cl;
        }
        return null;
    }


    @Override
    public void crear(T t) {
        this.dataSource.add(t);
    }

    /*
    @Override
    public void modificar(Cliente cliente) {
        Cliente cl = porId(cliente.getId());
        cl.setNombre(cliente.getNombre());
        cl.setApellido(cliente.getApellido());

    }
     */

    @Override
    public void eliminar(Integer id) {
        dataSource.remove(this.porId(id));
    }


    @Override
    public int total() {
        return this.dataSource.size();
    }
}
