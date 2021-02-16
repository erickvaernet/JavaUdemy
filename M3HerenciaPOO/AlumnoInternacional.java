package M3HerenciaPOO;

public final class AlumnoInternacional extends Alumno{

    private String paisOrigen;
    private int notaIdioma;

    public AlumnoInternacional(){
        System.out.println("Se llamo a constructor de AlumnoInternacional");
    }

    public AlumnoInternacional(String nombre, String apellido, String colegio, String paisOrigen) {
        super(nombre, apellido, colegio);
        this.paisOrigen = paisOrigen;
    }

    public AlumnoInternacional(String nombre, String apellido, int edad, String colegio, String paisOrigen) {
        super(nombre, apellido, edad, colegio);
        this.paisOrigen = paisOrigen;
    }

    public AlumnoInternacional(String nombre, String apellido, int edad, String mail, String colegio, String paisOrigen) {
        super(nombre, apellido, edad, mail, colegio);
        this.paisOrigen = paisOrigen;
    }


    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getNotaIdioma() {
        return notaIdioma;
    }

    public void setNotaIdioma(int notaIdioma) {
        this.notaIdioma = notaIdioma;
    }

    //Método prop sobrescrito

    @Override
    public float calcPromedio() {
        return (super.calcPromedio()*3+notaIdioma)/4;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", notaIdioma=" + notaIdioma+
                ", paisOrigen='" + paisOrigen + '\'';
    }
}
