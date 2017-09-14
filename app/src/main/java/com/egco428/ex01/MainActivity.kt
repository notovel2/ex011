package com.egco428.ex01

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        button.setOnClickListener {
//            val y = editText.text.toString().toInt()
//            val x = 20
//            when(y%2){
//                0 -> {
//                    Log.d("Result","Even  number")
//                    label.text = "Even number"
//                }
//                else ->{
//                    Log.d("Result","Odd number")
//                    label.text = "Odd number"
//                }
//            }
//        }
//        button.setOnClickListener {
//            val numbers = mutableListOf<Int>(1,2,3,4,5)
//            for(i in numbers){
//                Log.d("Number","$i")
//            }
//            Log.d("First Number",numbers.first().toString())
//            Log.d("Last Number",numbers.filter { it%2 != 0 }.toString())
//        }
        button.setOnClickListener {
//            val noDuplicate = hashSetOf<String>("a","b","c","c","d")
////            for(item in noDuplicate.toSortedSet()){
////                Log.d("Item",item)
////            }
//            val myHashMap = hashMapOf<String,Int>("First" to 1,"Second" to 2,"Third" to 3)
//            Log.d("Item",myHashMap["First"].toString())
//            Log.d("Item",myHashMap["Second"].toString())
//            Log.d("Item",myHashMap["Third"].toString())
            val username = editText.text.toString()
            val password = editText2.text.toString()

            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("user",username)
            intent.putExtra("pass",password)
            startActivity(intent)
        }
        clearBtn.setOnClickListener {
            editText.setText("")
            editText2.setText("")
        }
    }

    override fun onResume() {
        super.onResume()
        editText.setText("")
        editText2.setText("")
    }
}
