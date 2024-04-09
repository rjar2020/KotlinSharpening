package basics

fun main() {
    println("Let's calculate you net worth in 5 years in terms of cash")
    print("Enter how much do you have in the bank today: ")
    val test = readln()
    try {
        println("You entered: ${test.toInt()}")
    } catch (e: NumberFormatException) {
        println("You entered: $test, which is not a number")
        //Don't do this in production code, it should go to your logs in the best case scenario
        print(e.stackTraceToString())
        println("The error message is: ${e.localizedMessage}")
    } finally {
        println("Thank you for using the net worth calculator")
        println("All the computational resources involved should be released here and the program should exit gracefully")
    }
    //Just for fun
    //throw IllegalStateException("You know what? I'm done with this program. I'm out!")

    print("Which product would you like to buy? ")
    val product = readLine()
    print("How many products would you like to buy? ")
    val amount = readLine()
    try {
        println("You want to buy $amount $product")
        println("The total price is ${amount?.toInt()?.times(9.99)}")
    } catch (e: NumberFormatException) {
        println("You entered: $amount, which is not a suitable amount")
        //Don't do this in production code, it should go to your logs in the best case scenario
        print(e.stackTraceToString())
        println("The error message is: ${e.localizedMessage}")
    } finally {
        println("Thank you for using the product purchase calculator")
        println("All the computational resources involved should be released here and the program should exit gracefully")
    }
}
