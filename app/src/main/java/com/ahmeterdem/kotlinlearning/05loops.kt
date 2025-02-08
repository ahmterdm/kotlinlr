package com.ahmeterdem.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // For Loop
        val myArray = arrayOf(12,15,18,21,24,27,30,33)
        for(number in myArray){
            val z = number/3*5
            println(z)
        }

        for(i in myArray.indices){ // .indices dizinin 0dan başlayarak index numaralarını verir.

            println(myArray[i])
        }

        for (b in 0..9){ // b 0 ve 9 dahil değerlerini sırayla alır.
            println(b)
        }

        val strArray = arrayListOf<String>()
        strArray.add("Ahmet")
        strArray.add("Erdem")
        strArray.add("Test")

        for(str in strArray)
            println(str)

       // While Loop

        var j = 0
        while(j<10) {
            println("j")
            j++
        }

    }
}