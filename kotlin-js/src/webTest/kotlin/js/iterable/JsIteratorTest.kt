package js.iterable

import js.array.jsArrayOf
import js.collections.JsSet
import js.numbers.BigInt
import js.numbers.n
import kotlin.test.Test
import kotlin.test.assertEquals

class JsIteratorTest {
    @Test
    fun operatorIterator() {
        val jsSet = JsSet(jsArrayOf(1.n, 2.n, 3.n))

        val actualSet = mutableSetOf<BigInt>()
        for (element in jsSet.`[@@iterator]`()) {
            actualSet.add(element)
        }

        assertEquals(setOf(1.n, 2.n, 3.n), actualSet)
    }
}
