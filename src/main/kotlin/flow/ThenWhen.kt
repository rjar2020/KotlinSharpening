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

    val name = "Lucia"
    when(val length = name.length) {
        in 1..5 -> println("A name like $name with $length characters is a short one")
        in 6..10 -> println("A name like $name with $length characters is a medium one")
        else -> println("A name like $name with $length characters is a long one")
    }

    when(val theFirstLetter = name[0]) {
        in 'A'..'C' -> println("$name with $theFirstLetter from the top 3")
        in 'D'..'F' -> println("$name with $theFirstLetter from the top 6")
        else -> println("$name with $theFirstLetter from the happiest +20!")
    }
}
