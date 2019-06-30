package com.example.calculatortestcommand;

public class Logic implements ICalc {


    @Override
    public double onSum(double x, double y) {
        return x+y;
    }

    @Override
    public double onSubtraction(double x, double y) {
        return x-y;
    }

    @Override
    public double onDivision(double x, double y) {
        if (y == 0) {
            return 0;
        } else {
            return x/y;
        }
    }

    @Override
    public double onMultiplication(double x, double y) {
        return x*y;
    }
}
