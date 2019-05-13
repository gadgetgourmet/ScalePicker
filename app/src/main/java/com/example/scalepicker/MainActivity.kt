package com.example.scalepicker

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        chooseScale(findViewById<Button>(R.id.scale_button))
    }

    fun chooseScale(view: View) {
        // get the text view
        val scaleView = findViewById<TextView>(R.id.displayText)

        val scales = arrayOf("C", "D", "E", "F", "G", "A", "B", "C#", "Eb", "F#", "Ab", "Bb")

        val majmin = arrayOf("Major", "Minor")

        scaleView.text = scales[(0..11).random()] + " " + majmin[(0..1).random()]
    }

}
