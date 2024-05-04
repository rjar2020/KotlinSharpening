package flow

fun main() {
    val animal = "cat"
    var action = ""
    when(animal) {
        "cat" -> action = "pet it"
        "dog" -> action = "walk it"
        "fish" -> action = "feed it"
        else -> action = "leave it alone"
    }
    println("You have a $animal. You should $action.")

    var result = ""
    val number = 2345
    when( number % 2 ) {
        0 -> result = "even"
        1 -> result = "odd"
    }
    println("The number $number is $result.")
}