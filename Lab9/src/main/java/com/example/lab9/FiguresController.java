package com.example.lab9;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class FiguresController {
    Figures figures = new Figures();
    ObservableList<Square> list = figures.getSquareList();
    @FXML
    TextField filterField;
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
        FilteredList<Square> filteredData = new FilteredList<>(list, p -> true);
        filterField.textProperty().addListener((observable, oldValue, newValue) -> {
            filteredData.setPredicate(square -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                if (String.valueOf(square.getSideOfSquare()).contains(newValue)) {
                    return true;
                } else if (String.valueOf(square.getPerimeter()).contains(newValue)) {
                    return true;
                } else if (String.valueOf(square.getArea()).contains(newValue)) {
                    return true;
                } else if (String.valueOf(square.getDiagonal()).contains(newValue)) {
                    return true;
                }
                return false;
            });
        });
        SortedList<Square> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(tableSquares.comparatorProperty());
        tableSquares.setItems(sortedData);
    }

}
