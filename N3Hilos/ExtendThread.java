package N3Hilos;

public class ExtendThread extends Thread{

    public ExtendThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Se inicia hilo: "+getName());
        for (int i=0; i<10; i++){
            System.out.println(getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fin hilo: "+getName());

    }
}
