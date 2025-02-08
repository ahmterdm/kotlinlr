package com.ahmeterdem.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = "James"
        val surname = " Hatfield"
        val fullname = name + surname
        println(fullname)
        val myString = "ahmet erdem"

        println(myString.capitalize()) // stringin ilk harfini büyük harfe çevirir.

    }
}