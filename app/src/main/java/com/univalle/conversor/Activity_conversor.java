package com.univalle.conversor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_conversor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversor);


        final Button unot = findViewById(R.id.caf);
        unot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = unot.getText().toString();
                i.putExtra("titulo",titulo);
                i.putExtra("con","caf");
                startActivity(i);
            }
        });

        final Button dost = findViewById(R.id.fac);
        dost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = dost.getText().toString();
                i.putExtra("titulo",titulo);
                i.putExtra("con","fac");
                startActivity(i);
            }
        });

        final Button trest = findViewById(R.id.cak);
        trest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = trest.getText().toString();
                i.putExtra("titulo",titulo);
                i.putExtra("con","cak");
                startActivity(i);
            }
        });

        final Button cuatrot = findViewById(R.id.kac);
        cuatrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Activity_final.class);
                String titulo = cuatrot.getText().toString();
                i.putExtra("titulo",titulo);
                i.putExtra("con","kac");
                startActivity(i);
            }
        });
    }
}
