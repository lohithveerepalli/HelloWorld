package com.example.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.buttonSayHello)
        button.setOnClickListener {
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_LONG).show()
        }
    }
}
