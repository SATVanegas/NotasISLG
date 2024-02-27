module org.example.votaciones {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.votaciones to javafx.fxml;
    exports org.example.votaciones;
}