package com.example.wholemart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginUsingUsername extends AppCompatActivity {

    Button login,loginUsingOtp;
    EditText userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_using_username);

        userName = (EditText) findViewById(R.id.username_login);
        password = (EditText) findViewById(R.id.password_login);

        login = (Button) findViewById(R.id.loginButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userName.getText().toString().trim().length() == 0){
                    userName.setError("Please enter the Username!");
                    userName.requestFocus();
                }
                else if(password.getText().toString().trim().length() == 0)
                {
                    password.setError("Please enter the Password!");
                    password.requestFocus();
                }
                else {
                    Intent intent = new Intent(LoginUsingUsername.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        loginUsingOtp = (Button) findViewById(R.id.loginAsMobileButton);
        loginUsingOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginUsingUsername.this,LoginUsingOtp.class);
                startActivity(intent);
            }
        });
    }
}