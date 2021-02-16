package M4ClasesAbstractas.form.elementos;

public abstract class ElementosForm {

    protected String valor;
    protected String nombre;


    public ElementosForm() {
    }

    public ElementosForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public abstract String dibujarHTML();

}
