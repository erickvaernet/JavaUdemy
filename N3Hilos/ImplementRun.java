package N3Hilos;

public class ImplementRun implements Runnable {

    private String nombre;

    public ImplementRun(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        System.out.println("Se inicia hilo: "+getNombre());
        for (int i=0; i<10; i++){
            System.out.println(i+"-"+getNombre());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fin hilo: "+getNombre());


    }
}
