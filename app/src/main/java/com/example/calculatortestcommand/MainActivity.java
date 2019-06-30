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
        logic=new Logic();
        double inputFromViewY = 0;
        double x = calc.getEqually();
        calc.setEqually(logic.onSum(calc.getEqually(), inputFromViewY));

        Log.d(this.getLocalClassName(), x + " + "+inputFromViewY + " = "+calc.getEqually());
    }
}
