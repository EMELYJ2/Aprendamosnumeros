package com.example.aprendamoslosnumeros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class parte2 extends AppCompatActivity {
    //"uno
    MediaPlayer uno;
    ImageButton btnuno;
    //dos
    MediaPlayer dos;
    ImageButton btndos;
    //tres
    MediaPlayer tress;
    ImageButton btntress;
    //cuatro
    MediaPlayer cuatroo;
    ImageButton btncuatro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parte2);


        btnuno=(ImageButton)findViewById(R.id.btnuno);
        uno=MediaPlayer.create(this, R.raw.uno);
        btnuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                uno.start();

            }


        });

        btndos=(ImageButton)findViewById(R.id.btndos);
        dos=MediaPlayer.create(this, R.raw.dos);
        btndos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dos.start();
            }
        });

        btntress=(ImageButton)findViewById(R.id.btntress);
        tress=MediaPlayer.create(this, R.raw.tress);
        btntress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tress.start();
            }
        });

        btncuatro=(ImageButton)findViewById(R.id.btncuatroo);
        tress=MediaPlayer.create(this, R.raw.cuatroo);
        btntress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuatroo.start();
            }
        });


    }

    public void btnsiguiente(View view){

        Intent botonsiguiente= new Intent(this, parte3.class);
        startActivity(botonsiguiente);}

}