package com.univalle.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity_final extends AppCompatActivity {
    Button uno,dos,tres,cuatro,cinco,seis,siete,ocho,nueve,cero,borra,calcular;
    String x,cal;
    EditText a;
    Double r;
    Double m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        Intent recibir = getIntent();
        String titulo = recibir.getStringExtra("titulo");
        cal = recibir.getStringExtra("con");
        setTitle(titulo);
        a = findViewById(R.id.text);
        uno = findViewById(R.id.uno);
        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=a.getText().toString()+"1";
                a.setText(x);
            }
        });

        dos = findViewById(R.id.dos);
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=a.getText().toString()+"2";
                a.setText(x);
            }
        });
        tres = findViewById(R.id.tres);
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=a.getText().toString()+"3";
                a.setText(x);
            }
        });
        cuatro = findViewById(R.id.cuatro);
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=a.getText().toString()+"4";
                a.setText(x);
            }
        });
        cinco = findViewById(R.id.cinco);
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=a.getText().toString()+"5";
                a.setText(x);
            }
        });
        seis= findViewById(R.id.seis);
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=a.getText().toString()+"6";
                a.setText(x);
            }
        });
        siete = findViewById(R.id.siete);
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=a.getText().toString()+"7";
                a.setText(x);
            }
        });
        ocho = findViewById(R.id.ocho);
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=a.getText().toString()+"8";
                a.setText(x);
            }
        });
        nueve = findViewById(R.id.nueve);
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=a.getText().toString()+"9";
                a.setText(x);
            }
        });
        cero = findViewById(R.id.cero);
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=a.getText().toString()+"0";
                a.setText(x);
            }
        });
        borra = findViewById(R.id.borra);
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("");
            }
        });

        calcular = findViewById(R.id.calcular);
        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cal == "caf"){
                    m=Double.parseDouble(a.getText().toString());
                    r=((9*m)/5)+32;
                    a.setText(r+"°F");
                }
                if(cal == "fac"){
                    m=Double.parseDouble(a.getText().toString());
                    r=(5*(m-32))/9;
                    a.setText(r+"°C");
                }
                if(cal == "cak"){
                    m=Double.parseDouble(a.getText().toString());
                    r=m+273.15;
                    a.setText(r+"°K");
                }
                if(cal == "kac"){
                    m=Double.parseDouble(a.getText().toString());
                    r=m-273.15;
                    a.setText(r+"°C");
                }
            }
        });
    }
}
