package com.example.signinyouraccount



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.Random
import android.widget.*


class Captchatyping : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.captchatypingactivity)



        generateCode()

        val submitButton: Button = findViewById(R.id.submit_button)
        submitButton.setOnClickListener {
            checkCode()
        }

        val generateButton: Button = findViewById(R.id.generate_button)
        generateButton.setOnClickListener {
            generateCode()
        }
    }

    private fun generateCode() {
        val code = generateRandomString(8)
        val codeTextView: TextView = findViewById(R.id.code_textview)
        codeTextView.text = code
    }

    private fun generateRandomString(length: Int): String {
        val charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890"
        val random = Random()
        val sb = StringBuilder()
        for (i in 0 until length) {
            val index = random.nextInt(charset.length)
            sb.append(charset[index])
        }
        return sb.toString()
    }

    private fun checkCode() {
        val submitButton = findViewById<Button>(R.id.submit_button)
        val editText = findViewById<EditText>(R.id.input_edittext)
        val codeTextView = findViewById<TextView>(R.id.code_textview)
        val generatedCode = codeTextView.text.toString()

        submitButton.setOnClickListener {
            val input = editText.text.toString()
            if (input.isEmpty()) {
                Toast.makeText(this, "Please enter a code", Toast.LENGTH_SHORT).show()
            } else {
                // process the user input
                if (input == generatedCode) {
                    Toast.makeText(
                        this,
                        "Congratulations! You entered a correct code!",
                        Toast.LENGTH_SHORT
                    ).show()
                    editText.setText("")
                } else {
                    Toast.makeText(this, "Invalid code! Please try again.", Toast.LENGTH_SHORT)
                        .show()
                    editText.setText("")
                }
            }
        }

    }
}
