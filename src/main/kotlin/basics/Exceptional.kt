package basics

fun main() {
    println("Let's calculate you net worth in 5 years in terms of cash")
    print("Enter how much do you have in the bank today: ")
    val test = readln()
    //When test is a string, the following line will throw an exception
    println("You entered: ${test.toInt()}")
}