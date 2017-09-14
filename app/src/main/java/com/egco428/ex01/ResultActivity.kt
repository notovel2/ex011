package com.egco428.ex01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        val userData = hashMapOf<String,String>("user" to "EGCO","pass" to "1234")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val bundle = intent.extras

        if(!bundle.isEmpty){
            val username = bundle.getString("user")
            val password = bundle.getString("pass")
            userText.setText(username)
            passText.setText(password)
            if(username != userData["user"] || password != userData["pass"]){
                Log.d("error","username or password is incorrect")
                this.finish()
            }
            userText.setText(username)
            passText.setText(password)
        }
    }
}
