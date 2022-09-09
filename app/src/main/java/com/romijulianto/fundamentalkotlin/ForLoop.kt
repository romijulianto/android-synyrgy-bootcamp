package com.romijulianto.fundamentalkotlin

fun main() {
    /*
    * Di Kotlin anda dapat menginisialisasi arraylist / mutablelist seperti dibawah
    * Any adalah bentuk tipe data, selayaknya String, Int, Double, etc
    * Any digunakan jika tipe datanya memang abstrak.
    * */
    val array = arrayListOf<Any>()

    array.add("Andrea")
    array.add(25)
    array.add(30f)

    //Anda dapat mengelola array tersebut dengan menggunakan for-loop dengan range objeknya
    for (objArray in array) {
        println(objArray)
    }

    //bentuk itu sama dengan for-loop seperti dibawah ini
    array.forEach {
        println(it)
    }

    //Jika anda ingin mendapatkan indexnya, Anda bisa menggunakan for-loop dengan rangenya adalah keseluruhan indeks dari array tersebut
    for (index in array.indices) {
        println("$index - ${array[index]}")
    }

    //bentuk itu sama dengan for-loop index seperti dibawah ini
    array.forEachIndexed { index, obj ->
        println("$index - ${array[index]}")
    }

    /*
    * biasanya kita membutuhkan index ketika kita ingin swap value, jika hanya sekedar mencari anda cukup loop objectnya
    * */

    array.forEach {
        if (it.equals(30f)){
            println("Ketemu ada di index ${array.indexOf(it)}")
        }
    }

    //swap value 30f -> 30
    array.forEachIndexed { index, obj ->
        if (obj.equals(30f)){
            array[index] = 30
        }
    }

    println(array)
}
