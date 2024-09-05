module com.example.simplecalulatorproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simplecalulatorproject to javafx.fxml;
    exports com.example.simplecalulatorproject;
}