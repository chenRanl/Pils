package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView signUp;
    private TextView Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signUp = (TextView) findViewById(R.id.SignUp);
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

        Login = (TextView) findViewById(R.id.Login);
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    public void openActivity3(){
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }
}