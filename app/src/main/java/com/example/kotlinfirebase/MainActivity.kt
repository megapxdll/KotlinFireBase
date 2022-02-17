package com.example.kotlinfirebase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.messaging.FirebaseMessaging

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        FirebaseMessaging.getInstance().token.addOnSuccessListener {
            Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
        }

        val ticketId = intent.extras?.getString("ticketId", "0")
        Toast.makeText(this, ticketId.toString(), Toast.LENGTH_SHORT).show()
    }
}