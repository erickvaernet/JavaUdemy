package M3HerenciaPOO;

public class Profesor extends Persona1{

    private String asignatura;

    public Profesor(){

        System.out.println("Se llamo a constructor de Profesor");
    }

    public Profesor(String nombre, String apellido, String asignatura) {
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public Profesor(String nombre, String apellido, int edad, String asignatura) {
        super(nombre, apellido, edad);
        this.asignatura = asignatura;
    }

    public Profesor(String nombre, String apellido, int edad, String mail, String asignatura) {
        super(nombre, apellido, edad, mail);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", asignatura='" + asignatura + '\'';
    }
}
