package com.example.lektion1android

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val tag = MainActivity::class.java.simpleName
    lateinit var editText : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(tag,"Test")
        editText = findViewById(R.id.inputText)

        val button = findViewById<Button>(R.id.button)
        button.text = "Tryck"

    }
    fun buttonPressed(view: View) {
        Log.d(tag,"Button Pressed")
        Log.d(tag,editText.text.toString())
    }
}
