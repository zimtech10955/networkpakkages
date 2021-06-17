package com.example.networkpakkages.ptcl;

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
import com.example.networkpakkages.ufonesection.UfoneCatagory;
import com.example.networkpakkages.ufonesection.ufonepakkagesactivity;

public class Ptclcatagory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ptclcatagory);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.ptclcolor)));

        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.ptclcolor));


        findViewById(R.id.ptclinternet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(Ptclcatagory.this, ptclpakkagesactivity.class);
                it.putExtra("cat", "hybrid");

                startActivity(it);
            }
        });





        findViewById(R.id.ptcltelephone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Ptclcatagory.this, ptclpakkagesactivity.class);
                it.putExtra("cat", "internet");

                startActivity(it);
            }
        });

        findViewById(R.id.ptclsmartv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(Ptclcatagory.this, ptclpakkagesactivity.class);
                it.putExtra("cat", "other");

                startActivity(it);
            }
        });











    }





}