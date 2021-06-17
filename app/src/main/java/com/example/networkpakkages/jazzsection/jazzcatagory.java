package com.example.networkpakkages.jazzsection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.networkpakkages.R;

public class jazzcatagory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazzcatagory);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#600407")));

        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.jazzcolor));
        findViewById(R.id.jazzhybrid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(jazzcatagory.this, jazzhybridpakkageactivity.class);
                it.putExtra("cat", "hybrid");
                it.putExtra("natwork", "jazz");
                startActivity(it);
            }
        });


        findViewById(R.id.jazzsms).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(jazzcatagory.this, jazzhybridpakkageactivity.class);
                it.putExtra("cat", "sms");
                it.putExtra("natwork", "jazz");
                startActivity(it);
            }
        });


        findViewById(R.id.jazzinternetoffers).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(jazzcatagory.this, jazzhybridpakkageactivity.class);
                it.putExtra("cat", "internet");

                startActivity(it);
            }
        });

        findViewById(R.id.jazzlocationbaseoffers).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(jazzcatagory.this, jazzhybridpakkageactivity.class);
                it.putExtra("cat", "lboffer");

                startActivity(it);
            }
        });


        findViewById(R.id.jazzotheroffers).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(jazzcatagory.this, jazzhybridpakkageactivity.class);
                it.putExtra("cat", "other");

                startActivity(it);
            }
        });


    }
}