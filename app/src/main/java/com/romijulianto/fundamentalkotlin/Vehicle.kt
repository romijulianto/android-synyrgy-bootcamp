package com.romijulianto.fundamentalkotlin

class Vehicle {
    /*
    * Istilah baru
    * - lateinit var itu memungkinkan anda untuk deklarasi variable tanpa harus diinisialisasi, Anda harus berhati hati menggunakan ini,
    * pastikan sebelum dipanggil, variable harus diinisiasi.
    * - null-safe pointer (?) memungkinkan anda untuk inisiasi variable dengan nilai null dan ini sangan membantu sebab anda tidak akan terkena
    * null pointer exception.
    * */

    var name: String? = null
    lateinit var model: String
    var typeFuel: String? = null
    var color: String? = null
    lateinit var colorType: Color

    /*
    * Anda bisa mendefinisikan lebih dari 1 constructor dengan inisiasi variable yang berbeda.
    * Ini disebut overloading constructor.
    * Jika hanya satu primary constructor, tapi Anda ingin mendefinisikan variable wajib anda bisa cek class Vehicle2
    * */
    constructor(name: String? = null) {
        this.name = name
    }

    constructor(name: String? = null, model: String? = null) {
        this.name = name
        /*
        * Anda akan menemukan error ketika menginisiasi sebuah variable non null dengan variable null
        * Anda harus menjadikan null-safe variable tadi menjadi variable non null
        * */
        this.model = model
        //Anda harus merubahnya menjadi
        if (model != null) {
            this.model = model
        }
        /*
        * atau anda dapat memaksakan variable tersebut menjadi variable non null, dan ini berbahaya,
        * jika variable itu null maka anda akan terkena null pointer exception
        * */
        this.model = model!!

    }

    fun display() {
        val varTypeFuel = if (typeFuel.isNullOrBlank()) "yang belum diketahui" else typeFuel
        println("Kendaraan ini bernama $name dengan model $model dan berbahan bakar $varTypeFuel")
    }
}

class Vehicle2(
    /*
    * Dalam membuat sebuah kelas, Anda dapat langsung set up constructor seperti di bawah
    * Anda dapat langsung set variable yang anda inginkan langsung
    * Ini disebut primary constructor.
    * */
    var name: String? = null, var model: String? = null, var typeFuel: String? = null
) {

    fun display() {
        val varTypeFuel = if (typeFuel.isNullOrBlank()) "Yang belum diketahui" else typeFuel
        println("Kendaraan ini bernama $name dengan model $model dan berbahan bakar $varTypeFuel")
    }
}


fun main() {
    /*
    * Dari sebuah kelas anda dapat mendefinisikan berbagai macam object
    * Seperti contoh dibawah ini
    * Anda membuat object car, motor dan bicycle
    * */

    //Cara set sebuah variable dari kelas tersebut
    val car = Vehicle()
    car.name = "Avanza"
    car.model = "SUV"
    car.typeFuel = "Bensin"
    //set sebuah variable melalui enum class
    car.color = Color2.RED.color
    car.colorType = Color.RED

    //Anda juga bisa menggunakan set variable melalui constructornya
    val motor = Vehicle(model = "Motor Matic")
    motor.name = "Honda"

    /*
    * Untuk memanggilnya anda bisa langsung memanggil variabel secara langsung
    * Atau anda bisa panggil methodnya secara langsung.
    * */
    val variable = motor.name
    println(variable)
    //atau anda bisa panggil method secara langsung
    motor.display()

    val bicycle = Vehicle()
}
