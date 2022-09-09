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

    // Dengan task yang sama kita gunakan do-while
    var iterator = 0
    do {
        println(array[iterator])
        iterator++
    } while (iterator <= array.size - 1)

    iterator = 0
    do {
        if (array[iterator].equals(30f)) {
            array[iterator] = 30
        }
        iterator++
    } while (iterator <= array.size - 1)

    println(array)
}
