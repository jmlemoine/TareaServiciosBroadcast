package com.example.tareaserviciosbroadcast.Servicios;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public int onStartCommand(Intent intent, int flags, int startId){
        Toast.makeText(this, "El servicio comenzó", Toast.LENGTH_SHORT).show();
        return START_STICKY;
        //return super.onStartCommand(intent, flags, startId);
    }

    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "El servicio terminó", Toast.LENGTH_SHORT).show();

    }

}
