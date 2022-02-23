package com.example.aprendamoslosnumeros;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    ImageButton Play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Play= (ImageButton) findViewById(R.id.ImgPlay);
        mp= MediaPlayer.create(this, R.raw.inicio);
        Play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               jugar();
            }
        });


    }
public void jugar(){
    //Toast.makeText(getApplicationContext(), "INICIANDO", Toast.LENGTH_SHORT).show();
    Intent inicio= new Intent(getApplicationContext(),parte2.class);
    startActivity(inicio);
}
}