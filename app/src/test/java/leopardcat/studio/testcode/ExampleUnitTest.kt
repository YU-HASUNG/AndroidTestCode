package leopardcat.studio.testcode

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private lateinit var calculator: leopardcat.studio.testcode.Calculator

    @Before
    fun setUp() {
        calculator = leopardcat.studio.testcode.Calculator()
    }

    @Test
    fun addTest() {
        val result = calculator.add(15, 10)
        assertEquals(25, result)
    }

    @Test
    fun subtractTest() {
        val result = calculator.subtract(15, 10)
        assertEquals(5, result)
    }

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }
}