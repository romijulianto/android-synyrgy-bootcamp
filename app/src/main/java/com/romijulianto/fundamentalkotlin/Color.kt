package com.romijulianto.fundamentalkotlin

/*
* Anda bisa mendefinisikan enum class tanpa sebuah constructor
* Enum Class seperti ini hanya berguna untuk flagging (menandai) saja
* */
enum class Color {
    RED,
    GREEN,
    BLUE
}

/*
* Anda juga bisa mendefinisikan enum class dengan sebuah constructor yang berisi variabel untuk dipanggil
* banyaknya variabel yang didefinisikan bisa sesuai yang anda butuhkan
* */
enum class Color2(val color: String, val colorCode: String) {
    RED("Merah", "#FF0000"),
    GREEN("Hijau", "#008000"),
    BLUE("Biru", "#0000FF")
}
/*
* Untuk proses manggilnya anda bisa cek di class Vehicle
* */
