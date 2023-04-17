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

    public TextField field;
    Director director = new Director();
    ConcreteBuilder builder = new ConcreteBuilder();

    private Timeline timeline;
    private LocalTime targetTime;
    private LocalTime currentTime;
    private LocalTime startTime;
    private Duration tempDuration;
    double growth;
    double tempWidght;

    public Pane pane;
    private double gr;

    public void press_one(ActionEvent actionEvent) {
        this.director.construct(this.builder).show(this.pane);
    }

    public void time(ActionEvent actionEvent) {
        LocalTime tempTime = LocalTime.parse(this.field.getText());
        this.targetTime = LocalTime.now().plusHours((long)tempTime.getHour()).plusMinutes((long)tempTime.getMinute()).plusSeconds((long)tempTime.getSecond());
        //System.out.println(this.targetTime);
        this.pane.getChildren().clear();
        this.start();
    }

    private void stop() {
        if (this.timeline != null) {
            this.timeline.stop();
        }

    }

    private void start() {
        this.startTime = LocalTime.now();
        this.tempDuration = Duration.millis((double)this.startTime.until(this.targetTime, ChronoUnit.SECONDS));
        this.growth = 400.0 / this.tempDuration.toMillis();
        //System.out.println(this.tempDuration.toMillis());
        //System.out.println(this.growth);
        this.tempWidght = 0.0;
        this.timeline = new Timeline(new KeyFrame(Duration.seconds(1.0), (event) -> {
            this.currentTime = LocalTime.now();
            System.out.println(this.tempWidght);

                Duration duration = Duration.millis((double)this.currentTime.until(this.targetTime, ChronoUnit.SECONDS));
                long seconds = (long)duration.toSeconds();
                this.pane.getChildren().clear();
                //System.out.println(duration);
                this.tempWidght += this.growth;
                //System.out.println(this.tempWidght);
                this.director.construct(this.builder, this.tempWidght).show(this.pane);
//            if (this.currentTime.getSecond() >= this.targetTime.getSecond()) {
//                timeline.stop();
//                System.out.println("stop");
//            }
            if (this.tempWidght >=400) {
                timeline.stop();
            }
        }, new KeyValue[0]));
        this.timeline.setCycleCount(-1);
        this.timeline.play();
    }
}