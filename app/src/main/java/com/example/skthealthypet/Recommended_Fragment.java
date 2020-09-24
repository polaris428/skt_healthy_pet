package com.example.skthealthypet;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class Recommended_Fragment extends Fragment {


    public Recommended_Fragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = LayoutInflater.from(getContext()).inflate(R.layout.fragment_recommended_,null);
        RecyclerView mRecyclerView;
        RecyclerView.LayoutManager mLayoutManager;


            mRecyclerView = v.findViewById(R.id.recycler_view);
            mRecyclerView.setHasFixedSize(true);



            ArrayList<ItemData>itemDataList = new ArrayList<>();
            itemDataList.add(new ItemData("5,000원"));
            itemDataList.add(new ItemData("4,600원"));
            itemDataList.add(new ItemData("4,000원"));

            Adapter Adapter = new Adapter(itemDataList);

            mRecyclerView.setAdapter(Adapter);


            return v;
    }
}