package com.example.clicknhelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {

    private RadioButton maha,mp,up,gujrat,karnataka,kerala,tn,haryana,rajasthan,bihar,jharkhand,telangana,westbengal,punjab,delhi,pondicherry,arunachalp;
     Button btn;
    private String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        //radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        maha = (RadioButton) findViewById(R.id.radiobutton1);
        mp = (RadioButton) findViewById(R.id.radiobutton2);
        up = (RadioButton) findViewById(R.id.radiobutton3);
        gujrat = (RadioButton) findViewById(R.id.radiobutton4);
        karnataka = (RadioButton) findViewById(R.id.radioButton5);
        kerala = (RadioButton) findViewById(R.id.radioButton6);
        tn = (RadioButton) findViewById(R.id.radioButton7);
        haryana = (RadioButton) findViewById(R.id.radioButton8);
        rajasthan = (RadioButton) findViewById(R.id.radioButton9);
        bihar = (RadioButton) findViewById(R.id.radioButton10);
        jharkhand = (RadioButton) findViewById(R.id.radioButton11);
        telangana = (RadioButton) findViewById(R.id.radioButton12);
        westbengal = (RadioButton) findViewById(R.id.radioButton13);
        punjab = (RadioButton) findViewById(R.id.radioButton14);
        delhi = (RadioButton) findViewById(R.id.radioButton15);
        pondicherry = (RadioButton) findViewById(R.id.radioButton16);
        arunachalp = (RadioButton) findViewById(R.id.radioButton17);


        btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (maha.isChecked()) {
                    s = maha.getText().toString();
                    openMedicalActivity();
                } else if (mp.isChecked()) {
                    s = mp.getText().toString();
                    openmpActivity();
                } else if(up.isChecked()){
                    s=up.getText().toString();
                    openupActivity();
                }
                else if(gujrat.isChecked()){
                    s=gujrat.getText().toString();
                    opengujratActivity();
                }else if(karnataka.isChecked()){
                    s=karnataka.getText().toString();
                    openkarnatakaActivity();
                }else if(kerala.isChecked()){
                    s=kerala.getText().toString();
                    openkeralaActivity();
                }else if(tn.isChecked()){
                    s=tn.getText().toString();
                    opentnActivity();
                }else if(haryana.isChecked()){
                    s=haryana.getText().toString();
                    openharyanaActivity();
                }else if(rajasthan.isChecked()){
                    s=rajasthan.getText().toString();
                    openrajasthanActivity();
                }else if(bihar.isChecked()){
                    s=bihar.getText().toString();
                    openbiharActivity();
                }else if(jharkhand.isChecked()){
                    s=jharkhand.getText().toString();
                    openjharkhandActivity();
                }else if(telangana.isChecked()){
                    s=telangana.getText().toString();
                    opentelanganaActivity();
                }else if(westbengal.isChecked()){
                    s=westbengal.getText().toString();
                    openwbActivity();
                }else if(punjab.isChecked()){
                    s=punjab.getText().toString();
                    openpunjabActivity();
                }else if(delhi.isChecked()){
                    s=delhi.getText().toString();
                    opendelhiActivity();
                }else if(pondicherry.isChecked()){
                    s=pondicherry.getText().toString();
                    openpondicherryActivity();
                }else if(arunachalp.isChecked()){
                    s=arunachalp.getText().toString();
                    openapActivity();
                }
                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_LONG).show(); // print the value of selected super star
            }
        });
    }
    public void openmpActivity() {
        Intent intent = new Intent(this, mpActivity.class);
        startActivity(intent);
    }
    public void opengujratActivity() {
        Intent intent = new Intent(this, gujrat.class);
        startActivity(intent);
    }
    public void openkarnatakaActivity() {
        Intent intent = new Intent(this, karnataka.class);
        startActivity(intent);
    }
    public void openkeralaActivity() {
        Intent intent = new Intent(this, kerala.class);
        startActivity(intent);
    }
    public void opentnActivity() {
        Intent intent = new Intent(this, tn.class);
        startActivity(intent);
    }
    public void openharyanaActivity() {
        Intent intent = new Intent(this, haryana.class);
        startActivity(intent);
    }
    public void openrajasthanActivity() {
        Intent intent = new Intent(this, rajasthan.class);
        startActivity(intent);
    }
    public void openbiharActivity() {
        Intent intent = new Intent(this, bihar.class);
        startActivity(intent);
    }
    public void openjharkhandActivity() {
        Intent intent = new Intent(this, jharkhand.class);
        startActivity(intent);
    }
    public void opentelanganaActivity() {
        Intent intent = new Intent(this, telangana.class);
        startActivity(intent);
    }
    public void openwbActivity() {
        Intent intent = new Intent(this, wb.class);
        startActivity(intent);
    }
    public void openpunjabActivity() {
        Intent intent = new Intent(this, punjab.class);
        startActivity(intent);
    }
    public void opendelhiActivity() {
        Intent intent = new Intent(this, delhi.class);
        startActivity(intent);
    }
    public void openpondicherryActivity() {
        Intent intent = new Intent(this, pondicherry.class);
        startActivity(intent);
    }
    public void openapActivity() {
        Intent intent = new Intent(this, arunachalp.class);
        startActivity(intent);
    }
    public void openupActivity() {
        Intent intent = new Intent(this, upActivity.class);
        startActivity(intent);
    }

    public void openMedicalActivity() {
        Intent intent = new Intent(this, medicalActivity.class);
        startActivity(intent);
    }

    /*public void onCheckedChanged(RadioGroup radioGroup, int i) {

        switch (i) {

            case R.id.radiobutton1:
                s = "MAHARASHTRA";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                openMedicalActivity();
                break;
            case R.id.radiobutton2:
                s = "MADHYA PRADESH";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                openmpActivity();
                break;
            case R.id.radiobutton3:
                s = "UTTAR PRADESH";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radiobutton4:
                s = "GUJRAT";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton5:
                s = "KARNATAKA";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton6:
                s = "KERALA";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton7:
                s = "TAMIL NADU";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton8:
                s = "HARYANA";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton9:
                s = "RAJASTHAN";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton10:
                s = "BIHAR";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton11:
                s = "JHARKHAND";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton12:
                s = "TELANGANA";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton13:
                s = "WEST BENGAL";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton14:
                s = "PUNJAB";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton15:
                s = "DELHI";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton16:
                s = "PONDICHERRY";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton17:
                s= "ARUNACHAL PRADESH";
                Toast.makeText(ThirdActivity.this, s, Toast.LENGTH_SHORT).show();
                break;

        }
    }*/
}