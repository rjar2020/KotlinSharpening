package basics

import java.time.LocalDate
import java.time.Year
import java.util.*
import kotlin.random.Random

fun main() {
    print("Input stuff: ")
    var userInput = readln()
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

    print("Greetings, I'm the machine. How should I call you? -> ")
    userInput = readln()
    println("Nice to greet you $userInput")
    print("$userInput could you please tell me which year were you born? -> ")
    val birthYear = readln().toInt()
    println("I see, so you are around ${Year.now().value - birthYear} years old.")
}