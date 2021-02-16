package M3HerenciaPOO;

public class Alumno extends Persona1 {

    private String colegio;
    private int notaMat;
    private int notaLit;
    private int notaQca;

    public Alumno(){

        System.out.println("Se llamo a constructor de Alumno");
    }

    public Alumno(String nombre,String apellido,String colegio) {
        super(nombre,apellido);
        this.colegio = colegio;
    }

    public Alumno(String nombre, String apellido, int edad, String colegio) {
        super(nombre, apellido, edad);
        this.colegio = colegio;
    }

    public Alumno(String nombre, String apellido, int edad, String mail, String colegio) {
        super(nombre, apellido, edad, mail);
        this.colegio = colegio;
    }

    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public int getNotaMat() {
        return notaMat;
    }

    public void setNotaMat(int notaMat) {
        this.notaMat = notaMat;
    }

    public int getNotaLit() {
        return notaLit;
    }

    public void setNotaLit(int notaLit) {
        this.notaLit = notaLit;
    }

    public int getNotaQca() {
        return notaQca;
    }

    public void setNotaQca(int notaQca) {
        this.notaQca = notaQca;
    }

    //Métodos propios
    public float calcPromedio(){
        return (notaLit+notaQca+notaMat)/3;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", colegio='" + colegio + '\'' +
                ", notaMat=" + notaMat +
                ", notaLit=" + notaLit +
                ", notaQca=" + notaQca;
    }
}
