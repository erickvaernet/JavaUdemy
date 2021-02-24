package M82Generics.modelo;

public class ClientePremium extends Cliente implements Comparable{

    public ClientePremium() {
    }

    public ClientePremium(String nombre, String apellido) {
        super(nombre, apellido);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
