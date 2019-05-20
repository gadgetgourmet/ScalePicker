package com.example.scalepicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        chooseScale(findViewById<Button>(R.id.btnScale))


    }

    fun chooseScale(view: View) {
        // get the text view
        val scaleView = findViewById<TextView>(R.id.tvScale)

        val scales = arrayOf("C", "G", "D", "A", "E", "B", "F#", "C#", "F", "Bb", "Eb", "Ab")

        val majmin = arrayOf("Major", "Minor")

        scaleView.text = scales[(0..11).random()] + " " + majmin[(0..1).random()]


    }

    fun resetHistory(view: View) {

    }
}
