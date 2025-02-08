package com.ahmeterdem.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var m = 5
        m++
        println(m)
        var n = 8
        n--
        println(n)

        println(m>n) // false döndürür
        // C'deki gibi || && operatorleri de aynı şekilde çalışır

        println((n>m)&&(5<7)) // true döndürür.

        // If
        val myAge = 30
        if(myAge<32){
            println("< 32")
        }
        else if(myAge>=32 && myAge<40){
            println("32<=Age<40")
        }

        else
            println(">= 40") // bir satır kod yazacaksak if ve else için {} kullanmaya gerek yok.

        // When(switch)
        val day = 3
        var dayString = ""
        when(day) {
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 -> dayString = "Wednesday"
            else -> dayString = ""
        }



    }
}