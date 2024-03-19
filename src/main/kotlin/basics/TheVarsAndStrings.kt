package basics

const val PRICE = 6.9

fun main () {
    var tvShows = "many"
    println(tvShows)
    tvShows = "too many"
    println(tvShows)

    val color = "blue"
    //color = "red" <- wrong
    println(color)

    val pet = "My cats name is \"Fluffy\""
    println(pet)
    println("$pet has ${pet.length} characters")

    val slashThis = "Two types of slashes / \\"
    println(slashThis)

    val googleUrl = "http://www.google.com"
    println(googleUrl)
    
    val topBunny = "(\\(\\"
    val midBunny = "(-.-)"
    val bottomBunny = "o_(\")(\")"
    println("\n$topBunny")
    println(midBunny)
    println(bottomBunny)

    val coco = "Crocodile"
    println(coco.length)

    val myName = "michelle"
    println(myName.replaceFirstChar (Char::titlecase))

    val wildAnimal = "Puma"
    println(wildAnimal.replaceFirstChar (Char::lowercase))

    val messyText = "             there are too     many spaces      "
    println(messyText.trim())

    // less boilerplate than String.get(<index>)
    println(wildAnimal[1])

    println(wildAnimal.substring(1))
    println(wildAnimal.substring(1, 3))
    println(wildAnimal.substring(1, 4))
    println(wildAnimal.equals(coco))
    println("Puma" == wildAnimal)
    println("Now $wildAnimal is a ${wildAnimal.replace("uma", "anda")}")
    println(pet.substring(3,7))

    val apples = 6
    val oranges = 9
    println("We have ${apples + oranges} fruity stuff")

    val client = "Marimar"

    println("$client should pay ${(apples + oranges) * PRICE} for $apples apples & $oranges oranges")
}