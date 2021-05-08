package com.example.wholemart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button loginCustomer,loginOwner,registerCustomer,registerOwner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registerOwner = (Button) findViewById(R.id.registerAsOwner);
        registerOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterOwner.class);
                startActivity(intent);
            }
        });

        loginOwner = (Button) findViewById(R.id.loginAsOwner);
        loginOwner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginUsingUsername.class);
                startActivity(intent);
            }
        });

        registerCustomer = (Button) findViewById(R.id.registerAsCustomer);
        registerCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,RegisterCustomer.class);
                startActivity(intent);
            }
        });

        loginCustomer = (Button) findViewById(R.id.loginAsCustomer);
        loginCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,LoginUsingUsername.class);
                startActivity(intent);
            }
        });

    }
}