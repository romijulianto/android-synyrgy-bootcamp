package com.romijulianto.fundamentalkotlin

/*
* Anda bisa mendeklarasikan sebuah variable di kotlin dengan berbagai macam cara
* Immutable -> Tidak Dapat dirubah (Final value)
* Mutable -> Dapat dirubah
* */
fun main() {
    val nama = "Andrea"
    var usia = 7
    /*
    * Secara default nama bertipe string dan usia bertipe int,
    * Anda dapat membuktikannya dengan mencetak simplename (baris 16) atau sekedar arahkan (hover) variablenya dengan sekaligus tekan kontrol
    * */

    println(nama::class.java) //String
    println(usia::class.java) //String

    /*
    * Karena nama menggunakan val maka ia akan error jika di reassign (baris 22)
    * Sementara usia menggunakan var, maka ia dapat diubah reassign (baris 23)
    * */

    //nama = "Dian"
    usia = 28

    /*
    * Anda dapat mendefinisikan variable dengan langsung mendefinisikan tipe datanya,
    * */

    val namaTeman: String = "Arif"
    val usiaTeman: Int = 25

    /*
    * Anda dapat memaksa suatu variabel untuk berubah tipe datanya, dengan melakukan casting
    * namun dalam melakukan casting harus berhati - hati
    * Karena casting itu seperti maksa agar tipe datanya berubah.
    * Anda tidak dapat casting dari String to Int jika value dari String bukanlah angka
    * Anda akan terkena number format exception
    *
    * Untuk melakukan casting anda cukup menggunakan extension dari variable yang ingin kalian paksa berubah cast
    * */

    val hasilPembagian: Double = usiaTeman.toDouble() / usia.toDouble()
    println(hasilPembagian)
}
