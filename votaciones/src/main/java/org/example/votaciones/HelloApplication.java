package org.example.votaciones;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Carga el archivo FXML
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));

        // Crea una escena
        Scene scene = new Scene(root, 800, 600);

        // Establece la escena en el escenario (stage)
        primaryStage.setScene(scene);
        primaryStage.setTitle("Tu aplicación JavaFX");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
