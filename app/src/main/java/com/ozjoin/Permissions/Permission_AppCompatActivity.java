package com.ozjoin.Permissions;

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

/*
Permissions include :
- READ_CONTACTS
- WRITE_EXTERNAL_STORAGE
- INTERNET
- READ_EXTERNAL_STORAGE

 */

public class Permission_AppCompatActivity extends AppCompatActivity {

    Context mContext;
    Activity mActivity;

    public Permission_AppCompatActivity(Context mContext, Activity mActivity) {
        this.mContext = mContext;
        this.mActivity = mActivity;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public void get_READ_CONTACTS()
    {
        if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.READ_CONTACTS) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(mActivity, new String[]{Manifest.permission.READ_CONTACTS}, 0);
        }
        else {
            log("READ_CONTACTS has already been granted.");
        }
    }

    public boolean get_WRITE_EXTERNAL_STORAGE()
    {
        if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(mActivity, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1);
            return false;
        }
        else {
            log("WRITE_EXTERNAL_STORAGE has already been granted.");
            return true;
        }
    }

    public void get_INTERNET()
    {
        if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(mActivity, new String[]{Manifest.permission.INTERNET}, 2);
        }
        else {
            log("INTERNET has already been granted.");
        }
    }

public void get_READ_EXTERNAL_STORAGE()
    {
        if (ContextCompat.checkSelfPermission(mContext, Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(mActivity, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 3);
        }
        else {
            log("READ_EXTERNAL_STORAGE has already been granted.");
        }
    }




    private void log(String message)
    {
        Log.i(getClass().getName(), message);
    }



}
