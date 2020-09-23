package com.example.skthealthypet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Input_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_);
        EditText nameinpur=(EditText)findViewById(R.id.nameinput);
        EditText heightinput=(EditText) findViewById(R.id.heightinput);
        EditText kginput=(EditText)findViewById(R.id.kginput);
        Button complete=(Button)findViewById(R.id.complete);

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