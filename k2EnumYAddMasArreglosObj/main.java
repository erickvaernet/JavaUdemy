package k2EnumYAddMasArreglosObj;

public class main {
    public static void main(String[] args) {

        Automovil a1= new Automovil(Autos.CONVERTIBLE,4);
        for (int i=0; i<4;i++){
            a1.addRuedas(new Rueda(40));
        }

        Automovil a2= new Automovil(Autos.SEDAN,4);
        for (int i=0; i<4;i++){
            a2.addRuedas(new Rueda(40));
        }

        System.out.println("a1.toString() = " + a1.toString());
        System.out.println("a2.toString() = " + a2.toString());

        //switch mejorado a partir de java 13
        switch (a1.getTipo()){
            case CONVERTIBLE -> System.out.println("a1 Es un convertible");
            case SEDAN -> System.out.println("a1 Es un Sedan");
        }

        //T0do enum se puede obtener sus valores como arreglo con el método values()
        Autos[] arrA= Autos.values();

        for (Autos a:arrA ) {
            System.out.println(a.name()+ "= " + a.toString());
        }
    }
}
