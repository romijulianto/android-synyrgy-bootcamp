package com.romijulianto.fundamentalkotlin

fun main() {
    // Hands on 06092022
    val firstName = "Romi"
    val lastName = "Julianto"
    val age = 24
    println("$firstName $lastName")
    println(firstName::class.simpleName)
    println(age::class.simpleName)

    // Hands on 07092022
    val mutableList = mutableListOf<Int>( 1 , 2 , 3);
    mutableList.add(3)
    mutableList.removeAt(0)
    mutableList.remove(2)
    println(mutableList)

    val height = 1.67
    val weight = 75
    val bmi = weight/(height*height)
    println(bmi)

    if (bmi < 18.5) {
        println("Kurang berat badan")
    } else if (bmi >= 18.5 && bmi <= 22.9) {
        println("Berat badan ideal")
    } else if (bmi >= 23 && bmi <= 24.9) {
        println("Gemuk")
    } else if (bmi >= 25 && bmi <= 29.9) {
        println("Obesitas Level 2")
    } else {
        println("Obesitas banget")
    }

    // Hands on 0809202
    // Cetak perulangan for
    // Inisiasi for, lalukan perulangan, cek kondisi lalu print
    for (rj in 1..5) {
        if (rj % 2 == 0) {
            return
        }
        println(rj)
    }

    /* Buat Array "Andre" "Kelas" "Android" dan ganti Android
    Pemograman Kotlin */
    val arrayList = arrayListOf<String>(
        "Andre",
        "Kelas",
        "Android"
    )
    for (i in arrayList.indices){
        if (arrayList[i] == "Android"){
            arrayList.set(i, "Pemrograman Kotlin")
        }
        println(arrayList)
    }

    var arrList = mutableListOf("Andre", "Kelas", "Android")

    for (i in arrList.indices){
        if (arrList[i] == "Android"){
            arrList.set(i, "Pemrograman Kotlin")
        }
        println(arrList[i])
    }

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

}