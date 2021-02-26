package N1Excepciones;

public class DivCeroException extends Exception{ //Si fuera extends de Runtime excepcion seria unchecked

    public DivCeroException(String message) {
        super(message);
    }
}
