package flow

fun main() {
    println("Would you like something sweet or salty?")
    val answer = readlnOrNull()
    if (answer == "sweet") {
        println("Here is a chocolate bar for you!")
    } else if (answer == "salty") {
        println("Here are some chips for you!")
    } else {
        println("I don't have that!")
    }
}