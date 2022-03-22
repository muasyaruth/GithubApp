package com.example.github

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)

        val btn1=findViewById<Button>(R.id.page1Btn)
        val home=findViewById<Button>(R.id.home)

        btn1.setOnClickListener{
            val page1=Intent(this,Page1::class.java)
            startActivity(page1)
        }
        home.setOnClickListener{
            val myHome= Intent(this,MainActivity::class.java)
            startActivity(myHome)
        }

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}