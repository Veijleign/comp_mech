package com.example.sapr_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("SaprLog", "OnCreate")

        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.container_fragment)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)

        bottomNavigationView.setupWithNavController(navController)


    }

    override fun onStart() {
        super.onStart()
        Log.d("SaprLog", "OnStart")


    }

    override fun onResume() {
        super.onResume()
        Log.d("SaprLog", "OnResume")

    }

    override fun onPause() {
        super.onPause()
        Log.d("SaprLog", "OnPause")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("SaprLog", "OnDestroy")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d("SaprLog", "OnRestart")

    }
}