package com.example.signinyouraccount

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast


class incrementdecrement: AppCompatActivity() {


    private var count: Int = 0
    private lateinit var countText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.incrementdecrement)

        supportActionBar?.title = "OUR FIRST ANDROID APP"

        countText = findViewById(R.id.count_text)
    }

    fun incrementCount(view: View) {

        count++
        countText.text = count.toString()
        Toast.makeText(this@incrementdecrement,
            "You are Increment : $count",
            Toast.LENGTH_LONG
        ).show()

    }

    fun decrementCount(view: View) {
        if (count > 0) {
            count--
            countText.text = count.toString()
            if (count !==0){
                Toast.makeText(this@incrementdecrement,
                    "You are Decrement : $count",
                    Toast.LENGTH_LONG
                ).show()}
            else{

            }
        }


    }
}
