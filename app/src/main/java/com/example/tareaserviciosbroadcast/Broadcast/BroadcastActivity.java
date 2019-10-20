package com.example.tareaserviciosbroadcast.Broadcast;

import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tareaserviciosbroadcast.R;

public class BroadcastActivity extends AppCompatActivity {

    //Broadcast1 broadc1 = new Broadcast1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);

    }

    public void BC1(View v){
        Intent intBC1 = new Intent(this, Broadcast1.class);
        startActivity(intBC1);

    }

}
