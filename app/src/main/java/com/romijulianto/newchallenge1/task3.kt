package com.romijulianto.newchallenge1

fun isAnagram(a: String, b: String): Boolean{
    if (a.length != b.length) {
        return false
    }

    val strArray1 = a.toCharArray()
    val strArray2 = b.toCharArray()

    strArray1.sort()
    strArray2.sort()

    return String(strArray1) == String(strArray2)
}

fun main() {
    println(isAnagram("mycar", "camry"))
    println(isAnagram("Hello", "hello"))
    println(isAnagram("anagram", "margana"))
    println(isAnagram("Raden", "Denah"))
}