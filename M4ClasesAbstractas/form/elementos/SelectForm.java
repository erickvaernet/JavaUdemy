package M4ClasesAbstractas.form.elementos;

import M4ClasesAbstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementosForm{

    private List<Opcion> opciones; //Interfaz List, se implementa en ArrayList
    //Las llaves indica el tipo de objeto y siempre se indica con genericos


    public SelectForm(String nombre) {
        super(nombre);
        this.opciones=new ArrayList<Opcion>();//se implementa List en Arraylist
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones =opciones;
    }

    //Para Agregar opciones de forma encadenada. EJ: form.addOpcion(1,2).addOpcion(3).addOpcion(23) y asi, es necesario
    //retornar el mismo objeto
    public SelectForm addOpcion(Opcion op){
        this.opciones.add(op);
        return this;
    }

    @Override
    public String dibujarHTML() {
        StringBuilder sb= new StringBuilder("<select ");
        sb.append("name='").append(this.nombre).append("'>");
        for (Opcion op:this.opciones){
            sb.append("\n<option value='").append(op.getValor()).append("'");
            if(op.isSelected()) {
                sb.append(" selected");
                this.valor= op.getValor();
            }
            sb.append(">").append(op.getNombre()).append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
