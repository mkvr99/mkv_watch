package com.example.mkv_build.model;

public interface Builder {
    void drawRectBackground(int x, int y, int height, int weight);

    void drawRectIndicator(int x, int y, int height, int weight);

    void drawStartStopLabel(int x_1, int y_1, String text_1, int x_3, int y_3, String text_3);

    void drawTitle(int x, int y, String text);

    Indicator build();
}
