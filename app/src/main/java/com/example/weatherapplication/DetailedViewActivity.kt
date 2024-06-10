package com.example.weatherapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class DetailedViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detailed_view_screen)

        val days = intent.getStringArrayListExtra("days") ?: arrayListOf()
        val temperatures = intent.getIntegerArrayListExtra("temperatures") ?: arrayListOf()
        val maxTemperatures = intent.getIntegerArrayListExtra("maxTemperatures") ?: arrayListOf()
        val minTemperatures = intent.getIntegerArrayListExtra("minTemperatures") ?: arrayListOf()
        val weatherConditions = intent.getStringArrayListExtra("weatherConditions") ?: arrayListOf()

        val detailedTextView: TextView = findViewById(R.id.detailedTextView)
        val detailedData = StringBuilder()

        for (i in days.indices) {
            detailedData.append("Day: ${days[i]}, Temperature: ${temperatures[i]}°C, Max: ${maxTemperatures[i]}°C, Min: ${minTemperatures[i]}°C, Condition: ${weatherConditions[i]}\n")
        }

        detailedTextView.text = detailedData.toString()

        val backButton: Button = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }
    }
}
