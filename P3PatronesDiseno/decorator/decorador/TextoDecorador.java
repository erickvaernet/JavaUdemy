package P3PatronesDiseno.decorator.decorador;

import P3PatronesDiseno.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {

    protected Formateable texto;

    public TextoDecorador (Formateable texto){
        this.texto= texto;
    }


}
