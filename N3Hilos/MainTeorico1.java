package N3Hilos;

public class MainTeorico1 {
    public static void main(String[] args) {

        /*
        Los Hilos o Threads son objetos que nos dan la cpacidad de hacer más de una tarea al mismo tiempo.
        Si  tenemos un CPU multiccore es probable que se maneje en paralelo, en cambio si tenemos un solo
        nucleo, seguro se ejecuta en concurrencia, es decir va a ir alternando aunque visualmente sea como
        si se hiciera al mismo tiempo.
        Podemos sincronizar estos hilos para que ejecute un método antes que otro o bien tdo al mismo tiempo
        La jvm gestiona todos los detalles como si fuera un SO com los tiempos de ejecucion, prioridades,
         asignacion de memoria, etc.

        *Existen 2 formas de crear un hilo
        1-Extendiendo de la clase Thread, e implementanto el método run()
        2-En la clase con método main, podemos ejecutar un hilo con el m{etodo start()

        -Los threads son tareas que se ejecutan dentro de un proceso, dentro de una app. Tienen un principio
        y un final.
        -El método main se ejecuta dentro de un Thread, el Thread principal.

         */

    }
}
