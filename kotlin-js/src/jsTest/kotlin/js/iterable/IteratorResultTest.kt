package js.iterable

import js.collections.JsSet
import js.symbol.Symbol
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IteratorResultTest {
    @Test
    fun returnResult() {
        val set = JsSet<String>()
        val result = set[Symbol.iterator]().next()

        assertFalse(result is IteratorYieldResult)
        assertTrue(result is IteratorReturnResult)
    }

    @Test
    fun yieldResult() {
        val set = JsSet(arrayOf("1", "2"))
        val result = set[Symbol.iterator]().next()

        assertTrue(result is IteratorYieldResult)
        assertFalse(result is IteratorReturnResult)
    }
}
