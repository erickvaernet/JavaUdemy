package N2EstructDatos;

import java.util.*;

public class MainPractico2 {
    public static void main(String[] args) {

        //Sets

        System.out.println("-----SETS-----");
        Set<String> hs= new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");
        System.out.println("hs = " + hs); //Recordar que no garantiza ningun orden

        boolean addSame= hs.add("tres"); //devuelve false por tratarse de un mismo elemento
        System.out.println("permite elem duplicados = " + addSame);


        //LISTAS
        System.out.println("-----LISTAS-----");
        //transformamos el set enuna lista, ya que acepta una coleccion como parametro del constructor
        List<String> hs1= new ArrayList<>(hs);

        boolean addSame1= hs1.add("tres"); //devuelve true ya que se pueden agregar elem repetidos
        System.out.println("permite elem duplicados = " + addSame1);

        Collections.sort(hs1); //Solo podemos ordenar listas ya que tienenun orden, se ordenan alf en este caso
        System.out.println(hs1);


        //HASHSET
        //Desordenado, sin repetido
        System.out.println("-------HASHSET----------");
        String[] ar= {"uno","uno","dos","tres","cuatro"};// Uno esta repetido
        Set<String> set= new HashSet<>();
        for (String elem: ar){
            if(!set.add(elem)) System.out.println("elem duplicado:"+elem); // no agrega "uno" 2 veces, ya que esta dupplicado
        }
        System.out.println("set("+set.size()+")= " + set);

        //TREESET
        //Ordenados pero menos eficientes,sin rep
        System.out.println("-------TREESET----------");

        //esta ordenado segun unicode en caso de String o numericamente si son números. Tmb podemos darle la imlement nosotros
        Set<String> tree= new TreeSet<>(Arrays.asList(ar));
        System.out.println("tree = " + tree);

        System.out.println("-------TREESET2----------");
        Set<Integer> tree2= new TreeSet<>();
        tree2.add(4);
        tree2.add(2);
        tree2.add(5);
        tree2.add(3);
        tree2.add(1);
        //Aunque agreguemos de forma desordenada, el treeSet se ordena solo automaticamente a medida que agregamos elementos.
        System.out.println("tree2 = " + tree2);
        //NO ordena cualquier objeto sino aquellos que cumplan con la interfaz comparable y tengan compareTo()

        System.out.println("-------TREESET3----------");
        Set<Integer> tree3= new TreeSet<>((a,b)-> b.compareTo(a)); //que se ordene en orden inverso
        tree3.addAll(tree2);
        System.out.println("tree3 = " + tree3);
        System.out.println("tree2="+tree2);

        System.out.println("--------------TreeAlumno------------");
        //Es necesario que la clase Alumno implemente Comparable; Lo implementamos con la nota

        /*IMPORTANTE!!!!! el treeSet usa el compareTo para saber si dos objetos son iguales. a diferencia del hashSet
        En este caso como usamos las notas para el compareTo, los elementos de notas iguales se toman como elementos
        iguales. En HashSet es mediante el método equals que se detecta si son iguales.primero Hashcode y desp equals */
        Set<Alumno> alumnos= new TreeSet<>();
        alumnos.add(new Alumno("Erick",10D));
        alumnos.add(new Alumno("Ian",10.0));
        alumnos.add(new Alumno("Otro",8D));
        alumnos.add(new Alumno("Otro2",9D));
        alumnos.add(new Alumno("Rick",10D));
        System.out.println(alumnos);

        Alumno aa=new Alumno("e",1D);
        Alumno bb=new Alumno("e",1D);
        System.out.println(aa==bb);
        Object a= new Object();

        /*
        Los Sets No se pueden iterar con un for convencional (int i =0;i<col.size();i++). Pero si mediante for each o
        mediante while con Su iterator. Las list si se pueden con tdo lo anterior y for convencional ya que tienen arreglo por debajo
         */
        System.out.println("---------Usando Iterator-----------");
        Iterator<Alumno> it= alumnos.iterator();
        while (it.hasNext()){
            Alumno alu= it.next();
            System.out.println(alu.getNombre());
        }

       //--------------------------------------------

        //LIST Orden y Tree

        System.out.println("List 2 comparable y comparator");
        List<Alumno> alumnos1= new ArrayList<>();
        alumnos1.add(new Alumno("Erick",10D));
        alumnos1.add(new Alumno("Ian",10.0));
        alumnos1.add(new Alumno("Otro",8D));
        alumnos1.add(new Alumno("BOtro2",9D));
        alumnos1.add(new Alumno("ARick",10D));

        /*
            En treeSet EL comparator podemos pasarlo cuando intanciamos el mismo, ya que en el constructor de TreeSet se
        encuentra uno que recibe cualquiera que implemente Comparator, por lo tanto podemos implementar la interfaz al
        vuelo, y de esta manera darle desde un inicio el como se debe ordenar.
            En List en cambio podemos pasar el Comparator solo en el método sort y no desde el inicio, ya que se ordenan por
        defecto en el orden en que las agregamos
        */

        /*
        alumnos1.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                if (o1.getNombre().compareTo(o2.getNombre())<0){
                    return -1;
                }else  if (o1.getNombre().compareTo(o2.getNombre())>0){
                    return 1;
                }
                return 0;
            }
        });
         */

        // alumnos1.sort((o1, o2) -> o1.getNombre().compareTo(o2.getNombre()));
        // alumnos1.sort(Comparator.comparing((Alumno al)->al.getNombre()));

        alumnos1.sort(Comparator.comparing(Alumno::getNombre));
        alumnos1.forEach(System.out::println);

        //-----------------*ArrayList Métodos*-------------------------

        System.out.println("List 3 lugares en array");
        List<Alumno> alumnos2= new ArrayList<>();
        alumnos2.add(new Alumno("Erick",10D));
        alumnos2.add(new Alumno("Ian",10.0));
        alumnos2.add(new Alumno("Otro",8));

        //Lo insertamos en el indice 1:
        alumnos2.add(1,new Alumno("BOtro2",9D)); //Lo pasamos del indice 3 al 1
        alumnos2.add(new Alumno("ARick",10D));

        //Se desplazan el resto de elementos hacia adelante
        alumnos2.forEach(System.out::println);

        System.out.println("---------------lista.set() Reemplazo y elim-------------------");
        //Al usar .set en lugar de .add, lo que hacemos es reemplazar el elemento en la posicion indicada
        alumnos2.set(1,new Alumno("Reemplazado BOtro2",10D));

        /*podemos remover por indice o por objeto, recordemos que es necesario implementar el .equals para decir que dos
        objetos son iguales cuandio tienen mismo nombre y nota, sino no se eliminara ya que se detecta de otra forma si
        son iguales o no*/
         alumnos2.remove(new Alumno("Otro",8));
        //alumnos2.remove(3);

        alumnos2.forEach(System.out::println);
    }
}
