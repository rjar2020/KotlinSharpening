package basics

fun main() {
    val herName: String = "Lilly"
    val hisName: String? = null
    val theyName: String?
    println("Her name is $herName")
    println("His name is $hisName")
    //It doesn't compile
    //println("They name is $theyName")

    var catName: String? = "Mittens"
    catName = null

    var dogName: String = "Lindo"
    //It doesn't compile
    //dogName = null

    println("dogName lenght is ${dogName.length}")
    //It doesn't compile
    //println("catName lenght is ${catName.length}")
    println("catName lenght is ${catName?.length?.toString()}")
    catName = "Mittens"
    println("catName lenght is ${catName?.length?.toString()}")
}