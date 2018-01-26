package com.example.sangha.vieclamnhanh;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.sangha.vieclamnhanh.fragment.fragment1;
import com.example.sangha.vieclamnhanh.fragment.fragment3;

/**
 * Created by SangHa on 1/16/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    PagerAdapter(FragmentManager fragmentManager)
    {
        super(fragmentManager);
    }
    @Override
    public Fragment getItem(int position)
    {
            Fragment frag = null;
            switch (position)
            {
                case 0:
                    frag= new fragment1();
                    break;
                case 1:
                    frag = new fragment3();
                       break;



            }
            return frag;

    }
    @Override
    public int getCount()
    {
        return 2;

    }
    @Override
    public CharSequence getPageTitle(int position)
    {
        String title="";
        switch(position)
        {
            case 0:
                title="Xem";
                break;
            case 1:
                title="Đăng";
                break;


        }
        return title;
    }
}
