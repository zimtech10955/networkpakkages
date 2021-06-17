package com.example.networkpakkages.zonsection;

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

public class zongcatagory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zongcatagory);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.zongcolor)));

        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.zongcolor));



        findViewById(R.id.zonghybrid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent it = new Intent(zongcatagory.this, zongpakkagesactivity.class);
                it.putExtra("cat", "hybrid");
                it.putExtra("natwork", "jazz");
                startActivity(it);
            }
        });


        findViewById(R.id.zongsms).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(zongcatagory.this, zongpakkagesactivity.class);
                it.putExtra("cat", "sms");
                it.putExtra("natwork", "jazz");
                startActivity(it);
            }
        });


        findViewById(R.id.zonginternet).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(zongcatagory.this, zongpakkagesactivity.class);
                it.putExtra("cat", "internet");

                startActivity(it);
            }
        });

        findViewById(R.id.zonglboffer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(zongcatagory.this, zongpakkagesactivity.class);
                it.putExtra("cat", "lboffer");

                startActivity(it);
            }
        });


        findViewById(R.id.zongotheroffer).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(zongcatagory.this, zongpakkagesactivity.class);
                it.putExtra("cat", "other");

                startActivity(it);
            }
        });


    }
}