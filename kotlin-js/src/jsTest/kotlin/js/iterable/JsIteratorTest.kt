package js.iterable

import js.collections.JsSet
import js.core.BigInt
import js.core.n
import js.symbol.Symbol
import kotlin.test.Test
import kotlin.test.assertEquals

class JsIteratorTest {
    @Test
    fun operatorIterator() {
        val expectedSet = setOf(1.n, 2.n, 3.n)
        val jsSet = JsSet(expectedSet.toTypedArray())

        val actualSet = mutableSetOf<BigInt>()
        for (element in jsSet[Symbol.iterator]()) {
            actualSet.add(element)
        }

        assertEquals(expectedSet, actualSet)
    }
}
