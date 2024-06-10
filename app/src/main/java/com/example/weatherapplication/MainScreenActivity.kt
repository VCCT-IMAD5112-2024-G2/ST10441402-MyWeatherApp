package com.example.weatherapplication
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.weatherapplication.R

class MainScreenActivity : AppCompatActivity() {

    private lateinit var dayEditText: EditText
    private lateinit var temperatureEditText: EditText
    private lateinit var maxTemperatureEditText: EditText
    private lateinit var minTemperatureEditText: EditText
    private lateinit var weatherConditionEditText: EditText
    private lateinit var averageTemperatureTextView: TextView
    private lateinit var addButton: Button
    private lateinit var calculateAverageButton: Button
    private lateinit var clearButton: Button
    private lateinit var nextButton: Button

    private val days = mutableListOf<String>()
    private val temperatures = mutableListOf<Int>()
    private val maxTemperatures = mutableListOf<Int>()
    private val minTemperatures = mutableListOf<Int>()
    private val weatherConditions = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        dayEditText = findViewById(R.id.dayEditText)
        temperatureEditText = findViewById(R.id.temperatureEditText)
        maxTemperatureEditText = findViewById(R.id.maxTemperatureEditText)
        minTemperatureEditText = findViewById(R.id.minTemperatureEditText)
        weatherConditionEditText = findViewById(R.id.weatherConditionEditText)
        averageTemperatureTextView = findViewById(R.id.averageTemperatureTextView)
        addButton = findViewById(R.id.addButton)
        calculateAverageButton = findViewById(R.id.calculateAverageButton)
        clearButton = findViewById(R.id.clearButton)
        nextButton = findViewById(R.id.nextButton)

        addButton.setOnClickListener {
            addTemperature()
        }

        calculateAverageButton.setOnClickListener {
            calculateAverageTemperature()
        }

        clearButton.setOnClickListener {
            clearData()
        }

        nextButton.setOnClickListener {
            navigateToNextScreen()
        }
    }

    private fun addTemperature() {
        val day = dayEditText.text.toString()
        val temperature = temperatureEditText.text.toString().toIntOrNull()
        val maxTemperature = maxTemperatureEditText.text.toString().toIntOrNull()
        val minTemperature = minTemperatureEditText.text.toString().toIntOrNull()
        val weatherCondition = weatherConditionEditText.text.toString()

        if (day.isNotEmpty() && temperature != null && maxTemperature != null && minTemperature != null && weatherCondition.isNotEmpty()) {
            days.add(day)
            temperatures.add(temperature)
            maxTemperatures.add(maxTemperature)
            minTemperatures.add(minTemperature)
            weatherConditions.add(weatherCondition)

            dayEditText.text.clear()
            temperatureEditText.text.clear()
            maxTemperatureEditText.text.clear()
            minTemperatureEditText.text.clear()
            weatherConditionEditText.text.clear()

            Toast.makeText(this, "Data added successfully", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please fill all fields correctly", Toast.LENGTH_SHORT).show()
        }
    }

    private fun calculateAverageTemperature() {
        if (temperatures.isNotEmpty()) {
            val averageTemperature = temperatures.average()
            averageTemperatureTextView.text = "Average Temperature: %.2f".format(averageTemperature)
        } else {
            Toast.makeText(this, "No temperature data available", Toast.LENGTH_SHORT).show()
        }
    }

    private fun clearData() {
        days.clear()
        temperatures.clear()
        maxTemperatures.clear()
        minTemperatures.clear()
        weatherConditions.clear()
        averageTemperatureTextView.text = "Average Temperature: "

        dayEditText.text.clear()
        temperatureEditText.text.clear()
        maxTemperatureEditText.text.clear()
        minTemperatureEditText.text.clear()
        weatherConditionEditText.text.clear()

        Toast.makeText(this, "Data cleared", Toast.LENGTH_SHORT).show()
    }

    private fun navigateToNextScreen() {
        // Implement the logic to navigate to the next screen
    }
}

