package com.example.mkv_watch;

import com.example.mkv_watch.model.*;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public Rectangle rectangle;
    public Polygon polygon;
    public Circle circle;
    public Button but;
    public TimeServer timer;
    public ComponentOne componentOne1;
    public ComponentTwo componentTwo2;
    public ComponentThree componentThree3;
    public ImageView img;
    public TextField text;
    public Button text_button;
    public Button image_button;
    public Button timer_button;
    boolean t1;
    boolean c1;
    boolean c2;
    boolean c3;
    ConcreteSubject subject = new ConcreteSubject();

    public void button_first(ActionEvent actionEvent) {
        subject.attach(new ConcreteObserver(" ROMAN"));
        subject.attach(new ConcreteObserver(" ILYA"));
        subject.attach(new ConcreteObserver(" MAKSIM"));

        //subject.notifyAllObserver();
    }

    public void button_second(ActionEvent actionEvent) {
        subject.tick();
    }

    public void Tim(ActionEvent actionEvent) {
        if (!this.c1) {
            this.timer.attach(this.componentOne1);
            this.c1 = true;
            this.but.setText("ON");
        } else {
            this.timer.detach(this.componentOne1);
            this.c1 = false;
            this.but.setText("OFF");
        }

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.timer = new TimeServer();
        this.componentOne1 = new ComponentOne(this.rectangle, this.polygon, this.circle);
        this.componentTwo2 = new ComponentTwo(this.text);
        this.componentThree3 = new ComponentThree(this.img);
        this.timer.attach(this.componentOne1);
        this.timer.attach(this.componentTwo2);
        this.timer.attach(this.componentThree3);
        this.timer.start();
        this.t1 = this.c1 = this.c2 = this.c3 = true;
    }
    public void text_go(ActionEvent actionEvent) {
        if (!this.c2) {
            this.timer.attach(this.componentTwo2);
            this.c2 = true;
            this.text_button.setText("ON");
        } else {
            this.timer.detach(this.componentTwo2);
            this.c2 = false;
            this.text_button.setText("OFF");
        }

    }

    public void img_go(ActionEvent actionEvent) {
        if (!this.c3) {
            this.timer.attach(this.componentThree3);
            this.c3 = true;
            this.image_button.setText("ON");
        } else {
            this.timer.detach(this.componentThree3);
            this.c3 = false;
            this.image_button.setText("OFF");
        }

    }

    public void timer_on(ActionEvent actionEvent) {
        if (!this.t1) {
            this.timer.restart();
            this.t1 = true;
            this.timer_button.setText("Timer_ON");
        } else {
            this.timer.stop();
            this.t1 = false;
            this.timer_button.setText("Timer_OFF");
        }

    }
}