package com.example.lab4_mkv;

import com.example.lab4_mkv.model.IIterator;
import com.example.lab4_mkv.model.ImageCollection;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public Timeline timeline = new Timeline();
    public ImageCollection imgs = new ImageCollection("s");
    public IIterator iter_main = imgs.getIterator();
    public ImageView imageView;
    public TextField field;

    public int i = 5000;

    public void start(ActionEvent actionEvent) {
        timeline.play();
    }

    public void forward(ActionEvent actionEvent) {
        imageView.setImage((Image) iter_main.next());
    }

    public void settime(ActionEvent actionEvent) {
        i = Integer.parseInt(field.getText());
        timeline.setCycleCount(i);
    }

    public void stop(ActionEvent actionEvent) {
        timeline.stop();
    }

    public void back(ActionEvent actionEvent) {
        imageView.setImage((Image) iter_main.preview());
    }

    public void pause(ActionEvent actionEvent) {
    timeline.pause();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.getKeyFrames().add(new KeyFrame(Duration.millis(i), new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (iter_main.hasNext(1))
                    imageView.setImage((Image) iter_main.next());
            }
        }));
    }
}