package N4Executor;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class Main4ScheduleExecutorService {
    public static void main(String[] args) throws InterruptedException {

        //Para tareas usamos el ScheduledExecutor

        /*
        ScheduledExecutorService executor= Executors.newScheduledThreadPool(2);

        executor.schedule(()->{

            System.out.println("tarea en proceso...1");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("tarea en proceso...2");
        },500,TimeUnit.MILLISECONDS);

        System.out.println("Fin");
        executor.shutdown();
        */

        /*Diferencia entre SheduleAtFixedRate y ScherduleWithFixedDelay: fixedRate, es de una tasa fija en el que se va
        a ejecutar la tarea, no define el intervalo entre tareas, es decir depende de cuando una tarea se complete,
        en cambio withfixedRate permite definir un intervalo fijo que nos dice cuanto tiene que pasar entre tareas

         */
        ScheduledExecutorService executor= Executors.newScheduledThreadPool(2);

        CountDownLatch cont= new CountDownLatch(5); //Contador, tambienpodriamos usar el AtomicInteger, pero habria que usar while
        executor.scheduleAtFixedRate(()->{

            System.out.println("tarea en proceso...1");
            try {
                TimeUnit.SECONDS.sleep(1);
                cont.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("tarea en proceso...2");
        },500,2000,TimeUnit.MILLISECONDS);

        System.out.println("Fin");
        //TimeUnit.SECONDS.sleep(10);
        cont.await(); //espera hasta que el contador llegue a 0
        executor.shutdown();
    }
}
