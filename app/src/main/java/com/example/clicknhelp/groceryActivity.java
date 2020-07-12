package com.example.clicknhelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class groceryActivity extends AppCompatActivity {
    private Button b;
    private EditText et_address,et_no,et_list;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);
        et_address=(EditText)findViewById(R.id.editText3) ;
        et_no=(EditText)findViewById(R.id.editText5) ;
        et_list=(EditText)findViewById(R.id.editText6) ;



        b = (Button) findViewById(R.id.button6);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openthankuActivity();

            }
        });

    }

    void openthankuActivity() {
        Intent intent = new Intent(this, thankuActivity.class);

        startActivity(intent);


    }
}