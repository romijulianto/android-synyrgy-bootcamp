package com.romijulianto.challenge1


fun kitePattern(rows: Int? = null){
    /* section 1 */
    val rows1 = 8;
    var k = 0;
    for (i in 1..rows1) {
        for (space in 1..rows1 - i) {
            print("  ")
        }
        while (k != 2 * i - 1) {
            print("* ")
            ++k
        }
        println()
        k = 0
    }

    /* section 2 */
    val rows2 = 8;
    for (i in rows2 downTo 1) {
        for (space in 1..rows2 - i) {
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
    kitePattern()
}