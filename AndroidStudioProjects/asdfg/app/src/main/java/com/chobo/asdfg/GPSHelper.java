package com.chobo.asdfg;

import android.app.Activity;
import android.content.pm.PackageManager;

import androidx.core.app.ActivityCompat;
import android.Manifest;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;

public class GPSHelper {
    private Activity activity;
    private LocationRequest locationRequest;
    private LocationCallback locationCallback;
    private FusedLocationProviderClient fusedLocationProviderClient;
    private GPSHelperListener listener;
    interface GPSHelperListener{
        void onReady();

        void onlocationResult(LocationResult locationResult);
    }
    public GPSHelper(Activity activity){
        this.activity = activity;
        checkAndPermissionRequest();
    }
    public void prepareGPS(GPSHelperListener listener){
        this.listener = listener;
        locationRequest = com.google.android.gms.location.LocationRequest.create();
        locationRequest.setInterval(1000);
        locationRequest.setFastestInterval(500);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
    }
    private void checkAndPermissionRequest(){
        int permissionCheck = ActivityCompat.checkSelfPermission(activity, Manifest.permission.ACCESS_FINE_LOCATION);

        if(permissionCheck != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(activity,new String[]{Manifest.permission.ACCESS_FINE_LOCATION}, 1);
        }
    }
}
