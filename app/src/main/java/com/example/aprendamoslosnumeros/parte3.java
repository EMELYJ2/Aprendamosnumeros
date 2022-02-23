package com.example.aprendamoslosnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class parte3 extends AppCompatActivity {
    //cinco
    MediaPlayer cinco;
    ImageButton  btncinco;
    //seis
    MediaPlayer seis;
    ImageButton btnseis;
    //siete
    MediaPlayer siete;
    ImageButton btnsiete;
    //ocho
    MediaPlayer ocho;
    ImageButton btnocho;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte3);

        btncinco=(ImageButton)findViewById(R.id.btncinco);
        cinco=MediaPlayer.create(this, R.raw.cinco);
        btncinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cinco.start();
            }
        });
        btnseis=(ImageButton)findViewById(R.id.btnseis);
        seis=MediaPlayer.create(this, R.raw.seis);
        btnseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seis.start();
            }
        });
        btnsiete=(ImageButton)findViewById(R.id.btnsiete);
        siete=MediaPlayer.create(this, R.raw.siete);
        btnsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                siete.start();
            }
        });
        btnocho=(ImageButton)findViewById(R.id.btnocho);
        ocho=MediaPlayer.create(this, R.raw.ocho);
        btnocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ocho.start();
            }
        });


    }
    public void btntres(View view){

        Intent botonsiguientetres= new Intent(this, parte4.class);
        startActivity(botonsiguientetres);}
}