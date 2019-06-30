package com.example.calculatortestcommand.Model;


public class Calc{

    private double x;
    private double y;
    private double equally;

    public Calc() {
    }

    public Calc(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Double getEqually() {
        return equally;
    }

    public void setEqually(double equally) {
        this.equally = equally;
    }
}
