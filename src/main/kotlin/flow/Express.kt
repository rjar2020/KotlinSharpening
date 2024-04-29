package flow

fun main() {
    if(326/72*15+93%13 == 65) {
        println("The expression is equal to 65!")
    } else {
        println("The expression is not equal to 65!")
    }

    val haveCat = true
    val catFood = false
    if(haveCat && catFood) {
        println("Cat Happy!")
    } else {
        println("Cat not happy. Oh no!")
    }

    val age = 13
    if (age > 18) println("You can drink alcohol") else println("You are a minor!")
}