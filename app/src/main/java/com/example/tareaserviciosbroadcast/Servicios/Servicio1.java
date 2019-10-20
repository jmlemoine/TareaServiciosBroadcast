package com.example.tareaserviciosbroadcast.Servicios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tareaserviciosbroadcast.R;

public class Servicio1 extends AppCompatActivity {

    Button start, stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio1);

        start = findViewById(R.id.btnStart);
        stop = findViewById(R.id.btnReset);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intsa = new Intent(Servicio1.this, MyService.class);
                startService(intsa);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intso = new Intent(Servicio1.this, MyService.class);
                stopService(intso);
            }
        });

    }

}
