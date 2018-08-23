package com.example.pankajthawani.workshopproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    TextView appname;
    EditText name,email,pass,confirmpass;
    Button signBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        appname=findViewById(R.id.signname);
        name=findViewById(R.id.nameText);
        email=findViewById(R.id.emailText);
        pass=findViewById(R.id.passText);
        confirmpass=findViewById(R.id.confirmpassText);
        signBtn=findViewById(R.id.signupBtn);

        signBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if (name.getText().toString().length()==0 || email.getText().toString().length()==0 || pass.getText().toString().length()==0 || confirmpass.getText().toString().length()==0)
                {
                    Toast.makeText(SignUpActivity.this, "Fill the fields", Toast.LENGTH_SHORT).show();
                     if (pass.getText().toString()!=confirmpass.getText().toString())
                    {
                        Toast.makeText(SignUpActivity.this, "Password does not match", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Intent intent=new Intent(SignUpActivity.this,LoginActivity.class);
                    startActivity(intent);
                }
            }
        });
    }


}
