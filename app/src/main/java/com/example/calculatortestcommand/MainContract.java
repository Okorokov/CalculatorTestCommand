package com.example.calculatortestcommand;

public interface MainContract {
    interface View{
        void onShowLog(double x, double y, double equally);
    }
    interface Presenter{
        void init();
    }
    interface Repository{}
}
