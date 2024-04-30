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

    val guestList = listOf("Alice", "Bob", "Charlie")
    val guest = "Alice"
    if(guest in guestList) {
        println("Welcome $guest!")
    } else {
        println("Apologies $guest, you are not on the guest list.")
    }

    val howManyCatsDoYouHave = 2
    val amountReview = if(howManyCatsDoYouHave in 1..3) {
        "few cats"
    } else if (howManyCatsDoYouHave in 4..6) {
        "several cats"
    } else if (howManyCatsDoYouHave == 0) {
        "no cats"
    } else {
        "many cats"
    }
    println("You have $amountReview!")

    var yourAge = 38

    if (yourAge < 1) yourAge = 1

    val ageReview = if (yourAge in 1..13) {
        "a child"
    } else if (yourAge in 14..18) {
       "a teenager"
    } else  {
        "an adult"
    }

    println("You are $ageReview.")
}
