package com.example.android.helloworld

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = findViewById<EditText>(R.id.edt_username)
        val password = findViewById<EditText>(R.id.edt_password)
        findViewById<Button>(R.id.btn_login).setOnClickListener { btnLogin() }
    }
    private  fun btnLogin(){
        val intent = Intent(this, HelloActivity2::class.java)
        startActivity(intent)

    }

    //end of OnCreate

//    fun gotoHelloActivity2() {
//        val intent = Intent(this, HelloActivity2::class.java)
//        val username = findViewById<EditText>(R.id.edt_username)
//        intent.putExtra("name", username.toString())
//        startActivity(intent)
//    }//end of gotoHelloActivity2

    private fun loginfailed(){
        Toast.makeText(this, "Wrong Credentials", Toast.LENGTH_SHORT).show()
    }//end of loginfailed
}//end of class