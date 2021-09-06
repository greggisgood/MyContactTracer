package com.apssd.mycontacttracer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val LOGIN_NAME = "com.apssd.mycontacttracer.LOGIN_NAME"


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onStartButtonClick(view:View)
    {
        val intent = Intent(this, GreetingActivity::class.java)
        startActivity(intent)
    }


}