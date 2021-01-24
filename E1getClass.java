import java.lang.reflect.Method;

public class E1getClass {
    public static void main(String[] args) {
        
        String cadena = "Nueva cadena";
        
        Class claseString= cadena.getClass();

        System.out.println("claseString.descriptorString() = " + claseString.descriptorString());
        System.out.println("claseString.toString() = " + claseString.toString());
        System.out.println("claseString.getClass() = " + claseString.getClass());
        System.out.println("claseString.getCanonicalName() = " + claseString.getCanonicalName());
        System.out.println("claseString.getPackageName() = " + claseString.getPackageName());
        System.out.println("claseString.getMethods() = " + claseString.getMethods()); //develve objetos del tipo Method

        int aux=0;
        for (Method metodo: claseString.getMethods()) {

            System.out.println("metodo "+aux+" = " + metodo.getName());
            aux++;
        }
    }
}
