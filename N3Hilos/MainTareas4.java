package N3Hilos;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class MainTareas4 {
    public static void main(String[] args) {

        //Taeas programadas usando Timer y TimerTask(abstracta, implementa Runnable)
        //Timer nos permite agregar tareas y programarlas

        AtomicInteger atInt= new AtomicInteger(3);

        Timer t1= new Timer();

        t1.schedule(new TimerTask() {
            @Override
            public void run() {

                int i= atInt.getAndDecrement();

                if(i>0){
                    System.out.println("Pasaron 5 segundos");
                    System.out.println("Tarea "+i+" en "+new Date()+" en hilo "+Thread.currentThread().getName());

                }else{
                    System.out.println("Tarea FInalizada");
                    t1.cancel();
                }
            }
        },1000,5000);

        System.out.println("Se realizara la tarea cada 5 segundos:");

    }
}
