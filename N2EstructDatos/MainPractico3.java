package N2EstructDatos;

import java.util.LinkedList;
import java.util.List;


public class MainPractico3 {

    public static void main(String[] args) {


        //Linked List, pilas y colas

        //Usamos LinkedList en lugar de List para obtener los métodos propios de listas enlazadas
        LinkedList<Alumno> enlazada= new LinkedList<>();
        enlazada.add(new Alumno("Erick",10D));
        enlazada.add(new Alumno("Ian",10.0));
        enlazada.add(new Alumno("Otro",8D));
        enlazada.add(new Alumno("Otro2",9D));
        enlazada.add(new Alumno("Rick",10D));

        //podemos agregar al principio y al finalsinmucho coste de proc a diferencia de arraylist
        enlazada.addFirst(new Alumno("Primero",10));
        enlazada.addLast(new Alumno("Ultimo",7));

        System.out.println("------------Enlazada---------------");

        //System.out.println("-Primero:"+enlazada.getFirst());
        //Se usa peek ya que retorna null si no existe en lugar de lanzar excepcion
        System.out.println("-Primero:"+enlazada.peekFirst());

        //System.out.println("-Ultimo:"+enlazada.getLast());
        System.out.println("-Ultimo:"+enlazada.peekLast());

        enlazada.forEach(System.out::println);

        System.out.println("-----Removiendo ultimo y primero---");
        //enlazada.removeFirst();
        //En vez de lanzar excepcion retorna null
        enlazada.pollFirst();

        //enlazada.removeLast();
        enlazada.pollLast();

        enlazada.forEach(System.out::println);

        System.out.println("---------Extraccion--------");
        System.out.println("Primer Alumno extraido:"+enlazada.pop());
        System.out.println("Segundo Alumno extraido:"+enlazada.pop());
        System.out.println("-----Resto de alumnos-----");
        enlazada.forEach(System.out::println);

        /*
        *Diferncia de Iterator, con ListIterator:
        * Iterator se puede usar con sets y maps, pero ListIterator solo cn listas
        Métodos Iterator:
        -hasNext()
        - next()
        -remove()
        Métodos en ListIterator:
        -hasNext ()
        -siguiente()
        -anterior()
        -hasPrevious ()
        -eliminar()
        -nextIndex ()
        -previousIndex ()
         */



    }
}
