package com.example.testevocaional;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Thetrueescolha extends AppCompatActivity {
    MediaPlayer mo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thetrueescolha);
        getSupportActionBar().hide();
        mo = MediaPlayer.create(this, R.raw.standproundfoda);
        mo.start();
    }
    public void yes(View v){
        Intent yes = new Intent(this, Finale.class);
        startActivity(yes);
        mo.stop();
    }
    public void no(View v){
        Intent no = new Intent(this,Escolhas.class);
        startActivity(no);
        mo.stop();
    }
}