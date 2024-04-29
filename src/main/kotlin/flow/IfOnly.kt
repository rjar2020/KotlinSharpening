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

    val petStore = listOf("cat", "dog", "fish")
    val hasCatFood = true

    if (petStore.contains("cat")) {
        println("Do you have cat Food? -> $hasCatFood")
        if (hasCatFood) {
            println("You can have a cat! Now feed them please!")
        } else {
            println("You can't have a cat! Need food first")
        }
    } else {
        println("You can't have a cat!")
    }

    var doYouHaveTheKeys = true
    println("Do you have the keys? -> $doYouHaveTheKeys")
    if (doYouHaveTheKeys) {
        println("You can start the car!")
    } else {
        println("You can't start the car!")
    }

    val doYouHaveTheKeysString = "No"
    println("Do you have the keys? -> $doYouHaveTheKeysString")
    println("Passing a No to a boolean will return -> ${doYouHaveTheKeysString.toBoolean()}")
    doYouHaveTheKeys = doYouHaveTheKeysString.toBoolean()
    println("Do you have the keys? -> $doYouHaveTheKeys")
    if (doYouHaveTheKeys) {
        println("You can start the car!")
    } else {
        println("You can't start the car!")
    }

    val currentHour24hr = 12
    println("Current hour is $currentHour24hr")
    if (currentHour24hr < 12) {
        println("It's $currentHour24hr am!")
    } else {
        if (currentHour24hr == 12) {
            println("It's $currentHour24hr pm!")
        } else {
            println("It's ${currentHour24hr - 12} pm!")
        }
    }

    val hasEggs = true
    val hasBacon = false
    val eggsExpenditure: Int
    var baconExpenditure = 0
    if (hasEggs) {
        eggsExpenditure = 5 * 12
        if (hasBacon) {
            baconExpenditure = 20 * 2
        }
        println("You spent $eggsExpenditure on eggs and $baconExpenditure on bacon!")
        println("And the total is ${eggsExpenditure + baconExpenditure}")
    } else {
        println("You can't make breakfast!")
    }

    val theEvenNumber = 24
    val isEven = if (theEvenNumber % 2 == 0) "Number is even" else "Number is odd"
    println("Number $theEvenNumber is $isEven")

    val theAnimal = "dog"
    val action = if (theAnimal == "cat") {
        "Meow"
    } else if (theAnimal == "dog") {
        "Woof"
    } else if (theAnimal == "fish") {
        "Unknown"
    } else {
        "Not a pet"
    }
    println("The animal $theAnimal says $action")

    val yourGrading = 99
    val grade = if (yourGrading > 100 || yourGrading < 0) {
        "invalid!"
    } else if (yourGrading >= 90) {
        "A"
    } else if (yourGrading >= 80) {
        "B"
    } else if (yourGrading >= 70) {
        "C"
    } else if (yourGrading >= 60) {
        "D"
    } else if (yourGrading >= 50) {
        "E"
    } else {
        "F"
    }
    println("Your grade $yourGrading is $grade")
}