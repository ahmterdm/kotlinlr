package com.ahmeterdem.kotlinlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Arrays

        val myArray = arrayOf("Ahmet","Ertan","Elanur","Kemal","Zuhal")
        println(myArray[0]) // ilk eleman
        println(myArray) // Dizinin tutulduğu adresi gösterir.

        println(myArray.size) // Dizideki eleman sayısı
        println(myArray.get(1)) // 2. eleman
        myArray.set(1,"Ertan Erdem")
        println(myArray[1])

        val Array = doubleArrayOf(2.4,3.6,6.9) // sadece double barındıran array tanımladık.

        val mixedArray = arrayOf("Ahmet",5,3.4) // arrayOf ile tanımladığımızda tür belirtmediğimiz
        // için her veri türü arrayda barınabilir.
        println(mixedArray[0])
        println(mixedArray[1])


        // List - ArrayList
        // List'de array gibi eleman sayısını dinamik bir şekilde arttırabilir,azaltabiliriz.

        val myMusician = arrayListOf<String>("James","Kirk")
        myMusician.add("Lars") // Bu şekilde ekleme yapabiliyoruz.
        println(myMusician[2])
        myMusician.add(0,"Rob") // Bu şekilde index belirterek de ekleme
        // yapabiliriz. Bu durumda eklenen indexden sonraki elemanlar bir sağa kayar.

        val myArrayList = arrayListOf<Int>()
        myArrayList.add(1)
        myArrayList.add(222)

        // Set
        // Array'dem farkı: bir eleman set'in içinde sadece bir kere olabilir.

        val myExArray = arrayOf(1,1,2,3,4)
        println("element 1: ${myExArray[0]}")
        println("element 2: ${myExArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size) // Burada 3 çıktısını verir çünkü 2 tane 1 var

        mySet.forEach { println(it) } // Burada her elemeni tek tek yazdırır.
        // for each döngüsünde her element tek tek it'e atanır ve yazdırılır.

        val myStringSet = hashSetOf<String>() // arrayyListof gibi çalışır set oluşturmaya yarar.
        myStringSet.add("Ahmet")
        myStringSet.add("Ali")

        // Map - HashMap
        // Key - Value eşleşmesi
        val fruitCaloriMap = hashMapOf<String,Int>()
        fruitCaloriMap.put("Apple",80) // Map'de ekleme yaparken add yerine put kullanırız.
        fruitCaloriMap.put("Banana",150)
        println(fruitCaloriMap["Apple"]) // 80 çıktısını verir.

        val myNewMap = hashMapOf<String,Int>("A" to 1,"B" to 2)
        // Bu şekilde de tanımlama yapabiliriz.
        

    }
}