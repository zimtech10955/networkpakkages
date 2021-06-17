package com.example.networkpakkages.ptcl;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.networkpakkages.Model;
import com.example.networkpakkages.R;
import com.example.networkpakkages.jazzsection.jazzhybridpakkageactivity;
import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.List;

public class myadapterptcl extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<Object> recycleritems = new ArrayList<>();
    private Context context;

    private static final int item_data = 0;
    private static final int item_banner = 1;

    public myadapterptcl(List<Object> recycleritems, Context context) {
        this.recycleritems = recycleritems;
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        switch (viewType) {
            case item_data:
                View dataview = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowptcl, parent, false);
                return new myviewholder(dataview);

            case item_banner:
            default:
                View bannerview = LayoutInflater.from(parent.getContext()).inflate(R.layout.banner_singlerow, parent, false);
                return new banneraddviewholder(bannerview);

        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        int viwtype = getItemViewType(position);

        switch (viwtype) {
            case item_data:
                myviewholder mvh = (myviewholder) holder;
                Model model = (Model) recycleritems.get(position);
                mvh.txttittle.setText(model.getOffertittle());
                mvh.validity.setText(model.getValidity());


                //thingn left here


             mvh.subscribe.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(context, "youclicksubscribebutton"+ model.getActivedialcode(), Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(Intent.ACTION_DIAL);
                        intent.setData(Uri.parse("tel:"+Uri.encode(model.getActivedialcode())));
                        context.startActivity(intent);
                    }
                });



                break;

            case item_banner:
            default:
                banneraddviewholder bvh = (banneraddviewholder) holder;
                AdView adView = (AdView) recycleritems.get(position);

                ViewGroup adcardview = (ViewGroup) bvh.itemView;

                if (adcardview.getChildCount() > 0)
                    adcardview.removeAllViews();
                if (adcardview.getParent() != null)
                    ((ViewGroup) adView.getParent()).removeView(adView);

                adcardview.addView(adView);
        }


    }

    @Override
    public int getItemCount() {
        return recycleritems.size();
    }

    public int getItemViewType(int position) {
        if (position % jazzhybridpakkageactivity.ITEM_PER_AD == 0)
            return item_banner;
        else
            return item_data;
    }


    public static class myviewholder extends RecyclerView.ViewHolder {
        ImageView logo;
        TextView txttittle, validity, price, onnnetminutes, offnetminutes, sms, mbs;
Button subscribe;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            logo = (ImageView) itemView.findViewById(R.id.companylogo);
            // tittile=(TextView)itemView.findViewById(R.id.tittle);
          //  validity = (TextView) itemView.findViewById(R.id.validity);

            txttittle =(TextView) itemView.findViewById(R.id.tittle);


             validity =(TextView) itemView.findViewById(R.id.validity);


             price =(TextView) itemView.findViewById(R.id.price);


            onnnetminutes = (Button) itemView.findViewById(R.id.onnetminutes);


             offnetminutes =(Button) itemView.findViewById(R.id.offnetminutes);


             sms =( Button) itemView.findViewById(R.id.smsbutton);


             mbs =(Button) itemView.findViewById(R.id.mbsbutton);
              subscribe =(Button) itemView.findViewById(R.id.subscribebutton);


        }
    }

    public static class banneraddviewholder extends RecyclerView.ViewHolder {
        public banneraddviewholder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
