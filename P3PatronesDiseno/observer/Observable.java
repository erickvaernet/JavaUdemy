package P3PatronesDiseno.observer;

import java.util.ArrayList;
import java.util.List;

abstract public class Observable {
    private List<Observer> observadores= new ArrayList<>();


    public void addObserver(Observer obs){
        observadores.add(obs);
    }

    public void remove(Observer obs){
        observadores.remove(obs);
    }

    public void notifyObservers(){
        for (Observer o: this.observadores){
            o.actualizar(this);
        }
    }

}
