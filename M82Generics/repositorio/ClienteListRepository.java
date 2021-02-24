package M82Generics.repositorio;

import M82Generics.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepository extends AbstractListRepository<Cliente> //implements CrudRepository,OrdenableRepository,PaginableRepository
{

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {

        List<Cliente> listaOrdenada = new ArrayList<>(dataSource);
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
    }


    @Override
    public Cliente porId(Integer id) {
        for (Cliente cl : dataSource) {
            if (cl.getId().equals(id)) return cl;
        }
        return null;
    }


    @Override
    public void modificar(Cliente cliente) {
        Cliente cl = porId(cliente.getId());
        cl.setNombre(cliente.getNombre());
        cl.setApellido(cliente.getApellido());

    }


}
