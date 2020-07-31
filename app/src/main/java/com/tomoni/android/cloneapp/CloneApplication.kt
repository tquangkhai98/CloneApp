package com.tomoni.android.cloneapp

import android.app.Application
import android.util.Log
import com.tomoni.android.cloneapp.lib.constants.Constants

class CloneApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Log.e(Constants.TAG,"Application started")
    }


}