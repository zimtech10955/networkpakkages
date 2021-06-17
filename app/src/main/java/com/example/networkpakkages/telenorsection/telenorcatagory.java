package com.example.networkpakkages.telenorsection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import com.example.networkpakkages.R;
import com.example.networkpakkages.ufonesection.UfoneCatagory;
import com.example.networkpakkages.ufonesection.ufonepakkagesactivity;

public class telenorcatagory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telenorcatagory);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.ternorcolor)));

        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.ternorcolor));

        findViewById(R.id.telnorhybrid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(telenorcatagory.this, telenorpakkagesactivity.class);
                it.putExtra("cat", "hybrid");

                startActivity(it);
            }
        });


        findViewById(R.id.telnorsms).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(telenorcatagory.this, telenorpakkagesactivity.class);
                it.putExtra("cat", "sms");

                startActivity(it);
            }
        });


        findViewById(R.id.telnorinternet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(telenorcatagory.this, telenorpakkagesactivity.class);
                it.putExtra("cat", "internet");

                startActivity(it);
            }
        });

        findViewById(R.id.telnorother).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(telenorcatagory.this, telenorpakkagesactivity.class);
                it.putExtra("cat", "other");

                startActivity(it);
            }
        });











    }





}