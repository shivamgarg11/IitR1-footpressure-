package com.shivam.iitr1footpressure;

import android.Manifest;
import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.widget.ArrayAdapter;

public class supportclass {

    public static BluetoothAdapter mBTAdapter;
    public static ArrayAdapter<String> mBTArrayAdapter;


    // #defines for identifying shared types between calling functions
    public final static int REQUEST_ENABLE_BT = 1; // used to identify adding bluetooth names


    Context context;
    public supportclass(Context context) {
    this.context=context;
    }



    public void start() {
        mBTArrayAdapter =new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1);
        mBTAdapter =BluetoothAdapter.getDefaultAdapter(); // get a handle on the bluetooth radio


      // Ask for location permission if not already allowed
        if(ContextCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions((Activity) context, new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 1);


    }





}
