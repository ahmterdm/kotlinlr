package com.ahmeterdem.kotlinlearning

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
        mySum(5,7)
        println(myMultiply(8,3))
        Sum(8,9)
    }

    fun test(){
        println("Test Function")
    }

    fun mySum(a : Int, b : Int){
        println(a+b)
    }
    fun myMultiply(a : Int, b : Int) : Int{ // Buradaki int fonksiyon eğer return yapacaksa
        // return yapacağı verinin tipini belirtmek için yazılır.

        return a*b
    }

    // Fonksiyonlar ile layout bağlama örneği

    fun Sum(a : Int, b : Int){
        val myTextView = findViewById<TextView>(R.id.textView)
        myTextView.text = "Result: ${a+b}"
    }


}