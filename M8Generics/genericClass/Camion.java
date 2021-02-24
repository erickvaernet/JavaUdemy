package M8Generics.genericClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Clase con uso de Object en lugar de genéricos
public class Camion implements Iterable{

    private List objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos= new ArrayList<>();
    }

    public void add(Object objeto){
        if (objetos.size()<this.max){
            this.objetos.add(objeto);
        }else{
            throw new RuntimeException("No hay más espacio en el camion");
        }
    }

    @Override
    public Iterator iterator() {
        return this.objetos.iterator();
    }
}
