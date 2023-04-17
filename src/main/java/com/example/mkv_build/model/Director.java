package com.example.mkv_build.model;

public class Director {
    public Director() {
    }

    public Indicator construct(ConcreteBuilder builder) {
        builder.drawRectBackground(100, 200, 30, 400);
        builder.drawRectIndicator(100, 200, 30, 100);
        builder.drawStartStopLabel(100, 230, "100", 480, 230, "150");
        builder.drawTitle(200, 180, "Возрастание мощности");
        return builder.build();
    }

    public Indicator construct(ConcreteBuilder builder, double width) {
        builder.drawRectBackground(100 , 200, 30, 400);
        builder.drawRectIndicator(100, 200, 30, (int)width);
        builder.drawStartStopLabel(100, 230, "100", 480, 230, "150");
        builder.drawTitle(200, 180, "Возрастание мощности");
        return builder.build();
    }

}
