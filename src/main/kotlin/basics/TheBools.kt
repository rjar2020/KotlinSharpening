package basics

fun main() {
    println("true && true = ${true && true}")
    println("true && false = ${true && false}")
    println("false && true = ${false && true}")
    println("false && false = ${false && false}")

    println("true || true = ${true || true}")
    println("true || false = ${true || false}")
    println("false || true = ${false || true}")
    println("false || false = ${false || false}")

    println("!true = ${!true}")
    println("!false = ${!false}")

    val isDay = true
    val isNight = false
    println("isDay = $isDay")
    println("isNight = $isNight")
    println("isDay && isNight = ${isDay && isNight}")
    println("!isDay = ${!isDay}")

    val a = 3
    val b = 2
    println("a = $a")
    println("b = $b")
    println("a > b = ${a > b}")
    println("a < b = ${a < b}")
    println("a < a = ${a < a}")
    println("a > a = ${a > a}")
    println("a >= a = ${a >= a}")
    println("a <= a = ${a <= a}")
    println("a >= b = ${a >= b}")
    println("a <= b = ${a <= b}")
    println("a == b = ${a == b}")
    println("a != b = ${a != b}")
    println("3 > 2 = ${3 > 2}")

    val booleanResult = a > b
    println("a > b = $booleanResult")
}
