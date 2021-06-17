package com.example.networkpakkages;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.networkpakkages.jazzsection.jazzcatagory;
import com.example.networkpakkages.ptcl.Ptclcatagory;
import com.example.networkpakkages.telenorsection.telenorcatagory;
import com.example.networkpakkages.ufonesection.UfoneCatagory;
import com.example.networkpakkages.zonsection.zongcatagory;

public class Dashboard extends AppCompatActivity {
    ImageButton jazz, warid, tenor, ufone, zong, ptcl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#600407")));

        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.jazzcolor));

        jazz = findViewById(R.id.jazz);
        warid = findViewById(R.id.warid);
        ufone = findViewById(R.id.ufone);
        tenor = findViewById(R.id.telenor);
        zong = findViewById(R.id.zong);
        ptcl = findViewById(R.id.ptcl);

        ;


        jazz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, jazzcatagory.class));
            }
        });
        warid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, jazzcatagory.class));
            }
        });
        tenor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, telenorcatagory.class));
            }
        });
        ufone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, UfoneCatagory.class));
            }
        });
        zong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, zongcatagory.class));
            }
        });
        ptcl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Dashboard.this, Ptclcatagory.class));
            }
        });


    }
}