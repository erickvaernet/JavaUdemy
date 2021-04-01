package P3PatronesDiseno.decorator.decorador;

import P3PatronesDiseno.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends  TextoDecorador{

    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}
