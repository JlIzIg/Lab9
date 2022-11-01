package com.example.lab9;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class Figures {

    public ObservableList<Square> getSquareList() {

        int numberOfSquares = 20;
        ArrayList<Square> squares = new ArrayList<>();
        for (int i = 0; i <= numberOfSquares; i++) {
            squares.add(new Square((int) (Math.random() * 76)));
        }
        ObservableList<Square> list = FXCollections.observableArrayList(squares);
        return list;
    }

    public ObservableList<Prism> getPrismList() {

        int numberOfPrisms = 20;
        ArrayList<Prism> prisms = new ArrayList<>();
        for (int i = 0; i <= numberOfPrisms; i++) {
            prisms.add(new Prism((int) (Math.random() * 11), (int) (Math.random() * 76)));
        }
        ObservableList<Prism> list = FXCollections.observableArrayList(prisms);
        return list;

    }

    public TableView createTableSquares() {
        TableView<Square> tableSquares = new TableView<Square>();
        TableColumn<Square, Double> sideOfSquareCol //
                = new TableColumn<Square, Double>("Side");
        TableColumn<Square, Double> perimeterCol//
                = new TableColumn<Square, Double>("Perimeter");
        TableColumn<Square, Double> areaCol//
                = new TableColumn<Square, Double>("Area");
        TableColumn<Square, Double> diagonalCol//
                = new TableColumn<Square, Double>("Diagonal");
        sideOfSquareCol.setCellValueFactory(new PropertyValueFactory<>("SideOfSquare"));
        perimeterCol.setCellValueFactory(new PropertyValueFactory<>("Perimeter"));
        areaCol.setCellValueFactory(new PropertyValueFactory<>("Area"));
        diagonalCol.setCellValueFactory(new PropertyValueFactory<>("Diagonal"));
        ObservableList<Square> list = getSquareList();
        tableSquares.setPrefWidth(400);
        tableSquares.setPrefHeight(320);
        tableSquares.setItems(list);
        tableSquares.getColumns().addAll(sideOfSquareCol, perimeterCol, areaCol, diagonalCol);
        return tableSquares;
    }


    public TableView createTablePrisms() {
        TableView<Prism> tablePrisms = new TableView<Prism>();
        TableColumn<Prism, Double> heightCol //
                = new TableColumn<Prism, Double>("Height");
        TableColumn<Prism, Double> sideCol //
                = new TableColumn<Prism, Double>("Side");
        TableColumn<Prism, Double> perCol//
                = new TableColumn<Prism, Double>("Perimeter");
        TableColumn<Prism, Double> arCol//
                = new TableColumn<Prism, Double>("Area");
        TableColumn<Prism, Double> volCol//
                = new TableColumn<Prism, Double>("Volume");
        TableColumn<Prism, Double> digCol//
                = new TableColumn<Prism, Double>("Diagonal");
        heightCol.setCellValueFactory(new PropertyValueFactory<>("Height"));
        sideCol.setCellValueFactory(new PropertyValueFactory<>("SideOfSquare"));
        perCol.setCellValueFactory(new PropertyValueFactory<>("Perimeter"));
        arCol.setCellValueFactory(new PropertyValueFactory<>("Area"));
        volCol.setCellValueFactory(new PropertyValueFactory<>("Volume"));
        digCol.setCellValueFactory(new PropertyValueFactory<>("Diagonal"));
        ObservableList<Prism> list2 = getPrismList();
        tablePrisms.setPrefWidth(400);
        tablePrisms.setPrefHeight(320);
        tablePrisms.setItems(list2);
        tablePrisms.getColumns().addAll(heightCol, sideCol, perCol, arCol, volCol, digCol);
        return tablePrisms;
    }

}
