package com.example.skthealthypet;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

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




        return v;

    }
}