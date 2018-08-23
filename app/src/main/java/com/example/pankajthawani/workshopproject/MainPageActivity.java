package com.example.pankajthawani.workshopproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainPageActivity extends AppCompatActivity {
    Button login,signup;
    TextView name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        name=findViewById(R.id.nameText);
        login=findViewById(R.id.loginBtn);
        signup=findViewById(R.id.signBtn);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainPageActivity.this,LoginActivity.class);
                startActivity(intent);
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainPageActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });


    }
}
