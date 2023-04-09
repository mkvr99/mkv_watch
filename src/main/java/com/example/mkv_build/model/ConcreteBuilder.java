package com.example.mkv_build.model;

import javafx.scene.paint.Color;

public class ConcreteBuilder implements Builder{
    private Indicator indicator = new Indicator();
    private float start;
    private float stop;
    private int ktemp = 0;

    public ConcreteBuilder() {
    }

    public void drawRectBackground(int x, int y, int height, int width) {
        this.indicator.getRectangle_background().setX((double)x);
        this.indicator.getRectangle_background().setY((double)y);
        this.indicator.getRectangle_background().setHeight((double)height);
        this.indicator.getRectangle_background().setWidth((double)width);
        this.indicator.getRectangle_background().setFill(Color.GOLD);
    }

    public void drawRectIndicator(int x, int y, int height, int width) {
        this.indicator.getRectangle_indicator().setX((double)x);
        this.indicator.getRectangle_indicator().setY((double)y);
        this.indicator.getRectangle_indicator().setHeight((double)height);
        this.indicator.getRectangle_indicator().setWidth((double)width);
        this.indicator.getRectangle_indicator().setFill(Color.DARKOLIVEGREEN);
    }

    public void drawStartStopLabel(int x_start, int y_start, String text_start, int x_point, int y_point, String text_point, int x_end, int y_end, String text_end) {
        this.indicator.getLabel_start().setLayoutX((double)x_start);
        this.indicator.getLabel_start().setLayoutY((double)y_start);
        this.indicator.getLabel_start().setText(text_start);
        this.indicator.getLabel_point().setLayoutX((double)x_point);
        this.indicator.getLabel_point().setLayoutY((double) y_point);
        this.indicator.getLabel_point().setText(text_point);
        this.indicator.getLabel_end().setLayoutX((double)x_end);
        this.indicator.getLabel_end().setLayoutY((double)y_end);
        this.indicator.getLabel_end().setText(text_end);
    }

    public void drawTitle(int x_title, int y_title, String text_title) {
        this.indicator.getLabel_title().setLayoutX((double)x_title);
        this.indicator.getLabel_title().setLayoutY((double)y_title);
        this.indicator.getLabel_title().setText(text_title);
    }

    public Indicator build() {
        return this.indicator;
    }
}
