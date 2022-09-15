package com.romijulianto.challenge1

fun printX(starCount: Int? = null){
    var starCount = 8;
    val count = starCount * 2 - 1;

    for(i in 1..count){
        for(j in 1..count){
            if(j==i || (j==count - i + 1))
            {
                print("*");
            }
            else
            {
                print(" ");
            }
        }

        println("")
    }
}

fun main() {
    printX()
}