package com.example.mkv_watch.model;

import javafx.scene.paint.Color;

import java.util.Random;

public class Colors {
    private int b;
    private int r;
    private int y;
    private Random random = new Random();

    Colors() {
        this.b = this.r = this.y = 0;
    }

    public Color update() {
        this.b = this.random.nextInt(0, 255);
        this.y = this.random.nextInt(0, 255);
        this.r = this.random.nextInt(0, 255);
        return Color.rgb(this.b, this.r, this.y);
    }
}
