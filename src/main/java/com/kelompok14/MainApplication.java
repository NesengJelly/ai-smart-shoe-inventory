package com.kelompok14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Nama "hello-view.fxml" harus persis dengan nama file desainmu di Scene Builder
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("hello-view.fxml"));

        // Ukuran awal jendela aplikasi (bisa disesuaikan)
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);

        stage.setTitle("AI Shoe Inventory - Kelompok 14");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}