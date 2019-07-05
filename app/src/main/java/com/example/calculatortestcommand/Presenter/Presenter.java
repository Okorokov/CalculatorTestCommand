package com.example.calculatortestcommand.Presenter;

import com.example.calculatortestcommand.Model.ICalc;
import com.example.calculatortestcommand.MainContract;
import com.example.calculatortestcommand.Model.Calc;

public class Presenter implements MainContract.Presenter, ICalc {
    private MainContract.View mView;
    private Calc calc;


    public Presenter(MainContract.View mView) {
        this.mView = mView;
    }

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

    @Override
    public void init() {
        calc=new Calc();
        double inputFromViewY = 5.0;
        double x = calc.getEqually();
        calc.setEqually(onSum(calc.getEqually(), inputFromViewY));
        mView.onShowLog(x,inputFromViewY,calc.getEqually());
    }
}
