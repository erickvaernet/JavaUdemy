package M6Interfaces.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    private List<Imprimible>paginas;
    private String autor;
    private String titulo;
    private Generos genero;

    public Libro(String autor, String titulo, Generos genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas= new ArrayList<>();
    }

    public Libro addPagina(Pagina pagina){
        paginas.add(pagina);
        return this;
    }

    public String imprimir(){
        StringBuilder sb= new StringBuilder("*Libro*\n");
        sb.append("Titulo:").append(titulo).append("\n")
                .append("Autor").append(autor).append("\n")
                .append("Genero:").append(genero).append("\n");

        paginas.forEach(p-> sb.append(p.imprimir()).append("\n"));

        return sb.toString();
    }
}
