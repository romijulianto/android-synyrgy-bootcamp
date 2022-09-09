package com.romijulianto.fundamentalkotlin

fun main() {
    /* Buat Array "Andre" "Kelas" "Android" dan ganti Android
    Pemograman Kotlin
     */
    val arrayList = arrayListOf<String>(
        "Andre",
        "Kelas",
        "Android"
    )
    for (i in arrayList.indices){
        if (arrayList[i] == "Android"){
            arrayList.set(i, "Pemrograman Kotlin")
        }
        println(arrayList[i])
    }

    /* Buatlah perulangan 0 - 5 cetak menggunakan while*/
    var counter = 0
    while (counter <= 5){
        println(counter++)
        // ++i -> i = 1 + i  pre increment
        // i++ -> i = i + 1  post increment
    }
    var counter2 = 0
    while (counter2 <= 5){
        println(++counter2)
        // ++i -> i = 1 + i  pre increment
        // i++ -> i = i + 1  post increment
    }

    /* Nested Loop
    * Create Square 5 x 5 using nested loop */
    for (i in 1..5){
        for (j in 1..5){
            print("*")
        }
        println()
    }

    for (i in 1..5){
        for (space in 0..1){
            print(" ")
        }
        for (j in 0..5) {
            print("*")
        }
        println()
    }

    /* Triangle */
    for(i in 1..5){
        for (space in i..5){
            print(" ")
        }
        for (j in 1..i){
            print("*")
        }
        println()
    }

    /* Output
    *
    **
    ***
    ****
    *****

     */

}
