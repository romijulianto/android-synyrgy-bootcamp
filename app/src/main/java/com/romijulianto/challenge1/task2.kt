package com.romijulianto.challenge1

fun pyramidStarFliped(rows: Int? = null){
    val rows = 8;
    for (i in rows downTo 1) {
        for (space in 1..rows - i) {
            print("  ")
        }
        for (j in i..2 * i - 1) {
            print("* ")
        }
        for (j in 0..i - 1 - 1) {
            print("* ")
        }
        println()
    }
}

fun main() {
    pyramidStarFliped()
}