module com.example.morsecodetranslator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.morsecodetranslator to javafx.fxml;
    exports com.example.morsecodetranslator;
}