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
    val mutableColors: ArrayList<String> = arrayListOf("Red", "Green", "Blue")
    println("Mutable colors: $mutableColors")
    val mutableEmptyColors = arrayListOf<String>()
    println("Mutable empty colors: $mutableEmptyColors")
    mutableColors.add("Yellow")
    println("Mutable colors after adding Yellow: $mutableColors")
    val moreMutableColors = mutableListOf("Pink", "Purple")
    mutableColors.addAll(moreMutableColors)
    println("Mutable colors after adding all the other mutable colors: $mutableColors")
    mutableColors.remove("Green")
    println("Mutable colors after removing Green: $mutableColors")
    mutableColors.removeAll(moreMutableColors)
    println("Mutable colors after removing all the other mutable colors: $mutableColors")
    mutableColors.removeAt(1)
    println("Mutable colors after removing the second element: $mutableColors")
    mutableColors.add("Red")
    mutableColors.add("Blue")
    println("Mutable colors after adding Red and Blue: $mutableColors")
    mutableColors.remove("Red")
    println("Mutable colors after removing Red: $mutableColors")

    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    println("Items: $items")
    val removedItems = listOf("pen", "mug", "phone")
    println("Items to be removed, so we get a productivity boost: $removedItems")
    items.removeAll(removedItems)
    println("Items after removing the productivity killers: $items")
    println("Does the colors have red? ${colors.contains("Red")}")
    println("Does the colors have pink? ${colors.contains("Pink")}")
    println("Index of the red color? ${colors.indexOf("Red")}")
    println("Index of the pink color? ${ if(colors.indexOf("Pink") != -1) colors.indexOf("Pink") else "Not found"}")
    val subColors = colors.subList(1, 3)
    println("Sublist of colors from 1 to 3: $subColors")
    mutableColors.clear()
    println("Mutable colors after clearing: $mutableColors")
    println("Is mutable colors empty? ${mutableColors.isEmpty()}")
    println("Is colors empty? ${colors.isEmpty()}")
}