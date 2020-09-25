package com.example.skthealthypet;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

public class Pet_Fragment extends Fragment {
    public Pet_Fragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment_pet_,null);
        String str="";
        Context c = container.getContext();
        SharedPreferences pref = c.getSharedPreferences("Inventory" , Activity.MODE_PRIVATE);
        TextView MONEY_VIEW = v.findViewById(R.id.cointext);
        MONEY_VIEW.setText(String.valueOf(pref.getInt("money",0)));
        TextView INFO_VIEW = v.findViewById(R.id.info);
        INFO_VIEW.setText(String.valueOf(pref.getInt("level",0))+"  "+String.valueOf(pref.getInt("exp",0))+"/500");
        ImageView GAGU = v.findViewById(R.id.GAGU);
        ImageView BED = v.findViewById(R.id.BED);

        int i;
        for(i=0; i<6; i++)
            if(pref.getInt("beds_num_"+i,0)==2)
                break;
         switch (i){
             case 0:
                 Glide.with(c.getApplicationContext())
                         .asBitmap()
                         .load(R.drawable.bed1)
                         .into(BED);
                 break;
             case 1:
                 Glide.with(c.getApplicationContext())
                         .asBitmap()
                         .load(R.drawable.bed2)
                         .into(BED);
                 break;
             case 2:
                 Glide.with(c.getApplicationContext())
                         .asBitmap()
                         .load(R.drawable.bed3)
                         .into(BED);
                 break;
             case 3:
                 Glide.with(c.getApplicationContext())
                         .asBitmap()
                         .load(R.drawable.tent1)
                         .into(BED);
                 break;
             case 4:
                 Glide.with(c.getApplicationContext())
                         .asBitmap()
                         .load(R.drawable.tent2)
                         .into(BED);
                 break;
             case 5:
                 Glide.with(c.getApplicationContext())
                         .asBitmap()
                         .load(R.drawable.tent3)
                         .into(BED);
                 break;
         }
        for(i=0; i<5; i++)
            if(pref.getInt("closets_num_"+i,0)==2)
                break;
        switch (i){
            case 0:
                Glide.with(c.getApplicationContext())
                        .asBitmap()
                        .load(R.drawable.closet)
                        .into(GAGU);
                break;
            case 1:
                Glide.with(c.getApplicationContext())
                        .asBitmap()
                        .load(R.drawable.closet_white)
                        .into(GAGU);
                break;
            case 2:
                Glide.with(c.getApplicationContext())
                        .asBitmap()
                        .load(R.drawable.closet_black)
                        .into(GAGU);
                break;
            case 3:
                Glide.with(c.getApplicationContext())
                        .asBitmap()
                        .load(R.drawable.clock)
                        .into(GAGU);
                break;
            case 4:
                Glide.with(c.getApplicationContext())
                        .asBitmap()
                        .load(R.drawable.clock_elec)
                        .into(GAGU);
                break;
        }
        return v;

    }
}