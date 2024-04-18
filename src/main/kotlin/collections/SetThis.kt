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
    val mutableNumbers = hashSetOf(1, 2, 3, 4, 5, null)
    println("Mutable numbers: $mutableNumbers")
    val mutableEmptyNumbers = hashSetOf<Int>()
    println("Mutable empty numbers: $mutableEmptyNumbers")
    mutableNumbers.add(6)
    println("Mutable numbers after adding 6: $mutableNumbers")
    val newMutableNumbers = hashSetOf(12, 28, 49)
    println("New mutable numbers: $newMutableNumbers")
    mutableNumbers.addAll(newMutableNumbers)
    println("Mutable numbers after adding all the new mutable numbers: $mutableNumbers")
    mutableNumbers.remove(2)
    println("Mutable numbers after removing 2: $mutableNumbers")
    mutableNumbers.removeAll(newMutableNumbers)
    println("Mutable numbers after removing all the new mutable numbers: $mutableNumbers")
    mutableNumbers.remove(666)
    println("Mutable numbers after removing 666 (nothing changes): $mutableNumbers")
}