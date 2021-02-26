package N1Excepciones.repositorio.exceptions;

public class DuplicateRegisterException extends AccessWriteDataException{

    public DuplicateRegisterException(String message) {
        super(message);
    }
}
