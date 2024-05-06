package flow

fun main() {
    val animal = "cat"
    val action = when(animal) {
        "cat" -> "pet it"
        "dog" -> "walk it"
        "fish" -> "feed it"
        else -> "leave it alone"
    }
    println("You have a $animal. You should $action.")

    val number = 2345
    val result  = when( number % 2 ) {
        0 ->  "even"
        else -> "odd"
    }
    println("The number $number is $result.")
}
