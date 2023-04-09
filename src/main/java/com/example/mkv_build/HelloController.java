package com.example.mkv_build;

import com.example.mkv_build.model.ConcreteBuilder;
import com.example.mkv_build.model.Director;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class HelloController {

    Director director = new Director();
    ConcreteBuilder builder = new ConcreteBuilder();

    public Pane pane;

    public void press_one(ActionEvent actionEvent) {
        this.director.construct(this.builder).show(this.pane);
    }

}