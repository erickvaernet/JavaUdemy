package M8Generics.genericClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Clase con uso de genéricos en lugar de Object, tiene un Parametro Genérico
public class CamionGenerico<T> implements Iterable<T>{

    private List<T> objetos;
    private int max;

    /*Si bien en el constructor no se pone <>, si es necesario a la hora de declarar un tipo CamionGenerico agregar
    entre <> el tipo de dato que se va a usar, ejemplo: CamionGenerico<Animal> camionG= new CamionGenerico(3);*/
    public CamionGenerico(int max) {
        this.max = max;
        this.objetos= new ArrayList<>();
    }

    public void add(T objeto){
        if (objetos.size()<this.max){
            this.objetos.add(objeto);
        }else{
            throw new RuntimeException("No hay más espacio en el camion");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
