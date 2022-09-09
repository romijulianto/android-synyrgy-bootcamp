package com.romijulianto.fundamentalkotlin

/* Hands on Class and Object
* 09 September 2022
* Buatlah sebuah class Hewan, dimana memiliki
* property
* 1. Jenis: String
* Jumlah Kaki: Int
* Familia: String dan ini boleh null
* */

class Hewan{
    var jenis: String
    var jumlahKaki: Int
    var familia: String? = null

    constructor(_jenis: String, _jumlahKaki: Int, _familia: String?) {
        this.jenis = _jenis
        this.jumlahKaki = _jumlahKaki
        this.familia = _familia
    }

    constructor(_jenis: String, _jumlahKaki: Int) {
        this.jenis = _jenis
        this.jumlahKaki = _jumlahKaki
    }
}

enum class Familia(var familia: Int, var deskripsi: String){
    Mamalia(1, "Menyusui"), Vertebrata(2, "Tulang Belakang"), Reptile(3, "Melata"), Bird(4, "Melayang")
}

fun main() {
    println("\n=======DAY 5=======")
    var sapi = Hewan("Sapi", 4, Familia.Mamalia.deskripsi)
    println("Jenis: ${sapi.jenis}\n" +
            "Jumlah Kaki: ${sapi.jumlahKaki}\n" +
            "Family: ${sapi.familia}")
}