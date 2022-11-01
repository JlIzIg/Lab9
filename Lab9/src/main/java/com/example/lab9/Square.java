package com.example.lab9;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Square {
    private double sideOfSquare;

    public double getSideOfSquare() {
        return sideOfSquare;
    }

    public void setSideOfSquare(double sideOfSquare) {
        if (sideOfSquare < 0) {
            this.sideOfSquare = sideOfSquare * (-1.0);
        } else if (sideOfSquare == 0) {
            this.sideOfSquare = 1;
        } else this.sideOfSquare = sideOfSquare;
    }

    public Square() {
    }

    public Square(double sideOfSquare) {
        this.setSideOfSquare(sideOfSquare);
    }


    public double getDiagonal() {
        double diagonal = sideOfSquare * Math.sqrt(2.0);
        return diagonal;
    }

    public double getPerimeter() {
        double perimeter = 4 * sideOfSquare;
        return perimeter;
    }

    public double getArea() {
        double area = sideOfSquare * sideOfSquare;
        return area;
    }


}
