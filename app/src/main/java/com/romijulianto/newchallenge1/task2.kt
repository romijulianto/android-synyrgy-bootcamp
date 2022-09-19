package com.romijulianto.newchallenge1

fun formatNumber(phone: String): String{

    var result = phone.replace("[^A-Za-z0-9 ]".toRegex(), "").replace("\\s".toRegex(), "")

    if(result[0] == '0'){
        result = result.replaceRange(0,1, "62")
    }

    return result
}

fun readLine3() = "0851-6231-7243"
fun readLine4() = "0877 6431 7123"
fun readLine5() = "+62877 6294 2312"

fun main() {
    println(formatNumber(readLine3()))
    println(formatNumber(readLine4()))
    println(formatNumber(readLine5()))
}