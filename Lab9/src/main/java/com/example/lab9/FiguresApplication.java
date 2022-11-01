package com.example.lab9;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class FiguresApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Figures figures = new Figures();
        TableView<Square> tableSquares = figures.createTableSquares();
        TableView<Prism> tablePrisms = figures.createTablePrisms();
        stage.setTitle("Figures Info Table");
        FlowPane root = new FlowPane(Orientation.VERTICAL, tableSquares, tablePrisms);
        Scene scene = new Scene(root, 400, 640);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}