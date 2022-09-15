package com.romijulianto.challenge1

fun pyramidOutline(rows: Int? = null, k: Int? = null){
    val rows = 8;
    var k = 0;
    for (i in 1..rows) {
        for (space in 1..rows - i) {
            print("  ")
        }
        while (k != 2 * i - 1) {
            if (i < rows) {
                if(k == 0 || k == 2 * i - 2)
                    print("* ")
                else
                    print("  ")
            } else {
                if(k % 2 == 0)
                    print("* ")
                else
                    print("  ")
            }
            ++k
        }
        println()
        k = 0
    }
}

fun main() {
    pyramidOutline()
}