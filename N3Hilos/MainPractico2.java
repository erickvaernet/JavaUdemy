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


        //*Con clases anonimas:

        Runnable r1= new Runnable() {
            @Override
            public void run() {
                System.out.println("Se inicia hilo: "+
                        Thread.currentThread().getName()); //permite obtener el nombre dle hilo en el que se esta ejecutando

                for (int i=0; i<10; i++){
                    System.out.println(i+"-"+Thread.currentThread().getName());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("Fin hilo: "+ Thread.currentThread().getName());
            }
        };

        new Thread( r1,"num1").start();


        //*Con lambda func:

        Runnable r2= () -> {
            System.out.println("Se inicia hilo: "+
                    Thread.currentThread().getName());

            for (int i=0; i<10; i++){
                System.out.println(i+"-"+Thread.currentThread().getName());
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Fin hilo: "+ Thread.currentThread().getName());
        };

        new Thread(r2,"hiloConLambda").start();
    }
}
