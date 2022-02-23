package com.example.aprendamoslosnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class parte4 extends AppCompatActivity {
    MediaPlayer nueve;
    ImageButton btnnueve;
    MediaPlayer diez;
    ImageButton btndiez;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte4);

        btnnueve=(ImageButton)findViewById(R.id.btnnueve);
        nueve= MediaPlayer.create(this, R.raw.nueve);
        btnnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nueve.start();
            }
        });

        btndiez=(ImageButton)findViewById(R.id.btndiez);
        diez= MediaPlayer.create(this, R.raw.diez);
        btndiez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                diez.start();
            }
        });


    }
    public void btncuatro(View view){

        Intent botonsiguientecuatro= new Intent(this, parte4.class);
        startActivity(botonsiguientecuatro);}
}