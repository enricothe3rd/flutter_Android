package com.example.signinyouraccount



import android.content.Intent
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar



class MainActivity : AppCompatActivity() {






            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val toolbar = findViewById<Toolbar>(R.id.toolbar_2)
                setSupportActionBar(toolbar)
                supportActionBar?.title = "Sign In Your Account"

                val imageView = findViewById<ImageView>(R.id.imageView_2)
                val bitmap = BitmapFactory.decodeResource(resources, R.drawable.images)
                imageView.setImageBitmap(bitmap)


                val usernameInput: EditText= findViewById(R.id.username_input)
                 val passwordInput: EditText= findViewById(R.id.password)

                val submitButton = findViewById<Button>(R.id.submit_button)
                submitButton.setOnClickListener {
                    val username = usernameInput.text.toString()
                    val password = passwordInput.text.toString()

                    if (username == "" || password == "") {

                        Toast.makeText(
                            this@MainActivity,
                            "Invalid Username or Password! Please try again.",
                            Toast.LENGTH_LONG
                        ).show()
                        usernameInput.text.clear()
                        passwordInput.text.clear()
                    } else{
                        val intent = Intent(this, MainMenuActivity::class.java)
                        startActivity(intent)
                    }


                }


            }
}



