package com.example.github

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view1=findViewById<Button>(R.id.button1)
        val view2=findViewById<Button>(R.id.button2)

        view1.setOnClickListener{
            val page1= Intent(this,Page1::class.java)
            startActivity(page1)
        }
        view2.setOnClickListener{
            val page2= Intent(this,Page2::class.java)
            startActivity(page2)
        }
    }
}