package N1Excepciones.repositorio.listas;

import N1Excepciones.modelo.Cliente;
import N1Excepciones.repositorio.AbstractListRepository;
import N1Excepciones.repositorio.Direccion;
import N1Excepciones.repositorio.exceptions.AccessReadDataException;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepository extends AbstractListRepository<Cliente> //implements CrudRepository,OrdenableRepository,PaginableRepository
{

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {

        List<Cliente> listaOrdenada = new ArrayList<>(dataSource);
        listaOrdenada.sort((o1, o2) -> {
            int resultado = 0;
            if (direccion == Direccion.ASC) {
                resultado = ordenar(campo,o1, o2);
            } else if (direccion == Direccion.DESC) {
                resultado = ordenar(campo,o2, o1);
            }
            return resultado;
        });
        return listaOrdenada;
    }

    private int ordenar(String campo, Cliente a, Cliente b) {
        int result = 0;
        switch (campo) {
            case "id" -> result = a.getId().compareTo(b.getId());
            case "nombre" -> result = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> result = a.getApellido().compareTo(b.getApellido());
        }
        return result;
    }


    @Override
    public void modificar(Cliente cliente) throws AccessReadDataException {
        Cliente cl = porId(cliente.getId());
        cl.setNombre(cliente.getNombre());
        cl.setApellido(cliente.getApellido());

    }


}
