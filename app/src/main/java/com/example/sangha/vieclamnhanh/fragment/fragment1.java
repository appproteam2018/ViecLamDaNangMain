package com.example.sangha.vieclamnhanh.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sangha.vieclamnhanh.R;

/**
 * Created by SangHa on 1/16/2018.
 */

public class fragment1 extends android.support.v4.app.Fragment

{
    public fragment1(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.fragment1,container,false);


    }
}
