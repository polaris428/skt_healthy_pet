package com.example.skthealthypet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Loding_Activity extends AppCompatActivity {
    private ConstraintLayout loding_activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loding_);
        Handler mHandler = new Handler();


        mHandler.postDelayed(new Runnable()  {
            public void run() {

                Intent intent=new Intent(Loding_Activity.this,Input_Activity.class);
                startActivity(intent);
                finish();}
        }, 3000);
    }
}