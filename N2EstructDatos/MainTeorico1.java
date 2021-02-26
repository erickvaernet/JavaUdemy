package N2EstructDatos;

public class MainTeorico1 {

    public static void main(String[] args) {

        /*
    Colecciones: son para agrupar  o almacenar objetos. Son de tamaño dinámico, crecen a medida que creamos objetos
    Tipos:
    -Collections: 3 tipos dentro
        -List: Almacena objetos en una secuencia Determinada
        -Set: No Permite elementos duplicados, y no mantiene el orden de sus elementos
        -Queue: son las colas
    -Maps: Disccionarios, almacenan info en base a clavess y valores

    *Podriamos decir que los basicos son List, Set y Maps, siempre se les puede aplicar alguna regla.

    --Listas: a medida que agregamos elementos van quedando ordenadas en esa secuencia, y asegura que esos elementos van
    a tener esa secuencia específica. Podemos ordenarlos igualmente de manera mas especifica, invocando el método sort
    siempre y cuando implementen algun contrato. Usando por ejemplo comparator o comparable. Permiten elementos duplicados
    --Sets:No permiten duplicados, y no tienen orden
    --Maps: son similares  a arreglos asosciativos, iguales a diccionarios.
    --Queue: Existe otra en realidad que no se menciona en el curso que deriva de Collections, las queue o colas


    ===---*LISTAS*---===
   6 tipos, aca solo 3:

    -->> ArrayList: Lista volcada en un arreglo, tamaño inicial de 10 elementos, y a medida que alcanza el limite  aumenta
     en un 50% la capacidad. Es decir crea una copia del arreglo con ArrayCopy en otro que es 50% mas grande.
             -Pros: Accesos muy rapido de lectura, a travez del indice.
             -Contra: Lo que sea manuiulacion de obj como eliminar obj al medio o agregar elem en el medio, tiene cierta
             deficiencia ya que es un arreglo, y hay que desplazar todos los elementos y ordenar.
             -Extra: Iteracion entre LinkedList y Arraylist es de rendimiento constante

    -->>LinkedList:Listas Doblemente Enlazadas.Podemos implementar pilas y colas con ello(?.Podemos obtener un valor o
    elemento pero tambien extraer (obtener elemento y eliminar).
             -Pros: Lo que es manipulación de elementos es muy rapido, ya sea insertar o eliminar del centro por ejemplo.
             Ya que lo hace a travez de lista enlazada, es decir trabaja con nodos que apuntan hacia adelante y atras.
             Rápido al agregar elementos en cualquierparte
             -Contra: Coste al acceder directamente a un elemento, ya que no accede por indice sino que hay que recorrer
             la lista hasta el elemento que queremos.
             -Extra: Iteracion entre LinkedList y Arraylist es de rendimiento constante

    -->>Vector: Parecido al arrayList ya que trabajo con arreglos por detras, con la diferencia de que es SINCRONIZADO.
    Sirve para trabajar con concurrencia, con hilos de ejecucion, asi se accede de unn hilo a la vez, los otros dos no.
    Los otros se pueden sincronizar con una clase helper pero no lo hacen nativamente. Usa el método equals() para comparar
    objetos o contains() para contener. Para eliminar .remove()

    -->>CopyOnWriteList: tambien para trabajar con concurrencia. LEER MAS, PARECE QUE VECTOR ESTA OBSOLETA Y ESTA LO REEMPLAZA

   === ---*SETS*---===
   6 tipos, aca solo 3:

   -->>HashSet: No es ordenado, los elementoos se agregan con add pero no asegura ningun orden, no permite duplicado, es
   la mas comun. Todos sus elem deben implementar el hash code para ver si son iguales. . EnHashSet se detecta mediante
    el método equals si dos elementos son iguales.Diferente en treeSet (por compareTo)
   -->>TreeSet: Es ordenado, no permite duplicados, permite comparator o comparable, por defecto se ordenan de manera
   natural, es decir alfabeticamente o numericamente, cada vez que s eagrega unelemento se vuelve a ordenar el elemento
   (baja rendimiento ya que se vuelve a ordenar tdo con cada ingreso).IMPORTANTE!!!!! el treeSet usa el compareTo
    para saber si dos objetos son iguales. a diferencia del hashSet que es mediante el método equals que se detecta si
    son iguales

   -->>LinkedHashSet:Trabaja con lista enlazada combinada con hashset y mantiene orden en el que se van gregando los
   elementos.
   --->> Todos los sets trabajan con mapas por detras de escena.

   ===---*MAPS*---===
   7 tipos, aca solo 3:

   -->>HashMap: utiliza el hashcode para que no haya repetidos. NO ordenadas, Eficientes
   -->>TreeMap: Mapa ordenado por clave, poco eficiente en todas sus operaciones.
   -->>LinkedHashMap:Ordenado por insercion, permite ordenacion por uso, eficiencia en lectura, Poca eficiencia escritura

---------------------------***== Métodos comunes a Collection ==***------------------------------------------

    boolean add(Object): Agrega elem a la coleccion y devuelve false si no se puede agregar (en sets que son unicos     )
    boolean addAll(Collection): Agrega una coleccion entera y devuelve false si no se puede agregar
    void clear():Elimina todos los elementos que componen la colección.
    boolean contains(Object): Devuelve true si contiene el objeto. Usa equals para ubicar el obj ya sea id o lo que indiquemos
    boolean isEmty() devuelve true si esta vacia.
    Iterator iterator(): Devuelve un iterador sobre el cual se puede avanzar a travez de los elementos
    boolean remove(Object): remueve el objeto que se pasa por argumento de la coleccion. y devuelve true si se logro
    boolean removeAll(Collection): remueve todos los elementos que estan en el argumetno y devuelve true si elimina ->
        aunque sea un elemento de ellos.
    boolean retainAll(Collection): Mantiene solo los elementos que estan contenidos en el argumento.Interseccion en teo
    ria de conjuntos.Devuelve true en caso de que se produzca algun cambio.
    int size(): devuelve el número de elementos que contiene la colección.
    Object[] toArray(): Devuelve un array con los objetos de la collecion

---------------------------***== Métodos adicionales de LinkedList ==***------------------------------------------
    addFirst(), addLast(),getFirst(), getLast(),removeFirst(), removeLast(), Estas no estan definidas en ninguna interfaz
    y permiten hacer uso de listasEnlazadas como colas y pilas.
    getFirst(), getLast(),removeFirst(), removeLast(), Lanzan  NoSuchElementsException si la lista esta vacia



     */

    }

}
