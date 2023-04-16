package com.example.signinyouraccount

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class MainMenuActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activitymainmenu)

            val toolbar = findViewById<Toolbar>(R.id.toolbar)
            setSupportActionBar(toolbar)
            supportActionBar?.title = "Hello Group No."

            val incrementDecrementButton = findViewById<Button>(R.id.increment_decrement_button)
            incrementDecrementButton.setOnClickListener{
                val intent = Intent(this, incrementdecrement::class.java)
                startActivity(intent)
            }

            val captchaTypingButton = findViewById<Button>(R.id.captcha_typing_button)
            captchaTypingButton.setOnClickListener{
                val intent = Intent(this, Captchatyping::class.java)
                startActivity(intent)
            }


        }


}