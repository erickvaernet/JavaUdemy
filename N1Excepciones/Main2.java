package N1Excepciones;

import N1Excepciones.modelo.Cliente;
import N1Excepciones.repositorio.FullRepository;
import N1Excepciones.repositorio.exceptions.DataAccessException;
import N1Excepciones.repositorio.listas.ClienteListRepository;

import java.lang.ref.Cleaner;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        //por si solo este métod oobliga a tratar el error con try catch ya que extendimos divCeroExc de Exception(Checked)
        //Calculadora.div(2,3);

        try {
            Calculadora.div(2,0);
        } catch (DivCeroException e) {
            System.err.println("Error:"+e.getMessage());

        }

        //Al proyecto de crudrepository le agregamos excepciones( Dentro de repositorio)

        FullRepository<Cliente> repo= new ClienteListRepository(); //Podriamos reemplazar con FullRespository, en todos

        try {
            repo.crear(new Cliente("Erick","Vaernet"));
            repo.crear(new Cliente("Ian","Vaernet"));
            repo.crear(new Cliente("Daniela","Sasovsky"));
        } catch (DataAccessException e) {
            e.printStackTrace();
        }

        System.out.println("-------Probando.---------------");
        Cliente nueva =new Cliente("Nueva","Nose");
        nueva.setId(0);
        try {
            repo.modificar(nueva);
        } catch (DataAccessException e) {
            System.err.println(e.getMessage());
        }


        List<Cliente> clientes= repo.listar();
        clientes .forEach(System.out::println); //for each resumido

        //Tratamos error en caso de un que no se encuentre un obj segun su id
        try {
            System.out.println(repo.porId(256).toString());
        } catch (DataAccessException e) {
            System.err.println(e.getMessage());
        }

        //tratamos error en caso de que se pase un ojeto nulo
        try {
            repo.crear(null);
        } catch (DataAccessException e) {
            System.err.println(e.getMessage());
        }

        Cliente clasd= new Cliente("Rick","s");// no se usa pero aumenta el id que es propio de Cliente

        //Listas permiten duplicado, permiten tener 2 obj iguales:
        Cliente ejemplo= new Cliente("Hola","Chau");
        try {
            repo.crear(ejemplo);
            repo.crear(ejemplo);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        repo.listar().forEach(System.out::println);

    }
}
