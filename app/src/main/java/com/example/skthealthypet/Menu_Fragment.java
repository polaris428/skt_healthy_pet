package com.example.skthealthypet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Menu_Fragment extends Fragment {
    private Shop_Clothes_Fragment Shop_Clothes_Fragment=new Shop_Clothes_Fragment();
    public Menu_Fragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment_menu_, null);
        // Inflate the layout for this fragment
        Button enterinformation=(Button)v.findViewById(R.id.enterinformation);
        Button ranking=(Button)v.findViewById(R.id.ranking);
        Button shop=(Button)v.findViewById(R.id.shop);
        final FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        enterinformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ranking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        shop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                transaction.replace(R.id.framlayout,Shop_Clothes_Fragment).commitAllowingStateLoss();
            }
        });
        return v;

    }
}