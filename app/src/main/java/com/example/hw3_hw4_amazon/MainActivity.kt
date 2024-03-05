package com.example.hw3_hw4_amazon

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var signInBtn: Button
    private lateinit var createAccountBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Important find inputs, btns after layout creation
        signInBtn = findViewById(R.id.signInBtn)
        createAccountBtn = findViewById(R.id.createAccountBtn)

        signInBtn.setOnClickListener {
            // new Intent(context, java class of file)
            val intent = Intent(this, Dashboard::class.java)
            startActivity(intent);
        }

        createAccountBtn.setOnClickListener {
            val intent = Intent(this, Signup::class.java)
            startActivity(intent);
        }
    }

    fun test() {

    }
}