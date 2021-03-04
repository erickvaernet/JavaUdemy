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

        *Existen 3 formas de crear un hilo
        1-Extendiendo de la clase Thread, e implementanto el método run()
        2-En la clase con método main, podemos ejecutar un hilo con el metodo start()

        -Los threads son tareas que se ejecutan dentro de un proceso, dentro de una app. Tienen un principio
        y un final.
        -El método main se ejecuta dentro de un Thread, el Thread principal.

        3-Mediante la interfaz Runnable (mas desacoplado) e implementando método Run()

        *Ciclo de vida de un thread:
        A-NEW uno que se ha creado pero no ha iniciado con start(). No se ha asignado recursos siquiera
        B-RUNNABLE  es un hilo que se ha creado e iniciado con start()
        C-BLOCKED o bloqueado, es cuando el hilo no es actualmente elegible para ejecutarse. Entra en este estado
        cuando esta esperando un bloqueo del monitor(recurso compartido entre 2 o mas thread) e intenta acceder
        a una seccion de codigo que esta bloqueada por algun otro hilo en un método sincronizado
        D-WAITING cuando otro hilo esta realizando una accion particular. Un hilo pouede entrar en este estado
        llamando a cualquiera de los dos métodos wait() y join()
        E-TERMINATED estado de un hilo finalizado, cuando finalizo la ejecucion, termino el mètodo run o se
        salio de la ejecucion de forma anormal. Tambien puede ser por stop() (NO RECOMENDADO ya que termina
        abruptamente y podia quedar inconsistentes los datos). Seria mejor tener una bandera para que el
        mètodo run deberia salir. Tenemos el mètodo isAlive() para saber si el hilo a finalizado o no

        *Mètodos wait(),notify(), notifyAll()
        Son mètodos que permiten a los hilos comunicarse entre si y se sincronizen.Se usan en mètodo sincronizado
        es decir con el modificador sincronized.
        - wait() libera el bloqueo para que otros hilos puedan acceder a este recurso.
        - notify(), notifyAll(),el tread que libero el recurso espera que otrro hilo entre y use estos métodos...

        *Thread.sleep(), pausa un hilo unos miliseg o seg, dejando en estado TIMED_WAITING, esperando con limite
         de tiempo. mientras que con join() el hilo que ejecuta el método espera al  hillo que llama el método(Ejemplo
         en MainPractico3)

         */

    }
}
