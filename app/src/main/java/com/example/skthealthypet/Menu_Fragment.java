package com.example.skthealthypet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class Menu_Fragment extends Fragment {
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
        Button enterinformation=v.findViewById(R.id.enterinformation);
        final Button ranking=v.findViewById(R.id.ranking);
        Button shop=v.findViewById(R.id.shop);
        final FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        enterinformation.setOnClickListener(view -> {
            ReInput_Fragment ReInput_Fragment=new ReInput_Fragment();
            transaction.replace(R.id.framlayout,ReInput_Fragment).commitAllowingStateLoss();
        });

        ranking.setOnClickListener(view -> {
            Ranking_Fragment Ranking_Fragment=new Ranking_Fragment();
            transaction.replace(R.id.framlayout,Ranking_Fragment).commitAllowingStateLoss();
        });

        shop.setOnClickListener(view -> {
            Shop_Beds_Fragment Shop_Beds_Fragment=new Shop_Beds_Fragment();
            transaction.replace(R.id.framlayout,Shop_Beds_Fragment).commitAllowingStateLoss();
        });
        return v;

    }
}