package com.example.tareaserviciosbroadcast.Main;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tareaserviciosbroadcast.R;
import com.example.tareaserviciosbroadcast.Servicios.ServicioActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnServ(View v){
        Intent intS = new Intent(this, ServicioActivity.class);
        startActivity(intS);
    }

}
