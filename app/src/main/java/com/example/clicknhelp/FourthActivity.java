package com.example.clicknhelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FourthActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
   private RadioGroup radioGroup;
    private Button btn;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(this);
        btn=(Button)findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(str.equals("NAGPUR")) {

                    openFifthActivity();
                }
            }
        });
    }
    public void openFifthActivity ()
    {
        Intent intent = new Intent(this, FifthActivity.class);
        startActivity(intent);
    }
    public void onCheckedChanged (RadioGroup radioGroup,int i){

        switch (i) {

            case R.id.RB1:
                str= "AKOLA";
                Toast.makeText(FourthActivity.this, str, Toast.LENGTH_SHORT).show();
                break;
            case R.id.RB2:
                str = "AMRAVATI";
                Toast.makeText(FourthActivity.this, str, Toast.LENGTH_SHORT).show();
                break;
            case R.id.RB3:
                str ="AURANGABAD";
                Toast.makeText(FourthActivity.this, str, Toast.LENGTH_SHORT).show();
            case R.id.RB4:
                str ="CHANDRAPUR";
                Toast.makeText(FourthActivity.this, str, Toast.LENGTH_SHORT).show();
            case R.id.RB5:
                str ="GONDIA";
                Toast.makeText(FourthActivity.this, str, Toast.LENGTH_SHORT).show();
            case R.id.RB6:
                str ="NAGPUR";
                Toast.makeText(FourthActivity.this, str, Toast.LENGTH_SHORT).show();
            case R.id.RB7:
                str ="NASHIK";
                Toast.makeText(FourthActivity.this, str, Toast.LENGTH_SHORT).show();
            case R.id.RB8:
                str ="PUNE";
                Toast.makeText(FourthActivity.this, str, Toast.LENGTH_SHORT).show();
            case R.id.RB9:
                str ="MUMBAI";
                Toast.makeText(FourthActivity.this, str, Toast.LENGTH_SHORT).show();
            case R.id.RB10:
                str ="SATARA";
                Toast.makeText(FourthActivity.this, str, Toast.LENGTH_SHORT).show();
            case R.id.RB11:
                str ="YAVATMAL";
                Toast.makeText(FourthActivity.this, str, Toast.LENGTH_SHORT).show();

        }

    }

}


