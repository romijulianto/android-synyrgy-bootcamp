package com.romijulianto.newchallenge1

fun ArrayChallenge(arr: Array<Int>): Int {
    var profit:Int = 0
    for (i in arr.indices){
        for (j in arr.indices){
            if (j > i){
                if ((arr[j] - arr[i]) > profit){
                    profit = arr[j] - arr[i]
                } else if (profit<=0) { /* condition where not profit */
                    profit = -1
                }
            }
        }
    }
    return profit
}

fun readLine1(): Array<Int> = arrayOf(44, 30, 24, 32, 35, 30, 40, 38, 15)
fun readLine2(): Array<Int> = arrayOf(10, 9, 8, 2)

fun main() {
    println(ArrayChallenge(readLine1()))
    println(ArrayChallenge(readLine2()))
}