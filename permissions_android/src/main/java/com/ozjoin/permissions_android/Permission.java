package com.ozjoin.permissions_android;

/*
Permissions include :
- READ_CONTACTS
- WRITE_EXTERNAL_STORAGE
- INTERNET
- READ_EXTERNAL_STORAGE

 */

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class Permission extends AppCompatActivity {


    Context mContext;
    Activity mActivity;
    boolean logging;

    public Permission(Context mContext, Activity mActivity, boolean logging) {
        this.mContext = mContext;
        this.mActivity = mActivity;
        this.logging = logging;
    }

    public boolean isLogging() {
        return logging;
    }

    public void setLogging(boolean logging) {
        this.logging = logging;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public boolean get_READ_CONTACTS()
    {
        if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(mActivity, new String[]{Manifest.permission.READ_CONTACTS}, 0);
            return false;
        }
        else {
            if(isLogging())
            {
                log("READ_CONTACTS has already been granted.");
            }
            return true;
        }
    }

    public boolean get_WRITE_EXTERNAL_STORAGE()
    {
        if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(mActivity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            return false;
        }
        else {
            if(isLogging())
            {
                log("WRITE_EXTERNAL_STORAGE permission has already been granted.");
            }

            return true;
        }
    }

    public boolean get_INTERNET()
    {
        if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(mActivity, new String[]{Manifest.permission.INTERNET}, 2);
            return false;
        }
        else {
            if(isLogging()) {
                log("INTERNET permission has already been granted.");
            }
            return true;
        }
    }

    public boolean get_READ_EXTERNAL_STORAGE()
    {
        if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(mActivity, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 3);
            return false;
        }
        else {
            if(isLogging()) {
                log("READ_EXTERNAL_STORAGE has already been granted.");
            }
            return true;
        }
    }

    private void log(String message)
    {
        Log.i(getClass().getName(), message);
    }


}
