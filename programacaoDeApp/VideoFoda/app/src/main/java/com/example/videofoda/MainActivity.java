package com.example.videofoda;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView video;
    Web
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        video = findViewById(R.id.videoView);
        String c = "android.resource://"+getPackageName()+"/"+R.raw.monkeyflip;
        Uri uri = Uri.parse(c);
        video.setVideoURI(uri);

        MediaController mc = new MediaController(this);
        video.setMediaController(mc);
        mc.setAnchorView(video);
    }
}
