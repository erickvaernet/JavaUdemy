package N3Hilos;


public class MainPractico3 {
    public static void main(String[] args) throws InterruptedException {

        Thread mainHilo= Thread.currentThread();
        /*
        Sleep solo pausa el hilo actual en el que se ejecute mientras que join, espera a que los hilos que se estan
        ejecutando en su proceso finalicen. Join= Método de la clase “java.lang.Thread” que bloquea al thread llamante
        hasta que el thread llamado acabe de ejecutar su método run().
         */

        Thread h1= new Thread(new ImplementRun("Hilo-1"));
        h1.start();
        Thread h2= new Thread(() -> {
            System.out.println("Se inicia hilo: "+ Thread.currentThread().getName());
            for (int i=0; i<10; i++){
                System.out.println(i+"-"+Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(mainHilo.getState());
            // saldra esperando ya que el main ejecuto el join y esta esperando a que h1 termine para continuar
        });
        h2.start();

        h1.join();
        h2.join();
        System.out.println("Se junta h1 y main, y luego h2 al main");

        /*
        podemos crear métodos sincronizados con el modif synchronized, el cual evita que un hilo ingrese al método si
        este mismo ya esta siendo utilizado por otro hilo, queda bloqueado hasta que termine el primer hilo con el método
        para que el segundo pueda entrar
         */

        Thread hi1 = new Thread(new SincronRun("Hola ","que tal"));
        Thread hi2 = new Thread(new SincronRun("¿como ","estas?"));
        Thread hi3 = new Thread(new SincronRun("adios ","nos vemos"));
        hi1.start();
        //Thread.sleep(100);
        hi2.start();
        //Thread.sleep(100);
        hi3.start();
        Thread.sleep(100);
        System.out.println(hi3.getState());

        //----------------------------*Métodos wait y notify*--------------------------




    }

    //Método sincronizado, los hilos solo pueden acceder al método de a uno
    public synchronized static void  printFrases(String f1, String f2){
        System.out.print(f1);
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(f2);
    }
}
