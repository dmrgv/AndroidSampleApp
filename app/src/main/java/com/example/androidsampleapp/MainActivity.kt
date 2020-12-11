package com.example.androidsampleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val centerBtn: Button = findViewById(R.id.center_button)
        centerBtn.setOnClickListener {
            Log.d("нажата", centerBtn.text.toString())
        }

        val leftBtn: Button = findViewById(R.id.left_button)
        leftBtn.setOnClickListener {
            Log.d("нажата", leftBtn.text.toString())
        }

        val rightBtn: Button = findViewById(R.id.right_button)
        rightBtn.setOnClickListener {
            Log.d("нажата", rightBtn.text.toString())
        }
    }
}