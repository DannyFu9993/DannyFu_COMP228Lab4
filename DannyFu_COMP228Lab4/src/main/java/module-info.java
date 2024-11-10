module com.example.lab4javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.lab4javafx to javafx.fxml;
    exports com.example.lab4javafx;
}