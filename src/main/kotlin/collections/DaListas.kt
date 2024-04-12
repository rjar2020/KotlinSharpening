package collections

fun main() {
    val colors = listOf("Red", "Green", "Blue")
    println("Colors: $colors")
    val emptyColors = listOf<String>()
    println("Empty colors: $emptyColors")
    val duplicateColors = listOf("Red", "Green", "Blue", "Red", "Green", "Blue")
    println("Duplicate colors: $duplicateColors")
    val nullAndColors = listOf("Red", "Green", null, "Blue", null)
    println("Null and colors: $nullAndColors")
    println("First color[0]: ${colors[0]}")
    println("Second color[1]: ${colors[1]}")
    println("Third color[2]: ${colors.get(2)}")
    println("Size of colors list: ${colors.size}")
    //This throws an exception
    //println("Second color: ${colors[5]}")
}