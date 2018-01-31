package com.example.sangha.vieclamnhanh;

import android.app.Activity;
import android.graphics.Color;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Size;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.miguelcatalan.materialsearchview.MaterialSearchView;


public class MainActivity  extends AppCompatActivity  {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private Toolbar toolbar;
    private MaterialSearchView materialSearchView;
    Button btSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=(Toolbar)findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setIcon(R.mipmap.ic_toolbar);
        toolbar.setTextAlignment(0);
        toolbar.setTitleTextColor(Color.parseColor("#ffffff"));
        materialSearchView=(MaterialSearchView)findViewById(R.id.searchView);
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
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item,menu);
        MenuItem item=menu.findItem(R.id.action_search);
        materialSearchView.setMenuItem(item);
        return  true;
    }
}
