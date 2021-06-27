package com.koplenov.stenolearn

import android.app.Activity
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.widget.doOnTextChanged

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val previewText = findViewById<TextView>(R.id.previewText)
        val face = Typeface.createFromAsset(assets, "fonts/my_fucked_font.ttf")
        previewText.typeface = face

        val mainEditText = findViewById<EditText>(R.id.mainEditText)
        mainEditText.doOnTextChanged { text, start, before, count -> previewText.text = text }
    }

    fun symbolDisplay(v : View){
        Toast.makeText(applicationContext, (v as Button).text, Toast.LENGTH_SHORT).show()
    }

}

// допилить внешку
// 150кб версия

// 100кб версия

// java версия 15 кб