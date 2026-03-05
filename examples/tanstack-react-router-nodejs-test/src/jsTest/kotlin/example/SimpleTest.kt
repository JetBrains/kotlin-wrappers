import kotlin.test.Test
import kotlin.test.assertEquals

class SimpleTest {
    @Test
    fun basic_math_works() {
        assertEquals(4, 2 + 2)
    }
    @Test
    fun wrong_math_fails() {
        assertEquals(4, 2 + 3)
    }
}
