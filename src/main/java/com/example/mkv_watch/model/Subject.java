package com.example.mkv_watch.model;

public interface Subject {
    public void notifyAllObserver();//уведомить

    public void attach(Observer obs);//добавить слушателя

    public void detach(Observer obs);//удалить слушателя

}
