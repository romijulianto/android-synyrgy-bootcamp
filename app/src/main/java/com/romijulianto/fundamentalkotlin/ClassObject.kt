package com.romijulianto.fundamentalkotlin

class Vehicle {
    /* Istilah baru
    * Null safe pointer -> Type data of variable give question mark (?)
    * lateinit var ->Ketika ingin mendeklarasikan variable tanpa menginisialisasi nilai awal.
    * */

    var name: String? = null
    var model: String? = null
    var typeFuel: String? = null

    init {
        name = "Avanza"
        model = "SVP"
        typeFuel = "Fuel"
    }

    constructor(_name: String? = null, _model: String? = null, _typeFuel:String? = null) {
        this.name = _name
        this.model = _model
        typeFuel = _typeFuel
    }
}

fun main() {
    // Use contructor to initiate object
    val car = Vehicle("Avanza", "SUV", "Fuel")
    println(car.name)

    // How to change Avanza with object class
    car.name = "Xenia"
    println(car.name)

    // If you need to init or value default in class Vehicle
    val bicycle = Vehicle()
    println(bicycle.name)
}