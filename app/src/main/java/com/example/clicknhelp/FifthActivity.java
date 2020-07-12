package com.example.clicknhelp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class FifthActivity extends AppCompatActivity {
   private Button b1,b2,b3,b4,b5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        b1=(Button)findViewById(R.id.button2);
        b2=(Button)findViewById(R.id.button3);
        b3=(Button)findViewById(R.id.button4);
        b4=(Button)findViewById(R.id.button5);
        b5=(Button)findViewById(R.id.button6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openThirdActivity();

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openprecautionsActivity();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.mygov.in/covid-19/"));
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openselfassessmentActivity();

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opengroceryActivity();

            }
        });

}
void openThirdActivity(){
    Intent intent = new Intent(this, ThirdActivity.class);
    startActivity(intent);

    }
    void openprecautionsActivity(){
        Intent intent = new Intent(this, precautionsActivity.class);
        startActivity(intent);
    }


void openselfassessmentActivity(){
    Intent intent = new Intent();
    intent.setAction(Intent.ACTION_VIEW);
    intent.addCategory(Intent.CATEGORY_BROWSABLE);
    intent.setData(Uri.parse("https://neubergdiagnostics.com/covid19-selfassessment/selfchecker.html"));
    startActivity(intent);
}

void opengroceryActivity(){
    Intent intent = new Intent(this, groceryActivity.class);
    startActivity(intent);
}

}