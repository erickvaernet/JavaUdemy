package N4Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main1 {
    public static void main(String[] args) throws InterruptedException {


    /*
    Excecutor se encarga de la gestion de hilos y memoria, nosotros solo tenemos que indicar las tareas
     a realizzar.Se encarga de crear un pool de hilos y usarlos de manera optima.
     Tenemos Executor para realizar treas, es decir tiramos las tareas que se deben realizar y Excecutor
     se encarga de la gestion de hilos. O ExecutorService, el cual nos permite un mejor manejo de los
     procesos y/p tareas a realizar
     */

        //Cramos el objeto de tipo ExecutorService
        ExecutorService executor= Executors.newSingleThreadExecutor();

        //Creamos la tarea, en este caso una lambda func que pertenece a la interfaz Runnabe
        Runnable tarea1= ()->{
            System.out.println("Inicio de la tarea");
            System.out.println("En:"+Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Fin tarea");
        };

        //Asignamos la tarea al Executor
        executor.submit(tarea1);
        //Cerramos la trea, son shutdown espera a que finalicen las taeras en ejecucion y en cola;
        executor.shutdown();
        System.out.println("Continua");

        //Espera a que terminen las tareas para poder continur con el main. a diferencia de shutdown que el main continua
        executor.awaitTermination(3,TimeUnit.SECONDS); //si asa mas de 3 segundos sin finalizar continua con el main
        System.out.println("No continua hasta que finalicen las tareas");
    }
}
