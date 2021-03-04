package N3Hilos;

public class Panaderia {
    private String pan;
    private boolean disponile;

    public synchronized void hornear(String masa){
        //while en lugar de if para asegurar que no se despierte el hilo por equivocacion
        while (disponile){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.pan=masa;
        System.out.println("Se hornea pan de "+masa);
        this.disponile=true;
        notify();
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
