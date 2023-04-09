package com.example.mkv_build.model;

public class Director {
    public Director() {
    }

    public Indicator construct(ConcreteBuilder builder) {
        builder.drawRectBackground(100, 200, 30, 400);
        builder.drawRectIndicator(100, 200, 30, 100);
        builder.drawStartStopLabel(100, 230, "100", 200,230, "112.5", 480, 230, "150");
        builder.drawTitle(200, 180, "Мощность а/м для подсчета налога");
        return builder.build();
    }

}
