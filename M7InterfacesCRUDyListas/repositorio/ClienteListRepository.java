package M7InterfacesCRUDyListas.repositorio;

import M7InterfacesCRUDyListas.modelo.Cliente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepository implements  CrudRepository,
        OrdenableRepository,PaginableRepository{

    private  List<Cliente> dataSource;

    public ClienteListRepository() {
        this.dataSource= new ArrayList<>();
    }

    @Override
    public List<Cliente> listar() {
        return dataSource;
    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) {

        /*
        sort(new Comparator<Cliente>(){}) como comparator es una interfaz Funcional se puede hacer uso de expresiones
         lambda o se puede usar como expresion lambda, colocando el mètodo y su implementacion.
         Una Expresion lambda es una Interfaz funcional que tiene un solo método abstracto y esta decorada con
          FuncionalInterface
        */

        List<Cliente> listaOrdenada= new ArrayList<>(dataSource);

        //se tiene un solo método entonces se asume que es el compare
        /*
        listaOrdenada.sort((o1, o2)->{ //Se asume que o1 y o2 son del tipo cliente
            int resultado =0;
            if (direccion== Direccion.ASC){
                //Switch con ayuda de arrow function
                switch (campo){
                    case "id"->
                            resultado = o1.getId().compareTo(o2.getId());
                    case "nombre"->
                            resultado= o1.getNombre().compareTo(o2.getNombre());
                    case "apellido"->
                            resultado= o1.getApellido().compareTo(o2.getApellido());
                }

            }else  if (direccion==Direccion.DESC){
                switch (campo){
                    case "id"->
                            resultado = o2.getId().compareTo(o1.getId());
                    case "nombre"->
                            resultado= o2.getNombre().compareTo(o1.getNombre());
                    case "apellido"->
                            resultado= o2.getApellido().compareTo(o1.getApellido());
                }
            }
            return resultado;
        });*/

        //simplificado
        listaOrdenada.sort(new Comparator<>() {

            @Override
            public int compare(Cliente o1, Cliente o2) {
                int resultado =0;
                if (direccion== Direccion.ASC){
                  resultado=this.ordenar(o1,o2);
                }else  if (direccion==Direccion.DESC){
                   resultado=this.ordenar(o2,o1);
                }
                return resultado;
            }

            //tambien se puede agregar campo como parametro y ponerlo como método privado de CllienteListRepo, e implem
            //entar como func lambda el compare. O se podria poner como método static de OrdenableRepository
           private int ordenar(Cliente a, Cliente b){
                int result=0;
               switch (campo){
                   case "id"->
                           result = a.getId().compareTo(b.getId());
                   case "nombre"->
                           result= a.getNombre().compareTo(b.getNombre());
                   case "apellido"->
                           result= a.getApellido().compareTo(b.getApellido());
               }
               return  result;
           }
        });


        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) {
        return dataSource.subList(desde,hasta);
    }

    @Override
    public Cliente porId(Integer id) {
        for (Cliente cl:dataSource){
            if(cl.getId().equals(id)) return cl;
        }
        return null;
    }

    @Override
    public void crear(Cliente cliente) {
        this.dataSource.add(cliente);
    }

    @Override
    public void modificar(Cliente cliente) {
        Cliente cl =porId(cliente.getId());
        cl.setNombre(cliente.getNombre());
        cl.setApellido(cliente.getApellido());

    }

    @Override
    public void eliminar(Integer id) {
        dataSource.remove(this.porId(id));
    }



}
