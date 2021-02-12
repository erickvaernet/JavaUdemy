package k2EnumYAddMasArreglosObj;

public class Automovil {

    private Autos tipo;
    private Rueda[] ruedas;
    private int indiceRueda=0;

    public  Automovil(Autos a ,int ruedas){
        this.tipo=a;
        this.ruedas= new Rueda[ruedas];
    }

    public Autos getTipo() {
        return tipo;
    }

    public void setTipo(Autos tipo) {
        this.tipo = tipo;
    }

    public void addRuedas(Rueda rueda) {
        if (indiceRueda>ruedas.length){
            System.out.println("No se pueden agregar más ruedas");
            return;
        }
        this.ruedas[indiceRueda++] = rueda;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "tipo=" + tipo +
                ", ruedas=" + ruedas[0].toString()+
                ", indiceRueda=" + indiceRueda +
                '}';
    }
}
