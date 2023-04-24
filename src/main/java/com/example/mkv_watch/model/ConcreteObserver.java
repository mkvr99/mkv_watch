package com.example.mkv_watch.model;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObserver implements Observer{
    private String name;

    public ConcreteObserver(String name, Subject subject) {
        this.name = name;
        subject.attach(this);
    }

    public ConcreteObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(subject+this.name);
    }
}
