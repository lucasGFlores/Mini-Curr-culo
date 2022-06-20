package com.example.testevocaional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Finale extends AppCompatActivity {
    MediaPlayer mp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finale);
        getSupportActionBar().hide();
        mp = MediaPlayer.create(this,R.raw.joaoestrela);
        mp.start();
    }
    public void voltar(View v){
        Intent i = new Intent(this,Escolhas.class);
        startActivity(i);
        mp.stop();
    }
}