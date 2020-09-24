package com.example.skthealthypet;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private FragmentManager fm=getSupportFragmentManager();
    private Menu_Fragment Menu_Fragment=new Menu_Fragment();
    private Pedometer_Fragment Pedometer_Fragment=new Pedometer_Fragment();
    private Pet_Fragment Pet_Fragment=new Pet_Fragment();
    private Recommended_Fragment Recommended_Fragment=new Recommended_Fragment();
    private List_Main_Fragment List_Main_Fragment=new List_Main_Fragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final FragmentTransaction transaction=fm.beginTransaction();
        transaction.replace(R.id.framlayout,Pet_Fragment).commitAllowingStateLoss();
        BottomNavigationView bottomNavigationView=(BottomNavigationView) findViewById(R.id.bottom_navigation_view);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.first:{
                        FragmentTransaction transaction=fm.beginTransaction();
                        transaction.replace(R.id.framlayout,Pet_Fragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.second:{
                        FragmentTransaction transaction=fm.beginTransaction();

                        transaction.replace(R.id.framlayout,Pedometer_Fragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.third:{
                        FragmentTransaction transaction=fm.beginTransaction();
                        transaction.replace(R.id.framlayout,Recommended_Fragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.four:{
                        FragmentTransaction transaction=fm.beginTransaction();
                        transaction.replace(R.id.framlayout,List_Main_Fragment).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.fifth:{
                        FragmentTransaction transaction=fm.beginTransaction();
                        transaction.replace(R.id.framlayout, Menu_Fragment).commitAllowingStateLoss();
                        break;
                    }

                }

                return true;
            }
        });
    }
}