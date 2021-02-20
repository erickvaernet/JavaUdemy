package M6Interfaces.modelo;

public class Pagina extends Hoja implements Imprimible{

    public Pagina(String conteido) {
        super(conteido);
    }

    @Override
    public String imprimir() {
        return this.conteido;
    }
}
