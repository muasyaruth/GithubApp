package com.example.github

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page1)

        val btn1=findViewById<Button>(R.id.page2Btn)
        val home=findViewById<Button>(R.id.home)

        btn1.setOnClickListener{
            val page2=Intent(this,Page2::class.java)
            startActivity(page2)
        }
        home.setOnClickListener{
            val myHome=Intent(this,MainActivity::class.java)
            startActivity(myHome)
        }

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}