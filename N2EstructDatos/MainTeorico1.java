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


    *Listas*
    Tenemos diferentes tipos:

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


     */

    }

}
