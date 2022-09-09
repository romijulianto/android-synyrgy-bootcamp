package com.romijulianto.fundamentalkotlin

/*
* Untuk melakukan seleksi kondisi, anda dapat menggunakan 2 pendekatan.
* Bisa menggunakan if else atau menggunakan when
* */
fun main() {
    val nilai = 70
    if (nilai >= 81) {
        println("Nilai A")
    } else if (nilai in 60..80) { // Anda dapat mendefinisikan range dalam bentuk seperti ini, ketimbang menggunakan nilai >= 60 && nilai <= 80
        println("Nilai B")
    } else if (nilai == 70) {
        println("Nilai Standar")
    } else {
        println("Nilai C")
    }

    /*
    * Ketika nilai 70 anda tidak akan pernah mendapat nilai standar, karena sudah di tangkap di range nilai 60..80. Jadi, Solusinya anda harus merubah urutan kondisinya
    * */

    if (nilai >= 81) {
        println("Nilai A")
    } else if (nilai == 70) {
        println("Nilai Standar")
    } else if (nilai in 60..80) { // Anda dapat mendefinisikan range dalam bentuk seperti ini, ketimbang menggunakan nilai >= 60 && nilai <= 80
        println("Nilai B")
    } else {
        println("Nilai C")
    }

    /*
    * Dengan cara yang sama anda dapat mendefinisikan menggunakan when
    * */

    when (nilai) {
        in 81..Int.MAX_VALUE -> println("Nilai A")
        70 -> println("Nilai Standar")
        in 60..80 -> println("Nilai B")
        else -> println("Nilai C")
    }

    /*
    * Anda juga dapat menggunakan style yang lain
    * */

    when {
        nilai in 81..Int.MAX_VALUE -> println("Nilai A")
        nilai == 70 -> println("Nilai Standar")
        nilai in 60..80 -> println("Nilai B")
        else -> println("Nilai C")
    }

    /*
    * di Kotlin anda bisa assign value secara langsung kedalam sebuah variabel, menggunakan seleksi kondisi.
    * Namun, anda harus memberikan default valuenya (baris 66)
    * di beberapa bahasa disebut ternery operator
    * */

    val hasil = if (nilai >= 81) {
        "Nilai A"
    } else if (nilai in 60..80) { // Anda dapat mendefinisikan range dalam bentuk seperti ini, ketimbang menggunakan nilai >= 60 && nilai <= 80
        "Nilai B"
    } else if (nilai == 70) {
        "Nilai Standar"
    } else {
        "Nilai C"
    }

    /*
    * Dengan cara yang sama anda bisa assign value secara langsung menggunakan when,
    * Silakan coba sendiri.
    * */

}
