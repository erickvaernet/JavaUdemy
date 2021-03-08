package N4Executor;

import java.util.concurrent.*;

public class Main2Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        /*
        Ejemplo con interfaz callable en vez de Runnable. La unica diferencia entre Runnable y Callable es que Callable
        devuelve un resultado
        */

        ExecutorService executor= Executors.newSingleThreadExecutor();

        //Pasamos con <> el tipo de dato que se devuelve al finalizar la tarea
        Callable<String> tarea1= ()->{
            System.out.println("Inicio de la tarea");
            System.out.println("En:"+Thread.currentThread().getName());
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }

            System.out.println("Fin tarea");

            //Retorno String
            return "La tarea ah finalizado con exito";
        };

        Future<String> resultado= executor.submit(tarea1); //Entre <> el tipo de dato que devuelve la tarea
        executor.shutdown();

        System.out.println("Resultado de la tarea: "+resultado.get());

    }
}
