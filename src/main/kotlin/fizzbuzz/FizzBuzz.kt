package fizzbuzz

class FizzBuzz {
    fun generate(number: Long) = (1..number).map {
        when {
            it % 3 == 0L && it % 5 == 0L -> "FizzBuzz"
            it % 3 == 0L -> "Fizz"
            it % 5 == 0L -> "Buzz"
            else -> it.toString()
        }
    }
}