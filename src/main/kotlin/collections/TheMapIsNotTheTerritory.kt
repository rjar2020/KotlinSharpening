package collections

fun main() {
    val count = mapOf(1 to "One", 2 to "Two", 3 to "Three")
    println("Count: $count")
    val countMore = mapOf<Int, String>()
    println("Count more: $countMore")
    println("Count on second key: ${count[2]}")
    println("Count on third key: ${count.get(3)}")
    println("Count map keys: ${count.keys}")
    println("Count map values: ${count.values}")
}