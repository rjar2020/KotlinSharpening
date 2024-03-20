package basics

fun main() {
    val price = 34
    var items = 3
    val totalPrice = price * items
    println("Total price is $totalPrice")

    items = 5
    println(items::class.java)

    val numberOfPeople = 75000000000
    println(numberOfPeople::class.java)

    val dprice = 29.99
    println(dprice::class.java)

    val pi = 3.14159834768945
    println(pi::class.java)

    print("How many apples would you like to buy? -> ")
    val apples = readln().toInt()
    val applePrice = 1.2
    val total = apples * applePrice
    println("So you would pay $total € Fun fact: stored as ${total::class.java} in our system")
    println("Btw, the price by apple is $applePrice € Fun fact: stored as ${applePrice::class.java} in our system")
}