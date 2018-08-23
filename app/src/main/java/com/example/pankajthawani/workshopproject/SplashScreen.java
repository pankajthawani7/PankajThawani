package com.example.pankajthawani.workshopproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Thread thread = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(3000);
                    Intent intent=new Intent(SplashScreen.this,MainPageActivity.class);
                    startActivity(intent);
                    finish();
                }
                catch (Exception e)
                {
                }
            }};
                thread.start();
    }
}
