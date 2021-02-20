package M6Interfaces.modelo;

public interface Imprimible {


    /*     !!! Se pueden implementar métodos en interfaces ya que a veces no necesitamos ciertos métodos de la misma en una
    clase determinada por lo que podemos crear métodos por default que no nos obliguen a crear una implementacion
    para dichos métodos en las clases que implementen la interfaz
    -Esto solo se aplica cuando un método es opcional
   */

    //Se pueden tener atrib:
    String TEXTO_DEFECTO="Imprimiendo un valor por defecto"; //Por defecto todos los atrib son final static

    String imprimir(); //por defecto todos los mètodos son publicas

    /*
    //por defecto:
    default String imprimir(){
        return TEXTO_DEFECTO;
    };
    */

    //Tambien se pueden tener métodos estáticos desarrollados

     static void imprimir(Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }

}
