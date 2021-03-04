package N3Hilos;

public class MainPractico2 {
    public static void main(String[] args) throws InterruptedException {

        //------------------*Creando Hilo con una clase que extiende de Thread*-----------------------

        ExtendThread hilo1= new ExtendThread("Hilo 1");
        System.out.println("Estado inicio de hilo1:"+hilo1.getState());
        hilo1.start();

        ExtendThread hilo2= new ExtendThread("Hilo 2");
        hilo2.start();

        System.out.println("Estado corriendo hilo1:"+hilo1.getState());

        Thread.sleep(1); //Pausa al hilo donde se llama(en este caso al main)
        System.out.println("Estado wait hilo1:"+hilo1.getState());

        Thread.sleep(1000);
        System.out.println("Estado fin hilo1:"+hilo1.getState());


        //----------------------*Crando Hilo con una clase que implementa Runnable*----------------------------

        //Implementar de Runnable nos permite a diferencia de extender de Thread, heredar de otras clases.
        //Esto permite que sea mas desacoplado (Modulos del prog. son menos interdependientes)
        new Thread(new ImplementRun("hilo1")).start();
        new Thread(new ImplementRun("hilo2")).start();
        new Thread(new ImplementRun("hilo3")).start();


        //--------------------------*Creando Hilo de manera funcional-----------------------------------



    }
}
