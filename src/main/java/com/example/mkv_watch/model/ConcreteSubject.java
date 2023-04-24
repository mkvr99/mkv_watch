package com.example.mkv_watch.model;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    private ArrayList<Observer> observers= new ArrayList<Observer>();


    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update(this);
        }

    }

    @Override
    public void attach(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observers.remove(obs);
    }

    public void tick(){
        notifyAllObserver();
    }
}
