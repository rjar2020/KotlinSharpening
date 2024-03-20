package basics

import kotlin.random.Random

fun main() {
    print("Input stuff: ")
    val userInput = readln()
    println("You said what? -> $userInput")

    print("Give me some numbers: ")
    val numberInput = readlnOrNull()?:""
    println("So that times two is -> ${numberInput.toInt() * 2}")

    println("Let's get random")
    println(Random.nextInt())
    println(Random.nextInt(10))
    println(Random.nextInt(20, 30))
    println(Random.nextDouble(500.0))
    println(Random.nextDouble(50.0, 500.0))
}