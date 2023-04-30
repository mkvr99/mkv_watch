package com.example.mkv_build.model;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;

public class Indicator {
    private Pane panel = new Pane();


    private Label label_start = new Label();
    private Label label_point=new Label();
    private Label label_end = new Label();
    private Label label_title = new Label();

    public Label getLabel_point() {
        return this.label_point;
    }
    public void setLabel_point(Label label_point) {
        this.label_point = label_point;
    }

    private Rectangle rectangle_indicator = new Rectangle();

    public Label getLabel_end() {

        return this.label_end;
    }

    public void setLabel_end(Label label_end) {

        this.label_end = label_end;
    }

    public Label getLabel_title() {

        return this.label_title;
    }

    public void setLabel_title(Label label_title) {
        this.label_title = label_title;
    }

    public Rectangle getRectangle_indicator() {

        return this.rectangle_indicator;
    }

    public void setRectangle_indicator(Rectangle rectangle_indicator) {
        this.rectangle_indicator = rectangle_indicator;
    }

    public Label getLabel_start() {
        return this.label_start;
    }

    public void setLabel_start(Label label_start) {
        this.label_start = label_start;
    }

    public Indicator() {
    }

    public void add(Pane pane) {
        this.panel.getChildren().add(pane);
    }

    public void show(Pane pane) {
        pane.getChildren().add(this.panel);
        pane.getChildren().add(this.rectangle_indicator);
        pane.getChildren().add(this.label_start);
        //pane.getChildren().add(this.label_point);
        pane.getChildren().add(this.label_end);
        pane.getChildren().add(this.label_title);
    }
}
