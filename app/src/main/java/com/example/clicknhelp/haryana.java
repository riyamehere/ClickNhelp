package com.example.clicknhelp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class haryana extends AppCompatActivity {
    private Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haryana);
        bt=(Button)findViewById(R.id.button10) ;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                opendialer();

            }
        });
    }
    public void opendialer(){
        Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:8558893911"));
        startActivity(intent);
        //Intent intent = new Intent(Intent.ACTION_CALL);
        //intent.setData(Uri.parse("tel:0123456789"));
        //startActivity(intent);
    }
}
