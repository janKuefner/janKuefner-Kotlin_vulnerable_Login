package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.util.Log

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val hardcodedPassword = "1234"
        var textView1 =  findViewById<TextView>(R.id.textView1)
        var enterButton = findViewById<Button>(R.id.enterButton)
        var passwordEntered = findViewById<EditText>(R.id.editTextPassword)

        enterButton.setOnClickListener {
            //textView1.text  = "correct password"
            //println(passwordEntered.text)
            if(passwordEntered.text.toString() == hardcodedPassword){
                textView1.text  = "correct password"
            }else{
                textView1.text  = "incorrect password"
            }


            //Toast.makeText(this, "yolo", Toast.LENGTH_LONG).show()
        }
    }
}
