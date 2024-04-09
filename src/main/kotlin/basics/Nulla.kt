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

    var theInt: Int? = 10
    //It doesn't compile
    //println(theInt.plus(3))
    println(theInt?.plus(3))
    println(theInt?.minus(3))
    println(theInt?.times(3))
    println(theInt?.div(3))
    println(theInt?.rem(3))
    println(theInt?.compareTo(3))
    println(theInt?.compareTo(10))

    var a: String? = "I like dogs"
    //It doesn't compile
    //println(a.substring("3,6"))
    println(a?.substring(3, 6))

    var b: Double? = 3.14
    //It doesn't compile
    //b *= 2
    b = b?.times(2)
    println(b)

    print("Enter your username: ")
    var username = readLine()
    //It doesn't compile
    //println("userName length is ${username.length}")
    println("userName length is ${username?.length}")

    print("Enter your age in decimal: ")
    var age = readLine()
    //It doesn't compile
    //age = age.toDouble()
    age = age?.toDouble()?.times(7).toString()
    println("Your age in dog years is $age")
    println("Your age length is ${age?.length}")

    var otherCatName: String? = null
    println(otherCatName)
    println(otherCatName ?: "No cat name")
    println(otherCatName ?: "Milton".length)
    otherCatName = "Milton"
    println(otherCatName ?: "No cat name")
    println(otherCatName.length)

    otherCatName = null
    //It doesn't compile anymore, woooohoooo
    //println(otherCatName!!.length)
    otherCatName = "Milton"
    println(otherCatName!!.length)
}