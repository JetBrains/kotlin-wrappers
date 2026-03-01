package js.lazy

import js.promise.Promise
import js.test.runJsTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertIs

class LazyFunctionTest {
    @Test
    fun creationCheck() = runJsTest {
        assertIs<Promise<*>>(calculateLazy)

        assertEquals("42", calculateLazy())
    }
}
