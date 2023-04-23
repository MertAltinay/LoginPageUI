package com.mertaltinay.loginpageui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button loginButton;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = (Button) findViewById(R.id.buttonLogin);
        username = (EditText) findViewById(R.id.editTextUsername);
        password = (EditText) findViewById(R.id.editTextPassword);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(username.getText().toString().equals("") || password.getText().toString().equals("")){

                    Toast.makeText(MainActivity.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();

                }
                else{

                    Toast.makeText(MainActivity.this, "User login procces is unsuccefsul!", Toast.LENGTH_SHORT).show();

                }

                if (username.getText().toString().equals("mert") && password.getText().toString().equals("123")){

                    Toast.makeText(MainActivity.this, "User login procces is succesfully!", Toast.LENGTH_SHORT).show();


                }


            }
        });

    }
}