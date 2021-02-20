package M6Interfaces.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculim extends Hoja implements Imprimible{

    private String persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculim(String persona, String carrera, String conteido) {
        super(conteido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculim addExperiencia(String experiencia){
        this.experiencia.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb= new StringBuilder("Persona: ");
        sb.append(persona).append("\n")
                .append("Carrera:").append(carrera).append("\n")
                .append("Resumen:").append(conteido).append("\n")
                .append("Experiencia:\n");
        experiencia.forEach(e->sb.append("-").append(e).append("\n"));

        return sb.toString();
    }
}
