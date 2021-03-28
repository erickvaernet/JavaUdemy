package P3PatronesDiseno.singleton;

public class Main {
    public static void main(String[] args) {

        for (int i=0; i<9; i++){
            ConexionBDSingleton conexion= ConexionBDSingleton.getInstance();
            System.out.println("conexion = " + conexion);
        }

        ConexionBDSingleton con1= ConexionBDSingleton.getInstance();
        ConexionBDSingleton con2= ConexionBDSingleton.getInstance();
        System.out.println("con1==con2 :"+(con1==con2));

    }
}
