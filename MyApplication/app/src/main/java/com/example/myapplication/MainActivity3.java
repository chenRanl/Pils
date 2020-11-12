package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    private ImageView imageAbdos;
    private ImageView imagePompes;
    private ImageView imageSuperman;
    private ImageView imageSquat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        imageAbdos = (ImageView) findViewById(R.id.imageAbdos);
        imagePompes = (ImageView) findViewById(R.id.imagePompes);
        imageSuperman = (ImageView) findViewById(R.id.imageSuperman);
        imageSquat = (ImageView) findViewById(R.id.ImageSquat);

        imageAbdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });

    }
    public void openActivity2(){
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }




}