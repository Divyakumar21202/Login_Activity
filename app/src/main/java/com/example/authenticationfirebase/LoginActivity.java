package com.example.authenticationfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login_btn;
    EditText email,password;
    TextView register_txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_btn=findViewById(R.id.btn_login);
        email=findViewById(R.id.reg_mail);
        password=findViewById(R.id.reg_pass);
        register_txt=findViewById(R.id.reg_txt);

        register_txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),RegisterActivity.class);
                startActivity(intent);
                finish();
            }
        });

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data=email.getText().toString();
                if(data.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter E-mail",Toast.LENGTH_SHORT).show();
                }
                data=password.getText().toString();
                if(data.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter Password",Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}