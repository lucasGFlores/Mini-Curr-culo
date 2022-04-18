package com.example.antigofoda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText hi,mi,hf,mf;
    TextView hr,mr;
    int ohi,omi,ohf,omf,ohr,omr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        hi = findViewById(R.id.inithora);
        mi = findViewById(R.id.initmin);
        hf = findViewById(R.id.finhora);
        mf = findViewById(R.id.finmin);
        hr = findViewById(R.id.resultHora);
        mr = findViewById(R.id.resultMinuto);
    }
    public void adicionar(View V){

        ohi = Integer.parseInt(hi.getText().toString());
        omi = Integer.parseInt(mi.getText().toString());
        ohf = Integer.parseInt(hf.getText().toString());
        omf = Integer.parseInt(mf.getText().toString());
        ohr = ohi+ohf;
        omr = omf+omi;
        while(omr > 59){
            ohr ++;
            omr = omr-60;
        }
        mr.setText(omr+"");
        hr.setText(ohr+"");
    }
    public void subtrair(View V){
            ohi = Integer.parseInt(hi.getText().toString());
            omi = Integer.parseInt(mi.getText().toString());
            ohf = Integer.parseInt(hf.getText().toString());
            omf = Integer.parseInt(mf.getText().toString());
        if( ohf < ohi){
           int i = ohi;
           int f = ohf;
           ohi = f;
           ohf = i;
        }
        ohr = ohf-ohi;
        omr = omi-omf;
        while(omr < 0){
            ohr --;
            omr = omr + 60;
        }
        mr.setText(omr+"");
        hr.setText(ohr+"");

    }
    public void resetar(View V){
        hi.setText("");
        hf.setText("");
        mi.setText("");
        mf.setText("");
        mr.setText("");
        hr.setText("");
    }
}