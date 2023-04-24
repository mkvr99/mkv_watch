package com.example.mkv_watch.model;

import java.util.*;

import static java.time.Clock.tick;

public class TimeServer implements Subject {

    Timer timer;
    TimerTask timertask = new TimerTask() {
        public void run() {
            TimeServer.this.tick();
        }
    };

    List<Observer> observers = new ArrayList<Observer>();

    public TimeServer() {
        this.timer = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                tick();
            }
        };
        timer.schedule(task, 0, 1000);
    }

    private  void tick(){
        notifyAllObserver();
    }


    @Override
    public void notifyAllObserver() {
        Iterator var1 = this.observers.iterator();

        while(var1.hasNext()) {
            Observer observer = (Observer)var1.next();
            observer.update(this);
        }
    }

    @Override
    public void attach(Observer obs) {
        this.observers.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        this.observers.remove(obs);
    }

    public void restart() {
        this.timer = new Timer();
        this.timertask = new TimerTask() {
            public void run() {
                TimeServer.this.tick();
            }
        };
        this.start();
    }

    public void start() {
        this.timer.schedule(this.timertask, 0L, 1000L);
    }

    public void stop() {
        this.timer.cancel();
        this.timer.purge();
    }

}