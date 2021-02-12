package L1Paquetes;

import L1Paquetes.homee.*;
//import static L1Paquetes.homee.Persona.imprimir;

public class L1Main {
    public static void main(String[] args) {

        /*PAQUETES
            Nombre de paqueres se hace con dominio general exista o no, ya sea or,com,ar etc, mas nombre de empresa
            o nuestro, mas nombre de app, y T0do en minuscula Ej: org.erickvaernet.animax

            -Se puede importar para usar clases o sin importar con el fully-qualify-name

            -Se puede importar los métodos estáticos directamente
         */

        //Ejemplo de método estático importado (hay que descomentar arriba el importado)
        //imprimir();

        //comentarios t0do https://altenwald.org/2014/04/16/marca-tu-codigo/

        //*Modificadores de acceso
        /*
        quienes pueden acceder segun su modif:
        - private: solo la clase puede acceder
        - default: solo la mism clase y clases dentro del mismo paquete
        - protected: la misma clase, clases del paquete, y clases fuera del paquete que hereden de ella
        - public: todas las clases
         */


        Persona.imprimir();
        PersonaHija.imprimir();


    }
}
