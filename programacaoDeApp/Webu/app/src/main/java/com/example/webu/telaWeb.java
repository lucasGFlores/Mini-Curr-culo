package com.example.webu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class telaWeb extends AppCompatActivity {
    static String link;
    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_web);
        getSupportActionBar().hide();
        wv = findViewById(R.id.webisinho);
        wv.setWebViewClient(new WebViewClient());
        wv.loadUrl(link);
    }
}