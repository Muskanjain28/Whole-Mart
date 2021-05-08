package com.example.wholemart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterOwner extends AppCompatActivity {

    Button backOwner,registerOwner;
    EditText fullNameOwner, usernameOwner,shopNameOwner, mobileNumberOwner, shop_no_owner, localityOwner,cityOwner, pinOwner, passwordOwner, password02Owner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_owner);

        backOwner = (Button) findViewById(R.id.ownerBackButton);
        backOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegisterOwner.this,MainActivity.class);
                startActivity(intent);
            }
        });

        fullNameOwner = (EditText) findViewById(R.id.ownerName);
        usernameOwner = (EditText) findViewById(R.id.ownerUsername);
        shopNameOwner = (EditText) findViewById(R.id.ownerShopName);
        mobileNumberOwner = (EditText) findViewById(R.id.ownerMobile);
        shop_no_owner = (EditText) findViewById(R.id.ownerShopAddressLine1);
        localityOwner = (EditText) findViewById(R.id.ownerShopAddressLine2);
        cityOwner = (EditText) findViewById(R.id.ownerShopAddressLine3);
        pinOwner = (EditText) findViewById(R.id.ownerPincode);
        passwordOwner = (EditText) findViewById(R.id.ownerPassword);
        password02Owner = (EditText) findViewById(R.id.ownerPassword2);

        registerOwner = (Button) findViewById(R.id.ownerRegisterButton);
        registerOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fullNameOwner.getText().toString().trim().length() == 0){
                    fullNameOwner.setError("Please enter your Full Name !");
                    fullNameOwner.requestFocus();
                }
                else if(shopNameOwner.getText().toString().trim().length() == 0){
                    shopNameOwner.setError("Please enter the name of your Shop!");
                    shopNameOwner.requestFocus();
                }
                else if(usernameOwner.getText().toString().trim().length() == 0){
                    usernameOwner.setError("Please create a unique Username !");
                    usernameOwner.requestFocus();
                }
                else if(mobileNumberOwner.getText().toString().trim().length() == 0){
                    mobileNumberOwner.setError("Please enter your Mobile Number !");
                    mobileNumberOwner.requestFocus();
                }
                else if(shop_no_owner.getText().toString().trim().length() == 0){
                    shop_no_owner.setError("Please enter your Shop/Street No. !");
                    shop_no_owner.requestFocus();
                }
                else if(localityOwner.getText().toString().trim().length() == 0){
                    localityOwner.setError("Please enter your Shop Locality !");
                    localityOwner.requestFocus();
                }
                else if(cityOwner.getText().toString().trim().length() == 0){
                    cityOwner.setError("Please enter the City!");
                    cityOwner.requestFocus();
                }
                else if(pinOwner.getText().toString().trim().length() == 0){
                    pinOwner.setError("Please enter the Pin code !");
                    pinOwner.requestFocus();
                }
                else if(passwordOwner.getText().toString().trim().length() == 0){
                    passwordOwner.setError("Please create a unique Password !");
                    passwordOwner.requestFocus();
                }
                else if(password02Owner.getText().toString().trim().length() == 0){
                    password02Owner.setError("Please Re-enter the Password !");
                    password02Owner.requestFocus();
                }
                else  if(!password02Owner.getText().toString().matches(passwordOwner.getText().toString())){
                    password02Owner.setError("Passwords don't match. Try Again!");
                    password02Owner.requestFocus();
                }
                else {
                    Intent intent = new Intent(RegisterOwner.this, LoginUsingUsername.class);
                    startActivity(intent);
                }
            }
        });
    }
}