package M6Interfaces.modelo;

public class Informe extends Hoja implements Imprimible{

    private String autor;
    private String revisor;

    public Informe( String autor, String revisor, String conteido) {
        super(conteido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "***Informe**** "
                + "\n-Escrito por:" + autor
                + "\n-Corregido por:" + revisor
                + "\n" + conteido;
    }
}
