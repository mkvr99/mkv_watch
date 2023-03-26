module com.example.lab4_mkv {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab4_mkv to javafx.fxml;
    exports com.example.lab4_mkv;
}