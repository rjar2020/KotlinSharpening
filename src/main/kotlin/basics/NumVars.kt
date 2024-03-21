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

    val dogs: Byte = 5
    println(dogs::class.java)

    val days: Short = 5
    println(days::class.java)

    //Kotlin says the type is determined explicitly for Int when a numeric value without decimals
    val meals: Int = 5
    println(meals::class.java)

    val life: Long = 42
    println(life::class.java)

    val newLife = 43L
    println(newLife::class.java)

    val iAmFloating = 43.99F
    println(iAmFloating::class.java)

    val cats = 3
    val largerCat = cats.toLong()
    println(cats::class.java)
    println(largerCat::class.java)
    val people = 7500000000
    println(people::class.java)
    println(people.toInt())
    println(cats)
    println(cats.toByte())
    println(cats.toFloat())
    println(cats.toString())
    println(cats.toFloat().toString())
    println(cats.toFloat().toString()::class.java)
    println(iAmFloating)
    println(iAmFloating.toInt())

    print("Hey there! Could you please introduce a double? ->")
    val doubleInput: Double = readln().toDouble()
    val inputTimesPi = doubleInput * Math.PI
    println("Gonna multiply $doubleInput by pi (meaning ${Math.PI}), resulting in $inputTimesPi of type ${inputTimesPi::class.java}")
}
