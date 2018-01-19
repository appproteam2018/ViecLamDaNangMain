package com.example.sangha.vieclamnhanh.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.example.sangha.vieclamnhanh.MainActivity;
import com.example.sangha.vieclamnhanh.R;

/**
 * Created by SangHa on 1/16/2018.
 */



    public class fragment3 extends android.support.v4.app.Fragment{
        Button btnSubmit;
        CheckBox cbFullTime,cbPartTime;
        EditText etCompany,etJob,etSalary,etDetails,etAddress,etPhone,etEmail;
        public fragment3(){

        }
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
        {

            View view=inflater.inflate(R.layout.fragment3,container,false);
            btnSubmit=(Button)view.findViewById(R.id.btnSubmit);
            cbFullTime=(CheckBox)view.findViewById(R.id.cbFullTime);
            cbPartTime=(CheckBox)view.findViewById(R.id.cbPartTime);
            etCompany=(EditText) view.findViewById(R.id.etCompany);
            etJob=(EditText)view.findViewById(R.id.etJob) ;
            etSalary=(EditText)view.findViewById(R.id.etSalary) ;
            etDetails=(EditText)view.findViewById(R.id.etDetails) ;
            etAddress=(EditText)view.findViewById(R.id.etAddress) ;
            etPhone=(EditText)view.findViewById(R.id.etPhone) ;
            etEmail=(EditText)view.findViewById(R.id.etEmail) ;
            btnSubmit.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (checkFaults(cbFullTime,cbPartTime,etCompany,etJob,etSalary,etDetails,etAddress,etPhone,etEmail)==0)
                    {

                        Toast.makeText(view.getContext(),"Bạn Nhập Thiếu Thông Tin ",Toast.LENGTH_LONG).show();
                    }


                    else

                    {

                        Toast.makeText(view.getContext(),"Bạn sẽ được duyệt và đăng ",Toast.LENGTH_LONG).show();
                        resetItem(cbFullTime,cbPartTime,etCompany,etJob,etSalary,etDetails,etAddress,etPhone,etEmail);
                    }

                }
            });

                return view;
        }
        public int checkFaults(CheckBox cbFullTime,CheckBox cbPartTime,EditText etCompany,EditText etJob,EditText etSalary,EditText etDetails,EditText etAddress,EditText etPhone,EditText etEmail)
        {


            String st="";
            if (etCompany.getText().toString().equals(st)==true)
                    return 0;
            if (etJob.getText().toString().equals(st)==true)
                    return 0;
            if (etAddress.getText().toString().equals(st)==true)
                    return 0;
            if (etDetails.getText().toString().equals(st)==true)
                    return 0;
            if (etPhone.getText().toString().equals(st)==true)
                    return 0;

            return 1;

        }
        private void resetItem(CheckBox cbFullTime,CheckBox cbPartTime,EditText etCompany,EditText etJob,EditText etSalary,EditText etDetails,EditText etAddress,EditText etPhone,EditText etEmail)
        {
            cbFullTime.setChecked(false);
            cbPartTime.setChecked(false);
            etCompany.setText("");
            etJob.setText("");
            etSalary.setText("");
            etDetails.setText("");
            etAddress.setText("");
            etPhone.setText("");
            etEmail.setText("");
        }

    }


