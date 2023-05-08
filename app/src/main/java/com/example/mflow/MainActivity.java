package com.example.loginscreen;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("@id/imageView2");
    }
        Button button = findViewById(R.id.signupButton);
        button.setOnClickListener(new View.OnclickListener() {
            @Override
            public void onClick (View view){
                Intent intent=new Intent(PackageContext MainActivity.this,Signup.class);
                startActivity(intent);
            }
            username = findViewById(R.id.username);
            password = findViewById(R.id.password);
            loginButton = findViewById(R.id.loginButton);
            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {
                        Toast.makeText(MainActivity.this, "Login Successful!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Login Failed!", Toast.LENGTH_SHORT).show();
                    }
                }
        }
    }

