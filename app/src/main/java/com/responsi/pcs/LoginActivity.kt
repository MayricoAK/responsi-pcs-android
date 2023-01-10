package com.responsi.pcs

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)


        val btnLogin = findViewById<Button>(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val Intent= Intent(this,HomeActivity::class.java)
            startActivity(Intent)
        }

        val lupaPass = findViewById<TextView>(R.id.lupaPass)
        lupaPass.setOnClickListener {
            val Intent2= Intent(this,RecoveryActivity::class.java)
            startActivity(Intent2)
        }

        val daftar = findViewById<TextView>(R.id.daftarUser)
        daftar.setOnClickListener {
            val Intent3= Intent(this,RegisterActivity::class.java)
            startActivity(Intent3)
        }
    }
}