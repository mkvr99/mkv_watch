package com.example.mkv_watch.model;

import javafx.scene.image.ImageView;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComponentThree implements Observer{

    ImageView imageView;
    List<javafx.scene.image.Image> images;
    List<File> ims;

    public ComponentThree(ImageView imageView) {
        this.imageView = imageView;
        this.images = new ArrayList();
        this.ims = new ArrayList();

        for(int i = 1; i < 4; ++i) {
            this.ims.add(new File("images/im1 (" + i + ").jpg"));
            String path = ((File)this.ims.get(i - 1)).getPath();
            this.new_img("G:\\ProjectsIdea\\mkv_watch\\images\\im (" + i + ").jpg");
        }
    }

    private void new_img(String path) {
        this.images.add(new javafx.scene.image.Image(path));
    }

    @Override
    public void update(Subject subject) {
        Random random = new Random();
        this.imageView.setImage((javafx.scene.image.Image)this.images.get(random.nextInt(0, this.images.size())));
    }
}
