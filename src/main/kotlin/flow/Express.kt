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

    val favouritePet = "dog"
    val availablePet = listOf("cat", "dog", "fish")
    if(favouritePet in availablePet) {
        println("You can have a $favouritePet!")
    } else {
        println("Apologies $favouritePet is not available.")
    }

    val otherFavouritePet = "bird"
    if(otherFavouritePet !in availablePet) {
        println("Apologies $otherFavouritePet is not available.")
    }

    val animals = arrayListOf<String>()
    if(animals.isEmpty()) {
        println("No animals available.")
    } else {
        println("Animals available.")
    }

    animals.add("cat")
    println("Here comes a cat")
    if(animals.isNotEmpty()) {
        println("Animals available.")
    } else {
        println("No animals available.")
    }

    if(animals.add("dog")) {
        println("Dog added.")
    } else {
        println("Dog not added.")
    }
}