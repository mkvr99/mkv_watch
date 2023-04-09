module com.example.mkv_build {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mkv_build to javafx.fxml;
    exports com.example.mkv_build;
}