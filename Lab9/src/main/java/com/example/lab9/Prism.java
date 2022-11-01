package com.example.lab9;

public class Prism extends Square {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height < 0) {
            this.height = height * (-1.0);
        } else if (height == 0) {
            this.height = 1;
        } else this.height = height;
    }

    public Prism(double height, double sideOfSquare) {
        super(sideOfSquare);
        setHeight(height);
    }

    @Override
    public double getArea() {
        return super.getArea() * 2.0 + 4.0 * getHeight() * getSideOfSquare();
    }

    public double getVolume() {
        return super.getArea() * getHeight();
    }

    @Override
    public double getDiagonal() {
        return Math.sqrt(super.getDiagonal() * super.getDiagonal() + getHeight() * getHeight());
    }
}
