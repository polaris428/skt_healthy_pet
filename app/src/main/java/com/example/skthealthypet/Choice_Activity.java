package com.example.skthealthypet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Choice_Activity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_);
        Button chosedog=(Button)findViewById(R.id.dogbutton);
        Button chosecat=(Button)findViewById(R.id.catbutton);
        chosedog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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