package fizzbuzz

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FizzBuzzTest {
    private val fizzBuzz = FizzBuzz()

    @Test
    fun testNumber() {
        val result = fizzBuzz.generate(11)
        assertEquals("11", result[10], "Test for number 11 should return '11'")
    }

    @Test
    fun testFizz() {
        val result = fizzBuzz.generate(3)
        assertEquals("Fizz", result[2], "Test for number 3 should return 'Fizz'")
    }

    @Test
    fun testBuzz() {
        val result = fizzBuzz.generate(5)
        assertEquals("Buzz", result[4], "Test for number 5 should return 'Buzz'")
    }

    @Test
    fun testFizzBuzz() {
        val result = fizzBuzz.generate(15)
        assertEquals("FizzBuzz", result[14], "Test for number 15 should return 'FizzBuzz'")
    }

    @Test
    fun testSequence() {
        testFizzBuzzForUntil(15)
    }

    @Test
    fun testSequence100() {
        testFizzBuzzForUntil(100)
    }

    @Test
    fun testSequence1000() {
        testFizzBuzzForUntil()
    }

    @Test
    fun testSequence1000000() {
        testFizzBuzzForUntil(1_000_000)
    }

    private fun testFizzBuzzForUntil(upperBound: Long = 1000) {
        val result = fizzBuzz.generate(upperBound)
        result.forEachIndexed { index, value ->
            val number = index + 1
            val expected = when {
                number % 15 == 0 -> "FizzBuzz"
                number % 3 == 0 -> "Fizz"
                number % 5 == 0 -> "Buzz"
                else -> number.toString()
            }
            assertEquals(expected, value, "Test for number $number should return '$expected'")
        }
    }
}
