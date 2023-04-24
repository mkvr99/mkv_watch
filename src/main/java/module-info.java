module com.example.mkv_watch {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mkv_watch to javafx.fxml;
    exports com.example.mkv_watch;
}