package P3PatronesDiseno.decorator.decorador;

import P3PatronesDiseno.decorator.Formateable;

public class SubrayadoDecordor extends  TextoDecorador{

    public SubrayadoDecordor(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        StringBuilder sb = new StringBuilder(texto.darFormato());
        int largo = sb.length();
        sb.append("\n");
        for(int i=0;i<largo;i++){sb.append("_");}
        return sb.toString();
    }

}
