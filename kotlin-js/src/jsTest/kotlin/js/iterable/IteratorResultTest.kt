package js.iterable

import js.collections.JsSet
import js.symbol.Symbol
import kotlin.test.Test
import kotlin.test.assertIs
import kotlin.test.assertIsNot

class IteratorResultTest {
    @Test
    fun returnResult() {
        val set = JsSet<String>()
        val result = set[Symbol.iterator]().next()

        assertIsNot<IteratorYieldResult<*>>(result)
        assertIs<IteratorReturnResult<*>>(result)
    }

    @Test
    fun yieldResult() {
        val set = JsSet(arrayOf("1", "2"))
        val result = set[Symbol.iterator]().next()

        assertIsNot<IteratorReturnResult<*>>(result)
        assertIs<IteratorYieldResult<*>>(result)
    }
}
