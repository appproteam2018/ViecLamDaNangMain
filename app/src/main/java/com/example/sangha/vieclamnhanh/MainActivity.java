package com.example.sangha.vieclamnhanh;

import android.app.Activity;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.example.sangha.vieclamnhanh.JDBC.JDBCController;
import com.example.sangha.vieclamnhanh.JDBC.UserModel;

import java.sql.SQLException;

public class MainActivity  extends AppCompatActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    Button btSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControl();


    }
    private void addControl()
    {
       viewPager = (ViewPager)findViewById(R.id.viewPager);
       tabLayout =(TabLayout)findViewById(R.id.tabLayout);
       FragmentManager fragmentManager = getSupportFragmentManager();
       PagerAdapter pagerAdapter = new PagerAdapter(fragmentManager);
       viewPager.setAdapter(pagerAdapter);
       tabLayout.setupWithViewPager(viewPager);
       viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
       tabLayout.setTabsFromPagerAdapter(pagerAdapter);


    }



    @Override
    public void onClick(View view) {

    }
}
