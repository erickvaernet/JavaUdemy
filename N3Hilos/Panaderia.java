package N3Hilos;

public class Panaderia {
    private String pan;
    private boolean disponile;

    public synchronized void hornear(String masa){
        this.pan=masa;
        System.out.println("Se hornea pan de "+masa);
        this.disponile=true;
        notify();
        while (disponile){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public synchronized void consumir(){
        while (!disponile){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Se consumio el pan "+pan);
        this.disponile=false;
        notify();
    }

}
