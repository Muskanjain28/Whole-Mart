package com.example.wholemart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginUsingOtp extends AppCompatActivity {

    Button send_otp,login;
    EditText mobile_number,get_otp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_using_otp);

        mobile_number = (EditText) findViewById(R.id.mobile_number_login);

        send_otp = (Button) findViewById(R.id.sendOtpButton);
        send_otp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mobile_number.getText().toString().trim().length()==0){
                    mobile_number.setError("Please enter a Valid Mobile Number");
                    mobile_number.requestFocus();
                }
                else {
                    Intent intent = new Intent(LoginUsingOtp.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

        get_otp = (EditText) findViewById(R.id.enter_otp);

        login = (Button) findViewById(R.id.loginOtpButton);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(get_otp.getText().toString().trim().length()==0){
                    get_otp.setError("Please enter the OTP sent on your Mobile Number !");
                    get_otp.requestFocus();
                }
                else {
                    Intent intent = new Intent(LoginUsingOtp.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}