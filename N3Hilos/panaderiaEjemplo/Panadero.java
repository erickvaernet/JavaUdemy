package N3Hilos.panaderiaEjemplo;

import N3Hilos.Panaderia;

import java.util.concurrent.ThreadLocalRandom;

public class Panadero implements Runnable{

    private Panaderia panaderia;
    private String masa;

    public Panadero(Panaderia panaderia,String masa) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {

        for(int i=0;i<10; i++){
            panaderia.hornear("Pan N "+i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500,1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
