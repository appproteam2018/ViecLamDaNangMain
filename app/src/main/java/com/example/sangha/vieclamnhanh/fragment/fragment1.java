package com.example.sangha.vieclamnhanh.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.support.v4.app.FragmentManager;

import com.example.sangha.vieclamnhanh.R;

/**
 * Created by SangHa on 1/16/2018.
 */

public class fragment1 extends android.support.v4.app.Fragment

{
    FloatingActionButton ftButton;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {

        View view= inflater.inflate(R.layout.fragment1,container,false);


        ftButton=(FloatingActionButton)view.findViewById(R.id.ftButton);
        final BottomSheetLayout bottomSheetLayout = new BottomSheetLayout();
        ftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                bottomSheetLayout.show(getActivity().getSupportFragmentManager(),"example");

            }
        });



        return view;

    }
}
