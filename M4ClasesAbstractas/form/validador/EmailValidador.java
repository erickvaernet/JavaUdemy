package M4ClasesAbstractas.form.validador;

public class EmailValidador extends Validador{

    protected String mensaje="El campo %s tiene un formato de email invalido";
    private final static String EMAIL_REGEX="^(.+)@(.+)$";
    /*
     el ^ significa que va a valildar  el String desde el comienzo de la linea, mientras $ es final. El parentesis
     idica grupo de caracteres, y el punto indica cualquier caracter, + que ese caracter se puede repetir cualquier
     cantidad de veces, despues el @ y devuelta (.+) y $ que valide al final
     */

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    //La mejor forma de validar mail es con expresiones regulares pero al no conocer todavia se opta por una forma màs simple
    @Override
    public boolean esValido(String valor) {
        return valor.matches(EMAIL_REGEX);
    }
}
