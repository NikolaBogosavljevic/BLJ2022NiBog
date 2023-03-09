module com.example.vehiclerental {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.vehiclerental to javafx.fxml;
    exports com.example.vehiclerental;
}