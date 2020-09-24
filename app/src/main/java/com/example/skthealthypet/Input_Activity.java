package com.example.skthealthypet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Input_Activity extends AppCompatActivity {

    String age;
    String high;
    String kg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_);
        final EditText ageinput=(EditText)findViewById(R.id.ageinput);
        final  EditText heightinput=(EditText) findViewById(R.id.heightinput);
        final EditText kginput=(EditText)findViewById(R.id.kginput);
        Button complete=(Button)findViewById(R.id.complete);
        age=ageinput.getText().toString();
        high=heightinput.getText().toString();
        kg=kginput.getText().toString();
        Pet_Fragment myFragment = new Pet_Fragment();

        complete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(Input_Activity.this,Choice_Activity.class);
                startActivity(intent);
                finish();

            }
        });


    }


}