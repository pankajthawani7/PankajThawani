package com.example.pankajthawani.workshopproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelloWorldActivity extends AppCompatActivity
{

    @Override
    public void onBackPressed() {
        finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);


    }
}


