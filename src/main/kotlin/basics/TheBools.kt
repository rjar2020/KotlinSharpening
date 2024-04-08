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
}
