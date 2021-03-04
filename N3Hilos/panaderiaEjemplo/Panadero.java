package N3Hilos.panaderiaEjemplo;

import N3Hilos.Panaderia;

public class Panadero implements Runnable{

    private Panaderia panaderia;
    private String masa;

    public Panadero(Panaderia panaderia,String masa) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        panaderia.hornear(masa);
    }
}
