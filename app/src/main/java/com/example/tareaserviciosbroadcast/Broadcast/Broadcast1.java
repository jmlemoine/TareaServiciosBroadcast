package com.example.tareaserviciosbroadcast.Broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tareaserviciosbroadcast.R;

public class Broadcast1 extends AppCompatActivity {

    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast1);

        textView = findViewById(R.id.txtMensaje);

    }

    public void sendBroadcast(View v){
        Intent intent = new Intent("com.codinginflow.EXAMPLE_ACTION");
        intent.putExtra("com.codinginflow.EXTRA_TEXT", "Broadcast Recibido");
        sendBroadcast(intent);
        Toast.makeText(this, "Broadcast Recibido", Toast.LENGTH_SHORT).show();

    }

    private BroadcastReceiver broadcastReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            String receivedText = intent.getStringExtra("com.codinginflow.EXTRA_TEXT");
            textView.setText(receivedText);

        }
    };

    @Override
    protected void onStart(){
        super.onStart();
        IntentFilter filter = new IntentFilter("com.codinginflow.EXAMPLE_ACTION");
        registerReceiver(broadcastReceiver, filter);

    }

    @Override
    protected void onStop(){
        super.onStop();
        unregisterReceiver(broadcastReceiver);

    }

}
