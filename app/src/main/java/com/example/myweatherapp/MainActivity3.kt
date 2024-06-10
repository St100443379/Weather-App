package com.example.myweatherapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var txtaveTemp = findViewById<TextView>(R.id.txtavetemp)
        var txttemperature = findViewById<TextView>(R.id.txttemperature)
        var txtweather = findViewById<TextView>(R.id.txtWeather)

        var Detailsbtn = findViewById<Button>(R.id.Detailsbtn)
        var Exitbtn = findViewById<Button>(R.id.Exitbtn)
        var Clearbtn = findViewById<Button>(R.id.Clearbtn)

         Detailsbtn.setOnClickListener {
             // check if there is enough entries
             txtweather.text
             txttemperature.text
             txtaveTemp.text






          Clearbtn.setOnClickListener {

          }












         Exitbtn.setOnClickListener {
         System.exit(0)





         }



         }
    }
}