package com.romijulianto.fundamentalkotlin

/**
 * Hands On function
 * 12 September 2022
 */
import kotlin.math.roundToInt

fun main() {
    val resultPangkat = myPangkat(11,2)
    println(resultPangkat)

    val resultPangkatExt = 11.1.pangkatExt(2)
    println(resultPangkatExt)

    // Using Lambda Expression
    val pangkattt: (Int, Int) -> Int = {x, y -> Math.pow(x.toDouble(), y.toDouble()).toInt()}
    print(pangkattt(2,3))
}

// Using Function

fun myPangkat(x:Int, y:Int) : Int {
    var res = 1
    for (i in 1..y) {
        res *= x
    }
    return res
}


// Using Extension
fun Double.pangkatExt(pangkatExt: Int): Int {
    var res = 1.0
    for (i in 1..pangkatExt) {
        res *= this
    }
    return res.roundToInt()
}


