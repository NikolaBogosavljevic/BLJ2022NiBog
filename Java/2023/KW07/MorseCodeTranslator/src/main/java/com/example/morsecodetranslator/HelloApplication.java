package com.example.morsecodetranslator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.stream.Collectors;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        String actual = ALL_CONSOLES.stream().filter(gc -> gc.getInitialRelease().isBefore(LocalDate.of(2004, 9, 27)))
                .sorted()
                .map(gc -> "- "+ gc.getName()+" Gen: "+ gc.getGeneration())
                .collect(Collectors.joining("\n"));
        System.out.println(actual);
    }

    public static void main(String[] args) {
        launch();
    }
}