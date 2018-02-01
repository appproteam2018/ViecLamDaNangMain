package com.example.sangha.vieclamnhanh.fragment;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.design.widget.FloatingActionButton;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.sangha.vieclamnhanh.R;

import java.util.zip.Inflater;

/**
 * Created by SangHa on 1/28/2018.
 */

public class BottomSheetLayout extends BottomSheetDialogFragment {
    Spinner spinner;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,@Nullable ViewGroup container,@Nullable Bundle savedInstanceState) {
        Button btnFind;

        View view = inflater.inflate(R.layout.bottomsheet, container, false);
        spinner=(Spinner)view.findViewById(R.id.spinnerFind);
        btnFind=(Button)view.findViewById(R.id.btnFind);

        String[] arrayJob=getResources().getStringArray(R.array.namesofjob);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(view.getContext(),R.layout.spinner_item,arrayJob);

        spinner.setAdapter(adapter);

        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });

        return view;


    }
}
