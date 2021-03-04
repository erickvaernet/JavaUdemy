package N3Hilos;

import static N3Hilos.MainPractico3.printFrases;

public class SincronRun implements Runnable{

    private String f1,f2;

    public SincronRun(String f1, String f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    @Override
    public void run() {
        printFrases(f1,f2);

    }
}
