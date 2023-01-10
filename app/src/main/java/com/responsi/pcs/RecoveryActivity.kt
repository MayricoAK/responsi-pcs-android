package com.responsi.pcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RecoveryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recovery)

        val btnBack = findViewById<Button>(R.id.backLogin)
        btnBack.setOnClickListener {
            val Intent4= Intent(this,LoginActivity::class.java)
            startActivity(Intent4)
        }
    }
}