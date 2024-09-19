package js.lazy

import js.promise.Promise
import kotlinx.coroutines.test.runTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class LazyFunctionTest {
    @Test
    fun creationCheck() = runTest {
        assertIs<Promise<*>>(calculateLazy)

        assertEquals(42, calculateLazy())
    }
}
