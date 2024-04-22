package flow

fun main() {
    /*println("Would you like something sweet or salty?")
    val answer = readlnOrNull()
    if (answer == "sweet") {
        println("Here is a chocolate bar for you!")
    } else if (answer == "salty") {
        println("Here are some chips for you!")
    } else {
        println("I don't have that!")
    }
    println("Is it night time?")
    val night = readlnOrNull()?.toBoolean() ?: false
    if (night) {
        println("Good night!")
    } else {
        println("Good day!")
    }*/

    var clientFunds = 100
    val price = 50
    var clientProducts = 0
    if (clientFunds >= price) {
        println("You can buy this item!")
        clientFunds -= price
        clientProducts++
        println("You have $clientFunds left and $clientProducts product(s)!")
    } else {
        println("You don't have enough money!")
    }
}