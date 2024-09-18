package js.lazy

import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals

class LazyFunctionTest {
    @Test
    fun creationCheck() = runTest {
        val f = LazyFunction {
            42
        }

        assertEquals(42, f())
    }
}
