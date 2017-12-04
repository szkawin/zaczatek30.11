package sample;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class Zakladki {
    public Pane zakladka;

    public void logowanie(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("logowanie.fxml"));

        try {
            Parent pane = loader.load();
            Zakladka1 cntr = loader.getController();
            cntr.setParentController(this);
            zakladka.getChildren().clear();
            zakladka.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void dane(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("dane.fxml"));


        try {
            Parent pane = loader.load();
            Zakladka2 cntr = loader.getController();
            cntr.setParentController(this);
            zakladka.getChildren().clear();
            zakladka.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void statystyki(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("statystyki.fxml"));


        try {
            Parent pane = loader.load();
            Zakladka3 cntr = loader.getController();
            cntr.setParentController(this);
            zakladka.getChildren().clear();
            zakladka.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
