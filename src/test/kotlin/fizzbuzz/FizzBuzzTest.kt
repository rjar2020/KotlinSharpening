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
        val result = fizzBuzz.generate(15)
        val resultList = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")
        assertEquals(resultList, result, "Test for sequence 1 to 15 should return the FizzBuzz sequence")
    }
}
