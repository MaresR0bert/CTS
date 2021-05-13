package ro.ase.acs.observer;

import java.util.ArrayList;

public abstract class Observabil {
    private ArrayList<Observer> observerArrayList = new ArrayList<>();

    public void abonareNewsletter(Observer observer) {
        observerArrayList.add(observer);
    }

    public void dezabonareNewsletter(Observer observer){
        observerArrayList.remove(observer);
    }

    protected void trimiteMail(String subiect){
        for(Observer obs : this.observerArrayList){
            obs.primesteMail(subiect);
        }
    }
}
