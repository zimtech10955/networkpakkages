package com.example.networkpakkages.ufonesection;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.networkpakkages.R;

public class UfoneCatagory extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ufone_catagory);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.ufonecolor)));

        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.ufonecolor));


        findViewById(R.id.ufonehybrid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(UfoneCatagory.this, ufonepakkagesactivity.class);
                it.putExtra("cat", "hybrid");

                startActivity(it);
            }
        });


        findViewById(R.id.ufonesms).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(UfoneCatagory.this, ufonepakkagesactivity.class);
                it.putExtra("cat", "sms");

                startActivity(it);
            }
        });


        findViewById(R.id.ufnoeinternet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(UfoneCatagory.this, ufonepakkagesactivity.class);
                it.putExtra("cat", "internet");

                startActivity(it);
            }
        });

        findViewById(R.id.ufnoeotheroffer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(UfoneCatagory.this, ufonepakkagesactivity.class);
                it.putExtra("cat", "other");

                startActivity(it);
            }
        });











    }





}