package com.example.calculatortestcommand.Activity;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.calculatortestcommand.Adapter.ViewPagerAdapter;
import com.example.calculatortestcommand.Fragments.EndFragment;
import com.example.calculatortestcommand.Fragments.MainFragment;
import com.example.calculatortestcommand.Fragments.NextFragment;
import com.example.calculatortestcommand.MainContract;
import com.example.calculatortestcommand.Presenter.Presenter;
import com.example.calculatortestcommand.R;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    private MainContract.Presenter mPresenter;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
        mPresenter = new Presenter(this);
        mPresenter.init();
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new MainFragment(), "Main");
        adapter.addFragment(new NextFragment(), "Next");
        adapter.addFragment(new EndFragment(), "End");
        viewPager.setAdapter(adapter);
    }

    @Override
    public void onShowLog(double x, double y, double equally) {
        Log.d(this.getLocalClassName(), x + " + "+y + " = "+equally);
    }
}
