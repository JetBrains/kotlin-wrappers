package js.iterable

import js.collections.JsSet
import js.symbol.Symbol
import kotlin.test.Test
import kotlin.test.assertEquals

class JsIteratorTest {
    @Test
    fun operatorIterator() {
        val expectedSet = setOf(1, 2, 3)
        val jsSet = JsSet(expectedSet.toTypedArray())

        val actualSet = mutableSetOf<Int>()
        for (element in jsSet[Symbol.iterator]()) {
            actualSet.add(element)
        }

        assertEquals(expectedSet, actualSet)
    }
}
