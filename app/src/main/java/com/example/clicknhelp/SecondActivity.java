package com.example.clicknhelp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    EditText et_name, et_phoneNumber, et_email;
    RadioGroup radioGroup;
    TextView tv_personalDetail, tv_displayGender, tv_gender, tv_phoneNumber, tv_email;
    Button btn_showData, btn_exit;
    String str_name, str_gender, str_phoneNumber, str_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_personalDetail = (TextView) findViewById(R.id.tv_personalDetail);
        et_name = (EditText) findViewById(R.id.et_name);

        tv_displayGender = (TextView) findViewById(R.id.tv_displayGender);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);

        et_phoneNumber = (EditText) findViewById(R.id.et_phoneNumber);
        et_email = (EditText) findViewById(R.id.et_email);
       // btn_showData = (Button) findViewById(R.id.btn_showData);
        btn_exit = (Button) findViewById(R.id.btn_exit);


        tv_gender = (TextView) findViewById(R.id.tv_gender);

        tv_phoneNumber = (TextView) findViewById(R.id.tv_phoneNumber);
        tv_email = (TextView) findViewById(R.id.tv_email);
        radioGroup.setOnCheckedChangeListener(this);

        btn_exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    openFifthActivity();

            }
        });




    }
    public void openFifthActivity ()
    {
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }


    @Override
    public void onCheckedChanged (RadioGroup radioGroup,int i){

        switch (i) {


            case R.id.btn_exit:
                str_gender = "Female";
                Toast.makeText(SecondActivity.this, str_gender, Toast.LENGTH_SHORT).show();
                break;

        }

    }
}