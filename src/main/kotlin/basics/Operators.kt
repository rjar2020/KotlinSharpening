package basics

import kotlin.math.pow

fun main() {
    println("5 + 2 = ${5 + 2}")
    val theSubtraction = 5 - 2
    println("5 - 2 = $theSubtraction")
    val theDivision = 5 / 2
    println("5 / 2 = $theDivision")
    val theFloatDivision = 5f / 2f
    println("5f / 2f = $theFloatDivision")
    val theMultiplication = 5 * 2
    println("5 * 2 = $theMultiplication")
    val theModulus = 5 % 2
    println("5 % 2 = $theModulus")
    var thePower = 5.0.pow(2.0)
    println("5.0 ^ 2.0 = $thePower")
    var incrementAction = 5
    incrementAction++
    println("5++ = $incrementAction")
    incrementAction--
    println("6-- = $incrementAction")
    incrementAction = ++incrementAction
    println("++5 = $incrementAction")
}