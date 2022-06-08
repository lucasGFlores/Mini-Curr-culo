package com.example.aulastorage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        img = findViewById(R.id.lol);
    if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED){
        ActivityCompat.requestPermissions(this,new String[]{
                Manifest.permission.READ_EXTERNAL_STORAGE}, 0);
        }
    }
    public void procurar(View v){
    Intent i = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
    startActivityForResult(i,0);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 0 && resultCode == RESULT_OK){
        Uri imagemSelecionada = data.getData();
        String[] caminhoArquivo = {MediaStore.Images.Media.DATA};
        Cursor c = getContentResolver().query(imagemSelecionada,caminhoArquivo,null,null,null);
        c.moveToFirst();
        int coluna = c.getColumnIndex(caminhoArquivo[0]);
        String apontaFoto = c.getString(coluna);
        c.close();
        Bitmap imagem = BitmapFactory.decodeFile(apontaFoto);
        img.setImageBitmap(imagem);
        }
    }
}