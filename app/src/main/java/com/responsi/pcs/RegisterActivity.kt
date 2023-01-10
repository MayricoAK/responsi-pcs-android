package com.responsi.pcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val backk = findViewById<Button>(R.id.backkk)
        backk.setOnClickListener {
            val Intent5= Intent(this,LoginActivity::class.java)
            startActivity(Intent5)
        }
    }
}