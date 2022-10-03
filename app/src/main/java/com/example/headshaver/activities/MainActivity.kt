package com.example.headshaver.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.headshaver.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAdd = findViewById<Button>(R.id.add)
        val btnShow = findViewById<Button>(R.id.show)
        val btnPick = findViewById<Button>(R.id.pick)
        val btnClear = findViewById<Button>(R.id.clear)
        btnAdd.setOnClickListener {
            Intent(this, AdditionActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}