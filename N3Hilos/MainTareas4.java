package N3Hilos;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MainTareas4 {
    public static void main(String[] args) {

        //Taeas programadas usando Timer y TimerTask(abstracta, implementa Runnable)
        //Timer nos permite agregar tareas y programarlas

        Timer t1= new Timer();
        t1.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Pasaron 5 segundos");
                System.out.println("Tarea en "+new Date()+" en hilo "+Thread.currentThread().getName());
                t1.cancel();
            }
        },5000);

        System.out.println("Se realizara la tarea en 5 segundos:");

    }
}
