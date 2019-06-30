package com.example.calculatortestcommand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.calculatortestcommand.Model.Calc;

public class MainActivity extends AppCompatActivity{

    private Calc calc;
    private Logic logic;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc=new Calc();
        calc.setX(5.0);
        calc.setY(6.0);

        logic=new Logic();
        calc.setEqually(logic.onSum(calc.getX(),calc.getY()));

        Log.d(this.getLocalClassName(), calc.getX()+" + "+calc.getY()+" = "+calc.getEqually());
    }
}
