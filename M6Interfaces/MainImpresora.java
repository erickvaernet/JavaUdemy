package M6Interfaces;

import M6Interfaces.modelo.*;

public class MainImpresora {
    public static void main(String[] args) {

        /*
        Interfaz: es una coleccion de mètodos abstractos, de valores constantes que puede realizar un objeto determinado
            -Captura similitudes entre clases no relacionadas sin forzar una relacion entre ellas. Definen un mismo
            comportamiento implementado de diferentes maneras.
            -Es un tipo de dato por referencia

       *Diseño Orientado a las Interfaces: Java permite pasar de diseño orientado a la implementac, a uno orientado a las
       interfaz, donde todas las clases accedan a servicios a travez de intrefaces que son implementados por clases
       concretas. Al no depende de clases concretas (sino de entidades abstractas) nuestro diseño sera mas reutilizable

       -Pueden tener atributos  final static;
       -Se pueden tener métodos implementados Static o Default

       !!! Se pueden implementar métodos en interfaces ya que a veces no necesitamos ciertos métodos de la misma en una
       clase determinada por lo que podemos crear métodos por default que no nos obliguen a crear una implementacion
       para dichos métodos en las clases que implementen la interfaz
         -Esto solo se aplica cuando un método es opcional

       Se pueden tener métodos estáticos Desarrollados como ej imprimir() de Imprimible
         */

        Curriculim cv= new Curriculim("Erick","Programador","Resumen laboral.....");
        cv.addExperiencia("Java");
        cv.addExperiencia("Python");
        cv.addExperiencia("JavaScript");
        cv.addExperiencia("C");
        cv.addExperiencia("Powershell");

        Informe inf= new Informe("Rick","Sanchez","Informe de Empleados");

        Imprimible.imprimir(cv);

        Imprimible.imprimir(inf);

        System.out.println();
        System.out.println("-------------------------------");
        System.out.println();

        Libro lb= new Libro("Erick Vaernet","El mundo de la programacion", Generos.PROGRAMACION);
        lb.addPagina(new Pagina("El mundo de la programacion................................"))
                .addPagina(new Pagina(".....debido a ello es necesario el uso de.........................."))
                .addPagina(new Pagina("...............ya que gracias a........................"));
        Imprimible.imprimir(lb);


    }


}
