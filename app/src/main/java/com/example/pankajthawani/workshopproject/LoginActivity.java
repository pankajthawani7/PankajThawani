package com.example.pankajthawani.workshopproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity
{
    TextView logintext,forgot;
    Button loginbtn;
    EditText password,email;
    String email1,pass1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        logintext=findViewById(R.id.logintext);
        forgot=findViewById(R.id.forgot);
        loginbtn=findViewById(R.id.loginBtn);
        password=findViewById(R.id.passText);
        email=findViewById(R.id.emailText);
        email1=email.getText().toString();
        pass1=password.getText().toString();
        loginbtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(email.getText().toString().length()==0 || password.getText().toString().length()==0)
                {
                    Toast.makeText(LoginActivity.this, "Please fill the fields", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(LoginActivity.this, HelloWorldActivity.class);
                    startActivity(intent);

                }
            }
        });
    }
}
