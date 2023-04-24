package com.example.mkv_watch.model;

import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;

public class ComponentOne implements Observer{
    Rectangle rect;
    Polygon pol;
    Circle cir;
    Colors colors = new Colors();
    int b;
    int r;
    int y;

    public ComponentOne(Rectangle rectangle, Polygon polygon, Circle circle) {
        this.b = this.r = this.y = 0;
        this.rect = rectangle;
        this.pol = pol;
        this.cir = circle;
    }

    @Override
    public void update(Subject subject) {
        this.rect.setFill(this.colors.update());
        this.pol.setFill(this.colors.update());
        this.cir.setFill(this.colors.update());
    }
}
