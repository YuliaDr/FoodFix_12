package com.example.user.foodfix_12.app

import android.app.Application
import com.example.user.foodfix_12.BuildConfig
import com.facebook.stetho.Stetho

/**
 * Created by bagrusss on 18.01.2019
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG)
            Stetho.initializeWithDefaults(this)

    }
}