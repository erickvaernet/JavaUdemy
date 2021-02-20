package M6Interfaces.modelo;

abstract public class Hoja implements Imprimible{

    protected String conteido;

    public Hoja(String conteido){
        this.conteido=conteido;
    }

    abstract public String imprimir();
}
