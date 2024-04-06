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

    val theShort: Short = 32767
    val theInt: Int = 2147483
    val result = theShort + theInt
    println("theShort + theInt = $result")
    println("Result is of type ${result::class.java}")

    val theLong: Long = 9223372036854775807
    val theFloat: Float = 3.4028235E38f
    val anotherResult = theLong + theFloat
    println("theLong + theFloat = $anotherResult")
    println("Another result is of type ${anotherResult::class.java}")

    val theDouble: Double = 1.7976931348623157E308
    val oneMoreResult = theFloat + theDouble
    println("theFloat + theDouble = $oneMoreResult")
    println("One more result is of type ${oneMoreResult::class.java}")

    var bikes = 5
    println("bikes = $bikes")
    bikes + 1
    println("bikes + 1 = $bikes")
    bikes += 1
    println("bikes += 1 = $bikes")
    bikes -= 1
    println("bikes -= 1 = $bikes")
    bikes *= 2
    println("bikes *= 2 = $bikes")
    bikes /= 2
    println("bikes /= 2 = $bikes")
    bikes %= 2
    println("bikes %= 2 = $bikes")
}