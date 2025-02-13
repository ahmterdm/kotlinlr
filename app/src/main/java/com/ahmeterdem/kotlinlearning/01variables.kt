package com.ahmeterdem.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("Konsola bu sekilde yazdiriyoruz")


        //Variables
        var x = 5 // Degiskenleri bu sekilde tanimlariz.
        var y = 4
        println(x*y)

        //Constants
        val name ="Ahmet" // Sabit degerler de boyle tanimlanir.

        // Degiskenler veri turleri belirtilerek boyle de tanımlanabilir.
        //Defining
        var myAge : Int
        //Initialize
        myAge= 23
        println(myAge)

        // Long
        var myLong : Long = 100



        // Double & Float

        val pi = 3.14 // Double
        println(pi*2)
        val myFloat =3.14f // bu şekilde sonunda 'f' eklersek float olarak tanımlamış oluruz.

        // Boolean // true / false değerini alan variable
        var myBoolean : Boolean = true

        // Conversion

        var num = 5
        var num_long=  num.toLong() // bu sekilde methodları kullanarak tur donusumu yaoabiliriz.

        println(num_long)

        var input = "10"
        var inputInteger = input.toInt() // Bu sekilde string to int donusumu yapabiliriz.
        println(inputInteger*2)

    }
}
