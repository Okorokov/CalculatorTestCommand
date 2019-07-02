package com.example.calculatortestcommand;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.calculatortestcommand.Presenter.Presenter;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    private MainContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new Presenter(this);
        mPresenter.init();
    }

    @Override
    public void onShowLog(double x, double y, double equally) {
        Log.d(this.getLocalClassName(), x + " + "+y + " = "+equally);
    }
}
