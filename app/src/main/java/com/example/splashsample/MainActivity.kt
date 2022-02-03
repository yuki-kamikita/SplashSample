package com.example.splashsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        installSplashScreen()
        // MainActivity 本来の Theme へ差し替える
        setTheme(R.style.Theme_SplashSample)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}