package com.example.webu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText search;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        search = findViewById(R.id.search);

    }
    public void pesquisarTop(View v){
     String pesquisa = search.getText().toString();
     String link = "https://pt.wikipedia.org/wiki/"+pesquisa;
     telaWeb.link = link;
        Intent i = new Intent(this, telaWeb.class);
        startActivity(i);
    }

}