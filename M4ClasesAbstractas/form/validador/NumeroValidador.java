package M4ClasesAbstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje="El campo %s debe ser un número";

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
        /*
         Usamos try catch para validar, si es un número, no habra problema en la conversion y se retorna true, de lo
        contrario entra en el catch y retorna false
        */
        try {
            Integer.parseInt(valor);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
