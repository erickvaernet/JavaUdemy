package M4ClasesAbstractas.form.elementos;

import M4ClasesAbstractas.form.validador.LargoValidador;
import M4ClasesAbstractas.form.validador.MensajeFormateable;
import M4ClasesAbstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

public abstract class ElementosForm {

    protected String valor;
    protected String nombre;
    protected List<Validador> validadores;
    protected List<String> errores;


    public ElementosForm() {
        this.validadores= new ArrayList<>();
        this.errores= new ArrayList<>();
    }

    public ElementosForm(String nombre) {
        this(); //se invoca el constructor por defecto
        this.nombre = nombre;
    }

    public ElementosForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    /*
    public String getNombre() {
        return nombre;
    }
    */

    public List<String> getErrores() {
        return errores;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){

        for (Validador v:validadores) {
            if(!v.esValido(this.valor)){
                if(v instanceof MensajeFormateable){
                    this.errores.add(((LargoValidador) v).getMensajeFormateado(nombre));
                }
                else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty(); //o con .size()==0
    }
    public abstract String dibujarHTML();

}
