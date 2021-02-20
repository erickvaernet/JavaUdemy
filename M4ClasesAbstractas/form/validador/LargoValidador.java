package M4ClasesAbstractas.form.validador;

public class LargoValidador extends Validador implements MensajeFormateable{

    protected String mensaje="El campo %s debe tener un minimo de %d carácteres y un máximo de %d ";
    private int min;
    private int max=Integer.MAX_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        // this.mensaje=String.format(this.mensaje,min,max);
        if(valor==null)return true;
        return (valor.length()>min && valor.length()<max );
    }

    @Override
    public String getMensajeFormateado(String campo){
        return String.format(this.mensaje,campo,min,max);
    }
}
