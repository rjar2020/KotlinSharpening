package basics

fun main() {
    println("true && true = ${true && true}")
    println("true && false = ${true && false}")
    println("false && true = ${false && true}")
    println("false && false = ${false && false}")

    println("true || true = ${true || true}")
    println("true || false = ${true || false}")
    println("false || true = ${false || true}")
    println("false || false = ${false || false}")

    println("!true = ${!true}")
    println("!false = ${!false}")

    val isDay = true
    val isNight = false
    println("isDay = $isDay")
    println("isNight = $isNight")
    println("isDay && isNight = ${isDay && isNight}")
    println("!isDay = ${!isDay}")

    val a = 3
    val b = 2
    println("a = $a")
    println("b = $b")
    println("a > b = ${a > b}")
    println("a < b = ${a < b}")
    println("a < a = ${a < a}")
    println("a > a = ${a > a}")
    println("a >= a = ${a >= a}")
    println("a <= a = ${a <= a}")
    println("a >= b = ${a >= b}")
    println("a <= b = ${a <= b}")
    println("a == b = ${a == b}")
    println("a != b = ${a != b}")
    println("3 > 2 = ${3 > 2}")

    val booleanResult = a > b
    println("a > b = $booleanResult")

    val expressionOne = 5.374 * 9.5847
    val expressionTwo = 3.237 * 15.3726
    println("is $expressionOne > $expressionTwo? ${expressionOne > expressionTwo}")
    val expressionThree = ((true && false) || (true || false))
    println("is ((true && false) || (true || false)) true? $expressionThree")
    val expressionFour = !((3 >= 3) && (false || (2 < 5)))
    println("is !((3 >= 3) && (false || (2 < 5))) true? $expressionFour")
    val toys = 2
    val brokenToys = 1
    val notBrokenToys = toys - brokenToys
    val canGetNewToy = toys < 5 && notBrokenToys >= 1
    println("Can I get a new toy? $canGetNewToy")

    val cows = 3
    val animalsByProducts = 1
    val children = 2
    val family = children + 1
    val canGetFunding = (cows <= 5 && animalsByProducts > 0) || family >= 3
    println("Can I get funding? $canGetFunding")
}
