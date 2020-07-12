package com.example.clicknhelp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.MotionEvent;
import androidx.appcompat.app.AppCompatActivity;

public class precautionsActivity extends Activity {
    private LinearLayout container;
    private int currentX;
    private int currentY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.precautions_activity);

    }

}