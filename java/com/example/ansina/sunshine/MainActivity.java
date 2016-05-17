package com.example.ansina.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null){
            //getSupportFragmentManager().beginTransaction().add(R.id.container_main, new forecastList()).commit();
        }
    }

}
