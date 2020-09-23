package com.example.skthealthypet;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class Pet_Fragment extends Fragment {
    Input_Activity activity= new Input_Activity();
    String age = activity.getAge();
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
        TextView agetext=(TextView)v.findViewById(R.id.agetext);
        agetext.setText(" "+age);
        return v;

    }
}