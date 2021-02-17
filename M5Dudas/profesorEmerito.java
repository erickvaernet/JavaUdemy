package M5Dudas;

public class profesorEmerito extends Profesorr{

    private int aEmerito;

    public double obtenerSalarioBase (){
        return (925 +aniosConsolidado * 33.25 + 47.80 * aEmerito);
    }
}
