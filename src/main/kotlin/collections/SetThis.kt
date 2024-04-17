package collections

fun main() {
    val numbers = setOf(1, 2, 3, 4, 5, 5)
    //This will print only 1, 2, 3, 4, 5
    println("Numbers: $numbers")
    val emptyNumbers = setOf<Int>()
    println("Empty numbers: $emptyNumbers")
    val nullAndNumbers = setOf(1, 2, null, 4, null, 4, null)
    //This will print only 1, 2, 4 and one null
    println("Null and numbers: $nullAndNumbers")
}