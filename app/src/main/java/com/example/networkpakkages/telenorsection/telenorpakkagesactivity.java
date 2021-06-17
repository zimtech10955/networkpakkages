package com.example.networkpakkages.telenorsection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.example.networkpakkages.Model;
import com.example.networkpakkages.R;
import com.example.networkpakkages.ufonesection.myadapterufone;
import com.example.networkpakkages.ufonesection.ufonepakkagesactivity;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

public class telenorpakkagesactivity extends AppCompatActivity {
    public static final int ITEM_PER_AD = 300;
    private static final String BANNER_AD_ID = "ca-app-pub-3940256099942544/6300978111";
    private List<Object> recycleritems = new ArrayList<>();

    String value;
    RecyclerView recview;
    myadaptertelenor adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telenorpakkagesactivity);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(this, R.color.ternorcolor)));

        Window window = this.getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this, R.color.ternorcolor));


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            value = bundle.getString("cat");
        }
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        recview = (RecyclerView) findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));
        switch (value) {
            case "hybrid":
                getdataitemshybrid();
            case "sms":
                getdataitemssms();
            case "internet":
                getdataitemsinternet();
            case "lboffer":
                getdataitemslboffer();
            case "other":
                getdataitemslbother();


        }

        getbanneritems();
        loadbannerads();

        adapter = new myadaptertelenor(recycleritems, this);
        recview.setAdapter(adapter);
    }


    public void getdataitemshybrid() {

        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*1#", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily supper Offer", "*117*2#", "1day", "15", "String details", "String deactivatedilecode", "1440", "0", "50", "150"));
        recycleritems.add(new Model("ufone", "Daily Super Plus Offer", "*117*3#", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "3day Max Offer", "*117*4", "1day", "15", "String details", "String deactivatedilecode", "500", "5", "500", "500"));
        recycleritems.add(new Model("ufone", "Weekly Voiceoffer", "*117*5", "1day", "15", "String details", "String deactivatedilecode", "100", "0", "0", "100"));
        recycleritems.add(new Model("ufone", "All in One Social", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Work From Home Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "weekly hybrid", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Weely All network offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));

        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));


    }
    public void getdataitemssms() {

        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*1", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily supper Offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "1440", "0", "50", "150"));
        recycleritems.add(new Model("ufone", "Daily Super Plus Offer", "*117*3", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "3day Max Offer", "*117*4", "1day", "15", "String details", "String deactivatedilecode", "500", "5", "500", "500"));
        recycleritems.add(new Model("ufone", "Weekly Voiceoffer", "*117*5", "1day", "15", "String details", "String deactivatedilecode", "100", "0", "0", "100"));
        recycleritems.add(new Model("ufone", "All in One Social", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Work From Home Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "weekly hybrid", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Weely All network offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));

        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));


    }
    public void getdataitemsinternet() {

        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*1", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily supper Offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "1440", "0", "50", "150"));
        recycleritems.add(new Model("ufone", "Daily Super Plus Offer", "*117*3", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "3day Max Offer", "*117*4", "1day", "15", "String details", "String deactivatedilecode", "500", "5", "500", "500"));
        recycleritems.add(new Model("ufone", "Weekly Voiceoffer", "*117*5", "1day", "15", "String details", "String deactivatedilecode", "100", "0", "0", "100"));
        recycleritems.add(new Model("ufone", "All in One Social", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Work From Home Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "weekly hybrid", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Weely All network offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));

        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));


    }
    public void getdataitemslboffer() {

        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*1", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily supper Offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "1440", "0", "50", "150"));
        recycleritems.add(new Model("ufnoe", "Daily Super Plus Offer", "*117*3", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "3day Max Offer", "*117*4", "1day", "15", "String details", "String deactivatedilecode", "500", "5", "500", "500"));
        recycleritems.add(new Model("ufnoe", "Weekly Voiceoffer", "*117*5", "1day", "15", "String details", "String deactivatedilecode", "100", "0", "0", "100"));
        recycleritems.add(new Model("ufnoe", "All in One Social", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Work From Home Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "weekly hybrid", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Weely All network offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));

        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufnoe", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));


    }
    public void getdataitemslbother() {

        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*1", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily supper Offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "1440", "0", "50", "150"));
        recycleritems.add(new Model("ufone", "Daily Super Plus Offer", "*117*3", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "3day Max Offer", "*117*4", "1day", "15", "String details", "String deactivatedilecode", "500", "5", "500", "500"));
        recycleritems.add(new Model("ufone", "Weekly Voiceoffer", "*117*5", "1day", "15", "String details", "String deactivatedilecode", "100", "0", "0", "100"));
        recycleritems.add(new Model("ufone", "All in One Social", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Work From Home Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "weekly hybrid", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Weely All network offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));

        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));


    }



    public void getbanneritems() {
        for (int i = 0; i < recycleritems.size(); i += ITEM_PER_AD) // i=i+4
        {
            AdView adView = new AdView(telenorpakkagesactivity.this);
            adView.setAdSize(AdSize.BANNER);
            adView.setAdUnitId(BANNER_AD_ID);
            recycleritems.add(i, adView); // 0 4 8 12...
        }
    }

    public void loadbannerads() {
        for (int i = 0; i < recycleritems.size(); i++) {
            Object item = recycleritems.get(i);
            if (item instanceof AdView) {
                final AdView adView = (AdView) item;
                adView.loadAd(new AdRequest.Builder().build());
            }
        }
    }

}
