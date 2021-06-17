package com.example.networkpakkages.jazzsection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.networkpakkages.Model;
import com.example.networkpakkages.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import java.util.ArrayList;
import java.util.List;

public class jazzhybridpakkageactivity extends AppCompatActivity {
    public static final int ITEM_PER_AD = 300;
    private static final String BANNER_AD_ID = "ca-app-pub-3940256099942544/6300978111";
    private List<Object> recycleritems = new ArrayList<>();

    String value,network;
    RecyclerView recview;
    myadapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jazzpakkageactivity);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            value = bundle.getString("cat");

        }
        MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");
        recview = (RecyclerView) findViewById(R.id.recview);



      //  recview.setBackgroundColor(ContextCompat.getColor(this, R.color.ufonecolor));
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

        adapter = new myadapter(recycleritems, this);
        recview.setAdapter(adapter);
    }


    public void getdataitemshybrid() {

        recycleritems.add(new Model("ufone", "Daily Day Bundle", "*117*1#", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily supper Offer", "*117*2#", "1day", "15", "String details", "String deactivatedilecode", "1440", "0", "50", "150"));
        recycleritems.add(new Model("jazz", "Daily Super Plus Offer", "*117*3#", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "3day Max Offer", "*117*4", "1day", "15", "String details", "String deactivatedilecode", "500", "5", "500", "500"));
        recycleritems.add(new Model("jazz", "Weekly Voiceoffer", "*117*5", "1day", "15", "String details", "String deactivatedilecode", "100", "0", "0", "100"));
        recycleritems.add(new Model("jazz", "All in One Social", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Work From Home Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "weekly hybrid", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Weely All network offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));

        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));


    }
    public void getdataitemssms() {

        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*1", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily supper Offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "1440", "0", "50", "150"));
        recycleritems.add(new Model("jazz", "Daily Super Plus Offer", "*117*3", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "3day Max Offer", "*117*4", "1day", "15", "String details", "String deactivatedilecode", "500", "5", "500", "500"));
        recycleritems.add(new Model("jazz", "Weekly Voiceoffer", "*117*5", "1day", "15", "String details", "String deactivatedilecode", "100", "0", "0", "100"));
        recycleritems.add(new Model("jazz", "All in One Social", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Work From Home Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "weekly hybrid", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Weely All network offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));

        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));


    }
    public void getdataitemsinternet() {

        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*1", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily supper Offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "1440", "0", "50", "150"));
        recycleritems.add(new Model("jazz", "Daily Super Plus Offer", "*117*3", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "3day Max Offer", "*117*4", "1day", "15", "String details", "String deactivatedilecode", "500", "5", "500", "500"));
        recycleritems.add(new Model("jazz", "Weekly Voiceoffer", "*117*5", "1day", "15", "String details", "String deactivatedilecode", "100", "0", "0", "100"));
        recycleritems.add(new Model("jazz", "All in One Social", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Work From Home Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "weekly hybrid", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Weely All network offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));

        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));


    }
    public void getdataitemslboffer() {

        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*1", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily supper Offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "1440", "0", "50", "150"));
        recycleritems.add(new Model("jazz", "Daily Super Plus Offer", "*117*3", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "3day Max Offer", "*117*4", "1day", "15", "String details", "String deactivatedilecode", "500", "5", "500", "500"));
        recycleritems.add(new Model("jazz", "Weekly Voiceoffer", "*117*5", "1day", "15", "String details", "String deactivatedilecode", "100", "0", "0", "100"));
        recycleritems.add(new Model("jazz", "All in One Social", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Work From Home Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "weekly hybrid", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Weely All network offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));

        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));


    }
    public void getdataitemslbother() {

        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*1", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily supper Offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "1440", "0", "50", "150"));
        recycleritems.add(new Model("jazz", "Daily Super Plus Offer", "*117*3", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "3day Max Offer", "*117*4", "1day", "15", "String details", "String deactivatedilecode", "500", "5", "500", "500"));
        recycleritems.add(new Model("jazz", "Weekly Voiceoffer", "*117*5", "1day", "15", "String details", "String deactivatedilecode", "100", "0", "0", "100"));
        recycleritems.add(new Model("jazz", "All in One Social", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Work From Home Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "weekly hybrid", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Weely All network offer", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));

        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));
        recycleritems.add(new Model("jazz", "Daily Day Bundle", "*117*2", "1day", "15", "String details", "String deactivatedilecode", "300", "300", "20", "20"));


    }



    public void getbanneritems() {
        for (int i = 0; i < recycleritems.size(); i += ITEM_PER_AD) // i=i+4
        {
            AdView adView = new AdView(jazzhybridpakkageactivity.this);
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
