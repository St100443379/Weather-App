package com.example.myweatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val MainMenubtn = findViewById<Button>(R.id.MainMenubtn)
        MainMenubtn.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

         val Exitbtn = findViewById<Button>(R.id.Exitbtn)
           Exitbtn.setOnClickListener {
           System.exit(0)
           }





    }
}