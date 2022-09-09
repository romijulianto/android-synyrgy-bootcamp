package com.romijulianto.fundamentalkotlin

/*
* Ada 5 angka
* 10, 2, 7, 8, 5
* Di urutkan menjadi
* 2, 5, 7, 8, 10
* */
fun main() {
    val array = mutableListOf(10, 2, 7, 8, 5)
    /*
    * iterasi luar ke 0
    * iterasi dalam ke 0 -> 2, 10, 7, 8, 5
    * iterasi dalam ke 1 -> 2, 7, 10, 8, 5
    * iterasi dalam ke 2 -> 2, 7, 8, 10, 5
    * iterasi dalam ke 3 -> 2, 7, 8, 5, 10
    * iterasi luar ke 1
    * iterasi dalam ke 0 -> 2, 7, 8, 5, 10
    * iterasi dalam ke 1 -> 2, 7, 8, 5, 10
    * iterasi dalam ke 2 -> 2, 7, 5, 8, 10
    * iterasi dalam ke 3 -> 2, 5, 7, 8, 10
    * iterasi luar ke 2
    * iterasi dalam ke 0 -> 2, 5, 7, 8, 10
    * iterasi dalam ke 1 -> 2, 5, 7, 8, 10
    * iterasi dalam ke 2 -> 2, 5, 7, 8, 10
    * iterasi dalam ke 3 -> 2, 5, 7, 8, 10
    * dst sampai iterasi luar ke 4
    * */
    for (i in 0 until array.size - 1) {
        for (j in 0 until array.size - i - 1) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
    println(array)
}
