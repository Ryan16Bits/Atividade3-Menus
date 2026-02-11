module com.example.atividade1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.example.atividade1.controller to javafx.fxml;
    exports com.example.atividade1;
}