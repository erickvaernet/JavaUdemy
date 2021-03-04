package N3Hilos.panaderiaEjemplo;

import N3Hilos.Panaderia;

public class Consumidor implements Runnable{
    private Panaderia panaderia;

    public Consumidor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        panaderia.consumir();
    }
}
