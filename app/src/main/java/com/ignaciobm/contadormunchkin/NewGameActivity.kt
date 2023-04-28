package com.ignaciobm.contadormunchkin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class NewGameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_game)
        val btnInc = findViewById<Button>(R.id.increment_button)
        val levelTextView = findViewById<TextView>(R.id.level_textview)

        btnInc.setOnClickListener { incrementLevel() }

        val level = 0
        var bonus = 0



        levelTextView.text = "Level: $level"



        level--
        levelTextView.text = "Score: $level"

        }

    private fun incrementLevel() {
        level++
        levelTextView.text = "Score: $level"
    }
}

    private fun resetLevel(view: View) {
        level = 0
        levelTextView.text = "Score: $level"
}