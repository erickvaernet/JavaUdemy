package P3PatronesDiseno.decorator.decorador;

import P3PatronesDiseno.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador{


    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return this.texto.darFormato().toUpperCase( );
    }
}
