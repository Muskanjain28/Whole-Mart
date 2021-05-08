package com.example.wholemart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterCustomer extends AppCompatActivity {

    Button backCustomer,registerCustomer;
    EditText fullNameCustomer, usernameCustomer, mobileNumberCustomer, house_no_customer, localityCustomer,cityCustomer, pinCustomer, passwordCustomer, password02Customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_customer);

        backCustomer = (Button) findViewById(R.id.customerBackButton);
        backCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterCustomer.this,MainActivity.class);
                startActivity(intent);
            }
        });

        fullNameCustomer = (EditText) findViewById(R.id.customerName);
        usernameCustomer = (EditText) findViewById(R.id.customerUsername);
        mobileNumberCustomer = (EditText) findViewById(R.id.customerMobile);
        house_no_customer = (EditText) findViewById(R.id.customerAddressLine1);
        localityCustomer = (EditText) findViewById(R.id.customerAddressLine2);
        cityCustomer = (EditText) findViewById(R.id.customerAddressLine3);
        pinCustomer = (EditText) findViewById(R.id.customerPincode);
        passwordCustomer = (EditText) findViewById(R.id.customerPassword);
        password02Customer = (EditText) findViewById(R.id.customerPassword2);

        registerCustomer = (Button) findViewById(R.id.customerRegisterButton);
        registerCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fullNameCustomer.getText().toString().trim().length() == 0){
                    fullNameCustomer.setError("Please enter your Full Name !");
                    fullNameCustomer.requestFocus();
                }
                else if(usernameCustomer.getText().toString().trim().length() == 0){
                    usernameCustomer.setError("Please create a unique Username !");
                    usernameCustomer.requestFocus();
                }
                else if(mobileNumberCustomer.getText().toString().trim().length() == 0){
                    mobileNumberCustomer.setError("Please enter your Mobile Number !");
                    mobileNumberCustomer.requestFocus();
                }
                else if(house_no_customer.getText().toString().trim().length() == 0){
                    house_no_customer.setError("Please enter your House/Street No. !");
                    house_no_customer.requestFocus();
                }
                else if(localityCustomer.getText().toString().trim().length() == 0){
                    localityCustomer.setError("Please enter your Locality !");
                    localityCustomer.requestFocus();
                }
                else if(cityCustomer.getText().toString().trim().length() == 0){
                    cityCustomer.setError("Please enter the City!");
                    cityCustomer.requestFocus();
                }
                else if(pinCustomer.getText().toString().trim().length() == 0){
                    pinCustomer.setError("Please enter the Pin code !");
                    pinCustomer.requestFocus();
                }
                else if(passwordCustomer.getText().toString().trim().length() == 0){
                    passwordCustomer.setError("Please create a unique Password !");
                    passwordCustomer.requestFocus();
                }
                else if(password02Customer.getText().toString().trim().length() == 0){
                    password02Customer.setError("Please Re-enter the Password !");
                    password02Customer.requestFocus();
                }
                else  if(!password02Customer.getText().toString().matches(passwordCustomer.getText().toString())){
                    password02Customer.setError("Passwords don't match. Try Again!");
                    password02Customer.requestFocus();
                }
                else {
                    Intent intent = new Intent(RegisterCustomer.this, LoginUsingUsername.class);
                    startActivity(intent);
                }
            }
        });
    }
}