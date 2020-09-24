package com.example.skthealthypet;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class Choice_Activity extends AppCompatActivity {

    String pet;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_);
        Button chosedog=(Button)findViewById(R.id.dogbutton);
        Button chosecat=(Button)findViewById(R.id.catbutton);
        chosedog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pet="dfsfdsd1";
                Pet_Fragment myFragmet=new Pet_Fragment();
                Bundle bundle=new Bundle();
                bundle.putString("pet",pet);
                myFragmet.setArguments (bundle);
                
                Intent intent=new Intent(Choice_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();

            }
        });

        chosecat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(Choice_Activity.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


    }
}