package com.example.android.helloworld

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class HelloActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        val textview : TextView = findViewById<TextView>(R.id.txt_hello)
        val intent : Intent = getIntent()
        val msg : String? = intent.getStringExtra("name")
        textview.setText("Hello Androiddd"+msg)


    }
}