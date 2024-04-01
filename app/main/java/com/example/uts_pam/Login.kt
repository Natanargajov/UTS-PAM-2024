package com.example.uts_pam

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, register::class.java)
            startActivity(intent)
        }, 3000)
    }



}

