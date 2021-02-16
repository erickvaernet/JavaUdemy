package M4ClasesAbstractas.form.elementos;

public class InputForm extends ElementosForm{

    private String tipo= "text"; //por defecto text


    public InputForm(String nombre) {
        super(nombre);
    }

    public InputForm(String nombre, String tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    @Override
    public String dibujarHTML() {
        return "<input type=\""+this.tipo+"\" name=\""+this.nombre+"\" value=\""+this.valor+"\">";
    }


}
