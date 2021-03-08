package N4Executor;

import N3Hilos.Panaderia;
import N3Hilos.panaderiaEjemplo.Consumidor;
import N3Hilos.panaderiaEjemplo.Panadero;

import java.util.concurrent.*;

public class Main4FixedyCatchedPoolThreads {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        /* A diferencia de SingleThreadExecutor, fixedThread trabaja con más de un hilo, nosotros le indicamos la cantidad
         y se diferencia de catched ya que este ultimo trabaja con los hilos "bajo demanda".
         Tambien podemos hacer uso de las Tareas, usando SigleThreadScheduledExecutor o ScheduledThreadPool o*/


        ExecutorService executor = Executors.newFixedThreadPool(2);
        //si usaramos 2 en vez de 3, un trabajo quedaria en espera y cuando finalice una de las otras dos recien se iniciaria


        Callable <String> trabajo1 =()-> {
            System.out.println("Inicio T1");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Fin Trabajo1");
            return "El Trabajo 1 termino satisfactoriamente";
        };

        Callable <String> trabajo2 =()-> {
            System.out.println("Inicio T2");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Fin Trabajo 2");
            return "El Trabajo 2 termino satisfactoriamente";
        };

        Callable <Integer> trabajo3 =()-> {
            System.out.println("Inicio T3");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Fin Trabajo 3");
            return 1;
        };

        Future <String> result1= executor.submit(trabajo1);
        Future <String> result2= executor.submit(trabajo2);
        Future <Integer> result3= executor.submit(trabajo3);

        executor.shutdown();

        while (!(result1.isDone() && result2.isDone() && result3.isDone())){
            System.out.println(String.format("Trabajo 1: %s, Trabajo 2: %s, Trabajo 3: %s",
                    result1.isDone()?"Finalizado":"En Proceso",
                    result2.isDone()?"Finalizado":"En Proceso",
                    result3.isDone()?"Finalizado":"En Proceso"));
            TimeUnit.MILLISECONDS.sleep(500);
        }

        System.out.println("Resultados: "+result1.get()+" / "+result2.get()+" / "+ result3.get());


        //-------------Con Panaderia------------
        /*

        //Casteamos a ThreadPoolExecutor para obtener algunas funcionalidades más
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
        Panaderia p= new Panaderia();
        Runnable panadero = new Panadero(p,"Masa1");
        Runnable consumidor= new Consumidor(p);

        Future<?> result= executor.submit(panadero);
        Future<?> result2= executor.submit(consumidor);

        executor.shutdown();
        System.out.println("Tamaño del pool:"+executor.getPoolSize()); //Pertenece a ThreadPoolExc..
        System.out.println("En cola:"+executor.getQueue().size()); //Pertenece a ThreadPoolExc..

         */


    }
}
