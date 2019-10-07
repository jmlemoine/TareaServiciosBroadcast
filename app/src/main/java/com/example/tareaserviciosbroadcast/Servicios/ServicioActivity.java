package com.example.tareaserviciosbroadcast.Servicios;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tareaserviciosbroadcast.R;

public class ServicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servicio);
    }

    public void btnServ1(View v){
        Intent intS1 = new Intent(this, Servicio1.class);
        startActivity(intS1);
    }

    public void btnServ2(View v){
        Intent intS2 = new Intent(this, Servicio2.class);
        startActivity(intS2);
    }


}
