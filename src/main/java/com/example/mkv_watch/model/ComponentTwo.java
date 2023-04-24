package com.example.mkv_watch.model;

import javafx.scene.control.TextField;

import java.util.Random;

public class ComponentTwo implements Observer{
    TextField field;
    public ComponentTwo(TextField textfield){this.field=textfield;}

    @Override
    public void update(Subject subject) {
        Random random = new Random();
        int i = random.nextInt();
        this.field.setText(Integer.toString(i));
    }

}
