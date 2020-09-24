package com.example.skthealthypet;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.sql.Date;
import java.util.ArrayList;

public class Adapter  extends RecyclerView.Adapter<RecyclerView.ViewHolder>  {

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title;
        MyViewHolder(View view){
            super(view);
            title=view.findViewById(R.id.title);


        }
    }

    private ArrayList<ItemData> itemDataList;
    Adapter(ArrayList<ItemData> itemDataList){
        this.itemDataList = itemDataList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recommended_, parent, false);

        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyViewHolder myViewHolder = (MyViewHolder) holder;

        myViewHolder.title.setText(  itemDataList.get(position).title);
    }

    @Override
    public int getItemCount() {
        return itemDataList.size();
    }
}

