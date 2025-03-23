module com.example.numberguessinggame {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.numberguessinggame to javafx.fxml;
    exports com.example.numberguessinggame;
}