package basics

fun main() {
    print("Input stuff: ")
    val userInput = readln()
    println("You said what? -> $userInput")

    print("Give me some numbers: ")
    val numberInput = readlnOrNull()?:""
    println("So that times two is -> ${numberInput.toInt() * 2}")
}