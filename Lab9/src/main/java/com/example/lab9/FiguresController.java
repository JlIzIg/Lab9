package com.example.lab9;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class FiguresController {
    Figures figures = new Figures();
    ObservableList<Square> list = figures.getSquareList();
    @FXML
    private TableView<Square> tableSquares;
    @FXML
    private TableColumn<Square, Double> side;
    @FXML
    private TableColumn<Square, Double> perimeter;
    @FXML
    private TableColumn<Square, Double> area;
    @FXML
    private TableColumn<Square, Double> diagonal;

    @FXML
    public void initialize() {
        side.setCellValueFactory(new PropertyValueFactory<Square, Double>("SideOfSquare"));
        perimeter.setCellValueFactory(new PropertyValueFactory<Square, Double>("Perimeter"));
        area.setCellValueFactory(new PropertyValueFactory<Square, Double>("Area"));
        diagonal.setCellValueFactory(new PropertyValueFactory<Square, Double>("Diagonal"));
        tableSquares.setPrefWidth(400);
        tableSquares.setPrefHeight(320);
        tableSquares.setEditable(true);
        tableSquares.setItems(list);
    }

}
